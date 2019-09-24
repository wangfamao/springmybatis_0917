package com.entor.dao;

import java.util.List;

import com.entor.entity.Order;

public interface OrderDao{

	public void add(Order order);
	public void update(Order order);
	public void deleteById(int id);
	public List<Order> queryAll();
	public Order queryById(int id);
	/**
	 * 根据主键编号查询订单以及订单对应的商品列表
	 * @param id
	 * @return
	 */
	public Order queryOrderAndProductById(int id);
	
	/**
	 * 查询所有订单以及订单对应的商品列表
	 * @return
	 */
	public List<Order> queryAllOrderAndProduct();
	
}
