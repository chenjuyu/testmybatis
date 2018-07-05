package pos.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodstypeidIsNull() {
            addCriterion("GoodsTypeID is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIsNotNull() {
            addCriterion("GoodsTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidEqualTo(String value) {
            addCriterion("GoodsTypeID =", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotEqualTo(String value) {
            addCriterion("GoodsTypeID <>", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidGreaterThan(String value) {
            addCriterion("GoodsTypeID >", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsTypeID >=", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLessThan(String value) {
            addCriterion("GoodsTypeID <", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLessThanOrEqualTo(String value) {
            addCriterion("GoodsTypeID <=", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLike(String value) {
            addCriterion("GoodsTypeID like", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotLike(String value) {
            addCriterion("GoodsTypeID not like", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIn(List<String> values) {
            addCriterion("GoodsTypeID in", values, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotIn(List<String> values) {
            addCriterion("GoodsTypeID not in", values, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidBetween(String value1, String value2) {
            addCriterion("GoodsTypeID between", value1, value2, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotBetween(String value1, String value2) {
            addCriterion("GoodsTypeID not between", value1, value2, "goodstypeid");
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

        public Criteria andOldcodeIsNull() {
            addCriterion("OldCode is null");
            return (Criteria) this;
        }

        public Criteria andOldcodeIsNotNull() {
            addCriterion("OldCode is not null");
            return (Criteria) this;
        }

        public Criteria andOldcodeEqualTo(String value) {
            addCriterion("OldCode =", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeNotEqualTo(String value) {
            addCriterion("OldCode <>", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeGreaterThan(String value) {
            addCriterion("OldCode >", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OldCode >=", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeLessThan(String value) {
            addCriterion("OldCode <", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeLessThanOrEqualTo(String value) {
            addCriterion("OldCode <=", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeLike(String value) {
            addCriterion("OldCode like", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeNotLike(String value) {
            addCriterion("OldCode not like", value, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeIn(List<String> values) {
            addCriterion("OldCode in", values, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeNotIn(List<String> values) {
            addCriterion("OldCode not in", values, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeBetween(String value1, String value2) {
            addCriterion("OldCode between", value1, value2, "oldcode");
            return (Criteria) this;
        }

        public Criteria andOldcodeNotBetween(String value1, String value2) {
            addCriterion("OldCode not between", value1, value2, "oldcode");
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

        public Criteria andEnameIsNull() {
            addCriterion("EName is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("EName is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("EName =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("EName <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("EName >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("EName >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("EName <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("EName <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("EName like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("EName not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("EName in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("EName not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("EName between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("EName not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andOthernameIsNull() {
            addCriterion("OtherName is null");
            return (Criteria) this;
        }

        public Criteria andOthernameIsNotNull() {
            addCriterion("OtherName is not null");
            return (Criteria) this;
        }

        public Criteria andOthernameEqualTo(String value) {
            addCriterion("OtherName =", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameNotEqualTo(String value) {
            addCriterion("OtherName <>", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameGreaterThan(String value) {
            addCriterion("OtherName >", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameGreaterThanOrEqualTo(String value) {
            addCriterion("OtherName >=", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameLessThan(String value) {
            addCriterion("OtherName <", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameLessThanOrEqualTo(String value) {
            addCriterion("OtherName <=", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameLike(String value) {
            addCriterion("OtherName like", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameNotLike(String value) {
            addCriterion("OtherName not like", value, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameIn(List<String> values) {
            addCriterion("OtherName in", values, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameNotIn(List<String> values) {
            addCriterion("OtherName not in", values, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameBetween(String value1, String value2) {
            addCriterion("OtherName between", value1, value2, "othername");
            return (Criteria) this;
        }

        public Criteria andOthernameNotBetween(String value1, String value2) {
            addCriterion("OtherName not between", value1, value2, "othername");
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

        public Criteria andAgeIsNull() {
            addCriterion("Age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("Age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("Age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("Age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("Age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("Age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("Age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("Age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("Age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("Age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("Age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("Age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("Age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("Age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNull() {
            addCriterion("Season is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNotNull() {
            addCriterion("Season is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonEqualTo(String value) {
            addCriterion("Season =", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotEqualTo(String value) {
            addCriterion("Season <>", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThan(String value) {
            addCriterion("Season >", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("Season >=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThan(String value) {
            addCriterion("Season <", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThanOrEqualTo(String value) {
            addCriterion("Season <=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLike(String value) {
            addCriterion("Season like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotLike(String value) {
            addCriterion("Season not like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonIn(List<String> values) {
            addCriterion("Season in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotIn(List<String> values) {
            addCriterion("Season not in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonBetween(String value1, String value2) {
            addCriterion("Season between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotBetween(String value1, String value2) {
            addCriterion("Season not between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("Model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("Model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("Model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("Model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("Model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("Model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("Model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("Model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("Model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("Model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("Model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("Model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("Model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("Model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andBrandserialidIsNull() {
            addCriterion("BrandSerialID is null");
            return (Criteria) this;
        }

        public Criteria andBrandserialidIsNotNull() {
            addCriterion("BrandSerialID is not null");
            return (Criteria) this;
        }

        public Criteria andBrandserialidEqualTo(String value) {
            addCriterion("BrandSerialID =", value, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andBrandserialidNotEqualTo(String value) {
            addCriterion("BrandSerialID <>", value, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andBrandserialidGreaterThan(String value) {
            addCriterion("BrandSerialID >", value, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andBrandserialidGreaterThanOrEqualTo(String value) {
            addCriterion("BrandSerialID >=", value, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andBrandserialidLessThan(String value) {
            addCriterion("BrandSerialID <", value, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andBrandserialidLessThanOrEqualTo(String value) {
            addCriterion("BrandSerialID <=", value, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andBrandserialidLike(String value) {
            addCriterion("BrandSerialID like", value, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andBrandserialidNotLike(String value) {
            addCriterion("BrandSerialID not like", value, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andBrandserialidIn(List<String> values) {
            addCriterion("BrandSerialID in", values, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andBrandserialidNotIn(List<String> values) {
            addCriterion("BrandSerialID not in", values, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andBrandserialidBetween(String value1, String value2) {
            addCriterion("BrandSerialID between", value1, value2, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andBrandserialidNotBetween(String value1, String value2) {
            addCriterion("BrandSerialID not between", value1, value2, "brandserialid");
            return (Criteria) this;
        }

        public Criteria andKindIsNull() {
            addCriterion("Kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("Kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(String value) {
            addCriterion("Kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(String value) {
            addCriterion("Kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(String value) {
            addCriterion("Kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(String value) {
            addCriterion("Kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(String value) {
            addCriterion("Kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(String value) {
            addCriterion("Kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLike(String value) {
            addCriterion("Kind like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotLike(String value) {
            addCriterion("Kind not like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<String> values) {
            addCriterion("Kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<String> values) {
            addCriterion("Kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(String value1, String value2) {
            addCriterion("Kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(String value1, String value2) {
            addCriterion("Kind not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andProducingareaidIsNull() {
            addCriterion("ProducingAreaID is null");
            return (Criteria) this;
        }

        public Criteria andProducingareaidIsNotNull() {
            addCriterion("ProducingAreaID is not null");
            return (Criteria) this;
        }

        public Criteria andProducingareaidEqualTo(String value) {
            addCriterion("ProducingAreaID =", value, "producingareaid");
            return (Criteria) this;
        }

        public Criteria andProducingareaidNotEqualTo(String value) {
            addCriterion("ProducingAreaID <>", value, "producingareaid");
            return (Criteria) this;
        }

        public Criteria andProducingareaidGreaterThan(String value) {
            addCriterion("ProducingAreaID >", value, "producingareaid");
            return (Criteria) this;
        }

        public Criteria andProducingareaidGreaterThanOrEqualTo(String value) {
            addCriterion("ProducingAreaID >=", value, "producingareaid");
            return (Criteria) this;
        }

        public Criteria andProducingareaidLessThan(String value) {
            addCriterion("ProducingAreaID <", value, "producingareaid");
            return (Criteria) this;
        }

        public Criteria andProducingareaidLessThanOrEqualTo(String value) {
            addCriterion("ProducingAreaID <=", value, "producingareaid");
            return (Criteria) this;
        }

        public Criteria andProducingareaidLike(String value) {
            addCriterion("ProducingAreaID like", value, "producingareaid");
            return (Criteria) this;
        }

        public Criteria andProducingareaidNotLike(String value) {
            addCriterion("ProducingAreaID not like", value, "producingareaid");
            return (Criteria) this;
        }

        public Criteria andProducingareaidIn(List<String> values) {
            addCriterion("ProducingAreaID in", values, "producingareaid");
            return (Criteria) this;
        }

        public Criteria andProducingareaidNotIn(List<String> values) {
            addCriterion("ProducingAreaID not in", values, "producingareaid");
            return (Criteria) this;
        }

        public Criteria andProducingareaidBetween(String value1, String value2) {
            addCriterion("ProducingAreaID between", value1, value2, "producingareaid");
            return (Criteria) this;
        }

        public Criteria andProducingareaidNotBetween(String value1, String value2) {
            addCriterion("ProducingAreaID not between", value1, value2, "producingareaid");
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

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andPackunitIsNull() {
            addCriterion("PackUnit is null");
            return (Criteria) this;
        }

        public Criteria andPackunitIsNotNull() {
            addCriterion("PackUnit is not null");
            return (Criteria) this;
        }

        public Criteria andPackunitEqualTo(String value) {
            addCriterion("PackUnit =", value, "packunit");
            return (Criteria) this;
        }

        public Criteria andPackunitNotEqualTo(String value) {
            addCriterion("PackUnit <>", value, "packunit");
            return (Criteria) this;
        }

        public Criteria andPackunitGreaterThan(String value) {
            addCriterion("PackUnit >", value, "packunit");
            return (Criteria) this;
        }

        public Criteria andPackunitGreaterThanOrEqualTo(String value) {
            addCriterion("PackUnit >=", value, "packunit");
            return (Criteria) this;
        }

        public Criteria andPackunitLessThan(String value) {
            addCriterion("PackUnit <", value, "packunit");
            return (Criteria) this;
        }

        public Criteria andPackunitLessThanOrEqualTo(String value) {
            addCriterion("PackUnit <=", value, "packunit");
            return (Criteria) this;
        }

        public Criteria andPackunitLike(String value) {
            addCriterion("PackUnit like", value, "packunit");
            return (Criteria) this;
        }

        public Criteria andPackunitNotLike(String value) {
            addCriterion("PackUnit not like", value, "packunit");
            return (Criteria) this;
        }

        public Criteria andPackunitIn(List<String> values) {
            addCriterion("PackUnit in", values, "packunit");
            return (Criteria) this;
        }

        public Criteria andPackunitNotIn(List<String> values) {
            addCriterion("PackUnit not in", values, "packunit");
            return (Criteria) this;
        }

        public Criteria andPackunitBetween(String value1, String value2) {
            addCriterion("PackUnit between", value1, value2, "packunit");
            return (Criteria) this;
        }

        public Criteria andPackunitNotBetween(String value1, String value2) {
            addCriterion("PackUnit not between", value1, value2, "packunit");
            return (Criteria) this;
        }

        public Criteria andPacksizeIsNull() {
            addCriterion("PackSize is null");
            return (Criteria) this;
        }

        public Criteria andPacksizeIsNotNull() {
            addCriterion("PackSize is not null");
            return (Criteria) this;
        }

        public Criteria andPacksizeEqualTo(Integer value) {
            addCriterion("PackSize =", value, "packsize");
            return (Criteria) this;
        }

        public Criteria andPacksizeNotEqualTo(Integer value) {
            addCriterion("PackSize <>", value, "packsize");
            return (Criteria) this;
        }

        public Criteria andPacksizeGreaterThan(Integer value) {
            addCriterion("PackSize >", value, "packsize");
            return (Criteria) this;
        }

        public Criteria andPacksizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PackSize >=", value, "packsize");
            return (Criteria) this;
        }

        public Criteria andPacksizeLessThan(Integer value) {
            addCriterion("PackSize <", value, "packsize");
            return (Criteria) this;
        }

        public Criteria andPacksizeLessThanOrEqualTo(Integer value) {
            addCriterion("PackSize <=", value, "packsize");
            return (Criteria) this;
        }

        public Criteria andPacksizeIn(List<Integer> values) {
            addCriterion("PackSize in", values, "packsize");
            return (Criteria) this;
        }

        public Criteria andPacksizeNotIn(List<Integer> values) {
            addCriterion("PackSize not in", values, "packsize");
            return (Criteria) this;
        }

        public Criteria andPacksizeBetween(Integer value1, Integer value2) {
            addCriterion("PackSize between", value1, value2, "packsize");
            return (Criteria) this;
        }

        public Criteria andPacksizeNotBetween(Integer value1, Integer value2) {
            addCriterion("PackSize not between", value1, value2, "packsize");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
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

        public Criteria andSuppliercodeIsNull() {
            addCriterion("SupplierCode is null");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeIsNotNull() {
            addCriterion("SupplierCode is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeEqualTo(String value) {
            addCriterion("SupplierCode =", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotEqualTo(String value) {
            addCriterion("SupplierCode <>", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeGreaterThan(String value) {
            addCriterion("SupplierCode >", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierCode >=", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLessThan(String value) {
            addCriterion("SupplierCode <", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLessThanOrEqualTo(String value) {
            addCriterion("SupplierCode <=", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeLike(String value) {
            addCriterion("SupplierCode like", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotLike(String value) {
            addCriterion("SupplierCode not like", value, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeIn(List<String> values) {
            addCriterion("SupplierCode in", values, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotIn(List<String> values) {
            addCriterion("SupplierCode not in", values, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeBetween(String value1, String value2) {
            addCriterion("SupplierCode between", value1, value2, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andSuppliercodeNotBetween(String value1, String value2) {
            addCriterion("SupplierCode not between", value1, value2, "suppliercode");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIsNull() {
            addCriterion("PurchasePrice is null");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIsNotNull() {
            addCriterion("PurchasePrice is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice =", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice <>", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceGreaterThan(BigDecimal value) {
            addCriterion("PurchasePrice >", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice >=", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceLessThan(BigDecimal value) {
            addCriterion("PurchasePrice <", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice <=", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIn(List<BigDecimal> values) {
            addCriterion("PurchasePrice in", values, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotIn(List<BigDecimal> values) {
            addCriterion("PurchasePrice not in", values, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchasePrice between", value1, value2, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchasePrice not between", value1, value2, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andSalespointIsNull() {
            addCriterion("SalesPoint is null");
            return (Criteria) this;
        }

        public Criteria andSalespointIsNotNull() {
            addCriterion("SalesPoint is not null");
            return (Criteria) this;
        }

        public Criteria andSalespointEqualTo(BigDecimal value) {
            addCriterion("SalesPoint =", value, "salespoint");
            return (Criteria) this;
        }

        public Criteria andSalespointNotEqualTo(BigDecimal value) {
            addCriterion("SalesPoint <>", value, "salespoint");
            return (Criteria) this;
        }

        public Criteria andSalespointGreaterThan(BigDecimal value) {
            addCriterion("SalesPoint >", value, "salespoint");
            return (Criteria) this;
        }

        public Criteria andSalespointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPoint >=", value, "salespoint");
            return (Criteria) this;
        }

        public Criteria andSalespointLessThan(BigDecimal value) {
            addCriterion("SalesPoint <", value, "salespoint");
            return (Criteria) this;
        }

        public Criteria andSalespointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPoint <=", value, "salespoint");
            return (Criteria) this;
        }

        public Criteria andSalespointIn(List<BigDecimal> values) {
            addCriterion("SalesPoint in", values, "salespoint");
            return (Criteria) this;
        }

        public Criteria andSalespointNotIn(List<BigDecimal> values) {
            addCriterion("SalesPoint not in", values, "salespoint");
            return (Criteria) this;
        }

        public Criteria andSalespointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPoint between", value1, value2, "salespoint");
            return (Criteria) this;
        }

        public Criteria andSalespointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPoint not between", value1, value2, "salespoint");
            return (Criteria) this;
        }

        public Criteria andRetailsalesIsNull() {
            addCriterion("RetailSales is null");
            return (Criteria) this;
        }

        public Criteria andRetailsalesIsNotNull() {
            addCriterion("RetailSales is not null");
            return (Criteria) this;
        }

        public Criteria andRetailsalesEqualTo(BigDecimal value) {
            addCriterion("RetailSales =", value, "retailsales");
            return (Criteria) this;
        }

        public Criteria andRetailsalesNotEqualTo(BigDecimal value) {
            addCriterion("RetailSales <>", value, "retailsales");
            return (Criteria) this;
        }

        public Criteria andRetailsalesGreaterThan(BigDecimal value) {
            addCriterion("RetailSales >", value, "retailsales");
            return (Criteria) this;
        }

        public Criteria andRetailsalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales >=", value, "retailsales");
            return (Criteria) this;
        }

        public Criteria andRetailsalesLessThan(BigDecimal value) {
            addCriterion("RetailSales <", value, "retailsales");
            return (Criteria) this;
        }

        public Criteria andRetailsalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales <=", value, "retailsales");
            return (Criteria) this;
        }

        public Criteria andRetailsalesIn(List<BigDecimal> values) {
            addCriterion("RetailSales in", values, "retailsales");
            return (Criteria) this;
        }

        public Criteria andRetailsalesNotIn(List<BigDecimal> values) {
            addCriterion("RetailSales not in", values, "retailsales");
            return (Criteria) this;
        }

        public Criteria andRetailsalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales between", value1, value2, "retailsales");
            return (Criteria) this;
        }

        public Criteria andRetailsalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales not between", value1, value2, "retailsales");
            return (Criteria) this;
        }

        public Criteria andTradepriceIsNull() {
            addCriterion("TradePrice is null");
            return (Criteria) this;
        }

        public Criteria andTradepriceIsNotNull() {
            addCriterion("TradePrice is not null");
            return (Criteria) this;
        }

        public Criteria andTradepriceEqualTo(BigDecimal value) {
            addCriterion("TradePrice =", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceNotEqualTo(BigDecimal value) {
            addCriterion("TradePrice <>", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceGreaterThan(BigDecimal value) {
            addCriterion("TradePrice >", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TradePrice >=", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceLessThan(BigDecimal value) {
            addCriterion("TradePrice <", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TradePrice <=", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceIn(List<BigDecimal> values) {
            addCriterion("TradePrice in", values, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceNotIn(List<BigDecimal> values) {
            addCriterion("TradePrice not in", values, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TradePrice between", value1, value2, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TradePrice not between", value1, value2, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andSalesprice1IsNull() {
            addCriterion("SalesPrice1 is null");
            return (Criteria) this;
        }

        public Criteria andSalesprice1IsNotNull() {
            addCriterion("SalesPrice1 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesprice1EqualTo(BigDecimal value) {
            addCriterion("SalesPrice1 =", value, "salesprice1");
            return (Criteria) this;
        }

        public Criteria andSalesprice1NotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice1 <>", value, "salesprice1");
            return (Criteria) this;
        }

        public Criteria andSalesprice1GreaterThan(BigDecimal value) {
            addCriterion("SalesPrice1 >", value, "salesprice1");
            return (Criteria) this;
        }

        public Criteria andSalesprice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice1 >=", value, "salesprice1");
            return (Criteria) this;
        }

        public Criteria andSalesprice1LessThan(BigDecimal value) {
            addCriterion("SalesPrice1 <", value, "salesprice1");
            return (Criteria) this;
        }

        public Criteria andSalesprice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice1 <=", value, "salesprice1");
            return (Criteria) this;
        }

        public Criteria andSalesprice1In(List<BigDecimal> values) {
            addCriterion("SalesPrice1 in", values, "salesprice1");
            return (Criteria) this;
        }

        public Criteria andSalesprice1NotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice1 not in", values, "salesprice1");
            return (Criteria) this;
        }

        public Criteria andSalesprice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice1 between", value1, value2, "salesprice1");
            return (Criteria) this;
        }

        public Criteria andSalesprice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice1 not between", value1, value2, "salesprice1");
            return (Criteria) this;
        }

        public Criteria andSalesprice2IsNull() {
            addCriterion("SalesPrice2 is null");
            return (Criteria) this;
        }

        public Criteria andSalesprice2IsNotNull() {
            addCriterion("SalesPrice2 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesprice2EqualTo(BigDecimal value) {
            addCriterion("SalesPrice2 =", value, "salesprice2");
            return (Criteria) this;
        }

        public Criteria andSalesprice2NotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice2 <>", value, "salesprice2");
            return (Criteria) this;
        }

        public Criteria andSalesprice2GreaterThan(BigDecimal value) {
            addCriterion("SalesPrice2 >", value, "salesprice2");
            return (Criteria) this;
        }

        public Criteria andSalesprice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice2 >=", value, "salesprice2");
            return (Criteria) this;
        }

        public Criteria andSalesprice2LessThan(BigDecimal value) {
            addCriterion("SalesPrice2 <", value, "salesprice2");
            return (Criteria) this;
        }

        public Criteria andSalesprice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice2 <=", value, "salesprice2");
            return (Criteria) this;
        }

        public Criteria andSalesprice2In(List<BigDecimal> values) {
            addCriterion("SalesPrice2 in", values, "salesprice2");
            return (Criteria) this;
        }

        public Criteria andSalesprice2NotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice2 not in", values, "salesprice2");
            return (Criteria) this;
        }

        public Criteria andSalesprice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice2 between", value1, value2, "salesprice2");
            return (Criteria) this;
        }

        public Criteria andSalesprice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice2 not between", value1, value2, "salesprice2");
            return (Criteria) this;
        }

        public Criteria andSalesprice3IsNull() {
            addCriterion("SalesPrice3 is null");
            return (Criteria) this;
        }

        public Criteria andSalesprice3IsNotNull() {
            addCriterion("SalesPrice3 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesprice3EqualTo(BigDecimal value) {
            addCriterion("SalesPrice3 =", value, "salesprice3");
            return (Criteria) this;
        }

        public Criteria andSalesprice3NotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice3 <>", value, "salesprice3");
            return (Criteria) this;
        }

        public Criteria andSalesprice3GreaterThan(BigDecimal value) {
            addCriterion("SalesPrice3 >", value, "salesprice3");
            return (Criteria) this;
        }

        public Criteria andSalesprice3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice3 >=", value, "salesprice3");
            return (Criteria) this;
        }

        public Criteria andSalesprice3LessThan(BigDecimal value) {
            addCriterion("SalesPrice3 <", value, "salesprice3");
            return (Criteria) this;
        }

        public Criteria andSalesprice3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice3 <=", value, "salesprice3");
            return (Criteria) this;
        }

        public Criteria andSalesprice3In(List<BigDecimal> values) {
            addCriterion("SalesPrice3 in", values, "salesprice3");
            return (Criteria) this;
        }

        public Criteria andSalesprice3NotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice3 not in", values, "salesprice3");
            return (Criteria) this;
        }

        public Criteria andSalesprice3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice3 between", value1, value2, "salesprice3");
            return (Criteria) this;
        }

        public Criteria andSalesprice3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice3 not between", value1, value2, "salesprice3");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("Discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("Discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("Discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("Discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("Discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("Discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("Discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("Discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andBackflagIsNull() {
            addCriterion("BackFlag is null");
            return (Criteria) this;
        }

        public Criteria andBackflagIsNotNull() {
            addCriterion("BackFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBackflagEqualTo(Boolean value) {
            addCriterion("BackFlag =", value, "backflag");
            return (Criteria) this;
        }

        public Criteria andBackflagNotEqualTo(Boolean value) {
            addCriterion("BackFlag <>", value, "backflag");
            return (Criteria) this;
        }

        public Criteria andBackflagGreaterThan(Boolean value) {
            addCriterion("BackFlag >", value, "backflag");
            return (Criteria) this;
        }

        public Criteria andBackflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("BackFlag >=", value, "backflag");
            return (Criteria) this;
        }

        public Criteria andBackflagLessThan(Boolean value) {
            addCriterion("BackFlag <", value, "backflag");
            return (Criteria) this;
        }

        public Criteria andBackflagLessThanOrEqualTo(Boolean value) {
            addCriterion("BackFlag <=", value, "backflag");
            return (Criteria) this;
        }

        public Criteria andBackflagIn(List<Boolean> values) {
            addCriterion("BackFlag in", values, "backflag");
            return (Criteria) this;
        }

        public Criteria andBackflagNotIn(List<Boolean> values) {
            addCriterion("BackFlag not in", values, "backflag");
            return (Criteria) this;
        }

        public Criteria andBackflagBetween(Boolean value1, Boolean value2) {
            addCriterion("BackFlag between", value1, value2, "backflag");
            return (Criteria) this;
        }

        public Criteria andBackflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("BackFlag not between", value1, value2, "backflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagIsNull() {
            addCriterion("DiscountFlag is null");
            return (Criteria) this;
        }

        public Criteria andDiscountflagIsNotNull() {
            addCriterion("DiscountFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountflagEqualTo(Boolean value) {
            addCriterion("DiscountFlag =", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagNotEqualTo(Boolean value) {
            addCriterion("DiscountFlag <>", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagGreaterThan(Boolean value) {
            addCriterion("DiscountFlag >", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DiscountFlag >=", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagLessThan(Boolean value) {
            addCriterion("DiscountFlag <", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagLessThanOrEqualTo(Boolean value) {
            addCriterion("DiscountFlag <=", value, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagIn(List<Boolean> values) {
            addCriterion("DiscountFlag in", values, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagNotIn(List<Boolean> values) {
            addCriterion("DiscountFlag not in", values, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagBetween(Boolean value1, Boolean value2) {
            addCriterion("DiscountFlag between", value1, value2, "discountflag");
            return (Criteria) this;
        }

        public Criteria andDiscountflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DiscountFlag not between", value1, value2, "discountflag");
            return (Criteria) this;
        }

        public Criteria andSameflagIsNull() {
            addCriterion("SameFlag is null");
            return (Criteria) this;
        }

        public Criteria andSameflagIsNotNull() {
            addCriterion("SameFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSameflagEqualTo(Boolean value) {
            addCriterion("SameFlag =", value, "sameflag");
            return (Criteria) this;
        }

        public Criteria andSameflagNotEqualTo(Boolean value) {
            addCriterion("SameFlag <>", value, "sameflag");
            return (Criteria) this;
        }

        public Criteria andSameflagGreaterThan(Boolean value) {
            addCriterion("SameFlag >", value, "sameflag");
            return (Criteria) this;
        }

        public Criteria andSameflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SameFlag >=", value, "sameflag");
            return (Criteria) this;
        }

        public Criteria andSameflagLessThan(Boolean value) {
            addCriterion("SameFlag <", value, "sameflag");
            return (Criteria) this;
        }

        public Criteria andSameflagLessThanOrEqualTo(Boolean value) {
            addCriterion("SameFlag <=", value, "sameflag");
            return (Criteria) this;
        }

        public Criteria andSameflagIn(List<Boolean> values) {
            addCriterion("SameFlag in", values, "sameflag");
            return (Criteria) this;
        }

        public Criteria andSameflagNotIn(List<Boolean> values) {
            addCriterion("SameFlag not in", values, "sameflag");
            return (Criteria) this;
        }

        public Criteria andSameflagBetween(Boolean value1, Boolean value2) {
            addCriterion("SameFlag between", value1, value2, "sameflag");
            return (Criteria) this;
        }

        public Criteria andSameflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SameFlag not between", value1, value2, "sameflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagIsNull() {
            addCriterion("PresentFlag is null");
            return (Criteria) this;
        }

        public Criteria andPresentflagIsNotNull() {
            addCriterion("PresentFlag is not null");
            return (Criteria) this;
        }

        public Criteria andPresentflagEqualTo(Boolean value) {
            addCriterion("PresentFlag =", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagNotEqualTo(Boolean value) {
            addCriterion("PresentFlag <>", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagGreaterThan(Boolean value) {
            addCriterion("PresentFlag >", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PresentFlag >=", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagLessThan(Boolean value) {
            addCriterion("PresentFlag <", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagLessThanOrEqualTo(Boolean value) {
            addCriterion("PresentFlag <=", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagIn(List<Boolean> values) {
            addCriterion("PresentFlag in", values, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagNotIn(List<Boolean> values) {
            addCriterion("PresentFlag not in", values, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagBetween(Boolean value1, Boolean value2) {
            addCriterion("PresentFlag between", value1, value2, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PresentFlag not between", value1, value2, "presentflag");
            return (Criteria) this;
        }

        public Criteria andCosttypeIsNull() {
            addCriterion("CostType is null");
            return (Criteria) this;
        }

        public Criteria andCosttypeIsNotNull() {
            addCriterion("CostType is not null");
            return (Criteria) this;
        }

        public Criteria andCosttypeEqualTo(String value) {
            addCriterion("CostType =", value, "costtype");
            return (Criteria) this;
        }

        public Criteria andCosttypeNotEqualTo(String value) {
            addCriterion("CostType <>", value, "costtype");
            return (Criteria) this;
        }

        public Criteria andCosttypeGreaterThan(String value) {
            addCriterion("CostType >", value, "costtype");
            return (Criteria) this;
        }

        public Criteria andCosttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CostType >=", value, "costtype");
            return (Criteria) this;
        }

        public Criteria andCosttypeLessThan(String value) {
            addCriterion("CostType <", value, "costtype");
            return (Criteria) this;
        }

        public Criteria andCosttypeLessThanOrEqualTo(String value) {
            addCriterion("CostType <=", value, "costtype");
            return (Criteria) this;
        }

        public Criteria andCosttypeLike(String value) {
            addCriterion("CostType like", value, "costtype");
            return (Criteria) this;
        }

        public Criteria andCosttypeNotLike(String value) {
            addCriterion("CostType not like", value, "costtype");
            return (Criteria) this;
        }

        public Criteria andCosttypeIn(List<String> values) {
            addCriterion("CostType in", values, "costtype");
            return (Criteria) this;
        }

        public Criteria andCosttypeNotIn(List<String> values) {
            addCriterion("CostType not in", values, "costtype");
            return (Criteria) this;
        }

        public Criteria andCosttypeBetween(String value1, String value2) {
            addCriterion("CostType between", value1, value2, "costtype");
            return (Criteria) this;
        }

        public Criteria andCosttypeNotBetween(String value1, String value2) {
            addCriterion("CostType not between", value1, value2, "costtype");
            return (Criteria) this;
        }

        public Criteria andTopstockIsNull() {
            addCriterion("TopStock is null");
            return (Criteria) this;
        }

        public Criteria andTopstockIsNotNull() {
            addCriterion("TopStock is not null");
            return (Criteria) this;
        }

        public Criteria andTopstockEqualTo(Integer value) {
            addCriterion("TopStock =", value, "topstock");
            return (Criteria) this;
        }

        public Criteria andTopstockNotEqualTo(Integer value) {
            addCriterion("TopStock <>", value, "topstock");
            return (Criteria) this;
        }

        public Criteria andTopstockGreaterThan(Integer value) {
            addCriterion("TopStock >", value, "topstock");
            return (Criteria) this;
        }

        public Criteria andTopstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("TopStock >=", value, "topstock");
            return (Criteria) this;
        }

        public Criteria andTopstockLessThan(Integer value) {
            addCriterion("TopStock <", value, "topstock");
            return (Criteria) this;
        }

        public Criteria andTopstockLessThanOrEqualTo(Integer value) {
            addCriterion("TopStock <=", value, "topstock");
            return (Criteria) this;
        }

        public Criteria andTopstockIn(List<Integer> values) {
            addCriterion("TopStock in", values, "topstock");
            return (Criteria) this;
        }

        public Criteria andTopstockNotIn(List<Integer> values) {
            addCriterion("TopStock not in", values, "topstock");
            return (Criteria) this;
        }

        public Criteria andTopstockBetween(Integer value1, Integer value2) {
            addCriterion("TopStock between", value1, value2, "topstock");
            return (Criteria) this;
        }

        public Criteria andTopstockNotBetween(Integer value1, Integer value2) {
            addCriterion("TopStock not between", value1, value2, "topstock");
            return (Criteria) this;
        }

        public Criteria andBottomstockIsNull() {
            addCriterion("BottomStock is null");
            return (Criteria) this;
        }

        public Criteria andBottomstockIsNotNull() {
            addCriterion("BottomStock is not null");
            return (Criteria) this;
        }

        public Criteria andBottomstockEqualTo(Integer value) {
            addCriterion("BottomStock =", value, "bottomstock");
            return (Criteria) this;
        }

        public Criteria andBottomstockNotEqualTo(Integer value) {
            addCriterion("BottomStock <>", value, "bottomstock");
            return (Criteria) this;
        }

        public Criteria andBottomstockGreaterThan(Integer value) {
            addCriterion("BottomStock >", value, "bottomstock");
            return (Criteria) this;
        }

        public Criteria andBottomstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("BottomStock >=", value, "bottomstock");
            return (Criteria) this;
        }

        public Criteria andBottomstockLessThan(Integer value) {
            addCriterion("BottomStock <", value, "bottomstock");
            return (Criteria) this;
        }

        public Criteria andBottomstockLessThanOrEqualTo(Integer value) {
            addCriterion("BottomStock <=", value, "bottomstock");
            return (Criteria) this;
        }

        public Criteria andBottomstockIn(List<Integer> values) {
            addCriterion("BottomStock in", values, "bottomstock");
            return (Criteria) this;
        }

        public Criteria andBottomstockNotIn(List<Integer> values) {
            addCriterion("BottomStock not in", values, "bottomstock");
            return (Criteria) this;
        }

        public Criteria andBottomstockBetween(Integer value1, Integer value2) {
            addCriterion("BottomStock between", value1, value2, "bottomstock");
            return (Criteria) this;
        }

        public Criteria andBottomstockNotBetween(Integer value1, Integer value2) {
            addCriterion("BottomStock not between", value1, value2, "bottomstock");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidIsNull() {
            addCriterion("StockSubjectID is null");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidIsNotNull() {
            addCriterion("StockSubjectID is not null");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidEqualTo(String value) {
            addCriterion("StockSubjectID =", value, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidNotEqualTo(String value) {
            addCriterion("StockSubjectID <>", value, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidGreaterThan(String value) {
            addCriterion("StockSubjectID >", value, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidGreaterThanOrEqualTo(String value) {
            addCriterion("StockSubjectID >=", value, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidLessThan(String value) {
            addCriterion("StockSubjectID <", value, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidLessThanOrEqualTo(String value) {
            addCriterion("StockSubjectID <=", value, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidLike(String value) {
            addCriterion("StockSubjectID like", value, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidNotLike(String value) {
            addCriterion("StockSubjectID not like", value, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidIn(List<String> values) {
            addCriterion("StockSubjectID in", values, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidNotIn(List<String> values) {
            addCriterion("StockSubjectID not in", values, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidBetween(String value1, String value2) {
            addCriterion("StockSubjectID between", value1, value2, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andStocksubjectidNotBetween(String value1, String value2) {
            addCriterion("StockSubjectID not between", value1, value2, "stocksubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidIsNull() {
            addCriterion("SalesSubjectID is null");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidIsNotNull() {
            addCriterion("SalesSubjectID is not null");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidEqualTo(String value) {
            addCriterion("SalesSubjectID =", value, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidNotEqualTo(String value) {
            addCriterion("SalesSubjectID <>", value, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidGreaterThan(String value) {
            addCriterion("SalesSubjectID >", value, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidGreaterThanOrEqualTo(String value) {
            addCriterion("SalesSubjectID >=", value, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidLessThan(String value) {
            addCriterion("SalesSubjectID <", value, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidLessThanOrEqualTo(String value) {
            addCriterion("SalesSubjectID <=", value, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidLike(String value) {
            addCriterion("SalesSubjectID like", value, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidNotLike(String value) {
            addCriterion("SalesSubjectID not like", value, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidIn(List<String> values) {
            addCriterion("SalesSubjectID in", values, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidNotIn(List<String> values) {
            addCriterion("SalesSubjectID not in", values, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidBetween(String value1, String value2) {
            addCriterion("SalesSubjectID between", value1, value2, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andSalessubjectidNotBetween(String value1, String value2) {
            addCriterion("SalesSubjectID not between", value1, value2, "salessubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidIsNull() {
            addCriterion("CostSubjectID is null");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidIsNotNull() {
            addCriterion("CostSubjectID is not null");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidEqualTo(String value) {
            addCriterion("CostSubjectID =", value, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidNotEqualTo(String value) {
            addCriterion("CostSubjectID <>", value, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidGreaterThan(String value) {
            addCriterion("CostSubjectID >", value, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidGreaterThanOrEqualTo(String value) {
            addCriterion("CostSubjectID >=", value, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidLessThan(String value) {
            addCriterion("CostSubjectID <", value, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidLessThanOrEqualTo(String value) {
            addCriterion("CostSubjectID <=", value, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidLike(String value) {
            addCriterion("CostSubjectID like", value, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidNotLike(String value) {
            addCriterion("CostSubjectID not like", value, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidIn(List<String> values) {
            addCriterion("CostSubjectID in", values, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidNotIn(List<String> values) {
            addCriterion("CostSubjectID not in", values, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidBetween(String value1, String value2) {
            addCriterion("CostSubjectID between", value1, value2, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andCostsubjectidNotBetween(String value1, String value2) {
            addCriterion("CostSubjectID not between", value1, value2, "costsubjectid");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNull() {
            addCriterion("BeginDate is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("BeginDate is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(Date value) {
            addCriterion("BeginDate =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(Date value) {
            addCriterion("BeginDate <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(Date value) {
            addCriterion("BeginDate >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("BeginDate >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(Date value) {
            addCriterion("BeginDate <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(Date value) {
            addCriterion("BeginDate <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<Date> values) {
            addCriterion("BeginDate in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<Date> values) {
            addCriterion("BeginDate not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(Date value1, Date value2) {
            addCriterion("BeginDate between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(Date value1, Date value2) {
            addCriterion("BeginDate not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andMadedateIsNull() {
            addCriterion("MadeDate is null");
            return (Criteria) this;
        }

        public Criteria andMadedateIsNotNull() {
            addCriterion("MadeDate is not null");
            return (Criteria) this;
        }

        public Criteria andMadedateEqualTo(Date value) {
            addCriterion("MadeDate =", value, "madedate");
            return (Criteria) this;
        }

        public Criteria andMadedateNotEqualTo(Date value) {
            addCriterion("MadeDate <>", value, "madedate");
            return (Criteria) this;
        }

        public Criteria andMadedateGreaterThan(Date value) {
            addCriterion("MadeDate >", value, "madedate");
            return (Criteria) this;
        }

        public Criteria andMadedateGreaterThanOrEqualTo(Date value) {
            addCriterion("MadeDate >=", value, "madedate");
            return (Criteria) this;
        }

        public Criteria andMadedateLessThan(Date value) {
            addCriterion("MadeDate <", value, "madedate");
            return (Criteria) this;
        }

        public Criteria andMadedateLessThanOrEqualTo(Date value) {
            addCriterion("MadeDate <=", value, "madedate");
            return (Criteria) this;
        }

        public Criteria andMadedateIn(List<Date> values) {
            addCriterion("MadeDate in", values, "madedate");
            return (Criteria) this;
        }

        public Criteria andMadedateNotIn(List<Date> values) {
            addCriterion("MadeDate not in", values, "madedate");
            return (Criteria) this;
        }

        public Criteria andMadedateBetween(Date value1, Date value2) {
            addCriterion("MadeDate between", value1, value2, "madedate");
            return (Criteria) this;
        }

        public Criteria andMadedateNotBetween(Date value1, Date value2) {
            addCriterion("MadeDate not between", value1, value2, "madedate");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("Creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("Creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("Creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("Creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("Creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("Creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("Creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("Creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("Creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("Creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("Creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("Creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("Creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("Creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("ModifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("ModifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("ModifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("ModifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("ModifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("ModifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("ModifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("ModifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("ModifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("ModifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("ModifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andEditorIsNull() {
            addCriterion("Editor is null");
            return (Criteria) this;
        }

        public Criteria andEditorIsNotNull() {
            addCriterion("Editor is not null");
            return (Criteria) this;
        }

        public Criteria andEditorEqualTo(String value) {
            addCriterion("Editor =", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotEqualTo(String value) {
            addCriterion("Editor <>", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThan(String value) {
            addCriterion("Editor >", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThanOrEqualTo(String value) {
            addCriterion("Editor >=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThan(String value) {
            addCriterion("Editor <", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThanOrEqualTo(String value) {
            addCriterion("Editor <=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLike(String value) {
            addCriterion("Editor like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotLike(String value) {
            addCriterion("Editor not like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorIn(List<String> values) {
            addCriterion("Editor in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotIn(List<String> values) {
            addCriterion("Editor not in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorBetween(String value1, String value2) {
            addCriterion("Editor between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotBetween(String value1, String value2) {
            addCriterion("Editor not between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andSalesdateIsNull() {
            addCriterion("SalesDate is null");
            return (Criteria) this;
        }

        public Criteria andSalesdateIsNotNull() {
            addCriterion("SalesDate is not null");
            return (Criteria) this;
        }

        public Criteria andSalesdateEqualTo(Date value) {
            addCriterion("SalesDate =", value, "salesdate");
            return (Criteria) this;
        }

        public Criteria andSalesdateNotEqualTo(Date value) {
            addCriterion("SalesDate <>", value, "salesdate");
            return (Criteria) this;
        }

        public Criteria andSalesdateGreaterThan(Date value) {
            addCriterion("SalesDate >", value, "salesdate");
            return (Criteria) this;
        }

        public Criteria andSalesdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SalesDate >=", value, "salesdate");
            return (Criteria) this;
        }

        public Criteria andSalesdateLessThan(Date value) {
            addCriterion("SalesDate <", value, "salesdate");
            return (Criteria) this;
        }

        public Criteria andSalesdateLessThanOrEqualTo(Date value) {
            addCriterion("SalesDate <=", value, "salesdate");
            return (Criteria) this;
        }

        public Criteria andSalesdateIn(List<Date> values) {
            addCriterion("SalesDate in", values, "salesdate");
            return (Criteria) this;
        }

        public Criteria andSalesdateNotIn(List<Date> values) {
            addCriterion("SalesDate not in", values, "salesdate");
            return (Criteria) this;
        }

        public Criteria andSalesdateBetween(Date value1, Date value2) {
            addCriterion("SalesDate between", value1, value2, "salesdate");
            return (Criteria) this;
        }

        public Criteria andSalesdateNotBetween(Date value1, Date value2) {
            addCriterion("SalesDate not between", value1, value2, "salesdate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateIsNull() {
            addCriterion("PurchasedDate is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateIsNotNull() {
            addCriterion("PurchasedDate is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateEqualTo(Date value) {
            addCriterion("PurchasedDate =", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateNotEqualTo(Date value) {
            addCriterion("PurchasedDate <>", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateGreaterThan(Date value) {
            addCriterion("PurchasedDate >", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateGreaterThanOrEqualTo(Date value) {
            addCriterion("PurchasedDate >=", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateLessThan(Date value) {
            addCriterion("PurchasedDate <", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateLessThanOrEqualTo(Date value) {
            addCriterion("PurchasedDate <=", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateIn(List<Date> values) {
            addCriterion("PurchasedDate in", values, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateNotIn(List<Date> values) {
            addCriterion("PurchasedDate not in", values, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateBetween(Date value1, Date value2) {
            addCriterion("PurchasedDate between", value1, value2, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateNotBetween(Date value1, Date value2) {
            addCriterion("PurchasedDate not between", value1, value2, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateIsNull() {
            addCriterion("LastPurchasedDate is null");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateIsNotNull() {
            addCriterion("LastPurchasedDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateEqualTo(Date value) {
            addCriterion("LastPurchasedDate =", value, "lastpurchaseddate");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateNotEqualTo(Date value) {
            addCriterion("LastPurchasedDate <>", value, "lastpurchaseddate");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateGreaterThan(Date value) {
            addCriterion("LastPurchasedDate >", value, "lastpurchaseddate");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastPurchasedDate >=", value, "lastpurchaseddate");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateLessThan(Date value) {
            addCriterion("LastPurchasedDate <", value, "lastpurchaseddate");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateLessThanOrEqualTo(Date value) {
            addCriterion("LastPurchasedDate <=", value, "lastpurchaseddate");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateIn(List<Date> values) {
            addCriterion("LastPurchasedDate in", values, "lastpurchaseddate");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateNotIn(List<Date> values) {
            addCriterion("LastPurchasedDate not in", values, "lastpurchaseddate");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateBetween(Date value1, Date value2) {
            addCriterion("LastPurchasedDate between", value1, value2, "lastpurchaseddate");
            return (Criteria) this;
        }

        public Criteria andLastpurchaseddateNotBetween(Date value1, Date value2) {
            addCriterion("LastPurchasedDate not between", value1, value2, "lastpurchaseddate");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateIsNull() {
            addCriterion("ExchangeEndDate is null");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateIsNotNull() {
            addCriterion("ExchangeEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateEqualTo(Date value) {
            addCriterion("ExchangeEndDate =", value, "exchangeenddate");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateNotEqualTo(Date value) {
            addCriterion("ExchangeEndDate <>", value, "exchangeenddate");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateGreaterThan(Date value) {
            addCriterion("ExchangeEndDate >", value, "exchangeenddate");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ExchangeEndDate >=", value, "exchangeenddate");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateLessThan(Date value) {
            addCriterion("ExchangeEndDate <", value, "exchangeenddate");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateLessThanOrEqualTo(Date value) {
            addCriterion("ExchangeEndDate <=", value, "exchangeenddate");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateIn(List<Date> values) {
            addCriterion("ExchangeEndDate in", values, "exchangeenddate");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateNotIn(List<Date> values) {
            addCriterion("ExchangeEndDate not in", values, "exchangeenddate");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateBetween(Date value1, Date value2) {
            addCriterion("ExchangeEndDate between", value1, value2, "exchangeenddate");
            return (Criteria) this;
        }

        public Criteria andExchangeenddateNotBetween(Date value1, Date value2) {
            addCriterion("ExchangeEndDate not between", value1, value2, "exchangeenddate");
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

        public Criteria andGoodsbalanceIsNull() {
            addCriterion("GoodsBalance is null");
            return (Criteria) this;
        }

        public Criteria andGoodsbalanceIsNotNull() {
            addCriterion("GoodsBalance is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsbalanceEqualTo(Integer value) {
            addCriterion("GoodsBalance =", value, "goodsbalance");
            return (Criteria) this;
        }

        public Criteria andGoodsbalanceNotEqualTo(Integer value) {
            addCriterion("GoodsBalance <>", value, "goodsbalance");
            return (Criteria) this;
        }

        public Criteria andGoodsbalanceGreaterThan(Integer value) {
            addCriterion("GoodsBalance >", value, "goodsbalance");
            return (Criteria) this;
        }

        public Criteria andGoodsbalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsBalance >=", value, "goodsbalance");
            return (Criteria) this;
        }

        public Criteria andGoodsbalanceLessThan(Integer value) {
            addCriterion("GoodsBalance <", value, "goodsbalance");
            return (Criteria) this;
        }

        public Criteria andGoodsbalanceLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsBalance <=", value, "goodsbalance");
            return (Criteria) this;
        }

        public Criteria andGoodsbalanceIn(List<Integer> values) {
            addCriterion("GoodsBalance in", values, "goodsbalance");
            return (Criteria) this;
        }

        public Criteria andGoodsbalanceNotIn(List<Integer> values) {
            addCriterion("GoodsBalance not in", values, "goodsbalance");
            return (Criteria) this;
        }

        public Criteria andGoodsbalanceBetween(Integer value1, Integer value2) {
            addCriterion("GoodsBalance between", value1, value2, "goodsbalance");
            return (Criteria) this;
        }

        public Criteria andGoodsbalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsBalance not between", value1, value2, "goodsbalance");
            return (Criteria) this;
        }

        public Criteria andMaterialflagIsNull() {
            addCriterion("MaterialFlag is null");
            return (Criteria) this;
        }

        public Criteria andMaterialflagIsNotNull() {
            addCriterion("MaterialFlag is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialflagEqualTo(Boolean value) {
            addCriterion("MaterialFlag =", value, "materialflag");
            return (Criteria) this;
        }

        public Criteria andMaterialflagNotEqualTo(Boolean value) {
            addCriterion("MaterialFlag <>", value, "materialflag");
            return (Criteria) this;
        }

        public Criteria andMaterialflagGreaterThan(Boolean value) {
            addCriterion("MaterialFlag >", value, "materialflag");
            return (Criteria) this;
        }

        public Criteria andMaterialflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("MaterialFlag >=", value, "materialflag");
            return (Criteria) this;
        }

        public Criteria andMaterialflagLessThan(Boolean value) {
            addCriterion("MaterialFlag <", value, "materialflag");
            return (Criteria) this;
        }

        public Criteria andMaterialflagLessThanOrEqualTo(Boolean value) {
            addCriterion("MaterialFlag <=", value, "materialflag");
            return (Criteria) this;
        }

        public Criteria andMaterialflagIn(List<Boolean> values) {
            addCriterion("MaterialFlag in", values, "materialflag");
            return (Criteria) this;
        }

        public Criteria andMaterialflagNotIn(List<Boolean> values) {
            addCriterion("MaterialFlag not in", values, "materialflag");
            return (Criteria) this;
        }

        public Criteria andMaterialflagBetween(Boolean value1, Boolean value2) {
            addCriterion("MaterialFlag between", value1, value2, "materialflag");
            return (Criteria) this;
        }

        public Criteria andMaterialflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("MaterialFlag not between", value1, value2, "materialflag");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitIsNull() {
            addCriterion("BackDateLimit is null");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitIsNotNull() {
            addCriterion("BackDateLimit is not null");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitEqualTo(Integer value) {
            addCriterion("BackDateLimit =", value, "backdatelimit");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitNotEqualTo(Integer value) {
            addCriterion("BackDateLimit <>", value, "backdatelimit");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitGreaterThan(Integer value) {
            addCriterion("BackDateLimit >", value, "backdatelimit");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("BackDateLimit >=", value, "backdatelimit");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitLessThan(Integer value) {
            addCriterion("BackDateLimit <", value, "backdatelimit");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitLessThanOrEqualTo(Integer value) {
            addCriterion("BackDateLimit <=", value, "backdatelimit");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitIn(List<Integer> values) {
            addCriterion("BackDateLimit in", values, "backdatelimit");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitNotIn(List<Integer> values) {
            addCriterion("BackDateLimit not in", values, "backdatelimit");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitBetween(Integer value1, Integer value2) {
            addCriterion("BackDateLimit between", value1, value2, "backdatelimit");
            return (Criteria) this;
        }

        public Criteria andBackdatelimitNotBetween(Integer value1, Integer value2) {
            addCriterion("BackDateLimit not between", value1, value2, "backdatelimit");
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

        public Criteria andCostpriceIsNull() {
            addCriterion("CostPrice is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("CostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(BigDecimal value) {
            addCriterion("CostPrice =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(BigDecimal value) {
            addCriterion("CostPrice <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(BigDecimal value) {
            addCriterion("CostPrice >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CostPrice >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(BigDecimal value) {
            addCriterion("CostPrice <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CostPrice <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<BigDecimal> values) {
            addCriterion("CostPrice in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<BigDecimal> values) {
            addCriterion("CostPrice not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostPrice between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CostPrice not between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andWashtypeIsNull() {
            addCriterion("WashType is null");
            return (Criteria) this;
        }

        public Criteria andWashtypeIsNotNull() {
            addCriterion("WashType is not null");
            return (Criteria) this;
        }

        public Criteria andWashtypeEqualTo(String value) {
            addCriterion("WashType =", value, "washtype");
            return (Criteria) this;
        }

        public Criteria andWashtypeNotEqualTo(String value) {
            addCriterion("WashType <>", value, "washtype");
            return (Criteria) this;
        }

        public Criteria andWashtypeGreaterThan(String value) {
            addCriterion("WashType >", value, "washtype");
            return (Criteria) this;
        }

        public Criteria andWashtypeGreaterThanOrEqualTo(String value) {
            addCriterion("WashType >=", value, "washtype");
            return (Criteria) this;
        }

        public Criteria andWashtypeLessThan(String value) {
            addCriterion("WashType <", value, "washtype");
            return (Criteria) this;
        }

        public Criteria andWashtypeLessThanOrEqualTo(String value) {
            addCriterion("WashType <=", value, "washtype");
            return (Criteria) this;
        }

        public Criteria andWashtypeLike(String value) {
            addCriterion("WashType like", value, "washtype");
            return (Criteria) this;
        }

        public Criteria andWashtypeNotLike(String value) {
            addCriterion("WashType not like", value, "washtype");
            return (Criteria) this;
        }

        public Criteria andWashtypeIn(List<String> values) {
            addCriterion("WashType in", values, "washtype");
            return (Criteria) this;
        }

        public Criteria andWashtypeNotIn(List<String> values) {
            addCriterion("WashType not in", values, "washtype");
            return (Criteria) this;
        }

        public Criteria andWashtypeBetween(String value1, String value2) {
            addCriterion("WashType between", value1, value2, "washtype");
            return (Criteria) this;
        }

        public Criteria andWashtypeNotBetween(String value1, String value2) {
            addCriterion("WashType not between", value1, value2, "washtype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNull() {
            addCriterion("PaymentType is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNotNull() {
            addCriterion("PaymentType is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeEqualTo(String value) {
            addCriterion("PaymentType =", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotEqualTo(String value) {
            addCriterion("PaymentType <>", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThan(String value) {
            addCriterion("PaymentType >", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("PaymentType >=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThan(String value) {
            addCriterion("PaymentType <", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThanOrEqualTo(String value) {
            addCriterion("PaymentType <=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLike(String value) {
            addCriterion("PaymentType like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotLike(String value) {
            addCriterion("PaymentType not like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIn(List<String> values) {
            addCriterion("PaymentType in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotIn(List<String> values) {
            addCriterion("PaymentType not in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeBetween(String value1, String value2) {
            addCriterion("PaymentType between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotBetween(String value1, String value2) {
            addCriterion("PaymentType not between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andHirerateIsNull() {
            addCriterion("HireRate is null");
            return (Criteria) this;
        }

        public Criteria andHirerateIsNotNull() {
            addCriterion("HireRate is not null");
            return (Criteria) this;
        }

        public Criteria andHirerateEqualTo(BigDecimal value) {
            addCriterion("HireRate =", value, "hirerate");
            return (Criteria) this;
        }

        public Criteria andHirerateNotEqualTo(BigDecimal value) {
            addCriterion("HireRate <>", value, "hirerate");
            return (Criteria) this;
        }

        public Criteria andHirerateGreaterThan(BigDecimal value) {
            addCriterion("HireRate >", value, "hirerate");
            return (Criteria) this;
        }

        public Criteria andHirerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HireRate >=", value, "hirerate");
            return (Criteria) this;
        }

        public Criteria andHirerateLessThan(BigDecimal value) {
            addCriterion("HireRate <", value, "hirerate");
            return (Criteria) this;
        }

        public Criteria andHirerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HireRate <=", value, "hirerate");
            return (Criteria) this;
        }

        public Criteria andHirerateIn(List<BigDecimal> values) {
            addCriterion("HireRate in", values, "hirerate");
            return (Criteria) this;
        }

        public Criteria andHirerateNotIn(List<BigDecimal> values) {
            addCriterion("HireRate not in", values, "hirerate");
            return (Criteria) this;
        }

        public Criteria andHirerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HireRate between", value1, value2, "hirerate");
            return (Criteria) this;
        }

        public Criteria andHirerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HireRate not between", value1, value2, "hirerate");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagIsNull() {
            addCriterion("SpecialPriceFlag is null");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagIsNotNull() {
            addCriterion("SpecialPriceFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagEqualTo(Boolean value) {
            addCriterion("SpecialPriceFlag =", value, "specialpriceflag");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagNotEqualTo(Boolean value) {
            addCriterion("SpecialPriceFlag <>", value, "specialpriceflag");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagGreaterThan(Boolean value) {
            addCriterion("SpecialPriceFlag >", value, "specialpriceflag");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SpecialPriceFlag >=", value, "specialpriceflag");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagLessThan(Boolean value) {
            addCriterion("SpecialPriceFlag <", value, "specialpriceflag");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagLessThanOrEqualTo(Boolean value) {
            addCriterion("SpecialPriceFlag <=", value, "specialpriceflag");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagIn(List<Boolean> values) {
            addCriterion("SpecialPriceFlag in", values, "specialpriceflag");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagNotIn(List<Boolean> values) {
            addCriterion("SpecialPriceFlag not in", values, "specialpriceflag");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagBetween(Boolean value1, Boolean value2) {
            addCriterion("SpecialPriceFlag between", value1, value2, "specialpriceflag");
            return (Criteria) this;
        }

        public Criteria andSpecialpriceflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SpecialPriceFlag not between", value1, value2, "specialpriceflag");
            return (Criteria) this;
        }

        public Criteria andPricetypeIsNull() {
            addCriterion("PriceType is null");
            return (Criteria) this;
        }

        public Criteria andPricetypeIsNotNull() {
            addCriterion("PriceType is not null");
            return (Criteria) this;
        }

        public Criteria andPricetypeEqualTo(String value) {
            addCriterion("PriceType =", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotEqualTo(String value) {
            addCriterion("PriceType <>", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThan(String value) {
            addCriterion("PriceType >", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThanOrEqualTo(String value) {
            addCriterion("PriceType >=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThan(String value) {
            addCriterion("PriceType <", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThanOrEqualTo(String value) {
            addCriterion("PriceType <=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLike(String value) {
            addCriterion("PriceType like", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotLike(String value) {
            addCriterion("PriceType not like", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeIn(List<String> values) {
            addCriterion("PriceType in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotIn(List<String> values) {
            addCriterion("PriceType not in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeBetween(String value1, String value2) {
            addCriterion("PriceType between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotBetween(String value1, String value2) {
            addCriterion("PriceType not between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPriceintIsNull() {
            addCriterion("PriceInt is null");
            return (Criteria) this;
        }

        public Criteria andPriceintIsNotNull() {
            addCriterion("PriceInt is not null");
            return (Criteria) this;
        }

        public Criteria andPriceintEqualTo(Integer value) {
            addCriterion("PriceInt =", value, "priceint");
            return (Criteria) this;
        }

        public Criteria andPriceintNotEqualTo(Integer value) {
            addCriterion("PriceInt <>", value, "priceint");
            return (Criteria) this;
        }

        public Criteria andPriceintGreaterThan(Integer value) {
            addCriterion("PriceInt >", value, "priceint");
            return (Criteria) this;
        }

        public Criteria andPriceintGreaterThanOrEqualTo(Integer value) {
            addCriterion("PriceInt >=", value, "priceint");
            return (Criteria) this;
        }

        public Criteria andPriceintLessThan(Integer value) {
            addCriterion("PriceInt <", value, "priceint");
            return (Criteria) this;
        }

        public Criteria andPriceintLessThanOrEqualTo(Integer value) {
            addCriterion("PriceInt <=", value, "priceint");
            return (Criteria) this;
        }

        public Criteria andPriceintIn(List<Integer> values) {
            addCriterion("PriceInt in", values, "priceint");
            return (Criteria) this;
        }

        public Criteria andPriceintNotIn(List<Integer> values) {
            addCriterion("PriceInt not in", values, "priceint");
            return (Criteria) this;
        }

        public Criteria andPriceintBetween(Integer value1, Integer value2) {
            addCriterion("PriceInt between", value1, value2, "priceint");
            return (Criteria) this;
        }

        public Criteria andPriceintNotBetween(Integer value1, Integer value2) {
            addCriterion("PriceInt not between", value1, value2, "priceint");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyIsNull() {
            addCriterion("OrderTargetQty is null");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyIsNotNull() {
            addCriterion("OrderTargetQty is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyEqualTo(Integer value) {
            addCriterion("OrderTargetQty =", value, "ordertargetqty");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyNotEqualTo(Integer value) {
            addCriterion("OrderTargetQty <>", value, "ordertargetqty");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyGreaterThan(Integer value) {
            addCriterion("OrderTargetQty >", value, "ordertargetqty");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderTargetQty >=", value, "ordertargetqty");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyLessThan(Integer value) {
            addCriterion("OrderTargetQty <", value, "ordertargetqty");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyLessThanOrEqualTo(Integer value) {
            addCriterion("OrderTargetQty <=", value, "ordertargetqty");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyIn(List<Integer> values) {
            addCriterion("OrderTargetQty in", values, "ordertargetqty");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyNotIn(List<Integer> values) {
            addCriterion("OrderTargetQty not in", values, "ordertargetqty");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyBetween(Integer value1, Integer value2) {
            addCriterion("OrderTargetQty between", value1, value2, "ordertargetqty");
            return (Criteria) this;
        }

        public Criteria andOrdertargetqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderTargetQty not between", value1, value2, "ordertargetqty");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantIsNull() {
            addCriterion("OrderTargetAnt is null");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantIsNotNull() {
            addCriterion("OrderTargetAnt is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantEqualTo(BigDecimal value) {
            addCriterion("OrderTargetAnt =", value, "ordertargetant");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantNotEqualTo(BigDecimal value) {
            addCriterion("OrderTargetAnt <>", value, "ordertargetant");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantGreaterThan(BigDecimal value) {
            addCriterion("OrderTargetAnt >", value, "ordertargetant");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderTargetAnt >=", value, "ordertargetant");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantLessThan(BigDecimal value) {
            addCriterion("OrderTargetAnt <", value, "ordertargetant");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OrderTargetAnt <=", value, "ordertargetant");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantIn(List<BigDecimal> values) {
            addCriterion("OrderTargetAnt in", values, "ordertargetant");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantNotIn(List<BigDecimal> values) {
            addCriterion("OrderTargetAnt not in", values, "ordertargetant");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderTargetAnt between", value1, value2, "ordertargetant");
            return (Criteria) this;
        }

        public Criteria andOrdertargetantNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OrderTargetAnt not between", value1, value2, "ordertargetant");
            return (Criteria) this;
        }

        public Criteria andGroupnoIsNull() {
            addCriterion("GroupNo is null");
            return (Criteria) this;
        }

        public Criteria andGroupnoIsNotNull() {
            addCriterion("GroupNo is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnoEqualTo(String value) {
            addCriterion("GroupNo =", value, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupnoNotEqualTo(String value) {
            addCriterion("GroupNo <>", value, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupnoGreaterThan(String value) {
            addCriterion("GroupNo >", value, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupnoGreaterThanOrEqualTo(String value) {
            addCriterion("GroupNo >=", value, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupnoLessThan(String value) {
            addCriterion("GroupNo <", value, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupnoLessThanOrEqualTo(String value) {
            addCriterion("GroupNo <=", value, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupnoLike(String value) {
            addCriterion("GroupNo like", value, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupnoNotLike(String value) {
            addCriterion("GroupNo not like", value, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupnoIn(List<String> values) {
            addCriterion("GroupNo in", values, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupnoNotIn(List<String> values) {
            addCriterion("GroupNo not in", values, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupnoBetween(String value1, String value2) {
            addCriterion("GroupNo between", value1, value2, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupnoNotBetween(String value1, String value2) {
            addCriterion("GroupNo not between", value1, value2, "groupno");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("GroupID is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("GroupID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("GroupID =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("GroupID <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("GroupID >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("GroupID >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("GroupID <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("GroupID <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("GroupID like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("GroupID not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("GroupID in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("GroupID not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("GroupID between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("GroupID not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andSalesprice4IsNull() {
            addCriterion("SalesPrice4 is null");
            return (Criteria) this;
        }

        public Criteria andSalesprice4IsNotNull() {
            addCriterion("SalesPrice4 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesprice4EqualTo(BigDecimal value) {
            addCriterion("SalesPrice4 =", value, "salesprice4");
            return (Criteria) this;
        }

        public Criteria andSalesprice4NotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice4 <>", value, "salesprice4");
            return (Criteria) this;
        }

        public Criteria andSalesprice4GreaterThan(BigDecimal value) {
            addCriterion("SalesPrice4 >", value, "salesprice4");
            return (Criteria) this;
        }

        public Criteria andSalesprice4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice4 >=", value, "salesprice4");
            return (Criteria) this;
        }

        public Criteria andSalesprice4LessThan(BigDecimal value) {
            addCriterion("SalesPrice4 <", value, "salesprice4");
            return (Criteria) this;
        }

        public Criteria andSalesprice4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice4 <=", value, "salesprice4");
            return (Criteria) this;
        }

        public Criteria andSalesprice4In(List<BigDecimal> values) {
            addCriterion("SalesPrice4 in", values, "salesprice4");
            return (Criteria) this;
        }

        public Criteria andSalesprice4NotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice4 not in", values, "salesprice4");
            return (Criteria) this;
        }

        public Criteria andSalesprice4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice4 between", value1, value2, "salesprice4");
            return (Criteria) this;
        }

        public Criteria andSalesprice4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice4 not between", value1, value2, "salesprice4");
            return (Criteria) this;
        }

        public Criteria andSalesprice5IsNull() {
            addCriterion("SalesPrice5 is null");
            return (Criteria) this;
        }

        public Criteria andSalesprice5IsNotNull() {
            addCriterion("SalesPrice5 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesprice5EqualTo(BigDecimal value) {
            addCriterion("SalesPrice5 =", value, "salesprice5");
            return (Criteria) this;
        }

        public Criteria andSalesprice5NotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice5 <>", value, "salesprice5");
            return (Criteria) this;
        }

        public Criteria andSalesprice5GreaterThan(BigDecimal value) {
            addCriterion("SalesPrice5 >", value, "salesprice5");
            return (Criteria) this;
        }

        public Criteria andSalesprice5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice5 >=", value, "salesprice5");
            return (Criteria) this;
        }

        public Criteria andSalesprice5LessThan(BigDecimal value) {
            addCriterion("SalesPrice5 <", value, "salesprice5");
            return (Criteria) this;
        }

        public Criteria andSalesprice5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice5 <=", value, "salesprice5");
            return (Criteria) this;
        }

        public Criteria andSalesprice5In(List<BigDecimal> values) {
            addCriterion("SalesPrice5 in", values, "salesprice5");
            return (Criteria) this;
        }

        public Criteria andSalesprice5NotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice5 not in", values, "salesprice5");
            return (Criteria) this;
        }

        public Criteria andSalesprice5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice5 between", value1, value2, "salesprice5");
            return (Criteria) this;
        }

        public Criteria andSalesprice5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice5 not between", value1, value2, "salesprice5");
            return (Criteria) this;
        }

        public Criteria andSalesprice6IsNull() {
            addCriterion("SalesPrice6 is null");
            return (Criteria) this;
        }

        public Criteria andSalesprice6IsNotNull() {
            addCriterion("SalesPrice6 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesprice6EqualTo(BigDecimal value) {
            addCriterion("SalesPrice6 =", value, "salesprice6");
            return (Criteria) this;
        }

        public Criteria andSalesprice6NotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice6 <>", value, "salesprice6");
            return (Criteria) this;
        }

        public Criteria andSalesprice6GreaterThan(BigDecimal value) {
            addCriterion("SalesPrice6 >", value, "salesprice6");
            return (Criteria) this;
        }

        public Criteria andSalesprice6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice6 >=", value, "salesprice6");
            return (Criteria) this;
        }

        public Criteria andSalesprice6LessThan(BigDecimal value) {
            addCriterion("SalesPrice6 <", value, "salesprice6");
            return (Criteria) this;
        }

        public Criteria andSalesprice6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice6 <=", value, "salesprice6");
            return (Criteria) this;
        }

        public Criteria andSalesprice6In(List<BigDecimal> values) {
            addCriterion("SalesPrice6 in", values, "salesprice6");
            return (Criteria) this;
        }

        public Criteria andSalesprice6NotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice6 not in", values, "salesprice6");
            return (Criteria) this;
        }

        public Criteria andSalesprice6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice6 between", value1, value2, "salesprice6");
            return (Criteria) this;
        }

        public Criteria andSalesprice6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice6 not between", value1, value2, "salesprice6");
            return (Criteria) this;
        }

        public Criteria andSalesprice7IsNull() {
            addCriterion("SalesPrice7 is null");
            return (Criteria) this;
        }

        public Criteria andSalesprice7IsNotNull() {
            addCriterion("SalesPrice7 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesprice7EqualTo(BigDecimal value) {
            addCriterion("SalesPrice7 =", value, "salesprice7");
            return (Criteria) this;
        }

        public Criteria andSalesprice7NotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice7 <>", value, "salesprice7");
            return (Criteria) this;
        }

        public Criteria andSalesprice7GreaterThan(BigDecimal value) {
            addCriterion("SalesPrice7 >", value, "salesprice7");
            return (Criteria) this;
        }

        public Criteria andSalesprice7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice7 >=", value, "salesprice7");
            return (Criteria) this;
        }

        public Criteria andSalesprice7LessThan(BigDecimal value) {
            addCriterion("SalesPrice7 <", value, "salesprice7");
            return (Criteria) this;
        }

        public Criteria andSalesprice7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice7 <=", value, "salesprice7");
            return (Criteria) this;
        }

        public Criteria andSalesprice7In(List<BigDecimal> values) {
            addCriterion("SalesPrice7 in", values, "salesprice7");
            return (Criteria) this;
        }

        public Criteria andSalesprice7NotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice7 not in", values, "salesprice7");
            return (Criteria) this;
        }

        public Criteria andSalesprice7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice7 between", value1, value2, "salesprice7");
            return (Criteria) this;
        }

        public Criteria andSalesprice7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice7 not between", value1, value2, "salesprice7");
            return (Criteria) this;
        }

        public Criteria andSalesprice8IsNull() {
            addCriterion("SalesPrice8 is null");
            return (Criteria) this;
        }

        public Criteria andSalesprice8IsNotNull() {
            addCriterion("SalesPrice8 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesprice8EqualTo(BigDecimal value) {
            addCriterion("SalesPrice8 =", value, "salesprice8");
            return (Criteria) this;
        }

        public Criteria andSalesprice8NotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice8 <>", value, "salesprice8");
            return (Criteria) this;
        }

        public Criteria andSalesprice8GreaterThan(BigDecimal value) {
            addCriterion("SalesPrice8 >", value, "salesprice8");
            return (Criteria) this;
        }

        public Criteria andSalesprice8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice8 >=", value, "salesprice8");
            return (Criteria) this;
        }

        public Criteria andSalesprice8LessThan(BigDecimal value) {
            addCriterion("SalesPrice8 <", value, "salesprice8");
            return (Criteria) this;
        }

        public Criteria andSalesprice8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice8 <=", value, "salesprice8");
            return (Criteria) this;
        }

        public Criteria andSalesprice8In(List<BigDecimal> values) {
            addCriterion("SalesPrice8 in", values, "salesprice8");
            return (Criteria) this;
        }

        public Criteria andSalesprice8NotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice8 not in", values, "salesprice8");
            return (Criteria) this;
        }

        public Criteria andSalesprice8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice8 between", value1, value2, "salesprice8");
            return (Criteria) this;
        }

        public Criteria andSalesprice8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice8 not between", value1, value2, "salesprice8");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("VIPPrice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("VIPPrice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(BigDecimal value) {
            addCriterion("VIPPrice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(BigDecimal value) {
            addCriterion("VIPPrice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(BigDecimal value) {
            addCriterion("VIPPrice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VIPPrice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(BigDecimal value) {
            addCriterion("VIPPrice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VIPPrice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<BigDecimal> values) {
            addCriterion("VIPPrice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<BigDecimal> values) {
            addCriterion("VIPPrice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIPPrice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIPPrice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andRetailsales1IsNull() {
            addCriterion("RetailSales1 is null");
            return (Criteria) this;
        }

        public Criteria andRetailsales1IsNotNull() {
            addCriterion("RetailSales1 is not null");
            return (Criteria) this;
        }

        public Criteria andRetailsales1EqualTo(BigDecimal value) {
            addCriterion("RetailSales1 =", value, "retailsales1");
            return (Criteria) this;
        }

        public Criteria andRetailsales1NotEqualTo(BigDecimal value) {
            addCriterion("RetailSales1 <>", value, "retailsales1");
            return (Criteria) this;
        }

        public Criteria andRetailsales1GreaterThan(BigDecimal value) {
            addCriterion("RetailSales1 >", value, "retailsales1");
            return (Criteria) this;
        }

        public Criteria andRetailsales1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales1 >=", value, "retailsales1");
            return (Criteria) this;
        }

        public Criteria andRetailsales1LessThan(BigDecimal value) {
            addCriterion("RetailSales1 <", value, "retailsales1");
            return (Criteria) this;
        }

        public Criteria andRetailsales1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales1 <=", value, "retailsales1");
            return (Criteria) this;
        }

        public Criteria andRetailsales1In(List<BigDecimal> values) {
            addCriterion("RetailSales1 in", values, "retailsales1");
            return (Criteria) this;
        }

        public Criteria andRetailsales1NotIn(List<BigDecimal> values) {
            addCriterion("RetailSales1 not in", values, "retailsales1");
            return (Criteria) this;
        }

        public Criteria andRetailsales1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales1 between", value1, value2, "retailsales1");
            return (Criteria) this;
        }

        public Criteria andRetailsales1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales1 not between", value1, value2, "retailsales1");
            return (Criteria) this;
        }

        public Criteria andRetailsales2IsNull() {
            addCriterion("RetailSales2 is null");
            return (Criteria) this;
        }

        public Criteria andRetailsales2IsNotNull() {
            addCriterion("RetailSales2 is not null");
            return (Criteria) this;
        }

        public Criteria andRetailsales2EqualTo(BigDecimal value) {
            addCriterion("RetailSales2 =", value, "retailsales2");
            return (Criteria) this;
        }

        public Criteria andRetailsales2NotEqualTo(BigDecimal value) {
            addCriterion("RetailSales2 <>", value, "retailsales2");
            return (Criteria) this;
        }

        public Criteria andRetailsales2GreaterThan(BigDecimal value) {
            addCriterion("RetailSales2 >", value, "retailsales2");
            return (Criteria) this;
        }

        public Criteria andRetailsales2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales2 >=", value, "retailsales2");
            return (Criteria) this;
        }

        public Criteria andRetailsales2LessThan(BigDecimal value) {
            addCriterion("RetailSales2 <", value, "retailsales2");
            return (Criteria) this;
        }

        public Criteria andRetailsales2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales2 <=", value, "retailsales2");
            return (Criteria) this;
        }

        public Criteria andRetailsales2In(List<BigDecimal> values) {
            addCriterion("RetailSales2 in", values, "retailsales2");
            return (Criteria) this;
        }

        public Criteria andRetailsales2NotIn(List<BigDecimal> values) {
            addCriterion("RetailSales2 not in", values, "retailsales2");
            return (Criteria) this;
        }

        public Criteria andRetailsales2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales2 between", value1, value2, "retailsales2");
            return (Criteria) this;
        }

        public Criteria andRetailsales2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales2 not between", value1, value2, "retailsales2");
            return (Criteria) this;
        }

        public Criteria andRetailsales3IsNull() {
            addCriterion("RetailSales3 is null");
            return (Criteria) this;
        }

        public Criteria andRetailsales3IsNotNull() {
            addCriterion("RetailSales3 is not null");
            return (Criteria) this;
        }

        public Criteria andRetailsales3EqualTo(BigDecimal value) {
            addCriterion("RetailSales3 =", value, "retailsales3");
            return (Criteria) this;
        }

        public Criteria andRetailsales3NotEqualTo(BigDecimal value) {
            addCriterion("RetailSales3 <>", value, "retailsales3");
            return (Criteria) this;
        }

        public Criteria andRetailsales3GreaterThan(BigDecimal value) {
            addCriterion("RetailSales3 >", value, "retailsales3");
            return (Criteria) this;
        }

        public Criteria andRetailsales3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales3 >=", value, "retailsales3");
            return (Criteria) this;
        }

        public Criteria andRetailsales3LessThan(BigDecimal value) {
            addCriterion("RetailSales3 <", value, "retailsales3");
            return (Criteria) this;
        }

        public Criteria andRetailsales3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales3 <=", value, "retailsales3");
            return (Criteria) this;
        }

        public Criteria andRetailsales3In(List<BigDecimal> values) {
            addCriterion("RetailSales3 in", values, "retailsales3");
            return (Criteria) this;
        }

        public Criteria andRetailsales3NotIn(List<BigDecimal> values) {
            addCriterion("RetailSales3 not in", values, "retailsales3");
            return (Criteria) this;
        }

        public Criteria andRetailsales3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales3 between", value1, value2, "retailsales3");
            return (Criteria) this;
        }

        public Criteria andRetailsales3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales3 not between", value1, value2, "retailsales3");
            return (Criteria) this;
        }

        public Criteria andRetailsales4IsNull() {
            addCriterion("RetailSales4 is null");
            return (Criteria) this;
        }

        public Criteria andRetailsales4IsNotNull() {
            addCriterion("RetailSales4 is not null");
            return (Criteria) this;
        }

        public Criteria andRetailsales4EqualTo(BigDecimal value) {
            addCriterion("RetailSales4 =", value, "retailsales4");
            return (Criteria) this;
        }

        public Criteria andRetailsales4NotEqualTo(BigDecimal value) {
            addCriterion("RetailSales4 <>", value, "retailsales4");
            return (Criteria) this;
        }

        public Criteria andRetailsales4GreaterThan(BigDecimal value) {
            addCriterion("RetailSales4 >", value, "retailsales4");
            return (Criteria) this;
        }

        public Criteria andRetailsales4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales4 >=", value, "retailsales4");
            return (Criteria) this;
        }

        public Criteria andRetailsales4LessThan(BigDecimal value) {
            addCriterion("RetailSales4 <", value, "retailsales4");
            return (Criteria) this;
        }

        public Criteria andRetailsales4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales4 <=", value, "retailsales4");
            return (Criteria) this;
        }

        public Criteria andRetailsales4In(List<BigDecimal> values) {
            addCriterion("RetailSales4 in", values, "retailsales4");
            return (Criteria) this;
        }

        public Criteria andRetailsales4NotIn(List<BigDecimal> values) {
            addCriterion("RetailSales4 not in", values, "retailsales4");
            return (Criteria) this;
        }

        public Criteria andRetailsales4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales4 between", value1, value2, "retailsales4");
            return (Criteria) this;
        }

        public Criteria andRetailsales4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales4 not between", value1, value2, "retailsales4");
            return (Criteria) this;
        }

        public Criteria andRetailsales5IsNull() {
            addCriterion("RetailSales5 is null");
            return (Criteria) this;
        }

        public Criteria andRetailsales5IsNotNull() {
            addCriterion("RetailSales5 is not null");
            return (Criteria) this;
        }

        public Criteria andRetailsales5EqualTo(BigDecimal value) {
            addCriterion("RetailSales5 =", value, "retailsales5");
            return (Criteria) this;
        }

        public Criteria andRetailsales5NotEqualTo(BigDecimal value) {
            addCriterion("RetailSales5 <>", value, "retailsales5");
            return (Criteria) this;
        }

        public Criteria andRetailsales5GreaterThan(BigDecimal value) {
            addCriterion("RetailSales5 >", value, "retailsales5");
            return (Criteria) this;
        }

        public Criteria andRetailsales5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales5 >=", value, "retailsales5");
            return (Criteria) this;
        }

        public Criteria andRetailsales5LessThan(BigDecimal value) {
            addCriterion("RetailSales5 <", value, "retailsales5");
            return (Criteria) this;
        }

        public Criteria andRetailsales5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales5 <=", value, "retailsales5");
            return (Criteria) this;
        }

        public Criteria andRetailsales5In(List<BigDecimal> values) {
            addCriterion("RetailSales5 in", values, "retailsales5");
            return (Criteria) this;
        }

        public Criteria andRetailsales5NotIn(List<BigDecimal> values) {
            addCriterion("RetailSales5 not in", values, "retailsales5");
            return (Criteria) this;
        }

        public Criteria andRetailsales5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales5 between", value1, value2, "retailsales5");
            return (Criteria) this;
        }

        public Criteria andRetailsales5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales5 not between", value1, value2, "retailsales5");
            return (Criteria) this;
        }

        public Criteria andRetailsales6IsNull() {
            addCriterion("RetailSales6 is null");
            return (Criteria) this;
        }

        public Criteria andRetailsales6IsNotNull() {
            addCriterion("RetailSales6 is not null");
            return (Criteria) this;
        }

        public Criteria andRetailsales6EqualTo(BigDecimal value) {
            addCriterion("RetailSales6 =", value, "retailsales6");
            return (Criteria) this;
        }

        public Criteria andRetailsales6NotEqualTo(BigDecimal value) {
            addCriterion("RetailSales6 <>", value, "retailsales6");
            return (Criteria) this;
        }

        public Criteria andRetailsales6GreaterThan(BigDecimal value) {
            addCriterion("RetailSales6 >", value, "retailsales6");
            return (Criteria) this;
        }

        public Criteria andRetailsales6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales6 >=", value, "retailsales6");
            return (Criteria) this;
        }

        public Criteria andRetailsales6LessThan(BigDecimal value) {
            addCriterion("RetailSales6 <", value, "retailsales6");
            return (Criteria) this;
        }

        public Criteria andRetailsales6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales6 <=", value, "retailsales6");
            return (Criteria) this;
        }

        public Criteria andRetailsales6In(List<BigDecimal> values) {
            addCriterion("RetailSales6 in", values, "retailsales6");
            return (Criteria) this;
        }

        public Criteria andRetailsales6NotIn(List<BigDecimal> values) {
            addCriterion("RetailSales6 not in", values, "retailsales6");
            return (Criteria) this;
        }

        public Criteria andRetailsales6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales6 between", value1, value2, "retailsales6");
            return (Criteria) this;
        }

        public Criteria andRetailsales6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales6 not between", value1, value2, "retailsales6");
            return (Criteria) this;
        }

        public Criteria andRetailsales7IsNull() {
            addCriterion("RetailSales7 is null");
            return (Criteria) this;
        }

        public Criteria andRetailsales7IsNotNull() {
            addCriterion("RetailSales7 is not null");
            return (Criteria) this;
        }

        public Criteria andRetailsales7EqualTo(BigDecimal value) {
            addCriterion("RetailSales7 =", value, "retailsales7");
            return (Criteria) this;
        }

        public Criteria andRetailsales7NotEqualTo(BigDecimal value) {
            addCriterion("RetailSales7 <>", value, "retailsales7");
            return (Criteria) this;
        }

        public Criteria andRetailsales7GreaterThan(BigDecimal value) {
            addCriterion("RetailSales7 >", value, "retailsales7");
            return (Criteria) this;
        }

        public Criteria andRetailsales7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales7 >=", value, "retailsales7");
            return (Criteria) this;
        }

        public Criteria andRetailsales7LessThan(BigDecimal value) {
            addCriterion("RetailSales7 <", value, "retailsales7");
            return (Criteria) this;
        }

        public Criteria andRetailsales7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales7 <=", value, "retailsales7");
            return (Criteria) this;
        }

        public Criteria andRetailsales7In(List<BigDecimal> values) {
            addCriterion("RetailSales7 in", values, "retailsales7");
            return (Criteria) this;
        }

        public Criteria andRetailsales7NotIn(List<BigDecimal> values) {
            addCriterion("RetailSales7 not in", values, "retailsales7");
            return (Criteria) this;
        }

        public Criteria andRetailsales7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales7 between", value1, value2, "retailsales7");
            return (Criteria) this;
        }

        public Criteria andRetailsales7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales7 not between", value1, value2, "retailsales7");
            return (Criteria) this;
        }

        public Criteria andRetailsales8IsNull() {
            addCriterion("RetailSales8 is null");
            return (Criteria) this;
        }

        public Criteria andRetailsales8IsNotNull() {
            addCriterion("RetailSales8 is not null");
            return (Criteria) this;
        }

        public Criteria andRetailsales8EqualTo(BigDecimal value) {
            addCriterion("RetailSales8 =", value, "retailsales8");
            return (Criteria) this;
        }

        public Criteria andRetailsales8NotEqualTo(BigDecimal value) {
            addCriterion("RetailSales8 <>", value, "retailsales8");
            return (Criteria) this;
        }

        public Criteria andRetailsales8GreaterThan(BigDecimal value) {
            addCriterion("RetailSales8 >", value, "retailsales8");
            return (Criteria) this;
        }

        public Criteria andRetailsales8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales8 >=", value, "retailsales8");
            return (Criteria) this;
        }

        public Criteria andRetailsales8LessThan(BigDecimal value) {
            addCriterion("RetailSales8 <", value, "retailsales8");
            return (Criteria) this;
        }

        public Criteria andRetailsales8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailSales8 <=", value, "retailsales8");
            return (Criteria) this;
        }

        public Criteria andRetailsales8In(List<BigDecimal> values) {
            addCriterion("RetailSales8 in", values, "retailsales8");
            return (Criteria) this;
        }

        public Criteria andRetailsales8NotIn(List<BigDecimal> values) {
            addCriterion("RetailSales8 not in", values, "retailsales8");
            return (Criteria) this;
        }

        public Criteria andRetailsales8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales8 between", value1, value2, "retailsales8");
            return (Criteria) this;
        }

        public Criteria andRetailsales8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailSales8 not between", value1, value2, "retailsales8");
            return (Criteria) this;
        }

        public Criteria andSellerIsNull() {
            addCriterion("Seller is null");
            return (Criteria) this;
        }

        public Criteria andSellerIsNotNull() {
            addCriterion("Seller is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEqualTo(String value) {
            addCriterion("Seller =", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotEqualTo(String value) {
            addCriterion("Seller <>", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThan(String value) {
            addCriterion("Seller >", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThanOrEqualTo(String value) {
            addCriterion("Seller >=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThan(String value) {
            addCriterion("Seller <", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThanOrEqualTo(String value) {
            addCriterion("Seller <=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLike(String value) {
            addCriterion("Seller like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotLike(String value) {
            addCriterion("Seller not like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerIn(List<String> values) {
            addCriterion("Seller in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotIn(List<String> values) {
            addCriterion("Seller not in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerBetween(String value1, String value2) {
            addCriterion("Seller between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotBetween(String value1, String value2) {
            addCriterion("Seller not between", value1, value2, "seller");
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

        public Criteria andPackagecostIsNull() {
            addCriterion("PackageCost is null");
            return (Criteria) this;
        }

        public Criteria andPackagecostIsNotNull() {
            addCriterion("PackageCost is not null");
            return (Criteria) this;
        }

        public Criteria andPackagecostEqualTo(BigDecimal value) {
            addCriterion("PackageCost =", value, "packagecost");
            return (Criteria) this;
        }

        public Criteria andPackagecostNotEqualTo(BigDecimal value) {
            addCriterion("PackageCost <>", value, "packagecost");
            return (Criteria) this;
        }

        public Criteria andPackagecostGreaterThan(BigDecimal value) {
            addCriterion("PackageCost >", value, "packagecost");
            return (Criteria) this;
        }

        public Criteria andPackagecostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PackageCost >=", value, "packagecost");
            return (Criteria) this;
        }

        public Criteria andPackagecostLessThan(BigDecimal value) {
            addCriterion("PackageCost <", value, "packagecost");
            return (Criteria) this;
        }

        public Criteria andPackagecostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PackageCost <=", value, "packagecost");
            return (Criteria) this;
        }

        public Criteria andPackagecostIn(List<BigDecimal> values) {
            addCriterion("PackageCost in", values, "packagecost");
            return (Criteria) this;
        }

        public Criteria andPackagecostNotIn(List<BigDecimal> values) {
            addCriterion("PackageCost not in", values, "packagecost");
            return (Criteria) this;
        }

        public Criteria andPackagecostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PackageCost between", value1, value2, "packagecost");
            return (Criteria) this;
        }

        public Criteria andPackagecostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PackageCost not between", value1, value2, "packagecost");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitIsNull() {
            addCriterion("DevelopProfit is null");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitIsNotNull() {
            addCriterion("DevelopProfit is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitEqualTo(BigDecimal value) {
            addCriterion("DevelopProfit =", value, "developprofit");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitNotEqualTo(BigDecimal value) {
            addCriterion("DevelopProfit <>", value, "developprofit");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitGreaterThan(BigDecimal value) {
            addCriterion("DevelopProfit >", value, "developprofit");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DevelopProfit >=", value, "developprofit");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitLessThan(BigDecimal value) {
            addCriterion("DevelopProfit <", value, "developprofit");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DevelopProfit <=", value, "developprofit");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitIn(List<BigDecimal> values) {
            addCriterion("DevelopProfit in", values, "developprofit");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitNotIn(List<BigDecimal> values) {
            addCriterion("DevelopProfit not in", values, "developprofit");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DevelopProfit between", value1, value2, "developprofit");
            return (Criteria) this;
        }

        public Criteria andDevelopprofitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DevelopProfit not between", value1, value2, "developprofit");
            return (Criteria) this;
        }

        public Criteria andDesignerIsNull() {
            addCriterion("Designer is null");
            return (Criteria) this;
        }

        public Criteria andDesignerIsNotNull() {
            addCriterion("Designer is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerEqualTo(String value) {
            addCriterion("Designer =", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotEqualTo(String value) {
            addCriterion("Designer <>", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThan(String value) {
            addCriterion("Designer >", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThanOrEqualTo(String value) {
            addCriterion("Designer >=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThan(String value) {
            addCriterion("Designer <", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThanOrEqualTo(String value) {
            addCriterion("Designer <=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLike(String value) {
            addCriterion("Designer like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotLike(String value) {
            addCriterion("Designer not like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerIn(List<String> values) {
            addCriterion("Designer in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotIn(List<String> values) {
            addCriterion("Designer not in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerBetween(String value1, String value2) {
            addCriterion("Designer between", value1, value2, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotBetween(String value1, String value2) {
            addCriterion("Designer not between", value1, value2, "designer");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("Grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("Grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("Grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andPerformstandardIsNull() {
            addCriterion("PerformStandard is null");
            return (Criteria) this;
        }

        public Criteria andPerformstandardIsNotNull() {
            addCriterion("PerformStandard is not null");
            return (Criteria) this;
        }

        public Criteria andPerformstandardEqualTo(String value) {
            addCriterion("PerformStandard =", value, "performstandard");
            return (Criteria) this;
        }

        public Criteria andPerformstandardNotEqualTo(String value) {
            addCriterion("PerformStandard <>", value, "performstandard");
            return (Criteria) this;
        }

        public Criteria andPerformstandardGreaterThan(String value) {
            addCriterion("PerformStandard >", value, "performstandard");
            return (Criteria) this;
        }

        public Criteria andPerformstandardGreaterThanOrEqualTo(String value) {
            addCriterion("PerformStandard >=", value, "performstandard");
            return (Criteria) this;
        }

        public Criteria andPerformstandardLessThan(String value) {
            addCriterion("PerformStandard <", value, "performstandard");
            return (Criteria) this;
        }

        public Criteria andPerformstandardLessThanOrEqualTo(String value) {
            addCriterion("PerformStandard <=", value, "performstandard");
            return (Criteria) this;
        }

        public Criteria andPerformstandardLike(String value) {
            addCriterion("PerformStandard like", value, "performstandard");
            return (Criteria) this;
        }

        public Criteria andPerformstandardNotLike(String value) {
            addCriterion("PerformStandard not like", value, "performstandard");
            return (Criteria) this;
        }

        public Criteria andPerformstandardIn(List<String> values) {
            addCriterion("PerformStandard in", values, "performstandard");
            return (Criteria) this;
        }

        public Criteria andPerformstandardNotIn(List<String> values) {
            addCriterion("PerformStandard not in", values, "performstandard");
            return (Criteria) this;
        }

        public Criteria andPerformstandardBetween(String value1, String value2) {
            addCriterion("PerformStandard between", value1, value2, "performstandard");
            return (Criteria) this;
        }

        public Criteria andPerformstandardNotBetween(String value1, String value2) {
            addCriterion("PerformStandard not between", value1, value2, "performstandard");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeIsNull() {
            addCriterion("SecurityType is null");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeIsNotNull() {
            addCriterion("SecurityType is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeEqualTo(String value) {
            addCriterion("SecurityType =", value, "securitytype");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeNotEqualTo(String value) {
            addCriterion("SecurityType <>", value, "securitytype");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeGreaterThan(String value) {
            addCriterion("SecurityType >", value, "securitytype");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeGreaterThanOrEqualTo(String value) {
            addCriterion("SecurityType >=", value, "securitytype");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeLessThan(String value) {
            addCriterion("SecurityType <", value, "securitytype");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeLessThanOrEqualTo(String value) {
            addCriterion("SecurityType <=", value, "securitytype");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeLike(String value) {
            addCriterion("SecurityType like", value, "securitytype");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeNotLike(String value) {
            addCriterion("SecurityType not like", value, "securitytype");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeIn(List<String> values) {
            addCriterion("SecurityType in", values, "securitytype");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeNotIn(List<String> values) {
            addCriterion("SecurityType not in", values, "securitytype");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeBetween(String value1, String value2) {
            addCriterion("SecurityType between", value1, value2, "securitytype");
            return (Criteria) this;
        }

        public Criteria andSecuritytypeNotBetween(String value1, String value2) {
            addCriterion("SecurityType not between", value1, value2, "securitytype");
            return (Criteria) this;
        }

        public Criteria andStandardcodeIsNull() {
            addCriterion("StandardCode is null");
            return (Criteria) this;
        }

        public Criteria andStandardcodeIsNotNull() {
            addCriterion("StandardCode is not null");
            return (Criteria) this;
        }

        public Criteria andStandardcodeEqualTo(String value) {
            addCriterion("StandardCode =", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotEqualTo(String value) {
            addCriterion("StandardCode <>", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeGreaterThan(String value) {
            addCriterion("StandardCode >", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeGreaterThanOrEqualTo(String value) {
            addCriterion("StandardCode >=", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeLessThan(String value) {
            addCriterion("StandardCode <", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeLessThanOrEqualTo(String value) {
            addCriterion("StandardCode <=", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeLike(String value) {
            addCriterion("StandardCode like", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotLike(String value) {
            addCriterion("StandardCode not like", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeIn(List<String> values) {
            addCriterion("StandardCode in", values, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotIn(List<String> values) {
            addCriterion("StandardCode not in", values, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeBetween(String value1, String value2) {
            addCriterion("StandardCode between", value1, value2, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotBetween(String value1, String value2) {
            addCriterion("StandardCode not between", value1, value2, "standardcode");
            return (Criteria) this;
        }

        public Criteria andModel1IsNull() {
            addCriterion("Model1 is null");
            return (Criteria) this;
        }

        public Criteria andModel1IsNotNull() {
            addCriterion("Model1 is not null");
            return (Criteria) this;
        }

        public Criteria andModel1EqualTo(String value) {
            addCriterion("Model1 =", value, "model1");
            return (Criteria) this;
        }

        public Criteria andModel1NotEqualTo(String value) {
            addCriterion("Model1 <>", value, "model1");
            return (Criteria) this;
        }

        public Criteria andModel1GreaterThan(String value) {
            addCriterion("Model1 >", value, "model1");
            return (Criteria) this;
        }

        public Criteria andModel1GreaterThanOrEqualTo(String value) {
            addCriterion("Model1 >=", value, "model1");
            return (Criteria) this;
        }

        public Criteria andModel1LessThan(String value) {
            addCriterion("Model1 <", value, "model1");
            return (Criteria) this;
        }

        public Criteria andModel1LessThanOrEqualTo(String value) {
            addCriterion("Model1 <=", value, "model1");
            return (Criteria) this;
        }

        public Criteria andModel1Like(String value) {
            addCriterion("Model1 like", value, "model1");
            return (Criteria) this;
        }

        public Criteria andModel1NotLike(String value) {
            addCriterion("Model1 not like", value, "model1");
            return (Criteria) this;
        }

        public Criteria andModel1In(List<String> values) {
            addCriterion("Model1 in", values, "model1");
            return (Criteria) this;
        }

        public Criteria andModel1NotIn(List<String> values) {
            addCriterion("Model1 not in", values, "model1");
            return (Criteria) this;
        }

        public Criteria andModel1Between(String value1, String value2) {
            addCriterion("Model1 between", value1, value2, "model1");
            return (Criteria) this;
        }

        public Criteria andModel1NotBetween(String value1, String value2) {
            addCriterion("Model1 not between", value1, value2, "model1");
            return (Criteria) this;
        }

        public Criteria andModel2IsNull() {
            addCriterion("Model2 is null");
            return (Criteria) this;
        }

        public Criteria andModel2IsNotNull() {
            addCriterion("Model2 is not null");
            return (Criteria) this;
        }

        public Criteria andModel2EqualTo(String value) {
            addCriterion("Model2 =", value, "model2");
            return (Criteria) this;
        }

        public Criteria andModel2NotEqualTo(String value) {
            addCriterion("Model2 <>", value, "model2");
            return (Criteria) this;
        }

        public Criteria andModel2GreaterThan(String value) {
            addCriterion("Model2 >", value, "model2");
            return (Criteria) this;
        }

        public Criteria andModel2GreaterThanOrEqualTo(String value) {
            addCriterion("Model2 >=", value, "model2");
            return (Criteria) this;
        }

        public Criteria andModel2LessThan(String value) {
            addCriterion("Model2 <", value, "model2");
            return (Criteria) this;
        }

        public Criteria andModel2LessThanOrEqualTo(String value) {
            addCriterion("Model2 <=", value, "model2");
            return (Criteria) this;
        }

        public Criteria andModel2Like(String value) {
            addCriterion("Model2 like", value, "model2");
            return (Criteria) this;
        }

        public Criteria andModel2NotLike(String value) {
            addCriterion("Model2 not like", value, "model2");
            return (Criteria) this;
        }

        public Criteria andModel2In(List<String> values) {
            addCriterion("Model2 in", values, "model2");
            return (Criteria) this;
        }

        public Criteria andModel2NotIn(List<String> values) {
            addCriterion("Model2 not in", values, "model2");
            return (Criteria) this;
        }

        public Criteria andModel2Between(String value1, String value2) {
            addCriterion("Model2 between", value1, value2, "model2");
            return (Criteria) this;
        }

        public Criteria andModel2NotBetween(String value1, String value2) {
            addCriterion("Model2 not between", value1, value2, "model2");
            return (Criteria) this;
        }

        public Criteria andModel3IsNull() {
            addCriterion("Model3 is null");
            return (Criteria) this;
        }

        public Criteria andModel3IsNotNull() {
            addCriterion("Model3 is not null");
            return (Criteria) this;
        }

        public Criteria andModel3EqualTo(String value) {
            addCriterion("Model3 =", value, "model3");
            return (Criteria) this;
        }

        public Criteria andModel3NotEqualTo(String value) {
            addCriterion("Model3 <>", value, "model3");
            return (Criteria) this;
        }

        public Criteria andModel3GreaterThan(String value) {
            addCriterion("Model3 >", value, "model3");
            return (Criteria) this;
        }

        public Criteria andModel3GreaterThanOrEqualTo(String value) {
            addCriterion("Model3 >=", value, "model3");
            return (Criteria) this;
        }

        public Criteria andModel3LessThan(String value) {
            addCriterion("Model3 <", value, "model3");
            return (Criteria) this;
        }

        public Criteria andModel3LessThanOrEqualTo(String value) {
            addCriterion("Model3 <=", value, "model3");
            return (Criteria) this;
        }

        public Criteria andModel3Like(String value) {
            addCriterion("Model3 like", value, "model3");
            return (Criteria) this;
        }

        public Criteria andModel3NotLike(String value) {
            addCriterion("Model3 not like", value, "model3");
            return (Criteria) this;
        }

        public Criteria andModel3In(List<String> values) {
            addCriterion("Model3 in", values, "model3");
            return (Criteria) this;
        }

        public Criteria andModel3NotIn(List<String> values) {
            addCriterion("Model3 not in", values, "model3");
            return (Criteria) this;
        }

        public Criteria andModel3Between(String value1, String value2) {
            addCriterion("Model3 between", value1, value2, "model3");
            return (Criteria) this;
        }

        public Criteria andModel3NotBetween(String value1, String value2) {
            addCriterion("Model3 not between", value1, value2, "model3");
            return (Criteria) this;
        }

        public Criteria andModel4IsNull() {
            addCriterion("Model4 is null");
            return (Criteria) this;
        }

        public Criteria andModel4IsNotNull() {
            addCriterion("Model4 is not null");
            return (Criteria) this;
        }

        public Criteria andModel4EqualTo(String value) {
            addCriterion("Model4 =", value, "model4");
            return (Criteria) this;
        }

        public Criteria andModel4NotEqualTo(String value) {
            addCriterion("Model4 <>", value, "model4");
            return (Criteria) this;
        }

        public Criteria andModel4GreaterThan(String value) {
            addCriterion("Model4 >", value, "model4");
            return (Criteria) this;
        }

        public Criteria andModel4GreaterThanOrEqualTo(String value) {
            addCriterion("Model4 >=", value, "model4");
            return (Criteria) this;
        }

        public Criteria andModel4LessThan(String value) {
            addCriterion("Model4 <", value, "model4");
            return (Criteria) this;
        }

        public Criteria andModel4LessThanOrEqualTo(String value) {
            addCriterion("Model4 <=", value, "model4");
            return (Criteria) this;
        }

        public Criteria andModel4Like(String value) {
            addCriterion("Model4 like", value, "model4");
            return (Criteria) this;
        }

        public Criteria andModel4NotLike(String value) {
            addCriterion("Model4 not like", value, "model4");
            return (Criteria) this;
        }

        public Criteria andModel4In(List<String> values) {
            addCriterion("Model4 in", values, "model4");
            return (Criteria) this;
        }

        public Criteria andModel4NotIn(List<String> values) {
            addCriterion("Model4 not in", values, "model4");
            return (Criteria) this;
        }

        public Criteria andModel4Between(String value1, String value2) {
            addCriterion("Model4 between", value1, value2, "model4");
            return (Criteria) this;
        }

        public Criteria andModel4NotBetween(String value1, String value2) {
            addCriterion("Model4 not between", value1, value2, "model4");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleIsNull() {
            addCriterion("BrandPrintStyle is null");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleIsNotNull() {
            addCriterion("BrandPrintStyle is not null");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleEqualTo(String value) {
            addCriterion("BrandPrintStyle =", value, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleNotEqualTo(String value) {
            addCriterion("BrandPrintStyle <>", value, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleGreaterThan(String value) {
            addCriterion("BrandPrintStyle >", value, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleGreaterThanOrEqualTo(String value) {
            addCriterion("BrandPrintStyle >=", value, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleLessThan(String value) {
            addCriterion("BrandPrintStyle <", value, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleLessThanOrEqualTo(String value) {
            addCriterion("BrandPrintStyle <=", value, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleLike(String value) {
            addCriterion("BrandPrintStyle like", value, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleNotLike(String value) {
            addCriterion("BrandPrintStyle not like", value, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleIn(List<String> values) {
            addCriterion("BrandPrintStyle in", values, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleNotIn(List<String> values) {
            addCriterion("BrandPrintStyle not in", values, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleBetween(String value1, String value2) {
            addCriterion("BrandPrintStyle between", value1, value2, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andBrandprintstyleNotBetween(String value1, String value2) {
            addCriterion("BrandPrintStyle not between", value1, value2, "brandprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleIsNull() {
            addCriterion("WashPrintStyle is null");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleIsNotNull() {
            addCriterion("WashPrintStyle is not null");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleEqualTo(String value) {
            addCriterion("WashPrintStyle =", value, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleNotEqualTo(String value) {
            addCriterion("WashPrintStyle <>", value, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleGreaterThan(String value) {
            addCriterion("WashPrintStyle >", value, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleGreaterThanOrEqualTo(String value) {
            addCriterion("WashPrintStyle >=", value, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleLessThan(String value) {
            addCriterion("WashPrintStyle <", value, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleLessThanOrEqualTo(String value) {
            addCriterion("WashPrintStyle <=", value, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleLike(String value) {
            addCriterion("WashPrintStyle like", value, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleNotLike(String value) {
            addCriterion("WashPrintStyle not like", value, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleIn(List<String> values) {
            addCriterion("WashPrintStyle in", values, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleNotIn(List<String> values) {
            addCriterion("WashPrintStyle not in", values, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleBetween(String value1, String value2) {
            addCriterion("WashPrintStyle between", value1, value2, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andWashprintstyleNotBetween(String value1, String value2) {
            addCriterion("WashPrintStyle not between", value1, value2, "washprintstyle");
            return (Criteria) this;
        }

        public Criteria andSalesmarketIsNull() {
            addCriterion("SalesMarket is null");
            return (Criteria) this;
        }

        public Criteria andSalesmarketIsNotNull() {
            addCriterion("SalesMarket is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmarketEqualTo(String value) {
            addCriterion("SalesMarket =", value, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andSalesmarketNotEqualTo(String value) {
            addCriterion("SalesMarket <>", value, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andSalesmarketGreaterThan(String value) {
            addCriterion("SalesMarket >", value, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andSalesmarketGreaterThanOrEqualTo(String value) {
            addCriterion("SalesMarket >=", value, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andSalesmarketLessThan(String value) {
            addCriterion("SalesMarket <", value, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andSalesmarketLessThanOrEqualTo(String value) {
            addCriterion("SalesMarket <=", value, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andSalesmarketLike(String value) {
            addCriterion("SalesMarket like", value, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andSalesmarketNotLike(String value) {
            addCriterion("SalesMarket not like", value, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andSalesmarketIn(List<String> values) {
            addCriterion("SalesMarket in", values, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andSalesmarketNotIn(List<String> values) {
            addCriterion("SalesMarket not in", values, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andSalesmarketBetween(String value1, String value2) {
            addCriterion("SalesMarket between", value1, value2, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andSalesmarketNotBetween(String value1, String value2) {
            addCriterion("SalesMarket not between", value1, value2, "salesmarket");
            return (Criteria) this;
        }

        public Criteria andPrintflagIsNull() {
            addCriterion("PrintFlag is null");
            return (Criteria) this;
        }

        public Criteria andPrintflagIsNotNull() {
            addCriterion("PrintFlag is not null");
            return (Criteria) this;
        }

        public Criteria andPrintflagEqualTo(Boolean value) {
            addCriterion("PrintFlag =", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagNotEqualTo(Boolean value) {
            addCriterion("PrintFlag <>", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagGreaterThan(Boolean value) {
            addCriterion("PrintFlag >", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PrintFlag >=", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagLessThan(Boolean value) {
            addCriterion("PrintFlag <", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagLessThanOrEqualTo(Boolean value) {
            addCriterion("PrintFlag <=", value, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagIn(List<Boolean> values) {
            addCriterion("PrintFlag in", values, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagNotIn(List<Boolean> values) {
            addCriterion("PrintFlag not in", values, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagBetween(Boolean value1, Boolean value2) {
            addCriterion("PrintFlag between", value1, value2, "printflag");
            return (Criteria) this;
        }

        public Criteria andPrintflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PrintFlag not between", value1, value2, "printflag");
            return (Criteria) this;
        }

        public Criteria andFobIsNull() {
            addCriterion("FOB is null");
            return (Criteria) this;
        }

        public Criteria andFobIsNotNull() {
            addCriterion("FOB is not null");
            return (Criteria) this;
        }

        public Criteria andFobEqualTo(BigDecimal value) {
            addCriterion("FOB =", value, "fob");
            return (Criteria) this;
        }

        public Criteria andFobNotEqualTo(BigDecimal value) {
            addCriterion("FOB <>", value, "fob");
            return (Criteria) this;
        }

        public Criteria andFobGreaterThan(BigDecimal value) {
            addCriterion("FOB >", value, "fob");
            return (Criteria) this;
        }

        public Criteria andFobGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FOB >=", value, "fob");
            return (Criteria) this;
        }

        public Criteria andFobLessThan(BigDecimal value) {
            addCriterion("FOB <", value, "fob");
            return (Criteria) this;
        }

        public Criteria andFobLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FOB <=", value, "fob");
            return (Criteria) this;
        }

        public Criteria andFobIn(List<BigDecimal> values) {
            addCriterion("FOB in", values, "fob");
            return (Criteria) this;
        }

        public Criteria andFobNotIn(List<BigDecimal> values) {
            addCriterion("FOB not in", values, "fob");
            return (Criteria) this;
        }

        public Criteria andFobBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOB between", value1, value2, "fob");
            return (Criteria) this;
        }

        public Criteria andFobNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOB not between", value1, value2, "fob");
            return (Criteria) this;
        }

        public Criteria andNondiscountIsNull() {
            addCriterion("NonDiscount is null");
            return (Criteria) this;
        }

        public Criteria andNondiscountIsNotNull() {
            addCriterion("NonDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andNondiscountEqualTo(Boolean value) {
            addCriterion("NonDiscount =", value, "nondiscount");
            return (Criteria) this;
        }

        public Criteria andNondiscountNotEqualTo(Boolean value) {
            addCriterion("NonDiscount <>", value, "nondiscount");
            return (Criteria) this;
        }

        public Criteria andNondiscountGreaterThan(Boolean value) {
            addCriterion("NonDiscount >", value, "nondiscount");
            return (Criteria) this;
        }

        public Criteria andNondiscountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("NonDiscount >=", value, "nondiscount");
            return (Criteria) this;
        }

        public Criteria andNondiscountLessThan(Boolean value) {
            addCriterion("NonDiscount <", value, "nondiscount");
            return (Criteria) this;
        }

        public Criteria andNondiscountLessThanOrEqualTo(Boolean value) {
            addCriterion("NonDiscount <=", value, "nondiscount");
            return (Criteria) this;
        }

        public Criteria andNondiscountIn(List<Boolean> values) {
            addCriterion("NonDiscount in", values, "nondiscount");
            return (Criteria) this;
        }

        public Criteria andNondiscountNotIn(List<Boolean> values) {
            addCriterion("NonDiscount not in", values, "nondiscount");
            return (Criteria) this;
        }

        public Criteria andNondiscountBetween(Boolean value1, Boolean value2) {
            addCriterion("NonDiscount between", value1, value2, "nondiscount");
            return (Criteria) this;
        }

        public Criteria andNondiscountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("NonDiscount not between", value1, value2, "nondiscount");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesIsNull() {
            addCriterion("LowRetailSales is null");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesIsNotNull() {
            addCriterion("LowRetailSales is not null");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesEqualTo(BigDecimal value) {
            addCriterion("LowRetailSales =", value, "lowretailsales");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesNotEqualTo(BigDecimal value) {
            addCriterion("LowRetailSales <>", value, "lowretailsales");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesGreaterThan(BigDecimal value) {
            addCriterion("LowRetailSales >", value, "lowretailsales");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LowRetailSales >=", value, "lowretailsales");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesLessThan(BigDecimal value) {
            addCriterion("LowRetailSales <", value, "lowretailsales");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LowRetailSales <=", value, "lowretailsales");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesIn(List<BigDecimal> values) {
            addCriterion("LowRetailSales in", values, "lowretailsales");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesNotIn(List<BigDecimal> values) {
            addCriterion("LowRetailSales not in", values, "lowretailsales");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LowRetailSales between", value1, value2, "lowretailsales");
            return (Criteria) this;
        }

        public Criteria andLowretailsalesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LowRetailSales not between", value1, value2, "lowretailsales");
            return (Criteria) this;
        }

        public Criteria andNonpointIsNull() {
            addCriterion("NonPoint is null");
            return (Criteria) this;
        }

        public Criteria andNonpointIsNotNull() {
            addCriterion("NonPoint is not null");
            return (Criteria) this;
        }

        public Criteria andNonpointEqualTo(Boolean value) {
            addCriterion("NonPoint =", value, "nonpoint");
            return (Criteria) this;
        }

        public Criteria andNonpointNotEqualTo(Boolean value) {
            addCriterion("NonPoint <>", value, "nonpoint");
            return (Criteria) this;
        }

        public Criteria andNonpointGreaterThan(Boolean value) {
            addCriterion("NonPoint >", value, "nonpoint");
            return (Criteria) this;
        }

        public Criteria andNonpointGreaterThanOrEqualTo(Boolean value) {
            addCriterion("NonPoint >=", value, "nonpoint");
            return (Criteria) this;
        }

        public Criteria andNonpointLessThan(Boolean value) {
            addCriterion("NonPoint <", value, "nonpoint");
            return (Criteria) this;
        }

        public Criteria andNonpointLessThanOrEqualTo(Boolean value) {
            addCriterion("NonPoint <=", value, "nonpoint");
            return (Criteria) this;
        }

        public Criteria andNonpointIn(List<Boolean> values) {
            addCriterion("NonPoint in", values, "nonpoint");
            return (Criteria) this;
        }

        public Criteria andNonpointNotIn(List<Boolean> values) {
            addCriterion("NonPoint not in", values, "nonpoint");
            return (Criteria) this;
        }

        public Criteria andNonpointBetween(Boolean value1, Boolean value2) {
            addCriterion("NonPoint between", value1, value2, "nonpoint");
            return (Criteria) this;
        }

        public Criteria andNonpointNotBetween(Boolean value1, Boolean value2) {
            addCriterion("NonPoint not between", value1, value2, "nonpoint");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayIsNull() {
            addCriterion("BrandOutlay is null");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayIsNotNull() {
            addCriterion("BrandOutlay is not null");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayEqualTo(BigDecimal value) {
            addCriterion("BrandOutlay =", value, "brandoutlay");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayNotEqualTo(BigDecimal value) {
            addCriterion("BrandOutlay <>", value, "brandoutlay");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayGreaterThan(BigDecimal value) {
            addCriterion("BrandOutlay >", value, "brandoutlay");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BrandOutlay >=", value, "brandoutlay");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayLessThan(BigDecimal value) {
            addCriterion("BrandOutlay <", value, "brandoutlay");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BrandOutlay <=", value, "brandoutlay");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayIn(List<BigDecimal> values) {
            addCriterion("BrandOutlay in", values, "brandoutlay");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayNotIn(List<BigDecimal> values) {
            addCriterion("BrandOutlay not in", values, "brandoutlay");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BrandOutlay between", value1, value2, "brandoutlay");
            return (Criteria) this;
        }

        public Criteria andBrandoutlayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BrandOutlay not between", value1, value2, "brandoutlay");
            return (Criteria) this;
        }

        public Criteria andBomflagIsNull() {
            addCriterion("BOMFlag is null");
            return (Criteria) this;
        }

        public Criteria andBomflagIsNotNull() {
            addCriterion("BOMFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBomflagEqualTo(Boolean value) {
            addCriterion("BOMFlag =", value, "bomflag");
            return (Criteria) this;
        }

        public Criteria andBomflagNotEqualTo(Boolean value) {
            addCriterion("BOMFlag <>", value, "bomflag");
            return (Criteria) this;
        }

        public Criteria andBomflagGreaterThan(Boolean value) {
            addCriterion("BOMFlag >", value, "bomflag");
            return (Criteria) this;
        }

        public Criteria andBomflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("BOMFlag >=", value, "bomflag");
            return (Criteria) this;
        }

        public Criteria andBomflagLessThan(Boolean value) {
            addCriterion("BOMFlag <", value, "bomflag");
            return (Criteria) this;
        }

        public Criteria andBomflagLessThanOrEqualTo(Boolean value) {
            addCriterion("BOMFlag <=", value, "bomflag");
            return (Criteria) this;
        }

        public Criteria andBomflagIn(List<Boolean> values) {
            addCriterion("BOMFlag in", values, "bomflag");
            return (Criteria) this;
        }

        public Criteria andBomflagNotIn(List<Boolean> values) {
            addCriterion("BOMFlag not in", values, "bomflag");
            return (Criteria) this;
        }

        public Criteria andBomflagBetween(Boolean value1, Boolean value2) {
            addCriterion("BOMFlag between", value1, value2, "bomflag");
            return (Criteria) this;
        }

        public Criteria andBomflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("BOMFlag not between", value1, value2, "bomflag");
            return (Criteria) this;
        }

        public Criteria andModel5IsNull() {
            addCriterion("Model5 is null");
            return (Criteria) this;
        }

        public Criteria andModel5IsNotNull() {
            addCriterion("Model5 is not null");
            return (Criteria) this;
        }

        public Criteria andModel5EqualTo(String value) {
            addCriterion("Model5 =", value, "model5");
            return (Criteria) this;
        }

        public Criteria andModel5NotEqualTo(String value) {
            addCriterion("Model5 <>", value, "model5");
            return (Criteria) this;
        }

        public Criteria andModel5GreaterThan(String value) {
            addCriterion("Model5 >", value, "model5");
            return (Criteria) this;
        }

        public Criteria andModel5GreaterThanOrEqualTo(String value) {
            addCriterion("Model5 >=", value, "model5");
            return (Criteria) this;
        }

        public Criteria andModel5LessThan(String value) {
            addCriterion("Model5 <", value, "model5");
            return (Criteria) this;
        }

        public Criteria andModel5LessThanOrEqualTo(String value) {
            addCriterion("Model5 <=", value, "model5");
            return (Criteria) this;
        }

        public Criteria andModel5Like(String value) {
            addCriterion("Model5 like", value, "model5");
            return (Criteria) this;
        }

        public Criteria andModel5NotLike(String value) {
            addCriterion("Model5 not like", value, "model5");
            return (Criteria) this;
        }

        public Criteria andModel5In(List<String> values) {
            addCriterion("Model5 in", values, "model5");
            return (Criteria) this;
        }

        public Criteria andModel5NotIn(List<String> values) {
            addCriterion("Model5 not in", values, "model5");
            return (Criteria) this;
        }

        public Criteria andModel5Between(String value1, String value2) {
            addCriterion("Model5 between", value1, value2, "model5");
            return (Criteria) this;
        }

        public Criteria andModel5NotBetween(String value1, String value2) {
            addCriterion("Model5 not between", value1, value2, "model5");
            return (Criteria) this;
        }

        public Criteria andModel6IsNull() {
            addCriterion("Model6 is null");
            return (Criteria) this;
        }

        public Criteria andModel6IsNotNull() {
            addCriterion("Model6 is not null");
            return (Criteria) this;
        }

        public Criteria andModel6EqualTo(String value) {
            addCriterion("Model6 =", value, "model6");
            return (Criteria) this;
        }

        public Criteria andModel6NotEqualTo(String value) {
            addCriterion("Model6 <>", value, "model6");
            return (Criteria) this;
        }

        public Criteria andModel6GreaterThan(String value) {
            addCriterion("Model6 >", value, "model6");
            return (Criteria) this;
        }

        public Criteria andModel6GreaterThanOrEqualTo(String value) {
            addCriterion("Model6 >=", value, "model6");
            return (Criteria) this;
        }

        public Criteria andModel6LessThan(String value) {
            addCriterion("Model6 <", value, "model6");
            return (Criteria) this;
        }

        public Criteria andModel6LessThanOrEqualTo(String value) {
            addCriterion("Model6 <=", value, "model6");
            return (Criteria) this;
        }

        public Criteria andModel6Like(String value) {
            addCriterion("Model6 like", value, "model6");
            return (Criteria) this;
        }

        public Criteria andModel6NotLike(String value) {
            addCriterion("Model6 not like", value, "model6");
            return (Criteria) this;
        }

        public Criteria andModel6In(List<String> values) {
            addCriterion("Model6 in", values, "model6");
            return (Criteria) this;
        }

        public Criteria andModel6NotIn(List<String> values) {
            addCriterion("Model6 not in", values, "model6");
            return (Criteria) this;
        }

        public Criteria andModel6Between(String value1, String value2) {
            addCriterion("Model6 between", value1, value2, "model6");
            return (Criteria) this;
        }

        public Criteria andModel6NotBetween(String value1, String value2) {
            addCriterion("Model6 not between", value1, value2, "model6");
            return (Criteria) this;
        }

        public Criteria andModel7IsNull() {
            addCriterion("Model7 is null");
            return (Criteria) this;
        }

        public Criteria andModel7IsNotNull() {
            addCriterion("Model7 is not null");
            return (Criteria) this;
        }

        public Criteria andModel7EqualTo(String value) {
            addCriterion("Model7 =", value, "model7");
            return (Criteria) this;
        }

        public Criteria andModel7NotEqualTo(String value) {
            addCriterion("Model7 <>", value, "model7");
            return (Criteria) this;
        }

        public Criteria andModel7GreaterThan(String value) {
            addCriterion("Model7 >", value, "model7");
            return (Criteria) this;
        }

        public Criteria andModel7GreaterThanOrEqualTo(String value) {
            addCriterion("Model7 >=", value, "model7");
            return (Criteria) this;
        }

        public Criteria andModel7LessThan(String value) {
            addCriterion("Model7 <", value, "model7");
            return (Criteria) this;
        }

        public Criteria andModel7LessThanOrEqualTo(String value) {
            addCriterion("Model7 <=", value, "model7");
            return (Criteria) this;
        }

        public Criteria andModel7Like(String value) {
            addCriterion("Model7 like", value, "model7");
            return (Criteria) this;
        }

        public Criteria andModel7NotLike(String value) {
            addCriterion("Model7 not like", value, "model7");
            return (Criteria) this;
        }

        public Criteria andModel7In(List<String> values) {
            addCriterion("Model7 in", values, "model7");
            return (Criteria) this;
        }

        public Criteria andModel7NotIn(List<String> values) {
            addCriterion("Model7 not in", values, "model7");
            return (Criteria) this;
        }

        public Criteria andModel7Between(String value1, String value2) {
            addCriterion("Model7 between", value1, value2, "model7");
            return (Criteria) this;
        }

        public Criteria andModel7NotBetween(String value1, String value2) {
            addCriterion("Model7 not between", value1, value2, "model7");
            return (Criteria) this;
        }

        public Criteria andModel8IsNull() {
            addCriterion("Model8 is null");
            return (Criteria) this;
        }

        public Criteria andModel8IsNotNull() {
            addCriterion("Model8 is not null");
            return (Criteria) this;
        }

        public Criteria andModel8EqualTo(String value) {
            addCriterion("Model8 =", value, "model8");
            return (Criteria) this;
        }

        public Criteria andModel8NotEqualTo(String value) {
            addCriterion("Model8 <>", value, "model8");
            return (Criteria) this;
        }

        public Criteria andModel8GreaterThan(String value) {
            addCriterion("Model8 >", value, "model8");
            return (Criteria) this;
        }

        public Criteria andModel8GreaterThanOrEqualTo(String value) {
            addCriterion("Model8 >=", value, "model8");
            return (Criteria) this;
        }

        public Criteria andModel8LessThan(String value) {
            addCriterion("Model8 <", value, "model8");
            return (Criteria) this;
        }

        public Criteria andModel8LessThanOrEqualTo(String value) {
            addCriterion("Model8 <=", value, "model8");
            return (Criteria) this;
        }

        public Criteria andModel8Like(String value) {
            addCriterion("Model8 like", value, "model8");
            return (Criteria) this;
        }

        public Criteria andModel8NotLike(String value) {
            addCriterion("Model8 not like", value, "model8");
            return (Criteria) this;
        }

        public Criteria andModel8In(List<String> values) {
            addCriterion("Model8 in", values, "model8");
            return (Criteria) this;
        }

        public Criteria andModel8NotIn(List<String> values) {
            addCriterion("Model8 not in", values, "model8");
            return (Criteria) this;
        }

        public Criteria andModel8Between(String value1, String value2) {
            addCriterion("Model8 between", value1, value2, "model8");
            return (Criteria) this;
        }

        public Criteria andModel8NotBetween(String value1, String value2) {
            addCriterion("Model8 not between", value1, value2, "model8");
            return (Criteria) this;
        }

        public Criteria andModel9IsNull() {
            addCriterion("Model9 is null");
            return (Criteria) this;
        }

        public Criteria andModel9IsNotNull() {
            addCriterion("Model9 is not null");
            return (Criteria) this;
        }

        public Criteria andModel9EqualTo(String value) {
            addCriterion("Model9 =", value, "model9");
            return (Criteria) this;
        }

        public Criteria andModel9NotEqualTo(String value) {
            addCriterion("Model9 <>", value, "model9");
            return (Criteria) this;
        }

        public Criteria andModel9GreaterThan(String value) {
            addCriterion("Model9 >", value, "model9");
            return (Criteria) this;
        }

        public Criteria andModel9GreaterThanOrEqualTo(String value) {
            addCriterion("Model9 >=", value, "model9");
            return (Criteria) this;
        }

        public Criteria andModel9LessThan(String value) {
            addCriterion("Model9 <", value, "model9");
            return (Criteria) this;
        }

        public Criteria andModel9LessThanOrEqualTo(String value) {
            addCriterion("Model9 <=", value, "model9");
            return (Criteria) this;
        }

        public Criteria andModel9Like(String value) {
            addCriterion("Model9 like", value, "model9");
            return (Criteria) this;
        }

        public Criteria andModel9NotLike(String value) {
            addCriterion("Model9 not like", value, "model9");
            return (Criteria) this;
        }

        public Criteria andModel9In(List<String> values) {
            addCriterion("Model9 in", values, "model9");
            return (Criteria) this;
        }

        public Criteria andModel9NotIn(List<String> values) {
            addCriterion("Model9 not in", values, "model9");
            return (Criteria) this;
        }

        public Criteria andModel9Between(String value1, String value2) {
            addCriterion("Model9 between", value1, value2, "model9");
            return (Criteria) this;
        }

        public Criteria andModel9NotBetween(String value1, String value2) {
            addCriterion("Model9 not between", value1, value2, "model9");
            return (Criteria) this;
        }

        public Criteria andGoodsauditIsNull() {
            addCriterion("GoodsAudit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsauditIsNotNull() {
            addCriterion("GoodsAudit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsauditEqualTo(String value) {
            addCriterion("GoodsAudit =", value, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditNotEqualTo(String value) {
            addCriterion("GoodsAudit <>", value, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditGreaterThan(String value) {
            addCriterion("GoodsAudit >", value, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsAudit >=", value, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditLessThan(String value) {
            addCriterion("GoodsAudit <", value, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditLessThanOrEqualTo(String value) {
            addCriterion("GoodsAudit <=", value, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditLike(String value) {
            addCriterion("GoodsAudit like", value, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditNotLike(String value) {
            addCriterion("GoodsAudit not like", value, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditIn(List<String> values) {
            addCriterion("GoodsAudit in", values, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditNotIn(List<String> values) {
            addCriterion("GoodsAudit not in", values, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditBetween(String value1, String value2) {
            addCriterion("GoodsAudit between", value1, value2, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditNotBetween(String value1, String value2) {
            addCriterion("GoodsAudit not between", value1, value2, "goodsaudit");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagIsNull() {
            addCriterion("GoodsAuditFlag is null");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagIsNotNull() {
            addCriterion("GoodsAuditFlag is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagEqualTo(Boolean value) {
            addCriterion("GoodsAuditFlag =", value, "goodsauditflag");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagNotEqualTo(Boolean value) {
            addCriterion("GoodsAuditFlag <>", value, "goodsauditflag");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagGreaterThan(Boolean value) {
            addCriterion("GoodsAuditFlag >", value, "goodsauditflag");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("GoodsAuditFlag >=", value, "goodsauditflag");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagLessThan(Boolean value) {
            addCriterion("GoodsAuditFlag <", value, "goodsauditflag");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagLessThanOrEqualTo(Boolean value) {
            addCriterion("GoodsAuditFlag <=", value, "goodsauditflag");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagIn(List<Boolean> values) {
            addCriterion("GoodsAuditFlag in", values, "goodsauditflag");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagNotIn(List<Boolean> values) {
            addCriterion("GoodsAuditFlag not in", values, "goodsauditflag");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagBetween(Boolean value1, Boolean value2) {
            addCriterion("GoodsAuditFlag between", value1, value2, "goodsauditflag");
            return (Criteria) this;
        }

        public Criteria andGoodsauditflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("GoodsAuditFlag not between", value1, value2, "goodsauditflag");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateIsNull() {
            addCriterion("GoodsAuditDate is null");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateIsNotNull() {
            addCriterion("GoodsAuditDate is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateEqualTo(Date value) {
            addCriterion("GoodsAuditDate =", value, "goodsauditdate");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateNotEqualTo(Date value) {
            addCriterion("GoodsAuditDate <>", value, "goodsauditdate");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateGreaterThan(Date value) {
            addCriterion("GoodsAuditDate >", value, "goodsauditdate");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateGreaterThanOrEqualTo(Date value) {
            addCriterion("GoodsAuditDate >=", value, "goodsauditdate");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateLessThan(Date value) {
            addCriterion("GoodsAuditDate <", value, "goodsauditdate");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateLessThanOrEqualTo(Date value) {
            addCriterion("GoodsAuditDate <=", value, "goodsauditdate");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateIn(List<Date> values) {
            addCriterion("GoodsAuditDate in", values, "goodsauditdate");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateNotIn(List<Date> values) {
            addCriterion("GoodsAuditDate not in", values, "goodsauditdate");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateBetween(Date value1, Date value2) {
            addCriterion("GoodsAuditDate between", value1, value2, "goodsauditdate");
            return (Criteria) this;
        }

        public Criteria andGoodsauditdateNotBetween(Date value1, Date value2) {
            addCriterion("GoodsAuditDate not between", value1, value2, "goodsauditdate");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("Style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("Style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("Style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("Style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("Style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("Style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("Style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("Style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("Style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("Style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("Style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("Style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("Style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("Style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andHeelIsNull() {
            addCriterion("Heel is null");
            return (Criteria) this;
        }

        public Criteria andHeelIsNotNull() {
            addCriterion("Heel is not null");
            return (Criteria) this;
        }

        public Criteria andHeelEqualTo(String value) {
            addCriterion("Heel =", value, "heel");
            return (Criteria) this;
        }

        public Criteria andHeelNotEqualTo(String value) {
            addCriterion("Heel <>", value, "heel");
            return (Criteria) this;
        }

        public Criteria andHeelGreaterThan(String value) {
            addCriterion("Heel >", value, "heel");
            return (Criteria) this;
        }

        public Criteria andHeelGreaterThanOrEqualTo(String value) {
            addCriterion("Heel >=", value, "heel");
            return (Criteria) this;
        }

        public Criteria andHeelLessThan(String value) {
            addCriterion("Heel <", value, "heel");
            return (Criteria) this;
        }

        public Criteria andHeelLessThanOrEqualTo(String value) {
            addCriterion("Heel <=", value, "heel");
            return (Criteria) this;
        }

        public Criteria andHeelLike(String value) {
            addCriterion("Heel like", value, "heel");
            return (Criteria) this;
        }

        public Criteria andHeelNotLike(String value) {
            addCriterion("Heel not like", value, "heel");
            return (Criteria) this;
        }

        public Criteria andHeelIn(List<String> values) {
            addCriterion("Heel in", values, "heel");
            return (Criteria) this;
        }

        public Criteria andHeelNotIn(List<String> values) {
            addCriterion("Heel not in", values, "heel");
            return (Criteria) this;
        }

        public Criteria andHeelBetween(String value1, String value2) {
            addCriterion("Heel between", value1, value2, "heel");
            return (Criteria) this;
        }

        public Criteria andHeelNotBetween(String value1, String value2) {
            addCriterion("Heel not between", value1, value2, "heel");
            return (Criteria) this;
        }

        public Criteria andSubtypeIsNull() {
            addCriterion("SubType is null");
            return (Criteria) this;
        }

        public Criteria andSubtypeIsNotNull() {
            addCriterion("SubType is not null");
            return (Criteria) this;
        }

        public Criteria andSubtypeEqualTo(String value) {
            addCriterion("SubType =", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotEqualTo(String value) {
            addCriterion("SubType <>", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeGreaterThan(String value) {
            addCriterion("SubType >", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SubType >=", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLessThan(String value) {
            addCriterion("SubType <", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLessThanOrEqualTo(String value) {
            addCriterion("SubType <=", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLike(String value) {
            addCriterion("SubType like", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotLike(String value) {
            addCriterion("SubType not like", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeIn(List<String> values) {
            addCriterion("SubType in", values, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotIn(List<String> values) {
            addCriterion("SubType not in", values, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeBetween(String value1, String value2) {
            addCriterion("SubType between", value1, value2, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotBetween(String value1, String value2) {
            addCriterion("SubType not between", value1, value2, "subtype");
            return (Criteria) this;
        }

        public Criteria andPointrateIsNull() {
            addCriterion("PointRate is null");
            return (Criteria) this;
        }

        public Criteria andPointrateIsNotNull() {
            addCriterion("PointRate is not null");
            return (Criteria) this;
        }

        public Criteria andPointrateEqualTo(BigDecimal value) {
            addCriterion("PointRate =", value, "pointrate");
            return (Criteria) this;
        }

        public Criteria andPointrateNotEqualTo(BigDecimal value) {
            addCriterion("PointRate <>", value, "pointrate");
            return (Criteria) this;
        }

        public Criteria andPointrateGreaterThan(BigDecimal value) {
            addCriterion("PointRate >", value, "pointrate");
            return (Criteria) this;
        }

        public Criteria andPointrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PointRate >=", value, "pointrate");
            return (Criteria) this;
        }

        public Criteria andPointrateLessThan(BigDecimal value) {
            addCriterion("PointRate <", value, "pointrate");
            return (Criteria) this;
        }

        public Criteria andPointrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PointRate <=", value, "pointrate");
            return (Criteria) this;
        }

        public Criteria andPointrateIn(List<BigDecimal> values) {
            addCriterion("PointRate in", values, "pointrate");
            return (Criteria) this;
        }

        public Criteria andPointrateNotIn(List<BigDecimal> values) {
            addCriterion("PointRate not in", values, "pointrate");
            return (Criteria) this;
        }

        public Criteria andPointrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PointRate between", value1, value2, "pointrate");
            return (Criteria) this;
        }

        public Criteria andPointrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PointRate not between", value1, value2, "pointrate");
            return (Criteria) this;
        }

        public Criteria andInitialpriceIsNull() {
            addCriterion("InitialPrice is null");
            return (Criteria) this;
        }

        public Criteria andInitialpriceIsNotNull() {
            addCriterion("InitialPrice is not null");
            return (Criteria) this;
        }

        public Criteria andInitialpriceEqualTo(BigDecimal value) {
            addCriterion("InitialPrice =", value, "initialprice");
            return (Criteria) this;
        }

        public Criteria andInitialpriceNotEqualTo(BigDecimal value) {
            addCriterion("InitialPrice <>", value, "initialprice");
            return (Criteria) this;
        }

        public Criteria andInitialpriceGreaterThan(BigDecimal value) {
            addCriterion("InitialPrice >", value, "initialprice");
            return (Criteria) this;
        }

        public Criteria andInitialpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("InitialPrice >=", value, "initialprice");
            return (Criteria) this;
        }

        public Criteria andInitialpriceLessThan(BigDecimal value) {
            addCriterion("InitialPrice <", value, "initialprice");
            return (Criteria) this;
        }

        public Criteria andInitialpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("InitialPrice <=", value, "initialprice");
            return (Criteria) this;
        }

        public Criteria andInitialpriceIn(List<BigDecimal> values) {
            addCriterion("InitialPrice in", values, "initialprice");
            return (Criteria) this;
        }

        public Criteria andInitialpriceNotIn(List<BigDecimal> values) {
            addCriterion("InitialPrice not in", values, "initialprice");
            return (Criteria) this;
        }

        public Criteria andInitialpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InitialPrice between", value1, value2, "initialprice");
            return (Criteria) this;
        }

        public Criteria andInitialpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InitialPrice not between", value1, value2, "initialprice");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNull() {
            addCriterion("IsNew is null");
            return (Criteria) this;
        }

        public Criteria andIsnewIsNotNull() {
            addCriterion("IsNew is not null");
            return (Criteria) this;
        }

        public Criteria andIsnewEqualTo(Boolean value) {
            addCriterion("IsNew =", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotEqualTo(Boolean value) {
            addCriterion("IsNew <>", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThan(Boolean value) {
            addCriterion("IsNew >", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsNew >=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThan(Boolean value) {
            addCriterion("IsNew <", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewLessThanOrEqualTo(Boolean value) {
            addCriterion("IsNew <=", value, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewIn(List<Boolean> values) {
            addCriterion("IsNew in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotIn(List<Boolean> values) {
            addCriterion("IsNew not in", values, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewBetween(Boolean value1, Boolean value2) {
            addCriterion("IsNew between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsnewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsNew not between", value1, value2, "isnew");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNull() {
            addCriterion("IsOnLine is null");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNotNull() {
            addCriterion("IsOnLine is not null");
            return (Criteria) this;
        }

        public Criteria andIsonlineEqualTo(Boolean value) {
            addCriterion("IsOnLine =", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotEqualTo(Boolean value) {
            addCriterion("IsOnLine <>", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThan(Boolean value) {
            addCriterion("IsOnLine >", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsOnLine >=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThan(Boolean value) {
            addCriterion("IsOnLine <", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThanOrEqualTo(Boolean value) {
            addCriterion("IsOnLine <=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineIn(List<Boolean> values) {
            addCriterion("IsOnLine in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotIn(List<Boolean> values) {
            addCriterion("IsOnLine not in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOnLine between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOnLine not between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineIsNull() {
            addCriterion("RecommendOnLine is null");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineIsNotNull() {
            addCriterion("RecommendOnLine is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineEqualTo(Boolean value) {
            addCriterion("RecommendOnLine =", value, "recommendonline");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineNotEqualTo(Boolean value) {
            addCriterion("RecommendOnLine <>", value, "recommendonline");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineGreaterThan(Boolean value) {
            addCriterion("RecommendOnLine >", value, "recommendonline");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("RecommendOnLine >=", value, "recommendonline");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineLessThan(Boolean value) {
            addCriterion("RecommendOnLine <", value, "recommendonline");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineLessThanOrEqualTo(Boolean value) {
            addCriterion("RecommendOnLine <=", value, "recommendonline");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineIn(List<Boolean> values) {
            addCriterion("RecommendOnLine in", values, "recommendonline");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineNotIn(List<Boolean> values) {
            addCriterion("RecommendOnLine not in", values, "recommendonline");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineBetween(Boolean value1, Boolean value2) {
            addCriterion("RecommendOnLine between", value1, value2, "recommendonline");
            return (Criteria) this;
        }

        public Criteria andRecommendonlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("RecommendOnLine not between", value1, value2, "recommendonline");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoIsNull() {
            addCriterion("MaxSizeNo is null");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoIsNotNull() {
            addCriterion("MaxSizeNo is not null");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoEqualTo(Integer value) {
            addCriterion("MaxSizeNo =", value, "maxsizeno");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoNotEqualTo(Integer value) {
            addCriterion("MaxSizeNo <>", value, "maxsizeno");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoGreaterThan(Integer value) {
            addCriterion("MaxSizeNo >", value, "maxsizeno");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaxSizeNo >=", value, "maxsizeno");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoLessThan(Integer value) {
            addCriterion("MaxSizeNo <", value, "maxsizeno");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoLessThanOrEqualTo(Integer value) {
            addCriterion("MaxSizeNo <=", value, "maxsizeno");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoIn(List<Integer> values) {
            addCriterion("MaxSizeNo in", values, "maxsizeno");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoNotIn(List<Integer> values) {
            addCriterion("MaxSizeNo not in", values, "maxsizeno");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoBetween(Integer value1, Integer value2) {
            addCriterion("MaxSizeNo between", value1, value2, "maxsizeno");
            return (Criteria) this;
        }

        public Criteria andMaxsizenoNotBetween(Integer value1, Integer value2) {
            addCriterion("MaxSizeNo not between", value1, value2, "maxsizeno");
            return (Criteria) this;
        }

        public Criteria andIssampleIsNull() {
            addCriterion("IsSample is null");
            return (Criteria) this;
        }

        public Criteria andIssampleIsNotNull() {
            addCriterion("IsSample is not null");
            return (Criteria) this;
        }

        public Criteria andIssampleEqualTo(Boolean value) {
            addCriterion("IsSample =", value, "issample");
            return (Criteria) this;
        }

        public Criteria andIssampleNotEqualTo(Boolean value) {
            addCriterion("IsSample <>", value, "issample");
            return (Criteria) this;
        }

        public Criteria andIssampleGreaterThan(Boolean value) {
            addCriterion("IsSample >", value, "issample");
            return (Criteria) this;
        }

        public Criteria andIssampleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsSample >=", value, "issample");
            return (Criteria) this;
        }

        public Criteria andIssampleLessThan(Boolean value) {
            addCriterion("IsSample <", value, "issample");
            return (Criteria) this;
        }

        public Criteria andIssampleLessThanOrEqualTo(Boolean value) {
            addCriterion("IsSample <=", value, "issample");
            return (Criteria) this;
        }

        public Criteria andIssampleIn(List<Boolean> values) {
            addCriterion("IsSample in", values, "issample");
            return (Criteria) this;
        }

        public Criteria andIssampleNotIn(List<Boolean> values) {
            addCriterion("IsSample not in", values, "issample");
            return (Criteria) this;
        }

        public Criteria andIssampleBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSample between", value1, value2, "issample");
            return (Criteria) this;
        }

        public Criteria andIssampleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSample not between", value1, value2, "issample");
            return (Criteria) this;
        }

        public Criteria andNonreturncashIsNull() {
            addCriterion("NonReturnCash is null");
            return (Criteria) this;
        }

        public Criteria andNonreturncashIsNotNull() {
            addCriterion("NonReturnCash is not null");
            return (Criteria) this;
        }

        public Criteria andNonreturncashEqualTo(Boolean value) {
            addCriterion("NonReturnCash =", value, "nonreturncash");
            return (Criteria) this;
        }

        public Criteria andNonreturncashNotEqualTo(Boolean value) {
            addCriterion("NonReturnCash <>", value, "nonreturncash");
            return (Criteria) this;
        }

        public Criteria andNonreturncashGreaterThan(Boolean value) {
            addCriterion("NonReturnCash >", value, "nonreturncash");
            return (Criteria) this;
        }

        public Criteria andNonreturncashGreaterThanOrEqualTo(Boolean value) {
            addCriterion("NonReturnCash >=", value, "nonreturncash");
            return (Criteria) this;
        }

        public Criteria andNonreturncashLessThan(Boolean value) {
            addCriterion("NonReturnCash <", value, "nonreturncash");
            return (Criteria) this;
        }

        public Criteria andNonreturncashLessThanOrEqualTo(Boolean value) {
            addCriterion("NonReturnCash <=", value, "nonreturncash");
            return (Criteria) this;
        }

        public Criteria andNonreturncashIn(List<Boolean> values) {
            addCriterion("NonReturnCash in", values, "nonreturncash");
            return (Criteria) this;
        }

        public Criteria andNonreturncashNotIn(List<Boolean> values) {
            addCriterion("NonReturnCash not in", values, "nonreturncash");
            return (Criteria) this;
        }

        public Criteria andNonreturncashBetween(Boolean value1, Boolean value2) {
            addCriterion("NonReturnCash between", value1, value2, "nonreturncash");
            return (Criteria) this;
        }

        public Criteria andNonreturncashNotBetween(Boolean value1, Boolean value2) {
            addCriterion("NonReturnCash not between", value1, value2, "nonreturncash");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitIsNull() {
            addCriterion("NonExchangeProfit is null");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitIsNotNull() {
            addCriterion("NonExchangeProfit is not null");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitEqualTo(Boolean value) {
            addCriterion("NonExchangeProfit =", value, "nonexchangeprofit");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitNotEqualTo(Boolean value) {
            addCriterion("NonExchangeProfit <>", value, "nonexchangeprofit");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitGreaterThan(Boolean value) {
            addCriterion("NonExchangeProfit >", value, "nonexchangeprofit");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("NonExchangeProfit >=", value, "nonexchangeprofit");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitLessThan(Boolean value) {
            addCriterion("NonExchangeProfit <", value, "nonexchangeprofit");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitLessThanOrEqualTo(Boolean value) {
            addCriterion("NonExchangeProfit <=", value, "nonexchangeprofit");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitIn(List<Boolean> values) {
            addCriterion("NonExchangeProfit in", values, "nonexchangeprofit");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitNotIn(List<Boolean> values) {
            addCriterion("NonExchangeProfit not in", values, "nonexchangeprofit");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitBetween(Boolean value1, Boolean value2) {
            addCriterion("NonExchangeProfit between", value1, value2, "nonexchangeprofit");
            return (Criteria) this;
        }

        public Criteria andNonexchangeprofitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("NonExchangeProfit not between", value1, value2, "nonexchangeprofit");
            return (Criteria) this;
        }

        public Criteria andListingdateIsNull() {
            addCriterion("ListingDate is null");
            return (Criteria) this;
        }

        public Criteria andListingdateIsNotNull() {
            addCriterion("ListingDate is not null");
            return (Criteria) this;
        }

        public Criteria andListingdateEqualTo(Date value) {
            addCriterion("ListingDate =", value, "listingdate");
            return (Criteria) this;
        }

        public Criteria andListingdateNotEqualTo(Date value) {
            addCriterion("ListingDate <>", value, "listingdate");
            return (Criteria) this;
        }

        public Criteria andListingdateGreaterThan(Date value) {
            addCriterion("ListingDate >", value, "listingdate");
            return (Criteria) this;
        }

        public Criteria andListingdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ListingDate >=", value, "listingdate");
            return (Criteria) this;
        }

        public Criteria andListingdateLessThan(Date value) {
            addCriterion("ListingDate <", value, "listingdate");
            return (Criteria) this;
        }

        public Criteria andListingdateLessThanOrEqualTo(Date value) {
            addCriterion("ListingDate <=", value, "listingdate");
            return (Criteria) this;
        }

        public Criteria andListingdateIn(List<Date> values) {
            addCriterion("ListingDate in", values, "listingdate");
            return (Criteria) this;
        }

        public Criteria andListingdateNotIn(List<Date> values) {
            addCriterion("ListingDate not in", values, "listingdate");
            return (Criteria) this;
        }

        public Criteria andListingdateBetween(Date value1, Date value2) {
            addCriterion("ListingDate between", value1, value2, "listingdate");
            return (Criteria) this;
        }

        public Criteria andListingdateNotBetween(Date value1, Date value2) {
            addCriterion("ListingDate not between", value1, value2, "listingdate");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposIsNull() {
            addCriterion("CanEditPriceForPOS is null");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposIsNotNull() {
            addCriterion("CanEditPriceForPOS is not null");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposEqualTo(Boolean value) {
            addCriterion("CanEditPriceForPOS =", value, "caneditpriceforpos");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposNotEqualTo(Boolean value) {
            addCriterion("CanEditPriceForPOS <>", value, "caneditpriceforpos");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposGreaterThan(Boolean value) {
            addCriterion("CanEditPriceForPOS >", value, "caneditpriceforpos");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CanEditPriceForPOS >=", value, "caneditpriceforpos");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposLessThan(Boolean value) {
            addCriterion("CanEditPriceForPOS <", value, "caneditpriceforpos");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposLessThanOrEqualTo(Boolean value) {
            addCriterion("CanEditPriceForPOS <=", value, "caneditpriceforpos");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposIn(List<Boolean> values) {
            addCriterion("CanEditPriceForPOS in", values, "caneditpriceforpos");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposNotIn(List<Boolean> values) {
            addCriterion("CanEditPriceForPOS not in", values, "caneditpriceforpos");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposBetween(Boolean value1, Boolean value2) {
            addCriterion("CanEditPriceForPOS between", value1, value2, "caneditpriceforpos");
            return (Criteria) this;
        }

        public Criteria andCaneditpriceforposNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CanEditPriceForPOS not between", value1, value2, "caneditpriceforpos");
            return (Criteria) this;
        }

        public Criteria andCodeEshopIsNull() {
            addCriterion("Code_EShop is null");
            return (Criteria) this;
        }

        public Criteria andCodeEshopIsNotNull() {
            addCriterion("Code_EShop is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEshopEqualTo(String value) {
            addCriterion("Code_EShop =", value, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andCodeEshopNotEqualTo(String value) {
            addCriterion("Code_EShop <>", value, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andCodeEshopGreaterThan(String value) {
            addCriterion("Code_EShop >", value, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andCodeEshopGreaterThanOrEqualTo(String value) {
            addCriterion("Code_EShop >=", value, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andCodeEshopLessThan(String value) {
            addCriterion("Code_EShop <", value, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andCodeEshopLessThanOrEqualTo(String value) {
            addCriterion("Code_EShop <=", value, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andCodeEshopLike(String value) {
            addCriterion("Code_EShop like", value, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andCodeEshopNotLike(String value) {
            addCriterion("Code_EShop not like", value, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andCodeEshopIn(List<String> values) {
            addCriterion("Code_EShop in", values, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andCodeEshopNotIn(List<String> values) {
            addCriterion("Code_EShop not in", values, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andCodeEshopBetween(String value1, String value2) {
            addCriterion("Code_EShop between", value1, value2, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andCodeEshopNotBetween(String value1, String value2) {
            addCriterion("Code_EShop not between", value1, value2, "codeEshop");
            return (Criteria) this;
        }

        public Criteria andKnotcodeIsNull() {
            addCriterion("KnotCode is null");
            return (Criteria) this;
        }

        public Criteria andKnotcodeIsNotNull() {
            addCriterion("KnotCode is not null");
            return (Criteria) this;
        }

        public Criteria andKnotcodeEqualTo(String value) {
            addCriterion("KnotCode =", value, "knotcode");
            return (Criteria) this;
        }

        public Criteria andKnotcodeNotEqualTo(String value) {
            addCriterion("KnotCode <>", value, "knotcode");
            return (Criteria) this;
        }

        public Criteria andKnotcodeGreaterThan(String value) {
            addCriterion("KnotCode >", value, "knotcode");
            return (Criteria) this;
        }

        public Criteria andKnotcodeGreaterThanOrEqualTo(String value) {
            addCriterion("KnotCode >=", value, "knotcode");
            return (Criteria) this;
        }

        public Criteria andKnotcodeLessThan(String value) {
            addCriterion("KnotCode <", value, "knotcode");
            return (Criteria) this;
        }

        public Criteria andKnotcodeLessThanOrEqualTo(String value) {
            addCriterion("KnotCode <=", value, "knotcode");
            return (Criteria) this;
        }

        public Criteria andKnotcodeLike(String value) {
            addCriterion("KnotCode like", value, "knotcode");
            return (Criteria) this;
        }

        public Criteria andKnotcodeNotLike(String value) {
            addCriterion("KnotCode not like", value, "knotcode");
            return (Criteria) this;
        }

        public Criteria andKnotcodeIn(List<String> values) {
            addCriterion("KnotCode in", values, "knotcode");
            return (Criteria) this;
        }

        public Criteria andKnotcodeNotIn(List<String> values) {
            addCriterion("KnotCode not in", values, "knotcode");
            return (Criteria) this;
        }

        public Criteria andKnotcodeBetween(String value1, String value2) {
            addCriterion("KnotCode between", value1, value2, "knotcode");
            return (Criteria) this;
        }

        public Criteria andKnotcodeNotBetween(String value1, String value2) {
            addCriterion("KnotCode not between", value1, value2, "knotcode");
            return (Criteria) this;
        }

        public Criteria andPacktypeIsNull() {
            addCriterion("PackType is null");
            return (Criteria) this;
        }

        public Criteria andPacktypeIsNotNull() {
            addCriterion("PackType is not null");
            return (Criteria) this;
        }

        public Criteria andPacktypeEqualTo(String value) {
            addCriterion("PackType =", value, "packtype");
            return (Criteria) this;
        }

        public Criteria andPacktypeNotEqualTo(String value) {
            addCriterion("PackType <>", value, "packtype");
            return (Criteria) this;
        }

        public Criteria andPacktypeGreaterThan(String value) {
            addCriterion("PackType >", value, "packtype");
            return (Criteria) this;
        }

        public Criteria andPacktypeGreaterThanOrEqualTo(String value) {
            addCriterion("PackType >=", value, "packtype");
            return (Criteria) this;
        }

        public Criteria andPacktypeLessThan(String value) {
            addCriterion("PackType <", value, "packtype");
            return (Criteria) this;
        }

        public Criteria andPacktypeLessThanOrEqualTo(String value) {
            addCriterion("PackType <=", value, "packtype");
            return (Criteria) this;
        }

        public Criteria andPacktypeLike(String value) {
            addCriterion("PackType like", value, "packtype");
            return (Criteria) this;
        }

        public Criteria andPacktypeNotLike(String value) {
            addCriterion("PackType not like", value, "packtype");
            return (Criteria) this;
        }

        public Criteria andPacktypeIn(List<String> values) {
            addCriterion("PackType in", values, "packtype");
            return (Criteria) this;
        }

        public Criteria andPacktypeNotIn(List<String> values) {
            addCriterion("PackType not in", values, "packtype");
            return (Criteria) this;
        }

        public Criteria andPacktypeBetween(String value1, String value2) {
            addCriterion("PackType between", value1, value2, "packtype");
            return (Criteria) this;
        }

        public Criteria andPacktypeNotBetween(String value1, String value2) {
            addCriterion("PackType not between", value1, value2, "packtype");
            return (Criteria) this;
        }

        public Criteria andBandIsNull() {
            addCriterion("Band is null");
            return (Criteria) this;
        }

        public Criteria andBandIsNotNull() {
            addCriterion("Band is not null");
            return (Criteria) this;
        }

        public Criteria andBandEqualTo(String value) {
            addCriterion("Band =", value, "band");
            return (Criteria) this;
        }

        public Criteria andBandNotEqualTo(String value) {
            addCriterion("Band <>", value, "band");
            return (Criteria) this;
        }

        public Criteria andBandGreaterThan(String value) {
            addCriterion("Band >", value, "band");
            return (Criteria) this;
        }

        public Criteria andBandGreaterThanOrEqualTo(String value) {
            addCriterion("Band >=", value, "band");
            return (Criteria) this;
        }

        public Criteria andBandLessThan(String value) {
            addCriterion("Band <", value, "band");
            return (Criteria) this;
        }

        public Criteria andBandLessThanOrEqualTo(String value) {
            addCriterion("Band <=", value, "band");
            return (Criteria) this;
        }

        public Criteria andBandLike(String value) {
            addCriterion("Band like", value, "band");
            return (Criteria) this;
        }

        public Criteria andBandNotLike(String value) {
            addCriterion("Band not like", value, "band");
            return (Criteria) this;
        }

        public Criteria andBandIn(List<String> values) {
            addCriterion("Band in", values, "band");
            return (Criteria) this;
        }

        public Criteria andBandNotIn(List<String> values) {
            addCriterion("Band not in", values, "band");
            return (Criteria) this;
        }

        public Criteria andBandBetween(String value1, String value2) {
            addCriterion("Band between", value1, value2, "band");
            return (Criteria) this;
        }

        public Criteria andBandNotBetween(String value1, String value2) {
            addCriterion("Band not between", value1, value2, "band");
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