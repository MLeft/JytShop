package demo.hugh.mvc.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import demo.hugh.mvc.bean.BaseResBean;
import demo.hugh.mvc.config.ContextConfig;
import demo.hugh.mvc.dao.UserDao;
import demo.hugh.mvc.po.User;
import demo.hugh.mvc.service.UserService;

@RestController
@RequestMapping("/user")
public class LoginController {

	Logger log = Logger.getLogger(HelloController.class);

	@Resource
	UserService userServiceImpl;

	@Resource
	UserDao userDaoImpl;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Object login_post(HttpServletRequest request, @ModelAttribute User user) {

		// log.debug("---请求参数:" + JSON.toJSONString(request.getParameterMap()));
		BaseResBean res = new BaseResBean("S0000000", "登录成功");

		User _user = userServiceImpl.getUserByMobile(user.getMobile());
		if (_user == null) {
			log.error("根据手机号" + user.getMobile() + "未找到用户");
			res.setCode("E9999999");
			res.setMsg("登录失败,用户名或密码错误");
			return res;
		} else if (_user.getPassword().equals(user.getPassword())) {
			log.info("你好, " + _user.getName());
			// 放入session
			request.getSession().setAttribute(ContextConfig.SESSION_USER, _user);
			return res;
		} else {
			res.setCode("E9999999");
			res.setMsg("登录失败,用户名或密码错误");
			return res;
		}
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public Object register(@ModelAttribute User user,
			HttpServletRequest request) {

		log.debug("---请求参数:" + JSON.toJSONString(user));
		BaseResBean res = new BaseResBean("S0000000", "登录成功");

		User _user = userServiceImpl.getUserByMobile(user.getMobile());
		if (_user == null) {
			user.setName("用户_" + user.getMobile());
			userDaoImpl.insertSelective(user);
			user = userServiceImpl.getUserByMobile(user.getMobile());
			log.debug("插入后的user: " + JSON.toJSONString(user));
			res.setCode("S0000000");
			res.setMsg("注册成功");
			// 放入session
			request.getSession().setAttribute(ContextConfig.SESSION_USER, user);
			return res;
		} else {
			log.error("手机号 " + _user.getMobile() + " 已被用户 " + _user.getName() + " 注册");
			res.setCode("E9999999");
			res.setMsg("注册失败,用户已存在");
			return res;
		}
	}

}
