package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AHTWRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register Page</title>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-2.2.0.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.js\"></script>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css\"></link>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"/styles/styles.css\"></link>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "TWAHBanner.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"ui container\">\n");
      out.write("            <div class='ui centered grid'>\n");
      out.write("                <div class='six wide column'>\n");
      out.write("                    <div class='ui orange segment'>\n");
      out.write("                        <form class='ui form' method='POST' action='AHTWRegister.jsp'>\n");
      out.write("                            <div class='field'>\n");
      out.write("                                <label>Full Name</label>\n");
      out.write("                                <input type='text' name='fullName' placeholder='Full Name' />\n");
      out.write("                            </div>\n");
      out.write("                            <div class='field'>\n");
      out.write("                                <label>Email</label>\n");
      out.write("                                <input type='text' name='email' placeholder='john@example.com' />\n");
      out.write("                            </div>\n");
      out.write("                            <div class='field'>\n");
      out.write("                                <label>Phone Number</label>\n");
      out.write("                                <input type='text' name='phone' placeholder='(905) 123-4567' />\n");
      out.write("                            </div>\n");
      out.write("                            <div class='field'>\n");
      out.write("                                <label>IT Program</label>\n");
      out.write("                                <select name='program' class='ui dropdown program'>\n");
      out.write("                                    <option value='CAD'>CAD</option>\n");
      out.write("                                    <option value='CP'>CP</option>\n");
      out.write("                                    <option value='CPA'>CPA</option>\n");
      out.write("                                    <option value='ITID'>ITID</option>\n");
      out.write("                                    <option value='ITSS'>ITSS</option>\n");
      out.write("                                    <option value='MSD'>MSD</option>\n");
      out.write("                                    <option value='Others'>Others</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class='field'>\n");
      out.write("                                <label>Year Level</label>\n");
      out.write("                                <select name='year' class='ui dropdown year'>\n");
      out.write("                                    <option value='1'>Year 1</option>\n");
      out.write("                                    <option value='2'>Year 2</option>\n");
      out.write("                                    <option value='3'>Year 3</option>\n");
      out.write("                                    <option value='4'>Year 4</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <script>\n");
      out.write("                                $('.ui.dropdown.program').dropdown();\n");
      out.write("                                $('.ui.dropdown.year').dropdown();\n");
      out.write("                            </script>\n");
      out.write("                            <button type='submit' class='fluid ui orange button'>Register Now!</button>\n");
      out.write("                            <button type='reset' class='fluid ui inverted orange button'>Reset</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "TWAHFooter.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
