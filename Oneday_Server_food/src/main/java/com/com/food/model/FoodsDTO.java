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

// view_식품정보 DTO
public class FoodsDTO {

	private String code; 			//AS 식품코드,
	private String name; 		//AS 식품명,
	private Integer year; 						//AS 출시연도,
	private String ccode; 					//AS 제조사코드,
	private String cname ;						//AS 제조사명,
	private String icode ;					//AS 분류코드,
	private String iname ;						//AS 분류명,
	private Integer offer ;					//AS 일회제공량,
	private Integer total ;					//AS 총내용량,
	private Integer kcal ;						//AS 에너지,
	private Integer protein; 					//AS 단백질,
	private Integer fat ;						//AS 지방,
	private Integer car ;						//AS 탄수화물,
	private Integer sugar; 					//AS 총당류
	
}
