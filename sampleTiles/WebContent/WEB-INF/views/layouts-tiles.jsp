<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- <!DOCTYPE html> 이거 지워야 레이아웃이 됨 -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 화면배치용 jsp -->

	<table  width="100%" height="100%" bordercolor="pink">

		<tr align="center">
		
			<!-- header -->
			
			<td height="10%" colspan="3"  style="background-color: #e1ffc2">
			
			<tiles:insertAttribute name="header" />
			
			</td>

		</tr>


		<tr>
		
			<!-- menu, main -->
			
			<td width="15%" align="left" valign="top">
			
			<tiles:insertAttribute name="menu" />
			
			</td>
			
			<td>
			<tiles:insertAttribute name="content" />
			</td>
			
			<td width="15%" align="center">
			<tiles:insertAttribute name="banner" />
			</td>
			

		</tr>


		<tr align="center">
		
			<!-- footer -->
			
			<td height="10%" colspan="3">
			
			<tiles:insertAttribute name="footer" />
			
			</td>
		</tr>
		
		
	</table>

</body>
</html>






















