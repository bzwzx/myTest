package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entiy.Web;
import impl.WebDaoImpl;

@WebServlet("/WebInfoServlet")
public class WebInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charest=utf-8");
		request.setCharacterEncoding("utf-8");
		String op = request.getParameter("op");	
		if(op.equals("check")) {
			doCheck(request,response);
		}else if(op.equals("addInfo")) {
			doAddInfo(request,response);
		}else if(op.equals("updateInfo")) {
			doUpdateInfo(request,response);
		}else if(op.equals("deleInfo")) {
			doDeleInfo(request,response);
		}
	}
	
	protected void doCheck(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charest=utf-8");
		request.setCharacterEncoding("utf-8");
		int id = Integer.valueOf(request.getParameter("id"));
	    WebDaoImpl wdi = new WebDaoImpl();
	    Web web = wdi.getOnly(id);
	    HttpSession session = request.getSession();	
	    session.setAttribute("web", web);
	    response.sendRedirect("detail.jsp");
	}
	
	protected void doAddInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charest=utf-8");
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("uname");
		Date birthday = Date.valueOf(request.getParameter("birthday"));
	    String sex = request.getParameter("sex");
	    String work = request.getParameter("work");
	    String address = request.getParameter("address");
	    String phone = request.getParameter("phone");
	    PrintWriter out = response.getWriter();
	    Web web = new Web(name,birthday,sex,work,address,phone);
	    WebDaoImpl wdi = new WebDaoImpl();
	    int num = wdi.addInfo(web);
	    if(num>0) {
	    	String a = URLEncoder.encode("Ìí¼Ó³É¹¦£¡", "UTF-8");
	    	out.print("<script>alert(decodeURIComponent('"+a+"') );location.href='WebInfo.jsp'</script>");
	    }else {
	    	String a = URLEncoder.encode("Ìí¼ÓÊ§°Ü£¡", "UTF-8");
	    	out.print("<script>alert(decodeURIComponent('"+a+"') );location.href='addInfo.jsp'</script>");
	    }
	}
	
	protected void doUpdateInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charest=utf-8");
		request.setCharacterEncoding("utf-8");
		int id = Integer.valueOf(request.getParameter("id"));
		String name = request.getParameter("uname");
		Date birthday = Date.valueOf(request.getParameter("birthday"));
	    String sex = request.getParameter("sex");
	    String work = request.getParameter("work");
	    String address = request.getParameter("address");
	    String phone = request.getParameter("phone");
	    PrintWriter out = response.getWriter();
	    Web web = new Web(name,birthday,sex,work,address,phone,id);
	    WebDaoImpl wdi = new WebDaoImpl();
	    int num = wdi.updateInfo(web);
	    if(num>0) {
	    	String a = URLEncoder.encode("ÐÞ¸Ä³É¹¦£¡", "UTF-8"); 
	    	out.print("<script>alert(decodeURIComponent('"+a+"') );location.href='WebInfo.jsp'</script>");
	    }else {
	    	String a = URLEncoder.encode("ÐÞ¸ÄÊ§°Ü£¡", "UTF-8");
	    	out.print("<script>alert(decodeURIComponent('"+a+"') );location.href='updateInfo.jsp'</script>");
	    }
	}
	protected void doDeleInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charest=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		int id = Integer.valueOf(request.getParameter("id"));
	    WebDaoImpl wdi = new WebDaoImpl();
	    int num = wdi.deleInfo(id);
	    if(num>0) {
	    	String a = URLEncoder.encode("É¾³ý³É¹¦£¡", "UTF-8");
	    	out.print("<script>alert(decodeURIComponent('"+a+"') );location.href='WebInfo.jsp'</script>");
	    }else {
	    	String a = URLEncoder.encode("É¾³ýÊ§°Ü£¡", "UTF-8");
	    	out.print("<script>alert(decodeURIComponent('"+a+"') );location.href='WebInfo.jsp'</script>");
	    }
	}
}
