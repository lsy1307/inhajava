package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@RequestMapping("/hello")
	public String multiple(String num) {
		String s1 = "";
		for(int i =1; i < 10; i++)
		{
			s1 += num+"*"+i+"="+Integer.parseInt(num)*i+" ";
		}
		return s1;
	}
}