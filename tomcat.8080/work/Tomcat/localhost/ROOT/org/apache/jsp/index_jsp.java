/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.2
 * Generated at: 2024-03-04 06:22:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.astr.gymproject.service.ParticipantService;
import com.astr.gymproject.entity.Participant;
import com.astr.gymproject.service.BatchService;
import com.astr.gymproject.entity.Batch;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.astr.gymproject.service.ParticipantService");
    _jspx_imports_classes.add("com.astr.gymproject.entity.Participant");
    _jspx_imports_classes.add("com.astr.gymproject.entity.Batch");
    _jspx_imports_classes.add("com.astr.gymproject.service.BatchService");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    BatchService batchService = BatchService.getBatchService();
    ParticipantService participantService = ParticipantService.getParticipantService();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Gym Project</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("          integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h2 class=\"display-4\">Batch List</h2>\r\n");
      out.write("    <hr class=\"mb-4\">\r\n");
      out.write("    <div class=\"mb-4\">\r\n");
      out.write("        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"50\" height=\"50\" fill=\"currentColor\" class=\"bi bi-folder-plus\"\r\n");
      out.write("             viewBox=\"0 0 16 16\">\r\n");
      out.write("            <path d=\"m.5 3 .04.87a2 2 0 0 0-.342 1.311l.637 7A2 2 0 0 0 2.826 14H9v-1H2.826a1 1 0 0 1-.995-.91l-.637-7A1 1 0 0 1 2.19 4h11.62a1 1 0 0 1 .996 1.09L14.54 8h1.005l.256-2.819A2 2 0 0 0 13.81 3H9.828a2 2 0 0 1-1.414-.586l-.828-.828A2 2 0 0 0 6.172 1H2.5a2 2 0 0 0-2 2m5.672-1a1 1 0 0 1 .707.293L7.586 3H2.19q-.362.002-.683.12L1.5 2.98a1 1 0 0 1 1-.98z\"/>\r\n");
      out.write("            <path d=\"M13.5 9a.5.5 0 0 1 .5.5V11h1.5a.5.5 0 1 1 0 1H14v1.5a.5.5 0 1 1-1 0V12h-1.5a.5.5 0 0 1 0-1H13V9.5a.5.5 0 0 1 .5-.5\"/>\r\n");
      out.write("        </svg>\r\n");
      out.write("        <a href=\"createBatch.jsp\" class=\"btn btn-success\">Create Batch</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <table class=\"table table-striped mb-5\">\r\n");
      out.write("        <thead class=\"table-dark\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th scope=\"col\">Name</th>\r\n");
      out.write("            <th scope=\"col\">Start Date</th>\r\n");
      out.write("            <th scope=\"col\">End Date</th>\r\n");
      out.write("            <th scope=\"col\">Action</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("        ");

            for (Batch batch : batchService.getBatchList()) {
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>");
      out.print(batch.getName());
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>");
      out.print(batch.getStartDate());
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>");
      out.print(batch.getEndDate());
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <a class=\"btn btn-primary btn-sm mx-2\"\r\n");
      out.write("                   href=\"/modifyBatch.jsp?batchId=");
      out.print(batch.getId());
      out.write("&batchName=");
      out.print(batch.getName());
      out.write("&startDate=");
      out.print(batch.getStartDate());
      out.write("&endDate=");
      out.print(batch.getEndDate());
      out.write("\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-arrow-clockwise\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                        <path fill-rule=\"evenodd\" d=\"M8 3a5 5 0 1 0 4.546 2.914.5.5 0 0 1 .908-.417A6 6 0 1 1 8 2z\"/>\r\n");
      out.write("                        <path d=\"M8 4.466V.534a.25.25 0 0 1 .41-.192l2.36 1.966c.12.1.12.284 0 .384L8.41 4.658A.25.25 0 0 1 8 4.466\"/>\r\n");
      out.write("                    </svg>\r\n");
      out.write("                    Modify</a>\r\n");
      out.write("                <a href=\"/deleteBatch?batchId=");
      out.print(batch.getId());
      out.write("\" class=\"btn btn-danger btn-sm\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\"\r\n");
      out.write("                         class=\"bi bi-trash\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                        <path d=\"M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5m2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5m3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0z\"/>\r\n");
      out.write("                        <path d=\"M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4zM2.5 3h11V2h-11z\"/>\r\n");
      out.write("                    </svg>\r\n");
      out.write("                    Delete\r\n");
      out.write("                </a></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("    <h2 class=\"display-4\">Participants List</h2>\r\n");
      out.write("    <hr class=\"mb-4\">\r\n");
      out.write("    <div class=\"mb-4\">\r\n");
      out.write("        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"50\" height=\"50\" fill=\"currentColor\" class=\"bi bi-person-fill-add\"\r\n");
      out.write("             viewBox=\"0 0 16 16\">\r\n");
      out.write("            <path d=\"M12.5 16a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7m.5-5v1h1a.5.5 0 0 1 0 1h-1v1a.5.5 0 0 1-1 0v-1h-1a.5.5 0 0 1 0-1h1v-1a.5.5 0 0 1 1 0m-2-6a3 3 0 1 1-6 0 3 3 0 0 1 6 0\"/>\r\n");
      out.write("            <path d=\"M2 13c0 1 1 1 1 1h5.256A4.5 4.5 0 0 1 8 12.5a4.5 4.5 0 0 1 1.544-3.393Q8.844 9.002 8 9c-5 0-6 3-6 4\"/>\r\n");
      out.write("        </svg>\r\n");
      out.write("        <a href=\"createParticipant.jsp\" class=\"btn btn-success\">Create Participant</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <table class=\"table table-striped\">\r\n");
      out.write("        <thead class=\"table-dark\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th scope=\"col\">Name</th>\r\n");
      out.write("            <th scope=\"col\">Age</th>\r\n");
      out.write("            <th scope=\"col\">Batch</th>\r\n");
      out.write("            <th scope=\"col\">Action</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("        ");

            for (Participant participant : participantService.getParticipantList()) {
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>");
      out.print(participant.getName());
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>");
      out.print(participant.getAge());
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>");
      out.print(batchService.getBatchById(participant.getBatchId()).getName());
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <a class=\"btn btn-primary btn-sm mx-2\"\r\n");
      out.write("                   href=\"/modifyParticipant.jsp?id=");
      out.print(participant.getId());
      out.write("&name=");
      out.print(participant.getName());
      out.write("&age=");
      out.print(participant.getAge());
      out.write("&batchId=");
      out.print(participant.getBatchId());
      out.write("\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-arrow-clockwise\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                        <path fill-rule=\"evenodd\" d=\"M8 3a5 5 0 1 0 4.546 2.914.5.5 0 0 1 .908-.417A6 6 0 1 1 8 2z\"/>\r\n");
      out.write("                        <path d=\"M8 4.466V.534a.25.25 0 0 1 .41-.192l2.36 1.966c.12.1.12.284 0 .384L8.41 4.658A.25.25 0 0 1 8 4.466\"/>\r\n");
      out.write("                    </svg>\r\n");
      out.write("                    Modify</a>\r\n");
      out.write("                <a href=\"/deleteParticipant?participantId=");
      out.print(participant.getId());
      out.write("\" class=\"btn btn-danger btn-sm\">\r\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-trash\"\r\n");
      out.write("                     viewBox=\"0 0 16 16\">\r\n");
      out.write("                    <path d=\"M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5m2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5m3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0z\"/>\r\n");
      out.write("                    <path d=\"M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4zM2.5 3h11V2h-11z\"/>\r\n");
      out.write("                </svg>\r\n");
      out.write("                Delete\r\n");
      out.write("            </a></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
