package com.example.web_apiTest_cu_ra_j5;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


//@WebServlet(name = "helloServlet", value = "hello-servlet")
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    // this project uses glassfish server to deploy
    // To config glassfish follow - https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-ee-application.html#run_config
    // Glassfish download - https://projects.eclipse.org/projects/ee4j.glassfish/downloads
    // in intellij , while setting up run/debug glassfish config JRE should be mentioned as Bundled and not Default

    private String message;

    public void init() {
        message = "Hello World 123";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}