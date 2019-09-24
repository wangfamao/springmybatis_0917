package com.entor.service;

import java.util.List;

import com.entor.entity.OrderProduct;

public interface OrderProductService{
	public void add(OrderProduct orderProduct);
	public void update(OrderProduct orderProduct);
	public void deleteById(int id);
	public List<OrderProduct> queryAll();
	public OrderProduct queryById(int id);
}
