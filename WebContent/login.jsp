<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="" id="myform">
			
				用户名<input type="text" name="username" value="">
				密码<input type="password" name="password" value="">
		</form>
		<button type="button" onclick="login()" >登录</button>
		<a href="tiaozhuan.do">跳转</a>
	<div id="content"></div>
	</div>
</body>
<script type="text/javascript">
	function login() {
		$.ajax({
				type:"post",
				url:"login.do",
				data:{"username":$("[name='username']").val(),
							"password":$("[name='password']").val(),
							"_method":"put"},
			//	dataType:"json",//指的是返回的data类型
			async:true,//默认是true,异步，不管服务器有没有返回信息，还会执行fun()方法，如果是false同步，如果服务器没有响应信息，则不会执行fun()
				success:function(data){
					alert(data)
					$("#content").html(data)
					
				},
			/* error:function(XMLHttpRequest, textStatus, errorThrown){
				 alert(XMLHttpRequest.status);
                alert(XMLHttpRequest.readyState);
                 alert(textStatus); 
			} */
		},
		fun())
		function fun(){
			alert("这是异步执行")
		}
		
	}


</script>
</html>