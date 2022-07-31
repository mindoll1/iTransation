package com.javassem.exeception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("com.javassem")
public class ProjectException {
   
   @ExceptionHandler(Exception.class)
   // 추후에 구체적인 예외 클래스로 구분
   // 예 : 계시판 : BoardException
   public String handleException(Exception e, Model m) {
      m.addAttribute("error", e);
      m.addAttribute("message", "통합 회원 가입에 실패했습니다.");
      return  "error/TransErrorPage";
   }

}