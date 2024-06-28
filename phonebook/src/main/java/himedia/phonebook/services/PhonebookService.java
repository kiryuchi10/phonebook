package himedia.phonebook.services;

import java.util.List;

import himedia.phonebook.repositories.vo.PhonebookVo;

public interface PhonebookService {

	public List<PhonebookVo> getList();
	public boolean delete(PhonebookVo vo);
	public List<PhonebookVo> searchListByNameKeyword(String keyword);

}
