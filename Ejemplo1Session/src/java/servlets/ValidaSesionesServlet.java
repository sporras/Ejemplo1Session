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


public class ValidaSesionesServlet extends HttpServlet {
   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

      response.setContentType("text/html");
      HttpSession sesion = request.getSession();
      String titulo = null;

      //Pedimos el atributo, y verificamos si existe
      String claveSesion = (String) sesion.getAttribute("claveSesion");

      if(claveSesion.equals("emmanueloropeza")){
        titulo = "llave correcta continua la sesion";
      }
      else
      {
        titulo = "llave incorrecta inicie nuevamente sesion";
      }


      //Mostramos los  valores en el cliente
      PrintWriter out = response.getWriter();
      
      
    out.println("<!DOCTYPE html>");
    out.println("<html>");
        out.println("<head>");
            out.println("<link href='css/materialize.min.css' rel='stylesheet' type='text/css'/>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='card-panel purple lighten-2'>");
           out.println("¿Continua la Sesion y es valida?: " + titulo);
        out.println("</div>");
           out.println("<br><br>");
        out.println("<div class='card-panel  purple lighten-4'>");
           out.println("ID de la sesi&oacute;n JSESSIONID: " + sesion.getId());
        out.println("</div>");
           out.println("<form method='post' action='CierreSesion.jsp'><center>");   
           out.println("<button class=\"btn btn-large waves-effect purple\" type=\"submit\">Cerrar Sesion</button>");
           out.println("</center></form>");
        out.println("</body>");
    out.println("</html>");
    }

}
