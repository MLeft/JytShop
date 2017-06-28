package demo.hugh.mvc.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.hugh.mvc.dao.GoodsDao;
import demo.hugh.mvc.mapper.GoodsMapper;
import demo.hugh.mvc.po.Goods;

@Repository
public class GoodsDaoImpl implements GoodsDao {

	@Autowired
	private GoodsMapper mapper;

	@Override
	public void insert(Goods bean) {
		mapper.insert(bean);
	}

	@Override
	public void insertSelective(Goods bean) {
		mapper.insertSelective(bean);
	}

	@Override
	public Goods select(Integer key) {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public void update(Goods bean) {
		mapper.updateByPrimaryKey(bean);
	}

	@Override
	public void updateSelective(Goods bean) {
		mapper.updateByPrimaryKeySelective(bean);
	}

	@Override
	public void delete(Integer key) {
		mapper.deleteByPrimaryKey(key);
	}

}
