package nuc.wssp.beans;
import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Long value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Long value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Long value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Long value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Long value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Long value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Long> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Long> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Long value1, Long value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Long value1, Long value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNull() {
            addCriterion("spassword is null");
            return (Criteria) this;
        }

        public Criteria andSpasswordIsNotNull() {
            addCriterion("spassword is not null");
            return (Criteria) this;
        }

        public Criteria andSpasswordEqualTo(String value) {
            addCriterion("spassword =", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotEqualTo(String value) {
            addCriterion("spassword <>", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThan(String value) {
            addCriterion("spassword >", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("spassword >=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThan(String value) {
            addCriterion("spassword <", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLessThanOrEqualTo(String value) {
            addCriterion("spassword <=", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordLike(String value) {
            addCriterion("spassword like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotLike(String value) {
            addCriterion("spassword not like", value, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordIn(List<String> values) {
            addCriterion("spassword in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotIn(List<String> values) {
            addCriterion("spassword not in", values, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordBetween(String value1, String value2) {
            addCriterion("spassword between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSpasswordNotBetween(String value1, String value2) {
            addCriterion("spassword not between", value1, value2, "spassword");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIsNull() {
            addCriterion("sdepartment is null");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIsNotNull() {
            addCriterion("sdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andSdepartmentEqualTo(String value) {
            addCriterion("sdepartment =", value, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdepartmentNotEqualTo(String value) {
            addCriterion("sdepartment <>", value, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdepartmentGreaterThan(String value) {
            addCriterion("sdepartment >", value, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("sdepartment >=", value, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdepartmentLessThan(String value) {
            addCriterion("sdepartment <", value, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdepartmentLessThanOrEqualTo(String value) {
            addCriterion("sdepartment <=", value, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdepartmentLike(String value) {
            addCriterion("sdepartment like", value, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdepartmentNotLike(String value) {
            addCriterion("sdepartment not like", value, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdepartmentIn(List<String> values) {
            addCriterion("sdepartment in", values, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdepartmentNotIn(List<String> values) {
            addCriterion("sdepartment not in", values, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdepartmentBetween(String value1, String value2) {
            addCriterion("sdepartment between", value1, value2, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdepartmentNotBetween(String value1, String value2) {
            addCriterion("sdepartment not between", value1, value2, "sdepartment");
            return (Criteria) this;
        }

        public Criteria andSdormIsNull() {
            addCriterion("sdorm is null");
            return (Criteria) this;
        }

        public Criteria andSdormIsNotNull() {
            addCriterion("sdorm is not null");
            return (Criteria) this;
        }

        public Criteria andSdormEqualTo(String value) {
            addCriterion("sdorm =", value, "sdorm");
            return (Criteria) this;
        }

        public Criteria andSdormNotEqualTo(String value) {
            addCriterion("sdorm <>", value, "sdorm");
            return (Criteria) this;
        }

        public Criteria andSdormGreaterThan(String value) {
            addCriterion("sdorm >", value, "sdorm");
            return (Criteria) this;
        }

        public Criteria andSdormGreaterThanOrEqualTo(String value) {
            addCriterion("sdorm >=", value, "sdorm");
            return (Criteria) this;
        }

        public Criteria andSdormLessThan(String value) {
            addCriterion("sdorm <", value, "sdorm");
            return (Criteria) this;
        }

        public Criteria andSdormLessThanOrEqualTo(String value) {
            addCriterion("sdorm <=", value, "sdorm");
            return (Criteria) this;
        }

        public Criteria andSdormLike(String value) {
            addCriterion("sdorm like", value, "sdorm");
            return (Criteria) this;
        }

        public Criteria andSdormNotLike(String value) {
            addCriterion("sdorm not like", value, "sdorm");
            return (Criteria) this;
        }

        public Criteria andSdormIn(List<String> values) {
            addCriterion("sdorm in", values, "sdorm");
            return (Criteria) this;
        }

        public Criteria andSdormNotIn(List<String> values) {
            addCriterion("sdorm not in", values, "sdorm");
            return (Criteria) this;
        }

        public Criteria andSdormBetween(String value1, String value2) {
            addCriterion("sdorm between", value1, value2, "sdorm");
            return (Criteria) this;
        }

        public Criteria andSdormNotBetween(String value1, String value2) {
            addCriterion("sdorm not between", value1, value2, "sdorm");
            return (Criteria) this;
        }

        public Criteria andDnumberIsNull() {
            addCriterion("dnumber is null");
            return (Criteria) this;
        }

        public Criteria andDnumberIsNotNull() {
            addCriterion("dnumber is not null");
            return (Criteria) this;
        }

        public Criteria andDnumberEqualTo(Long value) {
            addCriterion("dnumber =", value, "dnumber");
            return (Criteria) this;
        }

        public Criteria andDnumberNotEqualTo(Long value) {
            addCriterion("dnumber <>", value, "dnumber");
            return (Criteria) this;
        }

        public Criteria andDnumberGreaterThan(Long value) {
            addCriterion("dnumber >", value, "dnumber");
            return (Criteria) this;
        }

        public Criteria andDnumberGreaterThanOrEqualTo(Long value) {
            addCriterion("dnumber >=", value, "dnumber");
            return (Criteria) this;
        }

        public Criteria andDnumberLessThan(Long value) {
            addCriterion("dnumber <", value, "dnumber");
            return (Criteria) this;
        }

        public Criteria andDnumberLessThanOrEqualTo(Long value) {
            addCriterion("dnumber <=", value, "dnumber");
            return (Criteria) this;
        }

        public Criteria andDnumberIn(List<Long> values) {
            addCriterion("dnumber in", values, "dnumber");
            return (Criteria) this;
        }

        public Criteria andDnumberNotIn(List<Long> values) {
            addCriterion("dnumber not in", values, "dnumber");
            return (Criteria) this;
        }

        public Criteria andDnumberBetween(Long value1, Long value2) {
            addCriterion("dnumber between", value1, value2, "dnumber");
            return (Criteria) this;
        }

        public Criteria andDnumberNotBetween(Long value1, Long value2) {
            addCriterion("dnumber not between", value1, value2, "dnumber");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(Long value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(Long value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(Long value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(Long value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(Long value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(Long value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<Long> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<Long> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(Long value1, Long value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(Long value1, Long value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Long value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Long value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Long value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Long value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Long value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Long> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Long> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Long value1, Long value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Long value1, Long value2) {
            addCriterion("phone not between", value1, value2, "phone");
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