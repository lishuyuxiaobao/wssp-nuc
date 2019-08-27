<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<title>代号编号指定</title>
		<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />

		<link href="${pageContext.request.contextPath }/static/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/style.css" />
		
	</head>
	<body>
		<div class="table-responsive col-lg-10 bg-info col-lg-offset-1">
			<table class="table table-bordered">

				<thead>
					<tr class="text-center">
						<td colspan="4"><button class="btn btn-success paid-btn" type="button">代号区域划分</button></td>
					</tr>
					<tr>
						<th class="text-center">代号</th>
						<th class="text-center">区域</th>
						<th class="text-center">编号</th>
						<th class="text-center">操作</th>
					</tr>
				</thead>
				<tbody class="text-center paid-wages">
					<tr>
						<form action="${pageContext.request.contextPath }/admin/addMark.do" method="post">
							<td><input style="width: 80px;" oninput="value=value.replace(/[^\d]/g,'')" class="val-upd" type="text" name="mark"/></td>
							<td><input class="val-upd" type="text" name="position" /></td>
							<td><input style="width: 120px;" oninput="value=value.replace(/[^\d]/g,'')" class="val-upd" type="text" name="number" /></td>
							<td>
								<input class="btn btn-success" type="submit" value="提交" />
							</td>
						</form>
					</tr>
					
					<!-- 判断是否为空 -->
					<c:if test="${empty markList1}"> 内容为空</c:if>
					<tr class="text-center">
						<td colspan="4"><button class="btn btn-success paid-btn" type="button">已划分内容</button></td>
					</tr>
					<!-- <tr>
						<td>1</td>
						<td>软件学院</td>
						<td>1011014</td>
						<td>
							<a class="btn btn-success fill-btn" href="##">修改</a>
						</td>
					</tr> -->
					<c:forEach items="${markList }" var="list">
						<tr>
							<td>${list.mark }</td>
							<td>${list.position  }</td>
							<td>${list.number }</td>
							<td>
								<a class="btn btn-success fill-btn" href="##">删除</a>
							</td>
						</tr>
					</c:forEach>
					<tr style="display: none;" class="fill-form">
						<form>
							<td class="fa-2x"><input oninput="value=value.replace(/[^\d]/g,'')" style="width: 80px;" type="text" name="" value="1" /></td>
							<td><input type="text" name="" id="" value="软件学院" /></td>
							<td><input oninput="value=value.replace(/[^\d]/g,'')" style="width: 120px;" type="text" name="" value="1011014" /></td>
							<td>
								<input class="btn btn-warning btn-sub" type="submit" value="提交" />
								<button class="btn btn-warning exit-btn" type="button">取消</button>
							</td>
						</form>
					</tr>
					
					<!-- 结束 -->
					
				</tbody>
			</table>
		</div>
		
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/main.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
