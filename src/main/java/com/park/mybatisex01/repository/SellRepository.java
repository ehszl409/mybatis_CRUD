package com.park.mybatisex01.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.park.mybatisex01.model.Product;
import com.park.mybatisex01.model.beans.SellBean;

// 구현체를 만들어 주는 것.
@Mapper
public interface SellRepository {
	public SellBean findByIdAndJoin(int id);
}
