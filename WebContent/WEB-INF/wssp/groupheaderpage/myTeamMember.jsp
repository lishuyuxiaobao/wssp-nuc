<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<title>组员</title>
		<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />

		<link href="${pageContext.request.contextPath }/static/css/bootstrap.min.css" rel="stylesheet" />
		<link href="${pageContext.request.contextPath }/static/css/fresh-bootstrap-table.css" rel="stylesheet" />

		<link href="${pageContext.request.contextPath }/static/css/font-awesome.min.css" rel="stylesheet">
		

	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-12">

					<div class="fresh-table">
						<div class="toolbar">
							<button class="btn btn-default">您有${fn:length(lWorktables) }位成员</button>
						</div>

						<table id="fresh-table" class="table">
							<thead>
								<tr>
									<th data-field="id">学号</th>
									<th data-field="name" data-sortable="true">姓名</th>
									<th data-field="department" data-sortable="true">院系</th>
									<th data-field="dorm" data-sortable="true">宿舍</th>
									<th data-field="phone" data-sortable="true">联系方式</th>
									<th data-field="actions">操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${lWorktables }" var="lwt">
								<tr>
									<td>${lwt.student.sid }</td>
									<td>${lwt.student.sname }</td>
									<td>${lwt.student.sdepartment }</td>
									<td>${lwt.student.sdorm }</td>
									<td>${lwt.student.phone }</td>
									<td>
										<a href="../svg.html">你好</a>
										<a href="../计算器.html">你很好</a>
										<a href="../svg.html">你好</a>
									</td>
								</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>


				</div>
			</div>
		</div>
	</body>
	
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
				//showExport: true,  //是否显示导出按钮
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
