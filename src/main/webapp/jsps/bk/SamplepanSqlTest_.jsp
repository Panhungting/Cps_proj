<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SQL title here</title>
<style>
div {
	background: #ffffff;
	width: 300px;
	padding: 10px;
	/*text-align: center;
	 border: 1px solid #cccccc; */
}

.center {
	border: 1px solid #aaa;
	width: 400px;
	text-align: center;
}
</style>
</head>
<body>
	
	<p >Insert test</p>
	<form action="../samplepanPanSql01!excutepan.action" method="post">
		<label for="name">Please enter your name</label><br /> 
			userid &nbsp;&nbsp;&nbsp;:<input type="text" name="userid" /> <br/>
			username:<input type="text" name="username" /> <br/>
			userpwd &nbsp;:<input type="text" name="userpwd" /> <br/>
		<input type="submit" value="提出する" />
		类属性message（el表达式）: ${message}<br>
		类属性 用户 （el表达式）:${ru.age}<br>
		<br>struts类属性 用户:
		<s:property value="#attr.ru.age" />
		<br> struts 类属性 message：
		<s:property value="#attr.message" />
		<br> Pan

	</form>
	
	<div class ="center">
	<p >Delete test</p>
	<form action="../samplepanSql!deleteSql.action" method="post">
		<label for="name">Please enter your name</label><br /> 
			userid &nbsp;&nbsp;&nbsp;:<input type="text" name="userid" /> <br/>
			username:<input type="text" name="username" disabled="disabled"/> <br/>
			userpwd &nbsp;:<input type="text" name="userpwd" /> <br/>
		<input type="submit" value="提出する" />
		类属性message（el表达式）: ${message}<br>
		类属性 用户 （el表达式）:${ru.age}<br>
		<br>struts类属性 用户:
		<s:property value="#attr.ru.age" />
		<br> struts 类属性 message：
		<s:property value="#attr.message" />
		<br> Pan

	</form>
	</div>
</body>
</html>