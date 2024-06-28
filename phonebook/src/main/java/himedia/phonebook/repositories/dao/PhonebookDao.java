package himedia.phonebook.repositories.dao;

import java.util.List;

import himedia.phonebook.repositories.vo.PhonebookVo;

public interface PhonebookDao {
	public List<PhonebookVo> selectAll();
	public int insert(PhonebookVo vo); // 게시물 작성
	public int delete(PhonebookVo vo);
//	public PhonebookVo getContent(PhonebookVo Phonebookvo);
	PhonebookVo selectOne(Integer id);
	public List<PhonebookVo> selectListByKeyword(String keyword);
}
