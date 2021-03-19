package com.park.mybatisex01.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.park.mybatisex01.model.Product;
import com.park.mybatisex01.model.beans.SellBean;
import com.park.mybatisex01.repository.ProductRepository;
import com.park.mybatisex01.repository.SellRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class SellController {
	
	private final SellRepository sellRepository;
	
	@GetMapping("/sell/{id}")
	public SellBean findByIdAndJoin(@PathVariable int id){
		return sellRepository.findByIdAndJoin(id);
	}
}
