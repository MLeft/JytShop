$(document).ready(function() {
    $("#btn_pre_order").click(function(event) {
	event.preventDefault();
	preOrder();
    });
});

function preOrder() {
    // TODO 清空购物车,生成订单
    // 跳转到订单支付页
    self.location = "pre_order.html";
}