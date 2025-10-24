package com.ssg.webmvc.todo;

import com.ssg.webmvc.todo.dto.TodoDTO;
import com.ssg.webmvc.todo.service.TodoService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="todoReadController" , urlPatterns = "/todo/read")
@Log4j2
public class TodoReadController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("/todo/read doGet()호출");
        
        Long tno = Long.parseLong(request.getParameter("tno"));
        TodoDTO dto = TodoService.INSTANCE.get(tno);

        request.setAttribute("dto", dto);
        request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request,response);
    }
}
