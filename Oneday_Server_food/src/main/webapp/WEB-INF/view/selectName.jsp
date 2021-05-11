<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 찾기</title>
<style>
body { width : 1200px; position : absolute; left : 50%; transform : translateX(-50%);}
p { text-align: center;}
input {	width : 200px;
		border : 0.5px solid #cccccc}
a { text-decoration-line : none;
	color : #20B2AA	;}
h1, h2, h3, h4, h5, h6 {text-align: center;}
form { width : 250px;  left : 50%; align-content: center; margin: auto;}
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

</head>
<body>
	<h3>찾는 제품을 검색하세요</h3>
	<form action ="selectByName">
		<input name ="name">
		<button>입력</button>
	</form>
	<a href = "/diet"><b>◁◁첫화면으로 돌아가기</b></a>	
</body>
</html>