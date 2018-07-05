package pos.model;

import java.util.ArrayList;
import java.util.List;

public class ColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColorExample() {
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

        public Criteria andStopflagIsNull() {
            addCriterion("StopFlag is null");
            return (Criteria) this;
        }

        public Criteria andStopflagIsNotNull() {
            addCriterion("StopFlag is not null");
            return (Criteria) this;
        }

        public Criteria andStopflagEqualTo(Boolean value) {
            addCriterion("StopFlag =", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagNotEqualTo(Boolean value) {
            addCriterion("StopFlag <>", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagGreaterThan(Boolean value) {
            addCriterion("StopFlag >", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("StopFlag >=", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagLessThan(Boolean value) {
            addCriterion("StopFlag <", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagLessThanOrEqualTo(Boolean value) {
            addCriterion("StopFlag <=", value, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagIn(List<Boolean> values) {
            addCriterion("StopFlag in", values, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagNotIn(List<Boolean> values) {
            addCriterion("StopFlag not in", values, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagBetween(Boolean value1, Boolean value2) {
            addCriterion("StopFlag between", value1, value2, "stopflag");
            return (Criteria) this;
        }

        public Criteria andStopflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("StopFlag not between", value1, value2, "stopflag");
            return (Criteria) this;
        }

        public Criteria andColorEshopIsNull() {
            addCriterion("Color_EShop is null");
            return (Criteria) this;
        }

        public Criteria andColorEshopIsNotNull() {
            addCriterion("Color_EShop is not null");
            return (Criteria) this;
        }

        public Criteria andColorEshopEqualTo(String value) {
            addCriterion("Color_EShop =", value, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andColorEshopNotEqualTo(String value) {
            addCriterion("Color_EShop <>", value, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andColorEshopGreaterThan(String value) {
            addCriterion("Color_EShop >", value, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andColorEshopGreaterThanOrEqualTo(String value) {
            addCriterion("Color_EShop >=", value, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andColorEshopLessThan(String value) {
            addCriterion("Color_EShop <", value, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andColorEshopLessThanOrEqualTo(String value) {
            addCriterion("Color_EShop <=", value, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andColorEshopLike(String value) {
            addCriterion("Color_EShop like", value, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andColorEshopNotLike(String value) {
            addCriterion("Color_EShop not like", value, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andColorEshopIn(List<String> values) {
            addCriterion("Color_EShop in", values, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andColorEshopNotIn(List<String> values) {
            addCriterion("Color_EShop not in", values, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andColorEshopBetween(String value1, String value2) {
            addCriterion("Color_EShop between", value1, value2, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andColorEshopNotBetween(String value1, String value2) {
            addCriterion("Color_EShop not between", value1, value2, "colorEshop");
            return (Criteria) this;
        }

        public Criteria andHelpcodeIsNull() {
            addCriterion("HelpCode is null");
            return (Criteria) this;
        }

        public Criteria andHelpcodeIsNotNull() {
            addCriterion("HelpCode is not null");
            return (Criteria) this;
        }

        public Criteria andHelpcodeEqualTo(String value) {
            addCriterion("HelpCode =", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeNotEqualTo(String value) {
            addCriterion("HelpCode <>", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeGreaterThan(String value) {
            addCriterion("HelpCode >", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("HelpCode >=", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeLessThan(String value) {
            addCriterion("HelpCode <", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeLessThanOrEqualTo(String value) {
            addCriterion("HelpCode <=", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeLike(String value) {
            addCriterion("HelpCode like", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeNotLike(String value) {
            addCriterion("HelpCode not like", value, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeIn(List<String> values) {
            addCriterion("HelpCode in", values, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeNotIn(List<String> values) {
            addCriterion("HelpCode not in", values, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeBetween(String value1, String value2) {
            addCriterion("HelpCode between", value1, value2, "helpcode");
            return (Criteria) this;
        }

        public Criteria andHelpcodeNotBetween(String value1, String value2) {
            addCriterion("HelpCode not between", value1, value2, "helpcode");
            return (Criteria) this;
        }

        public Criteria andWyCodeIsNull() {
            addCriterion("wy_code is null");
            return (Criteria) this;
        }

        public Criteria andWyCodeIsNotNull() {
            addCriterion("wy_code is not null");
            return (Criteria) this;
        }

        public Criteria andWyCodeEqualTo(String value) {
            addCriterion("wy_code =", value, "wyCode");
            return (Criteria) this;
        }

        public Criteria andWyCodeNotEqualTo(String value) {
            addCriterion("wy_code <>", value, "wyCode");
            return (Criteria) this;
        }

        public Criteria andWyCodeGreaterThan(String value) {
            addCriterion("wy_code >", value, "wyCode");
            return (Criteria) this;
        }

        public Criteria andWyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("wy_code >=", value, "wyCode");
            return (Criteria) this;
        }

        public Criteria andWyCodeLessThan(String value) {
            addCriterion("wy_code <", value, "wyCode");
            return (Criteria) this;
        }

        public Criteria andWyCodeLessThanOrEqualTo(String value) {
            addCriterion("wy_code <=", value, "wyCode");
            return (Criteria) this;
        }

        public Criteria andWyCodeLike(String value) {
            addCriterion("wy_code like", value, "wyCode");
            return (Criteria) this;
        }

        public Criteria andWyCodeNotLike(String value) {
            addCriterion("wy_code not like", value, "wyCode");
            return (Criteria) this;
        }

        public Criteria andWyCodeIn(List<String> values) {
            addCriterion("wy_code in", values, "wyCode");
            return (Criteria) this;
        }

        public Criteria andWyCodeNotIn(List<String> values) {
            addCriterion("wy_code not in", values, "wyCode");
            return (Criteria) this;
        }

        public Criteria andWyCodeBetween(String value1, String value2) {
            addCriterion("wy_code between", value1, value2, "wyCode");
            return (Criteria) this;
        }

        public Criteria andWyCodeNotBetween(String value1, String value2) {
            addCriterion("wy_code not between", value1, value2, "wyCode");
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