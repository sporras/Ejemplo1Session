<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de Sesiones</title>
        <link href="css/materialize.min.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <div class="teal-text text-darken-1">
             <h1><center>Ejemplo de Sesiones</center></h1>
        </div>
        <br>
        <form action='SesionesServlet' method="POST">   
            <div class="card">
                <div class="card-content">

                     <div class="input-field"> 
                    NOMBRE: <input type="text" name="NOMBRE">
                    <label for="NOMBRE"></label>
                    </div>
                    <br />
                    <div class="input-field"> 
                        APELLIDO: <input type="text" name="APELLIDO" />
                        <label for="APELLIDO"></label>
                    </div>
                </div>
                <div class="card-action">
                     <button class="btn btn-large waves-effect teal darken-1" type="submit">Enviar</button>
                </div>
            </div>
        </form>        
    </body>
</html>
