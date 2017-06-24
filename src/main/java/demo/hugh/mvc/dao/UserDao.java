package demo.hugh.mvc.dao;

import demo.hugh.mvc.po.User;

public interface UserDao extends IDao<Integer, User> {

	User selectByName(String name);

	User selectByMobile(Long mobile);

}
