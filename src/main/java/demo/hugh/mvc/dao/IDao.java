package demo.hugh.mvc.dao;

public interface IDao<K, V> {

	void insert(V bean);

	void insertSelective(V bean);

	V select(K key);

	void update(V bean);

	void updateSelective(V bean);

	void delete(K key);
}
