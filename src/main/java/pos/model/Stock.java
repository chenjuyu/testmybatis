package pos.model;

import java.math.BigDecimal;
import java.util.Date;

public class Stock {
    private String stockid;

    private String type;

    private String no;

    private Date date;

    private String warehouseid;

    private String departmentid;

    private String employeeid;

    private Integer quantitysum;

    private BigDecimal amountsum;

    private String madeby;

    private Date madebydate;

    private String audit;

    private Date auditdate;

    private Boolean auditflag;

    private Boolean tallyflag;

    private Boolean outportendflag;

    private Boolean sendflag;

    private String memo;

    private String relationid;

    private String relationno;

    private Short direction;

    private String year;

    private String month;

    private Integer receivalint;

    private String salesorderno;

    private String receivalid;

    private Boolean receivalflag;

    private Boolean voucherflag;

    private String displaysizegroup;

    private Short costflag;

    private String csid;

    private String relationwarehouseid;

    private String commandflag;

    private BigDecimal retailamountsum;

    private BigDecimal purchaseamountsum;

    private String costwarehouseid;

    private String relationstuffstockid;

    private String relationstockid;

    private Boolean exportflag;

    private String customerid;

    private Boolean fixexportflag;

    private String brandid;

    private BigDecimal relationamountsum;

    private String supplierid;

    private String relationtype;

    private BigDecimal otheramount;

    private BigDecimal tradeamountsum;

    private String salesno;

    private Short relationdirection;

    private Boolean checkflag;

    private String businessdeptid;

    private String relationorderid;

    private String printmen;

    private Integer printcount;

    private Boolean isreserved;

    private Boolean isrebate;

    private String passeditor;

    private Date passdate;

    private Boolean passflag;

    private String freightcorpid;

    private String freightmodeid;

    private Integer sendinttag;

    private Boolean insuranceflag;

    private Boolean hasoutflag;

    private Integer outtoinindexno;

    private Boolean canoutflag;

    private String custaddress;

    private BigDecimal lastneedramount;

    public String getStockid() {
        return stockid;
    }

    public void setStockid(String stockid) {
        this.stockid = stockid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getQuantitysum() {
        return quantitysum;
    }

    public void setQuantitysum(Integer quantitysum) {
        this.quantitysum = quantitysum;
    }

    public BigDecimal getAmountsum() {
        return amountsum;
    }

    public void setAmountsum(BigDecimal amountsum) {
        this.amountsum = amountsum;
    }

    public String getMadeby() {
        return madeby;
    }

    public void setMadeby(String madeby) {
        this.madeby = madeby;
    }

    public Date getMadebydate() {
        return madebydate;
    }

    public void setMadebydate(Date madebydate) {
        this.madebydate = madebydate;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public Boolean getAuditflag() {
        return auditflag;
    }

    public void setAuditflag(Boolean auditflag) {
        this.auditflag = auditflag;
    }

    public Boolean getTallyflag() {
        return tallyflag;
    }

    public void setTallyflag(Boolean tallyflag) {
        this.tallyflag = tallyflag;
    }

    public Boolean getOutportendflag() {
        return outportendflag;
    }

    public void setOutportendflag(Boolean outportendflag) {
        this.outportendflag = outportendflag;
    }

    public Boolean getSendflag() {
        return sendflag;
    }

    public void setSendflag(Boolean sendflag) {
        this.sendflag = sendflag;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getRelationid() {
        return relationid;
    }

    public void setRelationid(String relationid) {
        this.relationid = relationid;
    }

    public String getRelationno() {
        return relationno;
    }

    public void setRelationno(String relationno) {
        this.relationno = relationno;
    }

    public Short getDirection() {
        return direction;
    }

    public void setDirection(Short direction) {
        this.direction = direction;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getReceivalint() {
        return receivalint;
    }

    public void setReceivalint(Integer receivalint) {
        this.receivalint = receivalint;
    }

    public String getSalesorderno() {
        return salesorderno;
    }

    public void setSalesorderno(String salesorderno) {
        this.salesorderno = salesorderno;
    }

    public String getReceivalid() {
        return receivalid;
    }

    public void setReceivalid(String receivalid) {
        this.receivalid = receivalid;
    }

    public Boolean getReceivalflag() {
        return receivalflag;
    }

    public void setReceivalflag(Boolean receivalflag) {
        this.receivalflag = receivalflag;
    }

    public Boolean getVoucherflag() {
        return voucherflag;
    }

    public void setVoucherflag(Boolean voucherflag) {
        this.voucherflag = voucherflag;
    }

    public String getDisplaysizegroup() {
        return displaysizegroup;
    }

    public void setDisplaysizegroup(String displaysizegroup) {
        this.displaysizegroup = displaysizegroup;
    }

    public Short getCostflag() {
        return costflag;
    }

    public void setCostflag(Short costflag) {
        this.costflag = costflag;
    }

    public String getCsid() {
        return csid;
    }

    public void setCsid(String csid) {
        this.csid = csid;
    }

    public String getRelationwarehouseid() {
        return relationwarehouseid;
    }

    public void setRelationwarehouseid(String relationwarehouseid) {
        this.relationwarehouseid = relationwarehouseid;
    }

    public String getCommandflag() {
        return commandflag;
    }

    public void setCommandflag(String commandflag) {
        this.commandflag = commandflag;
    }

    public BigDecimal getRetailamountsum() {
        return retailamountsum;
    }

    public void setRetailamountsum(BigDecimal retailamountsum) {
        this.retailamountsum = retailamountsum;
    }

    public BigDecimal getPurchaseamountsum() {
        return purchaseamountsum;
    }

    public void setPurchaseamountsum(BigDecimal purchaseamountsum) {
        this.purchaseamountsum = purchaseamountsum;
    }

    public String getCostwarehouseid() {
        return costwarehouseid;
    }

    public void setCostwarehouseid(String costwarehouseid) {
        this.costwarehouseid = costwarehouseid;
    }

    public String getRelationstuffstockid() {
        return relationstuffstockid;
    }

    public void setRelationstuffstockid(String relationstuffstockid) {
        this.relationstuffstockid = relationstuffstockid;
    }

    public String getRelationstockid() {
        return relationstockid;
    }

    public void setRelationstockid(String relationstockid) {
        this.relationstockid = relationstockid;
    }

    public Boolean getExportflag() {
        return exportflag;
    }

    public void setExportflag(Boolean exportflag) {
        this.exportflag = exportflag;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public Boolean getFixexportflag() {
        return fixexportflag;
    }

    public void setFixexportflag(Boolean fixexportflag) {
        this.fixexportflag = fixexportflag;
    }

    public String getBrandid() {
        return brandid;
    }

    public void setBrandid(String brandid) {
        this.brandid = brandid;
    }

    public BigDecimal getRelationamountsum() {
        return relationamountsum;
    }

    public void setRelationamountsum(BigDecimal relationamountsum) {
        this.relationamountsum = relationamountsum;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getRelationtype() {
        return relationtype;
    }

    public void setRelationtype(String relationtype) {
        this.relationtype = relationtype;
    }

    public BigDecimal getOtheramount() {
        return otheramount;
    }

    public void setOtheramount(BigDecimal otheramount) {
        this.otheramount = otheramount;
    }

    public BigDecimal getTradeamountsum() {
        return tradeamountsum;
    }

    public void setTradeamountsum(BigDecimal tradeamountsum) {
        this.tradeamountsum = tradeamountsum;
    }

    public String getSalesno() {
        return salesno;
    }

    public void setSalesno(String salesno) {
        this.salesno = salesno;
    }

    public Short getRelationdirection() {
        return relationdirection;
    }

    public void setRelationdirection(Short relationdirection) {
        this.relationdirection = relationdirection;
    }

    public Boolean getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(Boolean checkflag) {
        this.checkflag = checkflag;
    }

    public String getBusinessdeptid() {
        return businessdeptid;
    }

    public void setBusinessdeptid(String businessdeptid) {
        this.businessdeptid = businessdeptid;
    }

    public String getRelationorderid() {
        return relationorderid;
    }

    public void setRelationorderid(String relationorderid) {
        this.relationorderid = relationorderid;
    }

    public String getPrintmen() {
        return printmen;
    }

    public void setPrintmen(String printmen) {
        this.printmen = printmen;
    }

    public Integer getPrintcount() {
        return printcount;
    }

    public void setPrintcount(Integer printcount) {
        this.printcount = printcount;
    }

    public Boolean getIsreserved() {
        return isreserved;
    }

    public void setIsreserved(Boolean isreserved) {
        this.isreserved = isreserved;
    }

    public Boolean getIsrebate() {
        return isrebate;
    }

    public void setIsrebate(Boolean isrebate) {
        this.isrebate = isrebate;
    }

    public String getPasseditor() {
        return passeditor;
    }

    public void setPasseditor(String passeditor) {
        this.passeditor = passeditor;
    }

    public Date getPassdate() {
        return passdate;
    }

    public void setPassdate(Date passdate) {
        this.passdate = passdate;
    }

    public Boolean getPassflag() {
        return passflag;
    }

    public void setPassflag(Boolean passflag) {
        this.passflag = passflag;
    }

    public String getFreightcorpid() {
        return freightcorpid;
    }

    public void setFreightcorpid(String freightcorpid) {
        this.freightcorpid = freightcorpid;
    }

    public String getFreightmodeid() {
        return freightmodeid;
    }

    public void setFreightmodeid(String freightmodeid) {
        this.freightmodeid = freightmodeid;
    }

    public Integer getSendinttag() {
        return sendinttag;
    }

    public void setSendinttag(Integer sendinttag) {
        this.sendinttag = sendinttag;
    }

    public Boolean getInsuranceflag() {
        return insuranceflag;
    }

    public void setInsuranceflag(Boolean insuranceflag) {
        this.insuranceflag = insuranceflag;
    }

    public Boolean getHasoutflag() {
        return hasoutflag;
    }

    public void setHasoutflag(Boolean hasoutflag) {
        this.hasoutflag = hasoutflag;
    }

    public Integer getOuttoinindexno() {
        return outtoinindexno;
    }

    public void setOuttoinindexno(Integer outtoinindexno) {
        this.outtoinindexno = outtoinindexno;
    }

    public Boolean getCanoutflag() {
        return canoutflag;
    }

    public void setCanoutflag(Boolean canoutflag) {
        this.canoutflag = canoutflag;
    }

    public String getCustaddress() {
        return custaddress;
    }

    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
    }

    public BigDecimal getLastneedramount() {
        return lastneedramount;
    }

    public void setLastneedramount(BigDecimal lastneedramount) {
        this.lastneedramount = lastneedramount;
    }
}