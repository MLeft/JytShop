$(document).ready(function() {
    console.log("登陆页面初始化完成...");
    $("#btn_login").click(function(event) {
	event.preventDefault();
	register();
    });
});

function register() {
    var user = {};
    user.mobile = $("[name='mobile']").val();
    user.password = $("[name='password']").val();
    // console.log(user);
    $.ajax({
	url : "/user/login",
	type : "POST",
	data : user,
	success : function(res) {
	    if ("S0000000" == res.code) {
		// 登陆成功,跳转首页
		self.location = "/page/goods_list.html";
	    } else {
		alert(res.msg);
	    }
	}
    });
}