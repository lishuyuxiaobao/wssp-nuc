<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<title>院系限制人数</title>
		<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />

		<link href="${pageContext.request.contextPath }/static/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/style.css" />
		
	</head>
	<body>
		<div class="table-responsive bg-info">
			<table class="table table-bordered">

				<thead>
					<tr class="text-center">
						<td colspan="4"><button class="btn btn-success paid-btn" type="button">院系人数限制</button></td>
					</tr>
					<tr>
						<th class="text-center">院系编号</th>
						<th class="text-center">岗位类型编号</th>
						<th class="text-center">限制人数(每个类型编号对应一个数值，逗号隔开)</th>
						<th class="text-center">操作</th>
					</tr>
				</thead>
				<tbody class="text-center paid-wages">
					<tr>
						<form action="${pageContext.request.contextPath }/admin/addDlimit.do" method="post">
							<td>
								<select name="ynumber">
									<c:forEach items="${list8 }" var="list8">
										<option value="${list8.number }"><span>${list8.position }</span>${list8.number }</option>
									</c:forEach>
								</select>
							</td>
							<td style="word-break:break-all; word-wrap:break-all;">
								<c:forEach items="${list6 }" var="list6">
									<span>${list6.position }</span>${list6.number }<br />
								</c:forEach>
								<input type="hidden" name="" id="" value="" />
							</td>
							<td>
								<input type="text" name="arrcount" id="" value="" />
							</td>
							<td>
								<input class="btn btn-success" type="submit" value="提交" />
							</td>
						</form>
					</tr>
						

					<!-- 判断是否为空 -->

					<tr class="text-center">
						<td colspan="4"><button class="btn btn-success paid-btn" type="button">已设置内容</button></td>
					</tr>

					<c:forEach items="${dlimit }" var="dlimit">
						<tr>
							<td>
								<span>${dlimit.name }</span>${dlimit.ynumber }
							</td>
							<td>
								<span>${dlimit.arrbnumber }</span>
							</td>
							<td style="word-break:break-all; word-wrap:break-all;">${dlimit.arrcount }</td>
							<td>
								<a class="btn btn-success fill-btn" href="##">修改</a>
							</td>
						</tr>
					
					<tr style="display: none;" class="fill-form">
						<form action="${pageContext.request.contextPath }/admin/updateDlimit.do" method="post">
							<td class="fa-2x">
								<span>${dlimit.name }</span>
								<input type="hidden" name="name" id="" value="${dlimit.ynumber }" />
							</td>
							<td>
								<span>${dlimit.arrbnumber }</span>
								<input type="hidden" name="id" id="" value="${dlimit.id} " />
							</td>
							<td><input type="text" name="arrcount" value="${dlimit.arrcount }" /></td>
							<td>
								<input class="btn btn-warning btn-sub" type="submit" value="提交" />
								<button class="btn btn-warning exit-btn" type="button">取消</button>
							</td>
						</form>
					</tr>
					</c:forEach>

					<!-- 结束 -->

				</tbody>
			</table>
		</div>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/main.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
