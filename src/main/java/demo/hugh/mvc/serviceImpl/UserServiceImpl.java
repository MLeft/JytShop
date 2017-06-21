package demo.hugh.mvc.serviceImpl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.hugh.mvc.dao.UserDao;
import demo.hugh.mvc.po.User;
import demo.hugh.mvc.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	private static Logger log = Logger.getLogger(UserServiceImpl.class);

	@Resource
	UserDao userDaoImpl;

	@Override
	public User getUserByName(String name) {

		return userDaoImpl.selectByName(name);
	}

	@Override
	public User getUserByMobile(Long mobile) {
		return userDaoImpl.selectByMobile(mobile);
	}

}
