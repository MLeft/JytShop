package demo.hugh.mvc.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.hugh.mvc.dao.AddressDao;
import demo.hugh.mvc.mapper.AddressMapper;
import demo.hugh.mvc.po.Address;

@Repository
public class AddressDaoImpl implements AddressDao {

	@Autowired
	private AddressMapper mapper;

	@Override
	public void insert(Address bean) {
		mapper.insert(bean);
	}

	@Override
	public void insertSelective(Address bean) {
		mapper.insertSelective(bean);

	}

	@Override
	public Address select(Integer key) {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public void update(Address bean) {
		mapper.updateByPrimaryKey(bean);

	}

	@Override
	public void updateSelective(Address bean) {
		mapper.updateByPrimaryKeySelective(bean);

	}

	@Override
	public void delete(Integer key) {
		mapper.deleteByPrimaryKey(key);

	}

}
