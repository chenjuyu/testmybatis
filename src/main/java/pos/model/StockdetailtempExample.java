package pos.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StockdetailtempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockdetailtempExample() {
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

        public Criteria andStockdetailidIsNull() {
            addCriterion("StockDetailID is null");
            return (Criteria) this;
        }

        public Criteria andStockdetailidIsNotNull() {
            addCriterion("StockDetailID is not null");
            return (Criteria) this;
        }

        public Criteria andStockdetailidEqualTo(String value) {
            addCriterion("StockDetailID =", value, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andStockdetailidNotEqualTo(String value) {
            addCriterion("StockDetailID <>", value, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andStockdetailidGreaterThan(String value) {
            addCriterion("StockDetailID >", value, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andStockdetailidGreaterThanOrEqualTo(String value) {
            addCriterion("StockDetailID >=", value, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andStockdetailidLessThan(String value) {
            addCriterion("StockDetailID <", value, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andStockdetailidLessThanOrEqualTo(String value) {
            addCriterion("StockDetailID <=", value, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andStockdetailidLike(String value) {
            addCriterion("StockDetailID like", value, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andStockdetailidNotLike(String value) {
            addCriterion("StockDetailID not like", value, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andStockdetailidIn(List<String> values) {
            addCriterion("StockDetailID in", values, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andStockdetailidNotIn(List<String> values) {
            addCriterion("StockDetailID not in", values, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andStockdetailidBetween(String value1, String value2) {
            addCriterion("StockDetailID between", value1, value2, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andStockdetailidNotBetween(String value1, String value2) {
            addCriterion("StockDetailID not between", value1, value2, "stockdetailid");
            return (Criteria) this;
        }

        public Criteria andIndexnoIsNull() {
            addCriterion("IndexNo is null");
            return (Criteria) this;
        }

        public Criteria andIndexnoIsNotNull() {
            addCriterion("IndexNo is not null");
            return (Criteria) this;
        }

        public Criteria andIndexnoEqualTo(Integer value) {
            addCriterion("IndexNo =", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoNotEqualTo(Integer value) {
            addCriterion("IndexNo <>", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoGreaterThan(Integer value) {
            addCriterion("IndexNo >", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("IndexNo >=", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoLessThan(Integer value) {
            addCriterion("IndexNo <", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoLessThanOrEqualTo(Integer value) {
            addCriterion("IndexNo <=", value, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoIn(List<Integer> values) {
            addCriterion("IndexNo in", values, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoNotIn(List<Integer> values) {
            addCriterion("IndexNo not in", values, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoBetween(Integer value1, Integer value2) {
            addCriterion("IndexNo between", value1, value2, "indexno");
            return (Criteria) this;
        }

        public Criteria andIndexnoNotBetween(Integer value1, Integer value2) {
            addCriterion("IndexNo not between", value1, value2, "indexno");
            return (Criteria) this;
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

        public Criteria andBoxqtyIsNull() {
            addCriterion("BoxQty is null");
            return (Criteria) this;
        }

        public Criteria andBoxqtyIsNotNull() {
            addCriterion("BoxQty is not null");
            return (Criteria) this;
        }

        public Criteria andBoxqtyEqualTo(Integer value) {
            addCriterion("BoxQty =", value, "boxqty");
            return (Criteria) this;
        }

        public Criteria andBoxqtyNotEqualTo(Integer value) {
            addCriterion("BoxQty <>", value, "boxqty");
            return (Criteria) this;
        }

        public Criteria andBoxqtyGreaterThan(Integer value) {
            addCriterion("BoxQty >", value, "boxqty");
            return (Criteria) this;
        }

        public Criteria andBoxqtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("BoxQty >=", value, "boxqty");
            return (Criteria) this;
        }

        public Criteria andBoxqtyLessThan(Integer value) {
            addCriterion("BoxQty <", value, "boxqty");
            return (Criteria) this;
        }

        public Criteria andBoxqtyLessThanOrEqualTo(Integer value) {
            addCriterion("BoxQty <=", value, "boxqty");
            return (Criteria) this;
        }

        public Criteria andBoxqtyIn(List<Integer> values) {
            addCriterion("BoxQty in", values, "boxqty");
            return (Criteria) this;
        }

        public Criteria andBoxqtyNotIn(List<Integer> values) {
            addCriterion("BoxQty not in", values, "boxqty");
            return (Criteria) this;
        }

        public Criteria andBoxqtyBetween(Integer value1, Integer value2) {
            addCriterion("BoxQty between", value1, value2, "boxqty");
            return (Criteria) this;
        }

        public Criteria andBoxqtyNotBetween(Integer value1, Integer value2) {
            addCriterion("BoxQty not between", value1, value2, "boxqty");
            return (Criteria) this;
        }

        public Criteria andX1IsNull() {
            addCriterion("x_1 is null");
            return (Criteria) this;
        }

        public Criteria andX1IsNotNull() {
            addCriterion("x_1 is not null");
            return (Criteria) this;
        }

        public Criteria andX1EqualTo(Integer value) {
            addCriterion("x_1 =", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotEqualTo(Integer value) {
            addCriterion("x_1 <>", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1GreaterThan(Integer value) {
            addCriterion("x_1 >", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_1 >=", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1LessThan(Integer value) {
            addCriterion("x_1 <", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1LessThanOrEqualTo(Integer value) {
            addCriterion("x_1 <=", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1In(List<Integer> values) {
            addCriterion("x_1 in", values, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotIn(List<Integer> values) {
            addCriterion("x_1 not in", values, "x1");
            return (Criteria) this;
        }

        public Criteria andX1Between(Integer value1, Integer value2) {
            addCriterion("x_1 between", value1, value2, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotBetween(Integer value1, Integer value2) {
            addCriterion("x_1 not between", value1, value2, "x1");
            return (Criteria) this;
        }

        public Criteria andX2IsNull() {
            addCriterion("x_2 is null");
            return (Criteria) this;
        }

        public Criteria andX2IsNotNull() {
            addCriterion("x_2 is not null");
            return (Criteria) this;
        }

        public Criteria andX2EqualTo(Integer value) {
            addCriterion("x_2 =", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotEqualTo(Integer value) {
            addCriterion("x_2 <>", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2GreaterThan(Integer value) {
            addCriterion("x_2 >", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_2 >=", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2LessThan(Integer value) {
            addCriterion("x_2 <", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2LessThanOrEqualTo(Integer value) {
            addCriterion("x_2 <=", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2In(List<Integer> values) {
            addCriterion("x_2 in", values, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotIn(List<Integer> values) {
            addCriterion("x_2 not in", values, "x2");
            return (Criteria) this;
        }

        public Criteria andX2Between(Integer value1, Integer value2) {
            addCriterion("x_2 between", value1, value2, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotBetween(Integer value1, Integer value2) {
            addCriterion("x_2 not between", value1, value2, "x2");
            return (Criteria) this;
        }

        public Criteria andX3IsNull() {
            addCriterion("x_3 is null");
            return (Criteria) this;
        }

        public Criteria andX3IsNotNull() {
            addCriterion("x_3 is not null");
            return (Criteria) this;
        }

        public Criteria andX3EqualTo(Integer value) {
            addCriterion("x_3 =", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3NotEqualTo(Integer value) {
            addCriterion("x_3 <>", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3GreaterThan(Integer value) {
            addCriterion("x_3 >", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_3 >=", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3LessThan(Integer value) {
            addCriterion("x_3 <", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3LessThanOrEqualTo(Integer value) {
            addCriterion("x_3 <=", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3In(List<Integer> values) {
            addCriterion("x_3 in", values, "x3");
            return (Criteria) this;
        }

        public Criteria andX3NotIn(List<Integer> values) {
            addCriterion("x_3 not in", values, "x3");
            return (Criteria) this;
        }

        public Criteria andX3Between(Integer value1, Integer value2) {
            addCriterion("x_3 between", value1, value2, "x3");
            return (Criteria) this;
        }

        public Criteria andX3NotBetween(Integer value1, Integer value2) {
            addCriterion("x_3 not between", value1, value2, "x3");
            return (Criteria) this;
        }

        public Criteria andX4IsNull() {
            addCriterion("x_4 is null");
            return (Criteria) this;
        }

        public Criteria andX4IsNotNull() {
            addCriterion("x_4 is not null");
            return (Criteria) this;
        }

        public Criteria andX4EqualTo(Integer value) {
            addCriterion("x_4 =", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4NotEqualTo(Integer value) {
            addCriterion("x_4 <>", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4GreaterThan(Integer value) {
            addCriterion("x_4 >", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_4 >=", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4LessThan(Integer value) {
            addCriterion("x_4 <", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4LessThanOrEqualTo(Integer value) {
            addCriterion("x_4 <=", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4In(List<Integer> values) {
            addCriterion("x_4 in", values, "x4");
            return (Criteria) this;
        }

        public Criteria andX4NotIn(List<Integer> values) {
            addCriterion("x_4 not in", values, "x4");
            return (Criteria) this;
        }

        public Criteria andX4Between(Integer value1, Integer value2) {
            addCriterion("x_4 between", value1, value2, "x4");
            return (Criteria) this;
        }

        public Criteria andX4NotBetween(Integer value1, Integer value2) {
            addCriterion("x_4 not between", value1, value2, "x4");
            return (Criteria) this;
        }

        public Criteria andX5IsNull() {
            addCriterion("x_5 is null");
            return (Criteria) this;
        }

        public Criteria andX5IsNotNull() {
            addCriterion("x_5 is not null");
            return (Criteria) this;
        }

        public Criteria andX5EqualTo(Integer value) {
            addCriterion("x_5 =", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5NotEqualTo(Integer value) {
            addCriterion("x_5 <>", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5GreaterThan(Integer value) {
            addCriterion("x_5 >", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_5 >=", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5LessThan(Integer value) {
            addCriterion("x_5 <", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5LessThanOrEqualTo(Integer value) {
            addCriterion("x_5 <=", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5In(List<Integer> values) {
            addCriterion("x_5 in", values, "x5");
            return (Criteria) this;
        }

        public Criteria andX5NotIn(List<Integer> values) {
            addCriterion("x_5 not in", values, "x5");
            return (Criteria) this;
        }

        public Criteria andX5Between(Integer value1, Integer value2) {
            addCriterion("x_5 between", value1, value2, "x5");
            return (Criteria) this;
        }

        public Criteria andX5NotBetween(Integer value1, Integer value2) {
            addCriterion("x_5 not between", value1, value2, "x5");
            return (Criteria) this;
        }

        public Criteria andX6IsNull() {
            addCriterion("x_6 is null");
            return (Criteria) this;
        }

        public Criteria andX6IsNotNull() {
            addCriterion("x_6 is not null");
            return (Criteria) this;
        }

        public Criteria andX6EqualTo(Integer value) {
            addCriterion("x_6 =", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6NotEqualTo(Integer value) {
            addCriterion("x_6 <>", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6GreaterThan(Integer value) {
            addCriterion("x_6 >", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_6 >=", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6LessThan(Integer value) {
            addCriterion("x_6 <", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6LessThanOrEqualTo(Integer value) {
            addCriterion("x_6 <=", value, "x6");
            return (Criteria) this;
        }

        public Criteria andX6In(List<Integer> values) {
            addCriterion("x_6 in", values, "x6");
            return (Criteria) this;
        }

        public Criteria andX6NotIn(List<Integer> values) {
            addCriterion("x_6 not in", values, "x6");
            return (Criteria) this;
        }

        public Criteria andX6Between(Integer value1, Integer value2) {
            addCriterion("x_6 between", value1, value2, "x6");
            return (Criteria) this;
        }

        public Criteria andX6NotBetween(Integer value1, Integer value2) {
            addCriterion("x_6 not between", value1, value2, "x6");
            return (Criteria) this;
        }

        public Criteria andX7IsNull() {
            addCriterion("x_7 is null");
            return (Criteria) this;
        }

        public Criteria andX7IsNotNull() {
            addCriterion("x_7 is not null");
            return (Criteria) this;
        }

        public Criteria andX7EqualTo(Integer value) {
            addCriterion("x_7 =", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7NotEqualTo(Integer value) {
            addCriterion("x_7 <>", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7GreaterThan(Integer value) {
            addCriterion("x_7 >", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_7 >=", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7LessThan(Integer value) {
            addCriterion("x_7 <", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7LessThanOrEqualTo(Integer value) {
            addCriterion("x_7 <=", value, "x7");
            return (Criteria) this;
        }

        public Criteria andX7In(List<Integer> values) {
            addCriterion("x_7 in", values, "x7");
            return (Criteria) this;
        }

        public Criteria andX7NotIn(List<Integer> values) {
            addCriterion("x_7 not in", values, "x7");
            return (Criteria) this;
        }

        public Criteria andX7Between(Integer value1, Integer value2) {
            addCriterion("x_7 between", value1, value2, "x7");
            return (Criteria) this;
        }

        public Criteria andX7NotBetween(Integer value1, Integer value2) {
            addCriterion("x_7 not between", value1, value2, "x7");
            return (Criteria) this;
        }

        public Criteria andX8IsNull() {
            addCriterion("x_8 is null");
            return (Criteria) this;
        }

        public Criteria andX8IsNotNull() {
            addCriterion("x_8 is not null");
            return (Criteria) this;
        }

        public Criteria andX8EqualTo(Integer value) {
            addCriterion("x_8 =", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8NotEqualTo(Integer value) {
            addCriterion("x_8 <>", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8GreaterThan(Integer value) {
            addCriterion("x_8 >", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_8 >=", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8LessThan(Integer value) {
            addCriterion("x_8 <", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8LessThanOrEqualTo(Integer value) {
            addCriterion("x_8 <=", value, "x8");
            return (Criteria) this;
        }

        public Criteria andX8In(List<Integer> values) {
            addCriterion("x_8 in", values, "x8");
            return (Criteria) this;
        }

        public Criteria andX8NotIn(List<Integer> values) {
            addCriterion("x_8 not in", values, "x8");
            return (Criteria) this;
        }

        public Criteria andX8Between(Integer value1, Integer value2) {
            addCriterion("x_8 between", value1, value2, "x8");
            return (Criteria) this;
        }

        public Criteria andX8NotBetween(Integer value1, Integer value2) {
            addCriterion("x_8 not between", value1, value2, "x8");
            return (Criteria) this;
        }

        public Criteria andX9IsNull() {
            addCriterion("x_9 is null");
            return (Criteria) this;
        }

        public Criteria andX9IsNotNull() {
            addCriterion("x_9 is not null");
            return (Criteria) this;
        }

        public Criteria andX9EqualTo(Integer value) {
            addCriterion("x_9 =", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9NotEqualTo(Integer value) {
            addCriterion("x_9 <>", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9GreaterThan(Integer value) {
            addCriterion("x_9 >", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_9 >=", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9LessThan(Integer value) {
            addCriterion("x_9 <", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9LessThanOrEqualTo(Integer value) {
            addCriterion("x_9 <=", value, "x9");
            return (Criteria) this;
        }

        public Criteria andX9In(List<Integer> values) {
            addCriterion("x_9 in", values, "x9");
            return (Criteria) this;
        }

        public Criteria andX9NotIn(List<Integer> values) {
            addCriterion("x_9 not in", values, "x9");
            return (Criteria) this;
        }

        public Criteria andX9Between(Integer value1, Integer value2) {
            addCriterion("x_9 between", value1, value2, "x9");
            return (Criteria) this;
        }

        public Criteria andX9NotBetween(Integer value1, Integer value2) {
            addCriterion("x_9 not between", value1, value2, "x9");
            return (Criteria) this;
        }

        public Criteria andX10IsNull() {
            addCriterion("x_10 is null");
            return (Criteria) this;
        }

        public Criteria andX10IsNotNull() {
            addCriterion("x_10 is not null");
            return (Criteria) this;
        }

        public Criteria andX10EqualTo(Integer value) {
            addCriterion("x_10 =", value, "x10");
            return (Criteria) this;
        }

        public Criteria andX10NotEqualTo(Integer value) {
            addCriterion("x_10 <>", value, "x10");
            return (Criteria) this;
        }

        public Criteria andX10GreaterThan(Integer value) {
            addCriterion("x_10 >", value, "x10");
            return (Criteria) this;
        }

        public Criteria andX10GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_10 >=", value, "x10");
            return (Criteria) this;
        }

        public Criteria andX10LessThan(Integer value) {
            addCriterion("x_10 <", value, "x10");
            return (Criteria) this;
        }

        public Criteria andX10LessThanOrEqualTo(Integer value) {
            addCriterion("x_10 <=", value, "x10");
            return (Criteria) this;
        }

        public Criteria andX10In(List<Integer> values) {
            addCriterion("x_10 in", values, "x10");
            return (Criteria) this;
        }

        public Criteria andX10NotIn(List<Integer> values) {
            addCriterion("x_10 not in", values, "x10");
            return (Criteria) this;
        }

        public Criteria andX10Between(Integer value1, Integer value2) {
            addCriterion("x_10 between", value1, value2, "x10");
            return (Criteria) this;
        }

        public Criteria andX10NotBetween(Integer value1, Integer value2) {
            addCriterion("x_10 not between", value1, value2, "x10");
            return (Criteria) this;
        }

        public Criteria andX11IsNull() {
            addCriterion("x_11 is null");
            return (Criteria) this;
        }

        public Criteria andX11IsNotNull() {
            addCriterion("x_11 is not null");
            return (Criteria) this;
        }

        public Criteria andX11EqualTo(Integer value) {
            addCriterion("x_11 =", value, "x11");
            return (Criteria) this;
        }

        public Criteria andX11NotEqualTo(Integer value) {
            addCriterion("x_11 <>", value, "x11");
            return (Criteria) this;
        }

        public Criteria andX11GreaterThan(Integer value) {
            addCriterion("x_11 >", value, "x11");
            return (Criteria) this;
        }

        public Criteria andX11GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_11 >=", value, "x11");
            return (Criteria) this;
        }

        public Criteria andX11LessThan(Integer value) {
            addCriterion("x_11 <", value, "x11");
            return (Criteria) this;
        }

        public Criteria andX11LessThanOrEqualTo(Integer value) {
            addCriterion("x_11 <=", value, "x11");
            return (Criteria) this;
        }

        public Criteria andX11In(List<Integer> values) {
            addCriterion("x_11 in", values, "x11");
            return (Criteria) this;
        }

        public Criteria andX11NotIn(List<Integer> values) {
            addCriterion("x_11 not in", values, "x11");
            return (Criteria) this;
        }

        public Criteria andX11Between(Integer value1, Integer value2) {
            addCriterion("x_11 between", value1, value2, "x11");
            return (Criteria) this;
        }

        public Criteria andX11NotBetween(Integer value1, Integer value2) {
            addCriterion("x_11 not between", value1, value2, "x11");
            return (Criteria) this;
        }

        public Criteria andX12IsNull() {
            addCriterion("x_12 is null");
            return (Criteria) this;
        }

        public Criteria andX12IsNotNull() {
            addCriterion("x_12 is not null");
            return (Criteria) this;
        }

        public Criteria andX12EqualTo(Integer value) {
            addCriterion("x_12 =", value, "x12");
            return (Criteria) this;
        }

        public Criteria andX12NotEqualTo(Integer value) {
            addCriterion("x_12 <>", value, "x12");
            return (Criteria) this;
        }

        public Criteria andX12GreaterThan(Integer value) {
            addCriterion("x_12 >", value, "x12");
            return (Criteria) this;
        }

        public Criteria andX12GreaterThanOrEqualTo(Integer value) {
            addCriterion("x_12 >=", value, "x12");
            return (Criteria) this;
        }

        public Criteria andX12LessThan(Integer value) {
            addCriterion("x_12 <", value, "x12");
            return (Criteria) this;
        }

        public Criteria andX12LessThanOrEqualTo(Integer value) {
            addCriterion("x_12 <=", value, "x12");
            return (Criteria) this;
        }

        public Criteria andX12In(List<Integer> values) {
            addCriterion("x_12 in", values, "x12");
            return (Criteria) this;
        }

        public Criteria andX12NotIn(List<Integer> values) {
            addCriterion("x_12 not in", values, "x12");
            return (Criteria) this;
        }

        public Criteria andX12Between(Integer value1, Integer value2) {
            addCriterion("x_12 between", value1, value2, "x12");
            return (Criteria) this;
        }

        public Criteria andX12NotBetween(Integer value1, Integer value2) {
            addCriterion("x_12 not between", value1, value2, "x12");
            return (Criteria) this;
        }

        public Criteria andStorageidIsNull() {
            addCriterion("StorageID is null");
            return (Criteria) this;
        }

        public Criteria andStorageidIsNotNull() {
            addCriterion("StorageID is not null");
            return (Criteria) this;
        }

        public Criteria andStorageidEqualTo(String value) {
            addCriterion("StorageID =", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotEqualTo(String value) {
            addCriterion("StorageID <>", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThan(String value) {
            addCriterion("StorageID >", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThanOrEqualTo(String value) {
            addCriterion("StorageID >=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThan(String value) {
            addCriterion("StorageID <", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThanOrEqualTo(String value) {
            addCriterion("StorageID <=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLike(String value) {
            addCriterion("StorageID like", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotLike(String value) {
            addCriterion("StorageID not like", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidIn(List<String> values) {
            addCriterion("StorageID in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotIn(List<String> values) {
            addCriterion("StorageID not in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidBetween(String value1, String value2) {
            addCriterion("StorageID between", value1, value2, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotBetween(String value1, String value2) {
            addCriterion("StorageID not between", value1, value2, "storageid");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceIsNull() {
            addCriterion("RelationUnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceIsNotNull() {
            addCriterion("RelationUnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceEqualTo(BigDecimal value) {
            addCriterion("RelationUnitPrice =", value, "relationunitprice");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceNotEqualTo(BigDecimal value) {
            addCriterion("RelationUnitPrice <>", value, "relationunitprice");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceGreaterThan(BigDecimal value) {
            addCriterion("RelationUnitPrice >", value, "relationunitprice");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RelationUnitPrice >=", value, "relationunitprice");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceLessThan(BigDecimal value) {
            addCriterion("RelationUnitPrice <", value, "relationunitprice");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RelationUnitPrice <=", value, "relationunitprice");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceIn(List<BigDecimal> values) {
            addCriterion("RelationUnitPrice in", values, "relationunitprice");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceNotIn(List<BigDecimal> values) {
            addCriterion("RelationUnitPrice not in", values, "relationunitprice");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RelationUnitPrice between", value1, value2, "relationunitprice");
            return (Criteria) this;
        }

        public Criteria andRelationunitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RelationUnitPrice not between", value1, value2, "relationunitprice");
            return (Criteria) this;
        }

        public Criteria andRelationamountIsNull() {
            addCriterion("RelationAmount is null");
            return (Criteria) this;
        }

        public Criteria andRelationamountIsNotNull() {
            addCriterion("RelationAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRelationamountEqualTo(BigDecimal value) {
            addCriterion("RelationAmount =", value, "relationamount");
            return (Criteria) this;
        }

        public Criteria andRelationamountNotEqualTo(BigDecimal value) {
            addCriterion("RelationAmount <>", value, "relationamount");
            return (Criteria) this;
        }

        public Criteria andRelationamountGreaterThan(BigDecimal value) {
            addCriterion("RelationAmount >", value, "relationamount");
            return (Criteria) this;
        }

        public Criteria andRelationamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RelationAmount >=", value, "relationamount");
            return (Criteria) this;
        }

        public Criteria andRelationamountLessThan(BigDecimal value) {
            addCriterion("RelationAmount <", value, "relationamount");
            return (Criteria) this;
        }

        public Criteria andRelationamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RelationAmount <=", value, "relationamount");
            return (Criteria) this;
        }

        public Criteria andRelationamountIn(List<BigDecimal> values) {
            addCriterion("RelationAmount in", values, "relationamount");
            return (Criteria) this;
        }

        public Criteria andRelationamountNotIn(List<BigDecimal> values) {
            addCriterion("RelationAmount not in", values, "relationamount");
            return (Criteria) this;
        }

        public Criteria andRelationamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RelationAmount between", value1, value2, "relationamount");
            return (Criteria) this;
        }

        public Criteria andRelationamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RelationAmount not between", value1, value2, "relationamount");
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

        public Criteria andRelationcustcodeIsNull() {
            addCriterion("RelationCustCode is null");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeIsNotNull() {
            addCriterion("RelationCustCode is not null");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeEqualTo(String value) {
            addCriterion("RelationCustCode =", value, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeNotEqualTo(String value) {
            addCriterion("RelationCustCode <>", value, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeGreaterThan(String value) {
            addCriterion("RelationCustCode >", value, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RelationCustCode >=", value, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeLessThan(String value) {
            addCriterion("RelationCustCode <", value, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeLessThanOrEqualTo(String value) {
            addCriterion("RelationCustCode <=", value, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeLike(String value) {
            addCriterion("RelationCustCode like", value, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeNotLike(String value) {
            addCriterion("RelationCustCode not like", value, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeIn(List<String> values) {
            addCriterion("RelationCustCode in", values, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeNotIn(List<String> values) {
            addCriterion("RelationCustCode not in", values, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeBetween(String value1, String value2) {
            addCriterion("RelationCustCode between", value1, value2, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationcustcodeNotBetween(String value1, String value2) {
            addCriterion("RelationCustCode not between", value1, value2, "relationcustcode");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidIsNull() {
            addCriterion("RelationSalesOrderID is null");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidIsNotNull() {
            addCriterion("RelationSalesOrderID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidEqualTo(String value) {
            addCriterion("RelationSalesOrderID =", value, "relationsalesorderid");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidNotEqualTo(String value) {
            addCriterion("RelationSalesOrderID <>", value, "relationsalesorderid");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidGreaterThan(String value) {
            addCriterion("RelationSalesOrderID >", value, "relationsalesorderid");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidGreaterThanOrEqualTo(String value) {
            addCriterion("RelationSalesOrderID >=", value, "relationsalesorderid");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidLessThan(String value) {
            addCriterion("RelationSalesOrderID <", value, "relationsalesorderid");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidLessThanOrEqualTo(String value) {
            addCriterion("RelationSalesOrderID <=", value, "relationsalesorderid");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidLike(String value) {
            addCriterion("RelationSalesOrderID like", value, "relationsalesorderid");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidNotLike(String value) {
            addCriterion("RelationSalesOrderID not like", value, "relationsalesorderid");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidIn(List<String> values) {
            addCriterion("RelationSalesOrderID in", values, "relationsalesorderid");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidNotIn(List<String> values) {
            addCriterion("RelationSalesOrderID not in", values, "relationsalesorderid");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidBetween(String value1, String value2) {
            addCriterion("RelationSalesOrderID between", value1, value2, "relationsalesorderid");
            return (Criteria) this;
        }

        public Criteria andRelationsalesorderidNotBetween(String value1, String value2) {
            addCriterion("RelationSalesOrderID not between", value1, value2, "relationsalesorderid");
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

        public Criteria andRetailamountIsNull() {
            addCriterion("RetailAmount is null");
            return (Criteria) this;
        }

        public Criteria andRetailamountIsNotNull() {
            addCriterion("RetailAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRetailamountEqualTo(BigDecimal value) {
            addCriterion("RetailAmount =", value, "retailamount");
            return (Criteria) this;
        }

        public Criteria andRetailamountNotEqualTo(BigDecimal value) {
            addCriterion("RetailAmount <>", value, "retailamount");
            return (Criteria) this;
        }

        public Criteria andRetailamountGreaterThan(BigDecimal value) {
            addCriterion("RetailAmount >", value, "retailamount");
            return (Criteria) this;
        }

        public Criteria andRetailamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailAmount >=", value, "retailamount");
            return (Criteria) this;
        }

        public Criteria andRetailamountLessThan(BigDecimal value) {
            addCriterion("RetailAmount <", value, "retailamount");
            return (Criteria) this;
        }

        public Criteria andRetailamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RetailAmount <=", value, "retailamount");
            return (Criteria) this;
        }

        public Criteria andRetailamountIn(List<BigDecimal> values) {
            addCriterion("RetailAmount in", values, "retailamount");
            return (Criteria) this;
        }

        public Criteria andRetailamountNotIn(List<BigDecimal> values) {
            addCriterion("RetailAmount not in", values, "retailamount");
            return (Criteria) this;
        }

        public Criteria andRetailamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailAmount between", value1, value2, "retailamount");
            return (Criteria) this;
        }

        public Criteria andRetailamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RetailAmount not between", value1, value2, "retailamount");
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

        public Criteria andPurchaseamountIsNull() {
            addCriterion("PurchaseAmount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIsNotNull() {
            addCriterion("PurchaseAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmount =", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmount <>", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThan(BigDecimal value) {
            addCriterion("PurchaseAmount >", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmount >=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThan(BigDecimal value) {
            addCriterion("PurchaseAmount <", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchaseAmount <=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIn(List<BigDecimal> values) {
            addCriterion("PurchaseAmount in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotIn(List<BigDecimal> values) {
            addCriterion("PurchaseAmount not in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchaseAmount between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchaseAmount not between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andGoodskindIsNull() {
            addCriterion("GoodsKind is null");
            return (Criteria) this;
        }

        public Criteria andGoodskindIsNotNull() {
            addCriterion("GoodsKind is not null");
            return (Criteria) this;
        }

        public Criteria andGoodskindEqualTo(String value) {
            addCriterion("GoodsKind =", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindNotEqualTo(String value) {
            addCriterion("GoodsKind <>", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindGreaterThan(String value) {
            addCriterion("GoodsKind >", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsKind >=", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindLessThan(String value) {
            addCriterion("GoodsKind <", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindLessThanOrEqualTo(String value) {
            addCriterion("GoodsKind <=", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindLike(String value) {
            addCriterion("GoodsKind like", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindNotLike(String value) {
            addCriterion("GoodsKind not like", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindIn(List<String> values) {
            addCriterion("GoodsKind in", values, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindNotIn(List<String> values) {
            addCriterion("GoodsKind not in", values, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindBetween(String value1, String value2) {
            addCriterion("GoodsKind between", value1, value2, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindNotBetween(String value1, String value2) {
            addCriterion("GoodsKind not between", value1, value2, "goodskind");
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

        public Criteria andField1IsNull() {
            addCriterion("Field1 is null");
            return (Criteria) this;
        }

        public Criteria andField1IsNotNull() {
            addCriterion("Field1 is not null");
            return (Criteria) this;
        }

        public Criteria andField1EqualTo(String value) {
            addCriterion("Field1 =", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotEqualTo(String value) {
            addCriterion("Field1 <>", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThan(String value) {
            addCriterion("Field1 >", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThanOrEqualTo(String value) {
            addCriterion("Field1 >=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThan(String value) {
            addCriterion("Field1 <", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThanOrEqualTo(String value) {
            addCriterion("Field1 <=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Like(String value) {
            addCriterion("Field1 like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotLike(String value) {
            addCriterion("Field1 not like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1In(List<String> values) {
            addCriterion("Field1 in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotIn(List<String> values) {
            addCriterion("Field1 not in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Between(String value1, String value2) {
            addCriterion("Field1 between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotBetween(String value1, String value2) {
            addCriterion("Field1 not between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField2IsNull() {
            addCriterion("Field2 is null");
            return (Criteria) this;
        }

        public Criteria andField2IsNotNull() {
            addCriterion("Field2 is not null");
            return (Criteria) this;
        }

        public Criteria andField2EqualTo(String value) {
            addCriterion("Field2 =", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotEqualTo(String value) {
            addCriterion("Field2 <>", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThan(String value) {
            addCriterion("Field2 >", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThanOrEqualTo(String value) {
            addCriterion("Field2 >=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThan(String value) {
            addCriterion("Field2 <", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThanOrEqualTo(String value) {
            addCriterion("Field2 <=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2Like(String value) {
            addCriterion("Field2 like", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotLike(String value) {
            addCriterion("Field2 not like", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2In(List<String> values) {
            addCriterion("Field2 in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotIn(List<String> values) {
            addCriterion("Field2 not in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2Between(String value1, String value2) {
            addCriterion("Field2 between", value1, value2, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotBetween(String value1, String value2) {
            addCriterion("Field2 not between", value1, value2, "field2");
            return (Criteria) this;
        }

        public Criteria andField3IsNull() {
            addCriterion("Field3 is null");
            return (Criteria) this;
        }

        public Criteria andField3IsNotNull() {
            addCriterion("Field3 is not null");
            return (Criteria) this;
        }

        public Criteria andField3EqualTo(String value) {
            addCriterion("Field3 =", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotEqualTo(String value) {
            addCriterion("Field3 <>", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThan(String value) {
            addCriterion("Field3 >", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThanOrEqualTo(String value) {
            addCriterion("Field3 >=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThan(String value) {
            addCriterion("Field3 <", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThanOrEqualTo(String value) {
            addCriterion("Field3 <=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Like(String value) {
            addCriterion("Field3 like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotLike(String value) {
            addCriterion("Field3 not like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3In(List<String> values) {
            addCriterion("Field3 in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotIn(List<String> values) {
            addCriterion("Field3 not in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Between(String value1, String value2) {
            addCriterion("Field3 between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotBetween(String value1, String value2) {
            addCriterion("Field3 not between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField4IsNull() {
            addCriterion("Field4 is null");
            return (Criteria) this;
        }

        public Criteria andField4IsNotNull() {
            addCriterion("Field4 is not null");
            return (Criteria) this;
        }

        public Criteria andField4EqualTo(String value) {
            addCriterion("Field4 =", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotEqualTo(String value) {
            addCriterion("Field4 <>", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThan(String value) {
            addCriterion("Field4 >", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThanOrEqualTo(String value) {
            addCriterion("Field4 >=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThan(String value) {
            addCriterion("Field4 <", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThanOrEqualTo(String value) {
            addCriterion("Field4 <=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Like(String value) {
            addCriterion("Field4 like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotLike(String value) {
            addCriterion("Field4 not like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4In(List<String> values) {
            addCriterion("Field4 in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotIn(List<String> values) {
            addCriterion("Field4 not in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Between(String value1, String value2) {
            addCriterion("Field4 between", value1, value2, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotBetween(String value1, String value2) {
            addCriterion("Field4 not between", value1, value2, "field4");
            return (Criteria) this;
        }

        public Criteria andField5IsNull() {
            addCriterion("Field5 is null");
            return (Criteria) this;
        }

        public Criteria andField5IsNotNull() {
            addCriterion("Field5 is not null");
            return (Criteria) this;
        }

        public Criteria andField5EqualTo(String value) {
            addCriterion("Field5 =", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotEqualTo(String value) {
            addCriterion("Field5 <>", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5GreaterThan(String value) {
            addCriterion("Field5 >", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5GreaterThanOrEqualTo(String value) {
            addCriterion("Field5 >=", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5LessThan(String value) {
            addCriterion("Field5 <", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5LessThanOrEqualTo(String value) {
            addCriterion("Field5 <=", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5Like(String value) {
            addCriterion("Field5 like", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotLike(String value) {
            addCriterion("Field5 not like", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5In(List<String> values) {
            addCriterion("Field5 in", values, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotIn(List<String> values) {
            addCriterion("Field5 not in", values, "field5");
            return (Criteria) this;
        }

        public Criteria andField5Between(String value1, String value2) {
            addCriterion("Field5 between", value1, value2, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotBetween(String value1, String value2) {
            addCriterion("Field5 not between", value1, value2, "field5");
            return (Criteria) this;
        }

        public Criteria andField6IsNull() {
            addCriterion("Field6 is null");
            return (Criteria) this;
        }

        public Criteria andField6IsNotNull() {
            addCriterion("Field6 is not null");
            return (Criteria) this;
        }

        public Criteria andField6EqualTo(String value) {
            addCriterion("Field6 =", value, "field6");
            return (Criteria) this;
        }

        public Criteria andField6NotEqualTo(String value) {
            addCriterion("Field6 <>", value, "field6");
            return (Criteria) this;
        }

        public Criteria andField6GreaterThan(String value) {
            addCriterion("Field6 >", value, "field6");
            return (Criteria) this;
        }

        public Criteria andField6GreaterThanOrEqualTo(String value) {
            addCriterion("Field6 >=", value, "field6");
            return (Criteria) this;
        }

        public Criteria andField6LessThan(String value) {
            addCriterion("Field6 <", value, "field6");
            return (Criteria) this;
        }

        public Criteria andField6LessThanOrEqualTo(String value) {
            addCriterion("Field6 <=", value, "field6");
            return (Criteria) this;
        }

        public Criteria andField6Like(String value) {
            addCriterion("Field6 like", value, "field6");
            return (Criteria) this;
        }

        public Criteria andField6NotLike(String value) {
            addCriterion("Field6 not like", value, "field6");
            return (Criteria) this;
        }

        public Criteria andField6In(List<String> values) {
            addCriterion("Field6 in", values, "field6");
            return (Criteria) this;
        }

        public Criteria andField6NotIn(List<String> values) {
            addCriterion("Field6 not in", values, "field6");
            return (Criteria) this;
        }

        public Criteria andField6Between(String value1, String value2) {
            addCriterion("Field6 between", value1, value2, "field6");
            return (Criteria) this;
        }

        public Criteria andField6NotBetween(String value1, String value2) {
            addCriterion("Field6 not between", value1, value2, "field6");
            return (Criteria) this;
        }

        public Criteria andField7IsNull() {
            addCriterion("Field7 is null");
            return (Criteria) this;
        }

        public Criteria andField7IsNotNull() {
            addCriterion("Field7 is not null");
            return (Criteria) this;
        }

        public Criteria andField7EqualTo(String value) {
            addCriterion("Field7 =", value, "field7");
            return (Criteria) this;
        }

        public Criteria andField7NotEqualTo(String value) {
            addCriterion("Field7 <>", value, "field7");
            return (Criteria) this;
        }

        public Criteria andField7GreaterThan(String value) {
            addCriterion("Field7 >", value, "field7");
            return (Criteria) this;
        }

        public Criteria andField7GreaterThanOrEqualTo(String value) {
            addCriterion("Field7 >=", value, "field7");
            return (Criteria) this;
        }

        public Criteria andField7LessThan(String value) {
            addCriterion("Field7 <", value, "field7");
            return (Criteria) this;
        }

        public Criteria andField7LessThanOrEqualTo(String value) {
            addCriterion("Field7 <=", value, "field7");
            return (Criteria) this;
        }

        public Criteria andField7Like(String value) {
            addCriterion("Field7 like", value, "field7");
            return (Criteria) this;
        }

        public Criteria andField7NotLike(String value) {
            addCriterion("Field7 not like", value, "field7");
            return (Criteria) this;
        }

        public Criteria andField7In(List<String> values) {
            addCriterion("Field7 in", values, "field7");
            return (Criteria) this;
        }

        public Criteria andField7NotIn(List<String> values) {
            addCriterion("Field7 not in", values, "field7");
            return (Criteria) this;
        }

        public Criteria andField7Between(String value1, String value2) {
            addCriterion("Field7 between", value1, value2, "field7");
            return (Criteria) this;
        }

        public Criteria andField7NotBetween(String value1, String value2) {
            addCriterion("Field7 not between", value1, value2, "field7");
            return (Criteria) this;
        }

        public Criteria andField8IsNull() {
            addCriterion("Field8 is null");
            return (Criteria) this;
        }

        public Criteria andField8IsNotNull() {
            addCriterion("Field8 is not null");
            return (Criteria) this;
        }

        public Criteria andField8EqualTo(String value) {
            addCriterion("Field8 =", value, "field8");
            return (Criteria) this;
        }

        public Criteria andField8NotEqualTo(String value) {
            addCriterion("Field8 <>", value, "field8");
            return (Criteria) this;
        }

        public Criteria andField8GreaterThan(String value) {
            addCriterion("Field8 >", value, "field8");
            return (Criteria) this;
        }

        public Criteria andField8GreaterThanOrEqualTo(String value) {
            addCriterion("Field8 >=", value, "field8");
            return (Criteria) this;
        }

        public Criteria andField8LessThan(String value) {
            addCriterion("Field8 <", value, "field8");
            return (Criteria) this;
        }

        public Criteria andField8LessThanOrEqualTo(String value) {
            addCriterion("Field8 <=", value, "field8");
            return (Criteria) this;
        }

        public Criteria andField8Like(String value) {
            addCriterion("Field8 like", value, "field8");
            return (Criteria) this;
        }

        public Criteria andField8NotLike(String value) {
            addCriterion("Field8 not like", value, "field8");
            return (Criteria) this;
        }

        public Criteria andField8In(List<String> values) {
            addCriterion("Field8 in", values, "field8");
            return (Criteria) this;
        }

        public Criteria andField8NotIn(List<String> values) {
            addCriterion("Field8 not in", values, "field8");
            return (Criteria) this;
        }

        public Criteria andField8Between(String value1, String value2) {
            addCriterion("Field8 between", value1, value2, "field8");
            return (Criteria) this;
        }

        public Criteria andField8NotBetween(String value1, String value2) {
            addCriterion("Field8 not between", value1, value2, "field8");
            return (Criteria) this;
        }

        public Criteria andField9IsNull() {
            addCriterion("Field9 is null");
            return (Criteria) this;
        }

        public Criteria andField9IsNotNull() {
            addCriterion("Field9 is not null");
            return (Criteria) this;
        }

        public Criteria andField9EqualTo(String value) {
            addCriterion("Field9 =", value, "field9");
            return (Criteria) this;
        }

        public Criteria andField9NotEqualTo(String value) {
            addCriterion("Field9 <>", value, "field9");
            return (Criteria) this;
        }

        public Criteria andField9GreaterThan(String value) {
            addCriterion("Field9 >", value, "field9");
            return (Criteria) this;
        }

        public Criteria andField9GreaterThanOrEqualTo(String value) {
            addCriterion("Field9 >=", value, "field9");
            return (Criteria) this;
        }

        public Criteria andField9LessThan(String value) {
            addCriterion("Field9 <", value, "field9");
            return (Criteria) this;
        }

        public Criteria andField9LessThanOrEqualTo(String value) {
            addCriterion("Field9 <=", value, "field9");
            return (Criteria) this;
        }

        public Criteria andField9Like(String value) {
            addCriterion("Field9 like", value, "field9");
            return (Criteria) this;
        }

        public Criteria andField9NotLike(String value) {
            addCriterion("Field9 not like", value, "field9");
            return (Criteria) this;
        }

        public Criteria andField9In(List<String> values) {
            addCriterion("Field9 in", values, "field9");
            return (Criteria) this;
        }

        public Criteria andField9NotIn(List<String> values) {
            addCriterion("Field9 not in", values, "field9");
            return (Criteria) this;
        }

        public Criteria andField9Between(String value1, String value2) {
            addCriterion("Field9 between", value1, value2, "field9");
            return (Criteria) this;
        }

        public Criteria andField9NotBetween(String value1, String value2) {
            addCriterion("Field9 not between", value1, value2, "field9");
            return (Criteria) this;
        }

        public Criteria andFixmoneyIsNull() {
            addCriterion("FixMoney is null");
            return (Criteria) this;
        }

        public Criteria andFixmoneyIsNotNull() {
            addCriterion("FixMoney is not null");
            return (Criteria) this;
        }

        public Criteria andFixmoneyEqualTo(BigDecimal value) {
            addCriterion("FixMoney =", value, "fixmoney");
            return (Criteria) this;
        }

        public Criteria andFixmoneyNotEqualTo(BigDecimal value) {
            addCriterion("FixMoney <>", value, "fixmoney");
            return (Criteria) this;
        }

        public Criteria andFixmoneyGreaterThan(BigDecimal value) {
            addCriterion("FixMoney >", value, "fixmoney");
            return (Criteria) this;
        }

        public Criteria andFixmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FixMoney >=", value, "fixmoney");
            return (Criteria) this;
        }

        public Criteria andFixmoneyLessThan(BigDecimal value) {
            addCriterion("FixMoney <", value, "fixmoney");
            return (Criteria) this;
        }

        public Criteria andFixmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FixMoney <=", value, "fixmoney");
            return (Criteria) this;
        }

        public Criteria andFixmoneyIn(List<BigDecimal> values) {
            addCriterion("FixMoney in", values, "fixmoney");
            return (Criteria) this;
        }

        public Criteria andFixmoneyNotIn(List<BigDecimal> values) {
            addCriterion("FixMoney not in", values, "fixmoney");
            return (Criteria) this;
        }

        public Criteria andFixmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FixMoney between", value1, value2, "fixmoney");
            return (Criteria) this;
        }

        public Criteria andFixmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FixMoney not between", value1, value2, "fixmoney");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidIsNull() {
            addCriterion("WarehouseInID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidIsNotNull() {
            addCriterion("WarehouseInID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidEqualTo(String value) {
            addCriterion("WarehouseInID =", value, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidNotEqualTo(String value) {
            addCriterion("WarehouseInID <>", value, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidGreaterThan(String value) {
            addCriterion("WarehouseInID >", value, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidGreaterThanOrEqualTo(String value) {
            addCriterion("WarehouseInID >=", value, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidLessThan(String value) {
            addCriterion("WarehouseInID <", value, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidLessThanOrEqualTo(String value) {
            addCriterion("WarehouseInID <=", value, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidLike(String value) {
            addCriterion("WarehouseInID like", value, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidNotLike(String value) {
            addCriterion("WarehouseInID not like", value, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidIn(List<String> values) {
            addCriterion("WarehouseInID in", values, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidNotIn(List<String> values) {
            addCriterion("WarehouseInID not in", values, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidBetween(String value1, String value2) {
            addCriterion("WarehouseInID between", value1, value2, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andWarehouseinidNotBetween(String value1, String value2) {
            addCriterion("WarehouseInID not between", value1, value2, "warehouseinid");
            return (Criteria) this;
        }

        public Criteria andDiscountrateIsNull() {
            addCriterion("DiscountRate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountrateIsNotNull() {
            addCriterion("DiscountRate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountrateEqualTo(BigDecimal value) {
            addCriterion("DiscountRate =", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateNotEqualTo(BigDecimal value) {
            addCriterion("DiscountRate <>", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateGreaterThan(BigDecimal value) {
            addCriterion("DiscountRate >", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DiscountRate >=", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateLessThan(BigDecimal value) {
            addCriterion("DiscountRate <", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DiscountRate <=", value, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateIn(List<BigDecimal> values) {
            addCriterion("DiscountRate in", values, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateNotIn(List<BigDecimal> values) {
            addCriterion("DiscountRate not in", values, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DiscountRate between", value1, value2, "discountrate");
            return (Criteria) this;
        }

        public Criteria andDiscountrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DiscountRate not between", value1, value2, "discountrate");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceIsNull() {
            addCriterion("InitUnitPrice is null");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceIsNotNull() {
            addCriterion("InitUnitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceEqualTo(BigDecimal value) {
            addCriterion("InitUnitPrice =", value, "initunitprice");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceNotEqualTo(BigDecimal value) {
            addCriterion("InitUnitPrice <>", value, "initunitprice");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceGreaterThan(BigDecimal value) {
            addCriterion("InitUnitPrice >", value, "initunitprice");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("InitUnitPrice >=", value, "initunitprice");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceLessThan(BigDecimal value) {
            addCriterion("InitUnitPrice <", value, "initunitprice");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("InitUnitPrice <=", value, "initunitprice");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceIn(List<BigDecimal> values) {
            addCriterion("InitUnitPrice in", values, "initunitprice");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceNotIn(List<BigDecimal> values) {
            addCriterion("InitUnitPrice not in", values, "initunitprice");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InitUnitPrice between", value1, value2, "initunitprice");
            return (Criteria) this;
        }

        public Criteria andInitunitpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InitUnitPrice not between", value1, value2, "initunitprice");
            return (Criteria) this;
        }

        public Criteria andSizeindexIsNull() {
            addCriterion("SizeIndex is null");
            return (Criteria) this;
        }

        public Criteria andSizeindexIsNotNull() {
            addCriterion("SizeIndex is not null");
            return (Criteria) this;
        }

        public Criteria andSizeindexEqualTo(Integer value) {
            addCriterion("SizeIndex =", value, "sizeindex");
            return (Criteria) this;
        }

        public Criteria andSizeindexNotEqualTo(Integer value) {
            addCriterion("SizeIndex <>", value, "sizeindex");
            return (Criteria) this;
        }

        public Criteria andSizeindexGreaterThan(Integer value) {
            addCriterion("SizeIndex >", value, "sizeindex");
            return (Criteria) this;
        }

        public Criteria andSizeindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("SizeIndex >=", value, "sizeindex");
            return (Criteria) this;
        }

        public Criteria andSizeindexLessThan(Integer value) {
            addCriterion("SizeIndex <", value, "sizeindex");
            return (Criteria) this;
        }

        public Criteria andSizeindexLessThanOrEqualTo(Integer value) {
            addCriterion("SizeIndex <=", value, "sizeindex");
            return (Criteria) this;
        }

        public Criteria andSizeindexIn(List<Integer> values) {
            addCriterion("SizeIndex in", values, "sizeindex");
            return (Criteria) this;
        }

        public Criteria andSizeindexNotIn(List<Integer> values) {
            addCriterion("SizeIndex not in", values, "sizeindex");
            return (Criteria) this;
        }

        public Criteria andSizeindexBetween(Integer value1, Integer value2) {
            addCriterion("SizeIndex between", value1, value2, "sizeindex");
            return (Criteria) this;
        }

        public Criteria andSizeindexNotBetween(Integer value1, Integer value2) {
            addCriterion("SizeIndex not between", value1, value2, "sizeindex");
            return (Criteria) this;
        }

        public Criteria andSizestrIsNull() {
            addCriterion("SizeStr is null");
            return (Criteria) this;
        }

        public Criteria andSizestrIsNotNull() {
            addCriterion("SizeStr is not null");
            return (Criteria) this;
        }

        public Criteria andSizestrEqualTo(String value) {
            addCriterion("SizeStr =", value, "sizestr");
            return (Criteria) this;
        }

        public Criteria andSizestrNotEqualTo(String value) {
            addCriterion("SizeStr <>", value, "sizestr");
            return (Criteria) this;
        }

        public Criteria andSizestrGreaterThan(String value) {
            addCriterion("SizeStr >", value, "sizestr");
            return (Criteria) this;
        }

        public Criteria andSizestrGreaterThanOrEqualTo(String value) {
            addCriterion("SizeStr >=", value, "sizestr");
            return (Criteria) this;
        }

        public Criteria andSizestrLessThan(String value) {
            addCriterion("SizeStr <", value, "sizestr");
            return (Criteria) this;
        }

        public Criteria andSizestrLessThanOrEqualTo(String value) {
            addCriterion("SizeStr <=", value, "sizestr");
            return (Criteria) this;
        }

        public Criteria andSizestrLike(String value) {
            addCriterion("SizeStr like", value, "sizestr");
            return (Criteria) this;
        }

        public Criteria andSizestrNotLike(String value) {
            addCriterion("SizeStr not like", value, "sizestr");
            return (Criteria) this;
        }

        public Criteria andSizestrIn(List<String> values) {
            addCriterion("SizeStr in", values, "sizestr");
            return (Criteria) this;
        }

        public Criteria andSizestrNotIn(List<String> values) {
            addCriterion("SizeStr not in", values, "sizestr");
            return (Criteria) this;
        }

        public Criteria andSizestrBetween(String value1, String value2) {
            addCriterion("SizeStr between", value1, value2, "sizestr");
            return (Criteria) this;
        }

        public Criteria andSizestrNotBetween(String value1, String value2) {
            addCriterion("SizeStr not between", value1, value2, "sizestr");
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