package pos.model;

import java.math.BigDecimal;

public class Stockdetail extends StockdetailKey {
    private Integer quantity;

    private BigDecimal unitprice;

    private BigDecimal amount;

    private String batchno;

    private String batchbalance;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public String getBatchbalance() {
        return batchbalance;
    }

    public void setBatchbalance(String batchbalance) {
        this.batchbalance = batchbalance;
    }
}