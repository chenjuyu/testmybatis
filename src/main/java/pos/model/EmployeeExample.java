package pos.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmployeetypeidIsNull() {
            addCriterion("EmployeeTypeID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidIsNotNull() {
            addCriterion("EmployeeTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidEqualTo(String value) {
            addCriterion("EmployeeTypeID =", value, "employeetypeid");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidNotEqualTo(String value) {
            addCriterion("EmployeeTypeID <>", value, "employeetypeid");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidGreaterThan(String value) {
            addCriterion("EmployeeTypeID >", value, "employeetypeid");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeTypeID >=", value, "employeetypeid");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidLessThan(String value) {
            addCriterion("EmployeeTypeID <", value, "employeetypeid");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidLessThanOrEqualTo(String value) {
            addCriterion("EmployeeTypeID <=", value, "employeetypeid");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidLike(String value) {
            addCriterion("EmployeeTypeID like", value, "employeetypeid");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidNotLike(String value) {
            addCriterion("EmployeeTypeID not like", value, "employeetypeid");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidIn(List<String> values) {
            addCriterion("EmployeeTypeID in", values, "employeetypeid");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidNotIn(List<String> values) {
            addCriterion("EmployeeTypeID not in", values, "employeetypeid");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidBetween(String value1, String value2) {
            addCriterion("EmployeeTypeID between", value1, value2, "employeetypeid");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeidNotBetween(String value1, String value2) {
            addCriterion("EmployeeTypeID not between", value1, value2, "employeetypeid");
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

        public Criteria andCommisionprofitIsNull() {
            addCriterion("CommisionProfit is null");
            return (Criteria) this;
        }

        public Criteria andCommisionprofitIsNotNull() {
            addCriterion("CommisionProfit is not null");
            return (Criteria) this;
        }

        public Criteria andCommisionprofitEqualTo(BigDecimal value) {
            addCriterion("CommisionProfit =", value, "commisionprofit");
            return (Criteria) this;
        }

        public Criteria andCommisionprofitNotEqualTo(BigDecimal value) {
            addCriterion("CommisionProfit <>", value, "commisionprofit");
            return (Criteria) this;
        }

        public Criteria andCommisionprofitGreaterThan(BigDecimal value) {
            addCriterion("CommisionProfit >", value, "commisionprofit");
            return (Criteria) this;
        }

        public Criteria andCommisionprofitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CommisionProfit >=", value, "commisionprofit");
            return (Criteria) this;
        }

        public Criteria andCommisionprofitLessThan(BigDecimal value) {
            addCriterion("CommisionProfit <", value, "commisionprofit");
            return (Criteria) this;
        }

        public Criteria andCommisionprofitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CommisionProfit <=", value, "commisionprofit");
            return (Criteria) this;
        }

        public Criteria andCommisionprofitIn(List<BigDecimal> values) {
            addCriterion("CommisionProfit in", values, "commisionprofit");
            return (Criteria) this;
        }

        public Criteria andCommisionprofitNotIn(List<BigDecimal> values) {
            addCriterion("CommisionProfit not in", values, "commisionprofit");
            return (Criteria) this;
        }

        public Criteria andCommisionprofitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CommisionProfit between", value1, value2, "commisionprofit");
            return (Criteria) this;
        }

        public Criteria andCommisionprofitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CommisionProfit not between", value1, value2, "commisionprofit");
            return (Criteria) this;
        }

        public Criteria andSharedflagIsNull() {
            addCriterion("SharedFlag is null");
            return (Criteria) this;
        }

        public Criteria andSharedflagIsNotNull() {
            addCriterion("SharedFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSharedflagEqualTo(Boolean value) {
            addCriterion("SharedFlag =", value, "sharedflag");
            return (Criteria) this;
        }

        public Criteria andSharedflagNotEqualTo(Boolean value) {
            addCriterion("SharedFlag <>", value, "sharedflag");
            return (Criteria) this;
        }

        public Criteria andSharedflagGreaterThan(Boolean value) {
            addCriterion("SharedFlag >", value, "sharedflag");
            return (Criteria) this;
        }

        public Criteria andSharedflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SharedFlag >=", value, "sharedflag");
            return (Criteria) this;
        }

        public Criteria andSharedflagLessThan(Boolean value) {
            addCriterion("SharedFlag <", value, "sharedflag");
            return (Criteria) this;
        }

        public Criteria andSharedflagLessThanOrEqualTo(Boolean value) {
            addCriterion("SharedFlag <=", value, "sharedflag");
            return (Criteria) this;
        }

        public Criteria andSharedflagIn(List<Boolean> values) {
            addCriterion("SharedFlag in", values, "sharedflag");
            return (Criteria) this;
        }

        public Criteria andSharedflagNotIn(List<Boolean> values) {
            addCriterion("SharedFlag not in", values, "sharedflag");
            return (Criteria) this;
        }

        public Criteria andSharedflagBetween(Boolean value1, Boolean value2) {
            addCriterion("SharedFlag between", value1, value2, "sharedflag");
            return (Criteria) this;
        }

        public Criteria andSharedflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SharedFlag not between", value1, value2, "sharedflag");
            return (Criteria) this;
        }

        public Criteria andDefaultflagIsNull() {
            addCriterion("DefaultFlag is null");
            return (Criteria) this;
        }

        public Criteria andDefaultflagIsNotNull() {
            addCriterion("DefaultFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultflagEqualTo(Boolean value) {
            addCriterion("DefaultFlag =", value, "defaultflag");
            return (Criteria) this;
        }

        public Criteria andDefaultflagNotEqualTo(Boolean value) {
            addCriterion("DefaultFlag <>", value, "defaultflag");
            return (Criteria) this;
        }

        public Criteria andDefaultflagGreaterThan(Boolean value) {
            addCriterion("DefaultFlag >", value, "defaultflag");
            return (Criteria) this;
        }

        public Criteria andDefaultflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DefaultFlag >=", value, "defaultflag");
            return (Criteria) this;
        }

        public Criteria andDefaultflagLessThan(Boolean value) {
            addCriterion("DefaultFlag <", value, "defaultflag");
            return (Criteria) this;
        }

        public Criteria andDefaultflagLessThanOrEqualTo(Boolean value) {
            addCriterion("DefaultFlag <=", value, "defaultflag");
            return (Criteria) this;
        }

        public Criteria andDefaultflagIn(List<Boolean> values) {
            addCriterion("DefaultFlag in", values, "defaultflag");
            return (Criteria) this;
        }

        public Criteria andDefaultflagNotIn(List<Boolean> values) {
            addCriterion("DefaultFlag not in", values, "defaultflag");
            return (Criteria) this;
        }

        public Criteria andDefaultflagBetween(Boolean value1, Boolean value2) {
            addCriterion("DefaultFlag between", value1, value2, "defaultflag");
            return (Criteria) this;
        }

        public Criteria andDefaultflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DefaultFlag not between", value1, value2, "defaultflag");
            return (Criteria) this;
        }

        public Criteria andCopyflagIsNull() {
            addCriterion("CopyFlag is null");
            return (Criteria) this;
        }

        public Criteria andCopyflagIsNotNull() {
            addCriterion("CopyFlag is not null");
            return (Criteria) this;
        }

        public Criteria andCopyflagEqualTo(Boolean value) {
            addCriterion("CopyFlag =", value, "copyflag");
            return (Criteria) this;
        }

        public Criteria andCopyflagNotEqualTo(Boolean value) {
            addCriterion("CopyFlag <>", value, "copyflag");
            return (Criteria) this;
        }

        public Criteria andCopyflagGreaterThan(Boolean value) {
            addCriterion("CopyFlag >", value, "copyflag");
            return (Criteria) this;
        }

        public Criteria andCopyflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CopyFlag >=", value, "copyflag");
            return (Criteria) this;
        }

        public Criteria andCopyflagLessThan(Boolean value) {
            addCriterion("CopyFlag <", value, "copyflag");
            return (Criteria) this;
        }

        public Criteria andCopyflagLessThanOrEqualTo(Boolean value) {
            addCriterion("CopyFlag <=", value, "copyflag");
            return (Criteria) this;
        }

        public Criteria andCopyflagIn(List<Boolean> values) {
            addCriterion("CopyFlag in", values, "copyflag");
            return (Criteria) this;
        }

        public Criteria andCopyflagNotIn(List<Boolean> values) {
            addCriterion("CopyFlag not in", values, "copyflag");
            return (Criteria) this;
        }

        public Criteria andCopyflagBetween(Boolean value1, Boolean value2) {
            addCriterion("CopyFlag between", value1, value2, "copyflag");
            return (Criteria) this;
        }

        public Criteria andCopyflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CopyFlag not between", value1, value2, "copyflag");
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

        public Criteria andMobilphoneIsNull() {
            addCriterion("MobilPhone is null");
            return (Criteria) this;
        }

        public Criteria andMobilphoneIsNotNull() {
            addCriterion("MobilPhone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilphoneEqualTo(String value) {
            addCriterion("MobilPhone =", value, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andMobilphoneNotEqualTo(String value) {
            addCriterion("MobilPhone <>", value, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andMobilphoneGreaterThan(String value) {
            addCriterion("MobilPhone >", value, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andMobilphoneGreaterThanOrEqualTo(String value) {
            addCriterion("MobilPhone >=", value, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andMobilphoneLessThan(String value) {
            addCriterion("MobilPhone <", value, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andMobilphoneLessThanOrEqualTo(String value) {
            addCriterion("MobilPhone <=", value, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andMobilphoneLike(String value) {
            addCriterion("MobilPhone like", value, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andMobilphoneNotLike(String value) {
            addCriterion("MobilPhone not like", value, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andMobilphoneIn(List<String> values) {
            addCriterion("MobilPhone in", values, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andMobilphoneNotIn(List<String> values) {
            addCriterion("MobilPhone not in", values, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andMobilphoneBetween(String value1, String value2) {
            addCriterion("MobilPhone between", value1, value2, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andMobilphoneNotBetween(String value1, String value2) {
            addCriterion("MobilPhone not between", value1, value2, "mobilphone");
            return (Criteria) this;
        }

        public Criteria andEngagedateIsNull() {
            addCriterion("EngageDate is null");
            return (Criteria) this;
        }

        public Criteria andEngagedateIsNotNull() {
            addCriterion("EngageDate is not null");
            return (Criteria) this;
        }

        public Criteria andEngagedateEqualTo(Date value) {
            addCriterion("EngageDate =", value, "engagedate");
            return (Criteria) this;
        }

        public Criteria andEngagedateNotEqualTo(Date value) {
            addCriterion("EngageDate <>", value, "engagedate");
            return (Criteria) this;
        }

        public Criteria andEngagedateGreaterThan(Date value) {
            addCriterion("EngageDate >", value, "engagedate");
            return (Criteria) this;
        }

        public Criteria andEngagedateGreaterThanOrEqualTo(Date value) {
            addCriterion("EngageDate >=", value, "engagedate");
            return (Criteria) this;
        }

        public Criteria andEngagedateLessThan(Date value) {
            addCriterion("EngageDate <", value, "engagedate");
            return (Criteria) this;
        }

        public Criteria andEngagedateLessThanOrEqualTo(Date value) {
            addCriterion("EngageDate <=", value, "engagedate");
            return (Criteria) this;
        }

        public Criteria andEngagedateIn(List<Date> values) {
            addCriterion("EngageDate in", values, "engagedate");
            return (Criteria) this;
        }

        public Criteria andEngagedateNotIn(List<Date> values) {
            addCriterion("EngageDate not in", values, "engagedate");
            return (Criteria) this;
        }

        public Criteria andEngagedateBetween(Date value1, Date value2) {
            addCriterion("EngageDate between", value1, value2, "engagedate");
            return (Criteria) this;
        }

        public Criteria andEngagedateNotBetween(Date value1, Date value2) {
            addCriterion("EngageDate not between", value1, value2, "engagedate");
            return (Criteria) this;
        }

        public Criteria andDimissiondateIsNull() {
            addCriterion("DimissionDate is null");
            return (Criteria) this;
        }

        public Criteria andDimissiondateIsNotNull() {
            addCriterion("DimissionDate is not null");
            return (Criteria) this;
        }

        public Criteria andDimissiondateEqualTo(Date value) {
            addCriterion("DimissionDate =", value, "dimissiondate");
            return (Criteria) this;
        }

        public Criteria andDimissiondateNotEqualTo(Date value) {
            addCriterion("DimissionDate <>", value, "dimissiondate");
            return (Criteria) this;
        }

        public Criteria andDimissiondateGreaterThan(Date value) {
            addCriterion("DimissionDate >", value, "dimissiondate");
            return (Criteria) this;
        }

        public Criteria andDimissiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("DimissionDate >=", value, "dimissiondate");
            return (Criteria) this;
        }

        public Criteria andDimissiondateLessThan(Date value) {
            addCriterion("DimissionDate <", value, "dimissiondate");
            return (Criteria) this;
        }

        public Criteria andDimissiondateLessThanOrEqualTo(Date value) {
            addCriterion("DimissionDate <=", value, "dimissiondate");
            return (Criteria) this;
        }

        public Criteria andDimissiondateIn(List<Date> values) {
            addCriterion("DimissionDate in", values, "dimissiondate");
            return (Criteria) this;
        }

        public Criteria andDimissiondateNotIn(List<Date> values) {
            addCriterion("DimissionDate not in", values, "dimissiondate");
            return (Criteria) this;
        }

        public Criteria andDimissiondateBetween(Date value1, Date value2) {
            addCriterion("DimissionDate between", value1, value2, "dimissiondate");
            return (Criteria) this;
        }

        public Criteria andDimissiondateNotBetween(Date value1, Date value2) {
            addCriterion("DimissionDate not between", value1, value2, "dimissiondate");
            return (Criteria) this;
        }

        public Criteria andBasepayIsNull() {
            addCriterion("BasePay is null");
            return (Criteria) this;
        }

        public Criteria andBasepayIsNotNull() {
            addCriterion("BasePay is not null");
            return (Criteria) this;
        }

        public Criteria andBasepayEqualTo(BigDecimal value) {
            addCriterion("BasePay =", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayNotEqualTo(BigDecimal value) {
            addCriterion("BasePay <>", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayGreaterThan(BigDecimal value) {
            addCriterion("BasePay >", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BasePay >=", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayLessThan(BigDecimal value) {
            addCriterion("BasePay <", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BasePay <=", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayIn(List<BigDecimal> values) {
            addCriterion("BasePay in", values, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayNotIn(List<BigDecimal> values) {
            addCriterion("BasePay not in", values, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BasePay between", value1, value2, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BasePay not between", value1, value2, "basepay");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("Addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("Addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("Addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("Addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("Addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("Addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("Addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("Addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("Addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("Addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("Addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("Addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("Addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("Addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("Education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("Education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("Education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("Education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("Education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("Education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("Education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("Education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("Education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("Education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("Education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("Education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("Education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("Education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andMobilephone2IsNull() {
            addCriterion("MobilePhone2 is null");
            return (Criteria) this;
        }

        public Criteria andMobilephone2IsNotNull() {
            addCriterion("MobilePhone2 is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephone2EqualTo(String value) {
            addCriterion("MobilePhone2 =", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2NotEqualTo(String value) {
            addCriterion("MobilePhone2 <>", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2GreaterThan(String value) {
            addCriterion("MobilePhone2 >", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2GreaterThanOrEqualTo(String value) {
            addCriterion("MobilePhone2 >=", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2LessThan(String value) {
            addCriterion("MobilePhone2 <", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2LessThanOrEqualTo(String value) {
            addCriterion("MobilePhone2 <=", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2Like(String value) {
            addCriterion("MobilePhone2 like", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2NotLike(String value) {
            addCriterion("MobilePhone2 not like", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2In(List<String> values) {
            addCriterion("MobilePhone2 in", values, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2NotIn(List<String> values) {
            addCriterion("MobilePhone2 not in", values, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2Between(String value1, String value2) {
            addCriterion("MobilePhone2 between", value1, value2, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2NotBetween(String value1, String value2) {
            addCriterion("MobilePhone2 not between", value1, value2, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PayType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PayType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("PayType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("PayType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("PayType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("PayType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("PayType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("PayType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("PayType like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("PayType not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("PayType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("PayType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("PayType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("PayType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andZwIsNull() {
            addCriterion("ZW is null");
            return (Criteria) this;
        }

        public Criteria andZwIsNotNull() {
            addCriterion("ZW is not null");
            return (Criteria) this;
        }

        public Criteria andZwEqualTo(String value) {
            addCriterion("ZW =", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotEqualTo(String value) {
            addCriterion("ZW <>", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThan(String value) {
            addCriterion("ZW >", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThanOrEqualTo(String value) {
            addCriterion("ZW >=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThan(String value) {
            addCriterion("ZW <", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThanOrEqualTo(String value) {
            addCriterion("ZW <=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLike(String value) {
            addCriterion("ZW like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotLike(String value) {
            addCriterion("ZW not like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwIn(List<String> values) {
            addCriterion("ZW in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotIn(List<String> values) {
            addCriterion("ZW not in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwBetween(String value1, String value2) {
            addCriterion("ZW between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotBetween(String value1, String value2) {
            addCriterion("ZW not between", value1, value2, "zw");
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

        public Criteria andIsguideIsNull() {
            addCriterion("IsGuide is null");
            return (Criteria) this;
        }

        public Criteria andIsguideIsNotNull() {
            addCriterion("IsGuide is not null");
            return (Criteria) this;
        }

        public Criteria andIsguideEqualTo(Boolean value) {
            addCriterion("IsGuide =", value, "isguide");
            return (Criteria) this;
        }

        public Criteria andIsguideNotEqualTo(Boolean value) {
            addCriterion("IsGuide <>", value, "isguide");
            return (Criteria) this;
        }

        public Criteria andIsguideGreaterThan(Boolean value) {
            addCriterion("IsGuide >", value, "isguide");
            return (Criteria) this;
        }

        public Criteria andIsguideGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsGuide >=", value, "isguide");
            return (Criteria) this;
        }

        public Criteria andIsguideLessThan(Boolean value) {
            addCriterion("IsGuide <", value, "isguide");
            return (Criteria) this;
        }

        public Criteria andIsguideLessThanOrEqualTo(Boolean value) {
            addCriterion("IsGuide <=", value, "isguide");
            return (Criteria) this;
        }

        public Criteria andIsguideIn(List<Boolean> values) {
            addCriterion("IsGuide in", values, "isguide");
            return (Criteria) this;
        }

        public Criteria andIsguideNotIn(List<Boolean> values) {
            addCriterion("IsGuide not in", values, "isguide");
            return (Criteria) this;
        }

        public Criteria andIsguideBetween(Boolean value1, Boolean value2) {
            addCriterion("IsGuide between", value1, value2, "isguide");
            return (Criteria) this;
        }

        public Criteria andIsguideNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsGuide not between", value1, value2, "isguide");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNull() {
            addCriterion("Specialty is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNotNull() {
            addCriterion("Specialty is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyEqualTo(String value) {
            addCriterion("Specialty =", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotEqualTo(String value) {
            addCriterion("Specialty <>", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThan(String value) {
            addCriterion("Specialty >", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("Specialty >=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThan(String value) {
            addCriterion("Specialty <", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("Specialty <=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLike(String value) {
            addCriterion("Specialty like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotLike(String value) {
            addCriterion("Specialty not like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIn(List<String> values) {
            addCriterion("Specialty in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotIn(List<String> values) {
            addCriterion("Specialty not in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyBetween(String value1, String value2) {
            addCriterion("Specialty between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotBetween(String value1, String value2) {
            addCriterion("Specialty not between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andVipidIsNull() {
            addCriterion("VIPID is null");
            return (Criteria) this;
        }

        public Criteria andVipidIsNotNull() {
            addCriterion("VIPID is not null");
            return (Criteria) this;
        }

        public Criteria andVipidEqualTo(String value) {
            addCriterion("VIPID =", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotEqualTo(String value) {
            addCriterion("VIPID <>", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThan(String value) {
            addCriterion("VIPID >", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThanOrEqualTo(String value) {
            addCriterion("VIPID >=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThan(String value) {
            addCriterion("VIPID <", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThanOrEqualTo(String value) {
            addCriterion("VIPID <=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLike(String value) {
            addCriterion("VIPID like", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotLike(String value) {
            addCriterion("VIPID not like", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidIn(List<String> values) {
            addCriterion("VIPID in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotIn(List<String> values) {
            addCriterion("VIPID not in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidBetween(String value1, String value2) {
            addCriterion("VIPID between", value1, value2, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotBetween(String value1, String value2) {
            addCriterion("VIPID not between", value1, value2, "vipid");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("OpenID is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("OpenID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("OpenID =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("OpenID <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("OpenID >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("OpenID >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("OpenID <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("OpenID <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("OpenID like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("OpenID not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("OpenID in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("OpenID not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("OpenID between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("OpenID not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNull() {
            addCriterion("PhotoUrl is null");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNotNull() {
            addCriterion("PhotoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPhotourlEqualTo(String value) {
            addCriterion("PhotoUrl =", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotEqualTo(String value) {
            addCriterion("PhotoUrl <>", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThan(String value) {
            addCriterion("PhotoUrl >", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThanOrEqualTo(String value) {
            addCriterion("PhotoUrl >=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThan(String value) {
            addCriterion("PhotoUrl <", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThanOrEqualTo(String value) {
            addCriterion("PhotoUrl <=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLike(String value) {
            addCriterion("PhotoUrl like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotLike(String value) {
            addCriterion("PhotoUrl not like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlIn(List<String> values) {
            addCriterion("PhotoUrl in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotIn(List<String> values) {
            addCriterion("PhotoUrl not in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlBetween(String value1, String value2) {
            addCriterion("PhotoUrl between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotBetween(String value1, String value2) {
            addCriterion("PhotoUrl not between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andIsofficerIsNull() {
            addCriterion("IsOfficer is null");
            return (Criteria) this;
        }

        public Criteria andIsofficerIsNotNull() {
            addCriterion("IsOfficer is not null");
            return (Criteria) this;
        }

        public Criteria andIsofficerEqualTo(Boolean value) {
            addCriterion("IsOfficer =", value, "isofficer");
            return (Criteria) this;
        }

        public Criteria andIsofficerNotEqualTo(Boolean value) {
            addCriterion("IsOfficer <>", value, "isofficer");
            return (Criteria) this;
        }

        public Criteria andIsofficerGreaterThan(Boolean value) {
            addCriterion("IsOfficer >", value, "isofficer");
            return (Criteria) this;
        }

        public Criteria andIsofficerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsOfficer >=", value, "isofficer");
            return (Criteria) this;
        }

        public Criteria andIsofficerLessThan(Boolean value) {
            addCriterion("IsOfficer <", value, "isofficer");
            return (Criteria) this;
        }

        public Criteria andIsofficerLessThanOrEqualTo(Boolean value) {
            addCriterion("IsOfficer <=", value, "isofficer");
            return (Criteria) this;
        }

        public Criteria andIsofficerIn(List<Boolean> values) {
            addCriterion("IsOfficer in", values, "isofficer");
            return (Criteria) this;
        }

        public Criteria andIsofficerNotIn(List<Boolean> values) {
            addCriterion("IsOfficer not in", values, "isofficer");
            return (Criteria) this;
        }

        public Criteria andIsofficerBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOfficer between", value1, value2, "isofficer");
            return (Criteria) this;
        }

        public Criteria andIsofficerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOfficer not between", value1, value2, "isofficer");
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