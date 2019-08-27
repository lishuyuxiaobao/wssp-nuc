<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/img/hardworking.png">
		<title>关联最近区域</title>
		<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />

		<link href="${pageContext.request.contextPath }/static/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/style.css" />
		
		<style>
        .list{
            display: none;;
        }
        .list_first {
            display: block;
        }
    	</style>
	</head>
	<body>
		<div class="table-responsive bg-info">
			<table class="table table-bordered">

				<thead>
					<tr class="text-center">
						<td colspan="4"><button class="btn btn-success paid-btn" type="button">关联最近区域</button></td>
					</tr>
					<tr>
						<th class="text-center">宿舍编号</th>
						<th class="text-center">岗位类型编号</th>
						<th class="text-center">最近上岗区域编号</th>
						<th class="text-center">操作</th>
					</tr>
				</thead>
				<tbody class="text-center paid-wages">
					<tr>
						<form action="${pageContext.request.contextPath }/admin/addRelation.do" method="post">
							
							<td>
								<select name="dnumber">
									<c:forEach items="${list1}" var="list1">
									<option value="${list1.number}"><span>${list1.position } </span></option>
									</c:forEach>
<!-- 									<option value="1401"><span>文澜</span>1401</option>
									<option value="1402"><span>文澜</span>1402</option> -->
								</select>
							</td>
							<td>
								<select id="list6" name="bnumber">
									<option value="请选择岗位">请选择岗位</option>
									<c:forEach items="${list6}" var="list6">
									<!-- <c:if test="${list6.number==18}">selected</c:if> -->
										<option value="${list6.number}"  ><span>${list6.position } </span></option>
									</c:forEach>
									<!-- <option value="101101"><span>教学楼</span>101101</option>
									<option value="101102"><span>卫生队</span>101102</option> -->
								</select>
							</td>
							<td style="width: 500px;">
								
								<select class="list list_first">
								    <option>----请选择岗位----</option>
								</select>
								
								<!-- 教学楼 -->
								<select class="list" style="float: left; overflow-x: hidden;" multiple="multiple"  style="width: 30%;">
									<c:forEach items="${list3}" var="list3">
										<option value="${list3.number}"><span>${list3.position } </span></option>
									</c:forEach>
									<!-- <option value="101101"><span>区域一</span>1011201</option>
									<option value="101102"><span>区域一</span>1011202</option> -->
								</select>
								
								<!-- 保洁 -->
								<select class="list" style="float: left; overflow-x: hidden;" multiple="multiple"  style="width: 30%;">
									<c:forEach items="${list4}" var="list4">
										<option value="${list4.number}"><span>${list4.position }</span></option>
									</c:forEach>
									<!-- <option value="101101"><span>区域一</span>1011201</option>
									<option value="101102"><span>区域一</span>1011202</option> -->
								</select>
								
								<!-- 卫生 -->
								<select class="list" style="float: left; overflow-x: hidden;" multiple="multiple"  style="width: 30%;">
									<c:forEach items="${list2}" var="list2">
										<option value="${list2.number}"><span>${list2.position } </span></option>
									</c:forEach>
									<!-- <option value="101101"><span>区域一</span>1011201</option>
									<option value="101102"><span>区域一</span>1011202</option> -->
								</select>
								
								<!-- 龙山 -->
								<select class="list" style="float: left; overflow-x: hidden;" multiple="multiple"  style="width: 30%;">
									<c:forEach items="${list5}" var="list5">
										<option value="${list5.number}"><span>${list5.position } </span></option>
									</c:forEach>
									<!-- <option value="101101"><span>区域一</span>1011201</option>
									<option value="101102"><span>区域一</span>1011202</option> -->
								</select>
								
								<textarea style="margin-left: 10px; float: left; width: 60%;" name="test" class="form-control summary-con" cols="3" rows="4" id="area-input"></textarea>
							</td>
							<td>
								<input class="btn btn-success" type="submit" value="提交" />
							</td>
						</form>
					</tr>
						

					<!-- 判断是否为空 -->

					<tr class="text-center">
						<td colspan="4"><button class="btn btn-success paid-btn" type="button">已关联内容</button></td>
					</tr>
					<c:forEach items="${relationlist }" var="list">
						<tr>
							<td>${list.name }</td>
							<td>${list.name1  }</td>
							<td id="td-s" style="word-break:break-all; word-wrap:break-all;">
							<c:forEach items="${list.list }" var="s">
								${s } <br>
							</c:forEach>
							<td>
							<a class="btn btn-success fill-btn" href="##">修改</a>
							</td>
						</tr>
						<tr style="display: none;" class="fill-form">
							<form action="${pageContext.request.contextPath }/admin/updaterelation.do" method="post">
								<input type="hidden" name="id" value="${list.id}"/>
								<td class="fa-2x"><input  type="text" name="dnumber" value="${list.name }" /></td>
								<!-- oninput="value=value.replace(/[^\d]/g,'')" -->
								<td><input  type="text" name="bnumber" id="" value="${list.name1  }" /></td>
								<td><input type="text" name="relation" value="${list.relation }" /></td>
								<td>
									<input class="btn btn-warning btn-sub" type="submit" value="提交" />
									<button class="btn btn-warning exit-btn" type="button">取消</button>
								</td>
							</form>
						</tr>
					</c:forEach>
					<tr>
						<td>文澜1401</td>
						<td>教学楼101101</td>
						<td style="word-break:break-all; word-wrap:break-all;">区域一1011201,区域二1011202</td>
						<td>
							<a class="btn btn-success fill-btn" href="##">修改</a>
						</td>
					</tr>
					<tr style="display: none;" class="fill-form">
						<form>
							<td class="fa-2x"><input oninput="value=value.replace(/[^\d]/g,'')" type="text" name="" value="1401" /></td>
							<td><input oninput="value=value.replace(/[^\d]/g,'')" type="text" name="" id="" value="101101" /></td>
							<td><input type="text" name="" value="1011201,1011202" /></td>
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
