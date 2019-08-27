<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<div style="border-radius: 20px;" class="table-responsive col-lg-6 bg-info col-lg-offset-3">
				<table class="table">
					<tr><th class="text-center color-3">月末总结</th></tr>
					<tr><td>要求：</td></tr>
					<tr><td>1.要有自己的感想</td></tr>
					<tr><td>2.组员的整体表现</td></tr>
					<tr><td>3.可以说说建议</td></tr>
					<tr><td>4.字数不少于100字</td></tr>
					<c:if test="${experience.sid == gid }">
						<tr><td class="color-1">本月心得已经提交，不能重复提交，可修改</td></tr>
					</c:if>
				</table>
				
				<c:choose>
				<c:when test="${experience.sid == gid }">
					<form class="form-horizontal" action="${pageContext.request.contextPath }/groupheader/updateExperienceSid.do">
				    <textarea style="text-indent: 2em;" name="experience" class="form-control summary-con" rows="8">${experience.experience }</textarea>
					<input style="display: none;" class="btn btn-success btn-lg btn-summary-sub" type="submit" value="提交"/>
					<button class="btn bg-default btn-lg btn-summary-res" type="button">修改后进行提交</button> &nbsp
				</c:when>
				<c:otherwise>
					<form class="form-horizontal" action="${pageContext.request.contextPath }/groupheader/insertExperience.do">
					<textarea style="text-indent: 2em;" name="experience" class="form-control summary-con" rows="8"></textarea>
					<input style="display: none;" class="btn btn-success btn-lg btn-summary-sub" type="submit" value="提交"/>
					<button class="btn bg-default btn-lg btn-summary-res" type="button">字数不够，无法提交</button> &nbsp
					<button style="display: none;"  class="btn btn-info summary-con-count" type="button"></button>
				</c:otherwise>
				</c:choose>
					
				
			
			
			</form>
		</div>
		
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/main.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
