package pos.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StockdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockdetailExample() {
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

        public Criteria andGoodsidIsNull() {
            addCriterion("GoodsID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("GoodsID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(String value) {
            addCriterion("GoodsID =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(String value) {
            addCriterion("GoodsID <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(String value) {
            addCriterion("GoodsID >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsID >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(String value) {
            addCriterion("GoodsID <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(String value) {
            addCriterion("GoodsID <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLike(String value) {
            addCriterion("GoodsID like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotLike(String value) {
            addCriterion("GoodsID not like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<String> values) {
            addCriterion("GoodsID in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<String> values) {
            addCriterion("GoodsID not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(String value1, String value2) {
            addCriterion("GoodsID between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(String value1, String value2) {
            addCriterion("GoodsID not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andColoridIsNull() {
            addCriterion("ColorID is null");
            return (Criteria) this;
        }

        public Criteria andColoridIsNotNull() {
            addCriterion("ColorID is not null");
            return (Criteria) this;
        }

        public Criteria andColoridEqualTo(String value) {
            addCriterion("ColorID =", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotEqualTo(String value) {
            addCriterion("ColorID <>", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThan(String value) {
            addCriterion("ColorID >", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridGreaterThanOrEqualTo(String value) {
            addCriterion("ColorID >=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThan(String value) {
            addCriterion("ColorID <", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLessThanOrEqualTo(String value) {
            addCriterion("ColorID <=", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridLike(String value) {
            addCriterion("ColorID like", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotLike(String value) {
            addCriterion("ColorID not like", value, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridIn(List<String> values) {
            addCriterion("ColorID in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotIn(List<String> values) {
            addCriterion("ColorID not in", values, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridBetween(String value1, String value2) {
            addCriterion("ColorID between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andColoridNotBetween(String value1, String value2) {
            addCriterion("ColorID not between", value1, value2, "colorid");
            return (Criteria) this;
        }

        public Criteria andSizeidIsNull() {
            addCriterion("SizeID is null");
            return (Criteria) this;
        }

        public Criteria andSizeidIsNotNull() {
            addCriterion("SizeID is not null");
            return (Criteria) this;
        }

        public Criteria andSizeidEqualTo(String value) {
            addCriterion("SizeID =", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotEqualTo(String value) {
            addCriterion("SizeID <>", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidGreaterThan(String value) {
            addCriterion("SizeID >", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidGreaterThanOrEqualTo(String value) {
            addCriterion("SizeID >=", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLessThan(String value) {
            addCriterion("SizeID <", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLessThanOrEqualTo(String value) {
            addCriterion("SizeID <=", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidLike(String value) {
            addCriterion("SizeID like", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotLike(String value) {
            addCriterion("SizeID not like", value, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidIn(List<String> values) {
            addCriterion("SizeID in", values, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotIn(List<String> values) {
            addCriterion("SizeID not in", values, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidBetween(String value1, String value2) {
            addCriterion("SizeID between", value1, value2, "sizeid");
            return (Criteria) this;
        }

        public Criteria andSizeidNotBetween(String value1, String value2) {
            addCriterion("SizeID not between", value1, value2, "sizeid");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("UnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("UnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(BigDecimal value) {
            addCriterion("UnitPrice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(BigDecimal value) {
            addCriterion("UnitPrice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(BigDecimal value) {
            addCriterion("UnitPrice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UnitPrice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(BigDecimal value) {
            addCriterion("UnitPrice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UnitPrice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<BigDecimal> values) {
            addCriterion("UnitPrice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<BigDecimal> values) {
            addCriterion("UnitPrice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UnitPrice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UnitPrice not between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("Amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("Amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("Amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("Amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("Amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("Amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("Amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("Amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNull() {
            addCriterion("BatchNo is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("BatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(String value) {
            addCriterion("BatchNo =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(String value) {
            addCriterion("BatchNo <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(String value) {
            addCriterion("BatchNo >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("BatchNo >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(String value) {
            addCriterion("BatchNo <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(String value) {
            addCriterion("BatchNo <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLike(String value) {
            addCriterion("BatchNo like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotLike(String value) {
            addCriterion("BatchNo not like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<String> values) {
            addCriterion("BatchNo in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<String> values) {
            addCriterion("BatchNo not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(String value1, String value2) {
            addCriterion("BatchNo between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(String value1, String value2) {
            addCriterion("BatchNo not between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceIsNull() {
            addCriterion("BatchBalance is null");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceIsNotNull() {
            addCriterion("BatchBalance is not null");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceEqualTo(String value) {
            addCriterion("BatchBalance =", value, "batchbalance");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceNotEqualTo(String value) {
            addCriterion("BatchBalance <>", value, "batchbalance");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceGreaterThan(String value) {
            addCriterion("BatchBalance >", value, "batchbalance");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("BatchBalance >=", value, "batchbalance");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceLessThan(String value) {
            addCriterion("BatchBalance <", value, "batchbalance");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceLessThanOrEqualTo(String value) {
            addCriterion("BatchBalance <=", value, "batchbalance");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceLike(String value) {
            addCriterion("BatchBalance like", value, "batchbalance");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceNotLike(String value) {
            addCriterion("BatchBalance not like", value, "batchbalance");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceIn(List<String> values) {
            addCriterion("BatchBalance in", values, "batchbalance");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceNotIn(List<String> values) {
            addCriterion("BatchBalance not in", values, "batchbalance");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceBetween(String value1, String value2) {
            addCriterion("BatchBalance between", value1, value2, "batchbalance");
            return (Criteria) this;
        }

        public Criteria andBatchbalanceNotBetween(String value1, String value2) {
            addCriterion("BatchBalance not between", value1, value2, "batchbalance");
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