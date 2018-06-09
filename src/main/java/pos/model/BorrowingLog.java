package pos.model;

import java.math.BigDecimal;

public class BorrowingLog {
    private String id;

    private String ledger;

    private String borrower;

    private String borrowingtype;

    private String borrowingdate;

    private String repaymentdate;

    private String reason;

    private String vouchernum;

    private BigDecimal amount;

    private BigDecimal repaymentamount;

    private String requestid;

    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLedger() {
        return ledger;
    }

    public void setLedger(String ledger) {
        this.ledger = ledger == null ? null : ledger.trim();
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower == null ? null : borrower.trim();
    }

    public String getBorrowingtype() {
        return borrowingtype;
    }

    public void setBorrowingtype(String borrowingtype) {
        this.borrowingtype = borrowingtype == null ? null : borrowingtype.trim();
    }

    public String getBorrowingdate() {
        return borrowingdate;
    }

    public void setBorrowingdate(String borrowingdate) {
        this.borrowingdate = borrowingdate == null ? null : borrowingdate.trim();
    }

    public String getRepaymentdate() {
        return repaymentdate;
    }

    public void setRepaymentdate(String repaymentdate) {
        this.repaymentdate = repaymentdate == null ? null : repaymentdate.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getVouchernum() {
        return vouchernum;
    }

    public void setVouchernum(String vouchernum) {
        this.vouchernum = vouchernum == null ? null : vouchernum.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRepaymentamount() {
        return repaymentamount;
    }

    public void setRepaymentamount(BigDecimal repaymentamount) {
        this.repaymentamount = repaymentamount;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid == null ? null : requestid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}