<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/reset.css"> <!-- CSS reset -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/style.css"> <!-- Resource style -->
				
		<meta charset="utf-8">
		<title>报岗</title>

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
			<div class="table-responsive col-lg-10 col-lg-offset-1 bg-info" >
				<table class="table table-hover">
					<thead>
						<tr class="bg-primary strong">
							<th class="text-center">编号</th>
							<th class="text-center">岗位</th>
							<th class="text-center">人数</th>
							<th class="text-center">操作</th>
						</tr>
					</thead>
					<tbody class="success text-center">
					<c:if test="${not empty wtable.bnumber }">
						<tr>
							<td class="color-4" colspan="4">已经报名成功，详细信息在个人中心查看！</td>
						</tr>
					</c:if>
					
					<c:forEach items="${marks}" var="m">
						
						<c:choose>
							<c:when test="${empty wtable.bnumber }">
							
							<tr>
								<td>${m.number}</td>
								<td>${m.position}</td>
								<td>
									${fn:length(m.lwList) }	
									<span>/</span>
									${m.count}
								</td>	
								<td>	
								<c:choose>
							    	<c:when test="${fn:length(m.lwList) < m.count }">
							    		<a href="${pageContext.request.contextPath }/student/insertWorktable.do?dnumber=${student.dnumber}&&bnumber=${m.number}" class="btn btn-primary btn-lg">我要报名</a>
							   		</c:when>
							    	<c:otherwise>
							    		<a class="btn btn-lg bg-default">无法报名</a>
							   	 </c:otherwise>
								</c:choose>	
								</td>								
							</tr>
							</c:when>
							<c:otherwise>
								<tr>
								<td>${m.number}</td>
								<td>${m.position}</td>
								<td>
									${fn:length(m.lwList) }
									<span>/</span>
									${m.count}
								</td>	
								<c:choose>
							    	<c:when test="${m.number == wtable.bnumber }">
							    		<td><a class="btn btn-primary btn-lg">已报名</a></td>
							   		</c:when>
							    	<c:otherwise>
							    		<td><a class="btn btn-lg bg-default">无法报名</a></td>
							   	 </c:otherwise>
								</c:choose>																							
							</tr>
							</c:otherwise>
						</c:choose>															
					</c:forEach>
						
					</tbody>
				</table>
			</div>
		
		</main>
		<nav class="cd-3d-nav-container">
			<ul class="cd-3d-nav2">
				<li class="cd-selected">
					<a href="${pageContext.request.contextPath }/student/stuMountGuard.do">报岗</a>
				</li>

				<li>
					<a href="${pageContext.request.contextPath }/student/stuPersonalInfo.do">个人中心</a>
				</li>

			</ul> <!-- .cd-3d-nav -->

			<span class="cd-marker2 color-5"></span>
		</nav> <!-- .cd-3d-nav-container -->
		
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-2.1.1.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/main.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
	</body>
</html>
