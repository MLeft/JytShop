package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.ChannelParam;
import demo.hugh.mvc.po.ChannelParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ChannelParamMapper {
    @SelectProvider(type=ChannelParamSqlProvider.class, method="countByExample")
    long countByExample(ChannelParamExample example);

    @DeleteProvider(type=ChannelParamSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChannelParamExample example);

    @Delete({
        "delete from channel_param",
        "where pay_channel = #{payChannel,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String payChannel);

    @Insert({
        "insert into channel_param (pay_channel, pay_channel_name, ",
        "merchant_id, private_key, ",
        "channel_publict_key, pay_url)",
        "values (#{payChannel,jdbcType=VARCHAR}, #{payChannelName,jdbcType=VARCHAR}, ",
        "#{merchantId,jdbcType=VARCHAR}, #{privateKey,jdbcType=VARCHAR}, ",
        "#{channelPublictKey,jdbcType=VARCHAR}, #{payUrl,jdbcType=VARCHAR})"
    })
    int insert(ChannelParam record);

    @InsertProvider(type=ChannelParamSqlProvider.class, method="insertSelective")
    int insertSelective(ChannelParam record);

    @SelectProvider(type=ChannelParamSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="pay_channel", property="payChannel", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="pay_channel_name", property="payChannelName", jdbcType=JdbcType.VARCHAR),
        @Result(column="merchant_id", property="merchantId", jdbcType=JdbcType.VARCHAR),
        @Result(column="private_key", property="privateKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_publict_key", property="channelPublictKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_url", property="payUrl", jdbcType=JdbcType.VARCHAR)
    })
    List<ChannelParam> selectByExample(ChannelParamExample example);

    @Select({
        "select",
        "pay_channel, pay_channel_name, merchant_id, private_key, channel_publict_key, ",
        "pay_url",
        "from channel_param",
        "where pay_channel = #{payChannel,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="pay_channel", property="payChannel", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="pay_channel_name", property="payChannelName", jdbcType=JdbcType.VARCHAR),
        @Result(column="merchant_id", property="merchantId", jdbcType=JdbcType.VARCHAR),
        @Result(column="private_key", property="privateKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_publict_key", property="channelPublictKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_url", property="payUrl", jdbcType=JdbcType.VARCHAR)
    })
    ChannelParam selectByPrimaryKey(String payChannel);

    @UpdateProvider(type=ChannelParamSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChannelParam record, @Param("example") ChannelParamExample example);

    @UpdateProvider(type=ChannelParamSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ChannelParam record, @Param("example") ChannelParamExample example);

    @UpdateProvider(type=ChannelParamSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChannelParam record);

    @Update({
        "update channel_param",
        "set pay_channel_name = #{payChannelName,jdbcType=VARCHAR},",
          "merchant_id = #{merchantId,jdbcType=VARCHAR},",
          "private_key = #{privateKey,jdbcType=VARCHAR},",
          "channel_publict_key = #{channelPublictKey,jdbcType=VARCHAR},",
          "pay_url = #{payUrl,jdbcType=VARCHAR}",
        "where pay_channel = #{payChannel,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ChannelParam record);
}