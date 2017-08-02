<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="entity.user"%>
<%@ page import="Dao.insetData" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
    String username;
    String password;
    username=request.getParameter("username");
    password=request.getParameter("password");
    user user1=new user();
    insetData insertuser=new insetData();
    if(username!=null){
    	
    	user1.setName(username);
        out.print("获取成功");
        
    }else
    {
    	
    	out.print("用户名不能为空");
    	    }
     if(password!=null){
    	 
    	 user1.setPassword(password);
    	 out.println("密码设置成功");
     }else{
    	 
    	 out.println("密码不能为空");
     }
     insertuser.insertData(user1);
%>
欢迎<%=username %>登录
</body>
</html>