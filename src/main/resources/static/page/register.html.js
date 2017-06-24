$(document).ready(function() {
    console.log("注册页面初始化完成...");
    $("#btn_register").click(function(event) {
	event.preventDefault();
	register();
    });
});

function register() {
    var user = {};
    user.mobile = $("[name='mobile']").val();
    user.password = $("[name='password']").val();
    user._password = $("[name='_password']").val();
    if (user.password != user._password) {
	alert("两次输入密码不一致!");
    }
    // console.log(user);
    $.ajax({
	url : "/user/register",
	type : "POST",
	data : user,
	success : function(res) {
	    if ("S0000000" == res.code) {
		// 注册成功,跳转首页
	    } else {
		alert(res.msg);
	    }
	}
    });
}