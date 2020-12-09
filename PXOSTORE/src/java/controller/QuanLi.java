/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Product;
import dao.DuyetBaiDAO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ChoThue;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "QuanLi", urlPatterns = {"/QuanLi"})
public class QuanLi extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String command = request.getParameter("command");
        String ProductID = request.getParameter("ProductID");
        String url = "";
        Product p = null;
        try {
            ChoThue c = DuyetBaiDAO.getChoThue(Integer.parseInt(ProductID));
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex.getMessage());
        }

        switch (command) {
            case "duyet": {
                try {
                    if (DuyetBaiDAO.ChapNhanBaiDang(Integer.parseInt(ProductID))) {
                        request.setAttribute("daduyet", "Đã Duyệt Bài Của " + p.getProductName());
                        url = "/manager_product1_Admin.jsp";
                        break;
                    } 
                    
                } catch (SQLException ex) {
                    System.out.println("Lỗi" + ex.getMessage());
                }
            }
            case "xoa": {
                try {
                    if (DuyetBaiDAO.xoaBaiDang(Integer.parseInt(ProductID))) {
                        request.setAttribute("xoa", "Đã Xóa Bài Của " + p.getProductName());
                        url = "/manager_product1_Admin.jsp";
                        break;
                    } 
                    
                } catch (SQLException ex) {
                    System.out.println("Lỗi" + ex.getMessage());
                }
            }
        }
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
