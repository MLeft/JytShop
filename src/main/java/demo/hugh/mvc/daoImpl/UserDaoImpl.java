package demo.hugh.mvc.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import demo.hugh.mvc.dao.UserDao;
import demo.hugh.mvc.mapper.UserMapper;
import demo.hugh.mvc.po.User;
import demo.hugh.mvc.po.UserExample;

@Repository
public class UserDaoImpl implements UserDao {

	Logger log = Logger.getLogger(UserDaoImpl.class);

	@Resource
	private UserMapper userMapper;

	@Override
	public void insert(User bean) {

		userMapper.insert(bean);
	}

	@Override
	public void insertSelective(User bean) {
		userMapper.insertSelective(bean);
	}

	@Override
	public User select(Integer key) {
		return userMapper.selectByPrimaryKey(key);
	}

	@Override
	public void update(User bean) {
		userMapper.updateByPrimaryKey(bean);
	}

	@Override
	public void updateSelective(User bean) {
		userMapper.updateByPrimaryKeySelective(bean);
	}

	@Override
	public void delete(Integer key) {
		userMapper.deleteByPrimaryKey(key);
	}

	@Override
	public User selectByName(String name) {
		UserExample example = new UserExample();
		example.createCriteria().andNameEqualTo(name);
		List<User> list = userMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else if (list.size() > 1) {
			log.warn("根据user_name[" + name + "]查找到多条数据！");
		}
		return list.get(0);
	}

	@Override
	public User selectByMobile(Long mobile) {
		UserExample example = new UserExample();
		example.createCriteria().andMobileEqualTo(mobile);
		List<User> list = userMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else if (list.size() > 1) {
			log.warn("根据user_name[" + mobile + "]查找到多条数据！");
		}
		return list.get(0);
	}

}
