package com.com.food.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.com.food.model.FoodsDTO;
import com.com.food.model.MyFoodsVO;
import com.com.food.model.MyfoodsDTO;
import com.com.food.service.DBConnection;
import com.com.food.service.FoodService;

public class FoodImplV1 implements FoodService {

	private Connection dbConn ; 
	
	public FoodImplV1() {
		dbConn = DBConnection.getDBConnection();
	}
	
	
	public List<MyfoodsDTO> select(PreparedStatement pStr) throws SQLException {
		
		List<MyfoodsDTO> mfList = new ArrayList<MyfoodsDTO>();
		ResultSet rSet = pStr.executeQuery();
		
		while(rSet.next()) {
			MyfoodsDTO mfDTO = new MyfoodsDTO();
			
			mfDTO.setMf_seq(rSet.getInt("일련번호"));
			mfDTO.setMf_date(rSet.getString("날짜"));
			mfDTO.setMf_code(rSet.getString("식품코드"));
			mfDTO.setMf_name(rSet.getString("식품명"));
			mfDTO.setMf_eat(rSet.getInt("섭취량"));
			mfDTO.setMf_kcal(rSet.getInt("칼로리"));
			mfDTO.setMf_protein(rSet.getInt("단백질"));
			mfDTO.setMf_fat(rSet.getInt("지방"));
			mfDTO.setMf_car(rSet.getInt("탄수화물"));
			mfDTO.setMf_sugar(rSet.getInt("총당류"));
			mfList.add(mfDTO);
			
		}
		
		rSet.close();
		pStr.close();
		return mfList;
		
	}

	
	public List<MyfoodsDTO> selectAll() {
		// TODO 기록한 모든 리스트를 조회하는 메소드
		
		String sql = "SELECT * FROM view_일일섭취량";
//		sql += " ORDER BY 날짜 ";
		sql += " ORDER BY 일련번호 DESC ";
		PreparedStatement pStr = null ;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			List<MyfoodsDTO> mfList = this.select(pStr);
			pStr.close();
			return mfList ;
			
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
		
		return null;
	}

	@Override
	public List<MyfoodsDTO> selectDate(String startDate, String lastDate) {
		// TODO 기록한 리스트 중 원하는 날짜 조회

		String sql = "SELECT * FROM view_일일섭취량";
		sql += " WHERE 날짜 BETWEEN ? AND ? ";
		sql += " ORDER BY 날짜 ";
		
		PreparedStatement pStr = null ;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, startDate);
			pStr.setString(2, lastDate);
			List<MyfoodsDTO> mfList = this.select(pStr);
			pStr.close();
			return mfList ;
			
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
		
		return null;
	}

	@Override
	public int insert(MyFoodsVO myfoodsVO) {
		// TODO 섭취량 입력 메소드
		
		
		String sql = " INSERT INTO tbl_myfoods ";
		sql += "(mf_seq, mf_date, mf_code, mf_eat) ";
		sql += " VALUES (seq_myFoods.nextval, ?, ?, ?) ";
		PreparedStatement pStr = null;
		try {
			pStr = dbConn.prepareStatement(sql);
			
			pStr.setString(1, myfoodsVO.getMf_date());
			pStr.setString(2, myfoodsVO.getMf_code());
			pStr.setInt(3, myfoodsVO.getMf_eat());
			int result = pStr.executeUpdate();
			
			pStr.close();
//			int result = pStr.executeUpdate();
			System.out.println("DB 입력 성공");
			return result;
			
		} catch (SQLException e) {
			System.out.println("DB 입력 실패");
		}
		
		return 0 ;
		
	}
	

	@Override
	public List<FoodsDTO> selectName(String f_name) {
		// TODO 식품이름으로 검색하기
		

		String sql = " SELECT * FROM view_식품정보 ";
		sql += " WHERE 식품명 Like '%' || ? || '%' ";
		
		PreparedStatement pStr = null ;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, f_name);
			
			ResultSet rSet = pStr.executeQuery();
			
			List<FoodsDTO> fList = new ArrayList<FoodsDTO>();
			
			while(rSet.next()) {
				FoodsDTO fDTO = new FoodsDTO(); 
				
				fDTO.setCode(rSet.getString("식품코드"));
				fDTO.setName(rSet.getString("식품명"));
				fDTO.setYear(rSet.getInt("출시연도"));
				fDTO.setCcode(rSet.getString("제조사코드"));
				fDTO.setCname(rSet.getString("제조사명"));
				fDTO.setIcode(rSet.getString("분류코드"));
				fDTO.setIname(rSet.getString("분류명"));
				fDTO.setOffer(rSet.getInt("일회제공량"));
				fDTO.setTotal(rSet.getInt("총내용량"));
				fDTO.setKcal(rSet.getInt("에너지"));
				fDTO.setProtein(rSet.getInt("단백질"));
				fDTO.setFat(rSet.getInt("지방"));
				fDTO.setCar(rSet.getInt("탄수화물"));
				fDTO.setSugar(rSet.getInt("총당류"));

				fList.add(fDTO);
				
			}
			
			rSet.close();
			pStr.close();
			return fList;
			
			
		} catch (SQLException e) {
			System.out.println("DB를 불러오는 것을 실패하였습니다.");
		}
		
		
		return null;
		
		
	}
	
	
	
	
	//구현안함
	@Override
	public void delete() {
	}
	
	//구현안함
	@Override
	public void update() {
	}



}
