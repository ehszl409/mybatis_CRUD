package com.park.mybatisex01.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.park.mybatisex01.model.Product;

// 구현체를 만들어 주는 것.
@Mapper
public interface ProductRepository {
	public void save(Product product);
	public void deleteById(int id);
	public void update(Product product);
	public List<Product> findAll();
	public Product findById(int id);
}
