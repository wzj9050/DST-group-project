<%@ page contentType="text/html; charset=gbk" import="cn.wmyskxz.springboot.pojo.User" %>

<html>
<head>
    <title>login</title>
</head>
<body>
<!-- <p1>test!</p1> -->
<h2 align="center">Welcome! Honorific Guest!</h2>
<%--·������Ŀǰ��ѧ��bathPath�����ǻ�����Ӧ��--%>
<form name=loginForm action="${pageContext.request.contextPath}/handlelogin.jsp" method=post>
    <table align="center">
        <tr>
            <td>Username��</td>
            <td><input type=text name=username /></td>
        </tr>
        <tr>
            <td>Password��</td>
<%--            username �� ��/����reform��ʱ�򱻺ϵ�һ���ˣ�����޷�������¼--%>
            <td><input type=password name=pwd /></td>
        <tr/>
        <tr>
            <td colspan="2" ,align="center">
                <input type="submit" value="submit"/>
                <input type="reset" value="reset"/>
            </td>
        </tr>
    </table>

</form>

</body>
</html>
