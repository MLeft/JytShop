package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.Order;
import demo.hugh.mvc.po.OrderExample.Criteria;
import demo.hugh.mvc.po.OrderExample.Criterion;
import demo.hugh.mvc.po.OrderExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrderSqlProvider {

    public String countByExample(OrderExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OrderExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Order record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("order");
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getAddressId() != null) {
            sql.VALUES("address_id", "#{addressId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsList() != null) {
            sql.VALUES("goods_list", "#{goodsList,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalAmt() != null) {
            sql.VALUES("total_amt", "#{totalAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getState() != null) {
            sql.VALUES("state", "#{state,jdbcType=VARCHAR}");
        }
        
        if (record.getPayChannel() != null) {
            sql.VALUES("pay_channel", "#{payChannel,jdbcType=VARCHAR}");
        }
        
        if (record.getPayOrderId() != null) {
            sql.VALUES("pay_order_id", "#{payOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelState() != null) {
            sql.VALUES("channel_state", "#{channelState,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelRespCode() != null) {
            sql.VALUES("channel_resp_code", "#{channelRespCode,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelRespDesc() != null) {
            sql.VALUES("channel_resp_desc", "#{channelRespDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayEndTime() != null) {
            sql.VALUES("pay_end_time", "#{payEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeliverTime() != null) {
            sql.VALUES("deliver_time", "#{deliverTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTakeOverTime() != null) {
            sql.VALUES("take_over_time", "#{takeOverTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OrderExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("order_id");
        } else {
            sql.SELECT("order_id");
        }
        sql.SELECT("user_id");
        sql.SELECT("address_id");
        sql.SELECT("goods_list");
        sql.SELECT("total_amt");
        sql.SELECT("state");
        sql.SELECT("pay_channel");
        sql.SELECT("pay_order_id");
        sql.SELECT("channel_state");
        sql.SELECT("channel_resp_code");
        sql.SELECT("channel_resp_desc");
        sql.SELECT("create_time");
        sql.SELECT("pay_end_time");
        sql.SELECT("deliver_time");
        sql.SELECT("take_over_time");
        sql.FROM("order");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Order record = (Order) parameter.get("record");
        OrderExample example = (OrderExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("order");
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{record.orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getAddressId() != null) {
            sql.SET("address_id = #{record.addressId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsList() != null) {
            sql.SET("goods_list = #{record.goodsList,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalAmt() != null) {
            sql.SET("total_amt = #{record.totalAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getState() != null) {
            sql.SET("state = #{record.state,jdbcType=VARCHAR}");
        }
        
        if (record.getPayChannel() != null) {
            sql.SET("pay_channel = #{record.payChannel,jdbcType=VARCHAR}");
        }
        
        if (record.getPayOrderId() != null) {
            sql.SET("pay_order_id = #{record.payOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelState() != null) {
            sql.SET("channel_state = #{record.channelState,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelRespCode() != null) {
            sql.SET("channel_resp_code = #{record.channelRespCode,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelRespDesc() != null) {
            sql.SET("channel_resp_desc = #{record.channelRespDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayEndTime() != null) {
            sql.SET("pay_end_time = #{record.payEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeliverTime() != null) {
            sql.SET("deliver_time = #{record.deliverTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTakeOverTime() != null) {
            sql.SET("take_over_time = #{record.takeOverTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("order");
        
        sql.SET("order_id = #{record.orderId,jdbcType=VARCHAR}");
        sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        sql.SET("address_id = #{record.addressId,jdbcType=INTEGER}");
        sql.SET("goods_list = #{record.goodsList,jdbcType=VARCHAR}");
        sql.SET("total_amt = #{record.totalAmt,jdbcType=DECIMAL}");
        sql.SET("state = #{record.state,jdbcType=VARCHAR}");
        sql.SET("pay_channel = #{record.payChannel,jdbcType=VARCHAR}");
        sql.SET("pay_order_id = #{record.payOrderId,jdbcType=VARCHAR}");
        sql.SET("channel_state = #{record.channelState,jdbcType=VARCHAR}");
        sql.SET("channel_resp_code = #{record.channelRespCode,jdbcType=VARCHAR}");
        sql.SET("channel_resp_desc = #{record.channelRespDesc,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("pay_end_time = #{record.payEndTime,jdbcType=TIMESTAMP}");
        sql.SET("deliver_time = #{record.deliverTime,jdbcType=TIMESTAMP}");
        sql.SET("take_over_time = #{record.takeOverTime,jdbcType=TIMESTAMP}");
        
        OrderExample example = (OrderExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Order record) {
        SQL sql = new SQL();
        sql.UPDATE("order");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getAddressId() != null) {
            sql.SET("address_id = #{addressId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsList() != null) {
            sql.SET("goods_list = #{goodsList,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalAmt() != null) {
            sql.SET("total_amt = #{totalAmt,jdbcType=DECIMAL}");
        }
        
        if (record.getState() != null) {
            sql.SET("state = #{state,jdbcType=VARCHAR}");
        }
        
        if (record.getPayChannel() != null) {
            sql.SET("pay_channel = #{payChannel,jdbcType=VARCHAR}");
        }
        
        if (record.getPayOrderId() != null) {
            sql.SET("pay_order_id = #{payOrderId,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelState() != null) {
            sql.SET("channel_state = #{channelState,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelRespCode() != null) {
            sql.SET("channel_resp_code = #{channelRespCode,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelRespDesc() != null) {
            sql.SET("channel_resp_desc = #{channelRespDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayEndTime() != null) {
            sql.SET("pay_end_time = #{payEndTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeliverTime() != null) {
            sql.SET("deliver_time = #{deliverTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTakeOverTime() != null) {
            sql.SET("take_over_time = #{takeOverTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("order_id = #{orderId,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OrderExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}