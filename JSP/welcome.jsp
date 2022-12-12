<html>
  <body>
    <form>
      <!--
        Java Scriplet Tag
        <%  java source code %>  
    -->
      <% String name=request.getParameter("uname"); out.print("welcome "+name);
      %>
    </form>
  </body>
</html>
