package pos.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStockidIsNull() {
            addCriterion("StockID is null");
            return (Criteria) this;
        }

        public Criteria andStockidIsNotNull() {
            addCriterion("StockID is not null");
            return (Criteria) this;
        }

        public Criteria andStockidEqualTo(String value) {
            addCriterion("StockID =", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotEqualTo(String value) {
            addCriterion("StockID <>", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThan(String value) {
            addCriterion("StockID >", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThanOrEqualTo(String value) {
            addCriterion("StockID >=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThan(String value) {
            addCriterion("StockID <", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThanOrEqualTo(String value) {
            addCriterion("StockID <=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLike(String value) {
            addCriterion("StockID like", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotLike(String value) {
            addCriterion("StockID not like", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidIn(List<String> values) {
            addCriterion("StockID in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotIn(List<String> values) {
            addCriterion("StockID not in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidBetween(String value1, String value2) {
            addCriterion("StockID between", value1, value2, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotBetween(String value1, String value2) {
            addCriterion("StockID not between", value1, value2, "stockid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("No is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("No is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("No =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("No <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("No >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("No >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("No <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("No <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("No like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("No not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("No in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("No not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("No between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("No not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("Date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("Date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("Date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("Date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("Date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("Date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("Date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("Date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("Date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("Date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("Date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNull() {
            addCriterion("WarehouseID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("WarehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(String value) {
            addCriterion("WarehouseID =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(String value) {
            addCriterion("WarehouseID <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(String value) {
            addCriterion("WarehouseID >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("WarehouseID >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(String value) {
            addCriterion("WarehouseID <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(String value) {
            addCriterion("WarehouseID <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLike(String value) {
            addCriterion("WarehouseID like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotLike(String value) {
            addCriterion("WarehouseID not like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<String> values) {
            addCriterion("WarehouseID in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<String> values) {
            addCriterion("WarehouseID not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(String value1, String value2) {
            addCriterion("WarehouseID between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(String value1, String value2) {
            addCriterion("WarehouseID not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("DepartmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DepartmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(String value) {
            addCriterion("DepartmentID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(String value) {
            addCriterion("DepartmentID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(String value) {
            addCriterion("DepartmentID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("DepartmentID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(String value) {
            addCriterion("DepartmentID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(String value) {
            addCriterion("DepartmentID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLike(String value) {
            addCriterion("DepartmentID like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotLike(String value) {
            addCriterion("DepartmentID not like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<String> values) {
            addCriterion("DepartmentID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<String> values) {
            addCriterion("DepartmentID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(String value1, String value2) {
            addCriterion("DepartmentID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(String value1, String value2) {
            addCriterion("DepartmentID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("EmployeeID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("EmployeeID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(String value) {
            addCriterion("EmployeeID =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(String value) {
            addCriterion("EmployeeID <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(String value) {
            addCriterion("EmployeeID >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeID >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(String value) {
            addCriterion("EmployeeID <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(String value) {
            addCriterion("EmployeeID <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLike(String value) {
            addCriterion("EmployeeID like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotLike(String value) {
            addCriterion("EmployeeID not like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<String> values) {
            addCriterion("EmployeeID in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<String> values) {
            addCriterion("EmployeeID not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(String value1, String value2) {
            addCriterion("EmployeeID between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(String value1, String value2) {
            addCriterion("EmployeeID not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andQuantitysumIsNull() {
            addCriterion("QuantitySum is null");
            return (Criteria) this;
        }

        public Criteria andQuantitysumIsNotNull() {
            addCriterion("QuantitySum is not null");
            return (Criteria) this;
        }

        public Criteria andQuantitysumEqualTo(Integer value) {
            addCriterion("QuantitySum =", value, "quantitysum");
            return (Criteria) this;
        }

        public Criteria andQuantitysumNotEqualTo(Integer value) {
            addCriterion("QuantitySum <>", value, "quantitysum");
            return (Criteria) this;
        }

        public Criteria andQuantitysumGreaterThan(Integer value) {
            addCriterion("QuantitySum >", value, "quantitysum");
            return (Criteria) this;
        }

        public Criteria andQuantitysumGreaterThanOrEqualTo(Integer value) {
            addCriterion("QuantitySum >=", value, "quantitysum");
            return (Criteria) this;
        }

        public Criteria andQuantitysumLessThan(Integer value) {
            addCriterion("QuantitySum <", value, "quantitysum");
            return (Criteria) this;
        }

        public Criteria andQuantitysumLessThanOrEqualTo(Integer value) {
            addCriterion("QuantitySum <=", value, "quantitysum");
            return (Criteria) this;
        }

        public Criteria andQuantitysumIn(List<Integer> values) {
            addCriterion("QuantitySum in", values, "quantitysum");
            return (Criteria) this;
        }

        public Criteria andQuantitysumNotIn(List<Integer> values) {
            addCriterion("QuantitySum not in", values, "quantitysum");
            return (Criteria) this;
        }

        public Criteria andQuantitysumBetween(Integer value1, Integer value2) {
            addCriterion("QuantitySum between", value1, value2, "quantitysum");
            return (Criteria) this;
        }

        public Criteria andQuantitysumNotBetween(Integer value1, Integer value2) {
            addCriterion("QuantitySum not between", value1, value2, "quantitysum");
            return (Criteria) this;
        }

        public Criteria andAmountsumIsNull() {
            addCriterion("AmountSum is null");
            return (Criteria) this;
        }

        public Criteria andAmountsumIsNotNull() {
            addCriterion("AmountSum is not null");
            return (Criteria) this;
        }

        public Criteria andAmountsumEqualTo(BigDecimal value) {
            addCriterion("AmountSum =", value, "amountsum");
            return (Criteria) this;
        }

        public Criteria andAmountsumNotEqualTo(BigDecimal value) {
            addCriterion("AmountSum <>", value, "amountsum");
            return (Criteria) this;
        }

        public Criteria andAmountsumGreaterThan(BigDecimal value) {
            addCriterion("AmountSum >", value, "amountsum");
            return (Criteria) this;
        }

        public Criteria andAmountsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AmountSum >=", value, "amountsum");
            return (Criteria) this;
        }

        public Criteria andAmountsumLessThan(BigDecimal value) {
            addCriterion("AmountSum <", value, "amountsum");
            return (Criteria) this;
        }

        public Criteria andAmountsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AmountSum <=", value, "amountsum");
            return (Criteria) this;
        }

        public Criteria andAmountsumIn(List<BigDecimal> values) {
            addCriterion("AmountSum in", values, "amountsum");
            return (Criteria) this;
        }

        public Criteria andAmountsumNotIn(List<BigDecimal> values) {
            addCriterion("AmountSum not in", values, "amountsum");
            return (Criteria) this;
        }

        public Criteria andAmountsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AmountSum between", value1, value2, "amountsum");
            return (Criteria) this;
        }

        public Criteria andAmountsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AmountSum not between", value1, value2, "amountsum");
            return (Criteria) this;
        }

        public Criteria andMadebyIsNull() {
            addCriterion("MadeBy is null");
            return (Criteria) this;
        }

        public Criteria andMadebyIsNotNull() {
            addCriterion("MadeBy is not null");
            return (Criteria) this;
        }

        public Criteria andMadebyEqualTo(String value) {
            addCriterion("MadeBy =", value, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebyNotEqualTo(String value) {
            addCriterion("MadeBy <>", value, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebyGreaterThan(String value) {
            addCriterion("MadeBy >", value, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebyGreaterThanOrEqualTo(String value) {
            addCriterion("MadeBy >=", value, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebyLessThan(String value) {
            addCriterion("MadeBy <", value, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebyLessThanOrEqualTo(String value) {
            addCriterion("MadeBy <=", value, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebyLike(String value) {
            addCriterion("MadeBy like", value, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebyNotLike(String value) {
            addCriterion("MadeBy not like", value, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebyIn(List<String> values) {
            addCriterion("MadeBy in", values, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebyNotIn(List<String> values) {
            addCriterion("MadeBy not in", values, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebyBetween(String value1, String value2) {
            addCriterion("MadeBy between", value1, value2, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebyNotBetween(String value1, String value2) {
            addCriterion("MadeBy not between", value1, value2, "madeby");
            return (Criteria) this;
        }

        public Criteria andMadebydateIsNull() {
            addCriterion("MadeByDate is null");
            return (Criteria) this;
        }

        public Criteria andMadebydateIsNotNull() {
            addCriterion("MadeByDate is not null");
            return (Criteria) this;
        }

        public Criteria andMadebydateEqualTo(Date value) {
            addCriterion("MadeByDate =", value, "madebydate");
            return (Criteria) this;
        }

        public Criteria andMadebydateNotEqualTo(Date value) {
            addCriterion("MadeByDate <>", value, "madebydate");
            return (Criteria) this;
        }

        public Criteria andMadebydateGreaterThan(Date value) {
            addCriterion("MadeByDate >", value, "madebydate");
            return (Criteria) this;
        }

        public Criteria andMadebydateGreaterThanOrEqualTo(Date value) {
            addCriterion("MadeByDate >=", value, "madebydate");
            return (Criteria) this;
        }

        public Criteria andMadebydateLessThan(Date value) {
            addCriterion("MadeByDate <", value, "madebydate");
            return (Criteria) this;
        }

        public Criteria andMadebydateLessThanOrEqualTo(Date value) {
            addCriterion("MadeByDate <=", value, "madebydate");
            return (Criteria) this;
        }

        public Criteria andMadebydateIn(List<Date> values) {
            addCriterion("MadeByDate in", values, "madebydate");
            return (Criteria) this;
        }

        public Criteria andMadebydateNotIn(List<Date> values) {
            addCriterion("MadeByDate not in", values, "madebydate");
            return (Criteria) this;
        }

        public Criteria andMadebydateBetween(Date value1, Date value2) {
            addCriterion("MadeByDate between", value1, value2, "madebydate");
            return (Criteria) this;
        }

        public Criteria andMadebydateNotBetween(Date value1, Date value2) {
            addCriterion("MadeByDate not between", value1, value2, "madebydate");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("Audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("Audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(String value) {
            addCriterion("Audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(String value) {
            addCriterion("Audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(String value) {
            addCriterion("Audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(String value) {
            addCriterion("Audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(String value) {
            addCriterion("Audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(String value) {
            addCriterion("Audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLike(String value) {
            addCriterion("Audit like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotLike(String value) {
            addCriterion("Audit not like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<String> values) {
            addCriterion("Audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<String> values) {
            addCriterion("Audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(String value1, String value2) {
            addCriterion("Audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(String value1, String value2) {
            addCriterion("Audit not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNull() {
            addCriterion("AuditDate is null");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNotNull() {
            addCriterion("AuditDate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdateEqualTo(Date value) {
            addCriterion("AuditDate =", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotEqualTo(Date value) {
            addCriterion("AuditDate <>", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThan(Date value) {
            addCriterion("AuditDate >", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThanOrEqualTo(Date value) {
            addCriterion("AuditDate >=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThan(Date value) {
            addCriterion("AuditDate <", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThanOrEqualTo(Date value) {
            addCriterion("AuditDate <=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateIn(List<Date> values) {
            addCriterion("AuditDate in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotIn(List<Date> values) {
            addCriterion("AuditDate not in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateBetween(Date value1, Date value2) {
            addCriterion("AuditDate between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotBetween(Date value1, Date value2) {
            addCriterion("AuditDate not between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditflagIsNull() {
            addCriterion("AuditFlag is null");
            return (Criteria) this;
        }

        public Criteria andAuditflagIsNotNull() {
            addCriterion("AuditFlag is not null");
            return (Criteria) this;
        }

        public Criteria andAuditflagEqualTo(Boolean value) {
            addCriterion("AuditFlag =", value, "auditflag");
            return (Criteria) this;
        }

        public Criteria andAuditflagNotEqualTo(Boolean value) {
            addCriterion("AuditFlag <>", value, "auditflag");
            return (Criteria) this;
        }

        public Criteria andAuditflagGreaterThan(Boolean value) {
            addCriterion("AuditFlag >", value, "auditflag");
            return (Criteria) this;
        }

        public Criteria andAuditflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("AuditFlag >=", value, "auditflag");
            return (Criteria) this;
        }

        public Criteria andAuditflagLessThan(Boolean value) {
            addCriterion("AuditFlag <", value, "auditflag");
            return (Criteria) this;
        }

        public Criteria andAuditflagLessThanOrEqualTo(Boolean value) {
            addCriterion("AuditFlag <=", value, "auditflag");
            return (Criteria) this;
        }

        public Criteria andAuditflagIn(List<Boolean> values) {
            addCriterion("AuditFlag in", values, "auditflag");
            return (Criteria) this;
        }

        public Criteria andAuditflagNotIn(List<Boolean> values) {
            addCriterion("AuditFlag not in", values, "auditflag");
            return (Criteria) this;
        }

        public Criteria andAuditflagBetween(Boolean value1, Boolean value2) {
            addCriterion("AuditFlag between", value1, value2, "auditflag");
            return (Criteria) this;
        }

        public Criteria andAuditflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("AuditFlag not between", value1, value2, "auditflag");
            return (Criteria) this;
        }

        public Criteria andTallyflagIsNull() {
            addCriterion("TallyFlag is null");
            return (Criteria) this;
        }

        public Criteria andTallyflagIsNotNull() {
            addCriterion("TallyFlag is not null");
            return (Criteria) this;
        }

        public Criteria andTallyflagEqualTo(Boolean value) {
            addCriterion("TallyFlag =", value, "tallyflag");
            return (Criteria) this;
        }

        public Criteria andTallyflagNotEqualTo(Boolean value) {
            addCriterion("TallyFlag <>", value, "tallyflag");
            return (Criteria) this;
        }

        public Criteria andTallyflagGreaterThan(Boolean value) {
            addCriterion("TallyFlag >", value, "tallyflag");
            return (Criteria) this;
        }

        public Criteria andTallyflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TallyFlag >=", value, "tallyflag");
            return (Criteria) this;
        }

        public Criteria andTallyflagLessThan(Boolean value) {
            addCriterion("TallyFlag <", value, "tallyflag");
            return (Criteria) this;
        }

        public Criteria andTallyflagLessThanOrEqualTo(Boolean value) {
            addCriterion("TallyFlag <=", value, "tallyflag");
            return (Criteria) this;
        }

        public Criteria andTallyflagIn(List<Boolean> values) {
            addCriterion("TallyFlag in", values, "tallyflag");
            return (Criteria) this;
        }

        public Criteria andTallyflagNotIn(List<Boolean> values) {
            addCriterion("TallyFlag not in", values, "tallyflag");
            return (Criteria) this;
        }

        public Criteria andTallyflagBetween(Boolean value1, Boolean value2) {
            addCriterion("TallyFlag between", value1, value2, "tallyflag");
            return (Criteria) this;
        }

        public Criteria andTallyflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TallyFlag not between", value1, value2, "tallyflag");
            return (Criteria) this;
        }

        public Criteria andOutportendflagIsNull() {
            addCriterion("OutportEndFlag is null");
            return (Criteria) this;
        }

        public Criteria andOutportendflagIsNotNull() {
            addCriterion("OutportEndFlag is not null");
            return (Criteria) this;
        }

        public Criteria andOutportendflagEqualTo(Boolean value) {
            addCriterion("OutportEndFlag =", value, "outportendflag");
            return (Criteria) this;
        }

        public Criteria andOutportendflagNotEqualTo(Boolean value) {
            addCriterion("OutportEndFlag <>", value, "outportendflag");
            return (Criteria) this;
        }

        public Criteria andOutportendflagGreaterThan(Boolean value) {
            addCriterion("OutportEndFlag >", value, "outportendflag");
            return (Criteria) this;
        }

        public Criteria andOutportendflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("OutportEndFlag >=", value, "outportendflag");
            return (Criteria) this;
        }

        public Criteria andOutportendflagLessThan(Boolean value) {
            addCriterion("OutportEndFlag <", value, "outportendflag");
            return (Criteria) this;
        }

        public Criteria andOutportendflagLessThanOrEqualTo(Boolean value) {
            addCriterion("OutportEndFlag <=", value, "outportendflag");
            return (Criteria) this;
        }

        public Criteria andOutportendflagIn(List<Boolean> values) {
            addCriterion("OutportEndFlag in", values, "outportendflag");
            return (Criteria) this;
        }

        public Criteria andOutportendflagNotIn(List<Boolean> values) {
            addCriterion("OutportEndFlag not in", values, "outportendflag");
            return (Criteria) this;
        }

        public Criteria andOutportendflagBetween(Boolean value1, Boolean value2) {
            addCriterion("OutportEndFlag between", value1, value2, "outportendflag");
            return (Criteria) this;
        }

        public Criteria andOutportendflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("OutportEndFlag not between", value1, value2, "outportendflag");
            return (Criteria) this;
        }

        public Criteria andSendflagIsNull() {
            addCriterion("SendFlag is null");
            return (Criteria) this;
        }

        public Criteria andSendflagIsNotNull() {
            addCriterion("SendFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSendflagEqualTo(Boolean value) {
            addCriterion("SendFlag =", value, "sendflag");
            return (Criteria) this;
        }

        public Criteria andSendflagNotEqualTo(Boolean value) {
            addCriterion("SendFlag <>", value, "sendflag");
            return (Criteria) this;
        }

        public Criteria andSendflagGreaterThan(Boolean value) {
            addCriterion("SendFlag >", value, "sendflag");
            return (Criteria) this;
        }

        public Criteria andSendflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SendFlag >=", value, "sendflag");
            return (Criteria) this;
        }

        public Criteria andSendflagLessThan(Boolean value) {
            addCriterion("SendFlag <", value, "sendflag");
            return (Criteria) this;
        }

        public Criteria andSendflagLessThanOrEqualTo(Boolean value) {
            addCriterion("SendFlag <=", value, "sendflag");
            return (Criteria) this;
        }

        public Criteria andSendflagIn(List<Boolean> values) {
            addCriterion("SendFlag in", values, "sendflag");
            return (Criteria) this;
        }

        public Criteria andSendflagNotIn(List<Boolean> values) {
            addCriterion("SendFlag not in", values, "sendflag");
            return (Criteria) this;
        }

        public Criteria andSendflagBetween(Boolean value1, Boolean value2) {
            addCriterion("SendFlag between", value1, value2, "sendflag");
            return (Criteria) this;
        }

        public Criteria andSendflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SendFlag not between", value1, value2, "sendflag");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andRelationidIsNull() {
            addCriterion("RelationID is null");
            return (Criteria) this;
        }

        public Criteria andRelationidIsNotNull() {
            addCriterion("RelationID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationidEqualTo(String value) {
            addCriterion("RelationID =", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotEqualTo(String value) {
            addCriterion("RelationID <>", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThan(String value) {
            addCriterion("RelationID >", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThanOrEqualTo(String value) {
            addCriterion("RelationID >=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThan(String value) {
            addCriterion("RelationID <", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThanOrEqualTo(String value) {
            addCriterion("RelationID <=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLike(String value) {
            addCriterion("RelationID like", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotLike(String value) {
            addCriterion("RelationID not like", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidIn(List<String> values) {
            addCriterion("RelationID in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotIn(List<String> values) {
            addCriterion("RelationID not in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidBetween(String value1, String value2) {
            addCriterion("RelationID between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotBetween(String value1, String value2) {
            addCriterion("RelationID not between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationnoIsNull() {
            addCriterion("RelationNo is null");
            return (Criteria) this;
        }

        public Criteria andRelationnoIsNotNull() {
            addCriterion("RelationNo is not null");
            return (Criteria) this;
        }

        public Criteria andRelationnoEqualTo(String value) {
            addCriterion("RelationNo =", value, "relationno");
            return (Criteria) this;
        }

        public Criteria andRelationnoNotEqualTo(String value) {
            addCriterion("RelationNo <>", value, "relationno");
            return (Criteria) this;
        }

        public Criteria andRelationnoGreaterThan(String value) {
            addCriterion("RelationNo >", value, "relationno");
            return (Criteria) this;
        }

        public Criteria andRelationnoGreaterThanOrEqualTo(String value) {
            addCriterion("RelationNo >=", value, "relationno");
            return (Criteria) this;
        }

        public Criteria andRelationnoLessThan(String value) {
            addCriterion("RelationNo <", value, "relationno");
            return (Criteria) this;
        }

        public Criteria andRelationnoLessThanOrEqualTo(String value) {
            addCriterion("RelationNo <=", value, "relationno");
            return (Criteria) this;
        }

        public Criteria andRelationnoLike(String value) {
            addCriterion("RelationNo like", value, "relationno");
            return (Criteria) this;
        }

        public Criteria andRelationnoNotLike(String value) {
            addCriterion("RelationNo not like", value, "relationno");
            return (Criteria) this;
        }

        public Criteria andRelationnoIn(List<String> values) {
            addCriterion("RelationNo in", values, "relationno");
            return (Criteria) this;
        }

        public Criteria andRelationnoNotIn(List<String> values) {
            addCriterion("RelationNo not in", values, "relationno");
            return (Criteria) this;
        }

        public Criteria andRelationnoBetween(String value1, String value2) {
            addCriterion("RelationNo between", value1, value2, "relationno");
            return (Criteria) this;
        }

        public Criteria andRelationnoNotBetween(String value1, String value2) {
            addCriterion("RelationNo not between", value1, value2, "relationno");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("Direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("Direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(Short value) {
            addCriterion("Direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(Short value) {
            addCriterion("Direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(Short value) {
            addCriterion("Direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(Short value) {
            addCriterion("Direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(Short value) {
            addCriterion("Direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(Short value) {
            addCriterion("Direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<Short> values) {
            addCriterion("Direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<Short> values) {
            addCriterion("Direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(Short value1, Short value2) {
            addCriterion("Direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(Short value1, Short value2) {
            addCriterion("Direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("Year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("Year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("Year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("Year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("Year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("Year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("Year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("Year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("Year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("Year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("Year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("Year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("Year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("Year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("Month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("Month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("Month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("Month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("Month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("Month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("Month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("Month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("Month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("Month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("Month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("Month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("Month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("Month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andReceivalintIsNull() {
            addCriterion("ReceivalInt is null");
            return (Criteria) this;
        }

        public Criteria andReceivalintIsNotNull() {
            addCriterion("ReceivalInt is not null");
            return (Criteria) this;
        }

        public Criteria andReceivalintEqualTo(Integer value) {
            addCriterion("ReceivalInt =", value, "receivalint");
            return (Criteria) this;
        }

        public Criteria andReceivalintNotEqualTo(Integer value) {
            addCriterion("ReceivalInt <>", value, "receivalint");
            return (Criteria) this;
        }

        public Criteria andReceivalintGreaterThan(Integer value) {
            addCriterion("ReceivalInt >", value, "receivalint");
            return (Criteria) this;
        }

        public Criteria andReceivalintGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceivalInt >=", value, "receivalint");
            return (Criteria) this;
        }

        public Criteria andReceivalintLessThan(Integer value) {
            addCriterion("ReceivalInt <", value, "receivalint");
            return (Criteria) this;
        }

        public Criteria andReceivalintLessThanOrEqualTo(Integer value) {
            addCriterion("ReceivalInt <=", value, "receivalint");
            return (Criteria) this;
        }

        public Criteria andReceivalintIn(List<Integer> values) {
            addCriterion("ReceivalInt in", values, "receivalint");
            return (Criteria) this;
        }

        public Criteria andReceivalintNotIn(List<Integer> values) {
            addCriterion("ReceivalInt not in", values, "receivalint");
            return (Criteria) this;
        }

        public Criteria andReceivalintBetween(Integer value1, Integer value2) {
            addCriterion("ReceivalInt between", value1, value2, "receivalint");
            return (Criteria) this;
        }

        public Criteria andReceivalintNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceivalInt not between", value1, value2, "receivalint");
            return (Criteria) this;
        }

        public Criteria andSalesordernoIsNull() {
            addCriterion("SalesOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andSalesordernoIsNotNull() {
            addCriterion("SalesOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andSalesordernoEqualTo(String value) {
            addCriterion("SalesOrderNo =", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoNotEqualTo(String value) {
            addCriterion("SalesOrderNo <>", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoGreaterThan(String value) {
            addCriterion("SalesOrderNo >", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoGreaterThanOrEqualTo(String value) {
            addCriterion("SalesOrderNo >=", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoLessThan(String value) {
            addCriterion("SalesOrderNo <", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoLessThanOrEqualTo(String value) {
            addCriterion("SalesOrderNo <=", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoLike(String value) {
            addCriterion("SalesOrderNo like", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoNotLike(String value) {
            addCriterion("SalesOrderNo not like", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoIn(List<String> values) {
            addCriterion("SalesOrderNo in", values, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoNotIn(List<String> values) {
            addCriterion("SalesOrderNo not in", values, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoBetween(String value1, String value2) {
            addCriterion("SalesOrderNo between", value1, value2, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoNotBetween(String value1, String value2) {
            addCriterion("SalesOrderNo not between", value1, value2, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andReceivalidIsNull() {
            addCriterion("ReceivalID is null");
            return (Criteria) this;
        }

        public Criteria andReceivalidIsNotNull() {
            addCriterion("ReceivalID is not null");
            return (Criteria) this;
        }

        public Criteria andReceivalidEqualTo(String value) {
            addCriterion("ReceivalID =", value, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalidNotEqualTo(String value) {
            addCriterion("ReceivalID <>", value, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalidGreaterThan(String value) {
            addCriterion("ReceivalID >", value, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalidGreaterThanOrEqualTo(String value) {
            addCriterion("ReceivalID >=", value, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalidLessThan(String value) {
            addCriterion("ReceivalID <", value, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalidLessThanOrEqualTo(String value) {
            addCriterion("ReceivalID <=", value, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalidLike(String value) {
            addCriterion("ReceivalID like", value, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalidNotLike(String value) {
            addCriterion("ReceivalID not like", value, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalidIn(List<String> values) {
            addCriterion("ReceivalID in", values, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalidNotIn(List<String> values) {
            addCriterion("ReceivalID not in", values, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalidBetween(String value1, String value2) {
            addCriterion("ReceivalID between", value1, value2, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalidNotBetween(String value1, String value2) {
            addCriterion("ReceivalID not between", value1, value2, "receivalid");
            return (Criteria) this;
        }

        public Criteria andReceivalflagIsNull() {
            addCriterion("ReceivalFlag is null");
            return (Criteria) this;
        }

        public Criteria andReceivalflagIsNotNull() {
            addCriterion("ReceivalFlag is not null");
            return (Criteria) this;
        }

        public Criteria andReceivalflagEqualTo(Boolean value) {
            addCriterion("ReceivalFlag =", value, "receivalflag");
            return (Criteria) this;
        }

        public Criteria andReceivalflagNotEqualTo(Boolean value) {
            addCriterion("ReceivalFlag <>", value, "receivalflag");
            return (Criteria) this;
        }

        public Criteria andReceivalflagGreaterThan(Boolean value) {
            addCriterion("ReceivalFlag >", value, "receivalflag");
            return (Criteria) this;
        }

        public Criteria andReceivalflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ReceivalFlag >=", value, "receivalflag");
            return (Criteria) this;
        }

        public Criteria andReceivalflagLessThan(Boolean value) {
            addCriterion("ReceivalFlag <", value, "receivalflag");
            return (Criteria) this;
        }

        public Criteria andReceivalflagLessThanOrEqualTo(Boolean value) {
            addCriterion("ReceivalFlag <=", value, "receivalflag");
            return (Criteria) this;
        }

        public Criteria andReceivalflagIn(List<Boolean> values) {
            addCriterion("ReceivalFlag in", values, "receivalflag");
            return (Criteria) this;
        }

        public Criteria andReceivalflagNotIn(List<Boolean> values) {
            addCriterion("ReceivalFlag not in", values, "receivalflag");
            return (Criteria) this;
        }

        public Criteria andReceivalflagBetween(Boolean value1, Boolean value2) {
            addCriterion("ReceivalFlag between", value1, value2, "receivalflag");
            return (Criteria) this;
        }

        public Criteria andReceivalflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ReceivalFlag not between", value1, value2, "receivalflag");
            return (Criteria) this;
        }

        public Criteria andVoucherflagIsNull() {
            addCriterion("VoucherFlag is null");
            return (Criteria) this;
        }

        public Criteria andVoucherflagIsNotNull() {
            addCriterion("VoucherFlag is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherflagEqualTo(Boolean value) {
            addCriterion("VoucherFlag =", value, "voucherflag");
            return (Criteria) this;
        }

        public Criteria andVoucherflagNotEqualTo(Boolean value) {
            addCriterion("VoucherFlag <>", value, "voucherflag");
            return (Criteria) this;
        }

        public Criteria andVoucherflagGreaterThan(Boolean value) {
            addCriterion("VoucherFlag >", value, "voucherflag");
            return (Criteria) this;
        }

        public Criteria andVoucherflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("VoucherFlag >=", value, "voucherflag");
            return (Criteria) this;
        }

        public Criteria andVoucherflagLessThan(Boolean value) {
            addCriterion("VoucherFlag <", value, "voucherflag");
            return (Criteria) this;
        }

        public Criteria andVoucherflagLessThanOrEqualTo(Boolean value) {
            addCriterion("VoucherFlag <=", value, "voucherflag");
            return (Criteria) this;
        }

        public Criteria andVoucherflagIn(List<Boolean> values) {
            addCriterion("VoucherFlag in", values, "voucherflag");
            return (Criteria) this;
        }

        public Criteria andVoucherflagNotIn(List<Boolean> values) {
            addCriterion("VoucherFlag not in", values, "voucherflag");
            return (Criteria) this;
        }

        public Criteria andVoucherflagBetween(Boolean value1, Boolean value2) {
            addCriterion("VoucherFlag between", value1, value2, "voucherflag");
            return (Criteria) this;
        }

        public Criteria andVoucherflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("VoucherFlag not between", value1, value2, "voucherflag");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupIsNull() {
            addCriterion("DisplaySizeGroup is null");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupIsNotNull() {
            addCriterion("DisplaySizeGroup is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupEqualTo(String value) {
            addCriterion("DisplaySizeGroup =", value, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupNotEqualTo(String value) {
            addCriterion("DisplaySizeGroup <>", value, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupGreaterThan(String value) {
            addCriterion("DisplaySizeGroup >", value, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupGreaterThanOrEqualTo(String value) {
            addCriterion("DisplaySizeGroup >=", value, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupLessThan(String value) {
            addCriterion("DisplaySizeGroup <", value, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupLessThanOrEqualTo(String value) {
            addCriterion("DisplaySizeGroup <=", value, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupLike(String value) {
            addCriterion("DisplaySizeGroup like", value, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupNotLike(String value) {
            addCriterion("DisplaySizeGroup not like", value, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupIn(List<String> values) {
            addCriterion("DisplaySizeGroup in", values, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupNotIn(List<String> values) {
            addCriterion("DisplaySizeGroup not in", values, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupBetween(String value1, String value2) {
            addCriterion("DisplaySizeGroup between", value1, value2, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andDisplaysizegroupNotBetween(String value1, String value2) {
            addCriterion("DisplaySizeGroup not between", value1, value2, "displaysizegroup");
            return (Criteria) this;
        }

        public Criteria andCostflagIsNull() {
            addCriterion("CostFlag is null");
            return (Criteria) this;
        }

        public Criteria andCostflagIsNotNull() {
            addCriterion("CostFlag is not null");
            return (Criteria) this;
        }

        public Criteria andCostflagEqualTo(Short value) {
            addCriterion("CostFlag =", value, "costflag");
            return (Criteria) this;
        }

        public Criteria andCostflagNotEqualTo(Short value) {
            addCriterion("CostFlag <>", value, "costflag");
            return (Criteria) this;
        }

        public Criteria andCostflagGreaterThan(Short value) {
            addCriterion("CostFlag >", value, "costflag");
            return (Criteria) this;
        }

        public Criteria andCostflagGreaterThanOrEqualTo(Short value) {
            addCriterion("CostFlag >=", value, "costflag");
            return (Criteria) this;
        }

        public Criteria andCostflagLessThan(Short value) {
            addCriterion("CostFlag <", value, "costflag");
            return (Criteria) this;
        }

        public Criteria andCostflagLessThanOrEqualTo(Short value) {
            addCriterion("CostFlag <=", value, "costflag");
            return (Criteria) this;
        }

        public Criteria andCostflagIn(List<Short> values) {
            addCriterion("CostFlag in", values, "costflag");
            return (Criteria) this;
        }

        public Criteria andCostflagNotIn(List<Short> values) {
            addCriterion("CostFlag not in", values, "costflag");
            return (Criteria) this;
        }

        public Criteria andCostflagBetween(Short value1, Short value2) {
            addCriterion("CostFlag between", value1, value2, "costflag");
            return (Criteria) this;
        }

        public Criteria andCostflagNotBetween(Short value1, Short value2) {
            addCriterion("CostFlag not between", value1, value2, "costflag");
            return (Criteria) this;
        }

        public Criteria andCsidIsNull() {
            addCriterion("CSID is null");
            return (Criteria) this;
        }

        public Criteria andCsidIsNotNull() {
            addCriterion("CSID is not null");
            return (Criteria) this;
        }

        public Criteria andCsidEqualTo(String value) {
            addCriterion("CSID =", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotEqualTo(String value) {
            addCriterion("CSID <>", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidGreaterThan(String value) {
            addCriterion("CSID >", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidGreaterThanOrEqualTo(String value) {
            addCriterion("CSID >=", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidLessThan(String value) {
            addCriterion("CSID <", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidLessThanOrEqualTo(String value) {
            addCriterion("CSID <=", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidLike(String value) {
            addCriterion("CSID like", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotLike(String value) {
            addCriterion("CSID not like", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidIn(List<String> values) {
            addCriterion("CSID in", values, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotIn(List<String> values) {
            addCriterion("CSID not in", values, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidBetween(String value1, String value2) {
            addCriterion("CSID between", value1, value2, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotBetween(String value1, String value2) {
            addCriterion("CSID not between", value1, value2, "csid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidIsNull() {
            addCriterion("RelationWarehouseID is null");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidIsNotNull() {
            addCriterion("RelationWarehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidEqualTo(String value) {
            addCriterion("RelationWarehouseID =", value, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidNotEqualTo(String value) {
            addCriterion("RelationWarehouseID <>", value, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidGreaterThan(String value) {
            addCriterion("RelationWarehouseID >", value, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("RelationWarehouseID >=", value, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidLessThan(String value) {
            addCriterion("RelationWarehouseID <", value, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidLessThanOrEqualTo(String value) {
            addCriterion("RelationWarehouseID <=", value, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidLike(String value) {
            addCriterion("RelationWarehouseID like", value, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidNotLike(String value) {
            addCriterion("RelationWarehouseID not like", value, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidIn(List<String> values) {
            addCriterion("RelationWarehouseID in", values, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidNotIn(List<String> values) {
            addCriterion("RelationWarehouseID not in", values, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidBetween(String value1, String value2) {
            addCriterion("RelationWarehouseID between", value1, value2, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationwarehouseidNotBetween(String value1, String value2) {
            addCriterion("RelationWarehouseID not between", value1, value2, "relationwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCommandflagIsNull() {
            addCriterion("CommandFlag is null");
            return (Criteria) this;
        }

        public Criteria andCommandflagIsNotNull() {
            addCriterion("CommandFlag is not null");
            return (Criteria) this;
        }

        public Criteria andCommandflagEqualTo(String value) {
            addCriterion("CommandFlag =", value, "commandflag");
            return (Criteria) this;
        }

        public Criteria andCommandflagNotEqualTo(String value) {
            addCriterion("CommandFlag <>", value, "commandflag");
            return (Criteria) this;
        }

        public Criteria andCommandflagGreaterThan(String value) {
            addCriterion("CommandFlag >", value, "commandflag");
            return (Criteria) this;
        }

        public Criteria andCommandflagGreaterThanOrEqualTo(String value) {
            addCriterion("CommandFlag >=", value, "commandflag");
            return (Criteria) this;
        }

        public Criteria andCommandflagLessThan(String value) {
            addCriterion("CommandFlag <", value, "commandflag");
            return (Criteria) this;
        }

        public Criteria andCommandflagLessThanOrEqualTo(String value) {
            addCriterion("CommandFlag <=", value, "commandflag");
            return (Criteria) this;
        }

        public Criteria andCommandflagLike(String value) {
            addCriterion("CommandFlag like", value, "commandflag");
            return (Criteria) this;
        }

        public Criteria andCommandflagNotLike(String value) {
            addCriterion("CommandFlag not like", value, "commandflag");
            return (Criteria) this;
        }

        public Criteria andCommandflagIn(List<String> values) {
            addCriterion("CommandFlag in", values, "commandflag");
            return (Criteria) this;
        }

        public Criteria andCommandflagNotIn(List<String> values) {
            addCriterion("CommandFlag not in", values, "commandflag");
            return (Criteria) this;
        }

        public Criteria andCommandflagBetween(String value1, String value2) {
            addCriterion("CommandFlag between", value1, value2, "commandflag");
            return (Criteria) this;
        }

        public Criteria andCommandflagNotBetween(String value1, String value2) {
            addCriterion("CommandFlag not between", value1, value2, "commandflag");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumIsNull() {
            addCriterion("RetailAmountSum is null");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumIsNotNull() {
            addCriterion("RetailAmountSum is not null");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumEqualTo(BigDecimal value) {
            addCriterion("RetailAmountSum =", value, "retailamountsum");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumNotEqualTo(BigDecimal value) {
            addCriterion("RetailAmountSum <>", value, "retailamountsum");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumGreaterThan(BigDecimal value) {
            addCriterion("RetailAmountSum >", value, "retailamountsum");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailAmountSum >=", value, "retailamountsum");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumLessThan(BigDecimal value) {
            addCriterion("RetailAmountSum <", value, "retailamountsum");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailAmountSum <=", value, "retailamountsum");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumIn(List<BigDecimal> values) {
            addCriterion("RetailAmountSum in", values, "retailamountsum");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumNotIn(List<BigDecimal> values) {
            addCriterion("RetailAmountSum not in", values, "retailamountsum");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailAmountSum between", value1, value2, "retailamountsum");
            return (Criteria) this;
        }

        public Criteria andRetailamountsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailAmountSum not between", value1, value2, "retailamountsum");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumIsNull() {
            addCriterion("PurchaseAmountSum is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumIsNotNull() {
            addCriterion("PurchaseAmountSum is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmountSum =", value, "purchaseamountsum");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumNotEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmountSum <>", value, "purchaseamountsum");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumGreaterThan(BigDecimal value) {
            addCriterion("PurchaseAmountSum >", value, "purchaseamountsum");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmountSum >=", value, "purchaseamountsum");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumLessThan(BigDecimal value) {
            addCriterion("PurchaseAmountSum <", value, "purchaseamountsum");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmountSum <=", value, "purchaseamountsum");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumIn(List<BigDecimal> values) {
            addCriterion("PurchaseAmountSum in", values, "purchaseamountsum");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumNotIn(List<BigDecimal> values) {
            addCriterion("PurchaseAmountSum not in", values, "purchaseamountsum");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchaseAmountSum between", value1, value2, "purchaseamountsum");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchaseAmountSum not between", value1, value2, "purchaseamountsum");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidIsNull() {
            addCriterion("CostWarehouseID is null");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidIsNotNull() {
            addCriterion("CostWarehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidEqualTo(String value) {
            addCriterion("CostWarehouseID =", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidNotEqualTo(String value) {
            addCriterion("CostWarehouseID <>", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidGreaterThan(String value) {
            addCriterion("CostWarehouseID >", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("CostWarehouseID >=", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidLessThan(String value) {
            addCriterion("CostWarehouseID <", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidLessThanOrEqualTo(String value) {
            addCriterion("CostWarehouseID <=", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidLike(String value) {
            addCriterion("CostWarehouseID like", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidNotLike(String value) {
            addCriterion("CostWarehouseID not like", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidIn(List<String> values) {
            addCriterion("CostWarehouseID in", values, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidNotIn(List<String> values) {
            addCriterion("CostWarehouseID not in", values, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidBetween(String value1, String value2) {
            addCriterion("CostWarehouseID between", value1, value2, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidNotBetween(String value1, String value2) {
            addCriterion("CostWarehouseID not between", value1, value2, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidIsNull() {
            addCriterion("RelationStuffStockID is null");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidIsNotNull() {
            addCriterion("RelationStuffStockID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidEqualTo(String value) {
            addCriterion("RelationStuffStockID =", value, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidNotEqualTo(String value) {
            addCriterion("RelationStuffStockID <>", value, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidGreaterThan(String value) {
            addCriterion("RelationStuffStockID >", value, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidGreaterThanOrEqualTo(String value) {
            addCriterion("RelationStuffStockID >=", value, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidLessThan(String value) {
            addCriterion("RelationStuffStockID <", value, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidLessThanOrEqualTo(String value) {
            addCriterion("RelationStuffStockID <=", value, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidLike(String value) {
            addCriterion("RelationStuffStockID like", value, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidNotLike(String value) {
            addCriterion("RelationStuffStockID not like", value, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidIn(List<String> values) {
            addCriterion("RelationStuffStockID in", values, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidNotIn(List<String> values) {
            addCriterion("RelationStuffStockID not in", values, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidBetween(String value1, String value2) {
            addCriterion("RelationStuffStockID between", value1, value2, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstuffstockidNotBetween(String value1, String value2) {
            addCriterion("RelationStuffStockID not between", value1, value2, "relationstuffstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidIsNull() {
            addCriterion("RelationStockID is null");
            return (Criteria) this;
        }

        public Criteria andRelationstockidIsNotNull() {
            addCriterion("RelationStockID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationstockidEqualTo(String value) {
            addCriterion("RelationStockID =", value, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidNotEqualTo(String value) {
            addCriterion("RelationStockID <>", value, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidGreaterThan(String value) {
            addCriterion("RelationStockID >", value, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidGreaterThanOrEqualTo(String value) {
            addCriterion("RelationStockID >=", value, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidLessThan(String value) {
            addCriterion("RelationStockID <", value, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidLessThanOrEqualTo(String value) {
            addCriterion("RelationStockID <=", value, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidLike(String value) {
            addCriterion("RelationStockID like", value, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidNotLike(String value) {
            addCriterion("RelationStockID not like", value, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidIn(List<String> values) {
            addCriterion("RelationStockID in", values, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidNotIn(List<String> values) {
            addCriterion("RelationStockID not in", values, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidBetween(String value1, String value2) {
            addCriterion("RelationStockID between", value1, value2, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andRelationstockidNotBetween(String value1, String value2) {
            addCriterion("RelationStockID not between", value1, value2, "relationstockid");
            return (Criteria) this;
        }

        public Criteria andExportflagIsNull() {
            addCriterion("ExportFlag is null");
            return (Criteria) this;
        }

        public Criteria andExportflagIsNotNull() {
            addCriterion("ExportFlag is not null");
            return (Criteria) this;
        }

        public Criteria andExportflagEqualTo(Boolean value) {
            addCriterion("ExportFlag =", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagNotEqualTo(Boolean value) {
            addCriterion("ExportFlag <>", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagGreaterThan(Boolean value) {
            addCriterion("ExportFlag >", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ExportFlag >=", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagLessThan(Boolean value) {
            addCriterion("ExportFlag <", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagLessThanOrEqualTo(Boolean value) {
            addCriterion("ExportFlag <=", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagIn(List<Boolean> values) {
            addCriterion("ExportFlag in", values, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagNotIn(List<Boolean> values) {
            addCriterion("ExportFlag not in", values, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagBetween(Boolean value1, Boolean value2) {
            addCriterion("ExportFlag between", value1, value2, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ExportFlag not between", value1, value2, "exportflag");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("CustomerID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CustomerID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("CustomerID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("CustomerID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("CustomerID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("CustomerID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("CustomerID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("CustomerID like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("CustomerID not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("CustomerID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("CustomerID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("CustomerID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("CustomerID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andFixexportflagIsNull() {
            addCriterion("FixExportFlag is null");
            return (Criteria) this;
        }

        public Criteria andFixexportflagIsNotNull() {
            addCriterion("FixExportFlag is not null");
            return (Criteria) this;
        }

        public Criteria andFixexportflagEqualTo(Boolean value) {
            addCriterion("FixExportFlag =", value, "fixexportflag");
            return (Criteria) this;
        }

        public Criteria andFixexportflagNotEqualTo(Boolean value) {
            addCriterion("FixExportFlag <>", value, "fixexportflag");
            return (Criteria) this;
        }

        public Criteria andFixexportflagGreaterThan(Boolean value) {
            addCriterion("FixExportFlag >", value, "fixexportflag");
            return (Criteria) this;
        }

        public Criteria andFixexportflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FixExportFlag >=", value, "fixexportflag");
            return (Criteria) this;
        }

        public Criteria andFixexportflagLessThan(Boolean value) {
            addCriterion("FixExportFlag <", value, "fixexportflag");
            return (Criteria) this;
        }

        public Criteria andFixexportflagLessThanOrEqualTo(Boolean value) {
            addCriterion("FixExportFlag <=", value, "fixexportflag");
            return (Criteria) this;
        }

        public Criteria andFixexportflagIn(List<Boolean> values) {
            addCriterion("FixExportFlag in", values, "fixexportflag");
            return (Criteria) this;
        }

        public Criteria andFixexportflagNotIn(List<Boolean> values) {
            addCriterion("FixExportFlag not in", values, "fixexportflag");
            return (Criteria) this;
        }

        public Criteria andFixexportflagBetween(Boolean value1, Boolean value2) {
            addCriterion("FixExportFlag between", value1, value2, "fixexportflag");
            return (Criteria) this;
        }

        public Criteria andFixexportflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FixExportFlag not between", value1, value2, "fixexportflag");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("BrandID is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("BrandID is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(String value) {
            addCriterion("BrandID =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(String value) {
            addCriterion("BrandID <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(String value) {
            addCriterion("BrandID >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(String value) {
            addCriterion("BrandID >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(String value) {
            addCriterion("BrandID <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(String value) {
            addCriterion("BrandID <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLike(String value) {
            addCriterion("BrandID like", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotLike(String value) {
            addCriterion("BrandID not like", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<String> values) {
            addCriterion("BrandID in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<String> values) {
            addCriterion("BrandID not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(String value1, String value2) {
            addCriterion("BrandID between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(String value1, String value2) {
            addCriterion("BrandID not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumIsNull() {
            addCriterion("RelationAmountSum is null");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumIsNotNull() {
            addCriterion("RelationAmountSum is not null");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumEqualTo(BigDecimal value) {
            addCriterion("RelationAmountSum =", value, "relationamountsum");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumNotEqualTo(BigDecimal value) {
            addCriterion("RelationAmountSum <>", value, "relationamountsum");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumGreaterThan(BigDecimal value) {
            addCriterion("RelationAmountSum >", value, "relationamountsum");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RelationAmountSum >=", value, "relationamountsum");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumLessThan(BigDecimal value) {
            addCriterion("RelationAmountSum <", value, "relationamountsum");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RelationAmountSum <=", value, "relationamountsum");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumIn(List<BigDecimal> values) {
            addCriterion("RelationAmountSum in", values, "relationamountsum");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumNotIn(List<BigDecimal> values) {
            addCriterion("RelationAmountSum not in", values, "relationamountsum");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RelationAmountSum between", value1, value2, "relationamountsum");
            return (Criteria) this;
        }

        public Criteria andRelationamountsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RelationAmountSum not between", value1, value2, "relationamountsum");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("SupplierID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SupplierID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(String value) {
            addCriterion("SupplierID =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(String value) {
            addCriterion("SupplierID <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(String value) {
            addCriterion("SupplierID >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierID >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(String value) {
            addCriterion("SupplierID <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(String value) {
            addCriterion("SupplierID <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLike(String value) {
            addCriterion("SupplierID like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotLike(String value) {
            addCriterion("SupplierID not like", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<String> values) {
            addCriterion("SupplierID in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<String> values) {
            addCriterion("SupplierID not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(String value1, String value2) {
            addCriterion("SupplierID between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(String value1, String value2) {
            addCriterion("SupplierID not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIsNull() {
            addCriterion("RelationType is null");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIsNotNull() {
            addCriterion("RelationType is not null");
            return (Criteria) this;
        }

        public Criteria andRelationtypeEqualTo(String value) {
            addCriterion("RelationType =", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeNotEqualTo(String value) {
            addCriterion("RelationType <>", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeGreaterThan(String value) {
            addCriterion("RelationType >", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("RelationType >=", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeLessThan(String value) {
            addCriterion("RelationType <", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeLessThanOrEqualTo(String value) {
            addCriterion("RelationType <=", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeLike(String value) {
            addCriterion("RelationType like", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeNotLike(String value) {
            addCriterion("RelationType not like", value, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeIn(List<String> values) {
            addCriterion("RelationType in", values, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeNotIn(List<String> values) {
            addCriterion("RelationType not in", values, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeBetween(String value1, String value2) {
            addCriterion("RelationType between", value1, value2, "relationtype");
            return (Criteria) this;
        }

        public Criteria andRelationtypeNotBetween(String value1, String value2) {
            addCriterion("RelationType not between", value1, value2, "relationtype");
            return (Criteria) this;
        }

        public Criteria andOtheramountIsNull() {
            addCriterion("OtherAmount is null");
            return (Criteria) this;
        }

        public Criteria andOtheramountIsNotNull() {
            addCriterion("OtherAmount is not null");
            return (Criteria) this;
        }

        public Criteria andOtheramountEqualTo(BigDecimal value) {
            addCriterion("OtherAmount =", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountNotEqualTo(BigDecimal value) {
            addCriterion("OtherAmount <>", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountGreaterThan(BigDecimal value) {
            addCriterion("OtherAmount >", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OtherAmount >=", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountLessThan(BigDecimal value) {
            addCriterion("OtherAmount <", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OtherAmount <=", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountIn(List<BigDecimal> values) {
            addCriterion("OtherAmount in", values, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountNotIn(List<BigDecimal> values) {
            addCriterion("OtherAmount not in", values, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OtherAmount between", value1, value2, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OtherAmount not between", value1, value2, "otheramount");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumIsNull() {
            addCriterion("TradeAmountSum is null");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumIsNotNull() {
            addCriterion("TradeAmountSum is not null");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumEqualTo(BigDecimal value) {
            addCriterion("TradeAmountSum =", value, "tradeamountsum");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumNotEqualTo(BigDecimal value) {
            addCriterion("TradeAmountSum <>", value, "tradeamountsum");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumGreaterThan(BigDecimal value) {
            addCriterion("TradeAmountSum >", value, "tradeamountsum");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TradeAmountSum >=", value, "tradeamountsum");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumLessThan(BigDecimal value) {
            addCriterion("TradeAmountSum <", value, "tradeamountsum");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TradeAmountSum <=", value, "tradeamountsum");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumIn(List<BigDecimal> values) {
            addCriterion("TradeAmountSum in", values, "tradeamountsum");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumNotIn(List<BigDecimal> values) {
            addCriterion("TradeAmountSum not in", values, "tradeamountsum");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TradeAmountSum between", value1, value2, "tradeamountsum");
            return (Criteria) this;
        }

        public Criteria andTradeamountsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TradeAmountSum not between", value1, value2, "tradeamountsum");
            return (Criteria) this;
        }

        public Criteria andSalesnoIsNull() {
            addCriterion("SalesNo is null");
            return (Criteria) this;
        }

        public Criteria andSalesnoIsNotNull() {
            addCriterion("SalesNo is not null");
            return (Criteria) this;
        }

        public Criteria andSalesnoEqualTo(String value) {
            addCriterion("SalesNo =", value, "salesno");
            return (Criteria) this;
        }

        public Criteria andSalesnoNotEqualTo(String value) {
            addCriterion("SalesNo <>", value, "salesno");
            return (Criteria) this;
        }

        public Criteria andSalesnoGreaterThan(String value) {
            addCriterion("SalesNo >", value, "salesno");
            return (Criteria) this;
        }

        public Criteria andSalesnoGreaterThanOrEqualTo(String value) {
            addCriterion("SalesNo >=", value, "salesno");
            return (Criteria) this;
        }

        public Criteria andSalesnoLessThan(String value) {
            addCriterion("SalesNo <", value, "salesno");
            return (Criteria) this;
        }

        public Criteria andSalesnoLessThanOrEqualTo(String value) {
            addCriterion("SalesNo <=", value, "salesno");
            return (Criteria) this;
        }

        public Criteria andSalesnoLike(String value) {
            addCriterion("SalesNo like", value, "salesno");
            return (Criteria) this;
        }

        public Criteria andSalesnoNotLike(String value) {
            addCriterion("SalesNo not like", value, "salesno");
            return (Criteria) this;
        }

        public Criteria andSalesnoIn(List<String> values) {
            addCriterion("SalesNo in", values, "salesno");
            return (Criteria) this;
        }

        public Criteria andSalesnoNotIn(List<String> values) {
            addCriterion("SalesNo not in", values, "salesno");
            return (Criteria) this;
        }

        public Criteria andSalesnoBetween(String value1, String value2) {
            addCriterion("SalesNo between", value1, value2, "salesno");
            return (Criteria) this;
        }

        public Criteria andSalesnoNotBetween(String value1, String value2) {
            addCriterion("SalesNo not between", value1, value2, "salesno");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionIsNull() {
            addCriterion("RelationDirection is null");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionIsNotNull() {
            addCriterion("RelationDirection is not null");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionEqualTo(Short value) {
            addCriterion("RelationDirection =", value, "relationdirection");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionNotEqualTo(Short value) {
            addCriterion("RelationDirection <>", value, "relationdirection");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionGreaterThan(Short value) {
            addCriterion("RelationDirection >", value, "relationdirection");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionGreaterThanOrEqualTo(Short value) {
            addCriterion("RelationDirection >=", value, "relationdirection");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionLessThan(Short value) {
            addCriterion("RelationDirection <", value, "relationdirection");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionLessThanOrEqualTo(Short value) {
            addCriterion("RelationDirection <=", value, "relationdirection");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionIn(List<Short> values) {
            addCriterion("RelationDirection in", values, "relationdirection");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionNotIn(List<Short> values) {
            addCriterion("RelationDirection not in", values, "relationdirection");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionBetween(Short value1, Short value2) {
            addCriterion("RelationDirection between", value1, value2, "relationdirection");
            return (Criteria) this;
        }

        public Criteria andRelationdirectionNotBetween(Short value1, Short value2) {
            addCriterion("RelationDirection not between", value1, value2, "relationdirection");
            return (Criteria) this;
        }

        public Criteria andCheckflagIsNull() {
            addCriterion("CheckFlag is null");
            return (Criteria) this;
        }

        public Criteria andCheckflagIsNotNull() {
            addCriterion("CheckFlag is not null");
            return (Criteria) this;
        }

        public Criteria andCheckflagEqualTo(Boolean value) {
            addCriterion("CheckFlag =", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagNotEqualTo(Boolean value) {
            addCriterion("CheckFlag <>", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagGreaterThan(Boolean value) {
            addCriterion("CheckFlag >", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CheckFlag >=", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagLessThan(Boolean value) {
            addCriterion("CheckFlag <", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagLessThanOrEqualTo(Boolean value) {
            addCriterion("CheckFlag <=", value, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagIn(List<Boolean> values) {
            addCriterion("CheckFlag in", values, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagNotIn(List<Boolean> values) {
            addCriterion("CheckFlag not in", values, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagBetween(Boolean value1, Boolean value2) {
            addCriterion("CheckFlag between", value1, value2, "checkflag");
            return (Criteria) this;
        }

        public Criteria andCheckflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CheckFlag not between", value1, value2, "checkflag");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidIsNull() {
            addCriterion("BusinessDeptID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidIsNotNull() {
            addCriterion("BusinessDeptID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidEqualTo(String value) {
            addCriterion("BusinessDeptID =", value, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidNotEqualTo(String value) {
            addCriterion("BusinessDeptID <>", value, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidGreaterThan(String value) {
            addCriterion("BusinessDeptID >", value, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessDeptID >=", value, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidLessThan(String value) {
            addCriterion("BusinessDeptID <", value, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidLessThanOrEqualTo(String value) {
            addCriterion("BusinessDeptID <=", value, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidLike(String value) {
            addCriterion("BusinessDeptID like", value, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidNotLike(String value) {
            addCriterion("BusinessDeptID not like", value, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidIn(List<String> values) {
            addCriterion("BusinessDeptID in", values, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidNotIn(List<String> values) {
            addCriterion("BusinessDeptID not in", values, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidBetween(String value1, String value2) {
            addCriterion("BusinessDeptID between", value1, value2, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptidNotBetween(String value1, String value2) {
            addCriterion("BusinessDeptID not between", value1, value2, "businessdeptid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidIsNull() {
            addCriterion("RelationOrderID is null");
            return (Criteria) this;
        }

        public Criteria andRelationorderidIsNotNull() {
            addCriterion("RelationOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationorderidEqualTo(String value) {
            addCriterion("RelationOrderID =", value, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidNotEqualTo(String value) {
            addCriterion("RelationOrderID <>", value, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidGreaterThan(String value) {
            addCriterion("RelationOrderID >", value, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidGreaterThanOrEqualTo(String value) {
            addCriterion("RelationOrderID >=", value, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidLessThan(String value) {
            addCriterion("RelationOrderID <", value, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidLessThanOrEqualTo(String value) {
            addCriterion("RelationOrderID <=", value, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidLike(String value) {
            addCriterion("RelationOrderID like", value, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidNotLike(String value) {
            addCriterion("RelationOrderID not like", value, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidIn(List<String> values) {
            addCriterion("RelationOrderID in", values, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidNotIn(List<String> values) {
            addCriterion("RelationOrderID not in", values, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidBetween(String value1, String value2) {
            addCriterion("RelationOrderID between", value1, value2, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andRelationorderidNotBetween(String value1, String value2) {
            addCriterion("RelationOrderID not between", value1, value2, "relationorderid");
            return (Criteria) this;
        }

        public Criteria andPrintmenIsNull() {
            addCriterion("PrintMen is null");
            return (Criteria) this;
        }

        public Criteria andPrintmenIsNotNull() {
            addCriterion("PrintMen is not null");
            return (Criteria) this;
        }

        public Criteria andPrintmenEqualTo(String value) {
            addCriterion("PrintMen =", value, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintmenNotEqualTo(String value) {
            addCriterion("PrintMen <>", value, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintmenGreaterThan(String value) {
            addCriterion("PrintMen >", value, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintmenGreaterThanOrEqualTo(String value) {
            addCriterion("PrintMen >=", value, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintmenLessThan(String value) {
            addCriterion("PrintMen <", value, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintmenLessThanOrEqualTo(String value) {
            addCriterion("PrintMen <=", value, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintmenLike(String value) {
            addCriterion("PrintMen like", value, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintmenNotLike(String value) {
            addCriterion("PrintMen not like", value, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintmenIn(List<String> values) {
            addCriterion("PrintMen in", values, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintmenNotIn(List<String> values) {
            addCriterion("PrintMen not in", values, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintmenBetween(String value1, String value2) {
            addCriterion("PrintMen between", value1, value2, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintmenNotBetween(String value1, String value2) {
            addCriterion("PrintMen not between", value1, value2, "printmen");
            return (Criteria) this;
        }

        public Criteria andPrintcountIsNull() {
            addCriterion("PrintCount is null");
            return (Criteria) this;
        }

        public Criteria andPrintcountIsNotNull() {
            addCriterion("PrintCount is not null");
            return (Criteria) this;
        }

        public Criteria andPrintcountEqualTo(Integer value) {
            addCriterion("PrintCount =", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotEqualTo(Integer value) {
            addCriterion("PrintCount <>", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountGreaterThan(Integer value) {
            addCriterion("PrintCount >", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrintCount >=", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountLessThan(Integer value) {
            addCriterion("PrintCount <", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountLessThanOrEqualTo(Integer value) {
            addCriterion("PrintCount <=", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountIn(List<Integer> values) {
            addCriterion("PrintCount in", values, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotIn(List<Integer> values) {
            addCriterion("PrintCount not in", values, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount between", value1, value2, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount not between", value1, value2, "printcount");
            return (Criteria) this;
        }

        public Criteria andIsreservedIsNull() {
            addCriterion("IsReserved is null");
            return (Criteria) this;
        }

        public Criteria andIsreservedIsNotNull() {
            addCriterion("IsReserved is not null");
            return (Criteria) this;
        }

        public Criteria andIsreservedEqualTo(Boolean value) {
            addCriterion("IsReserved =", value, "isreserved");
            return (Criteria) this;
        }

        public Criteria andIsreservedNotEqualTo(Boolean value) {
            addCriterion("IsReserved <>", value, "isreserved");
            return (Criteria) this;
        }

        public Criteria andIsreservedGreaterThan(Boolean value) {
            addCriterion("IsReserved >", value, "isreserved");
            return (Criteria) this;
        }

        public Criteria andIsreservedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsReserved >=", value, "isreserved");
            return (Criteria) this;
        }

        public Criteria andIsreservedLessThan(Boolean value) {
            addCriterion("IsReserved <", value, "isreserved");
            return (Criteria) this;
        }

        public Criteria andIsreservedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsReserved <=", value, "isreserved");
            return (Criteria) this;
        }

        public Criteria andIsreservedIn(List<Boolean> values) {
            addCriterion("IsReserved in", values, "isreserved");
            return (Criteria) this;
        }

        public Criteria andIsreservedNotIn(List<Boolean> values) {
            addCriterion("IsReserved not in", values, "isreserved");
            return (Criteria) this;
        }

        public Criteria andIsreservedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsReserved between", value1, value2, "isreserved");
            return (Criteria) this;
        }

        public Criteria andIsreservedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsReserved not between", value1, value2, "isreserved");
            return (Criteria) this;
        }

        public Criteria andIsrebateIsNull() {
            addCriterion("IsRebate is null");
            return (Criteria) this;
        }

        public Criteria andIsrebateIsNotNull() {
            addCriterion("IsRebate is not null");
            return (Criteria) this;
        }

        public Criteria andIsrebateEqualTo(Boolean value) {
            addCriterion("IsRebate =", value, "isrebate");
            return (Criteria) this;
        }

        public Criteria andIsrebateNotEqualTo(Boolean value) {
            addCriterion("IsRebate <>", value, "isrebate");
            return (Criteria) this;
        }

        public Criteria andIsrebateGreaterThan(Boolean value) {
            addCriterion("IsRebate >", value, "isrebate");
            return (Criteria) this;
        }

        public Criteria andIsrebateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsRebate >=", value, "isrebate");
            return (Criteria) this;
        }

        public Criteria andIsrebateLessThan(Boolean value) {
            addCriterion("IsRebate <", value, "isrebate");
            return (Criteria) this;
        }

        public Criteria andIsrebateLessThanOrEqualTo(Boolean value) {
            addCriterion("IsRebate <=", value, "isrebate");
            return (Criteria) this;
        }

        public Criteria andIsrebateIn(List<Boolean> values) {
            addCriterion("IsRebate in", values, "isrebate");
            return (Criteria) this;
        }

        public Criteria andIsrebateNotIn(List<Boolean> values) {
            addCriterion("IsRebate not in", values, "isrebate");
            return (Criteria) this;
        }

        public Criteria andIsrebateBetween(Boolean value1, Boolean value2) {
            addCriterion("IsRebate between", value1, value2, "isrebate");
            return (Criteria) this;
        }

        public Criteria andIsrebateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsRebate not between", value1, value2, "isrebate");
            return (Criteria) this;
        }

        public Criteria andPasseditorIsNull() {
            addCriterion("PassEditor is null");
            return (Criteria) this;
        }

        public Criteria andPasseditorIsNotNull() {
            addCriterion("PassEditor is not null");
            return (Criteria) this;
        }

        public Criteria andPasseditorEqualTo(String value) {
            addCriterion("PassEditor =", value, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPasseditorNotEqualTo(String value) {
            addCriterion("PassEditor <>", value, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPasseditorGreaterThan(String value) {
            addCriterion("PassEditor >", value, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPasseditorGreaterThanOrEqualTo(String value) {
            addCriterion("PassEditor >=", value, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPasseditorLessThan(String value) {
            addCriterion("PassEditor <", value, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPasseditorLessThanOrEqualTo(String value) {
            addCriterion("PassEditor <=", value, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPasseditorLike(String value) {
            addCriterion("PassEditor like", value, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPasseditorNotLike(String value) {
            addCriterion("PassEditor not like", value, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPasseditorIn(List<String> values) {
            addCriterion("PassEditor in", values, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPasseditorNotIn(List<String> values) {
            addCriterion("PassEditor not in", values, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPasseditorBetween(String value1, String value2) {
            addCriterion("PassEditor between", value1, value2, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPasseditorNotBetween(String value1, String value2) {
            addCriterion("PassEditor not between", value1, value2, "passeditor");
            return (Criteria) this;
        }

        public Criteria andPassdateIsNull() {
            addCriterion("PassDate is null");
            return (Criteria) this;
        }

        public Criteria andPassdateIsNotNull() {
            addCriterion("PassDate is not null");
            return (Criteria) this;
        }

        public Criteria andPassdateEqualTo(Date value) {
            addCriterion("PassDate =", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateNotEqualTo(Date value) {
            addCriterion("PassDate <>", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateGreaterThan(Date value) {
            addCriterion("PassDate >", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PassDate >=", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateLessThan(Date value) {
            addCriterion("PassDate <", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateLessThanOrEqualTo(Date value) {
            addCriterion("PassDate <=", value, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateIn(List<Date> values) {
            addCriterion("PassDate in", values, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateNotIn(List<Date> values) {
            addCriterion("PassDate not in", values, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateBetween(Date value1, Date value2) {
            addCriterion("PassDate between", value1, value2, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassdateNotBetween(Date value1, Date value2) {
            addCriterion("PassDate not between", value1, value2, "passdate");
            return (Criteria) this;
        }

        public Criteria andPassflagIsNull() {
            addCriterion("PassFlag is null");
            return (Criteria) this;
        }

        public Criteria andPassflagIsNotNull() {
            addCriterion("PassFlag is not null");
            return (Criteria) this;
        }

        public Criteria andPassflagEqualTo(Boolean value) {
            addCriterion("PassFlag =", value, "passflag");
            return (Criteria) this;
        }

        public Criteria andPassflagNotEqualTo(Boolean value) {
            addCriterion("PassFlag <>", value, "passflag");
            return (Criteria) this;
        }

        public Criteria andPassflagGreaterThan(Boolean value) {
            addCriterion("PassFlag >", value, "passflag");
            return (Criteria) this;
        }

        public Criteria andPassflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PassFlag >=", value, "passflag");
            return (Criteria) this;
        }

        public Criteria andPassflagLessThan(Boolean value) {
            addCriterion("PassFlag <", value, "passflag");
            return (Criteria) this;
        }

        public Criteria andPassflagLessThanOrEqualTo(Boolean value) {
            addCriterion("PassFlag <=", value, "passflag");
            return (Criteria) this;
        }

        public Criteria andPassflagIn(List<Boolean> values) {
            addCriterion("PassFlag in", values, "passflag");
            return (Criteria) this;
        }

        public Criteria andPassflagNotIn(List<Boolean> values) {
            addCriterion("PassFlag not in", values, "passflag");
            return (Criteria) this;
        }

        public Criteria andPassflagBetween(Boolean value1, Boolean value2) {
            addCriterion("PassFlag between", value1, value2, "passflag");
            return (Criteria) this;
        }

        public Criteria andPassflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PassFlag not between", value1, value2, "passflag");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidIsNull() {
            addCriterion("FreightCorpID is null");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidIsNotNull() {
            addCriterion("FreightCorpID is not null");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidEqualTo(String value) {
            addCriterion("FreightCorpID =", value, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidNotEqualTo(String value) {
            addCriterion("FreightCorpID <>", value, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidGreaterThan(String value) {
            addCriterion("FreightCorpID >", value, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidGreaterThanOrEqualTo(String value) {
            addCriterion("FreightCorpID >=", value, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidLessThan(String value) {
            addCriterion("FreightCorpID <", value, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidLessThanOrEqualTo(String value) {
            addCriterion("FreightCorpID <=", value, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidLike(String value) {
            addCriterion("FreightCorpID like", value, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidNotLike(String value) {
            addCriterion("FreightCorpID not like", value, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidIn(List<String> values) {
            addCriterion("FreightCorpID in", values, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidNotIn(List<String> values) {
            addCriterion("FreightCorpID not in", values, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidBetween(String value1, String value2) {
            addCriterion("FreightCorpID between", value1, value2, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightcorpidNotBetween(String value1, String value2) {
            addCriterion("FreightCorpID not between", value1, value2, "freightcorpid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidIsNull() {
            addCriterion("FreightModeID is null");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidIsNotNull() {
            addCriterion("FreightModeID is not null");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidEqualTo(String value) {
            addCriterion("FreightModeID =", value, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidNotEqualTo(String value) {
            addCriterion("FreightModeID <>", value, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidGreaterThan(String value) {
            addCriterion("FreightModeID >", value, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidGreaterThanOrEqualTo(String value) {
            addCriterion("FreightModeID >=", value, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidLessThan(String value) {
            addCriterion("FreightModeID <", value, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidLessThanOrEqualTo(String value) {
            addCriterion("FreightModeID <=", value, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidLike(String value) {
            addCriterion("FreightModeID like", value, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidNotLike(String value) {
            addCriterion("FreightModeID not like", value, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidIn(List<String> values) {
            addCriterion("FreightModeID in", values, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidNotIn(List<String> values) {
            addCriterion("FreightModeID not in", values, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidBetween(String value1, String value2) {
            addCriterion("FreightModeID between", value1, value2, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andFreightmodeidNotBetween(String value1, String value2) {
            addCriterion("FreightModeID not between", value1, value2, "freightmodeid");
            return (Criteria) this;
        }

        public Criteria andSendinttagIsNull() {
            addCriterion("SendIntTag is null");
            return (Criteria) this;
        }

        public Criteria andSendinttagIsNotNull() {
            addCriterion("SendIntTag is not null");
            return (Criteria) this;
        }

        public Criteria andSendinttagEqualTo(Integer value) {
            addCriterion("SendIntTag =", value, "sendinttag");
            return (Criteria) this;
        }

        public Criteria andSendinttagNotEqualTo(Integer value) {
            addCriterion("SendIntTag <>", value, "sendinttag");
            return (Criteria) this;
        }

        public Criteria andSendinttagGreaterThan(Integer value) {
            addCriterion("SendIntTag >", value, "sendinttag");
            return (Criteria) this;
        }

        public Criteria andSendinttagGreaterThanOrEqualTo(Integer value) {
            addCriterion("SendIntTag >=", value, "sendinttag");
            return (Criteria) this;
        }

        public Criteria andSendinttagLessThan(Integer value) {
            addCriterion("SendIntTag <", value, "sendinttag");
            return (Criteria) this;
        }

        public Criteria andSendinttagLessThanOrEqualTo(Integer value) {
            addCriterion("SendIntTag <=", value, "sendinttag");
            return (Criteria) this;
        }

        public Criteria andSendinttagIn(List<Integer> values) {
            addCriterion("SendIntTag in", values, "sendinttag");
            return (Criteria) this;
        }

        public Criteria andSendinttagNotIn(List<Integer> values) {
            addCriterion("SendIntTag not in", values, "sendinttag");
            return (Criteria) this;
        }

        public Criteria andSendinttagBetween(Integer value1, Integer value2) {
            addCriterion("SendIntTag between", value1, value2, "sendinttag");
            return (Criteria) this;
        }

        public Criteria andSendinttagNotBetween(Integer value1, Integer value2) {
            addCriterion("SendIntTag not between", value1, value2, "sendinttag");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagIsNull() {
            addCriterion("InsuranceFlag is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagIsNotNull() {
            addCriterion("InsuranceFlag is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagEqualTo(Boolean value) {
            addCriterion("InsuranceFlag =", value, "insuranceflag");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagNotEqualTo(Boolean value) {
            addCriterion("InsuranceFlag <>", value, "insuranceflag");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagGreaterThan(Boolean value) {
            addCriterion("InsuranceFlag >", value, "insuranceflag");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("InsuranceFlag >=", value, "insuranceflag");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagLessThan(Boolean value) {
            addCriterion("InsuranceFlag <", value, "insuranceflag");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagLessThanOrEqualTo(Boolean value) {
            addCriterion("InsuranceFlag <=", value, "insuranceflag");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagIn(List<Boolean> values) {
            addCriterion("InsuranceFlag in", values, "insuranceflag");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagNotIn(List<Boolean> values) {
            addCriterion("InsuranceFlag not in", values, "insuranceflag");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagBetween(Boolean value1, Boolean value2) {
            addCriterion("InsuranceFlag between", value1, value2, "insuranceflag");
            return (Criteria) this;
        }

        public Criteria andInsuranceflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("InsuranceFlag not between", value1, value2, "insuranceflag");
            return (Criteria) this;
        }

        public Criteria andHasoutflagIsNull() {
            addCriterion("HasOutFlag is null");
            return (Criteria) this;
        }

        public Criteria andHasoutflagIsNotNull() {
            addCriterion("HasOutFlag is not null");
            return (Criteria) this;
        }

        public Criteria andHasoutflagEqualTo(Boolean value) {
            addCriterion("HasOutFlag =", value, "hasoutflag");
            return (Criteria) this;
        }

        public Criteria andHasoutflagNotEqualTo(Boolean value) {
            addCriterion("HasOutFlag <>", value, "hasoutflag");
            return (Criteria) this;
        }

        public Criteria andHasoutflagGreaterThan(Boolean value) {
            addCriterion("HasOutFlag >", value, "hasoutflag");
            return (Criteria) this;
        }

        public Criteria andHasoutflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("HasOutFlag >=", value, "hasoutflag");
            return (Criteria) this;
        }

        public Criteria andHasoutflagLessThan(Boolean value) {
            addCriterion("HasOutFlag <", value, "hasoutflag");
            return (Criteria) this;
        }

        public Criteria andHasoutflagLessThanOrEqualTo(Boolean value) {
            addCriterion("HasOutFlag <=", value, "hasoutflag");
            return (Criteria) this;
        }

        public Criteria andHasoutflagIn(List<Boolean> values) {
            addCriterion("HasOutFlag in", values, "hasoutflag");
            return (Criteria) this;
        }

        public Criteria andHasoutflagNotIn(List<Boolean> values) {
            addCriterion("HasOutFlag not in", values, "hasoutflag");
            return (Criteria) this;
        }

        public Criteria andHasoutflagBetween(Boolean value1, Boolean value2) {
            addCriterion("HasOutFlag between", value1, value2, "hasoutflag");
            return (Criteria) this;
        }

        public Criteria andHasoutflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("HasOutFlag not between", value1, value2, "hasoutflag");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoIsNull() {
            addCriterion("OutToInInDexNo is null");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoIsNotNull() {
            addCriterion("OutToInInDexNo is not null");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoEqualTo(Integer value) {
            addCriterion("OutToInInDexNo =", value, "outtoinindexno");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoNotEqualTo(Integer value) {
            addCriterion("OutToInInDexNo <>", value, "outtoinindexno");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoGreaterThan(Integer value) {
            addCriterion("OutToInInDexNo >", value, "outtoinindexno");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("OutToInInDexNo >=", value, "outtoinindexno");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoLessThan(Integer value) {
            addCriterion("OutToInInDexNo <", value, "outtoinindexno");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoLessThanOrEqualTo(Integer value) {
            addCriterion("OutToInInDexNo <=", value, "outtoinindexno");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoIn(List<Integer> values) {
            addCriterion("OutToInInDexNo in", values, "outtoinindexno");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoNotIn(List<Integer> values) {
            addCriterion("OutToInInDexNo not in", values, "outtoinindexno");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoBetween(Integer value1, Integer value2) {
            addCriterion("OutToInInDexNo between", value1, value2, "outtoinindexno");
            return (Criteria) this;
        }

        public Criteria andOuttoinindexnoNotBetween(Integer value1, Integer value2) {
            addCriterion("OutToInInDexNo not between", value1, value2, "outtoinindexno");
            return (Criteria) this;
        }

        public Criteria andCanoutflagIsNull() {
            addCriterion("CanOutFlag is null");
            return (Criteria) this;
        }

        public Criteria andCanoutflagIsNotNull() {
            addCriterion("CanOutFlag is not null");
            return (Criteria) this;
        }

        public Criteria andCanoutflagEqualTo(Boolean value) {
            addCriterion("CanOutFlag =", value, "canoutflag");
            return (Criteria) this;
        }

        public Criteria andCanoutflagNotEqualTo(Boolean value) {
            addCriterion("CanOutFlag <>", value, "canoutflag");
            return (Criteria) this;
        }

        public Criteria andCanoutflagGreaterThan(Boolean value) {
            addCriterion("CanOutFlag >", value, "canoutflag");
            return (Criteria) this;
        }

        public Criteria andCanoutflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CanOutFlag >=", value, "canoutflag");
            return (Criteria) this;
        }

        public Criteria andCanoutflagLessThan(Boolean value) {
            addCriterion("CanOutFlag <", value, "canoutflag");
            return (Criteria) this;
        }

        public Criteria andCanoutflagLessThanOrEqualTo(Boolean value) {
            addCriterion("CanOutFlag <=", value, "canoutflag");
            return (Criteria) this;
        }

        public Criteria andCanoutflagIn(List<Boolean> values) {
            addCriterion("CanOutFlag in", values, "canoutflag");
            return (Criteria) this;
        }

        public Criteria andCanoutflagNotIn(List<Boolean> values) {
            addCriterion("CanOutFlag not in", values, "canoutflag");
            return (Criteria) this;
        }

        public Criteria andCanoutflagBetween(Boolean value1, Boolean value2) {
            addCriterion("CanOutFlag between", value1, value2, "canoutflag");
            return (Criteria) this;
        }

        public Criteria andCanoutflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CanOutFlag not between", value1, value2, "canoutflag");
            return (Criteria) this;
        }

        public Criteria andCustaddressIsNull() {
            addCriterion("CustAddress is null");
            return (Criteria) this;
        }

        public Criteria andCustaddressIsNotNull() {
            addCriterion("CustAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCustaddressEqualTo(String value) {
            addCriterion("CustAddress =", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotEqualTo(String value) {
            addCriterion("CustAddress <>", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressGreaterThan(String value) {
            addCriterion("CustAddress >", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressGreaterThanOrEqualTo(String value) {
            addCriterion("CustAddress >=", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLessThan(String value) {
            addCriterion("CustAddress <", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLessThanOrEqualTo(String value) {
            addCriterion("CustAddress <=", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressLike(String value) {
            addCriterion("CustAddress like", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotLike(String value) {
            addCriterion("CustAddress not like", value, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressIn(List<String> values) {
            addCriterion("CustAddress in", values, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotIn(List<String> values) {
            addCriterion("CustAddress not in", values, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressBetween(String value1, String value2) {
            addCriterion("CustAddress between", value1, value2, "custaddress");
            return (Criteria) this;
        }

        public Criteria andCustaddressNotBetween(String value1, String value2) {
            addCriterion("CustAddress not between", value1, value2, "custaddress");
            return (Criteria) this;
        }

        public Criteria andLastneedramountIsNull() {
            addCriterion("LastNeedRAmount is null");
            return (Criteria) this;
        }

        public Criteria andLastneedramountIsNotNull() {
            addCriterion("LastNeedRAmount is not null");
            return (Criteria) this;
        }

        public Criteria andLastneedramountEqualTo(BigDecimal value) {
            addCriterion("LastNeedRAmount =", value, "lastneedramount");
            return (Criteria) this;
        }

        public Criteria andLastneedramountNotEqualTo(BigDecimal value) {
            addCriterion("LastNeedRAmount <>", value, "lastneedramount");
            return (Criteria) this;
        }

        public Criteria andLastneedramountGreaterThan(BigDecimal value) {
            addCriterion("LastNeedRAmount >", value, "lastneedramount");
            return (Criteria) this;
        }

        public Criteria andLastneedramountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LastNeedRAmount >=", value, "lastneedramount");
            return (Criteria) this;
        }

        public Criteria andLastneedramountLessThan(BigDecimal value) {
            addCriterion("LastNeedRAmount <", value, "lastneedramount");
            return (Criteria) this;
        }

        public Criteria andLastneedramountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LastNeedRAmount <=", value, "lastneedramount");
            return (Criteria) this;
        }

        public Criteria andLastneedramountIn(List<BigDecimal> values) {
            addCriterion("LastNeedRAmount in", values, "lastneedramount");
            return (Criteria) this;
        }

        public Criteria andLastneedramountNotIn(List<BigDecimal> values) {
            addCriterion("LastNeedRAmount not in", values, "lastneedramount");
            return (Criteria) this;
        }

        public Criteria andLastneedramountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LastNeedRAmount between", value1, value2, "lastneedramount");
            return (Criteria) this;
        }

        public Criteria andLastneedramountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LastNeedRAmount not between", value1, value2, "lastneedramount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}