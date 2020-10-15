<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>회원가입</h2>
<p>환영합니다</p>

<div align="center">
   <form action="regiAf.com" method="post">
      <table>
         <tr>
            <td>아이디</td>
            <td>
              <input type="text" name="id" placeholder="아이디" size="20">
              <p id="idcheck" style="font-size: 8px"></p>
              <input type="button" id="btn" value="id확인">
            </td>
         </tr>
         <tr>
            <td>비밀번호</td>
            <td>
              <input type="text" name="pwd" placeholder="비밀번호" size="20"> 
            </td>
         </tr>
         <tr>
            <td>이름</td>
            <td>
              <input type="text" name="name" placeholder="이름" size="20"> 
            </td>
         </tr>
         <tr>
            <td>이메일</td>
            <td>
              <input type="text" name="email" placeholder="이메일" size="20"> 
            </td>
         </tr>
          <tr>
              <td colspan="2" align="center">
                 <input type="submit" value="회원가입">
              </td>
          </tr>
      
      </table>
   
   </form>
   

</div>



