package com.pack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/Mvcconceptsstudent")
public class Mvcconceptsstudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<St6udent> st=Studentsdata.std();
        req.setAttribute("st6",st);
        RequestDispatcher dis=req.getRequestDispatcher("/show.jsp");
        dis.forward(req,resp);
    }
}
