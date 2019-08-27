<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<title>登录</title>
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
        
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/style.css"/>
		<style type="text/css">
			html,body{
				width: 100%;
				height: 100%;
				background-color: #4b2294;
			}
			*{
				margin: 0;
				padding: 0;
			}			
		</style>
	</head>
	<body>
		<div class="box">
			<div id="asklz">
				
			</div>
			<div class="box-container">
				<div class="box-container-left">
					<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators">
							<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
							<li data-target="#carousel-example-generic" data-slide-to="1"></li>
							<li data-target="#carousel-example-generic" data-slide-to="2"></li>
						</ol>
					
						<!-- Wrapper for slides -->
						<div class="carousel-inner" role="listbox">
							<div class="item active">
								<img src="${pageContext.request.contextPath }/static/img/timg1.jpg" alt="...">
								<div class="carousel-caption">
									
								</div>
							</div>					
							<div class="item">
								<img src="${pageContext.request.contextPath }/static/img/timg2.jpg" alt="...">
								<div class="carousel-caption">
						
								</div>
							</div>
							<div class="item">
								<img src="${pageContext.request.contextPath }/static/img/timg3.jpg" alt="...">
								<div class="carousel-caption">
							
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="box-container-right">
					<div class="student-login-btn">
						<button type="button">Student Login</button>						
					</div>
					<div class="admin-login-btn">
						<button type="button">Admin Login</button>
					</div>
					
				</div>
			</div>
			<div class="box-login">
				<div class="student-logininterface">
					<span class="logininterface-exit"></span>
					<div class="logininterface-logo"></div>
					<div class="logininterface-mark">
						Student Login
					</div>
					<div class="logininterface-form">
						<form action="${pageContext.request.contextPath }/student/student.do" method="post">
							<div class="logininterface-form-user">
								<span><i></i></span><input type="text" placeholder="Id Card" name="sid" value="" />
							</div>
							<div class="logininterface-form-pass">
								<span><i></i></span><input type="password" placeholder="Password" name="spassword" value="" />
							</div>
							<div class="logininterface-form-veri">
								<span><i></i></span>
								<input id="Txtidcode" class="txtVerification" type="text" placeholder="Verification" name="" value="" />
							    <span id="idcode"></span>
							</div>
							<input id="btns" type="submit" value="Sign In"/>
						</form>
					</div>					
				</div>
				<div class="admin-logininterface">
					<span class="logininterface-exit"></span>
					<div class="logininterface-logo"></div>
					<div class="logininterface-mark">
						Admin Login
					</div>
					<div class="logininterface-form">
						<form action="${pageContext.request.contextPath }/target/admin.do" method="">
							<div class="logininterface-form-user">
								<span><i></i></span><input type="text" placeholder="Id Card" name="" value="" />
							</div>
							<div class="logininterface-form-pass">
								<span><i></i></span><input type="password" placeholder="Password" name="" value="" />
							</div>
							<div class="logininterface-form-veri">
								<span><i></i></span>
								<input id="Txtidcode1" class="txtVerification1" type="text" placeholder="Verification" name="" value="" />
								<span id="idcode1"></span>
							</div>
							<input type="submit" value="Sign In"/>
						</form>
					</div>		
				</div>
			</div>
			
		</div>		
	</body>
	<script src="${pageContext.request.contextPath }/static/js/typewriter.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="${pageContext.request.contextPath }/static/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/main.js"></script>
		
	<script type="text/javascript">
				var app = document.getElementById('asklz');
				var typewriter = new Typewriter(asklz, {
					loop: true
				});
				typewriter.typeString('一日之计在于晨，一年之计在于春！')
					.pauseFor(1500)
					.deleteAll()
					.typeString('每一次的上岗，都是自我成长！')
					.pauseFor(1500)
		            .deleteAll()
					.typeString('让优秀成为一种习惯！')
					.pauseFor(10000)
					.deleteAll()
					.start();
	</script>
</html>
