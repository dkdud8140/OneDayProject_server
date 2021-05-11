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

<title>검색결과</title>
</head>
<body>
	<h2>검색결과</h2>
	<h3>원하는 식품코드를 클릭하세요</h3>
	<a href = "/diet"><b>◁◁첫화면으로 돌아가기</b></a>	
	<table>
		<thead>
			<tr>
				<th>식품코드</th>
				<th>식품명</th>
				<th>출시연도</th>
				<th>제조사코드</th>
				<th>제조사명</th>
				<th>분류코드</th>
				<th>분류명</th>
				<th>일회제공량</th>
				<th>총내용량</th>
				<th>칼로리</th>
				<th>단백질</th>
				<th>지방</th>
				<th>탄수화물</th>
				<th>총당류</th>
			</tr>
		</thead>
		
		<c:forEach items="${FLIST}" var="FL">
		<tbody>
			<tr>
				<th><a href ="insert?code=${FL.code}">${FL.code}</a></th>
				<th>${FL.name}</th>
				<th>${FL.year}</th>
				<th>${FL.ccode}</th>
				<th>${FL.cname}</th>
				<th>${FL.icode}</th>
				<th>${FL.iname}</th>
				<th>${FL.offer}</th>
				<th>${FL.total}</th>
				<th>${FL.kcal}</th>
				<th>${FL.protein}</th>
				<th>${FL.fat}</th>
				<th>${FL.car}</th>
				<th>${FL.sugar}</th>
			</tr>
		</tbody>
		</c:forEach>
	
	</table>
</body>
</html>