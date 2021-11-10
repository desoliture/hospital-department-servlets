package com.kozka.hospitaldepartmentservlet.servlets;

import com.kozka.hospitaldepartmentservlet.dao.UserDAO;
import com.kozka.hospitaldepartmentservlet.entities.UserRole;
import com.kozka.hospitaldepartmentservlet.services.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Patients", value = "/patients")
public class Patients extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute(
                "patients",
                UserService.getAllActivePatients()
        );

        req.getRequestDispatcher("patients.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
