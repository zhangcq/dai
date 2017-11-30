package com.study.dai.buy.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.dai.buy.service.IBuyService;
import com.study.dai.buy.vo.BuyVO;

@Controller
@RequestMapping(value ="/buy")
@Scope("singleton")
public class BuyController {

	@Resource(name = "buySerivce")
	private IBuyService buySerivce;
	
	@RequestMapping(value = "/params",produces = MediaType.APPLICATION_JSON_VALUE +";charset=UTF-8",method = RequestMethod.GET )
	public ResponseEntity<BuyVO> getStudent(String id,String name) {
		BuyVO buyVO = new BuyVO();
		buyVO.setId(id);
		buyVO.setName(name);
		
		return new ResponseEntity<BuyVO>(buyVO,HttpStatus.CREATED);
		
	}
}
