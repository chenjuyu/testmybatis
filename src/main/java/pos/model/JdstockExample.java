package pos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JdstockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JdstockExample() {
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

        public Criteria andJddeptnoIsNull() {
            addCriterion("jddeptNo is null");
            return (Criteria) this;
        }

        public Criteria andJddeptnoIsNotNull() {
            addCriterion("jddeptNo is not null");
            return (Criteria) this;
        }

        public Criteria andJddeptnoEqualTo(String value) {
            addCriterion("jddeptNo =", value, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andJddeptnoNotEqualTo(String value) {
            addCriterion("jddeptNo <>", value, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andJddeptnoGreaterThan(String value) {
            addCriterion("jddeptNo >", value, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andJddeptnoGreaterThanOrEqualTo(String value) {
            addCriterion("jddeptNo >=", value, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andJddeptnoLessThan(String value) {
            addCriterion("jddeptNo <", value, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andJddeptnoLessThanOrEqualTo(String value) {
            addCriterion("jddeptNo <=", value, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andJddeptnoLike(String value) {
            addCriterion("jddeptNo like", value, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andJddeptnoNotLike(String value) {
            addCriterion("jddeptNo not like", value, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andJddeptnoIn(List<String> values) {
            addCriterion("jddeptNo in", values, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andJddeptnoNotIn(List<String> values) {
            addCriterion("jddeptNo not in", values, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andJddeptnoBetween(String value1, String value2) {
            addCriterion("jddeptNo between", value1, value2, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andJddeptnoNotBetween(String value1, String value2) {
            addCriterion("jddeptNo not between", value1, value2, "jddeptno");
            return (Criteria) this;
        }

        public Criteria andPoordernoIsNull() {
            addCriterion("poOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andPoordernoIsNotNull() {
            addCriterion("poOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andPoordernoEqualTo(String value) {
            addCriterion("poOrderNo =", value, "poorderno");
            return (Criteria) this;
        }

        public Criteria andPoordernoNotEqualTo(String value) {
            addCriterion("poOrderNo <>", value, "poorderno");
            return (Criteria) this;
        }

        public Criteria andPoordernoGreaterThan(String value) {
            addCriterion("poOrderNo >", value, "poorderno");
            return (Criteria) this;
        }

        public Criteria andPoordernoGreaterThanOrEqualTo(String value) {
            addCriterion("poOrderNo >=", value, "poorderno");
            return (Criteria) this;
        }

        public Criteria andPoordernoLessThan(String value) {
            addCriterion("poOrderNo <", value, "poorderno");
            return (Criteria) this;
        }

        public Criteria andPoordernoLessThanOrEqualTo(String value) {
            addCriterion("poOrderNo <=", value, "poorderno");
            return (Criteria) this;
        }

        public Criteria andPoordernoLike(String value) {
            addCriterion("poOrderNo like", value, "poorderno");
            return (Criteria) this;
        }

        public Criteria andPoordernoNotLike(String value) {
            addCriterion("poOrderNo not like", value, "poorderno");
            return (Criteria) this;
        }

        public Criteria andPoordernoIn(List<String> values) {
            addCriterion("poOrderNo in", values, "poorderno");
            return (Criteria) this;
        }

        public Criteria andPoordernoNotIn(List<String> values) {
            addCriterion("poOrderNo not in", values, "poorderno");
            return (Criteria) this;
        }

        public Criteria andPoordernoBetween(String value1, String value2) {
            addCriterion("poOrderNo between", value1, value2, "poorderno");
            return (Criteria) this;
        }

        public Criteria andPoordernoNotBetween(String value1, String value2) {
            addCriterion("poOrderNo not between", value1, value2, "poorderno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIsNull() {
            addCriterion("GoodsNo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIsNotNull() {
            addCriterion("GoodsNo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnoEqualTo(String value) {
            addCriterion("GoodsNo =", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotEqualTo(String value) {
            addCriterion("GoodsNo <>", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoGreaterThan(String value) {
            addCriterion("GoodsNo >", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsNo >=", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLessThan(String value) {
            addCriterion("GoodsNo <", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLessThanOrEqualTo(String value) {
            addCriterion("GoodsNo <=", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLike(String value) {
            addCriterion("GoodsNo like", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotLike(String value) {
            addCriterion("GoodsNo not like", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIn(List<String> values) {
            addCriterion("GoodsNo in", values, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotIn(List<String> values) {
            addCriterion("GoodsNo not in", values, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoBetween(String value1, String value2) {
            addCriterion("GoodsNo between", value1, value2, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotBetween(String value1, String value2) {
            addCriterion("GoodsNo not between", value1, value2, "goodsno");
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