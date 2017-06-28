package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.ChannelParam;
import demo.hugh.mvc.po.ChannelParamExample.Criteria;
import demo.hugh.mvc.po.ChannelParamExample.Criterion;
import demo.hugh.mvc.po.ChannelParamExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ChannelParamSqlProvider {

    public String countByExample(ChannelParamExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("channel_param");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ChannelParamExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("channel_param");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ChannelParam record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("channel_param");
        
        if (record.getPayChannel() != null) {
            sql.VALUES("pay_channel", "#{payChannel,jdbcType=VARCHAR}");
        }
        
        if (record.getPayChannelName() != null) {
            sql.VALUES("pay_channel_name", "#{payChannelName,jdbcType=VARCHAR}");
        }
        
        if (record.getMerchantId() != null) {
            sql.VALUES("merchant_id", "#{merchantId,jdbcType=VARCHAR}");
        }
        
        if (record.getPrivateKey() != null) {
            sql.VALUES("private_key", "#{privateKey,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelPublictKey() != null) {
            sql.VALUES("channel_publict_key", "#{channelPublictKey,jdbcType=VARCHAR}");
        }
        
        if (record.getPayUrl() != null) {
            sql.VALUES("pay_url", "#{payUrl,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ChannelParamExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("pay_channel");
        } else {
            sql.SELECT("pay_channel");
        }
        sql.SELECT("pay_channel_name");
        sql.SELECT("merchant_id");
        sql.SELECT("private_key");
        sql.SELECT("channel_publict_key");
        sql.SELECT("pay_url");
        sql.FROM("channel_param");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ChannelParam record = (ChannelParam) parameter.get("record");
        ChannelParamExample example = (ChannelParamExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("channel_param");
        
        if (record.getPayChannel() != null) {
            sql.SET("pay_channel = #{record.payChannel,jdbcType=VARCHAR}");
        }
        
        if (record.getPayChannelName() != null) {
            sql.SET("pay_channel_name = #{record.payChannelName,jdbcType=VARCHAR}");
        }
        
        if (record.getMerchantId() != null) {
            sql.SET("merchant_id = #{record.merchantId,jdbcType=VARCHAR}");
        }
        
        if (record.getPrivateKey() != null) {
            sql.SET("private_key = #{record.privateKey,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelPublictKey() != null) {
            sql.SET("channel_publict_key = #{record.channelPublictKey,jdbcType=VARCHAR}");
        }
        
        if (record.getPayUrl() != null) {
            sql.SET("pay_url = #{record.payUrl,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("channel_param");
        
        sql.SET("pay_channel = #{record.payChannel,jdbcType=VARCHAR}");
        sql.SET("pay_channel_name = #{record.payChannelName,jdbcType=VARCHAR}");
        sql.SET("merchant_id = #{record.merchantId,jdbcType=VARCHAR}");
        sql.SET("private_key = #{record.privateKey,jdbcType=VARCHAR}");
        sql.SET("channel_publict_key = #{record.channelPublictKey,jdbcType=VARCHAR}");
        sql.SET("pay_url = #{record.payUrl,jdbcType=VARCHAR}");
        
        ChannelParamExample example = (ChannelParamExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ChannelParam record) {
        SQL sql = new SQL();
        sql.UPDATE("channel_param");
        
        if (record.getPayChannelName() != null) {
            sql.SET("pay_channel_name = #{payChannelName,jdbcType=VARCHAR}");
        }
        
        if (record.getMerchantId() != null) {
            sql.SET("merchant_id = #{merchantId,jdbcType=VARCHAR}");
        }
        
        if (record.getPrivateKey() != null) {
            sql.SET("private_key = #{privateKey,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelPublictKey() != null) {
            sql.SET("channel_publict_key = #{channelPublictKey,jdbcType=VARCHAR}");
        }
        
        if (record.getPayUrl() != null) {
            sql.SET("pay_url = #{payUrl,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("pay_channel = #{payChannel,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ChannelParamExample example, boolean includeExamplePhrase) {
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