package com.study.dai.buy.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.study.dai.buy.dao.IBuyDao;
import com.study.dai.buy.po.BuyPO;
import com.study.dai.buy.service.IBuyService;

@Service("buySerivce")
@Scope("singleton")
public class BuyService implements IBuyService{
	
	@Resource(name="buyDao")
	private IBuyDao buyDao;

	@Override
	public BuyPO searchBuy() {
		return buyDao.searchBuy();
	}

}
