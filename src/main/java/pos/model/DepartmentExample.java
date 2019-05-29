package pos.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDepartmenttypeidIsNull() {
            addCriterion("DepartmentTypeID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidIsNotNull() {
            addCriterion("DepartmentTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidEqualTo(String value) {
            addCriterion("DepartmentTypeID =", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidNotEqualTo(String value) {
            addCriterion("DepartmentTypeID <>", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidGreaterThan(String value) {
            addCriterion("DepartmentTypeID >", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidGreaterThanOrEqualTo(String value) {
            addCriterion("DepartmentTypeID >=", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidLessThan(String value) {
            addCriterion("DepartmentTypeID <", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidLessThanOrEqualTo(String value) {
            addCriterion("DepartmentTypeID <=", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidLike(String value) {
            addCriterion("DepartmentTypeID like", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidNotLike(String value) {
            addCriterion("DepartmentTypeID not like", value, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidIn(List<String> values) {
            addCriterion("DepartmentTypeID in", values, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidNotIn(List<String> values) {
            addCriterion("DepartmentTypeID not in", values, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidBetween(String value1, String value2) {
            addCriterion("DepartmentTypeID between", value1, value2, "departmenttypeid");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeidNotBetween(String value1, String value2) {
            addCriterion("DepartmentTypeID not between", value1, value2, "departmenttypeid");
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

        public Criteria andDepartmentIsNull() {
            addCriterion("Department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("Department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("Department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("Department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("Department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("Department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("Department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("Department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("Department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("Department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("Department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("Department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("Department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("Department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentIsNull() {
            addCriterion("EngDepartment is null");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentIsNotNull() {
            addCriterion("EngDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentEqualTo(String value) {
            addCriterion("EngDepartment =", value, "engdepartment");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentNotEqualTo(String value) {
            addCriterion("EngDepartment <>", value, "engdepartment");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentGreaterThan(String value) {
            addCriterion("EngDepartment >", value, "engdepartment");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("EngDepartment >=", value, "engdepartment");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentLessThan(String value) {
            addCriterion("EngDepartment <", value, "engdepartment");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentLessThanOrEqualTo(String value) {
            addCriterion("EngDepartment <=", value, "engdepartment");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentLike(String value) {
            addCriterion("EngDepartment like", value, "engdepartment");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentNotLike(String value) {
            addCriterion("EngDepartment not like", value, "engdepartment");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentIn(List<String> values) {
            addCriterion("EngDepartment in", values, "engdepartment");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentNotIn(List<String> values) {
            addCriterion("EngDepartment not in", values, "engdepartment");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentBetween(String value1, String value2) {
            addCriterion("EngDepartment between", value1, value2, "engdepartment");
            return (Criteria) this;
        }

        public Criteria andEngdepartmentNotBetween(String value1, String value2) {
            addCriterion("EngDepartment not between", value1, value2, "engdepartment");
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

        public Criteria andDepttypeIsNull() {
            addCriterion("DeptType is null");
            return (Criteria) this;
        }

        public Criteria andDepttypeIsNotNull() {
            addCriterion("DeptType is not null");
            return (Criteria) this;
        }

        public Criteria andDepttypeEqualTo(String value) {
            addCriterion("DeptType =", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotEqualTo(String value) {
            addCriterion("DeptType <>", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThan(String value) {
            addCriterion("DeptType >", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThanOrEqualTo(String value) {
            addCriterion("DeptType >=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThan(String value) {
            addCriterion("DeptType <", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThanOrEqualTo(String value) {
            addCriterion("DeptType <=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLike(String value) {
            addCriterion("DeptType like", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotLike(String value) {
            addCriterion("DeptType not like", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeIn(List<String> values) {
            addCriterion("DeptType in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotIn(List<String> values) {
            addCriterion("DeptType not in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeBetween(String value1, String value2) {
            addCriterion("DeptType between", value1, value2, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotBetween(String value1, String value2) {
            addCriterion("DeptType not between", value1, value2, "depttype");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagIsNull() {
            addCriterion("WarehouseFlag is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagIsNotNull() {
            addCriterion("WarehouseFlag is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagEqualTo(Boolean value) {
            addCriterion("WarehouseFlag =", value, "warehouseflag");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagNotEqualTo(Boolean value) {
            addCriterion("WarehouseFlag <>", value, "warehouseflag");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagGreaterThan(Boolean value) {
            addCriterion("WarehouseFlag >", value, "warehouseflag");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("WarehouseFlag >=", value, "warehouseflag");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagLessThan(Boolean value) {
            addCriterion("WarehouseFlag <", value, "warehouseflag");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagLessThanOrEqualTo(Boolean value) {
            addCriterion("WarehouseFlag <=", value, "warehouseflag");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagIn(List<Boolean> values) {
            addCriterion("WarehouseFlag in", values, "warehouseflag");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagNotIn(List<Boolean> values) {
            addCriterion("WarehouseFlag not in", values, "warehouseflag");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagBetween(Boolean value1, Boolean value2) {
            addCriterion("WarehouseFlag between", value1, value2, "warehouseflag");
            return (Criteria) this;
        }

        public Criteria andWarehouseflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("WarehouseFlag not between", value1, value2, "warehouseflag");
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

        public Criteria andEngaddrIsNull() {
            addCriterion("EngAddr is null");
            return (Criteria) this;
        }

        public Criteria andEngaddrIsNotNull() {
            addCriterion("EngAddr is not null");
            return (Criteria) this;
        }

        public Criteria andEngaddrEqualTo(String value) {
            addCriterion("EngAddr =", value, "engaddr");
            return (Criteria) this;
        }

        public Criteria andEngaddrNotEqualTo(String value) {
            addCriterion("EngAddr <>", value, "engaddr");
            return (Criteria) this;
        }

        public Criteria andEngaddrGreaterThan(String value) {
            addCriterion("EngAddr >", value, "engaddr");
            return (Criteria) this;
        }

        public Criteria andEngaddrGreaterThanOrEqualTo(String value) {
            addCriterion("EngAddr >=", value, "engaddr");
            return (Criteria) this;
        }

        public Criteria andEngaddrLessThan(String value) {
            addCriterion("EngAddr <", value, "engaddr");
            return (Criteria) this;
        }

        public Criteria andEngaddrLessThanOrEqualTo(String value) {
            addCriterion("EngAddr <=", value, "engaddr");
            return (Criteria) this;
        }

        public Criteria andEngaddrLike(String value) {
            addCriterion("EngAddr like", value, "engaddr");
            return (Criteria) this;
        }

        public Criteria andEngaddrNotLike(String value) {
            addCriterion("EngAddr not like", value, "engaddr");
            return (Criteria) this;
        }

        public Criteria andEngaddrIn(List<String> values) {
            addCriterion("EngAddr in", values, "engaddr");
            return (Criteria) this;
        }

        public Criteria andEngaddrNotIn(List<String> values) {
            addCriterion("EngAddr not in", values, "engaddr");
            return (Criteria) this;
        }

        public Criteria andEngaddrBetween(String value1, String value2) {
            addCriterion("EngAddr between", value1, value2, "engaddr");
            return (Criteria) this;
        }

        public Criteria andEngaddrNotBetween(String value1, String value2) {
            addCriterion("EngAddr not between", value1, value2, "engaddr");
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

        public Criteria andDistrictidIsNull() {
            addCriterion("DistrictID is null");
            return (Criteria) this;
        }

        public Criteria andDistrictidIsNotNull() {
            addCriterion("DistrictID is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictidEqualTo(String value) {
            addCriterion("DistrictID =", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotEqualTo(String value) {
            addCriterion("DistrictID <>", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThan(String value) {
            addCriterion("DistrictID >", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidGreaterThanOrEqualTo(String value) {
            addCriterion("DistrictID >=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThan(String value) {
            addCriterion("DistrictID <", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLessThanOrEqualTo(String value) {
            addCriterion("DistrictID <=", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidLike(String value) {
            addCriterion("DistrictID like", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotLike(String value) {
            addCriterion("DistrictID not like", value, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidIn(List<String> values) {
            addCriterion("DistrictID in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotIn(List<String> values) {
            addCriterion("DistrictID not in", values, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidBetween(String value1, String value2) {
            addCriterion("DistrictID between", value1, value2, "districtid");
            return (Criteria) this;
        }

        public Criteria andDistrictidNotBetween(String value1, String value2) {
            addCriterion("DistrictID not between", value1, value2, "districtid");
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

        public Criteria andGroupnameIsNull() {
            addCriterion("GroupName is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("GroupName is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("GroupName =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("GroupName <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("GroupName >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("GroupName >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("GroupName <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("GroupName <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("GroupName like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("GroupName not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("GroupName in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("GroupName not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("GroupName between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("GroupName not between", value1, value2, "groupname");
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

        public Criteria andAreaIsNull() {
            addCriterion("Area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("Area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(BigDecimal value) {
            addCriterion("Area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(BigDecimal value) {
            addCriterion("Area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(BigDecimal value) {
            addCriterion("Area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(BigDecimal value) {
            addCriterion("Area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<BigDecimal> values) {
            addCriterion("Area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<BigDecimal> values) {
            addCriterion("Area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidIsNull() {
            addCriterion("DefaultCoinID is null");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidIsNotNull() {
            addCriterion("DefaultCoinID is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidEqualTo(String value) {
            addCriterion("DefaultCoinID =", value, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidNotEqualTo(String value) {
            addCriterion("DefaultCoinID <>", value, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidGreaterThan(String value) {
            addCriterion("DefaultCoinID >", value, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidGreaterThanOrEqualTo(String value) {
            addCriterion("DefaultCoinID >=", value, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidLessThan(String value) {
            addCriterion("DefaultCoinID <", value, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidLessThanOrEqualTo(String value) {
            addCriterion("DefaultCoinID <=", value, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidLike(String value) {
            addCriterion("DefaultCoinID like", value, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidNotLike(String value) {
            addCriterion("DefaultCoinID not like", value, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidIn(List<String> values) {
            addCriterion("DefaultCoinID in", values, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidNotIn(List<String> values) {
            addCriterion("DefaultCoinID not in", values, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidBetween(String value1, String value2) {
            addCriterion("DefaultCoinID between", value1, value2, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andDefaultcoinidNotBetween(String value1, String value2) {
            addCriterion("DefaultCoinID not between", value1, value2, "defaultcoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagIsNull() {
            addCriterion("OtherCoinDispFlag is null");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagIsNotNull() {
            addCriterion("OtherCoinDispFlag is not null");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagEqualTo(Boolean value) {
            addCriterion("OtherCoinDispFlag =", value, "othercoindispflag");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagNotEqualTo(Boolean value) {
            addCriterion("OtherCoinDispFlag <>", value, "othercoindispflag");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagGreaterThan(Boolean value) {
            addCriterion("OtherCoinDispFlag >", value, "othercoindispflag");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("OtherCoinDispFlag >=", value, "othercoindispflag");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagLessThan(Boolean value) {
            addCriterion("OtherCoinDispFlag <", value, "othercoindispflag");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagLessThanOrEqualTo(Boolean value) {
            addCriterion("OtherCoinDispFlag <=", value, "othercoindispflag");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagIn(List<Boolean> values) {
            addCriterion("OtherCoinDispFlag in", values, "othercoindispflag");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagNotIn(List<Boolean> values) {
            addCriterion("OtherCoinDispFlag not in", values, "othercoindispflag");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagBetween(Boolean value1, Boolean value2) {
            addCriterion("OtherCoinDispFlag between", value1, value2, "othercoindispflag");
            return (Criteria) this;
        }

        public Criteria andOthercoindispflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("OtherCoinDispFlag not between", value1, value2, "othercoindispflag");
            return (Criteria) this;
        }

        public Criteria andOthercoinidIsNull() {
            addCriterion("OtherCoinID is null");
            return (Criteria) this;
        }

        public Criteria andOthercoinidIsNotNull() {
            addCriterion("OtherCoinID is not null");
            return (Criteria) this;
        }

        public Criteria andOthercoinidEqualTo(String value) {
            addCriterion("OtherCoinID =", value, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoinidNotEqualTo(String value) {
            addCriterion("OtherCoinID <>", value, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoinidGreaterThan(String value) {
            addCriterion("OtherCoinID >", value, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoinidGreaterThanOrEqualTo(String value) {
            addCriterion("OtherCoinID >=", value, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoinidLessThan(String value) {
            addCriterion("OtherCoinID <", value, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoinidLessThanOrEqualTo(String value) {
            addCriterion("OtherCoinID <=", value, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoinidLike(String value) {
            addCriterion("OtherCoinID like", value, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoinidNotLike(String value) {
            addCriterion("OtherCoinID not like", value, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoinidIn(List<String> values) {
            addCriterion("OtherCoinID in", values, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoinidNotIn(List<String> values) {
            addCriterion("OtherCoinID not in", values, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoinidBetween(String value1, String value2) {
            addCriterion("OtherCoinID between", value1, value2, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andOthercoinidNotBetween(String value1, String value2) {
            addCriterion("OtherCoinID not between", value1, value2, "othercoinid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidIsNull() {
            addCriterion("LocalWarehouseID is null");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidIsNotNull() {
            addCriterion("LocalWarehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidEqualTo(String value) {
            addCriterion("LocalWarehouseID =", value, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidNotEqualTo(String value) {
            addCriterion("LocalWarehouseID <>", value, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidGreaterThan(String value) {
            addCriterion("LocalWarehouseID >", value, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("LocalWarehouseID >=", value, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidLessThan(String value) {
            addCriterion("LocalWarehouseID <", value, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidLessThanOrEqualTo(String value) {
            addCriterion("LocalWarehouseID <=", value, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidLike(String value) {
            addCriterion("LocalWarehouseID like", value, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidNotLike(String value) {
            addCriterion("LocalWarehouseID not like", value, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidIn(List<String> values) {
            addCriterion("LocalWarehouseID in", values, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidNotIn(List<String> values) {
            addCriterion("LocalWarehouseID not in", values, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidBetween(String value1, String value2) {
            addCriterion("LocalWarehouseID between", value1, value2, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andLocalwarehouseidNotBetween(String value1, String value2) {
            addCriterion("LocalWarehouseID not between", value1, value2, "localwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidIsNull() {
            addCriterion("TempWarehouseID is null");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidIsNotNull() {
            addCriterion("TempWarehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidEqualTo(String value) {
            addCriterion("TempWarehouseID =", value, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidNotEqualTo(String value) {
            addCriterion("TempWarehouseID <>", value, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidGreaterThan(String value) {
            addCriterion("TempWarehouseID >", value, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("TempWarehouseID >=", value, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidLessThan(String value) {
            addCriterion("TempWarehouseID <", value, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidLessThanOrEqualTo(String value) {
            addCriterion("TempWarehouseID <=", value, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidLike(String value) {
            addCriterion("TempWarehouseID like", value, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidNotLike(String value) {
            addCriterion("TempWarehouseID not like", value, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidIn(List<String> values) {
            addCriterion("TempWarehouseID in", values, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidNotIn(List<String> values) {
            addCriterion("TempWarehouseID not in", values, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidBetween(String value1, String value2) {
            addCriterion("TempWarehouseID between", value1, value2, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTempwarehouseidNotBetween(String value1, String value2) {
            addCriterion("TempWarehouseID not between", value1, value2, "tempwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTargetmailIsNull() {
            addCriterion("TargetMail is null");
            return (Criteria) this;
        }

        public Criteria andTargetmailIsNotNull() {
            addCriterion("TargetMail is not null");
            return (Criteria) this;
        }

        public Criteria andTargetmailEqualTo(String value) {
            addCriterion("TargetMail =", value, "targetmail");
            return (Criteria) this;
        }

        public Criteria andTargetmailNotEqualTo(String value) {
            addCriterion("TargetMail <>", value, "targetmail");
            return (Criteria) this;
        }

        public Criteria andTargetmailGreaterThan(String value) {
            addCriterion("TargetMail >", value, "targetmail");
            return (Criteria) this;
        }

        public Criteria andTargetmailGreaterThanOrEqualTo(String value) {
            addCriterion("TargetMail >=", value, "targetmail");
            return (Criteria) this;
        }

        public Criteria andTargetmailLessThan(String value) {
            addCriterion("TargetMail <", value, "targetmail");
            return (Criteria) this;
        }

        public Criteria andTargetmailLessThanOrEqualTo(String value) {
            addCriterion("TargetMail <=", value, "targetmail");
            return (Criteria) this;
        }

        public Criteria andTargetmailLike(String value) {
            addCriterion("TargetMail like", value, "targetmail");
            return (Criteria) this;
        }

        public Criteria andTargetmailNotLike(String value) {
            addCriterion("TargetMail not like", value, "targetmail");
            return (Criteria) this;
        }

        public Criteria andTargetmailIn(List<String> values) {
            addCriterion("TargetMail in", values, "targetmail");
            return (Criteria) this;
        }

        public Criteria andTargetmailNotIn(List<String> values) {
            addCriterion("TargetMail not in", values, "targetmail");
            return (Criteria) this;
        }

        public Criteria andTargetmailBetween(String value1, String value2) {
            addCriterion("TargetMail between", value1, value2, "targetmail");
            return (Criteria) this;
        }

        public Criteria andTargetmailNotBetween(String value1, String value2) {
            addCriterion("TargetMail not between", value1, value2, "targetmail");
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

        public Criteria andTargetdirIsNull() {
            addCriterion("TargetDir is null");
            return (Criteria) this;
        }

        public Criteria andTargetdirIsNotNull() {
            addCriterion("TargetDir is not null");
            return (Criteria) this;
        }

        public Criteria andTargetdirEqualTo(String value) {
            addCriterion("TargetDir =", value, "targetdir");
            return (Criteria) this;
        }

        public Criteria andTargetdirNotEqualTo(String value) {
            addCriterion("TargetDir <>", value, "targetdir");
            return (Criteria) this;
        }

        public Criteria andTargetdirGreaterThan(String value) {
            addCriterion("TargetDir >", value, "targetdir");
            return (Criteria) this;
        }

        public Criteria andTargetdirGreaterThanOrEqualTo(String value) {
            addCriterion("TargetDir >=", value, "targetdir");
            return (Criteria) this;
        }

        public Criteria andTargetdirLessThan(String value) {
            addCriterion("TargetDir <", value, "targetdir");
            return (Criteria) this;
        }

        public Criteria andTargetdirLessThanOrEqualTo(String value) {
            addCriterion("TargetDir <=", value, "targetdir");
            return (Criteria) this;
        }

        public Criteria andTargetdirLike(String value) {
            addCriterion("TargetDir like", value, "targetdir");
            return (Criteria) this;
        }

        public Criteria andTargetdirNotLike(String value) {
            addCriterion("TargetDir not like", value, "targetdir");
            return (Criteria) this;
        }

        public Criteria andTargetdirIn(List<String> values) {
            addCriterion("TargetDir in", values, "targetdir");
            return (Criteria) this;
        }

        public Criteria andTargetdirNotIn(List<String> values) {
            addCriterion("TargetDir not in", values, "targetdir");
            return (Criteria) this;
        }

        public Criteria andTargetdirBetween(String value1, String value2) {
            addCriterion("TargetDir between", value1, value2, "targetdir");
            return (Criteria) this;
        }

        public Criteria andTargetdirNotBetween(String value1, String value2) {
            addCriterion("TargetDir not between", value1, value2, "targetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirIsNull() {
            addCriterion("FTPTargetDir is null");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirIsNotNull() {
            addCriterion("FTPTargetDir is not null");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirEqualTo(String value) {
            addCriterion("FTPTargetDir =", value, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirNotEqualTo(String value) {
            addCriterion("FTPTargetDir <>", value, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirGreaterThan(String value) {
            addCriterion("FTPTargetDir >", value, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirGreaterThanOrEqualTo(String value) {
            addCriterion("FTPTargetDir >=", value, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirLessThan(String value) {
            addCriterion("FTPTargetDir <", value, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirLessThanOrEqualTo(String value) {
            addCriterion("FTPTargetDir <=", value, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirLike(String value) {
            addCriterion("FTPTargetDir like", value, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirNotLike(String value) {
            addCriterion("FTPTargetDir not like", value, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirIn(List<String> values) {
            addCriterion("FTPTargetDir in", values, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirNotIn(List<String> values) {
            addCriterion("FTPTargetDir not in", values, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirBetween(String value1, String value2) {
            addCriterion("FTPTargetDir between", value1, value2, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andFtptargetdirNotBetween(String value1, String value2) {
            addCriterion("FTPTargetDir not between", value1, value2, "ftptargetdir");
            return (Criteria) this;
        }

        public Criteria andReportflagIsNull() {
            addCriterion("ReportFlag is null");
            return (Criteria) this;
        }

        public Criteria andReportflagIsNotNull() {
            addCriterion("ReportFlag is not null");
            return (Criteria) this;
        }

        public Criteria andReportflagEqualTo(Boolean value) {
            addCriterion("ReportFlag =", value, "reportflag");
            return (Criteria) this;
        }

        public Criteria andReportflagNotEqualTo(Boolean value) {
            addCriterion("ReportFlag <>", value, "reportflag");
            return (Criteria) this;
        }

        public Criteria andReportflagGreaterThan(Boolean value) {
            addCriterion("ReportFlag >", value, "reportflag");
            return (Criteria) this;
        }

        public Criteria andReportflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ReportFlag >=", value, "reportflag");
            return (Criteria) this;
        }

        public Criteria andReportflagLessThan(Boolean value) {
            addCriterion("ReportFlag <", value, "reportflag");
            return (Criteria) this;
        }

        public Criteria andReportflagLessThanOrEqualTo(Boolean value) {
            addCriterion("ReportFlag <=", value, "reportflag");
            return (Criteria) this;
        }

        public Criteria andReportflagIn(List<Boolean> values) {
            addCriterion("ReportFlag in", values, "reportflag");
            return (Criteria) this;
        }

        public Criteria andReportflagNotIn(List<Boolean> values) {
            addCriterion("ReportFlag not in", values, "reportflag");
            return (Criteria) this;
        }

        public Criteria andReportflagBetween(Boolean value1, Boolean value2) {
            addCriterion("ReportFlag between", value1, value2, "reportflag");
            return (Criteria) this;
        }

        public Criteria andReportflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ReportFlag not between", value1, value2, "reportflag");
            return (Criteria) this;
        }

        public Criteria andReportdirIsNull() {
            addCriterion("ReportDir is null");
            return (Criteria) this;
        }

        public Criteria andReportdirIsNotNull() {
            addCriterion("ReportDir is not null");
            return (Criteria) this;
        }

        public Criteria andReportdirEqualTo(String value) {
            addCriterion("ReportDir =", value, "reportdir");
            return (Criteria) this;
        }

        public Criteria andReportdirNotEqualTo(String value) {
            addCriterion("ReportDir <>", value, "reportdir");
            return (Criteria) this;
        }

        public Criteria andReportdirGreaterThan(String value) {
            addCriterion("ReportDir >", value, "reportdir");
            return (Criteria) this;
        }

        public Criteria andReportdirGreaterThanOrEqualTo(String value) {
            addCriterion("ReportDir >=", value, "reportdir");
            return (Criteria) this;
        }

        public Criteria andReportdirLessThan(String value) {
            addCriterion("ReportDir <", value, "reportdir");
            return (Criteria) this;
        }

        public Criteria andReportdirLessThanOrEqualTo(String value) {
            addCriterion("ReportDir <=", value, "reportdir");
            return (Criteria) this;
        }

        public Criteria andReportdirLike(String value) {
            addCriterion("ReportDir like", value, "reportdir");
            return (Criteria) this;
        }

        public Criteria andReportdirNotLike(String value) {
            addCriterion("ReportDir not like", value, "reportdir");
            return (Criteria) this;
        }

        public Criteria andReportdirIn(List<String> values) {
            addCriterion("ReportDir in", values, "reportdir");
            return (Criteria) this;
        }

        public Criteria andReportdirNotIn(List<String> values) {
            addCriterion("ReportDir not in", values, "reportdir");
            return (Criteria) this;
        }

        public Criteria andReportdirBetween(String value1, String value2) {
            addCriterion("ReportDir between", value1, value2, "reportdir");
            return (Criteria) this;
        }

        public Criteria andReportdirNotBetween(String value1, String value2) {
            addCriterion("ReportDir not between", value1, value2, "reportdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirIsNull() {
            addCriterion("AgentTargetDir is null");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirIsNotNull() {
            addCriterion("AgentTargetDir is not null");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirEqualTo(String value) {
            addCriterion("AgentTargetDir =", value, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirNotEqualTo(String value) {
            addCriterion("AgentTargetDir <>", value, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirGreaterThan(String value) {
            addCriterion("AgentTargetDir >", value, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirGreaterThanOrEqualTo(String value) {
            addCriterion("AgentTargetDir >=", value, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirLessThan(String value) {
            addCriterion("AgentTargetDir <", value, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirLessThanOrEqualTo(String value) {
            addCriterion("AgentTargetDir <=", value, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirLike(String value) {
            addCriterion("AgentTargetDir like", value, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirNotLike(String value) {
            addCriterion("AgentTargetDir not like", value, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirIn(List<String> values) {
            addCriterion("AgentTargetDir in", values, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirNotIn(List<String> values) {
            addCriterion("AgentTargetDir not in", values, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirBetween(String value1, String value2) {
            addCriterion("AgentTargetDir between", value1, value2, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andAgenttargetdirNotBetween(String value1, String value2) {
            addCriterion("AgentTargetDir not between", value1, value2, "agenttargetdir");
            return (Criteria) this;
        }

        public Criteria andPaymentflagIsNull() {
            addCriterion("PaymentFlag is null");
            return (Criteria) this;
        }

        public Criteria andPaymentflagIsNotNull() {
            addCriterion("PaymentFlag is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentflagEqualTo(Boolean value) {
            addCriterion("PaymentFlag =", value, "paymentflag");
            return (Criteria) this;
        }

        public Criteria andPaymentflagNotEqualTo(Boolean value) {
            addCriterion("PaymentFlag <>", value, "paymentflag");
            return (Criteria) this;
        }

        public Criteria andPaymentflagGreaterThan(Boolean value) {
            addCriterion("PaymentFlag >", value, "paymentflag");
            return (Criteria) this;
        }

        public Criteria andPaymentflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PaymentFlag >=", value, "paymentflag");
            return (Criteria) this;
        }

        public Criteria andPaymentflagLessThan(Boolean value) {
            addCriterion("PaymentFlag <", value, "paymentflag");
            return (Criteria) this;
        }

        public Criteria andPaymentflagLessThanOrEqualTo(Boolean value) {
            addCriterion("PaymentFlag <=", value, "paymentflag");
            return (Criteria) this;
        }

        public Criteria andPaymentflagIn(List<Boolean> values) {
            addCriterion("PaymentFlag in", values, "paymentflag");
            return (Criteria) this;
        }

        public Criteria andPaymentflagNotIn(List<Boolean> values) {
            addCriterion("PaymentFlag not in", values, "paymentflag");
            return (Criteria) this;
        }

        public Criteria andPaymentflagBetween(Boolean value1, Boolean value2) {
            addCriterion("PaymentFlag between", value1, value2, "paymentflag");
            return (Criteria) this;
        }

        public Criteria andPaymentflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PaymentFlag not between", value1, value2, "paymentflag");
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

        public Criteria andSendretailsalesIsNull() {
            addCriterion("SendRetailSales is null");
            return (Criteria) this;
        }

        public Criteria andSendretailsalesIsNotNull() {
            addCriterion("SendRetailSales is not null");
            return (Criteria) this;
        }

        public Criteria andSendretailsalesEqualTo(Boolean value) {
            addCriterion("SendRetailSales =", value, "sendretailsales");
            return (Criteria) this;
        }

        public Criteria andSendretailsalesNotEqualTo(Boolean value) {
            addCriterion("SendRetailSales <>", value, "sendretailsales");
            return (Criteria) this;
        }

        public Criteria andSendretailsalesGreaterThan(Boolean value) {
            addCriterion("SendRetailSales >", value, "sendretailsales");
            return (Criteria) this;
        }

        public Criteria andSendretailsalesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SendRetailSales >=", value, "sendretailsales");
            return (Criteria) this;
        }

        public Criteria andSendretailsalesLessThan(Boolean value) {
            addCriterion("SendRetailSales <", value, "sendretailsales");
            return (Criteria) this;
        }

        public Criteria andSendretailsalesLessThanOrEqualTo(Boolean value) {
            addCriterion("SendRetailSales <=", value, "sendretailsales");
            return (Criteria) this;
        }

        public Criteria andSendretailsalesIn(List<Boolean> values) {
            addCriterion("SendRetailSales in", values, "sendretailsales");
            return (Criteria) this;
        }

        public Criteria andSendretailsalesNotIn(List<Boolean> values) {
            addCriterion("SendRetailSales not in", values, "sendretailsales");
            return (Criteria) this;
        }

        public Criteria andSendretailsalesBetween(Boolean value1, Boolean value2) {
            addCriterion("SendRetailSales between", value1, value2, "sendretailsales");
            return (Criteria) this;
        }

        public Criteria andSendretailsalesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SendRetailSales not between", value1, value2, "sendretailsales");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidIsNull() {
            addCriterion("UpperDepartmentID is null");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidIsNotNull() {
            addCriterion("UpperDepartmentID is not null");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidEqualTo(String value) {
            addCriterion("UpperDepartmentID =", value, "upperdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidNotEqualTo(String value) {
            addCriterion("UpperDepartmentID <>", value, "upperdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidGreaterThan(String value) {
            addCriterion("UpperDepartmentID >", value, "upperdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("UpperDepartmentID >=", value, "upperdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidLessThan(String value) {
            addCriterion("UpperDepartmentID <", value, "upperdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidLessThanOrEqualTo(String value) {
            addCriterion("UpperDepartmentID <=", value, "upperdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidLike(String value) {
            addCriterion("UpperDepartmentID like", value, "upperdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidNotLike(String value) {
            addCriterion("UpperDepartmentID not like", value, "upperdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidIn(List<String> values) {
            addCriterion("UpperDepartmentID in", values, "upperdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidNotIn(List<String> values) {
            addCriterion("UpperDepartmentID not in", values, "upperdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidBetween(String value1, String value2) {
            addCriterion("UpperDepartmentID between", value1, value2, "upperdepartmentid");
            return (Criteria) this;
        }

        public Criteria andUpperdepartmentidNotBetween(String value1, String value2) {
            addCriterion("UpperDepartmentID not between", value1, value2, "upperdepartmentid");
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

        public Criteria andContactIsNull() {
            addCriterion("Contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("Contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("Contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("Contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("Contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("Contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("Contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("Contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("Contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("Contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("Contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("Contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("Contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("Contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("Fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("Fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("Fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("Fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("Fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("Fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("Fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("Fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("Fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("Fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("Fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("Fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("Fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("Fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathIsNull() {
            addCriterion("WirelessDataPath is null");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathIsNotNull() {
            addCriterion("WirelessDataPath is not null");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathEqualTo(String value) {
            addCriterion("WirelessDataPath =", value, "wirelessdatapath");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathNotEqualTo(String value) {
            addCriterion("WirelessDataPath <>", value, "wirelessdatapath");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathGreaterThan(String value) {
            addCriterion("WirelessDataPath >", value, "wirelessdatapath");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathGreaterThanOrEqualTo(String value) {
            addCriterion("WirelessDataPath >=", value, "wirelessdatapath");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathLessThan(String value) {
            addCriterion("WirelessDataPath <", value, "wirelessdatapath");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathLessThanOrEqualTo(String value) {
            addCriterion("WirelessDataPath <=", value, "wirelessdatapath");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathLike(String value) {
            addCriterion("WirelessDataPath like", value, "wirelessdatapath");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathNotLike(String value) {
            addCriterion("WirelessDataPath not like", value, "wirelessdatapath");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathIn(List<String> values) {
            addCriterion("WirelessDataPath in", values, "wirelessdatapath");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathNotIn(List<String> values) {
            addCriterion("WirelessDataPath not in", values, "wirelessdatapath");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathBetween(String value1, String value2) {
            addCriterion("WirelessDataPath between", value1, value2, "wirelessdatapath");
            return (Criteria) this;
        }

        public Criteria andWirelessdatapathNotBetween(String value1, String value2) {
            addCriterion("WirelessDataPath not between", value1, value2, "wirelessdatapath");
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

        public Criteria andBalancedateIsNull() {
            addCriterion("BalanceDate is null");
            return (Criteria) this;
        }

        public Criteria andBalancedateIsNotNull() {
            addCriterion("BalanceDate is not null");
            return (Criteria) this;
        }

        public Criteria andBalancedateEqualTo(Integer value) {
            addCriterion("BalanceDate =", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateNotEqualTo(Integer value) {
            addCriterion("BalanceDate <>", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateGreaterThan(Integer value) {
            addCriterion("BalanceDate >", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateGreaterThanOrEqualTo(Integer value) {
            addCriterion("BalanceDate >=", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateLessThan(Integer value) {
            addCriterion("BalanceDate <", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateLessThanOrEqualTo(Integer value) {
            addCriterion("BalanceDate <=", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateIn(List<Integer> values) {
            addCriterion("BalanceDate in", values, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateNotIn(List<Integer> values) {
            addCriterion("BalanceDate not in", values, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateBetween(Integer value1, Integer value2) {
            addCriterion("BalanceDate between", value1, value2, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateNotBetween(Integer value1, Integer value2) {
            addCriterion("BalanceDate not between", value1, value2, "balancedate");
            return (Criteria) this;
        }

        public Criteria andDeptrankIsNull() {
            addCriterion("DeptRank is null");
            return (Criteria) this;
        }

        public Criteria andDeptrankIsNotNull() {
            addCriterion("DeptRank is not null");
            return (Criteria) this;
        }

        public Criteria andDeptrankEqualTo(String value) {
            addCriterion("DeptRank =", value, "deptrank");
            return (Criteria) this;
        }

        public Criteria andDeptrankNotEqualTo(String value) {
            addCriterion("DeptRank <>", value, "deptrank");
            return (Criteria) this;
        }

        public Criteria andDeptrankGreaterThan(String value) {
            addCriterion("DeptRank >", value, "deptrank");
            return (Criteria) this;
        }

        public Criteria andDeptrankGreaterThanOrEqualTo(String value) {
            addCriterion("DeptRank >=", value, "deptrank");
            return (Criteria) this;
        }

        public Criteria andDeptrankLessThan(String value) {
            addCriterion("DeptRank <", value, "deptrank");
            return (Criteria) this;
        }

        public Criteria andDeptrankLessThanOrEqualTo(String value) {
            addCriterion("DeptRank <=", value, "deptrank");
            return (Criteria) this;
        }

        public Criteria andDeptrankLike(String value) {
            addCriterion("DeptRank like", value, "deptrank");
            return (Criteria) this;
        }

        public Criteria andDeptrankNotLike(String value) {
            addCriterion("DeptRank not like", value, "deptrank");
            return (Criteria) this;
        }

        public Criteria andDeptrankIn(List<String> values) {
            addCriterion("DeptRank in", values, "deptrank");
            return (Criteria) this;
        }

        public Criteria andDeptrankNotIn(List<String> values) {
            addCriterion("DeptRank not in", values, "deptrank");
            return (Criteria) this;
        }

        public Criteria andDeptrankBetween(String value1, String value2) {
            addCriterion("DeptRank between", value1, value2, "deptrank");
            return (Criteria) this;
        }

        public Criteria andDeptrankNotBetween(String value1, String value2) {
            addCriterion("DeptRank not between", value1, value2, "deptrank");
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

        public Criteria andStuffwarehouseflagIsNull() {
            addCriterion("StuffWarehouseFlag is null");
            return (Criteria) this;
        }

        public Criteria andStuffwarehouseflagIsNotNull() {
            addCriterion("StuffWarehouseFlag is not null");
            return (Criteria) this;
        }

        public Criteria andStuffwarehouseflagEqualTo(Boolean value) {
            addCriterion("StuffWarehouseFlag =", value, "stuffwarehouseflag");
            return (Criteria) this;
        }

        public Criteria andStuffwarehouseflagNotEqualTo(Boolean value) {
            addCriterion("StuffWarehouseFlag <>", value, "stuffwarehouseflag");
            return (Criteria) this;
        }

        public Criteria andStuffwarehouseflagGreaterThan(Boolean value) {
            addCriterion("StuffWarehouseFlag >", value, "stuffwarehouseflag");
            return (Criteria) this;
        }

        public Criteria andStuffwarehouseflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("StuffWarehouseFlag >=", value, "stuffwarehouseflag");
            return (Criteria) this;
        }

        public Criteria andStuffwarehouseflagLessThan(Boolean value) {
            addCriterion("StuffWarehouseFlag <", value, "stuffwarehouseflag");
            return (Criteria) this;
        }

        public Criteria andStuffwarehouseflagLessThanOrEqualTo(Boolean value) {
            addCriterion("StuffWarehouseFlag <=", value, "stuffwarehouseflag");
            return (Criteria) this;
        }

        public Criteria andStuffwarehouseflagIn(List<Boolean> values) {
            addCriterion("StuffWarehouseFlag in", values, "stuffwarehouseflag");
            return (Criteria) this;
        }

        public Criteria andStuffwarehouseflagNotIn(List<Boolean> values) {
            addCriterion("StuffWarehouseFlag not in", values, "stuffwarehouseflag");
            return (Criteria) this;
        }

        public Criteria andStuffwarehouseflagBetween(Boolean value1, Boolean value2) {
            addCriterion("StuffWarehouseFlag between", value1, value2, "stuffwarehouseflag");
            return (Criteria) this;
        }

        public Criteria andStuffwarehouseflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("StuffWarehouseFlag not between", value1, value2, "stuffwarehouseflag");
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

        public Criteria andPointamountIsNull() {
            addCriterion("PointAmount is null");
            return (Criteria) this;
        }

        public Criteria andPointamountIsNotNull() {
            addCriterion("PointAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPointamountEqualTo(BigDecimal value) {
            addCriterion("PointAmount =", value, "pointamount");
            return (Criteria) this;
        }

        public Criteria andPointamountNotEqualTo(BigDecimal value) {
            addCriterion("PointAmount <>", value, "pointamount");
            return (Criteria) this;
        }

        public Criteria andPointamountGreaterThan(BigDecimal value) {
            addCriterion("PointAmount >", value, "pointamount");
            return (Criteria) this;
        }

        public Criteria andPointamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PointAmount >=", value, "pointamount");
            return (Criteria) this;
        }

        public Criteria andPointamountLessThan(BigDecimal value) {
            addCriterion("PointAmount <", value, "pointamount");
            return (Criteria) this;
        }

        public Criteria andPointamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PointAmount <=", value, "pointamount");
            return (Criteria) this;
        }

        public Criteria andPointamountIn(List<BigDecimal> values) {
            addCriterion("PointAmount in", values, "pointamount");
            return (Criteria) this;
        }

        public Criteria andPointamountNotIn(List<BigDecimal> values) {
            addCriterion("PointAmount not in", values, "pointamount");
            return (Criteria) this;
        }

        public Criteria andPointamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PointAmount between", value1, value2, "pointamount");
            return (Criteria) this;
        }

        public Criteria andPointamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PointAmount not between", value1, value2, "pointamount");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagIsNull() {
            addCriterion("SingleCostingFlag is null");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagIsNotNull() {
            addCriterion("SingleCostingFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagEqualTo(Boolean value) {
            addCriterion("SingleCostingFlag =", value, "singlecostingflag");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagNotEqualTo(Boolean value) {
            addCriterion("SingleCostingFlag <>", value, "singlecostingflag");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagGreaterThan(Boolean value) {
            addCriterion("SingleCostingFlag >", value, "singlecostingflag");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SingleCostingFlag >=", value, "singlecostingflag");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagLessThan(Boolean value) {
            addCriterion("SingleCostingFlag <", value, "singlecostingflag");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagLessThanOrEqualTo(Boolean value) {
            addCriterion("SingleCostingFlag <=", value, "singlecostingflag");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagIn(List<Boolean> values) {
            addCriterion("SingleCostingFlag in", values, "singlecostingflag");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagNotIn(List<Boolean> values) {
            addCriterion("SingleCostingFlag not in", values, "singlecostingflag");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagBetween(Boolean value1, Boolean value2) {
            addCriterion("SingleCostingFlag between", value1, value2, "singlecostingflag");
            return (Criteria) this;
        }

        public Criteria andSinglecostingflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SingleCostingFlag not between", value1, value2, "singlecostingflag");
            return (Criteria) this;
        }

        public Criteria andLastcostdateIsNull() {
            addCriterion("LastCostDate is null");
            return (Criteria) this;
        }

        public Criteria andLastcostdateIsNotNull() {
            addCriterion("LastCostDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastcostdateEqualTo(Date value) {
            addCriterion("LastCostDate =", value, "lastcostdate");
            return (Criteria) this;
        }

        public Criteria andLastcostdateNotEqualTo(Date value) {
            addCriterion("LastCostDate <>", value, "lastcostdate");
            return (Criteria) this;
        }

        public Criteria andLastcostdateGreaterThan(Date value) {
            addCriterion("LastCostDate >", value, "lastcostdate");
            return (Criteria) this;
        }

        public Criteria andLastcostdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastCostDate >=", value, "lastcostdate");
            return (Criteria) this;
        }

        public Criteria andLastcostdateLessThan(Date value) {
            addCriterion("LastCostDate <", value, "lastcostdate");
            return (Criteria) this;
        }

        public Criteria andLastcostdateLessThanOrEqualTo(Date value) {
            addCriterion("LastCostDate <=", value, "lastcostdate");
            return (Criteria) this;
        }

        public Criteria andLastcostdateIn(List<Date> values) {
            addCriterion("LastCostDate in", values, "lastcostdate");
            return (Criteria) this;
        }

        public Criteria andLastcostdateNotIn(List<Date> values) {
            addCriterion("LastCostDate not in", values, "lastcostdate");
            return (Criteria) this;
        }

        public Criteria andLastcostdateBetween(Date value1, Date value2) {
            addCriterion("LastCostDate between", value1, value2, "lastcostdate");
            return (Criteria) this;
        }

        public Criteria andLastcostdateNotBetween(Date value1, Date value2) {
            addCriterion("LastCostDate not between", value1, value2, "lastcostdate");
            return (Criteria) this;
        }

        public Criteria andIsrefixIsNull() {
            addCriterion("IsReFix is null");
            return (Criteria) this;
        }

        public Criteria andIsrefixIsNotNull() {
            addCriterion("IsReFix is not null");
            return (Criteria) this;
        }

        public Criteria andIsrefixEqualTo(Boolean value) {
            addCriterion("IsReFix =", value, "isrefix");
            return (Criteria) this;
        }

        public Criteria andIsrefixNotEqualTo(Boolean value) {
            addCriterion("IsReFix <>", value, "isrefix");
            return (Criteria) this;
        }

        public Criteria andIsrefixGreaterThan(Boolean value) {
            addCriterion("IsReFix >", value, "isrefix");
            return (Criteria) this;
        }

        public Criteria andIsrefixGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsReFix >=", value, "isrefix");
            return (Criteria) this;
        }

        public Criteria andIsrefixLessThan(Boolean value) {
            addCriterion("IsReFix <", value, "isrefix");
            return (Criteria) this;
        }

        public Criteria andIsrefixLessThanOrEqualTo(Boolean value) {
            addCriterion("IsReFix <=", value, "isrefix");
            return (Criteria) this;
        }

        public Criteria andIsrefixIn(List<Boolean> values) {
            addCriterion("IsReFix in", values, "isrefix");
            return (Criteria) this;
        }

        public Criteria andIsrefixNotIn(List<Boolean> values) {
            addCriterion("IsReFix not in", values, "isrefix");
            return (Criteria) this;
        }

        public Criteria andIsrefixBetween(Boolean value1, Boolean value2) {
            addCriterion("IsReFix between", value1, value2, "isrefix");
            return (Criteria) this;
        }

        public Criteria andIsrefixNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsReFix not between", value1, value2, "isrefix");
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

        public Criteria andIsonlineIsNull() {
            addCriterion("IsOnline is null");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNotNull() {
            addCriterion("IsOnline is not null");
            return (Criteria) this;
        }

        public Criteria andIsonlineEqualTo(Boolean value) {
            addCriterion("IsOnline =", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotEqualTo(Boolean value) {
            addCriterion("IsOnline <>", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThan(Boolean value) {
            addCriterion("IsOnline >", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsOnline >=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThan(Boolean value) {
            addCriterion("IsOnline <", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThanOrEqualTo(Boolean value) {
            addCriterion("IsOnline <=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineIn(List<Boolean> values) {
            addCriterion("IsOnline in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotIn(List<Boolean> values) {
            addCriterion("IsOnline not in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOnline between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOnline not between", value1, value2, "isonline");
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

        public Criteria andCostwarehouseidIsNull() {
            addCriterion("CostWarehouseID is null");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidIsNotNull() {
            addCriterion("CostWarehouseID is not null");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidEqualTo(String value) {
            addCriterion("CostWarehouseID =", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidNotEqualTo(String value) {
            addCriterion("CostWarehouseID <>", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidGreaterThan(String value) {
            addCriterion("CostWarehouseID >", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("CostWarehouseID >=", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidLessThan(String value) {
            addCriterion("CostWarehouseID <", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidLessThanOrEqualTo(String value) {
            addCriterion("CostWarehouseID <=", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidLike(String value) {
            addCriterion("CostWarehouseID like", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidNotLike(String value) {
            addCriterion("CostWarehouseID not like", value, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidIn(List<String> values) {
            addCriterion("CostWarehouseID in", values, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidNotIn(List<String> values) {
            addCriterion("CostWarehouseID not in", values, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidBetween(String value1, String value2) {
            addCriterion("CostWarehouseID between", value1, value2, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andCostwarehouseidNotBetween(String value1, String value2) {
            addCriterion("CostWarehouseID not between", value1, value2, "costwarehouseid");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNull() {
            addCriterion("OpenDate is null");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNotNull() {
            addCriterion("OpenDate is not null");
            return (Criteria) this;
        }

        public Criteria andOpendateEqualTo(Date value) {
            addCriterion("OpenDate =", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotEqualTo(Date value) {
            addCriterion("OpenDate <>", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThan(Date value) {
            addCriterion("OpenDate >", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThanOrEqualTo(Date value) {
            addCriterion("OpenDate >=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThan(Date value) {
            addCriterion("OpenDate <", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThanOrEqualTo(Date value) {
            addCriterion("OpenDate <=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateIn(List<Date> values) {
            addCriterion("OpenDate in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotIn(List<Date> values) {
            addCriterion("OpenDate not in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateBetween(Date value1, Date value2) {
            addCriterion("OpenDate between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotBetween(Date value1, Date value2) {
            addCriterion("OpenDate not between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueIsNull() {
            addCriterion("RateReCashValue is null");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueIsNotNull() {
            addCriterion("RateReCashValue is not null");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueEqualTo(BigDecimal value) {
            addCriterion("RateReCashValue =", value, "raterecashvalue");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueNotEqualTo(BigDecimal value) {
            addCriterion("RateReCashValue <>", value, "raterecashvalue");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueGreaterThan(BigDecimal value) {
            addCriterion("RateReCashValue >", value, "raterecashvalue");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RateReCashValue >=", value, "raterecashvalue");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueLessThan(BigDecimal value) {
            addCriterion("RateReCashValue <", value, "raterecashvalue");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RateReCashValue <=", value, "raterecashvalue");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueIn(List<BigDecimal> values) {
            addCriterion("RateReCashValue in", values, "raterecashvalue");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueNotIn(List<BigDecimal> values) {
            addCriterion("RateReCashValue not in", values, "raterecashvalue");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RateReCashValue between", value1, value2, "raterecashvalue");
            return (Criteria) this;
        }

        public Criteria andRaterecashvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RateReCashValue not between", value1, value2, "raterecashvalue");
            return (Criteria) this;
        }

        public Criteria andRecashmaxIsNull() {
            addCriterion("ReCashMax is null");
            return (Criteria) this;
        }

        public Criteria andRecashmaxIsNotNull() {
            addCriterion("ReCashMax is not null");
            return (Criteria) this;
        }

        public Criteria andRecashmaxEqualTo(BigDecimal value) {
            addCriterion("ReCashMax =", value, "recashmax");
            return (Criteria) this;
        }

        public Criteria andRecashmaxNotEqualTo(BigDecimal value) {
            addCriterion("ReCashMax <>", value, "recashmax");
            return (Criteria) this;
        }

        public Criteria andRecashmaxGreaterThan(BigDecimal value) {
            addCriterion("ReCashMax >", value, "recashmax");
            return (Criteria) this;
        }

        public Criteria andRecashmaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ReCashMax >=", value, "recashmax");
            return (Criteria) this;
        }

        public Criteria andRecashmaxLessThan(BigDecimal value) {
            addCriterion("ReCashMax <", value, "recashmax");
            return (Criteria) this;
        }

        public Criteria andRecashmaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ReCashMax <=", value, "recashmax");
            return (Criteria) this;
        }

        public Criteria andRecashmaxIn(List<BigDecimal> values) {
            addCriterion("ReCashMax in", values, "recashmax");
            return (Criteria) this;
        }

        public Criteria andRecashmaxNotIn(List<BigDecimal> values) {
            addCriterion("ReCashMax not in", values, "recashmax");
            return (Criteria) this;
        }

        public Criteria andRecashmaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReCashMax between", value1, value2, "recashmax");
            return (Criteria) this;
        }

        public Criteria andRecashmaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReCashMax not between", value1, value2, "recashmax");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("Province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("Province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("Province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("Province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("Province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("Province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("Province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("Province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("Province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("Province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("Province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("Province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("Province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("Province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("County is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("County is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("County =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("County <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("County >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("County >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("County <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("County <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("County like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("County not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("County in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("County not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("County between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("County not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("Street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("Street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("Street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("Street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("Street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("Street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("Street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("Street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("Street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("Street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("Street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("Street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("Street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("Street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andDoorplateIsNull() {
            addCriterion("Doorplate is null");
            return (Criteria) this;
        }

        public Criteria andDoorplateIsNotNull() {
            addCriterion("Doorplate is not null");
            return (Criteria) this;
        }

        public Criteria andDoorplateEqualTo(String value) {
            addCriterion("Doorplate =", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateNotEqualTo(String value) {
            addCriterion("Doorplate <>", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateGreaterThan(String value) {
            addCriterion("Doorplate >", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateGreaterThanOrEqualTo(String value) {
            addCriterion("Doorplate >=", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateLessThan(String value) {
            addCriterion("Doorplate <", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateLessThanOrEqualTo(String value) {
            addCriterion("Doorplate <=", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateLike(String value) {
            addCriterion("Doorplate like", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateNotLike(String value) {
            addCriterion("Doorplate not like", value, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateIn(List<String> values) {
            addCriterion("Doorplate in", values, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateNotIn(List<String> values) {
            addCriterion("Doorplate not in", values, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateBetween(String value1, String value2) {
            addCriterion("Doorplate between", value1, value2, "doorplate");
            return (Criteria) this;
        }

        public Criteria andDoorplateNotBetween(String value1, String value2) {
            addCriterion("Doorplate not between", value1, value2, "doorplate");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagIsNull() {
            addCriterion("StockMoveInAutoFlag is null");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagIsNotNull() {
            addCriterion("StockMoveInAutoFlag is not null");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagEqualTo(Boolean value) {
            addCriterion("StockMoveInAutoFlag =", value, "stockmoveinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagNotEqualTo(Boolean value) {
            addCriterion("StockMoveInAutoFlag <>", value, "stockmoveinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagGreaterThan(Boolean value) {
            addCriterion("StockMoveInAutoFlag >", value, "stockmoveinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("StockMoveInAutoFlag >=", value, "stockmoveinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagLessThan(Boolean value) {
            addCriterion("StockMoveInAutoFlag <", value, "stockmoveinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagLessThanOrEqualTo(Boolean value) {
            addCriterion("StockMoveInAutoFlag <=", value, "stockmoveinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagIn(List<Boolean> values) {
            addCriterion("StockMoveInAutoFlag in", values, "stockmoveinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagNotIn(List<Boolean> values) {
            addCriterion("StockMoveInAutoFlag not in", values, "stockmoveinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagBetween(Boolean value1, Boolean value2) {
            addCriterion("StockMoveInAutoFlag between", value1, value2, "stockmoveinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveinautoflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("StockMoveInAutoFlag not between", value1, value2, "stockmoveinautoflag");
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

        public Criteria andIsstockmovepayIsNull() {
            addCriterion("IsStockMovePay is null");
            return (Criteria) this;
        }

        public Criteria andIsstockmovepayIsNotNull() {
            addCriterion("IsStockMovePay is not null");
            return (Criteria) this;
        }

        public Criteria andIsstockmovepayEqualTo(Boolean value) {
            addCriterion("IsStockMovePay =", value, "isstockmovepay");
            return (Criteria) this;
        }

        public Criteria andIsstockmovepayNotEqualTo(Boolean value) {
            addCriterion("IsStockMovePay <>", value, "isstockmovepay");
            return (Criteria) this;
        }

        public Criteria andIsstockmovepayGreaterThan(Boolean value) {
            addCriterion("IsStockMovePay >", value, "isstockmovepay");
            return (Criteria) this;
        }

        public Criteria andIsstockmovepayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsStockMovePay >=", value, "isstockmovepay");
            return (Criteria) this;
        }

        public Criteria andIsstockmovepayLessThan(Boolean value) {
            addCriterion("IsStockMovePay <", value, "isstockmovepay");
            return (Criteria) this;
        }

        public Criteria andIsstockmovepayLessThanOrEqualTo(Boolean value) {
            addCriterion("IsStockMovePay <=", value, "isstockmovepay");
            return (Criteria) this;
        }

        public Criteria andIsstockmovepayIn(List<Boolean> values) {
            addCriterion("IsStockMovePay in", values, "isstockmovepay");
            return (Criteria) this;
        }

        public Criteria andIsstockmovepayNotIn(List<Boolean> values) {
            addCriterion("IsStockMovePay not in", values, "isstockmovepay");
            return (Criteria) this;
        }

        public Criteria andIsstockmovepayBetween(Boolean value1, Boolean value2) {
            addCriterion("IsStockMovePay between", value1, value2, "isstockmovepay");
            return (Criteria) this;
        }

        public Criteria andIsstockmovepayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsStockMovePay not between", value1, value2, "isstockmovepay");
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

        public Criteria andBycommercialareaIsNull() {
            addCriterion("ByCommercialArea is null");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaIsNotNull() {
            addCriterion("ByCommercialArea is not null");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaEqualTo(String value) {
            addCriterion("ByCommercialArea =", value, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaNotEqualTo(String value) {
            addCriterion("ByCommercialArea <>", value, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaGreaterThan(String value) {
            addCriterion("ByCommercialArea >", value, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaGreaterThanOrEqualTo(String value) {
            addCriterion("ByCommercialArea >=", value, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaLessThan(String value) {
            addCriterion("ByCommercialArea <", value, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaLessThanOrEqualTo(String value) {
            addCriterion("ByCommercialArea <=", value, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaLike(String value) {
            addCriterion("ByCommercialArea like", value, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaNotLike(String value) {
            addCriterion("ByCommercialArea not like", value, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaIn(List<String> values) {
            addCriterion("ByCommercialArea in", values, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaNotIn(List<String> values) {
            addCriterion("ByCommercialArea not in", values, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaBetween(String value1, String value2) {
            addCriterion("ByCommercialArea between", value1, value2, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andBycommercialareaNotBetween(String value1, String value2) {
            addCriterion("ByCommercialArea not between", value1, value2, "bycommercialarea");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelIsNull() {
            addCriterion("ShopCenterLevel is null");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelIsNotNull() {
            addCriterion("ShopCenterLevel is not null");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelEqualTo(String value) {
            addCriterion("ShopCenterLevel =", value, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelNotEqualTo(String value) {
            addCriterion("ShopCenterLevel <>", value, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelGreaterThan(String value) {
            addCriterion("ShopCenterLevel >", value, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelGreaterThanOrEqualTo(String value) {
            addCriterion("ShopCenterLevel >=", value, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelLessThan(String value) {
            addCriterion("ShopCenterLevel <", value, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelLessThanOrEqualTo(String value) {
            addCriterion("ShopCenterLevel <=", value, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelLike(String value) {
            addCriterion("ShopCenterLevel like", value, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelNotLike(String value) {
            addCriterion("ShopCenterLevel not like", value, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelIn(List<String> values) {
            addCriterion("ShopCenterLevel in", values, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelNotIn(List<String> values) {
            addCriterion("ShopCenterLevel not in", values, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelBetween(String value1, String value2) {
            addCriterion("ShopCenterLevel between", value1, value2, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andShopcenterlevelNotBetween(String value1, String value2) {
            addCriterion("ShopCenterLevel not between", value1, value2, "shopcenterlevel");
            return (Criteria) this;
        }

        public Criteria andSettlecustidIsNull() {
            addCriterion("SettleCustID is null");
            return (Criteria) this;
        }

        public Criteria andSettlecustidIsNotNull() {
            addCriterion("SettleCustID is not null");
            return (Criteria) this;
        }

        public Criteria andSettlecustidEqualTo(String value) {
            addCriterion("SettleCustID =", value, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andSettlecustidNotEqualTo(String value) {
            addCriterion("SettleCustID <>", value, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andSettlecustidGreaterThan(String value) {
            addCriterion("SettleCustID >", value, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andSettlecustidGreaterThanOrEqualTo(String value) {
            addCriterion("SettleCustID >=", value, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andSettlecustidLessThan(String value) {
            addCriterion("SettleCustID <", value, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andSettlecustidLessThanOrEqualTo(String value) {
            addCriterion("SettleCustID <=", value, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andSettlecustidLike(String value) {
            addCriterion("SettleCustID like", value, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andSettlecustidNotLike(String value) {
            addCriterion("SettleCustID not like", value, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andSettlecustidIn(List<String> values) {
            addCriterion("SettleCustID in", values, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andSettlecustidNotIn(List<String> values) {
            addCriterion("SettleCustID not in", values, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andSettlecustidBetween(String value1, String value2) {
            addCriterion("SettleCustID between", value1, value2, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andSettlecustidNotBetween(String value1, String value2) {
            addCriterion("SettleCustID not between", value1, value2, "settlecustid");
            return (Criteria) this;
        }

        public Criteria andUppmenidIsNull() {
            addCriterion("UppmenID is null");
            return (Criteria) this;
        }

        public Criteria andUppmenidIsNotNull() {
            addCriterion("UppmenID is not null");
            return (Criteria) this;
        }

        public Criteria andUppmenidEqualTo(String value) {
            addCriterion("UppmenID =", value, "uppmenid");
            return (Criteria) this;
        }

        public Criteria andUppmenidNotEqualTo(String value) {
            addCriterion("UppmenID <>", value, "uppmenid");
            return (Criteria) this;
        }

        public Criteria andUppmenidGreaterThan(String value) {
            addCriterion("UppmenID >", value, "uppmenid");
            return (Criteria) this;
        }

        public Criteria andUppmenidGreaterThanOrEqualTo(String value) {
            addCriterion("UppmenID >=", value, "uppmenid");
            return (Criteria) this;
        }

        public Criteria andUppmenidLessThan(String value) {
            addCriterion("UppmenID <", value, "uppmenid");
            return (Criteria) this;
        }

        public Criteria andUppmenidLessThanOrEqualTo(String value) {
            addCriterion("UppmenID <=", value, "uppmenid");
            return (Criteria) this;
        }

        public Criteria andUppmenidLike(String value) {
            addCriterion("UppmenID like", value, "uppmenid");
            return (Criteria) this;
        }

        public Criteria andUppmenidNotLike(String value) {
            addCriterion("UppmenID not like", value, "uppmenid");
            return (Criteria) this;
        }

        public Criteria andUppmenidIn(List<String> values) {
            addCriterion("UppmenID in", values, "uppmenid");
            return (Criteria) this;
        }

        public Criteria andUppmenidNotIn(List<String> values) {
            addCriterion("UppmenID not in", values, "uppmenid");
            return (Criteria) this;
        }

        public Criteria andUppmenidBetween(String value1, String value2) {
            addCriterion("UppmenID between", value1, value2, "uppmenid");
            return (Criteria) this;
        }

        public Criteria andUppmenidNotBetween(String value1, String value2) {
            addCriterion("UppmenID not between", value1, value2, "uppmenid");
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

        public Criteria andUppmen2idIsNull() {
            addCriterion("Uppmen2id is null");
            return (Criteria) this;
        }

        public Criteria andUppmen2idIsNotNull() {
            addCriterion("Uppmen2id is not null");
            return (Criteria) this;
        }

        public Criteria andUppmen2idEqualTo(String value) {
            addCriterion("Uppmen2id =", value, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andUppmen2idNotEqualTo(String value) {
            addCriterion("Uppmen2id <>", value, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andUppmen2idGreaterThan(String value) {
            addCriterion("Uppmen2id >", value, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andUppmen2idGreaterThanOrEqualTo(String value) {
            addCriterion("Uppmen2id >=", value, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andUppmen2idLessThan(String value) {
            addCriterion("Uppmen2id <", value, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andUppmen2idLessThanOrEqualTo(String value) {
            addCriterion("Uppmen2id <=", value, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andUppmen2idLike(String value) {
            addCriterion("Uppmen2id like", value, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andUppmen2idNotLike(String value) {
            addCriterion("Uppmen2id not like", value, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andUppmen2idIn(List<String> values) {
            addCriterion("Uppmen2id in", values, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andUppmen2idNotIn(List<String> values) {
            addCriterion("Uppmen2id not in", values, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andUppmen2idBetween(String value1, String value2) {
            addCriterion("Uppmen2id between", value1, value2, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andUppmen2idNotBetween(String value1, String value2) {
            addCriterion("Uppmen2id not between", value1, value2, "uppmen2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idIsNull() {
            addCriterion("Employee2id is null");
            return (Criteria) this;
        }

        public Criteria andEmployee2idIsNotNull() {
            addCriterion("Employee2id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployee2idEqualTo(String value) {
            addCriterion("Employee2id =", value, "employee2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idNotEqualTo(String value) {
            addCriterion("Employee2id <>", value, "employee2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idGreaterThan(String value) {
            addCriterion("Employee2id >", value, "employee2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idGreaterThanOrEqualTo(String value) {
            addCriterion("Employee2id >=", value, "employee2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idLessThan(String value) {
            addCriterion("Employee2id <", value, "employee2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idLessThanOrEqualTo(String value) {
            addCriterion("Employee2id <=", value, "employee2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idLike(String value) {
            addCriterion("Employee2id like", value, "employee2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idNotLike(String value) {
            addCriterion("Employee2id not like", value, "employee2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idIn(List<String> values) {
            addCriterion("Employee2id in", values, "employee2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idNotIn(List<String> values) {
            addCriterion("Employee2id not in", values, "employee2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idBetween(String value1, String value2) {
            addCriterion("Employee2id between", value1, value2, "employee2id");
            return (Criteria) this;
        }

        public Criteria andEmployee2idNotBetween(String value1, String value2) {
            addCriterion("Employee2id not between", value1, value2, "employee2id");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagIsNull() {
            addCriterion("POSWholeNumFlag is null");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagIsNotNull() {
            addCriterion("POSWholeNumFlag is not null");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagEqualTo(Integer value) {
            addCriterion("POSWholeNumFlag =", value, "poswholenumflag");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagNotEqualTo(Integer value) {
            addCriterion("POSWholeNumFlag <>", value, "poswholenumflag");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagGreaterThan(Integer value) {
            addCriterion("POSWholeNumFlag >", value, "poswholenumflag");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("POSWholeNumFlag >=", value, "poswholenumflag");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagLessThan(Integer value) {
            addCriterion("POSWholeNumFlag <", value, "poswholenumflag");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagLessThanOrEqualTo(Integer value) {
            addCriterion("POSWholeNumFlag <=", value, "poswholenumflag");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagIn(List<Integer> values) {
            addCriterion("POSWholeNumFlag in", values, "poswholenumflag");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagNotIn(List<Integer> values) {
            addCriterion("POSWholeNumFlag not in", values, "poswholenumflag");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagBetween(Integer value1, Integer value2) {
            addCriterion("POSWholeNumFlag between", value1, value2, "poswholenumflag");
            return (Criteria) this;
        }

        public Criteria andPoswholenumflagNotBetween(Integer value1, Integer value2) {
            addCriterion("POSWholeNumFlag not between", value1, value2, "poswholenumflag");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeIsNull() {
            addCriterion("POSNumType is null");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeIsNotNull() {
            addCriterion("POSNumType is not null");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeEqualTo(String value) {
            addCriterion("POSNumType =", value, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeNotEqualTo(String value) {
            addCriterion("POSNumType <>", value, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeGreaterThan(String value) {
            addCriterion("POSNumType >", value, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeGreaterThanOrEqualTo(String value) {
            addCriterion("POSNumType >=", value, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeLessThan(String value) {
            addCriterion("POSNumType <", value, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeLessThanOrEqualTo(String value) {
            addCriterion("POSNumType <=", value, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeLike(String value) {
            addCriterion("POSNumType like", value, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeNotLike(String value) {
            addCriterion("POSNumType not like", value, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeIn(List<String> values) {
            addCriterion("POSNumType in", values, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeNotIn(List<String> values) {
            addCriterion("POSNumType not in", values, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeBetween(String value1, String value2) {
            addCriterion("POSNumType between", value1, value2, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andPosnumtypeNotBetween(String value1, String value2) {
            addCriterion("POSNumType not between", value1, value2, "posnumtype");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryIsNull() {
            addCriterion("RecentInventory is null");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryIsNotNull() {
            addCriterion("RecentInventory is not null");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryEqualTo(Date value) {
            addCriterion("RecentInventory =", value, "recentinventory");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryNotEqualTo(Date value) {
            addCriterion("RecentInventory <>", value, "recentinventory");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryGreaterThan(Date value) {
            addCriterion("RecentInventory >", value, "recentinventory");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryGreaterThanOrEqualTo(Date value) {
            addCriterion("RecentInventory >=", value, "recentinventory");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryLessThan(Date value) {
            addCriterion("RecentInventory <", value, "recentinventory");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryLessThanOrEqualTo(Date value) {
            addCriterion("RecentInventory <=", value, "recentinventory");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryIn(List<Date> values) {
            addCriterion("RecentInventory in", values, "recentinventory");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryNotIn(List<Date> values) {
            addCriterion("RecentInventory not in", values, "recentinventory");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryBetween(Date value1, Date value2) {
            addCriterion("RecentInventory between", value1, value2, "recentinventory");
            return (Criteria) this;
        }

        public Criteria andRecentinventoryNotBetween(Date value1, Date value2) {
            addCriterion("RecentInventory not between", value1, value2, "recentinventory");
            return (Criteria) this;
        }

        public Criteria andAccountitemIsNull() {
            addCriterion("AccountItem is null");
            return (Criteria) this;
        }

        public Criteria andAccountitemIsNotNull() {
            addCriterion("AccountItem is not null");
            return (Criteria) this;
        }

        public Criteria andAccountitemEqualTo(String value) {
            addCriterion("AccountItem =", value, "accountitem");
            return (Criteria) this;
        }

        public Criteria andAccountitemNotEqualTo(String value) {
            addCriterion("AccountItem <>", value, "accountitem");
            return (Criteria) this;
        }

        public Criteria andAccountitemGreaterThan(String value) {
            addCriterion("AccountItem >", value, "accountitem");
            return (Criteria) this;
        }

        public Criteria andAccountitemGreaterThanOrEqualTo(String value) {
            addCriterion("AccountItem >=", value, "accountitem");
            return (Criteria) this;
        }

        public Criteria andAccountitemLessThan(String value) {
            addCriterion("AccountItem <", value, "accountitem");
            return (Criteria) this;
        }

        public Criteria andAccountitemLessThanOrEqualTo(String value) {
            addCriterion("AccountItem <=", value, "accountitem");
            return (Criteria) this;
        }

        public Criteria andAccountitemLike(String value) {
            addCriterion("AccountItem like", value, "accountitem");
            return (Criteria) this;
        }

        public Criteria andAccountitemNotLike(String value) {
            addCriterion("AccountItem not like", value, "accountitem");
            return (Criteria) this;
        }

        public Criteria andAccountitemIn(List<String> values) {
            addCriterion("AccountItem in", values, "accountitem");
            return (Criteria) this;
        }

        public Criteria andAccountitemNotIn(List<String> values) {
            addCriterion("AccountItem not in", values, "accountitem");
            return (Criteria) this;
        }

        public Criteria andAccountitemBetween(String value1, String value2) {
            addCriterion("AccountItem between", value1, value2, "accountitem");
            return (Criteria) this;
        }

        public Criteria andAccountitemNotBetween(String value1, String value2) {
            addCriterion("AccountItem not between", value1, value2, "accountitem");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagIsNull() {
            addCriterion("EShopSendFlag is null");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagIsNotNull() {
            addCriterion("EShopSendFlag is not null");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagEqualTo(Boolean value) {
            addCriterion("EShopSendFlag =", value, "eshopsendflag");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagNotEqualTo(Boolean value) {
            addCriterion("EShopSendFlag <>", value, "eshopsendflag");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagGreaterThan(Boolean value) {
            addCriterion("EShopSendFlag >", value, "eshopsendflag");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("EShopSendFlag >=", value, "eshopsendflag");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagLessThan(Boolean value) {
            addCriterion("EShopSendFlag <", value, "eshopsendflag");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagLessThanOrEqualTo(Boolean value) {
            addCriterion("EShopSendFlag <=", value, "eshopsendflag");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagIn(List<Boolean> values) {
            addCriterion("EShopSendFlag in", values, "eshopsendflag");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagNotIn(List<Boolean> values) {
            addCriterion("EShopSendFlag not in", values, "eshopsendflag");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagBetween(Boolean value1, Boolean value2) {
            addCriterion("EShopSendFlag between", value1, value2, "eshopsendflag");
            return (Criteria) this;
        }

        public Criteria andEshopsendflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("EShopSendFlag not between", value1, value2, "eshopsendflag");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyIsNull() {
            addCriterion("PointToOneMoney is null");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyIsNotNull() {
            addCriterion("PointToOneMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyEqualTo(BigDecimal value) {
            addCriterion("PointToOneMoney =", value, "pointtoonemoney");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyNotEqualTo(BigDecimal value) {
            addCriterion("PointToOneMoney <>", value, "pointtoonemoney");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyGreaterThan(BigDecimal value) {
            addCriterion("PointToOneMoney >", value, "pointtoonemoney");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PointToOneMoney >=", value, "pointtoonemoney");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyLessThan(BigDecimal value) {
            addCriterion("PointToOneMoney <", value, "pointtoonemoney");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PointToOneMoney <=", value, "pointtoonemoney");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyIn(List<BigDecimal> values) {
            addCriterion("PointToOneMoney in", values, "pointtoonemoney");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyNotIn(List<BigDecimal> values) {
            addCriterion("PointToOneMoney not in", values, "pointtoonemoney");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PointToOneMoney between", value1, value2, "pointtoonemoney");
            return (Criteria) this;
        }

        public Criteria andPointtoonemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PointToOneMoney not between", value1, value2, "pointtoonemoney");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagIsNull() {
            addCriterion("MustExistsGoodsFlag is null");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagIsNotNull() {
            addCriterion("MustExistsGoodsFlag is not null");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagEqualTo(Boolean value) {
            addCriterion("MustExistsGoodsFlag =", value, "mustexistsgoodsflag");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagNotEqualTo(Boolean value) {
            addCriterion("MustExistsGoodsFlag <>", value, "mustexistsgoodsflag");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagGreaterThan(Boolean value) {
            addCriterion("MustExistsGoodsFlag >", value, "mustexistsgoodsflag");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("MustExistsGoodsFlag >=", value, "mustexistsgoodsflag");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagLessThan(Boolean value) {
            addCriterion("MustExistsGoodsFlag <", value, "mustexistsgoodsflag");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagLessThanOrEqualTo(Boolean value) {
            addCriterion("MustExistsGoodsFlag <=", value, "mustexistsgoodsflag");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagIn(List<Boolean> values) {
            addCriterion("MustExistsGoodsFlag in", values, "mustexistsgoodsflag");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagNotIn(List<Boolean> values) {
            addCriterion("MustExistsGoodsFlag not in", values, "mustexistsgoodsflag");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagBetween(Boolean value1, Boolean value2) {
            addCriterion("MustExistsGoodsFlag between", value1, value2, "mustexistsgoodsflag");
            return (Criteria) this;
        }

        public Criteria andMustexistsgoodsflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("MustExistsGoodsFlag not between", value1, value2, "mustexistsgoodsflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagIsNull() {
            addCriterion("StockMoveOutAutoFlag is null");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagIsNotNull() {
            addCriterion("StockMoveOutAutoFlag is not null");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagEqualTo(Boolean value) {
            addCriterion("StockMoveOutAutoFlag =", value, "stockmoveoutautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagNotEqualTo(Boolean value) {
            addCriterion("StockMoveOutAutoFlag <>", value, "stockmoveoutautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagGreaterThan(Boolean value) {
            addCriterion("StockMoveOutAutoFlag >", value, "stockmoveoutautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("StockMoveOutAutoFlag >=", value, "stockmoveoutautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagLessThan(Boolean value) {
            addCriterion("StockMoveOutAutoFlag <", value, "stockmoveoutautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagLessThanOrEqualTo(Boolean value) {
            addCriterion("StockMoveOutAutoFlag <=", value, "stockmoveoutautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagIn(List<Boolean> values) {
            addCriterion("StockMoveOutAutoFlag in", values, "stockmoveoutautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagNotIn(List<Boolean> values) {
            addCriterion("StockMoveOutAutoFlag not in", values, "stockmoveoutautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagBetween(Boolean value1, Boolean value2) {
            addCriterion("StockMoveOutAutoFlag between", value1, value2, "stockmoveoutautoflag");
            return (Criteria) this;
        }

        public Criteria andStockmoveoutautoflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("StockMoveOutAutoFlag not between", value1, value2, "stockmoveoutautoflag");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagIsNull() {
            addCriterion("POSNonZeroStockFlag is null");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagIsNotNull() {
            addCriterion("POSNonZeroStockFlag is not null");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagEqualTo(Boolean value) {
            addCriterion("POSNonZeroStockFlag =", value, "posnonzerostockflag");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagNotEqualTo(Boolean value) {
            addCriterion("POSNonZeroStockFlag <>", value, "posnonzerostockflag");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagGreaterThan(Boolean value) {
            addCriterion("POSNonZeroStockFlag >", value, "posnonzerostockflag");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("POSNonZeroStockFlag >=", value, "posnonzerostockflag");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagLessThan(Boolean value) {
            addCriterion("POSNonZeroStockFlag <", value, "posnonzerostockflag");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagLessThanOrEqualTo(Boolean value) {
            addCriterion("POSNonZeroStockFlag <=", value, "posnonzerostockflag");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagIn(List<Boolean> values) {
            addCriterion("POSNonZeroStockFlag in", values, "posnonzerostockflag");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagNotIn(List<Boolean> values) {
            addCriterion("POSNonZeroStockFlag not in", values, "posnonzerostockflag");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagBetween(Boolean value1, Boolean value2) {
            addCriterion("POSNonZeroStockFlag between", value1, value2, "posnonzerostockflag");
            return (Criteria) this;
        }

        public Criteria andPosnonzerostockflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("POSNonZeroStockFlag not between", value1, value2, "posnonzerostockflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagIsNull() {
            addCriterion("SumFactAmtFlag is null");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagIsNotNull() {
            addCriterion("SumFactAmtFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagEqualTo(String value) {
            addCriterion("SumFactAmtFlag =", value, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagNotEqualTo(String value) {
            addCriterion("SumFactAmtFlag <>", value, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagGreaterThan(String value) {
            addCriterion("SumFactAmtFlag >", value, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagGreaterThanOrEqualTo(String value) {
            addCriterion("SumFactAmtFlag >=", value, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagLessThan(String value) {
            addCriterion("SumFactAmtFlag <", value, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagLessThanOrEqualTo(String value) {
            addCriterion("SumFactAmtFlag <=", value, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagLike(String value) {
            addCriterion("SumFactAmtFlag like", value, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagNotLike(String value) {
            addCriterion("SumFactAmtFlag not like", value, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagIn(List<String> values) {
            addCriterion("SumFactAmtFlag in", values, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagNotIn(List<String> values) {
            addCriterion("SumFactAmtFlag not in", values, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagBetween(String value1, String value2) {
            addCriterion("SumFactAmtFlag between", value1, value2, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andSumfactamtflagNotBetween(String value1, String value2) {
            addCriterion("SumFactAmtFlag not between", value1, value2, "sumfactamtflag");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeIsNull() {
            addCriterion("OriginalCode is null");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeIsNotNull() {
            addCriterion("OriginalCode is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeEqualTo(String value) {
            addCriterion("OriginalCode =", value, "originalcode");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeNotEqualTo(String value) {
            addCriterion("OriginalCode <>", value, "originalcode");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeGreaterThan(String value) {
            addCriterion("OriginalCode >", value, "originalcode");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OriginalCode >=", value, "originalcode");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeLessThan(String value) {
            addCriterion("OriginalCode <", value, "originalcode");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeLessThanOrEqualTo(String value) {
            addCriterion("OriginalCode <=", value, "originalcode");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeLike(String value) {
            addCriterion("OriginalCode like", value, "originalcode");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeNotLike(String value) {
            addCriterion("OriginalCode not like", value, "originalcode");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeIn(List<String> values) {
            addCriterion("OriginalCode in", values, "originalcode");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeNotIn(List<String> values) {
            addCriterion("OriginalCode not in", values, "originalcode");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeBetween(String value1, String value2) {
            addCriterion("OriginalCode between", value1, value2, "originalcode");
            return (Criteria) this;
        }

        public Criteria andOriginalcodeNotBetween(String value1, String value2) {
            addCriterion("OriginalCode not between", value1, value2, "originalcode");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNull() {
            addCriterion("BaseAmount is null");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNotNull() {
            addCriterion("BaseAmount is not null");
            return (Criteria) this;
        }

        public Criteria andBaseamountEqualTo(BigDecimal value) {
            addCriterion("BaseAmount =", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotEqualTo(BigDecimal value) {
            addCriterion("BaseAmount <>", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThan(BigDecimal value) {
            addCriterion("BaseAmount >", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BaseAmount >=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThan(BigDecimal value) {
            addCriterion("BaseAmount <", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BaseAmount <=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIn(List<BigDecimal> values) {
            addCriterion("BaseAmount in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotIn(List<BigDecimal> values) {
            addCriterion("BaseAmount not in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BaseAmount between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BaseAmount not between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andSalestypeIsNull() {
            addCriterion("SalesType is null");
            return (Criteria) this;
        }

        public Criteria andSalestypeIsNotNull() {
            addCriterion("SalesType is not null");
            return (Criteria) this;
        }

        public Criteria andSalestypeEqualTo(String value) {
            addCriterion("SalesType =", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeNotEqualTo(String value) {
            addCriterion("SalesType <>", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeGreaterThan(String value) {
            addCriterion("SalesType >", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeGreaterThanOrEqualTo(String value) {
            addCriterion("SalesType >=", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeLessThan(String value) {
            addCriterion("SalesType <", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeLessThanOrEqualTo(String value) {
            addCriterion("SalesType <=", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeLike(String value) {
            addCriterion("SalesType like", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeNotLike(String value) {
            addCriterion("SalesType not like", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeIn(List<String> values) {
            addCriterion("SalesType in", values, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeNotIn(List<String> values) {
            addCriterion("SalesType not in", values, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeBetween(String value1, String value2) {
            addCriterion("SalesType between", value1, value2, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeNotBetween(String value1, String value2) {
            addCriterion("SalesType not between", value1, value2, "salestype");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagIsNull() {
            addCriterion("StockInAutoFlag is null");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagIsNotNull() {
            addCriterion("StockInAutoFlag is not null");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagEqualTo(Boolean value) {
            addCriterion("StockInAutoFlag =", value, "stockinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagNotEqualTo(Boolean value) {
            addCriterion("StockInAutoFlag <>", value, "stockinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagGreaterThan(Boolean value) {
            addCriterion("StockInAutoFlag >", value, "stockinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("StockInAutoFlag >=", value, "stockinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagLessThan(Boolean value) {
            addCriterion("StockInAutoFlag <", value, "stockinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagLessThanOrEqualTo(Boolean value) {
            addCriterion("StockInAutoFlag <=", value, "stockinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagIn(List<Boolean> values) {
            addCriterion("StockInAutoFlag in", values, "stockinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagNotIn(List<Boolean> values) {
            addCriterion("StockInAutoFlag not in", values, "stockinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagBetween(Boolean value1, Boolean value2) {
            addCriterion("StockInAutoFlag between", value1, value2, "stockinautoflag");
            return (Criteria) this;
        }

        public Criteria andStockinautoflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("StockInAutoFlag not between", value1, value2, "stockinautoflag");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutIsNull() {
            addCriterion("DaysumNonStockOut is null");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutIsNotNull() {
            addCriterion("DaysumNonStockOut is not null");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutEqualTo(Boolean value) {
            addCriterion("DaysumNonStockOut =", value, "daysumnonstockout");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutNotEqualTo(Boolean value) {
            addCriterion("DaysumNonStockOut <>", value, "daysumnonstockout");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutGreaterThan(Boolean value) {
            addCriterion("DaysumNonStockOut >", value, "daysumnonstockout");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DaysumNonStockOut >=", value, "daysumnonstockout");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutLessThan(Boolean value) {
            addCriterion("DaysumNonStockOut <", value, "daysumnonstockout");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutLessThanOrEqualTo(Boolean value) {
            addCriterion("DaysumNonStockOut <=", value, "daysumnonstockout");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutIn(List<Boolean> values) {
            addCriterion("DaysumNonStockOut in", values, "daysumnonstockout");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutNotIn(List<Boolean> values) {
            addCriterion("DaysumNonStockOut not in", values, "daysumnonstockout");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutBetween(Boolean value1, Boolean value2) {
            addCriterion("DaysumNonStockOut between", value1, value2, "daysumnonstockout");
            return (Criteria) this;
        }

        public Criteria andDaysumnonstockoutNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DaysumNonStockOut not between", value1, value2, "daysumnonstockout");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointIsNull() {
            addCriterion("BirthdayMultiPoint is null");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointIsNotNull() {
            addCriterion("BirthdayMultiPoint is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointEqualTo(BigDecimal value) {
            addCriterion("BirthdayMultiPoint =", value, "birthdaymultipoint");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointNotEqualTo(BigDecimal value) {
            addCriterion("BirthdayMultiPoint <>", value, "birthdaymultipoint");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointGreaterThan(BigDecimal value) {
            addCriterion("BirthdayMultiPoint >", value, "birthdaymultipoint");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BirthdayMultiPoint >=", value, "birthdaymultipoint");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointLessThan(BigDecimal value) {
            addCriterion("BirthdayMultiPoint <", value, "birthdaymultipoint");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BirthdayMultiPoint <=", value, "birthdaymultipoint");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointIn(List<BigDecimal> values) {
            addCriterion("BirthdayMultiPoint in", values, "birthdaymultipoint");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointNotIn(List<BigDecimal> values) {
            addCriterion("BirthdayMultiPoint not in", values, "birthdaymultipoint");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BirthdayMultiPoint between", value1, value2, "birthdaymultipoint");
            return (Criteria) this;
        }

        public Criteria andBirthdaymultipointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BirthdayMultiPoint not between", value1, value2, "birthdaymultipoint");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderIsNull() {
            addCriterion("ReCashByRecommender is null");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderIsNotNull() {
            addCriterion("ReCashByRecommender is not null");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderEqualTo(BigDecimal value) {
            addCriterion("ReCashByRecommender =", value, "recashbyrecommender");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderNotEqualTo(BigDecimal value) {
            addCriterion("ReCashByRecommender <>", value, "recashbyrecommender");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderGreaterThan(BigDecimal value) {
            addCriterion("ReCashByRecommender >", value, "recashbyrecommender");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ReCashByRecommender >=", value, "recashbyrecommender");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderLessThan(BigDecimal value) {
            addCriterion("ReCashByRecommender <", value, "recashbyrecommender");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ReCashByRecommender <=", value, "recashbyrecommender");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderIn(List<BigDecimal> values) {
            addCriterion("ReCashByRecommender in", values, "recashbyrecommender");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderNotIn(List<BigDecimal> values) {
            addCriterion("ReCashByRecommender not in", values, "recashbyrecommender");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReCashByRecommender between", value1, value2, "recashbyrecommender");
            return (Criteria) this;
        }

        public Criteria andRecashbyrecommenderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReCashByRecommender not between", value1, value2, "recashbyrecommender");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagIsNull() {
            addCriterion("PurchaseStockInAutoFlag is null");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagIsNotNull() {
            addCriterion("PurchaseStockInAutoFlag is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagEqualTo(Boolean value) {
            addCriterion("PurchaseStockInAutoFlag =", value, "purchasestockinautoflag");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagNotEqualTo(Boolean value) {
            addCriterion("PurchaseStockInAutoFlag <>", value, "purchasestockinautoflag");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagGreaterThan(Boolean value) {
            addCriterion("PurchaseStockInAutoFlag >", value, "purchasestockinautoflag");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PurchaseStockInAutoFlag >=", value, "purchasestockinautoflag");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagLessThan(Boolean value) {
            addCriterion("PurchaseStockInAutoFlag <", value, "purchasestockinautoflag");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagLessThanOrEqualTo(Boolean value) {
            addCriterion("PurchaseStockInAutoFlag <=", value, "purchasestockinautoflag");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagIn(List<Boolean> values) {
            addCriterion("PurchaseStockInAutoFlag in", values, "purchasestockinautoflag");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagNotIn(List<Boolean> values) {
            addCriterion("PurchaseStockInAutoFlag not in", values, "purchasestockinautoflag");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagBetween(Boolean value1, Boolean value2) {
            addCriterion("PurchaseStockInAutoFlag between", value1, value2, "purchasestockinautoflag");
            return (Criteria) this;
        }

        public Criteria andPurchasestockinautoflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PurchaseStockInAutoFlag not between", value1, value2, "purchasestockinautoflag");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagIsNull() {
            addCriterion("POS_AllowAddVIPFlag is null");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagIsNotNull() {
            addCriterion("POS_AllowAddVIPFlag is not null");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagEqualTo(Boolean value) {
            addCriterion("POS_AllowAddVIPFlag =", value, "posAllowaddvipflag");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagNotEqualTo(Boolean value) {
            addCriterion("POS_AllowAddVIPFlag <>", value, "posAllowaddvipflag");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagGreaterThan(Boolean value) {
            addCriterion("POS_AllowAddVIPFlag >", value, "posAllowaddvipflag");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("POS_AllowAddVIPFlag >=", value, "posAllowaddvipflag");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagLessThan(Boolean value) {
            addCriterion("POS_AllowAddVIPFlag <", value, "posAllowaddvipflag");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagLessThanOrEqualTo(Boolean value) {
            addCriterion("POS_AllowAddVIPFlag <=", value, "posAllowaddvipflag");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagIn(List<Boolean> values) {
            addCriterion("POS_AllowAddVIPFlag in", values, "posAllowaddvipflag");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagNotIn(List<Boolean> values) {
            addCriterion("POS_AllowAddVIPFlag not in", values, "posAllowaddvipflag");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagBetween(Boolean value1, Boolean value2) {
            addCriterion("POS_AllowAddVIPFlag between", value1, value2, "posAllowaddvipflag");
            return (Criteria) this;
        }

        public Criteria andPosAllowaddvipflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("POS_AllowAddVIPFlag not between", value1, value2, "posAllowaddvipflag");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagIsNull() {
            addCriterion("POSWholeBackFlag is null");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagIsNotNull() {
            addCriterion("POSWholeBackFlag is not null");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagEqualTo(Boolean value) {
            addCriterion("POSWholeBackFlag =", value, "poswholebackflag");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagNotEqualTo(Boolean value) {
            addCriterion("POSWholeBackFlag <>", value, "poswholebackflag");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagGreaterThan(Boolean value) {
            addCriterion("POSWholeBackFlag >", value, "poswholebackflag");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("POSWholeBackFlag >=", value, "poswholebackflag");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagLessThan(Boolean value) {
            addCriterion("POSWholeBackFlag <", value, "poswholebackflag");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagLessThanOrEqualTo(Boolean value) {
            addCriterion("POSWholeBackFlag <=", value, "poswholebackflag");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagIn(List<Boolean> values) {
            addCriterion("POSWholeBackFlag in", values, "poswholebackflag");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagNotIn(List<Boolean> values) {
            addCriterion("POSWholeBackFlag not in", values, "poswholebackflag");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagBetween(Boolean value1, Boolean value2) {
            addCriterion("POSWholeBackFlag between", value1, value2, "poswholebackflag");
            return (Criteria) this;
        }

        public Criteria andPoswholebackflagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("POSWholeBackFlag not between", value1, value2, "poswholebackflag");
            return (Criteria) this;
        }

        public Criteria andLocationXIsNull() {
            addCriterion("location_x is null");
            return (Criteria) this;
        }

        public Criteria andLocationXIsNotNull() {
            addCriterion("location_x is not null");
            return (Criteria) this;
        }

        public Criteria andLocationXEqualTo(String value) {
            addCriterion("location_x =", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotEqualTo(String value) {
            addCriterion("location_x <>", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXGreaterThan(String value) {
            addCriterion("location_x >", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXGreaterThanOrEqualTo(String value) {
            addCriterion("location_x >=", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXLessThan(String value) {
            addCriterion("location_x <", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXLessThanOrEqualTo(String value) {
            addCriterion("location_x <=", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXLike(String value) {
            addCriterion("location_x like", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotLike(String value) {
            addCriterion("location_x not like", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXIn(List<String> values) {
            addCriterion("location_x in", values, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotIn(List<String> values) {
            addCriterion("location_x not in", values, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXBetween(String value1, String value2) {
            addCriterion("location_x between", value1, value2, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotBetween(String value1, String value2) {
            addCriterion("location_x not between", value1, value2, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationYIsNull() {
            addCriterion("location_y is null");
            return (Criteria) this;
        }

        public Criteria andLocationYIsNotNull() {
            addCriterion("location_y is not null");
            return (Criteria) this;
        }

        public Criteria andLocationYEqualTo(String value) {
            addCriterion("location_y =", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotEqualTo(String value) {
            addCriterion("location_y <>", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYGreaterThan(String value) {
            addCriterion("location_y >", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYGreaterThanOrEqualTo(String value) {
            addCriterion("location_y >=", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYLessThan(String value) {
            addCriterion("location_y <", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYLessThanOrEqualTo(String value) {
            addCriterion("location_y <=", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYLike(String value) {
            addCriterion("location_y like", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotLike(String value) {
            addCriterion("location_y not like", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYIn(List<String> values) {
            addCriterion("location_y in", values, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotIn(List<String> values) {
            addCriterion("location_y not in", values, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYBetween(String value1, String value2) {
            addCriterion("location_y between", value1, value2, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotBetween(String value1, String value2) {
            addCriterion("location_y not between", value1, value2, "locationY");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("WorkTime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("WorkTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(String value) {
            addCriterion("WorkTime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(String value) {
            addCriterion("WorkTime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(String value) {
            addCriterion("WorkTime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(String value) {
            addCriterion("WorkTime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(String value) {
            addCriterion("WorkTime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(String value) {
            addCriterion("WorkTime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLike(String value) {
            addCriterion("WorkTime like", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotLike(String value) {
            addCriterion("WorkTime not like", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<String> values) {
            addCriterion("WorkTime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<String> values) {
            addCriterion("WorkTime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(String value1, String value2) {
            addCriterion("WorkTime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(String value1, String value2) {
            addCriterion("WorkTime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andShopimageurlIsNull() {
            addCriterion("ShopImageUrl is null");
            return (Criteria) this;
        }

        public Criteria andShopimageurlIsNotNull() {
            addCriterion("ShopImageUrl is not null");
            return (Criteria) this;
        }

        public Criteria andShopimageurlEqualTo(String value) {
            addCriterion("ShopImageUrl =", value, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andShopimageurlNotEqualTo(String value) {
            addCriterion("ShopImageUrl <>", value, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andShopimageurlGreaterThan(String value) {
            addCriterion("ShopImageUrl >", value, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andShopimageurlGreaterThanOrEqualTo(String value) {
            addCriterion("ShopImageUrl >=", value, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andShopimageurlLessThan(String value) {
            addCriterion("ShopImageUrl <", value, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andShopimageurlLessThanOrEqualTo(String value) {
            addCriterion("ShopImageUrl <=", value, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andShopimageurlLike(String value) {
            addCriterion("ShopImageUrl like", value, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andShopimageurlNotLike(String value) {
            addCriterion("ShopImageUrl not like", value, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andShopimageurlIn(List<String> values) {
            addCriterion("ShopImageUrl in", values, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andShopimageurlNotIn(List<String> values) {
            addCriterion("ShopImageUrl not in", values, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andShopimageurlBetween(String value1, String value2) {
            addCriterion("ShopImageUrl between", value1, value2, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andShopimageurlNotBetween(String value1, String value2) {
            addCriterion("ShopImageUrl not between", value1, value2, "shopimageurl");
            return (Criteria) this;
        }

        public Criteria andBossidIsNull() {
            addCriterion("BossID is null");
            return (Criteria) this;
        }

        public Criteria andBossidIsNotNull() {
            addCriterion("BossID is not null");
            return (Criteria) this;
        }

        public Criteria andBossidEqualTo(Integer value) {
            addCriterion("BossID =", value, "bossid");
            return (Criteria) this;
        }

        public Criteria andBossidNotEqualTo(Integer value) {
            addCriterion("BossID <>", value, "bossid");
            return (Criteria) this;
        }

        public Criteria andBossidGreaterThan(Integer value) {
            addCriterion("BossID >", value, "bossid");
            return (Criteria) this;
        }

        public Criteria andBossidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BossID >=", value, "bossid");
            return (Criteria) this;
        }

        public Criteria andBossidLessThan(Integer value) {
            addCriterion("BossID <", value, "bossid");
            return (Criteria) this;
        }

        public Criteria andBossidLessThanOrEqualTo(Integer value) {
            addCriterion("BossID <=", value, "bossid");
            return (Criteria) this;
        }

        public Criteria andBossidIn(List<Integer> values) {
            addCriterion("BossID in", values, "bossid");
            return (Criteria) this;
        }

        public Criteria andBossidNotIn(List<Integer> values) {
            addCriterion("BossID not in", values, "bossid");
            return (Criteria) this;
        }

        public Criteria andBossidBetween(Integer value1, Integer value2) {
            addCriterion("BossID between", value1, value2, "bossid");
            return (Criteria) this;
        }

        public Criteria andBossidNotBetween(Integer value1, Integer value2) {
            addCriterion("BossID not between", value1, value2, "bossid");
            return (Criteria) this;
        }

        public Criteria andPagetypeIsNull() {
            addCriterion("PageType is null");
            return (Criteria) this;
        }

        public Criteria andPagetypeIsNotNull() {
            addCriterion("PageType is not null");
            return (Criteria) this;
        }

        public Criteria andPagetypeEqualTo(Byte value) {
            addCriterion("PageType =", value, "pagetype");
            return (Criteria) this;
        }

        public Criteria andPagetypeNotEqualTo(Byte value) {
            addCriterion("PageType <>", value, "pagetype");
            return (Criteria) this;
        }

        public Criteria andPagetypeGreaterThan(Byte value) {
            addCriterion("PageType >", value, "pagetype");
            return (Criteria) this;
        }

        public Criteria andPagetypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("PageType >=", value, "pagetype");
            return (Criteria) this;
        }

        public Criteria andPagetypeLessThan(Byte value) {
            addCriterion("PageType <", value, "pagetype");
            return (Criteria) this;
        }

        public Criteria andPagetypeLessThanOrEqualTo(Byte value) {
            addCriterion("PageType <=", value, "pagetype");
            return (Criteria) this;
        }

        public Criteria andPagetypeIn(List<Byte> values) {
            addCriterion("PageType in", values, "pagetype");
            return (Criteria) this;
        }

        public Criteria andPagetypeNotIn(List<Byte> values) {
            addCriterion("PageType not in", values, "pagetype");
            return (Criteria) this;
        }

        public Criteria andPagetypeBetween(Byte value1, Byte value2) {
            addCriterion("PageType between", value1, value2, "pagetype");
            return (Criteria) this;
        }

        public Criteria andPagetypeNotBetween(Byte value1, Byte value2) {
            addCriterion("PageType not between", value1, value2, "pagetype");
            return (Criteria) this;
        }

        public Criteria andFormidIsNull() {
            addCriterion("FormID is null");
            return (Criteria) this;
        }

        public Criteria andFormidIsNotNull() {
            addCriterion("FormID is not null");
            return (Criteria) this;
        }

        public Criteria andFormidEqualTo(Integer value) {
            addCriterion("FormID =", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotEqualTo(Integer value) {
            addCriterion("FormID <>", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidGreaterThan(Integer value) {
            addCriterion("FormID >", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FormID >=", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidLessThan(Integer value) {
            addCriterion("FormID <", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidLessThanOrEqualTo(Integer value) {
            addCriterion("FormID <=", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidIn(List<Integer> values) {
            addCriterion("FormID in", values, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotIn(List<Integer> values) {
            addCriterion("FormID not in", values, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidBetween(Integer value1, Integer value2) {
            addCriterion("FormID between", value1, value2, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotBetween(Integer value1, Integer value2) {
            addCriterion("FormID not between", value1, value2, "formid");
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