<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


     <form action="bbsDelete.com" method="post" id="frm">
       <input type="hidden" value="${bbsDetail.seq }" name="seq">
     </form>
    <div align="center">
    <table border="1">
    <col width="100"><col width="600">
    <tr>
      <th>작성자</th><td>${bbsDetail.id }</td>
    </tr>
    <tr>
      <th>제목</th><td>${bbsDetail.title }</td>
    </tr>
    <tr>
      <th>내용</th><td><textarea rows="10" cols="100" readonly="readonly">${bbsDetail.content }</textarea></td> 
    </tr>
    </table>
    <button type="button" onclick="updateView(${bbsDetail.seq})">글 수정</button>
    <button type="button" onclick="deleteBbs(${bbsDetail.seq})">글 삭제</button>
    </div>
    
    <script>
    function updateView(seq){
                 
          if("${login.id}" != "${bbsDetail.id}"){
                    alert("권한이 없습니다");
              }   
          else{

                 location.href = "bbsUpdate.com?seq="+seq;
              }
    }

    function deleteBbs(seq){
        
        if("${login.id}" != "${bbsDetail.id}"){
                  alert("권한이 없습니다");
            }   
        else{

               document.getElementById("frm").submit();
            }
  }


    </script>