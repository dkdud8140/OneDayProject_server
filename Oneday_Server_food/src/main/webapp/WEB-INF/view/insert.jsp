<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
a:hover { color : #DB7093 ;}
button:hover{background-color: #FFB6C1 ;
			color: white;}
h1, h2, h3, h4, h5, h6 {text-align: center;}
form { position : relative; left : 50%; transform : translateX(-50%); }
table{ position : relative; left : 50%; transform : translateX(-50%);}
button {background-color: 	#AFEEEE;
	   border: none;
	   padding : 5px 5px;
	   text-align: center;
	   cursor: pointer;}
table {
	border-top : 1px solid #cccccc;
	border-collapse: collapse;}
th,td {	padding : 15px 15px; 
	border-top : 1px solid #cccccc;}
thead {
	background-color: 	#E0FFFF; }
body { font-family : "Noto Sans CJK KR Light", "돋움", dotum, arial,"굴림", gulim}
</style>

<title>식사 기록하기</title>
</head>
<body>
	<h3>식사 기록하기</h3>
	<form method = "POST">
		<table>
			<tr><th>날짜입력</th><td><input name = "year" style="width : 100px">년 <input name = "month" style="width : 100px">월 <input name = "day" style="width : 100px">일 </td></tr>
			<tr><th>식품코드</th><td><input name = "code" value="${CODE}"></td></tr>
			<tr><th>섭취량</th><td><input name = "eat"></td></tr>
			<tr><th></th><td><button>입력</button></td></tr>
		</table>
	</form>
	<a href = "/diet"><b>◁◁첫화면으로 돌아가기</b></a>	
</body>
</html>