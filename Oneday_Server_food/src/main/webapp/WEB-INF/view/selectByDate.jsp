<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
body { width : 1200px; position : absolute; left : 50%; transform : translateX(-50%);}
p { text-align: center;}
input {	width : 80px;
		border : 0.5px solid #cccccc}
a { text-decoration-line : none;
	color : #20B2AA	;}
h1, h2, h3, h4, h5, h6 {text-align: center;}
form { width: 1000px; float : right; }
table{ position : relative; left : 50%; transform : translateX(-50%);}
button {background-color: 	#AFEEEE;
	   border: none;
	   padding : 5px 5px;
	   text-align: center;
	   cursor: pointer;}
table {
	border-top : 1px solid #cccccc;
	border-collapse: collapse;}
th,td {	padding : 15px 10px; 
	border-top : 1px solid #cccccc;}
thead {
	background-color: 	#E0FFFF; }
body { font-family : "Noto Sans CJK KR Light", "돋움", dotum, arial,"굴림", gulim}
a:hover { color : #DB7093 ;}
button:hover{background-color: #FFB6C1 ;
			color: white;}
</style>

<title>날짜별 조회 결과</title>
</head>
<body>

<h2>조회 결과</h2>
<a href = "/diet"><b>◁◁첫화면으로 돌아가기</b></a>	
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
	
</body>
</html>