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
		

		<title>组长界面</title>
	</head>
	<body>
		<header class="cd-header">
			<a title="勤工助学" href="#0" class="cd-logo"><img src="${pageContext.request.contextPath }/static/img/qingongzhuxue.png" alt="Logo"></a>
			<a href="#0" class="cd-3d-nav-trigger">
				菜单栏
				<span title="菜单"></span>
			</a>
			<a title="退出" href="${pageContext.request.contextPath }/target/student.do" class="cd-3d-nav-exit">退出</a>
		</header> <!-- .cd-header -->
		<main>
			<!-- <h1>3D Rotating Navigation</h1> -->
			<!-- all your content here -->
			<div id="wraper-con">
				<iframe src="${pageContext.request.contextPath }/${srcpage }" width="100%" height="600px" border="0"></iframe>
			</div>
			
		</main>

		<nav class="cd-3d-nav-container">
			<ul class="cd-3d-nav4">
				<li>
					<a href="${pageContext.request.contextPath }/groupheader/myTeamMember.do">我的组员</a>
				</li>

				<li>
					<a href="${pageContext.request.contextPath }/groupheader/fillInDaily.do">填写日常</a>
				</li>

				<li>
					<a href="${pageContext.request.contextPath }/groupheader/fillInSalary.do">发放工资</a>
				</li>

				<li>
					<a href="${pageContext.request.contextPath }/groupheader/fillInYourExperience.do">总结心得</a>
				</li>
			</ul> <!-- .cd-3d-nav -->

			<span class="cd-marker4 color-5"></span>
		</nav> <!-- .cd-3d-nav-container -->
		
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-2.1.1.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/main.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
		
	</body>
</html>
