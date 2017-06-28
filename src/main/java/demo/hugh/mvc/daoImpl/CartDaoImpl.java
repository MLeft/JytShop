package demo.hugh.mvc.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.hugh.mvc.dao.CartDao;
import demo.hugh.mvc.mapper.CartMapper;
import demo.hugh.mvc.po.Cart;

@Repository
public class CartDaoImpl implements CartDao {

	@Autowired
	private CartMapper mapper;

	@Override
	public void insert(Cart bean) {
		mapper.insert(bean);

	}

	@Override
	public void insertSelective(Cart bean) {
		mapper.insertSelective(bean);

	}

	@Override
	public Cart select(Integer key) {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public void update(Cart bean) {
		mapper.updateByPrimaryKey(bean);
	}

	@Override
	public void updateSelective(Cart bean) {
		mapper.updateByPrimaryKeySelective(bean);

	}

	@Override
	public void delete(Integer key) {
		mapper.deleteByPrimaryKey(key);
	}

}
