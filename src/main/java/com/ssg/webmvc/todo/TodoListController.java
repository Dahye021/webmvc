package com.ssg.webmvc.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/list doGet() 호출");

        //리스트jsp로 이동 -> 포워드로 요청을 받아 처리 / 레지스터에서 구현한거랑 같은 내용 글만 다름
        req.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(req,resp);
    }
}
