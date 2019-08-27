package nuc.wssp.beans;

import java.util.ArrayList;
import java.util.List;

public class DlimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DlimitExample() {
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

        public Criteria andYnumberIsNull() {
            addCriterion("ynumber is null");
            return (Criteria) this;
        }

        public Criteria andYnumberIsNotNull() {
            addCriterion("ynumber is not null");
            return (Criteria) this;
        }

        public Criteria andYnumberEqualTo(Long value) {
            addCriterion("ynumber =", value, "ynumber");
            return (Criteria) this;
        }

        public Criteria andYnumberNotEqualTo(Long value) {
            addCriterion("ynumber <>", value, "ynumber");
            return (Criteria) this;
        }

        public Criteria andYnumberGreaterThan(Long value) {
            addCriterion("ynumber >", value, "ynumber");
            return (Criteria) this;
        }

        public Criteria andYnumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ynumber >=", value, "ynumber");
            return (Criteria) this;
        }

        public Criteria andYnumberLessThan(Long value) {
            addCriterion("ynumber <", value, "ynumber");
            return (Criteria) this;
        }

        public Criteria andYnumberLessThanOrEqualTo(Long value) {
            addCriterion("ynumber <=", value, "ynumber");
            return (Criteria) this;
        }

        public Criteria andYnumberIn(List<Long> values) {
            addCriterion("ynumber in", values, "ynumber");
            return (Criteria) this;
        }

        public Criteria andYnumberNotIn(List<Long> values) {
            addCriterion("ynumber not in", values, "ynumber");
            return (Criteria) this;
        }

        public Criteria andYnumberBetween(Long value1, Long value2) {
            addCriterion("ynumber between", value1, value2, "ynumber");
            return (Criteria) this;
        }

        public Criteria andYnumberNotBetween(Long value1, Long value2) {
            addCriterion("ynumber not between", value1, value2, "ynumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberIsNull() {
            addCriterion("arrbnumber is null");
            return (Criteria) this;
        }

        public Criteria andArrbnumberIsNotNull() {
            addCriterion("arrbnumber is not null");
            return (Criteria) this;
        }

        public Criteria andArrbnumberEqualTo(String value) {
            addCriterion("arrbnumber =", value, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberNotEqualTo(String value) {
            addCriterion("arrbnumber <>", value, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberGreaterThan(String value) {
            addCriterion("arrbnumber >", value, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberGreaterThanOrEqualTo(String value) {
            addCriterion("arrbnumber >=", value, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberLessThan(String value) {
            addCriterion("arrbnumber <", value, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberLessThanOrEqualTo(String value) {
            addCriterion("arrbnumber <=", value, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberLike(String value) {
            addCriterion("arrbnumber like", value, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberNotLike(String value) {
            addCriterion("arrbnumber not like", value, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberIn(List<String> values) {
            addCriterion("arrbnumber in", values, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberNotIn(List<String> values) {
            addCriterion("arrbnumber not in", values, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberBetween(String value1, String value2) {
            addCriterion("arrbnumber between", value1, value2, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrbnumberNotBetween(String value1, String value2) {
            addCriterion("arrbnumber not between", value1, value2, "arrbnumber");
            return (Criteria) this;
        }

        public Criteria andArrcountIsNull() {
            addCriterion("arrcount is null");
            return (Criteria) this;
        }

        public Criteria andArrcountIsNotNull() {
            addCriterion("arrcount is not null");
            return (Criteria) this;
        }

        public Criteria andArrcountEqualTo(String value) {
            addCriterion("arrcount =", value, "arrcount");
            return (Criteria) this;
        }

        public Criteria andArrcountNotEqualTo(String value) {
            addCriterion("arrcount <>", value, "arrcount");
            return (Criteria) this;
        }

        public Criteria andArrcountGreaterThan(String value) {
            addCriterion("arrcount >", value, "arrcount");
            return (Criteria) this;
        }

        public Criteria andArrcountGreaterThanOrEqualTo(String value) {
            addCriterion("arrcount >=", value, "arrcount");
            return (Criteria) this;
        }

        public Criteria andArrcountLessThan(String value) {
            addCriterion("arrcount <", value, "arrcount");
            return (Criteria) this;
        }

        public Criteria andArrcountLessThanOrEqualTo(String value) {
            addCriterion("arrcount <=", value, "arrcount");
            return (Criteria) this;
        }

        public Criteria andArrcountLike(String value) {
            addCriterion("arrcount like", value, "arrcount");
            return (Criteria) this;
        }

        public Criteria andArrcountNotLike(String value) {
            addCriterion("arrcount not like", value, "arrcount");
            return (Criteria) this;
        }

        public Criteria andArrcountIn(List<String> values) {
            addCriterion("arrcount in", values, "arrcount");
            return (Criteria) this;
        }

        public Criteria andArrcountNotIn(List<String> values) {
            addCriterion("arrcount not in", values, "arrcount");
            return (Criteria) this;
        }

        public Criteria andArrcountBetween(String value1, String value2) {
            addCriterion("arrcount between", value1, value2, "arrcount");
            return (Criteria) this;
        }

        public Criteria andArrcountNotBetween(String value1, String value2) {
            addCriterion("arrcount not between", value1, value2, "arrcount");
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