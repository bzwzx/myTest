<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
</head>
<body>
<form action="WebInfoServlet?op=addInfo" method="post">
<table border="1">
      <tr>
        <td>姓名</td>
        <td><input name="uname" type="text" /></td>
      </tr>
      <tr>
        <td>生日</td>
        <td><input type="text" name="birthday" /></td>
      </tr>
      <tr>
        <td>性别</td>
        <td><input type="text" name="sex" /></td>
      </tr>
      <tr>
        <td>职业</td>
        <td><input type="text" name="work" /></td>
      </tr>
      <tr>
        <td>住所</td>
        <td><input type="text" name="address" /></td>
      </tr>
      <tr>
        <td>电话</td>
        <td><input type="text" name="phone" /></td>
      </tr>     
    </table>
    <input type="submit" value="添加" />
    <input type="button" value="返回" onclick="window.location.href='WebInfo.jsp'" />
</form>
</body>
</html>
