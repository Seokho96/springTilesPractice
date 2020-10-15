
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <div align="center"  style="overflow:scroll; height:450px; overflow-x: hidden">
     <table border="1">
       <col width="70"><col width="600"><col width="150"><col width="150">
       <tr>
       <th>번호</th><th>제목</th><th>작성일</th><th>작성자</th>
       </tr>
       
       <c:if test="${empty list }">
       <tr>
        <td colspan="4">작성된 글이 없습니다</td> 
       </tr>
       </c:if>
       
       <c:forEach items="${list }" var="bbs" varStatus="vs">
          <tr>
          <th>${vs.count }</th>
          
          <%-- <td class="seqclick" seq=${bbs.seq }> --%>
          <td>
         <a href="bbsDetail.com?seq=${bbs.seq }" style="text-decoration: none; color: black"> ${bbs.title }</a>     
          </td>
          
          <td>${bbs.wdate }</td>
          
          <td>${bbs.id }</td>
          </tr>
       
       </c:forEach>
     </table>
     <br>
     <form id="frm">
<div align="center">
<select name="s_category" >
<option value="all" selected="selected" >전체</option>
<option value="w_id">작성자</option>
<option value="title">제목</option>
<option value="content">내용</option>
</select>
<input type="text" name="keyword" placeholder="검색" >
<button type="button" id="btn" onclick="Search()">검색</button>
</div>
</form>

 <a href="bbsWrite.com" style="text-decoration: none">글쓰기</a>

    </div>


<script>
function Search(){
    
    let frm = document.getElementById("frm");
    frm.setAttribute("action", "bbslist.com");
    frm.submit();

}


</script>















