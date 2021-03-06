package com.com.food.service;

import java.util.List;

import com.com.food.model.FoodsDTO;
import com.com.food.model.MyFoodsVO;
import com.com.food.model.MyfoodsDTO;

public interface FoodService {
	
	// 기록한 모든 리스트를 조회하는 메소드
	public List<MyfoodsDTO> selectAll();
	// 기록한 리스트 중 원하는 날짜 조회
	public List<MyfoodsDTO> selectDate(String startDate, String lastDate );
	// 식품이름으로 검색하기
	public List<FoodsDTO> selectName(String f_name);

	// 섭취량 입력 메소드
	public int insert(MyFoodsVO myfoodsVO);
	
	
	
	//구현하지 않을 메소드
	public void delete();
	public void update();
}