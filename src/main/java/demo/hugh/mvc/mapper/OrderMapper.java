package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.Order;
import demo.hugh.mvc.po.OrderExample;
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

public interface OrderMapper {
    @SelectProvider(type=OrderSqlProvider.class, method="countByExample")
    long countByExample(OrderExample example);

    @DeleteProvider(type=OrderSqlProvider.class, method="deleteByExample")
    int deleteByExample(OrderExample example);

    @Delete({
        "delete from order",
        "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String orderId);

    @Insert({
        "insert into order (order_id, user_id, ",
        "address_id, goods_list, ",
        "total_amt, state, ",
        "pay_channel, pay_order_id, ",
        "channel_state, channel_resp_code, ",
        "channel_resp_desc, create_time, ",
        "pay_end_time, deliver_time, ",
        "take_over_time)",
        "values (#{orderId,jdbcType=VARCHAR}, #{userId,jdbcType=INTEGER}, ",
        "#{addressId,jdbcType=INTEGER}, #{goodsList,jdbcType=VARCHAR}, ",
        "#{totalAmt,jdbcType=DECIMAL}, #{state,jdbcType=VARCHAR}, ",
        "#{payChannel,jdbcType=VARCHAR}, #{payOrderId,jdbcType=VARCHAR}, ",
        "#{channelState,jdbcType=VARCHAR}, #{channelRespCode,jdbcType=VARCHAR}, ",
        "#{channelRespDesc,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{payEndTime,jdbcType=TIMESTAMP}, #{deliverTime,jdbcType=TIMESTAMP}, ",
        "#{takeOverTime,jdbcType=TIMESTAMP})"
    })
    int insert(Order record);

    @InsertProvider(type=OrderSqlProvider.class, method="insertSelective")
    int insertSelective(Order record);

    @SelectProvider(type=OrderSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="address_id", property="addressId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_list", property="goodsList", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_amt", property="totalAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="state", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_channel", property="payChannel", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_order_id", property="payOrderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_state", property="channelState", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_resp_code", property="channelRespCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_resp_desc", property="channelRespDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="pay_end_time", property="payEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deliver_time", property="deliverTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="take_over_time", property="takeOverTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Order> selectByExample(OrderExample example);

    @Select({
        "select",
        "order_id, user_id, address_id, goods_list, total_amt, state, pay_channel, pay_order_id, ",
        "channel_state, channel_resp_code, channel_resp_desc, create_time, pay_end_time, ",
        "deliver_time, take_over_time",
        "from order",
        "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="address_id", property="addressId", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_list", property="goodsList", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_amt", property="totalAmt", jdbcType=JdbcType.DECIMAL),
        @Result(column="state", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_channel", property="payChannel", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_order_id", property="payOrderId", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_state", property="channelState", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_resp_code", property="channelRespCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_resp_desc", property="channelRespDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="pay_end_time", property="payEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deliver_time", property="deliverTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="take_over_time", property="takeOverTime", jdbcType=JdbcType.TIMESTAMP)
    })
    Order selectByPrimaryKey(String orderId);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    @UpdateProvider(type=OrderSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Order record);

    @Update({
        "update order",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "address_id = #{addressId,jdbcType=INTEGER},",
          "goods_list = #{goodsList,jdbcType=VARCHAR},",
          "total_amt = #{totalAmt,jdbcType=DECIMAL},",
          "state = #{state,jdbcType=VARCHAR},",
          "pay_channel = #{payChannel,jdbcType=VARCHAR},",
          "pay_order_id = #{payOrderId,jdbcType=VARCHAR},",
          "channel_state = #{channelState,jdbcType=VARCHAR},",
          "channel_resp_code = #{channelRespCode,jdbcType=VARCHAR},",
          "channel_resp_desc = #{channelRespDesc,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "pay_end_time = #{payEndTime,jdbcType=TIMESTAMP},",
          "deliver_time = #{deliverTime,jdbcType=TIMESTAMP},",
          "take_over_time = #{takeOverTime,jdbcType=TIMESTAMP}",
        "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Order record);
}