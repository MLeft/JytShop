package demo.hugh.mvc.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.hugh.mvc.dao.OrderDao;
import demo.hugh.mvc.mapper.OrderMapper;
import demo.hugh.mvc.po.Order;

@Repository
public class OrderDaoImpl implements OrderDao {

	@Autowired
	private OrderMapper mapper;

	@Override
	public void insert(Order bean) {
		mapper.insert(bean);
	}

	@Override
	public void insertSelective(Order bean) {
		mapper.insertSelective(bean);
	}

	@Override
	public Order select(String key) {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public void update(Order bean) {
		mapper.updateByPrimaryKey(bean);
	}

	@Override
	public void updateSelective(Order bean) {
		mapper.updateByPrimaryKeySelective(bean);
	}

	@Override
	public void delete(String key) {
		mapper.deleteByPrimaryKey(key);
	}

}
