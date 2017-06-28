package demo.hugh.mvc.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andGoodsListIsNull() {
            addCriterion("goods_list is null");
            return (Criteria) this;
        }

        public Criteria andGoodsListIsNotNull() {
            addCriterion("goods_list is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsListEqualTo(String value) {
            addCriterion("goods_list =", value, "goodsList");
            return (Criteria) this;
        }

        public Criteria andGoodsListNotEqualTo(String value) {
            addCriterion("goods_list <>", value, "goodsList");
            return (Criteria) this;
        }

        public Criteria andGoodsListGreaterThan(String value) {
            addCriterion("goods_list >", value, "goodsList");
            return (Criteria) this;
        }

        public Criteria andGoodsListGreaterThanOrEqualTo(String value) {
            addCriterion("goods_list >=", value, "goodsList");
            return (Criteria) this;
        }

        public Criteria andGoodsListLessThan(String value) {
            addCriterion("goods_list <", value, "goodsList");
            return (Criteria) this;
        }

        public Criteria andGoodsListLessThanOrEqualTo(String value) {
            addCriterion("goods_list <=", value, "goodsList");
            return (Criteria) this;
        }

        public Criteria andGoodsListLike(String value) {
            addCriterion("goods_list like", value, "goodsList");
            return (Criteria) this;
        }

        public Criteria andGoodsListNotLike(String value) {
            addCriterion("goods_list not like", value, "goodsList");
            return (Criteria) this;
        }

        public Criteria andGoodsListIn(List<String> values) {
            addCriterion("goods_list in", values, "goodsList");
            return (Criteria) this;
        }

        public Criteria andGoodsListNotIn(List<String> values) {
            addCriterion("goods_list not in", values, "goodsList");
            return (Criteria) this;
        }

        public Criteria andGoodsListBetween(String value1, String value2) {
            addCriterion("goods_list between", value1, value2, "goodsList");
            return (Criteria) this;
        }

        public Criteria andGoodsListNotBetween(String value1, String value2) {
            addCriterion("goods_list not between", value1, value2, "goodsList");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIsNull() {
            addCriterion("total_amt is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIsNotNull() {
            addCriterion("total_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmtEqualTo(BigDecimal value) {
            addCriterion("total_amt =", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotEqualTo(BigDecimal value) {
            addCriterion("total_amt <>", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtGreaterThan(BigDecimal value) {
            addCriterion("total_amt >", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amt >=", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtLessThan(BigDecimal value) {
            addCriterion("total_amt <", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amt <=", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIn(List<BigDecimal> values) {
            addCriterion("total_amt in", values, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotIn(List<BigDecimal> values) {
            addCriterion("total_amt not in", values, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amt between", value1, value2, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amt not between", value1, value2, "totalAmt");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("pay_channel like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("pay_channel not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("pay_channel not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIsNull() {
            addCriterion("pay_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIsNotNull() {
            addCriterion("pay_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdEqualTo(String value) {
            addCriterion("pay_order_id =", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotEqualTo(String value) {
            addCriterion("pay_order_id <>", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdGreaterThan(String value) {
            addCriterion("pay_order_id >", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_order_id >=", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLessThan(String value) {
            addCriterion("pay_order_id <", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLessThanOrEqualTo(String value) {
            addCriterion("pay_order_id <=", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdLike(String value) {
            addCriterion("pay_order_id like", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotLike(String value) {
            addCriterion("pay_order_id not like", value, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdIn(List<String> values) {
            addCriterion("pay_order_id in", values, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotIn(List<String> values) {
            addCriterion("pay_order_id not in", values, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdBetween(String value1, String value2) {
            addCriterion("pay_order_id between", value1, value2, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andPayOrderIdNotBetween(String value1, String value2) {
            addCriterion("pay_order_id not between", value1, value2, "payOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelStateIsNull() {
            addCriterion("channel_state is null");
            return (Criteria) this;
        }

        public Criteria andChannelStateIsNotNull() {
            addCriterion("channel_state is not null");
            return (Criteria) this;
        }

        public Criteria andChannelStateEqualTo(String value) {
            addCriterion("channel_state =", value, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelStateNotEqualTo(String value) {
            addCriterion("channel_state <>", value, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelStateGreaterThan(String value) {
            addCriterion("channel_state >", value, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelStateGreaterThanOrEqualTo(String value) {
            addCriterion("channel_state >=", value, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelStateLessThan(String value) {
            addCriterion("channel_state <", value, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelStateLessThanOrEqualTo(String value) {
            addCriterion("channel_state <=", value, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelStateLike(String value) {
            addCriterion("channel_state like", value, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelStateNotLike(String value) {
            addCriterion("channel_state not like", value, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelStateIn(List<String> values) {
            addCriterion("channel_state in", values, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelStateNotIn(List<String> values) {
            addCriterion("channel_state not in", values, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelStateBetween(String value1, String value2) {
            addCriterion("channel_state between", value1, value2, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelStateNotBetween(String value1, String value2) {
            addCriterion("channel_state not between", value1, value2, "channelState");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeIsNull() {
            addCriterion("channel_resp_code is null");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeIsNotNull() {
            addCriterion("channel_resp_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeEqualTo(String value) {
            addCriterion("channel_resp_code =", value, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeNotEqualTo(String value) {
            addCriterion("channel_resp_code <>", value, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeGreaterThan(String value) {
            addCriterion("channel_resp_code >", value, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_resp_code >=", value, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeLessThan(String value) {
            addCriterion("channel_resp_code <", value, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeLessThanOrEqualTo(String value) {
            addCriterion("channel_resp_code <=", value, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeLike(String value) {
            addCriterion("channel_resp_code like", value, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeNotLike(String value) {
            addCriterion("channel_resp_code not like", value, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeIn(List<String> values) {
            addCriterion("channel_resp_code in", values, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeNotIn(List<String> values) {
            addCriterion("channel_resp_code not in", values, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeBetween(String value1, String value2) {
            addCriterion("channel_resp_code between", value1, value2, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespCodeNotBetween(String value1, String value2) {
            addCriterion("channel_resp_code not between", value1, value2, "channelRespCode");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescIsNull() {
            addCriterion("channel_resp_desc is null");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescIsNotNull() {
            addCriterion("channel_resp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescEqualTo(String value) {
            addCriterion("channel_resp_desc =", value, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescNotEqualTo(String value) {
            addCriterion("channel_resp_desc <>", value, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescGreaterThan(String value) {
            addCriterion("channel_resp_desc >", value, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescGreaterThanOrEqualTo(String value) {
            addCriterion("channel_resp_desc >=", value, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescLessThan(String value) {
            addCriterion("channel_resp_desc <", value, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescLessThanOrEqualTo(String value) {
            addCriterion("channel_resp_desc <=", value, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescLike(String value) {
            addCriterion("channel_resp_desc like", value, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescNotLike(String value) {
            addCriterion("channel_resp_desc not like", value, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescIn(List<String> values) {
            addCriterion("channel_resp_desc in", values, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescNotIn(List<String> values) {
            addCriterion("channel_resp_desc not in", values, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescBetween(String value1, String value2) {
            addCriterion("channel_resp_desc between", value1, value2, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andChannelRespDescNotBetween(String value1, String value2) {
            addCriterion("channel_resp_desc not between", value1, value2, "channelRespDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeIsNull() {
            addCriterion("pay_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeIsNotNull() {
            addCriterion("pay_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeEqualTo(Date value) {
            addCriterion("pay_end_time =", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeNotEqualTo(Date value) {
            addCriterion("pay_end_time <>", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeGreaterThan(Date value) {
            addCriterion("pay_end_time >", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_end_time >=", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeLessThan(Date value) {
            addCriterion("pay_end_time <", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_end_time <=", value, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeIn(List<Date> values) {
            addCriterion("pay_end_time in", values, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeNotIn(List<Date> values) {
            addCriterion("pay_end_time not in", values, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeBetween(Date value1, Date value2) {
            addCriterion("pay_end_time between", value1, value2, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andPayEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_end_time not between", value1, value2, "payEndTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNull() {
            addCriterion("deliver_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNotNull() {
            addCriterion("deliver_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeEqualTo(Date value) {
            addCriterion("deliver_time =", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotEqualTo(Date value) {
            addCriterion("deliver_time <>", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThan(Date value) {
            addCriterion("deliver_time >", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliver_time >=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThan(Date value) {
            addCriterion("deliver_time <", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThanOrEqualTo(Date value) {
            addCriterion("deliver_time <=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIn(List<Date> values) {
            addCriterion("deliver_time in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotIn(List<Date> values) {
            addCriterion("deliver_time not in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeBetween(Date value1, Date value2) {
            addCriterion("deliver_time between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotBetween(Date value1, Date value2) {
            addCriterion("deliver_time not between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeIsNull() {
            addCriterion("take_over_time is null");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeIsNotNull() {
            addCriterion("take_over_time is not null");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeEqualTo(Date value) {
            addCriterion("take_over_time =", value, "takeOverTime");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeNotEqualTo(Date value) {
            addCriterion("take_over_time <>", value, "takeOverTime");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeGreaterThan(Date value) {
            addCriterion("take_over_time >", value, "takeOverTime");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("take_over_time >=", value, "takeOverTime");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeLessThan(Date value) {
            addCriterion("take_over_time <", value, "takeOverTime");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("take_over_time <=", value, "takeOverTime");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeIn(List<Date> values) {
            addCriterion("take_over_time in", values, "takeOverTime");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeNotIn(List<Date> values) {
            addCriterion("take_over_time not in", values, "takeOverTime");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeBetween(Date value1, Date value2) {
            addCriterion("take_over_time between", value1, value2, "takeOverTime");
            return (Criteria) this;
        }

        public Criteria andTakeOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("take_over_time not between", value1, value2, "takeOverTime");
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