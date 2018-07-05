package pos.model;

import java.util.ArrayList;
import java.util.List;

public class SizegroupsizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SizegroupsizeExample() {
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

        public Criteria andSizegroupidIsNull() {
            addCriterion("SizeGroupID is null");
            return (Criteria) this;
        }

        public Criteria andSizegroupidIsNotNull() {
            addCriterion("SizeGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andSizegroupidEqualTo(String value) {
            addCriterion("SizeGroupID =", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidNotEqualTo(String value) {
            addCriterion("SizeGroupID <>", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidGreaterThan(String value) {
            addCriterion("SizeGroupID >", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidGreaterThanOrEqualTo(String value) {
            addCriterion("SizeGroupID >=", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidLessThan(String value) {
            addCriterion("SizeGroupID <", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidLessThanOrEqualTo(String value) {
            addCriterion("SizeGroupID <=", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidLike(String value) {
            addCriterion("SizeGroupID like", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidNotLike(String value) {
            addCriterion("SizeGroupID not like", value, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidIn(List<String> values) {
            addCriterion("SizeGroupID in", values, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidNotIn(List<String> values) {
            addCriterion("SizeGroupID not in", values, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidBetween(String value1, String value2) {
            addCriterion("SizeGroupID between", value1, value2, "sizegroupid");
            return (Criteria) this;
        }

        public Criteria andSizegroupidNotBetween(String value1, String value2) {
            addCriterion("SizeGroupID not between", value1, value2, "sizegroupid");
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

        public Criteria andNoIsNull() {
            addCriterion("No is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("No is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("No =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("No <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("No >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("No >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("No <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("No <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("No in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("No not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("No between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
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