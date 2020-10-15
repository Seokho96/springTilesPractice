<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   
   
   <form action="bbsWrite.com" method="post" id="frm"> 
    <div align="center">
    <table border="1">
    <col width="100"><col width="600">
      <tr>
        <th>작성자</th><td><input type="text" value="${login.id }" name="id" readonly="readonly" size="97"> </td>
      </tr>
      <tr>
         <th>제목</th><td><input type="text" name="title" size="97" id="title"></td>
      </tr>
       <tr>
         <th>내용</th><td><textarea rows="10" cols="100" name="content" id="content"></textarea></td>
       </tr>
    </table>
    <br>
      <button type="button" id="btn">글작성</button>
    </div>
    </form>
    
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
     <script>
          $("#btn").click(function() {
                    let btitle = $("#title").val();
                    let bcontent = $("#content").val();

                   
                    if(bcontent == "" || btitle == ""){
                            alert("모두 입력해주세요");
                        }
                    else{
                    	 let result = confirm("글을 등록하시겠습니까?");
                         if(result){
                       
                        $.ajax({
                            url:"bbsWrite.com",
                            type:"post",
                            data: {id: '${login.id }',title: btitle, content: bcontent},
                            dataType:"json",
                            success:function(data){
                                
                                if(data.a = "yes"){
                                    alert("글이 성공적으로 등록되었습니다");
                                    location.href="bbslist.com";
                                    }else{
                                    alert("글 등록에 실패했습니다");
                                        }
                                    },
                                error:function(){
                                    alert("error");

                                    }                             
                            })
                         

                        }
                         else{

                         }
                    }
          	
          });
          </script>
   