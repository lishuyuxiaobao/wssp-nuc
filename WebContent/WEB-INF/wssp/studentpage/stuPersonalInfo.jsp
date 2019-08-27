<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/reset.css"> <!-- CSS reset -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/style.css"> <!-- Resource style -->
		
		
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/swiper.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/timeline-wrapper.css"/>
		
		<meta charset="utf-8">
		<title>个人中心</title>

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
			<div class="table-responsive col-lg-8 bg-info col-lg-offset-2">
				<table class="table table-bordered">
					<thead class="text-center">
						<tr><th colspan="7" class="text-center text-warning">个人信息</th></tr>
						<tr>
							<td>学号</td>
							<td>姓名</td>
							<td>院系</td>
							<td>宿舍</td>
							<td>银行卡号</td>
							<td>联系方式</td>
							<td>操作</td>
						</tr>
					</thead>
					<tbody class="text-center perinfo-res">						
						<tr>
							
							<td>${student.sid }</td>
							<td>${student.sname }</td>
							<td>${student.sdepartment }</td>
							<td>${student.sdorm }</td>
							<td>${student.bank }</td>
							<td>${student.phone }</td>
							<td><a href="##" class="btn btn-danger btn-simple btn-perinfo-sub">修改</a></td>						
							
						</tr>
					</tbody>
					<tbody style="display: none;"  class="text-center perinfo-upd">
						<form action="${pageContext.request.contextPath }/student/updateStudentInfo.do" method="post">
						<tr>
							<td>${student.sid }<input type="hidden" name="sid" value="${student.sid }" /></td>
							<td>${student.sname }</td>
							<td>${student.sdepartment }</td>
							<td>${student.sdorm }</td>
							<td><input style="width: 400px;" onkeyup="this.value=this.value.replace(/[^0-9-]+/,'');" type="text" name="bank" id="" value="${student.bank }" /></td>
							<td><input  type="text" name="phone" id="" value="${student.phone }" /></td>
							<td><input oninput="value=value.replace(/[^\d.]/g,'')" class="btn btn-warning" type="submit" value="提交"/><button class="btn btn-success btn-perinfo-res" type="button">取消</button></td>
						</tr>
						</form>
					</tbody>
				</table>
			</div>
			<div class="col-lg-8 bg-info col-lg-offset-2">


				<table class="table table-responsive table-bordered">	
					<tbody class="text-center is-left">
						<tr>
							<td colspan="2">当前岗位信息</td>
						</tr>
						<c:choose>
							<c:when test="${wt == 1 }">
								<tr>
									<td>状态</td>
									<td>暂未任职</td>
								</tr>
							</c:when>
							<c:otherwise>
								<tr>
									<td>状态</td>
									<td>任职中</td>
								</tr>
								<tr>
									<td>申请日期</td>
									<td>${wtable.time }</td>
								</tr>
								<tr>
									<td>岗位信息</td>
									<td>${bmark.position }<span>&nbsp;&nbsp;</span>${amark.position }</td>
								</tr>
								<tr>
									<td>组长信息</td>
									<td>学号：${studentn.sid }<span>&nbsp;&nbsp;</span>姓名：${studentn.sname }<span>&nbsp;&nbsp;</span>电话：${studentn.phone }</td>
								</tr>
								<tr>
									<td>表现内容</td>
									<td style="word-break:break-all; word-wrap:break-all;" class="">内容dddddddddddddddddddddddddddddddddddddddddddddddddddddd</td>
								</tr>
							</c:otherwise>
						</c:choose>
						
						<tr>
							<td colspan="2">
								<button id="timeline-open" style="width: 100%;font-size: 20px;" class="btn color-4" type="button">上岗记录</button>
							</td>
						</tr>
						
					</tbody>
				</table>
			</div>

		</main>
		<nav class="cd-3d-nav-container">
			<ul class="cd-3d-nav2">
				<li>
					<a href="${pageContext.request.contextPath }/student/stuMountGuard.do">报岗</a>
				</li>

				<li class="cd-selected">
					<a href="${pageContext.request.contextPath }/student/stuPersonalInfo.do">个人中心</a>
				</li>

			</ul> <!-- .cd-3d-nav -->

			<span class="cd-marker2 color-5"></span>
		</nav> <!-- .cd-3d-nav-container -->
		
		
		
			<!--timeline Swiper -->
		
		<div id="timeline-container" class="container">
			<div class="timeline-exit">
				
			</div>
		
			<div class="timeline">
				<div class="swiper-container">
					<div class="swiper-wrapper">
						
						<div class="swiper-slide" style="background-image: url(${pageContext.request.contextPath }/static/images/1.jpg);" data-count="第一次">
							<div class="swiper-slide-content"><span class="timeline-count">第一次上岗</span>
								<h4 class="timeline-title">教学楼服务队</h4>
								<p class="timeline-text">表现内容</p>
							</div>
						</div>
						
						<div class="swiper-slide" style="background-image: url(${pageContext.request.contextPath }/static/images/2.jpg);" data-count="第二次">
							<div class="swiper-slide-content"><span class="timeline-count">第二次上岗</span>
								<h4 class="timeline-title">校园卫生队</h4>
								<p class="timeline-text">表现内容</p>
							</div>
						</div>
						
					</div>
					<div class="swiper-button-prev"></div>
					<div class="swiper-button-next"></div>
					<div class="swiper-pagination"></div>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-2.1.1.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/main.js"></script>

		<script src="${pageContext.request.contextPath }/static/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
		
		<script src="${pageContext.request.contextPath }/static/js/swiper.min.js"></script>
		

		<script>
			var timelineSwiper = new Swiper('.timeline .swiper-container', {
				direction: 'vertical',
				loop: false,
				speed: 1600,
				mousewheelControl: true,
				pagination: '.swiper-pagination',
				paginationBulletRender: function(swiper, index, className) {
					var count = document.querySelectorAll('.swiper-slide')[index].getAttribute('data-count');
					return '<span class="' + className + '">' + count + '</span>';
				},
				paginationClickable: true,
				nextButton: '.swiper-button-next',
				prevButton: '.swiper-button-prev',
				breakpoints: {
					768: {
						direction: 'horizontal',
					}
				}
			});
		</script>
		
	</body>
</html>
