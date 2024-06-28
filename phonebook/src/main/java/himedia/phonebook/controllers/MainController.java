package himedia.phonebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import himedia.phonebook.services.PhonebookService;



@RequestMapping("/")
@Controller
public class MainController {
	private PhonebookService phonebookService;
	
	@Autowired
	public MainController(PhonebookService phonebookService) {
		this.phonebookService = phonebookService;
	}
	
	
	@GetMapping("")
	public String phonebookView(@RequestParam(name = "keyword", required = false, defaultValue = "") String keyword, Model model) {
		if ("".equals(keyword))
			model.addAttribute("phonebookLst", phonebookService.getList());
		else
			model.addAttribute("phonebookLst", phonebookService.searchListByNameKeyword(keyword));
		
		return "list";
	}
	
	@GetMapping("/add")
	public String phonebookAddView() {
		return "addform";
	}
	

	
//	@ExceptionHandler(RuntimeException.class)
//	@ResponseBody
//	public String handlerControllerException(RuntimeException e) {
//		return "Exception: " + e.getMessage();
//	}
	
//	@ExceptionHandler(MainControllerException.class)
//	public String handleControllerExcept(MainControllerException e,
//			Model model) {
//		model.addAttribute("name", e.getClass().getSimpleName());
//		model.addAttribute("message", e.getMessage());
//		
//		return "errors/exception";
//	}
}