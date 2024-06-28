package himedia.phonebook.repositories.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.phonebook.repositories.vo.PhonebookVo;

@Repository
public class PhonebookDaoImpl implements PhonebookDao {

	private SqlSession sqlSession;

	@Autowired
	public PhonebookDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<PhonebookVo> selectAll() {

		return sqlSession.selectList("phonebook.selectAll");
	}

	@Override
	public List<PhonebookVo> selectListByKeyword(String keyword) {
		return sqlSession.selectList("phonebook.selectListByKeyword", keyword);
	}

	@Override
	public PhonebookVo selectOne(Integer id) {
		return sqlSession.selectOne("phonebook.selectOne", id);
	}

	@Override
	public int insert(PhonebookVo phonebookVo) {
		return sqlSession.insert("phonebook.insert", phonebookVo);
	}

	@Override
	public int delete(PhonebookVo phonebookVo) {
		return sqlSession.delete("phonebook.delete", phonebookVo);
	}

}
