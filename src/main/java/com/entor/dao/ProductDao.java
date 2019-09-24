package com.entor.dao;

import java.util.List;

import com.entor.entity.Product;

public interface ProductDao{

	public void add(Product product);
	public void update(Product product);
	public void deleteById(int id);
	public List<Product> queryAll();
	public Product queryById(int id);
}
