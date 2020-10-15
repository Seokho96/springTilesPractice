<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

  <c:if test="${not empty login }">  <!-- login이 되었을때 -->
  ${login.id }님 안녕하세요 
  <table border="1" bgcolor="#d2f6c5">
  <col width="200">
  <tr>
       <td>
          <a href="bbslist.com" style="text-decoration: none">글 목록</a>
       </td>
  </tr>
  <tr>
      <td>
          <a href="bbsWrite.com" style="text-decoration: none">글 추가</a>
      </td>
  </tr>
  <tr>
        <td>
          <a href="logout.com" style="text-decoration: none">로그아웃</a>
      </td>
      
  
  </tr>
  </table>     
  
  </c:if>
  
  <c:if test="${empty login }">    <!-- login이 되지 않았을 때 -->
 <div align="center"> <h1>로그인</h1></div>
  <form action="loginAf.com" method="post">
  <div align="center">
   <table>
      <tr>
          <td>
             <input type="text" name="id" size="20" placeholder="아이디">
          </td>
      </tr>
      <tr>
        
          <td>
             <input type="text" name="pwd" size="20" placeholder="비밀번호">
          </td>
      </tr>
      <tr>
      <td  align="center">
          <input type="submit" value="로그인">
      </td>
      </tr>
   </table>
  </div>
  </form>   
  <div align="center">
  <a href="regi.com">회원가입</a>
  </div>
  </c:if>