<%@page import="entiy.Web"%>
<%@page import="java.util.List"%>
<%@page import="impl.WebDaoImpl"%>
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
        <tr bgcolor="gold">
          <td>编号</td>
          <td>姓名</td>
          <td>生日</td>
          <td>性别</td>
          <td>职业</td>
          <td>住所</td>
          <td>电话</td>
          <td>操作</td>
        </tr>
        <%
          WebDaoImpl wdi = new WebDaoImpl();
          List<Web> list = wdi.getAll();
          for(Web web:list){
        %>
        <tr>
          <td><%=web.getId() %></td>
          <td><%=web.getName() %></td>
          <td><%=web.getBirthday() %></td>
          <td><%=web.getSex() %></td>
          <td><%=web.getWork() %></td>
          <td><%=web.getAddress() %></td>
          <td><%=web.getPhone() %></td>
          <td>
            <input type="button" value="查看" onclick="window.location.href='WebInfoServlet?op=check&id=<%=web.getId() %>'" />
            <input type="button" value="更新" onclick="window.location.href='updateInfo.jsp?id=<%=web.getId() %>'" />
            <input type="button" value="删除" onclick="window.location.href='WebInfoServlet?op=deleInfo&id=<%=web.getId() %>'" />
          </td>
        </tr>
        <%} %>
    </table>
    <input type="button" value="添加" onclick="window.location.href='addInfo.jsp'" />
</body>
</html>