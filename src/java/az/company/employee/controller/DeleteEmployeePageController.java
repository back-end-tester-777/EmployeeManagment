package az.company.employee.controller;

import az.company.employee.dao.abstracts.EmployeeDaoService;
import az.company.employee.dao.concrets.EmployeeDaoManager;
import az.company.employee.model.concrets.Employee;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DeleteEmployeePageController", urlPatterns = {"/private/delete-employee-page"})
public class DeleteEmployeePageController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("editname", "Edit");
        request.setAttribute("home_url", request.getContextPath() + "/home");
        request.setAttribute("admin_url", request.getContextPath() + "/admin/admin-panel");
        request.setAttribute("employeelist_url", request.getContextPath() + "/private/employee-list");
        request.setAttribute("insert_url", request.getContextPath() + "/private/insert");
        request.setAttribute("edit_url", request.getContextPath() + "/private/edit-employee-page");
        request.setAttribute("delete_url", request.getContextPath() + "#");
        request.setAttribute("login_url", "login");
        request.setAttribute("register_url", "register");
        request.setAttribute("selected_edit", "active");

        EmployeeDaoService employeeDaoService = new EmployeeDaoManager();
        List<Employee> employees = employeeDaoService.findAll();
        request.setAttribute("employees", employees);

        request.getRequestDispatcher("/deleteemployeepage.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
