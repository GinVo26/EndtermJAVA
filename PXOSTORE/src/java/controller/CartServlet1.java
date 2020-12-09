package controller;

import dao.ChoThueDAO;
import dao.ProductDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.ChoThue;
import model.Item;

@WebServlet(name = "CartServlet1", urlPatterns = {"/CartServlet1"})
public class CartServlet1 extends HttpServlet
{

    private ChoThueDAO chothueDAO = new ChoThueDAO();
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        String chothueID = request.getParameter("chothueID");
        String command = request.getParameter("command");
        Cart cart = (Cart) session.getAttribute("cart");
       
        try 
        {
            Long idChothue = Long.parseLong(chothueID);
            ChoThue chothue  = ChoThueDAO.GetALlList(idChothue);
            
            
            switch(command)
            {
                case "add":
                    if(cart.getCartItems().containsKey(cart) )
                    {
                        cart.plusToCart(idChothue, new Item(chothue,cart.getCartItems().get(idChothue).getQuantity() ));
                        
                    }
                    
                    else
                    {
                        cart.plusToCart(idChothue, new Item(chothue,1));
                        
                    }
                        break;
                case "remove":
                    cart.removeCart(idChothue);
                    
            }
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
        
        
        session.setAttribute("cart", cart);
        response.sendRedirect("GioHang.jsp");
    }
}
