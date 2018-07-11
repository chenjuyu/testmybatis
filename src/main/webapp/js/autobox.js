/**
 * 自定义完成框插件
 */
;(function ($) {
    //实例化下拉框
    $.fn.autobox = function (target, parm) {
        if (typeof target == "string") {
            return $.fn.autobox.methods[target](this, parm);
        }
        target = target || {};
        return this.each(function () {
            var autobox = $.data(this, "combo");
            if (autobox) {
                $.extend(autobox.options, target);
            } else {
                var r = renderAutobox(this,target);
                autobox = $.data(this, "combo", {
                    options: $.extend({}, $.fn.autobox.defaults,target),
                    combo: r.combo,
                    panel: r.panel,
                    footer:r.footer,
                    pp:r.pp,
                    previousValue: null
                });
                bindEvents(this);
                _resize(this);
            }
           
        });
    };
    
    function scrollTo(jq, curselect) {
    	if(curselect==undefined){
    		return;
    	}
        var panel = $(jq).autobox("panel");
        if (curselect.position().top <= 0) {
            var h = panel.scrollTop() + curselect.position().top;
            panel.scrollTop(h);
        } else {
            if (curselect.position().top + curselect.outerHeight() > panel.height()) {
                var h = panel.scrollTop() + curselect.position().top + curselect.outerHeight() - panel.height();
                panel.scrollTop(h);
            }
        }
    };
    
    //小键盘向上选择操作
    function _up(jq) {
        var panel = $(this).autobox("panel");
        var column = panel.find("div.combobox-item");
        if(column.length<=0){
        	return false;
        }
        var curselect = panel.find("div.combobox-item.select");
        if(curselect[0] == undefined){
        	curselect = column.last();
        	curselect.addClass("select");
        }else{
        	 if(curselect.prev()[0]){
       		  curselect.removeClass("select");
       		  curselect = curselect.prev();
       		  curselect.addClass("select");
       	     }
        }    
        scrollTo($(this), curselect);
    };
    
    
    //回车选择操作
    function _enter(jq) {
        var panel = $(this).autobox("panel");
        var opts = $(this).autobox("options");
        var inputTextname  = (opts.inputTextname).split(",")[0];
        if (panel.is(":visible")){
        	var column = panel.find("div.combobox-item");
            if(column.length<=0){
            	return false;
            }
            var curselect = panel.find("div.combobox-item.select");
            if(curselect[0] == undefined){
            	column.first().addClass("select");
            }else{
            	 $(this).autobox("select",curselect.attr("value"));
                 //单选时，选中一次就隐藏下拉面板
            	 $(this).autobox("hidePanel");
            }    
        }else{//对话框上的回车事件
        	var value = $(this).autobox("getValues");
        	var text = $("#"+inputTextname).val().trim();
        	if(value!="" || text!= ""){
        		opts.onKeyDowner.call($(this), opts.data);
        	}else{
            	$(this).autobox("showPanel");
        	}
        }
        
    };
    
    
    
    //小键盘向下选择操作
    function _down(jq) {
    	  var panel = $(this).autobox("panel");
          var column = panel.find("div.combobox-item");
          if(column.length<=0){
          	return false;
          }
          var curselect = panel.find("div.combobox-item.select");
          
          if(curselect[0] == undefined){
        	curselect = column.first().addClass("select");
          }else{
        	  if(curselect.next()[0]){
        		  curselect.removeClass("select");
        		  curselect = curselect.next().addClass("select")
        	  }
          }
          scrollTo($(this), curselect);
    };
    
    
    

    
    function _resize(jq, width) {
        var opts = $.data(jq, "combo").options;
        var panelField = opts.panelField;
        var combo = $.data(jq, "combo").combo;
        var panel = $.data(jq, "combo").panel;
        if (width) {
            opts.width = width;
        }
        panel.panel("resize", {
            width: (opts.panelWidth ? opts.panelWidth : 80*panelField.length+20),
            height: opts.panelHeight
        });
    };
    
    
    
    function _showPanel(jq){
    	var opts = $.data(jq, "combo").options;
    	var combo = $.data(jq, "combo").combo;
    	var footer = $.data(jq, "combo").footer
    	var panel = $.data(jq, "combo").panel;
		if ($.fn.window) {
	          //若放在窗口里面，则显示在窗口之上
	          panel.panel("panel").css("z-index", $.fn.window.defaults.zIndex++);
	    }
		panel.panel("move", {
	            left: combo.offset().left,
	            top: getOffsetTop()
	    });
		
		if (panel.panel("options").closed) {
	            panel.panel("open");
	            opts.onShowPanel.call(jq);
	    }
		
		(function () {
	            if (panel.is(":visible")) {
	                panel.panel("move", {
	                    left: getOffsetLeft(),
	                    top: getOffsetTop()
	                });
	                setTimeout(arguments.callee, 200);
	            }
	        })();
		 
	     //* 获取Left位置
        function getOffsetLeft() {
            var left = combo.offset().left;
            if (left + panel._outerWidth() > $(window)._outerWidth() + $(document).scrollLeft()) {
                left = $(window)._outerWidth() + $(document).scrollLeft() - panel._outerWidth();
            }
            if (left < 0) {
                left = 0;
            }
            return left;
        };
       
        // 获取TOP位置
        function getOffsetTop() {
            var top = combo.offset().top + combo._outerHeight();
            if (top + panel._outerHeight()+footer._outerHeight()+4> $(window)._outerHeight() + $(document).scrollTop()) {
                top = combo.offset().top - panel._outerHeight()-footer._outerHeight()-4;
            }
            if (top < $(document).scrollTop()) {
                top = combo.offset().top + combo._outerHeight();
            }
            return top;
        };
    }
    
    //获取值（多选）
    function _getValues(jq) {
    	var opts = $.data(jq, "combo").options;
    	var values = $("#"+opts.hiddenid).val();
        return values;
    };
    
    //设置值（多选）
    function _setValues(jq, v) {
        var opts = $.data(jq, "combo").options;
        var nowValues = _getValues(jq);//获取当前值数组
        $("#"+opts.hiddenid).val(v);//清空原来的值   
        ////若设置值数组与原值数组不相等，则将设置值数组、原值数组返回给onChange事件作为参数，并响应事件
        if (v!= nowValues) {
        	opts.onChange.call(jq, v, nowValues);
        }
    };
    
    function _setText(jq, data) {
    	var combo  = $.data(jq, "combo");
        var opts = $.data(jq, "combo").options;
        //设置text
        var inputTextname = opts.inputTextname.split(",");
        var dlgTextName = opts.dlgTextName.split(",");
        for(var i=0;i<inputTextname.length;i++){
        	if(i==0){
        		combo.previousValue = data[dlgTextName[i]];
        	}
        	$("#"+inputTextname[i]).val(data[dlgTextName[i]]);
        }
        _setValues(jq,data[opts.dlgHiddenid]);//设置值
    };
    
    
    
    //重新加载数据
    function _reload(jq, url, paramData, single) {
        var options = $.data(jq, "combo").options;
        if (url) {
            options.url = url;
        }
        paramData = paramData || {};
        options.loader.call(jq, paramData, function (data) {
            _loadData(jq, data, single);
        }, function () {
            options.onLoadError.apply(this, arguments);
        });
    };
    
    
    // 输入值匹配
    function _query(jq, q) {
        var options = $.data(jq, "combo").options;
        var pp =  $.data(jq, "combo").pp;
        _setValues(jq, "");
        var param = {q:q,"page":pp.pagination("options").pageNumber,"rows":options.pagesize};
        _reload(jq, null, param, true);
    };
    
    
    
    function bindEvents(jq){
    	var combo  = $.data(jq, "combo");
    	var opts = combo.options;
    	var combo2  = $.data(jq, "combo").combo;
    	var panel = $.data(jq, "combo").panel;
    	var combotext = combo2.find(".combo-text");
    	var pp = $.data(jq, "combo").pp;
    	
    	// 添加翻页事件
    	pp.pagination({
 			onSelectPage:function(pageNumber, pageSize){
 				var opt =  $.data(jq, "combo").options;
 				opt.keyHandler.query.call(jq, combotext.val());
 			}
 		});
    	
    	 //移除事件处理器
        combo2.unbind(".combo");
        panel.unbind(".combo");
        combotext.unbind(".combo");
        if (!opts.disabled) {
        combotext.bind("mousedown.combo", function (e) {
                 $("div.combo-panel").not(panel).panel("close");
                 //该方法将停止事件的传播，阻止它被分派到其他 Document节点，
                 e.stopPropagation();
             }).bind("keydown.combo",function(e){
            	 switch (e.keyCode) {
            	 case 38://小键盘上箭头
                     opts.keyHandler.up.call(jq);
                     e.stopPropagation();
                     break;
                 case 40://小键盘下箭头
                     opts.keyHandler.down.call(jq);
                     e.stopPropagation();
                     break;
                 case 13://Enter键
                     e.preventDefault();
                     opts.keyHandler.enter.call(jq);
                     e.stopPropagation();
                     return false;
                 case 27://Esc键
                     hidePanel(jq);
                     e.stopPropagation();
                     break;
                 default:
              	      if (opts.editable) {
                       if (combo.timer) {
                           clearTimeout(combo.timer);
                       }
                       combo.timer = setTimeout(function () {
                           var q = combotext.val().trim();
                           if (combo.previousValue != q) {
                        	   //检查是否弹出
                        	   if(opts.beforeShow !=null){
                                   if(!opts.beforeShow.call($(this))){
                                	   return ;
                                   }
                               }
                               combo.previousValue = q;
                               $(jq).autobox("showPanel");
                               opts.currpage=1;//重置页码为1
                               opts.keyHandler.query.call(jq, q);
                           }
                       }, opts.delay);
                       e.stopPropagation();
                    }
            	 }
             });
        	 
      
        }
        
    }
    
    
    //  隐藏下拉选择面板
    function hidePanel(jq) {
        var opts = $.data(jq, "combo").options;
        var panel = $.data(jq, "combo").panel;
        panel.panel("close");
    };
    
    
    //选中指定值对应的选项
    function _select(jq, index) {
        var opts = $.data(jq, "combo").options;
        var data = $.data(jq, "combo").data;
        var combo = $.data(jq, "combo").combo;
        //重新设置combobox值（单选/多选）
        _setText(jq, data[index]);
        opts.data = data[index];
        opts.onEnter.call($(this),  data[index]);//调用回调函数
    };
    
    
  
  //加载数据
    function _loadData(jq, data, single) {
    	var datalist = data.rows;
        var options = $.data(jq, "combo").options;
        var pp =$.data(jq, "combo").pp;
        pp.pagination("refresh",{
        	total:data.total, 
        	pageSize:options.rows
        });
        var panel = $(jq).autobox("panel");
        $.data(jq, "combo").data = datalist;
        var values = $(jq).autobox("getValues");
        panel.empty();
        //循环数据，给下拉面板添加选项
        for (var i = 0; i < datalist.length; i++) {
            var item = $("<div class=\"combobox-item\"></div>").appendTo(panel);
            item.attr("value", i);
        	var html ="";
       		for(var j =0 ; j<options.panelField.length;j++){
       			var f = options.panelField[j];
       			html += "<div class=\"combobox-col ";
       			if(j>0){
       				html+=" leftborder ";
       			}
       			html += "\" >";
       			html+= datalist[i][f];
       			html+="</div>"
       		}
       		item.html(html);
            
        }
        
        //给下拉面板选项注册hover、click事件
        $(".combobox-item", panel).hover(function () {
            $(this).addClass("combobox-item-hover");
        }, function () {
            $(this).removeClass("combobox-item-hover");
        }).click(function () {
            var selectItem = $(this);
            _select(jq, selectItem.attr("value"));
            //单选时，选中一次就隐藏下拉面板
            $(jq).autobox("hidePanel");
        });
        //更新按钮
    };
    
    
    function renderAutobox(target,option){
    	 var combo = $("<span class=\"combo\"></span>").insertAfter(target);
    	 $(target).addClass("combo-text").addClass("basefield");
    	 var text = $(target).appendTo(combo);//将text框添加到combo
    	 var text_column =  $(target).closest(".text_field");
    	 var combpanel  = $("<div class=\"combo-panel\"></div>").appendTo("body");//将下来面板添加到body
    	 var ft = $("<div class=\"ft\" > <div class=\"pp\"></div> </div>").appendTo(combo);
    	 var c =  $(".combo .ft .pp");
    	 var pp =  c.pagination({
    			layout:['first','prev','next','last']
    		});
    	 //设置下拉面板
    	 combpanel.panel({
             doSize: false,
             closed: true,
             cls: "combo-p",
             content:"",
             footer:ft,
             style: { position: "absolute", zIndex: 10 },
             onOpen: function () {
                 $(this).panel("resize");
             }
         });
         var name = $(target).attr("name");
         return {panel: combpanel,combo:combo,footer:ft,pp:pp};
    }
    
 
    
    
    //默认属性和事件 
    $.fn.autobox.defaults = $.extend({}, {
    	method: "post",//通过URL加载远程列表数据
    	mode:"remote",
    	url: null,//HTTP方法检索数据(POST / GET)。
        data: null,//数据列表加载
        width: "auto",//组件的宽度
        height: 22,//组件的高度
        panelWidth: null,//下拉面板宽度
        panelHeight: 200,//下拉面板高度
        multiple: false,//定义是否支持多选
        separator: ",",//在多选的时候使用何种分隔符进行分割
        editable: true,//定义用户是否可以直接输入文本到字段中
        disabled: false,//定义是否禁用字段
        value: "",//字段的默认值,
        panelField:[],
        delay: 200,//最后一次输入事件与执行搜索之间的延迟间隔（执行自动完成功能的延迟间隔）
        rows:10,
        page:1,
        formatUrl:null,
        beforeShow:null,
        //在用户按下键的时候调用一个函数
        keyHandler: {
            up: _up,
            down: _down,
            enter: _enter,
            query: function (q) {
            	_query(this, q);
            }
        },
        //当下拉面板显示的时候触发
        onShowPanel: function () {},
        //当下拉面板隐藏的时候触发
        onHidePanel: function () {},
        //在用户选择列表项的时候触发
        onSelect: function (_5a) {
        },
        onEnter: function(){
        },
        onKeyDowner:function(){
        	alert("dd");
        },
        //当字段值改变的时候触发
        onChange: function (newValue, oldValue) {},
        //定义了如何从远程服务器加载数据。返回false可以忽略该动作。该函数具备如下参数：
        //param：传递到远程服务器的参数对象。
        //success(data)：在检索数据成功的时候调用该回调函数。
        //    error()：在检索数据失败的时候调用该回调函数
        loader: function (param, success, error) {
            var options = $(this).autobox("options");
            if (!options.url) {
                return false;
            }
            var url = options.url;
            if(options.formatUrl !=null){
              url = options.formatUrl.call($(this), url);
            }
            $.ajax({
                type: options.method,
                url: url,
                data: param,
                dataType: "json",
                success: function (data) {
                    success(data);
                }, 
                error: function (data) {
                	error(data);
                }
            });
        }
    });
    
    
  //默认方法
    $.fn.autobox.methods = {
    		//显示下拉面板
            showPanel: function (jq) {
                return jq.each(function () {
                    _showPanel(this);
                });
            },
            //返回属性对象
            options: function (jq) {
                return $.data(jq[0], "combo").options;
            },
            //返回下拉面板对象
            panel: function (jq) {
                return $.data(jq[0], "combo").panel;
            },
            //获取组件值的数组
            getValues: function (jq) {
                return _getValues(jq[0]);
            },
            //隐藏下拉面板
            hidePanel: function (jq) {
                return jq.each(function () {
                    hidePanel(this);
                });
            },
            select: function (jq, value) {
                return jq.each(function () {
                    _select(this, value);
                });
            },
    }
	
})(jQuery);

