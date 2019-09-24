package com.entor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.OrderProductDao;
import com.entor.dao.ProductDao;
import com.entor.entity.Product;
import com.entor.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Resource
	private ProductDao productDao;
	@Resource
	private OrderProductDao orderProductDao;

	@Override
	public void add(Product product) {
		productDao.add(product);
	}

	@Override
	public void update(Product product) {
		productDao.update(product);
	}

	@Override
	public void deleteById(int id) {
		orderProductDao.deleteByProductId(id);
		productDao.deleteById(id);
	}

	@Override
	public List<Product> queryAll() {
		return productDao.queryAll();
	}

	@Override
	public Product queryById(int id) {
		return productDao.queryById(id);
	}
	

}
