/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SesionesServlet extends HttpServlet {
   
     public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

         String nombre;
         String apellido;
        
      //recuperamos los datos del formulario
          nombre = request.getParameter("NOMBRE");
          apellido = request.getParameter("APELLIDO");
         
      HttpSession sesion = request.getSession();
      sesion.setAttribute("claveSesion", nombre + apellido);

       response.setContentType("text/html");
      //Mostramos los  valores en el cliente
      PrintWriter out = response.getWriter();

      out.println("<!DOCTYPE html>");
      out.println("<html>");
       out.println("<head>");
        out.println("<link href='css/materialize.min.css' rel='stylesheet' type='text/css'/>");
       out.println("</head>");
       out.println("<body>");
        out.println("<div class='card-panel lime accent-1'><a href=\"/Ejemplo1Session/catalogo.jsp\"> Link al catalogo del carrito  </a></div>");
        out.println("<br><br><br>");
        out.println("<div class='card-panel lime accent-4'>ID de la sesi&oacute;n: " + sesion.getId() + "</div>");
       out.println("</body>");
      out.println("</html>");
        
      
  
    }
   

}
