package com.examonline.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andEouNoIsNull() {
            addCriterion("eou_no is null");
            return (Criteria) this;
        }

        public Criteria andEouNoIsNotNull() {
            addCriterion("eou_no is not null");
            return (Criteria) this;
        }

        public Criteria andEouNoEqualTo(String value) {
            addCriterion("eou_no =", value, "eouNo");
            return (Criteria) this;
        }

        public Criteria andEouNoNotEqualTo(String value) {
            addCriterion("eou_no <>", value, "eouNo");
            return (Criteria) this;
        }

        public Criteria andEouNoGreaterThan(String value) {
            addCriterion("eou_no >", value, "eouNo");
            return (Criteria) this;
        }

        public Criteria andEouNoGreaterThanOrEqualTo(String value) {
            addCriterion("eou_no >=", value, "eouNo");
            return (Criteria) this;
        }

        public Criteria andEouNoLessThan(String value) {
            addCriterion("eou_no <", value, "eouNo");
            return (Criteria) this;
        }

        public Criteria andEouNoLessThanOrEqualTo(String value) {
            addCriterion("eou_no <=", value, "eouNo");
            return (Criteria) this;
        }

        public Criteria andEouNoLike(String value) {
            addCriterion("eou_no like", value, "eouNo");
            return (Criteria) this;
        }

        public Criteria andEouNoNotLike(String value) {
            addCriterion("eou_no not like", value, "eouNo");
            return (Criteria) this;
        }

        public Criteria andEouNoIn(List<String> values) {
            addCriterion("eou_no in", values, "eouNo");
            return (Criteria) this;
        }

        public Criteria andEouNoNotIn(List<String> values) {
            addCriterion("eou_no not in", values, "eouNo");
            return (Criteria) this;
        }

        public Criteria andEouNoBetween(String value1, String value2) {
            addCriterion("eou_no between", value1, value2, "eouNo");
            return (Criteria) this;
        }

        public Criteria andEouNoNotBetween(String value1, String value2) {
            addCriterion("eou_no not between", value1, value2, "eouNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNull() {
            addCriterion("id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("id_card_no =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("id_card_no <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("id_card_no >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_no >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("id_card_no <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("id_card_no <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("id_card_no like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("id_card_no not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("id_card_no in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("id_card_no not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("id_card_no between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("id_card_no not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("pass_word is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("pass_word is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("pass_word =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("pass_word <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("pass_word >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("pass_word >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("pass_word <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("pass_word <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("pass_word like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("pass_word not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("pass_word in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("pass_word not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("pass_word between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("pass_word not between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andHomeTelIsNull() {
            addCriterion("home_tel is null");
            return (Criteria) this;
        }

        public Criteria andHomeTelIsNotNull() {
            addCriterion("home_tel is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTelEqualTo(String value) {
            addCriterion("home_tel =", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotEqualTo(String value) {
            addCriterion("home_tel <>", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelGreaterThan(String value) {
            addCriterion("home_tel >", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelGreaterThanOrEqualTo(String value) {
            addCriterion("home_tel >=", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelLessThan(String value) {
            addCriterion("home_tel <", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelLessThanOrEqualTo(String value) {
            addCriterion("home_tel <=", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelLike(String value) {
            addCriterion("home_tel like", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotLike(String value) {
            addCriterion("home_tel not like", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelIn(List<String> values) {
            addCriterion("home_tel in", values, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotIn(List<String> values) {
            addCriterion("home_tel not in", values, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelBetween(String value1, String value2) {
            addCriterion("home_tel between", value1, value2, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotBetween(String value1, String value2) {
            addCriterion("home_tel not between", value1, value2, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeAddrIsNull() {
            addCriterion("home_addr is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddrIsNotNull() {
            addCriterion("home_addr is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddrEqualTo(String value) {
            addCriterion("home_addr =", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotEqualTo(String value) {
            addCriterion("home_addr <>", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrGreaterThan(String value) {
            addCriterion("home_addr >", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrGreaterThanOrEqualTo(String value) {
            addCriterion("home_addr >=", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrLessThan(String value) {
            addCriterion("home_addr <", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrLessThanOrEqualTo(String value) {
            addCriterion("home_addr <=", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrLike(String value) {
            addCriterion("home_addr like", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotLike(String value) {
            addCriterion("home_addr not like", value, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrIn(List<String> values) {
            addCriterion("home_addr in", values, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotIn(List<String> values) {
            addCriterion("home_addr not in", values, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrBetween(String value1, String value2) {
            addCriterion("home_addr between", value1, value2, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andHomeAddrNotBetween(String value1, String value2) {
            addCriterion("home_addr not between", value1, value2, "homeAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrIsNull() {
            addCriterion("sch_addr is null");
            return (Criteria) this;
        }

        public Criteria andSchAddrIsNotNull() {
            addCriterion("sch_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSchAddrEqualTo(String value) {
            addCriterion("sch_addr =", value, "schAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrNotEqualTo(String value) {
            addCriterion("sch_addr <>", value, "schAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrGreaterThan(String value) {
            addCriterion("sch_addr >", value, "schAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrGreaterThanOrEqualTo(String value) {
            addCriterion("sch_addr >=", value, "schAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrLessThan(String value) {
            addCriterion("sch_addr <", value, "schAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrLessThanOrEqualTo(String value) {
            addCriterion("sch_addr <=", value, "schAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrLike(String value) {
            addCriterion("sch_addr like", value, "schAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrNotLike(String value) {
            addCriterion("sch_addr not like", value, "schAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrIn(List<String> values) {
            addCriterion("sch_addr in", values, "schAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrNotIn(List<String> values) {
            addCriterion("sch_addr not in", values, "schAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrBetween(String value1, String value2) {
            addCriterion("sch_addr between", value1, value2, "schAddr");
            return (Criteria) this;
        }

        public Criteria andSchAddrNotBetween(String value1, String value2) {
            addCriterion("sch_addr not between", value1, value2, "schAddr");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationPlaceIsNull() {
            addCriterion("nation_place is null");
            return (Criteria) this;
        }

        public Criteria andNationPlaceIsNotNull() {
            addCriterion("nation_place is not null");
            return (Criteria) this;
        }

        public Criteria andNationPlaceEqualTo(String value) {
            addCriterion("nation_place =", value, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andNationPlaceNotEqualTo(String value) {
            addCriterion("nation_place <>", value, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andNationPlaceGreaterThan(String value) {
            addCriterion("nation_place >", value, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andNationPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("nation_place >=", value, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andNationPlaceLessThan(String value) {
            addCriterion("nation_place <", value, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andNationPlaceLessThanOrEqualTo(String value) {
            addCriterion("nation_place <=", value, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andNationPlaceLike(String value) {
            addCriterion("nation_place like", value, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andNationPlaceNotLike(String value) {
            addCriterion("nation_place not like", value, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andNationPlaceIn(List<String> values) {
            addCriterion("nation_place in", values, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andNationPlaceNotIn(List<String> values) {
            addCriterion("nation_place not in", values, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andNationPlaceBetween(String value1, String value2) {
            addCriterion("nation_place between", value1, value2, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andNationPlaceNotBetween(String value1, String value2) {
            addCriterion("nation_place not between", value1, value2, "nationPlace");
            return (Criteria) this;
        }

        public Criteria andMarjorIsNull() {
            addCriterion("marjor is null");
            return (Criteria) this;
        }

        public Criteria andMarjorIsNotNull() {
            addCriterion("marjor is not null");
            return (Criteria) this;
        }

        public Criteria andMarjorEqualTo(String value) {
            addCriterion("marjor =", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorNotEqualTo(String value) {
            addCriterion("marjor <>", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorGreaterThan(String value) {
            addCriterion("marjor >", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorGreaterThanOrEqualTo(String value) {
            addCriterion("marjor >=", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorLessThan(String value) {
            addCriterion("marjor <", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorLessThanOrEqualTo(String value) {
            addCriterion("marjor <=", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorLike(String value) {
            addCriterion("marjor like", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorNotLike(String value) {
            addCriterion("marjor not like", value, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorIn(List<String> values) {
            addCriterion("marjor in", values, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorNotIn(List<String> values) {
            addCriterion("marjor not in", values, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorBetween(String value1, String value2) {
            addCriterion("marjor between", value1, value2, "marjor");
            return (Criteria) this;
        }

        public Criteria andMarjorNotBetween(String value1, String value2) {
            addCriterion("marjor not between", value1, value2, "marjor");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundIsNull() {
            addCriterion("edu_Background is null");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundIsNotNull() {
            addCriterion("edu_Background is not null");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundEqualTo(String value) {
            addCriterion("edu_Background =", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotEqualTo(String value) {
            addCriterion("edu_Background <>", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundGreaterThan(String value) {
            addCriterion("edu_Background >", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("edu_Background >=", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundLessThan(String value) {
            addCriterion("edu_Background <", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundLessThanOrEqualTo(String value) {
            addCriterion("edu_Background <=", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundLike(String value) {
            addCriterion("edu_Background like", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotLike(String value) {
            addCriterion("edu_Background not like", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundIn(List<String> values) {
            addCriterion("edu_Background in", values, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotIn(List<String> values) {
            addCriterion("edu_Background not in", values, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundBetween(String value1, String value2) {
            addCriterion("edu_Background between", value1, value2, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotBetween(String value1, String value2) {
            addCriterion("edu_Background not between", value1, value2, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNull() {
            addCriterion("graduate_School is null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNotNull() {
            addCriterion("graduate_School is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolEqualTo(String value) {
            addCriterion("graduate_School =", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotEqualTo(String value) {
            addCriterion("graduate_School <>", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThan(String value) {
            addCriterion("graduate_School >", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduate_School >=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThan(String value) {
            addCriterion("graduate_School <", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("graduate_School <=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLike(String value) {
            addCriterion("graduate_School like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotLike(String value) {
            addCriterion("graduate_School not like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIn(List<String> values) {
            addCriterion("graduate_School in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotIn(List<String> values) {
            addCriterion("graduate_School not in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolBetween(String value1, String value2) {
            addCriterion("graduate_School between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("graduate_School not between", value1, value2, "graduateSchool");
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