package com.examonline.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FSP_QuestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FSP_QuestionsExample() {
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

        public Criteria andOption1IsNull() {
            addCriterion("option_1 is null");
            return (Criteria) this;
        }

        public Criteria andOption1IsNotNull() {
            addCriterion("option_1 is not null");
            return (Criteria) this;
        }

        public Criteria andOption1EqualTo(String value) {
            addCriterion("option_1 =", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotEqualTo(String value) {
            addCriterion("option_1 <>", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1GreaterThan(String value) {
            addCriterion("option_1 >", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1GreaterThanOrEqualTo(String value) {
            addCriterion("option_1 >=", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1LessThan(String value) {
            addCriterion("option_1 <", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1LessThanOrEqualTo(String value) {
            addCriterion("option_1 <=", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1Like(String value) {
            addCriterion("option_1 like", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotLike(String value) {
            addCriterion("option_1 not like", value, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1In(List<String> values) {
            addCriterion("option_1 in", values, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotIn(List<String> values) {
            addCriterion("option_1 not in", values, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1Between(String value1, String value2) {
            addCriterion("option_1 between", value1, value2, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1NotBetween(String value1, String value2) {
            addCriterion("option_1 not between", value1, value2, "option1");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerIsNull() {
            addCriterion("option_1_answer is null");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerIsNotNull() {
            addCriterion("option_1_answer is not null");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerEqualTo(String value) {
            addCriterion("option_1_answer =", value, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerNotEqualTo(String value) {
            addCriterion("option_1_answer <>", value, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerGreaterThan(String value) {
            addCriterion("option_1_answer >", value, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerGreaterThanOrEqualTo(String value) {
            addCriterion("option_1_answer >=", value, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerLessThan(String value) {
            addCriterion("option_1_answer <", value, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerLessThanOrEqualTo(String value) {
            addCriterion("option_1_answer <=", value, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerLike(String value) {
            addCriterion("option_1_answer like", value, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerNotLike(String value) {
            addCriterion("option_1_answer not like", value, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerIn(List<String> values) {
            addCriterion("option_1_answer in", values, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerNotIn(List<String> values) {
            addCriterion("option_1_answer not in", values, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerBetween(String value1, String value2) {
            addCriterion("option_1_answer between", value1, value2, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption1AnswerNotBetween(String value1, String value2) {
            addCriterion("option_1_answer not between", value1, value2, "option1Answer");
            return (Criteria) this;
        }

        public Criteria andOption2IsNull() {
            addCriterion("option_2 is null");
            return (Criteria) this;
        }

        public Criteria andOption2IsNotNull() {
            addCriterion("option_2 is not null");
            return (Criteria) this;
        }

        public Criteria andOption2EqualTo(String value) {
            addCriterion("option_2 =", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotEqualTo(String value) {
            addCriterion("option_2 <>", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2GreaterThan(String value) {
            addCriterion("option_2 >", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2GreaterThanOrEqualTo(String value) {
            addCriterion("option_2 >=", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2LessThan(String value) {
            addCriterion("option_2 <", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2LessThanOrEqualTo(String value) {
            addCriterion("option_2 <=", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2Like(String value) {
            addCriterion("option_2 like", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotLike(String value) {
            addCriterion("option_2 not like", value, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2In(List<String> values) {
            addCriterion("option_2 in", values, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotIn(List<String> values) {
            addCriterion("option_2 not in", values, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2Between(String value1, String value2) {
            addCriterion("option_2 between", value1, value2, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2NotBetween(String value1, String value2) {
            addCriterion("option_2 not between", value1, value2, "option2");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerIsNull() {
            addCriterion("option_2_answer is null");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerIsNotNull() {
            addCriterion("option_2_answer is not null");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerEqualTo(String value) {
            addCriterion("option_2_answer =", value, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerNotEqualTo(String value) {
            addCriterion("option_2_answer <>", value, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerGreaterThan(String value) {
            addCriterion("option_2_answer >", value, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerGreaterThanOrEqualTo(String value) {
            addCriterion("option_2_answer >=", value, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerLessThan(String value) {
            addCriterion("option_2_answer <", value, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerLessThanOrEqualTo(String value) {
            addCriterion("option_2_answer <=", value, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerLike(String value) {
            addCriterion("option_2_answer like", value, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerNotLike(String value) {
            addCriterion("option_2_answer not like", value, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerIn(List<String> values) {
            addCriterion("option_2_answer in", values, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerNotIn(List<String> values) {
            addCriterion("option_2_answer not in", values, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerBetween(String value1, String value2) {
            addCriterion("option_2_answer between", value1, value2, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption2AnswerNotBetween(String value1, String value2) {
            addCriterion("option_2_answer not between", value1, value2, "option2Answer");
            return (Criteria) this;
        }

        public Criteria andOption3IsNull() {
            addCriterion("option_3 is null");
            return (Criteria) this;
        }

        public Criteria andOption3IsNotNull() {
            addCriterion("option_3 is not null");
            return (Criteria) this;
        }

        public Criteria andOption3EqualTo(String value) {
            addCriterion("option_3 =", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotEqualTo(String value) {
            addCriterion("option_3 <>", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3GreaterThan(String value) {
            addCriterion("option_3 >", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3GreaterThanOrEqualTo(String value) {
            addCriterion("option_3 >=", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3LessThan(String value) {
            addCriterion("option_3 <", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3LessThanOrEqualTo(String value) {
            addCriterion("option_3 <=", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3Like(String value) {
            addCriterion("option_3 like", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotLike(String value) {
            addCriterion("option_3 not like", value, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3In(List<String> values) {
            addCriterion("option_3 in", values, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotIn(List<String> values) {
            addCriterion("option_3 not in", values, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3Between(String value1, String value2) {
            addCriterion("option_3 between", value1, value2, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3NotBetween(String value1, String value2) {
            addCriterion("option_3 not between", value1, value2, "option3");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerIsNull() {
            addCriterion("option_3_answer is null");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerIsNotNull() {
            addCriterion("option_3_answer is not null");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerEqualTo(String value) {
            addCriterion("option_3_answer =", value, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerNotEqualTo(String value) {
            addCriterion("option_3_answer <>", value, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerGreaterThan(String value) {
            addCriterion("option_3_answer >", value, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerGreaterThanOrEqualTo(String value) {
            addCriterion("option_3_answer >=", value, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerLessThan(String value) {
            addCriterion("option_3_answer <", value, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerLessThanOrEqualTo(String value) {
            addCriterion("option_3_answer <=", value, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerLike(String value) {
            addCriterion("option_3_answer like", value, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerNotLike(String value) {
            addCriterion("option_3_answer not like", value, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerIn(List<String> values) {
            addCriterion("option_3_answer in", values, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerNotIn(List<String> values) {
            addCriterion("option_3_answer not in", values, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerBetween(String value1, String value2) {
            addCriterion("option_3_answer between", value1, value2, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption3AnswerNotBetween(String value1, String value2) {
            addCriterion("option_3_answer not between", value1, value2, "option3Answer");
            return (Criteria) this;
        }

        public Criteria andOption4IsNull() {
            addCriterion("option_4 is null");
            return (Criteria) this;
        }

        public Criteria andOption4IsNotNull() {
            addCriterion("option_4 is not null");
            return (Criteria) this;
        }

        public Criteria andOption4EqualTo(String value) {
            addCriterion("option_4 =", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotEqualTo(String value) {
            addCriterion("option_4 <>", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4GreaterThan(String value) {
            addCriterion("option_4 >", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4GreaterThanOrEqualTo(String value) {
            addCriterion("option_4 >=", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4LessThan(String value) {
            addCriterion("option_4 <", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4LessThanOrEqualTo(String value) {
            addCriterion("option_4 <=", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4Like(String value) {
            addCriterion("option_4 like", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotLike(String value) {
            addCriterion("option_4 not like", value, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4In(List<String> values) {
            addCriterion("option_4 in", values, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotIn(List<String> values) {
            addCriterion("option_4 not in", values, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4Between(String value1, String value2) {
            addCriterion("option_4 between", value1, value2, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4NotBetween(String value1, String value2) {
            addCriterion("option_4 not between", value1, value2, "option4");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerIsNull() {
            addCriterion("option_4_answer is null");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerIsNotNull() {
            addCriterion("option_4_answer is not null");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerEqualTo(String value) {
            addCriterion("option_4_answer =", value, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerNotEqualTo(String value) {
            addCriterion("option_4_answer <>", value, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerGreaterThan(String value) {
            addCriterion("option_4_answer >", value, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerGreaterThanOrEqualTo(String value) {
            addCriterion("option_4_answer >=", value, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerLessThan(String value) {
            addCriterion("option_4_answer <", value, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerLessThanOrEqualTo(String value) {
            addCriterion("option_4_answer <=", value, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerLike(String value) {
            addCriterion("option_4_answer like", value, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerNotLike(String value) {
            addCriterion("option_4_answer not like", value, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerIn(List<String> values) {
            addCriterion("option_4_answer in", values, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerNotIn(List<String> values) {
            addCriterion("option_4_answer not in", values, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerBetween(String value1, String value2) {
            addCriterion("option_4_answer between", value1, value2, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption4AnswerNotBetween(String value1, String value2) {
            addCriterion("option_4_answer not between", value1, value2, "option4Answer");
            return (Criteria) this;
        }

        public Criteria andOption5IsNull() {
            addCriterion("option_5 is null");
            return (Criteria) this;
        }

        public Criteria andOption5IsNotNull() {
            addCriterion("option_5 is not null");
            return (Criteria) this;
        }

        public Criteria andOption5EqualTo(String value) {
            addCriterion("option_5 =", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5NotEqualTo(String value) {
            addCriterion("option_5 <>", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5GreaterThan(String value) {
            addCriterion("option_5 >", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5GreaterThanOrEqualTo(String value) {
            addCriterion("option_5 >=", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5LessThan(String value) {
            addCriterion("option_5 <", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5LessThanOrEqualTo(String value) {
            addCriterion("option_5 <=", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5Like(String value) {
            addCriterion("option_5 like", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5NotLike(String value) {
            addCriterion("option_5 not like", value, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5In(List<String> values) {
            addCriterion("option_5 in", values, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5NotIn(List<String> values) {
            addCriterion("option_5 not in", values, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5Between(String value1, String value2) {
            addCriterion("option_5 between", value1, value2, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5NotBetween(String value1, String value2) {
            addCriterion("option_5 not between", value1, value2, "option5");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerIsNull() {
            addCriterion("option_5_answer is null");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerIsNotNull() {
            addCriterion("option_5_answer is not null");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerEqualTo(String value) {
            addCriterion("option_5_answer =", value, "option5Answer");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerNotEqualTo(String value) {
            addCriterion("option_5_answer <>", value, "option5Answer");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerGreaterThan(String value) {
            addCriterion("option_5_answer >", value, "option5Answer");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerGreaterThanOrEqualTo(String value) {
            addCriterion("option_5_answer >=", value, "option5Answer");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerLessThan(String value) {
            addCriterion("option_5_answer <", value, "option5Answer");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerLessThanOrEqualTo(String value) {
            addCriterion("option_5_answer <=", value, "option5Answer");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerLike(String value) {
            addCriterion("option_5_answer like", value, "option5Answer");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerNotLike(String value) {
            addCriterion("option_5_answer not like", value, "option5Answer");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerIn(List<String> values) {
            addCriterion("option_5_answer in", values, "option5Answer");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerNotIn(List<String> values) {
            addCriterion("option_5_answer not in", values, "option5Answer");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerBetween(String value1, String value2) {
            addCriterion("option_5_answer between", value1, value2, "option5Answer");
            return (Criteria) this;
        }

        public Criteria andOption5AnswerNotBetween(String value1, String value2) {
            addCriterion("option_5_answer not between", value1, value2, "option5Answer");
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