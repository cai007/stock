import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String weburl=request.getParameter("weburl");
		if(weburl!=null&&weburl.equals("http://www.w3csschool.com")){
			request.setAttribute("weburl", "你输入的是w3c在线教育网");
		}else{
			request.setAttribute("weburl", "你输入的在数据库中没记录！");
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("result.jsp");
		dispatcher.forward(request, response);

	}


}


	
