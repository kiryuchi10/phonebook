package himedia.phonebook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import himedia.phonebook.repositories.vo.PhonebookVo;
import himedia.phonebook.services.PhonebookService;

@RequestMapping("phonebook")
public class PhonebookController {
	@Autowired
	private PhonebookService phonebookService;
	
	@RequestMapping({"","/","list"})
	public String list(Model model) {
		List<PhonebookVo> list =phonebookService.getList();
		model.addAttribute("list", list);
//		System.out.println(list);
		return "phonebook/list";
	}
}
	