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


//일일섭취량 VO
public class MyFoodsVO {

	private Integer mf_seq;		//	일일섭취량 시퀀스
	private String mf_date;		//	입력한 날짜
	private String mf_code;		//	입력한 음식 코드
	private Integer mf_eat;		//	입력한 섭취량	        
	
}
