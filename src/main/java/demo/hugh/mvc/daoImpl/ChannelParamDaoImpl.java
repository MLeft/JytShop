package demo.hugh.mvc.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.hugh.mvc.dao.ChannelParamDao;
import demo.hugh.mvc.mapper.ChannelParamMapper;
import demo.hugh.mvc.po.ChannelParam;

@Repository
public class ChannelParamDaoImpl implements ChannelParamDao {

	@Autowired
	private ChannelParamMapper mapper;

	@Override
	public void insert(ChannelParam bean) {
		mapper.insert(bean);

	}

	@Override
	public void insertSelective(ChannelParam bean) {
		mapper.insertSelective(bean);
	}

	@Override
	public ChannelParam select(String key) {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public void update(ChannelParam bean) {
		mapper.updateByPrimaryKey(bean);
	}

	@Override
	public void updateSelective(ChannelParam bean) {
		mapper.updateByPrimaryKeySelective(bean);
	}

	@Override
	public void delete(String key) {
		mapper.deleteByPrimaryKey(key);
	}

}
