package com.ssg.webmvc.calc;
//PRG패턴 (POST-Redirect-GET)
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "inputController", urlPatterns = "/calc/input")
public class InputController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("InputController 요청된 doGet()");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/input.jsp");

        //서블리셍서 전달된 요청을 다른 쪽으로 전달 또는 배포하는 역할 객체
        dispatcher.forward(req, resp);
    }
}