package com.study.dai.buy.dao;

import org.springframework.stereotype.Repository;

import com.study.dai.buy.po.BuyPO;

@Repository("buyDao")
public interface IBuyDao {

	BuyPO searchBuy();

}
