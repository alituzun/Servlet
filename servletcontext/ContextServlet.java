package _05.servletcontext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contextServlet")
public class ContextServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletContext context=getServletContext();
	String pathInfo=context.getInitParameter("rootPath");
	resp.getWriter().print(pathInfo);
	
	String reelPath=context.getRealPath("test.txt");
	System.out.println(reelPath);
	String contexPath=context.getContextPath();
	System.out.println(contexPath);
	}
	}
