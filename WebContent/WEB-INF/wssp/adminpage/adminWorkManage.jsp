<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>岗位管理</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/reset.css"> <!-- CSS reset -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/style.css"> <!-- Resource style -->
		
	</head>
	<body>
		<header class="cd-header">
			<a title="勤工助学" href="#0" class="cd-logo"><img src="${pageContext.request.contextPath }/static/img/qingongzhuxue.png" alt="Logo"></a>
			<a href="#0" class="cd-3d-nav-trigger">
				菜单栏
				<span title="菜单"></span>
			</a>
			<a title="退出" href="${pageContext.request.contextPath }/target/admin.do" class="cd-3d-nav-exit">退出</a>
		</header> <!-- .cd-header -->
		<main>
		<div class="wrapper-asid">		
			
			<section id="sidebar" class="sidebar">
				<div class="toolbar-asid">
					<div id="open-sb" class="menu-button-asid"></div>
				</div>
				<nav>
					<h6>岗位管理</h6>
					<hr >	
					<ul>
						<li>
							<a target="workmanage" href="${pageContext.request.contextPath }/admin/adminFillInMark.do">代号区域划分</a>
							<i class="font-light"></i>
						</li>
						<li class="ligif"><img src="${pageContext.request.contextPath }/static/img/downarrow.gif" ></li>
						<li>
							<a target="workmanage" href="${pageContext.request.contextPath }/admin/adminFillInRelation.do">关联最近区域</a>
							<i class="font-light"></i>
						</li>
						<li class="ligif"><img src="${pageContext.request.contextPath }/static/img/downarrow.gif" ></li>
						<li>
							<a target="workmanage" href="${pageContext.request.contextPath }/admin/adminFillInGroupheader.do">分配区域组长</a>
							<i class="font-light"></i>
						</li>
						<li class="ligif"><img src="${pageContext.request.contextPath }/static/img/downarrow.gif" ></li>
						<li>
							<a target="workmanage" href="${pageContext.request.contextPath }/admin/adminFillInDlimit.do">院系人数限制</a>
							<i class="ligif"><img src="${pageContext.request.contextPath }/static/img/downarrow.gif" ></i>
						</li>
						<li>
							<a target="workmanage" href="${pageContext.request.contextPath }/adminFillInDlimit.do">自动分配</a>
							<i class="font-light"></i>
						</li>
					</ul>
				</nav>
				<div class="wrapper-content">
					<iframe id="wrapper-content" name="workmanage" width="100%" height="100%" scrolling="auto" ></iframe>
				</div>
			</section>
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
		<script src="${pageContext.request.contextPath }/static/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
