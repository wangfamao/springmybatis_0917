package com.entor.dao;

import java.util.List;

import com.entor.entity.OrderProduct;

public interface OrderProductDao{
	
	public void add(OrderProduct orderProduct);
	public void update(OrderProduct orderProduct);
	public void deleteById(int id);
	public List<OrderProduct> queryAll();
	public OrderProduct queryById(int id);

	/**
	 * 根据订单主键编号删除关系
	 * @param orderId
	 */
	public void deleteByOrderId(int orderId);
	/**
	 * 根据商品主键编号删除关系
	 * @param productId
	 */
	public void deleteByProductId(int productId);
}
