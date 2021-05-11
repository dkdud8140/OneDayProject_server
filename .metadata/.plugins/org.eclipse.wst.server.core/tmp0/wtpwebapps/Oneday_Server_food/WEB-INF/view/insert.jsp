<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>식사 기록하기</title>
</head>
<body>
	<h3>식사 기록하기</h3>
	<p>날짜는 YYYY-DD-YY 형식으로 입력하세요.
	<form method = "POST">
		<table>
			<tr><th>날짜입력</th><td><input name = "year" style="width : 100px">년 <input name = "month" style="width : 100px">월 <input name = "day" style="width : 100px">일 </td></tr>
			<tr><th>식품코드</th><td><input name = "code" value="${CODE}"></td></tr>
			<tr><th>섭취량</th><td><input name = "eat"></td></tr>
			<tr><th></th><td><button>입력</button></td></tr>
		</table>
	</form>
	
</body>
</html>