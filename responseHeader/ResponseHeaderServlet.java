package _04.responseHeader;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseHeaderServlet")
public class ResponseHeaderServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.addHeader("username", "test user1");
		resp.addHeader("username", "test user2");
		resp.setHeader("password", "old");
		resp.setHeader("password", "new");
	}
}
