package com.examonline.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SMD_QuestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SMD_QuestionsExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNull() {
            addCriterion("question_type is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNotNull() {
            addCriterion("question_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeEqualTo(Integer value) {
            addCriterion("question_type =", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotEqualTo(Integer value) {
            addCriterion("question_type <>", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThan(Integer value) {
            addCriterion("question_type >", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_type >=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThan(Integer value) {
            addCriterion("question_type <", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("question_type <=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIn(List<Integer> values) {
            addCriterion("question_type in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotIn(List<Integer> values) {
            addCriterion("question_type not in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeBetween(Integer value1, Integer value2) {
            addCriterion("question_type between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("question_type not between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdIsNull() {
            addCriterion("teacher_category_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdIsNotNull() {
            addCriterion("teacher_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdEqualTo(Integer value) {
            addCriterion("teacher_category_id =", value, "teacherCategoryId");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdNotEqualTo(Integer value) {
            addCriterion("teacher_category_id <>", value, "teacherCategoryId");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdGreaterThan(Integer value) {
            addCriterion("teacher_category_id >", value, "teacherCategoryId");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_category_id >=", value, "teacherCategoryId");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdLessThan(Integer value) {
            addCriterion("teacher_category_id <", value, "teacherCategoryId");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_category_id <=", value, "teacherCategoryId");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdIn(List<Integer> values) {
            addCriterion("teacher_category_id in", values, "teacherCategoryId");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdNotIn(List<Integer> values) {
            addCriterion("teacher_category_id not in", values, "teacherCategoryId");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_category_id between", value1, value2, "teacherCategoryId");
            return (Criteria) this;
        }

        public Criteria andTeacherCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_category_id not between", value1, value2, "teacherCategoryId");
            return (Criteria) this;
        }

        public Criteria andPubdateIsNull() {
            addCriterion("pubdate is null");
            return (Criteria) this;
        }

        public Criteria andPubdateIsNotNull() {
            addCriterion("pubdate is not null");
            return (Criteria) this;
        }

        public Criteria andPubdateEqualTo(Date value) {
            addCriterion("pubdate =", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotEqualTo(Date value) {
            addCriterion("pubdate <>", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateGreaterThan(Date value) {
            addCriterion("pubdate >", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateGreaterThanOrEqualTo(Date value) {
            addCriterion("pubdate >=", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateLessThan(Date value) {
            addCriterion("pubdate <", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateLessThanOrEqualTo(Date value) {
            addCriterion("pubdate <=", value, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateIn(List<Date> values) {
            addCriterion("pubdate in", values, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotIn(List<Date> values) {
            addCriterion("pubdate not in", values, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateBetween(Date value1, Date value2) {
            addCriterion("pubdate between", value1, value2, "pubdate");
            return (Criteria) this;
        }

        public Criteria andPubdateNotBetween(Date value1, Date value2) {
            addCriterion("pubdate not between", value1, value2, "pubdate");
            return (Criteria) this;
        }

        public Criteria andDescrptIsNull() {
            addCriterion("descrpt is null");
            return (Criteria) this;
        }

        public Criteria andDescrptIsNotNull() {
            addCriterion("descrpt is not null");
            return (Criteria) this;
        }

        public Criteria andDescrptEqualTo(String value) {
            addCriterion("descrpt =", value, "descrpt");
            return (Criteria) this;
        }

        public Criteria andDescrptNotEqualTo(String value) {
            addCriterion("descrpt <>", value, "descrpt");
            return (Criteria) this;
        }

        public Criteria andDescrptGreaterThan(String value) {
            addCriterion("descrpt >", value, "descrpt");
            return (Criteria) this;
        }

        public Criteria andDescrptGreaterThanOrEqualTo(String value) {
            addCriterion("descrpt >=", value, "descrpt");
            return (Criteria) this;
        }

        public Criteria andDescrptLessThan(String value) {
            addCriterion("descrpt <", value, "descrpt");
            return (Criteria) this;
        }

        public Criteria andDescrptLessThanOrEqualTo(String value) {
            addCriterion("descrpt <=", value, "descrpt");
            return (Criteria) this;
        }

        public Criteria andDescrptLike(String value) {
            addCriterion("descrpt like", value, "descrpt");
            return (Criteria) this;
        }

        public Criteria andDescrptNotLike(String value) {
            addCriterion("descrpt not like", value, "descrpt");
            return (Criteria) this;
        }

        public Criteria andDescrptIn(List<String> values) {
            addCriterion("descrpt in", values, "descrpt");
            return (Criteria) this;
        }

        public Criteria andDescrptNotIn(List<String> values) {
            addCriterion("descrpt not in", values, "descrpt");
            return (Criteria) this;
        }

        public Criteria andDescrptBetween(String value1, String value2) {
            addCriterion("descrpt between", value1, value2, "descrpt");
            return (Criteria) this;
        }

        public Criteria andDescrptNotBetween(String value1, String value2) {
            addCriterion("descrpt not between", value1, value2, "descrpt");
            return (Criteria) this;
        }

        public Criteria andOptionAIsNull() {
            addCriterion("option_A is null");
            return (Criteria) this;
        }

        public Criteria andOptionAIsNotNull() {
            addCriterion("option_A is not null");
            return (Criteria) this;
        }

        public Criteria andOptionAEqualTo(String value) {
            addCriterion("option_A =", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotEqualTo(String value) {
            addCriterion("option_A <>", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionAGreaterThan(String value) {
            addCriterion("option_A >", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionAGreaterThanOrEqualTo(String value) {
            addCriterion("option_A >=", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionALessThan(String value) {
            addCriterion("option_A <", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionALessThanOrEqualTo(String value) {
            addCriterion("option_A <=", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionALike(String value) {
            addCriterion("option_A like", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotLike(String value) {
            addCriterion("option_A not like", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionAIn(List<String> values) {
            addCriterion("option_A in", values, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotIn(List<String> values) {
            addCriterion("option_A not in", values, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionABetween(String value1, String value2) {
            addCriterion("option_A between", value1, value2, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotBetween(String value1, String value2) {
            addCriterion("option_A not between", value1, value2, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionBIsNull() {
            addCriterion("option_B is null");
            return (Criteria) this;
        }

        public Criteria andOptionBIsNotNull() {
            addCriterion("option_B is not null");
            return (Criteria) this;
        }

        public Criteria andOptionBEqualTo(String value) {
            addCriterion("option_B =", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotEqualTo(String value) {
            addCriterion("option_B <>", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBGreaterThan(String value) {
            addCriterion("option_B >", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBGreaterThanOrEqualTo(String value) {
            addCriterion("option_B >=", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBLessThan(String value) {
            addCriterion("option_B <", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBLessThanOrEqualTo(String value) {
            addCriterion("option_B <=", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBLike(String value) {
            addCriterion("option_B like", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotLike(String value) {
            addCriterion("option_B not like", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBIn(List<String> values) {
            addCriterion("option_B in", values, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotIn(List<String> values) {
            addCriterion("option_B not in", values, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBBetween(String value1, String value2) {
            addCriterion("option_B between", value1, value2, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotBetween(String value1, String value2) {
            addCriterion("option_B not between", value1, value2, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionCIsNull() {
            addCriterion("option_C is null");
            return (Criteria) this;
        }

        public Criteria andOptionCIsNotNull() {
            addCriterion("option_C is not null");
            return (Criteria) this;
        }

        public Criteria andOptionCEqualTo(String value) {
            addCriterion("option_C =", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotEqualTo(String value) {
            addCriterion("option_C <>", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCGreaterThan(String value) {
            addCriterion("option_C >", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCGreaterThanOrEqualTo(String value) {
            addCriterion("option_C >=", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCLessThan(String value) {
            addCriterion("option_C <", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCLessThanOrEqualTo(String value) {
            addCriterion("option_C <=", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCLike(String value) {
            addCriterion("option_C like", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotLike(String value) {
            addCriterion("option_C not like", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCIn(List<String> values) {
            addCriterion("option_C in", values, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotIn(List<String> values) {
            addCriterion("option_C not in", values, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCBetween(String value1, String value2) {
            addCriterion("option_C between", value1, value2, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotBetween(String value1, String value2) {
            addCriterion("option_C not between", value1, value2, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionDIsNull() {
            addCriterion("option_D is null");
            return (Criteria) this;
        }

        public Criteria andOptionDIsNotNull() {
            addCriterion("option_D is not null");
            return (Criteria) this;
        }

        public Criteria andOptionDEqualTo(String value) {
            addCriterion("option_D =", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotEqualTo(String value) {
            addCriterion("option_D <>", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDGreaterThan(String value) {
            addCriterion("option_D >", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDGreaterThanOrEqualTo(String value) {
            addCriterion("option_D >=", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDLessThan(String value) {
            addCriterion("option_D <", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDLessThanOrEqualTo(String value) {
            addCriterion("option_D <=", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDLike(String value) {
            addCriterion("option_D like", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotLike(String value) {
            addCriterion("option_D not like", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDIn(List<String> values) {
            addCriterion("option_D in", values, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotIn(List<String> values) {
            addCriterion("option_D not in", values, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDBetween(String value1, String value2) {
            addCriterion("option_D between", value1, value2, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotBetween(String value1, String value2) {
            addCriterion("option_D not between", value1, value2, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionEIsNull() {
            addCriterion("option_E is null");
            return (Criteria) this;
        }

        public Criteria andOptionEIsNotNull() {
            addCriterion("option_E is not null");
            return (Criteria) this;
        }

        public Criteria andOptionEEqualTo(String value) {
            addCriterion("option_E =", value, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionENotEqualTo(String value) {
            addCriterion("option_E <>", value, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionEGreaterThan(String value) {
            addCriterion("option_E >", value, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionEGreaterThanOrEqualTo(String value) {
            addCriterion("option_E >=", value, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionELessThan(String value) {
            addCriterion("option_E <", value, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionELessThanOrEqualTo(String value) {
            addCriterion("option_E <=", value, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionELike(String value) {
            addCriterion("option_E like", value, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionENotLike(String value) {
            addCriterion("option_E not like", value, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionEIn(List<String> values) {
            addCriterion("option_E in", values, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionENotIn(List<String> values) {
            addCriterion("option_E not in", values, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionEBetween(String value1, String value2) {
            addCriterion("option_E between", value1, value2, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionENotBetween(String value1, String value2) {
            addCriterion("option_E not between", value1, value2, "optionE");
            return (Criteria) this;
        }

        public Criteria andOptionFIsNull() {
            addCriterion("option_F is null");
            return (Criteria) this;
        }

        public Criteria andOptionFIsNotNull() {
            addCriterion("option_F is not null");
            return (Criteria) this;
        }

        public Criteria andOptionFEqualTo(String value) {
            addCriterion("option_F =", value, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionFNotEqualTo(String value) {
            addCriterion("option_F <>", value, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionFGreaterThan(String value) {
            addCriterion("option_F >", value, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionFGreaterThanOrEqualTo(String value) {
            addCriterion("option_F >=", value, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionFLessThan(String value) {
            addCriterion("option_F <", value, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionFLessThanOrEqualTo(String value) {
            addCriterion("option_F <=", value, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionFLike(String value) {
            addCriterion("option_F like", value, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionFNotLike(String value) {
            addCriterion("option_F not like", value, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionFIn(List<String> values) {
            addCriterion("option_F in", values, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionFNotIn(List<String> values) {
            addCriterion("option_F not in", values, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionFBetween(String value1, String value2) {
            addCriterion("option_F between", value1, value2, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionFNotBetween(String value1, String value2) {
            addCriterion("option_F not between", value1, value2, "optionF");
            return (Criteria) this;
        }

        public Criteria andOptionGIsNull() {
            addCriterion("option_G is null");
            return (Criteria) this;
        }

        public Criteria andOptionGIsNotNull() {
            addCriterion("option_G is not null");
            return (Criteria) this;
        }

        public Criteria andOptionGEqualTo(String value) {
            addCriterion("option_G =", value, "optionG");
            return (Criteria) this;
        }

        public Criteria andOptionGNotEqualTo(String value) {
            addCriterion("option_G <>", value, "optionG");
            return (Criteria) this;
        }

        public Criteria andOptionGGreaterThan(String value) {
            addCriterion("option_G >", value, "optionG");
            return (Criteria) this;
        }

        public Criteria andOptionGGreaterThanOrEqualTo(String value) {
            addCriterion("option_G >=", value, "optionG");
            return (Criteria) this;
        }

        public Criteria andOptionGLessThan(String value) {
            addCriterion("option_G <", value, "optionG");
            return (Criteria) this;
        }

        public Criteria andOptionGLessThanOrEqualTo(String value) {
            addCriterion("option_G <=", value, "optionG");
            return (Criteria) this;
        }

        public Criteria andOptionGLike(String value) {
            addCriterion("option_G like", value, "optionG");
            return (Criteria) this;
        }

        public Criteria andOptionGNotLike(String value) {
            addCriterion("option_G not like", value, "optionG");
            return (Criteria) this;
        }

        public Criteria andOptionGIn(List<String> values) {
            addCriterion("option_G in", values, "optionG");
            return (Criteria) this;
        }

        public Criteria andOptionGNotIn(List<String> values) {
            addCriterion("option_G not in", values, "optionG");
            return (Criteria) this;
        }

        public Criteria andOptionGBetween(String value1, String value2) {
            addCriterion("option_G between", value1, value2, "optionG");
            return (Criteria) this;
        }

        public Criteria andOptionGNotBetween(String value1, String value2) {
            addCriterion("option_G not between", value1, value2, "optionG");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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