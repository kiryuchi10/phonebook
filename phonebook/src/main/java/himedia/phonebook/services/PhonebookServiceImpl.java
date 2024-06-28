package himedia.phonebook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.phonebook.repositories.dao.PhonebookDao;
import himedia.phonebook.repositories.vo.PhonebookVo;

@Service("/phonebookService")
public class PhonebookServiceImpl implements PhonebookService {

	private PhonebookDao phonebookDao;

	@Autowired
	public PhonebookServiceImpl(PhonebookDao phonebookDao) {
		this.phonebookDao = phonebookDao;
	}

	@Override
	public List<PhonebookVo> getList() {
		return phonebookDao.selectAll();
	}

	@Override
	public List<PhonebookVo> searchListByNameKeyword(String keyword) {
		return phonebookDao.selectListByKeyword(keyword);
	}

	@Override
	public boolean delete(PhonebookVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

}
