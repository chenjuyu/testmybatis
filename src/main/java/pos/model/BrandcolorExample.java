package pos.model;

import java.util.ArrayList;
import java.util.List;

public class BrandcolorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandcolorExample() {
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

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andUserflagIsNull() {
            addCriterion("UserFlag is null");
            return (Criteria) this;
        }

        public Criteria andUserflagIsNotNull() {
            addCriterion("UserFlag is not null");
            return (Criteria) this;
        }

        public Criteria andUserflagEqualTo(Boolean value) {
            addCriterion("UserFlag =", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagNotEqualTo(Boolean value) {
            addCriterion("UserFlag <>", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagGreaterThan(Boolean value) {
            addCriterion("UserFlag >", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("UserFlag >=", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagLessThan(Boolean value) {
            addCriterion("UserFlag <", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagLessThanOrEqualTo(Boolean value) {
            addCriterion("UserFlag <=", value, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagIn(List<Boolean> values) {
            addCriterion("UserFlag in", values, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagNotIn(List<Boolean> values) {
            addCriterion("UserFlag not in", values, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagBetween(Boolean value1, Boolean value2) {
            addCriterion("UserFlag between", value1, value2, "userflag");
            return (Criteria) this;
        }

        public Criteria andUserflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("UserFlag not between", value1, value2, "userflag");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeIsNull() {
            addCriterion("SupplierColorCode is null");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeIsNotNull() {
            addCriterion("SupplierColorCode is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeEqualTo(String value) {
            addCriterion("SupplierColorCode =", value, "suppliercolorcode");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeNotEqualTo(String value) {
            addCriterion("SupplierColorCode <>", value, "suppliercolorcode");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeGreaterThan(String value) {
            addCriterion("SupplierColorCode >", value, "suppliercolorcode");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierColorCode >=", value, "suppliercolorcode");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeLessThan(String value) {
            addCriterion("SupplierColorCode <", value, "suppliercolorcode");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeLessThanOrEqualTo(String value) {
            addCriterion("SupplierColorCode <=", value, "suppliercolorcode");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeLike(String value) {
            addCriterion("SupplierColorCode like", value, "suppliercolorcode");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeNotLike(String value) {
            addCriterion("SupplierColorCode not like", value, "suppliercolorcode");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeIn(List<String> values) {
            addCriterion("SupplierColorCode in", values, "suppliercolorcode");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeNotIn(List<String> values) {
            addCriterion("SupplierColorCode not in", values, "suppliercolorcode");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeBetween(String value1, String value2) {
            addCriterion("SupplierColorCode between", value1, value2, "suppliercolorcode");
            return (Criteria) this;
        }

        public Criteria andSuppliercolorcodeNotBetween(String value1, String value2) {
            addCriterion("SupplierColorCode not between", value1, value2, "suppliercolorcode");
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