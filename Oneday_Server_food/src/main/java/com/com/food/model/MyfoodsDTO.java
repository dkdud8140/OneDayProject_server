package com.com.food.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

//입력한 일일 섭취량 
public class MyfoodsDTO {

	private Integer mf_seq;			//일련번호
	private String mf_date;			//입력한 날짜
	private String mf_code;			//입력한 식품코드
	private String mf_name;			//입력한 식품명
	private Integer mf_eat;			//입려간 섭취향
	private Integer mf_kcal;			//섭취한 칼로리
	private Integer mf_protein;		//섭취한 단백질
	private Integer mf_fat;			//섭취한 지방
	private Integer mf_car;			//섭취한 탄수화물
	private Integer mf_sugar;		//섭취한 당류
	
}
