package com.kozka.hospitaldepartmentservlet.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kozka Ivan
 */
@WebServlet(name = "assignmentsServlet", value = "/assignments")
public class Assignments extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("assignments.jsp").forward(req, resp);
    }
}
