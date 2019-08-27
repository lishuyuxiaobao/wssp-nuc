package nuc.wssp.beans;
import java.util.ArrayList;
import java.util.List;

public class WorktableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorktableExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andBnumberIsNull() {
            addCriterion("bnumber is null");
            return (Criteria) this;
        }

        public Criteria andBnumberIsNotNull() {
            addCriterion("bnumber is not null");
            return (Criteria) this;
        }

        public Criteria andBnumberEqualTo(Long value) {
            addCriterion("bnumber =", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberNotEqualTo(Long value) {
            addCriterion("bnumber <>", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberGreaterThan(Long value) {
            addCriterion("bnumber >", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberGreaterThanOrEqualTo(Long value) {
            addCriterion("bnumber >=", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberLessThan(Long value) {
            addCriterion("bnumber <", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberLessThanOrEqualTo(Long value) {
            addCriterion("bnumber <=", value, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberIn(List<Long> values) {
            addCriterion("bnumber in", values, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberNotIn(List<Long> values) {
            addCriterion("bnumber not in", values, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberBetween(Long value1, Long value2) {
            addCriterion("bnumber between", value1, value2, "bnumber");
            return (Criteria) this;
        }

        public Criteria andBnumberNotBetween(Long value1, Long value2) {
            addCriterion("bnumber not between", value1, value2, "bnumber");
            return (Criteria) this;
        }

        public Criteria andAnumberIsNull() {
            addCriterion("anumber is null");
            return (Criteria) this;
        }

        public Criteria andAnumberIsNotNull() {
            addCriterion("anumber is not null");
            return (Criteria) this;
        }

        public Criteria andAnumberEqualTo(String value) {
            addCriterion("anumber =", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberNotEqualTo(String value) {
            addCriterion("anumber <>", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberGreaterThan(String value) {
            addCriterion("anumber >", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberGreaterThanOrEqualTo(String value) {
            addCriterion("anumber >=", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberLessThan(String value) {
            addCriterion("anumber <", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberLessThanOrEqualTo(String value) {
            addCriterion("anumber <=", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberLike(String value) {
            addCriterion("anumber like", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberNotLike(String value) {
            addCriterion("anumber not like", value, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberIn(List<String> values) {
            addCriterion("anumber in", values, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberNotIn(List<String> values) {
            addCriterion("anumber not in", values, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberBetween(String value1, String value2) {
            addCriterion("anumber between", value1, value2, "anumber");
            return (Criteria) this;
        }

        public Criteria andAnumberNotBetween(String value1, String value2) {
            addCriterion("anumber not between", value1, value2, "anumber");
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