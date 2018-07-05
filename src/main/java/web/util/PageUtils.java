package web.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class PageUtils implements Serializable{

	 
		/**
		 * currentPage: 页码(默认第一页)： currentPage=1；2，3，4，5。。。。。。
		 */

		private Integer currentPage = 1;
		/**
		 * 每页记录数（每页几条）：pageCount select * from table limit
		 * (pageNum-1)*pageCount,pageCount;
		 */
		private Integer pageCount;
		/**
		 * 总记录数（总共多少条数据）：totalCount select count（*） from table;
		 */
		private Integer totalCount;
		/**
		 * 共几页（最大页码值）：totalPage <br >
		 * 1.totalCount%pageCount==0？totalCount/pageCount:totalCount/pageCount+1
		 *  ;<br>
		 * 2.(totalCount+pageCount-1)/pageCount;
		 */
		private Integer totalPage;
		/**
		 * 当前页的记录数ju：datas:
		 */
		private List datas;
		private String url;
		private String pageLinks;
		
		private String borrower;
       


		public String getBorrower() {
			return borrower;
		}

		public void setBorrower(String borrower) {
			this.borrower = borrower;
		}

		public Integer getCurrentPage() {
			return currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageCount() {
			return pageCount;
		}

		public void setPageCount(Integer pageCount) {
			this.pageCount = pageCount;
		}

		public Integer getTotalCount() {
			return totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
	     }

		public Integer getTotalPage() {
			return totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public List getDatas() {
			return datas;
		}

		public void setDatas(List datas) {
			this.datas = datas;
		}

		public String toString() {
			return "Page [currentPage=" + currentPage + ", pageCount="
					+ pageCount + ", totalCount=" + totalCount + ", totalPage="
					+ totalPage + ", datas=" + datas + "]";
		}
		 public static   int parseInt(Object s, int defaultValue) {
			if (s != null && s.toString().matches("\\d+")) {
				return Integer.parseInt(s.toString());
			} else {
				return defaultValue;
			}
		} 

	  public  void init(HttpServletRequest request,List dataList,int totalCount, int pageCount,String url) {
			
			String page_num = request.getParameter("pageNo");

			
			 this.currentPage = parseInt(page_num,1);// 当前页码

			List  list = new ArrayList();
			if (dataList != null) {
				list = dataList;
				request.getSession().setAttribute("list", list);
			} else {
				list = (List) request.getSession().getAttribute("list");
				if (list == null) {
					list = new ArrayList();
				}
			}

			this.totalCount =totalCount;// 总的数据条数
			if (url != null) {
				this.url = url;
			} else {
				this.url = request.getRequestURL() + "";
			}
			if (pageCount > 0)
				this.pageCount = pageCount;
           this.totalPage=(totalCount + pageCount - 1) / pageCount;
		   this.datas=dataList;
            
		} 
		public void setPageLinks(String url) {
			this.url = url;
		}

		public String getPageLinks() {
           StringBuffer sb = new StringBuffer();
			 if (url != null && !"".equals(url)) {
				if (url.indexOf("?") > -1) {
					// 如果url中已经包含了其他的参数,就把currentPage参数接在后面
					url += "&";
				} else {
					// 如果url中没有别的参数
					url += "?";
				}
				sb.append("<script>");
				sb.append("function gotoPage(page_num){");
				sb.append("location.href='" + url + "pageNo='+page_num;");
				sb.append("}</script>");
				}
				 
				sb.append("<div style=\"padding:20%;font: thin 10.5pt 微软雅黑, 宋体;\">");
				sb.append("总共").append(this.totalCount)
						.append("条记录&nbsp;&nbsp;");
			 
				if (currentPage > 1) {
					sb.append("&nbsp;&nbsp;<a href=\"javascript:void(0);\"onclick=\"gotoPage(1);return false;\"");
					sb.append("\">[首页]</a>");

					sb.append(
							"&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"javascript:void(0);\"onclick=\"gotoPage(")
							.append(currentPage - 1).append(");return false;\"");
					sb.append("\">[上一页]</a>");
				}
				if (currentPage < totalPage) {
                    System.out.println(currentPage+"aaa");
					sb.append(
							"&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"javascript:void(0);\"onclick=\"gotoPage(")
							.append(currentPage + 1).append(");return false;\"");
					sb.append("\">[下一页]</a>");
					sb.append(
							"&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"javascript:void(0);\"onclick=\"gotoPage(")
							.append(totalPage).append(");return false;\"");
					sb.append("\">[末页]</a>");
				}
				 
				sb.append("&nbsp;&nbsp;&nbsp;&nbsp;转到<select name='pageNo'"
						+ " id='pageNo' onchange='javascript:gotoPage(this.value)'>");
				for (int i = 1; i <=totalPage; i++) {
					if (i == currentPage) {
						sb.append("<option value='").append(i)
								.append("' selected>").append(i)
								.append("</option>");
					} else {
						sb.append("<option value='").append(i)
								.append("'/>").append(i).append("</option>");
					}
				}
				sb.append("</select>页");
				sb.append("&nbsp;&nbsp;&nbsp;&nbsp;第<span style=\"color:red\">").append(this.currentPage)
				.append("</span>页/共").append(this.totalPage)
				.append("页");
				sb.append("</div >");
				pageLinks=sb.toString();
			 return pageLinks;
		}
		 
	}
