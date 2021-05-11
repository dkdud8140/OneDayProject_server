<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	th,td {padding : 10px;}
</style>

<title>날짜별 조회 결과</title>
</head>
<body>

<h2>조회 결과</h2>

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

	<p>    
	<p>   
	<a href = "/diet">첫화면으로 돌아가기</a>	
</body>
</html>