package pos.model;

import java.util.ArrayList;
import java.util.List;

public class JdgoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JdgoodsExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBarcodesIsNull() {
            addCriterion("barcodes is null");
            return (Criteria) this;
        }

        public Criteria andBarcodesIsNotNull() {
            addCriterion("barcodes is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodesEqualTo(String value) {
            addCriterion("barcodes =", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesNotEqualTo(String value) {
            addCriterion("barcodes <>", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesGreaterThan(String value) {
            addCriterion("barcodes >", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesGreaterThanOrEqualTo(String value) {
            addCriterion("barcodes >=", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesLessThan(String value) {
            addCriterion("barcodes <", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesLessThanOrEqualTo(String value) {
            addCriterion("barcodes <=", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesLike(String value) {
            addCriterion("barcodes like", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesNotLike(String value) {
            addCriterion("barcodes not like", value, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesIn(List<String> values) {
            addCriterion("barcodes in", values, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesNotIn(List<String> values) {
            addCriterion("barcodes not in", values, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesBetween(String value1, String value2) {
            addCriterion("barcodes between", value1, value2, "barcodes");
            return (Criteria) this;
        }

        public Criteria andBarcodesNotBetween(String value1, String value2) {
            addCriterion("barcodes not between", value1, value2, "barcodes");
            return (Criteria) this;
        }

        public Criteria andDeptnoIsNull() {
            addCriterion("deptNo is null");
            return (Criteria) this;
        }

        public Criteria andDeptnoIsNotNull() {
            addCriterion("deptNo is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnoEqualTo(String value) {
            addCriterion("deptNo =", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoNotEqualTo(String value) {
            addCriterion("deptNo <>", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoGreaterThan(String value) {
            addCriterion("deptNo >", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoGreaterThanOrEqualTo(String value) {
            addCriterion("deptNo >=", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoLessThan(String value) {
            addCriterion("deptNo <", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoLessThanOrEqualTo(String value) {
            addCriterion("deptNo <=", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoLike(String value) {
            addCriterion("deptNo like", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoNotLike(String value) {
            addCriterion("deptNo not like", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoIn(List<String> values) {
            addCriterion("deptNo in", values, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoNotIn(List<String> values) {
            addCriterion("deptNo not in", values, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoBetween(String value1, String value2) {
            addCriterion("deptNo between", value1, value2, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoNotBetween(String value1, String value2) {
            addCriterion("deptNo not between", value1, value2, "deptno");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andSafedaysIsNull() {
            addCriterion("safeDays is null");
            return (Criteria) this;
        }

        public Criteria andSafedaysIsNotNull() {
            addCriterion("safeDays is not null");
            return (Criteria) this;
        }

        public Criteria andSafedaysEqualTo(Integer value) {
            addCriterion("safeDays =", value, "safedays");
            return (Criteria) this;
        }

        public Criteria andSafedaysNotEqualTo(Integer value) {
            addCriterion("safeDays <>", value, "safedays");
            return (Criteria) this;
        }

        public Criteria andSafedaysGreaterThan(Integer value) {
            addCriterion("safeDays >", value, "safedays");
            return (Criteria) this;
        }

        public Criteria andSafedaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("safeDays >=", value, "safedays");
            return (Criteria) this;
        }

        public Criteria andSafedaysLessThan(Integer value) {
            addCriterion("safeDays <", value, "safedays");
            return (Criteria) this;
        }

        public Criteria andSafedaysLessThanOrEqualTo(Integer value) {
            addCriterion("safeDays <=", value, "safedays");
            return (Criteria) this;
        }

        public Criteria andSafedaysIn(List<Integer> values) {
            addCriterion("safeDays in", values, "safedays");
            return (Criteria) this;
        }

        public Criteria andSafedaysNotIn(List<Integer> values) {
            addCriterion("safeDays not in", values, "safedays");
            return (Criteria) this;
        }

        public Criteria andSafedaysBetween(Integer value1, Integer value2) {
            addCriterion("safeDays between", value1, value2, "safedays");
            return (Criteria) this;
        }

        public Criteria andSafedaysNotBetween(Integer value1, Integer value2) {
            addCriterion("safeDays not between", value1, value2, "safedays");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoIsNull() {
            addCriterion("thirdCategoryNo is null");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoIsNotNull() {
            addCriterion("thirdCategoryNo is not null");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoEqualTo(String value) {
            addCriterion("thirdCategoryNo =", value, "thirdcategoryno");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoNotEqualTo(String value) {
            addCriterion("thirdCategoryNo <>", value, "thirdcategoryno");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoGreaterThan(String value) {
            addCriterion("thirdCategoryNo >", value, "thirdcategoryno");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoGreaterThanOrEqualTo(String value) {
            addCriterion("thirdCategoryNo >=", value, "thirdcategoryno");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoLessThan(String value) {
            addCriterion("thirdCategoryNo <", value, "thirdcategoryno");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoLessThanOrEqualTo(String value) {
            addCriterion("thirdCategoryNo <=", value, "thirdcategoryno");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoLike(String value) {
            addCriterion("thirdCategoryNo like", value, "thirdcategoryno");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoNotLike(String value) {
            addCriterion("thirdCategoryNo not like", value, "thirdcategoryno");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoIn(List<String> values) {
            addCriterion("thirdCategoryNo in", values, "thirdcategoryno");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoNotIn(List<String> values) {
            addCriterion("thirdCategoryNo not in", values, "thirdcategoryno");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoBetween(String value1, String value2) {
            addCriterion("thirdCategoryNo between", value1, value2, "thirdcategoryno");
            return (Criteria) this;
        }

        public Criteria andThirdcategorynoNotBetween(String value1, String value2) {
            addCriterion("thirdCategoryNo not between", value1, value2, "thirdcategoryno");
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