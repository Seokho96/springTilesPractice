<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


   <form id="frm" action="bbsUpdate.com" method="post">
   <input type="hidden" value="${bbsDetail.seq }" name="seq">
    <div align="center">
    <table border="1">
    <col width="100"><col width="600">
    <tr>
      <th>작성자</th><td><input type="text" value="${bbsDetail.id }" size="97"> </td>
    </tr>
    <tr>
      <th>제목</th><td><input type="text" value="${bbsDetail.title }" name="title" size="97"> </td>
    </tr>
    <tr>
      <th>내용</th><td><textarea rows="10" cols="100" name="content">${bbsDetail.content }</textarea></td> 
    </tr>
    </table>
    <button type="submit" id="btn">수정완료</button>
    </div>
    </form>