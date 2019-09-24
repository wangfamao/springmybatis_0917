package com.entor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.OrderDao;
import com.entor.dao.OrderProductDao;
import com.entor.dao.ProductDao;
import com.entor.entity.Order;
import com.entor.entity.OrderProduct;
import com.entor.entity.Product;
import com.entor.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService{

	@Resource
	private OrderDao orderDao;
	@Resource
	private ProductDao productDao;
	@Resource
	private OrderProductDao orderProductDao;
	@Override
	public Order queryOrderAndProductById(int id) {
		return orderDao.queryOrderAndProductById(id);
	}
	@Override
	public List<Order> queryAllOrderAndProduct() {
		return orderDao.queryAllOrderAndProduct();
	}
	@Override
	public void addOrder(String pids, Order order) {
		orderDao.add(order);
		for(String pid:pids.split(",")) {
			Product p = productDao.queryById(Integer.parseInt(pid));
			OrderProduct op = new OrderProduct();
			op.setProduct(p);
			op.setOrder(order);
			orderProductDao.add(op);
		}
	}
	@Override
	public void add(Order order) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Order order) {
		orderDao.update(order);
	}
	@Override
	public void deleteById(int id) {
		//先删除订单关联关系
		orderProductDao.deleteByOrderId(id);
		//删除订单
		orderDao.deleteById(id);
	}
	@Override
	public List<Order> queryAll() {
		return orderDao.queryAll();
	}
	@Override
	public Order queryById(int id) {
		return orderDao.queryById(id);
	}
}
