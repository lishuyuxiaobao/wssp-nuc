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
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/style.css" />
		
	</head>
	<body>
		<div class="table-responsive col-lg-10 bg-info col-lg-offset-1">
			<table class="table table-bordered">

				<thead>
					<tr class="text-center">
						<td colspan="4"><button class="btn btn-success paid-btn" type="button">未发报酬</button></td>
						<td><button class="btn btn-warning unpaid-btn" type="button">已发报酬</button></td>
					</tr>
					<tr>
						<th class="text-center">学号</th>
						<th class="text-center">姓名</th>
						<th class="text-center">等级</th>
						<th class="text-center">报酬(请输入数字)</th>
						<th class="text-center">操作</th>
					</tr>
				</thead>
				<tbody class="text-center paid-wages">
				<c:if test="${fn:length(lWorktables) eq 0 and fn:length(lSalaries) gt 0 }">
						<tr><td colspan="5">工资已发完！</td></tr>
					</c:if>
					<c:forEach items="${lWorktables }" var="lwt">	
					<tr>
						<form action="${pageContext.request.contextPath }/groupheader/insertSalary.do" method="post">
							<input type="hidden" value="${lwt.student.sid }" name="sid" />
							<td>${lwt.student.sid }</td>
							<td>${lwt.student.sname }</td>	
							<td>
								<c:if test="${lwt.student.grade == 1 }">
									<c:forEach items="${lwt.lbehaviors }" var="llb">
										${llb.grade }
									</c:forEach>
									
								</c:if>
								<c:if test="${lwt.student.grade == 0 }">
									还未评级								
								</c:if>							
									
							</td>
							<td>
								<c:if test="${lwt.student.grade == 1 }">
									<input oninput="value=value.replace(/[^\d.]/g,'')" style="width: 80px;" type="text" name="reward" id="" value="" />
									<label>元</label>
								</c:if>
								<c:if test="${lwt.student.grade == 0 }">
									请先评级	
								</c:if>						
							</td>												
							<td>
								<c:if test="${lwt.student.grade == 1 }">
									<input class="btn btn-success" type="submit" value="提交" />
								</c:if>
								<c:if test="${lwt.student.grade == 0 }">
									<a class="btn btn-warning" href="${pageContext.request.contextPath }/groupheader/fillInDailyPage.do">去评级</a>	
								</c:if>	
								
							</td>
						</form>
					</tr>
					
					</c:forEach>
				</tbody>
				<tbody style="display: none;" class="text-center unpaid-wages">
					<c:forEach items="${lSalaries }" var="lsl">
					<tr>
						<form action="${pageContext.request.contextPath }/groupheader/updateSalarySid.do" method="post">
						    <input type="hidden" value="${lsl.sid }" name="sid" />
							<td>${lsl.sid }</td>
							<td>${lsl.sname }</td>
							<td>${lsl.grade }</td>
							<td>
								<label>已发金额：</label>
								<input style="width: 80px;" disabled="disabled" class="val-pai" type="text" value="${lsl.reward }" />
								<label class="color-2">元</label>
								--->
								<label>修改金额：</label>
								<input style="width: 80px;" oninput="value=value.replace(/[^\d.]/g,'')" class="val-upd" type="text" name="reward" id="" value="" />
								<label>元</label>
							</td>
							<td>
								<input style="display: none;" class="btn btn-warning btn-upd-war" type="submit" value="修改" />
								<button class="btn bg-default btn-upd-res" type="button">无法修改</button>
							</td>
						</form>
					</tr>
										
					</c:forEach>
					


				</tbody>
			</table>
		</div>
		
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/main.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
