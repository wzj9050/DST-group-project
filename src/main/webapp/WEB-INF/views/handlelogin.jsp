<%@page contentType="text/html; charset=gbk" import="cn.wmyskxz.springboot.pojo.User" %>
<%

    String username = request.getParameter("username");
    String pwd = request.getParameter("pwd");
    User u = new User(username, pwd);
    if ("admin".equals(username) && "123".equals(pwd)) {

        session.setAttribute("username", username);

        try {
            pageContext.forward("index.jsp");
        } catch (ServletException e) {
            e.printStackTrace();
        }

    } else {
        try {
            //È±ÉÙ±¨´íÒ³Ãæ
            pageContext.forward("login.jsp");
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
%>

