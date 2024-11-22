package com.xworkz.servlet;

import com.xworkz.dto.FormDB;
import com.xworkz.repository.FormRepositoryImpl;
import com.xworkz.service.FormService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/form")
public class FormServlet extends HttpServlet {
    private FormRepositoryImpl formService;

    @Override
    public void init() throws ServletException {
        formService = new FormRepositoryImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("save".equals(action)) {
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));
            String email = request.getParameter("email");
            long contact = Long.parseLong(request.getParameter("contact"));
            String password = request.getParameter("password");
            String address = request.getParameter("address");

            FormDB form = new FormDB(0, name, age, email, contact, password, address);
            formService.saveForm(form);
            response.sendRedirect("form.jsp");

        } else if ("view".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            FormDB form = formService.getFormById(id);

            if (form != null) {
                request.setAttribute("form", form);
                request.getRequestDispatcher("/viewForm.jsp").forward(request, response);
            } else {
                response.getWriter().write("No form data found for the given ID.");
            }

        } else if ("searchByContact".equals(action)) {
            long contact = Long.parseLong(request.getParameter("contact"));
            FormDB form = formService.getFormByContact(contact);

            if (form != null) {
                request.setAttribute("name", form.getName());
                request.setAttribute("email", form.getEmail());
                request.setAttribute("successMessage", "Contact found successfully");
            } else {
                request.setAttribute("failureMessage", "No data found for the provided contact number.");
            }

            request.getRequestDispatcher("/viewMessage.jsp").forward(request, response);

        } else if ("verifyPassword".equals(action)) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            boolean isVerified = formService.verifyPasswordForUser(email, password);

            if (isVerified) {
                request.setAttribute("successMessage", "Verification successful");
            } else {
                request.setAttribute("failureMessage", "Invalid email or password.");
            }

            request.getRequestDispatcher("/verifyResult.jsp").forward(request, response);

        } else if ("delete".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));

            boolean isDeleted = formService.deleteFormById(id); 

            if (isDeleted) {
                request.setAttribute("failureMessage", "Failed to delete data for ID " + id + ". It may not exist.");
            } else {
                request.setAttribute("successMessage", "Data for ID " + id + " has been successfully deleted.");
            }

            request.getRequestDispatcher("/viewMessagefordelet.jsp").forward(request, response);
        }

        else if ("update".equals(action)) {
            String email = request.getParameter("email");
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));
            long contact = Long.parseLong(request.getParameter("contact"));
            String password = request.getParameter("password");
            String address = request.getParameter("address");

            FormDB updatedForm = new FormDB(0, name, age, email, contact, password, address);
            boolean isUpdated = formService.updateFormByEmail(email, updatedForm);

            if (isUpdated) {
                request.setAttribute("successMessage", "Form updated successfully");
            } else {
                request.setAttribute("failureMessage", "Failed to update form data. Please check the email and try again.");
            }

            request.getRequestDispatcher("/updateMessage.jsp").forward(request, response);

        } else if ("view".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            FormDB form = formService.getFormById(id);

            if (form != null) {
                request.setAttribute("form", form);
                request.getRequestDispatcher("/viewForm.jsp").forward(request, response);
            } else {
                response.getWriter().write("No form data found for the given ID.");
            }
        } 
    }
}
