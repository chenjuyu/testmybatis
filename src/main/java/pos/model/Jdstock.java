package pos.model;

import java.util.Date;

public class Jdstock {
    private String stockid;

    private String type;

    private String no;

    private Date date;

    private String warehouseid;

    private String jddeptno;

    private String poorderno;

    private String eclpsono;

    private String eclprtsno;

    private String goodsno;

    private Boolean iscancel;

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

    public String getJddeptno() {
        return jddeptno;
    }

    public void setJddeptno(String jddeptno) {
        this.jddeptno = jddeptno;
    }

    public String getPoorderno() {
        return poorderno;
    }

    public void setPoorderno(String poorderno) {
        this.poorderno = poorderno;
    }

    public String getEclpsono() {
        return eclpsono;
    }

    public void setEclpsono(String eclpsono) {
        this.eclpsono = eclpsono;
    }

    public String getEclprtsno() {
        return eclprtsno;
    }

    public void setEclprtsno(String eclprtsno) {
        this.eclprtsno = eclprtsno;
    }

    public String getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(String goodsno) {
        this.goodsno = goodsno;
    }

    public Boolean getIscancel() {
        return iscancel;
    }

    public void setIscancel(Boolean iscancel) {
        this.iscancel = iscancel;
    }
}