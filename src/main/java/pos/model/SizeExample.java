package pos.model;

import java.util.ArrayList;
import java.util.List;

public class SizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SizeExample() {
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

        public Criteria andSizeIsNull() {
            addCriterion("Size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("Size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("Size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("Size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("Size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("Size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("Size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("Size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("Size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("Size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("Size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("Size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("Size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("Size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andOtherflagIsNull() {
            addCriterion("OtherFlag is null");
            return (Criteria) this;
        }

        public Criteria andOtherflagIsNotNull() {
            addCriterion("OtherFlag is not null");
            return (Criteria) this;
        }

        public Criteria andOtherflagEqualTo(Boolean value) {
            addCriterion("OtherFlag =", value, "otherflag");
            return (Criteria) this;
        }

        public Criteria andOtherflagNotEqualTo(Boolean value) {
            addCriterion("OtherFlag <>", value, "otherflag");
            return (Criteria) this;
        }

        public Criteria andOtherflagGreaterThan(Boolean value) {
            addCriterion("OtherFlag >", value, "otherflag");
            return (Criteria) this;
        }

        public Criteria andOtherflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("OtherFlag >=", value, "otherflag");
            return (Criteria) this;
        }

        public Criteria andOtherflagLessThan(Boolean value) {
            addCriterion("OtherFlag <", value, "otherflag");
            return (Criteria) this;
        }

        public Criteria andOtherflagLessThanOrEqualTo(Boolean value) {
            addCriterion("OtherFlag <=", value, "otherflag");
            return (Criteria) this;
        }

        public Criteria andOtherflagIn(List<Boolean> values) {
            addCriterion("OtherFlag in", values, "otherflag");
            return (Criteria) this;
        }

        public Criteria andOtherflagNotIn(List<Boolean> values) {
            addCriterion("OtherFlag not in", values, "otherflag");
            return (Criteria) this;
        }

        public Criteria andOtherflagBetween(Boolean value1, Boolean value2) {
            addCriterion("OtherFlag between", value1, value2, "otherflag");
            return (Criteria) this;
        }

        public Criteria andOtherflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("OtherFlag not between", value1, value2, "otherflag");
            return (Criteria) this;
        }

        public Criteria andUseflagIsNull() {
            addCriterion("UseFlag is null");
            return (Criteria) this;
        }

        public Criteria andUseflagIsNotNull() {
            addCriterion("UseFlag is not null");
            return (Criteria) this;
        }

        public Criteria andUseflagEqualTo(Boolean value) {
            addCriterion("UseFlag =", value, "useflag");
            return (Criteria) this;
        }

        public Criteria andUseflagNotEqualTo(Boolean value) {
            addCriterion("UseFlag <>", value, "useflag");
            return (Criteria) this;
        }

        public Criteria andUseflagGreaterThan(Boolean value) {
            addCriterion("UseFlag >", value, "useflag");
            return (Criteria) this;
        }

        public Criteria andUseflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("UseFlag >=", value, "useflag");
            return (Criteria) this;
        }

        public Criteria andUseflagLessThan(Boolean value) {
            addCriterion("UseFlag <", value, "useflag");
            return (Criteria) this;
        }

        public Criteria andUseflagLessThanOrEqualTo(Boolean value) {
            addCriterion("UseFlag <=", value, "useflag");
            return (Criteria) this;
        }

        public Criteria andUseflagIn(List<Boolean> values) {
            addCriterion("UseFlag in", values, "useflag");
            return (Criteria) this;
        }

        public Criteria andUseflagNotIn(List<Boolean> values) {
            addCriterion("UseFlag not in", values, "useflag");
            return (Criteria) this;
        }

        public Criteria andUseflagBetween(Boolean value1, Boolean value2) {
            addCriterion("UseFlag between", value1, value2, "useflag");
            return (Criteria) this;
        }

        public Criteria andUseflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("UseFlag not between", value1, value2, "useflag");
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

        public Criteria andUkIsNull() {
            addCriterion("UK is null");
            return (Criteria) this;
        }

        public Criteria andUkIsNotNull() {
            addCriterion("UK is not null");
            return (Criteria) this;
        }

        public Criteria andUkEqualTo(String value) {
            addCriterion("UK =", value, "uk");
            return (Criteria) this;
        }

        public Criteria andUkNotEqualTo(String value) {
            addCriterion("UK <>", value, "uk");
            return (Criteria) this;
        }

        public Criteria andUkGreaterThan(String value) {
            addCriterion("UK >", value, "uk");
            return (Criteria) this;
        }

        public Criteria andUkGreaterThanOrEqualTo(String value) {
            addCriterion("UK >=", value, "uk");
            return (Criteria) this;
        }

        public Criteria andUkLessThan(String value) {
            addCriterion("UK <", value, "uk");
            return (Criteria) this;
        }

        public Criteria andUkLessThanOrEqualTo(String value) {
            addCriterion("UK <=", value, "uk");
            return (Criteria) this;
        }

        public Criteria andUkLike(String value) {
            addCriterion("UK like", value, "uk");
            return (Criteria) this;
        }

        public Criteria andUkNotLike(String value) {
            addCriterion("UK not like", value, "uk");
            return (Criteria) this;
        }

        public Criteria andUkIn(List<String> values) {
            addCriterion("UK in", values, "uk");
            return (Criteria) this;
        }

        public Criteria andUkNotIn(List<String> values) {
            addCriterion("UK not in", values, "uk");
            return (Criteria) this;
        }

        public Criteria andUkBetween(String value1, String value2) {
            addCriterion("UK between", value1, value2, "uk");
            return (Criteria) this;
        }

        public Criteria andUkNotBetween(String value1, String value2) {
            addCriterion("UK not between", value1, value2, "uk");
            return (Criteria) this;
        }

        public Criteria andUsaIsNull() {
            addCriterion("USA is null");
            return (Criteria) this;
        }

        public Criteria andUsaIsNotNull() {
            addCriterion("USA is not null");
            return (Criteria) this;
        }

        public Criteria andUsaEqualTo(String value) {
            addCriterion("USA =", value, "usa");
            return (Criteria) this;
        }

        public Criteria andUsaNotEqualTo(String value) {
            addCriterion("USA <>", value, "usa");
            return (Criteria) this;
        }

        public Criteria andUsaGreaterThan(String value) {
            addCriterion("USA >", value, "usa");
            return (Criteria) this;
        }

        public Criteria andUsaGreaterThanOrEqualTo(String value) {
            addCriterion("USA >=", value, "usa");
            return (Criteria) this;
        }

        public Criteria andUsaLessThan(String value) {
            addCriterion("USA <", value, "usa");
            return (Criteria) this;
        }

        public Criteria andUsaLessThanOrEqualTo(String value) {
            addCriterion("USA <=", value, "usa");
            return (Criteria) this;
        }

        public Criteria andUsaLike(String value) {
            addCriterion("USA like", value, "usa");
            return (Criteria) this;
        }

        public Criteria andUsaNotLike(String value) {
            addCriterion("USA not like", value, "usa");
            return (Criteria) this;
        }

        public Criteria andUsaIn(List<String> values) {
            addCriterion("USA in", values, "usa");
            return (Criteria) this;
        }

        public Criteria andUsaNotIn(List<String> values) {
            addCriterion("USA not in", values, "usa");
            return (Criteria) this;
        }

        public Criteria andUsaBetween(String value1, String value2) {
            addCriterion("USA between", value1, value2, "usa");
            return (Criteria) this;
        }

        public Criteria andUsaNotBetween(String value1, String value2) {
            addCriterion("USA not between", value1, value2, "usa");
            return (Criteria) this;
        }

        public Criteria andSizeEshopIsNull() {
            addCriterion("Size_EShop is null");
            return (Criteria) this;
        }

        public Criteria andSizeEshopIsNotNull() {
            addCriterion("Size_EShop is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEshopEqualTo(String value) {
            addCriterion("Size_EShop =", value, "sizeEshop");
            return (Criteria) this;
        }

        public Criteria andSizeEshopNotEqualTo(String value) {
            addCriterion("Size_EShop <>", value, "sizeEshop");
            return (Criteria) this;
        }

        public Criteria andSizeEshopGreaterThan(String value) {
            addCriterion("Size_EShop >", value, "sizeEshop");
            return (Criteria) this;
        }

        public Criteria andSizeEshopGreaterThanOrEqualTo(String value) {
            addCriterion("Size_EShop >=", value, "sizeEshop");
            return (Criteria) this;
        }

        public Criteria andSizeEshopLessThan(String value) {
            addCriterion("Size_EShop <", value, "sizeEshop");
            return (Criteria) this;
        }

        public Criteria andSizeEshopLessThanOrEqualTo(String value) {
            addCriterion("Size_EShop <=", value, "sizeEshop");
            return (Criteria) this;
        }

        public Criteria andSizeEshopLike(String value) {
            addCriterion("Size_EShop like", value, "sizeEshop");
            return (Criteria) this;
        }

        public Criteria andSizeEshopNotLike(String value) {
            addCriterion("Size_EShop not like", value, "sizeEshop");
            return (Criteria) this;
        }

        public Criteria andSizeEshopIn(List<String> values) {
            addCriterion("Size_EShop in", values, "sizeEshop");
            return (Criteria) this;
        }

        public Criteria andSizeEshopNotIn(List<String> values) {
            addCriterion("Size_EShop not in", values, "sizeEshop");
            return (Criteria) this;
        }

        public Criteria andSizeEshopBetween(String value1, String value2) {
            addCriterion("Size_EShop between", value1, value2, "sizeEshop");
            return (Criteria) this;
        }

        public Criteria andSizeEshopNotBetween(String value1, String value2) {
            addCriterion("Size_EShop not between", value1, value2, "sizeEshop");
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