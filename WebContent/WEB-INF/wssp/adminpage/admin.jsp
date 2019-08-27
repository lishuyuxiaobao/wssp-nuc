<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/reset.css"> <!-- CSS reset -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/style.css"> <!-- Resource style -->
		
		


		<title>管理员界面</title>
	</head>
	<body>
		<header class="cd-header">
			<a title="勤工助学" href="#0" class="cd-logo"><img src="${pageContext.request.contextPath }/static/img/qingongzhuxue.png" alt="Logo"></a>
			<a href="#0" class="cd-3d-nav-trigger">
				菜单栏
				<span title="菜单"></span>
			</a>
			<a title="退出" href="${pageContext.request.contextPath }/target/login.do" class="cd-3d-nav-exit">退出</a>
		</header> <!-- .cd-header -->
		<main>
			<!-- <h1>3D Rotating Navigation</h1> -->
			<!-- all your content here -->

			<div id="wraper">

				<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
						<li data-target="#carousel-example-generic" data-slide-to="1"></li>
						<li data-target="#carousel-example-generic" data-slide-to="2"></li>
						<li data-target="#carousel-example-generic" data-slide-to="3"></li>
					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner" role="listbox">
						<div class="item active">
							<img src="${pageContext.request.contextPath }/static/img/jiaoxuelou.png" alt="...">
							<div class="carousel-caption">
								<h3 style="color: #000000;">教学楼风采</h3> 
							</div>
						</div>


						<div class="item">
							<img src="${pageContext.request.contextPath }/static/img/longshan.jpg" alt="...">
							<div class="carousel-caption">
								<h3 style="color: #000000;">龙山风采</h3>
							</div>
						</div>
						<div class="item">
							<img src="${pageContext.request.contextPath }/static/img/baojie.png" alt="...">
							<div class="carousel-caption">
								<h3 style="color: #000000;">保洁风采</h3>
							</div>
						</div>
						<div class="item">
							<img src="${pageContext.request.contextPath }/static/img/weisheng.png" alt="...">
							<div class="carousel-caption">
								<h3 style="color: #000000;">卫生风采</h3>
							</div>
						</div>
					</div>

					<!-- Controls -->
					<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
						<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Pre</span>
					</a>
					<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
						<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>

			</div>

		</main>

		<nav class="cd-3d-nav-container">
			<ul class="cd-3d-nav5">
				<li>
					<a href="${pageContext.request.contextPath }/admin/adminWorkManage.do">岗位管理</a>
				</li>

				<li>
					<a href="${pageContext.request.contextPath }/admin/adminWorkForm.do">查看报岗</a>
				</li>

				<li>
					<a href="${pageContext.request.contextPath }/admin/adminSalaryForm.do">查看工资</a>
				</li>

				<li>
					<a href="${pageContext.request.contextPath }/admin/adminBehaviorForm.do">成员表现</a>
				</li>
				<li>
					<a href="#0">队长管理</a>
				</li>
			</ul> <!-- .cd-3d-nav -->

			<span class="cd-marker5 color-5"></span>
		</nav> <!-- .cd-3d-nav-container -->
 		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-2.1.1.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/main.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>

		<script>
			$('.carousel').carousel({
				interval: 2000
			})
		</script>
	</body>
</html>
