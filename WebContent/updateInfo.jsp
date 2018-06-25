<%@page import="entiy.Web"%>
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
<%
 int id =Integer.valueOf(request.getParameter("id"));
 WebDaoImpl wdi = new WebDaoImpl();
 Web web = wdi.getOnly(id);
%>
<form action="WebInfoServlet?op=updateInfo&id=<%=web.getId() %>" method="post">
  <table border="1">
      <tr>
        <td>编号</td>
        <td><%=web.getId() %></td>
      </tr>
      <tr>
        <td>名字</td>
        <td><input type="text" name="uname" value="<%=web.getName() %>" /></td>
      </tr>
      <tr>
        <td>生日</td>
        <td><input type="text" name="birthday" value="<%=web.getBirthday() %>" /></td>
      </tr>
      <tr>
        <td>性别</td>
        <td>
            <select  name="sex">
            <%
                if(web.getSex().equals("男")){%>
                    <option selected="selected">男</option>
                    <option>女</option>
                <% }else{ %>
                <option>男</option>
                <option selected="selected">女</option>
            <%} %>
             </select>
        </td>
      </tr>
      <tr>
        <td>职业</td>
        <td><input type="text" name="work" value="<%=web.getWork() %>" /></td>
      </tr>
      <tr>
        <td>住所</td>
        <td><input type="text" name="address" value="<%=web.getAddress() %>" /></td>
      </tr>
      <tr>
        <td>电话</td>
        <td><input type="text" name="phone" value="<%=web.getPhone() %>" /></td>
      </tr>     
    </table>
    <input type="submit" value="修改" />
    <input type="button" value="返回" onclick="window.location.href='WebInfo.jsp'" />
</form>  
</body>
</html>