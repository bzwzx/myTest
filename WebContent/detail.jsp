<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table border="1">
      <tr>
        <td>编号</td>
        <td>${web.id }</td>
      </tr>
      <tr>
        <td>姓名</td>
        <td>${web.name }</td>
      </tr>
      <tr>
        <td>生日</td>
        <td>${web.birthday }</td>
      </tr>
      <tr>
        <td>性别</td>
        <td>${web.sex }</td>
      </tr>
      <tr>
        <td>职业</td>
        <td>${web.work }</td>
      </tr>
      <tr>
        <td>住所</td>
        <td>${web.address }</td>
      </tr>
      <tr>
        <td>电话</td>
        <td>${web.phone }</td>
      </tr>     
    </table>
    <input type="button" value="返回" onclick="window.location.href='WebInfo.jsp'" />
</body>
</html>