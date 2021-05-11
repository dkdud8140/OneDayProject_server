<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 다이어트 일기</title>

<style>
	th,td {padding : 10px;}
	input {width : 100px;}
</style>

</head>
<body>
	
	<h2>나의 다이어트 일기</h2>
	
	<h3><a href = "/diet/insert/selectName">새로운 식단 입력하기</a></h3>
	
	<h3>날짜별 식단 조회하기</h3>
	<form action ="/diet/dateSerch" method="get">
	<input name ="sYear">년 <input name ="sMonth">월 <input name ="sDay">일 ~
	<input name ="lYear">년 <input name ="lMonth">월 <input name ="lDay">일 
	<button>조회하기</button>
	</form>
	
	<p> 
	<p> 
	<p> 
	
	
	<table>
		<thead>
			<tr>
				<th>일련번호</th>
				<th>날짜</th>
				<th>식품코드</th>
				<th>식품명</th>
				<th>섭취량</th>
				<th>칼로리</th>
				<th>단백질</th>
				<th>지방</th>
				<th>탄수화물</th>
				<th>당류</th>
			</tr>
		</thead>

		<c:forEach items="${MFLIST}" var="MF">
		<tbody>
			<tr>
				<th>${MF.mf_seq}</th>
				<th>${MF.mf_date}</th>
				<th>${MF.mf_code}</th>
				<th>${MF.mf_name}</th>
				<th>${MF.mf_eat}</th>
				<th>${MF.mf_kcal}</th>
				<th>${MF.mf_protein}</th>
				<th>${MF.mf_fat}</th>
				<th>${MF.mf_car}</th>
				<th>${MF.mf_sugar}</th>
			</tr>
		</tbody>
		</c:forEach>
	
	</table>

	
	
</body>
</html>