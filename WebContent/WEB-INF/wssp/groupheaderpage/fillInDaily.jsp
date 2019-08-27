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
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/style.css"/>
		
	</head>
	<body>
		<div class="table-responsive col-lg-10 bg-info col-lg-offset-1">
			<table class="table table-bordered">
				<thead>
					<th class="text-center">学号</th>
					<th class="text-center">姓名</th>
					<th class="text-center">日常</th>
					<th class="text-center">次数</th>
					<th class="text-center">评级</th>
					<th class="text-center">操作</th>
				</thead>
				<tbody class="text-center">
					<c:forEach items="${lWorktables }" var="lwt">
					<tr>
						<td style="vertical-align:middle !important;">${lwt.student.sid }</td>
						<td style="vertical-align:middle !important;">${lwt.student.sname }</td>
						<!-- 自动换行 -->
						<td style="word-break:break-all; word-wrap:break-all;">
							<c:choose>
								<c:when test="${fn:length(lwt.lbehaviors) == 0 }">无</c:when>
								<c:otherwise>
									<c:forEach items="${lwt.lbehaviors }" var="llb">
										<span>${llb.count }:</span>${llb.content }<br>
									</c:forEach>									
								</c:otherwise>
							</c:choose>					
						</td>
						<td style="vertical-align:middle !important;">${fn:length(lwt.lbehaviors) }</td>
						<c:choose>
							<c:when test="${fn:length(lwt.lbehaviors) >= 4 }">
								<td style="vertical-align:middle !important;">
									<c:forEach items="${lwt.lbehaviors }" var="llb">
										${llb.grade == "" ? "还未评级" : llb.grade}
									</c:forEach>
								</td>
							</c:when>
							<c:otherwise>
								<td style="vertical-align:middle !important;">
									暂不能评级
								</td>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${fn:length(lwt.lbehaviors) >= 4 }">
								<td style="vertical-align:middle !important;">
									<a class="btn btn-success fill-btn" href="##">										
										${llb.grade == "" ? "评级" : "已评级"}										
									</a>
								</td>
							</c:when>
							<c:otherwise>
								<td style="vertical-align:middle !important;">
									<a class="btn btn-success fill-btn" href="##">填写</a>
								</td>
							</c:otherwise>
						</c:choose>
						
					</tr>
					<tr style="display: none;" class="fill-form">
					    <c:choose>
					    	<c:when test="${fn:length(lwt.lbehaviors) >= 4 }">
					    		<form action="${pageContext.request.contextPath }/groupheader/insertBehaviorGrade.do" method="post">
						    		<input type="hidden" value="${lwt.student.sid }" name="sid">
						    		<input type="hidden" value="${fn:length(lwt.lbehaviors) }" name="count">						    
									<td class="fa-2x" colspan="3">该成员一个月的评分等级：</td>
									<td colspan="2">
										<select name="grade" class="form-control form-val">
										    <option value="">选择评级</option>
											<option value="表现为优秀">表现为优秀</option>
											<option value="表现为良好">表现为良好</option>
											<option value="表现为中等">表现为中等</option>
											<option value="表现为差等">表现为差等</option>
										</select>
									</td>
									<td>
									<input style="display: none;" class="btn btn-warning btn-sub" type="submit" value="提交" />
									<button class="btn btn-default bg-default btn-res" type="button">无法提交</button>
									<button class="btn btn-warning exit-btn" type="button">取消</button>
									</td>					
								</form>
					    	</c:when>
					    	<c:otherwise>
					    		<form action="${pageContext.request.contextPath }/groupheader/insertBehavior.do" method="post">
						    		<input type="hidden" value="${lwt.student.sid }" name="sid">
						    		<input type="hidden" value="${fn:length(lwt.lbehaviors) }" name="count">						    
									<td class="fa-2x" colspan="2">日常内容填写：</td>
									<td colspan="3">
										<input placeholder="内容限制在5-20位之间" class="form-control form-val" type="text" name="content" id="" value="" />
									</td>
									<td>
										<input style="display: none;" class="btn btn-warning btn-sub" type="submit" value="提交" />
										<button class="btn btn-default bg-default btn-res" type="button">无法提交</button>
										<button class="btn btn-warning exit-btn" type="button">取消</button>
									</td>					
								</form>
					    	</c:otherwise>
					    </c:choose>
						
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
