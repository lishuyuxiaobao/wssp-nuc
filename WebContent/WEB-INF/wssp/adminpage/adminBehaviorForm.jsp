<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8" />
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<title>日常信息</title>
		<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
		<link href="${pageContext.request.contextPath }/static/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/reset.css"> <!-- CSS reset -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/static/css/style.css"> <!-- Resource style -->
		

		<link href="${pageContext.request.contextPath }/static/css/fresh-bootstrap-table.css" rel="stylesheet" />
		<link href="${pageContext.request.contextPath }/static/css/font-awesome.min.css" rel="stylesheet">

		

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

			<div class="wrapper">
				<div class="container">
					<div class="row">
						<div class="col-md-12">

							<div class="fresh-table">
							

								<table id="fresh-table" class="table">
									<thead>
										<th data-field="id">学号</th>
										<th data-field="name" data-sortable="true">姓名</th>
										<th data-field="department" data-sortable="true">院系</th>
										<th data-field="area" data-sortable="true">区域</th>
										<th data-field="performance" data-sortable="true">表现</th>
										<th data-field="phone" data-sortable="true">联系方式</th>
										<th data-field="actions">Actions</th>
									</thead>
									<tbody>
										<c:forEach items="${lWorktables }" var="lw">
											<tr>
												<td>${lw.sid }</td>
												<td>${lw.student.sname }</td>
												<td>${lw.student.sdepartment }</td>
												<td>${lw.area }</td>
												<td>
													<c:forEach items="${lw.lbehaviors }" var="lwb">
														${lwb.count }:${lwb.content }△
													</c:forEach>
												</td>
												<td>${lw.student.phone }</td>
												<td>操作</td>
											</tr>										
										</c:forEach>
									</tbody>
								</table>
							</div>


						</div>
					</div>
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
				
				<li class="cd-selected">
					<a href="${pageContext.request.contextPath }/admin/adminBehaviorForm.do">成员表现</a>
				</li>
				<li>
					<a href="#0">队长管理</a>
				</li>
			</ul> <!-- .cd-3d-nav -->

			<span class="cd-marker5 color-5"></span>
		</nav> <!-- .cd-3d-nav-container -->
	</body>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-2.1.1.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/main.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap-table.js"></script>


	<script type="text/javascript">
		var $table = $('#fresh-table'),
			$alertBtn = $('#alertBtn'),
			full_screen = false;

		$().ready(function() {
			$table.bootstrapTable({
				toolbar: ".toolbar",
				showRefresh: false,
				search: true,
				showToggle: true,
				showColumns: true,
				pagination: true,
				striped: true,
				pageSize: 8,
				pageList: [8, 10, 25],

				formatShowingRows: function(pageFrom, pageTo, totalRows) {
					//do nothing here, we don't want to show the text "showing x of y from..." 
				},
				formatRecordsPerPage: function(pageNumber) {
					return pageNumber + " rows visible";
				},
				icons: {
					refresh: 'fa fa-refresh',
					toggle: 'fa fa-th-list',
					columns: 'fa fa-columns',
					detailOpen: 'fa fa-plus-circle',
					detailClose: 'fa fa-minus-circle'
				}
			});
		});
	</script>

</html>
