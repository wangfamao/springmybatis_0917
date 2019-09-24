package com.entor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.OrderProductDao;
import com.entor.entity.OrderProduct;
import com.entor.service.OrderProductService;

@Service("orderProductService")
public class OrderProductServiceImpl implements OrderProductService{

	@Resource
	private OrderProductDao orderProductDao;
	@Override
	public void add(OrderProduct orderProduct) {
		orderProductDao.add(orderProduct);
	}

	@Override
	public void update(OrderProduct orderProduct) {
		orderProductDao.update(orderProduct);
	}

	@Override
	public void deleteById(int id) {
		orderProductDao.deleteById(id);
	}

	@Override
	public List<OrderProduct> queryAll() {
		return orderProductDao.queryAll();
	}

	@Override
	public OrderProduct queryById(int id) {
		return orderProductDao.queryById(id);
	}

}
