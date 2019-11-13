package _04.servletconfig;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/configAnnotation",initParams =@WebInitParam(name="ali", value="1907"))
public class ConfigServletAnnotation extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name=getServletConfig().getInitParameter("ali");
	resp.getWriter().println(name);
	}
	}
