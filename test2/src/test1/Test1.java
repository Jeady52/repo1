package test1;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;import org.eclipse.jdt.internal.compiler.ast.ThisReference;

/**
 * Servlet implementation class Test1
 */
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		request.setCharacterEncoding("UTF-8");
//		String name = request.getParameter("name");
////		String encode = URLEncoder.encode(name,"ISO-8859-1");
////		String decode = URLDecoder.decode(encode, "UTF-8");
//		System.out.println(name);
//		String[] hobbys = request.getParameterValues("hobby");
//		System.out.println(Arrays.toString(hobbys));
//		Map<String, String[]> map = request.getParameterMap();
//		for (String string : map.keySet()) {
//			String[] strings = map.get(string);
//			System.out.println(Arrays.toString(strings));
//		}
		
//		response.setStatus(304);
//		response.setHeader("location", "a.html");
		
		//response.sendRedirect("/test2/a.html");
		
//		response.setHeader("Context-Type", "text/html;charset=UTF-8");
//		response.setCharacterEncoding("UTF-8");
//		//response.setContentType("text/html;charset=UTF-8");
//		response.getWriter().print("��� �ŵ����");
		
		ServletOutputStream outputStream = response.getOutputStream();
		//response.setHeader("Context-Type", "text/html;charset=UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		outputStream.write("你好".getBytes());
		
		outputStream.println();
		
		
		
		
		
//		String name = (String) this.getServletContext().getAttribute("name");
//		ServletConfig servletConfig = this.getServletConfig();
//		String username = servletConfig.getInitParameter("username");
//		Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
//		
//		while (initParameterNames.hasMoreElements()) {
//			String nextElement = initParameterNames.nextElement();
//			System.out.println(nextElement);
		
//		System.out.println(this.getServletContext().getContextPath());
//		System.out.println(this.getServletContext().getMimeType("a.text"));
		
		
		
//		Enumeration<String> initParameterNames = this.getServletContext().getInitParameterNames();
//		
//		while (initParameterNames.hasMoreElements()) {
//			String string = (String) initParameterNames.nextElement();
//			System.out.println(string);
//		}
		
		//this.getServletContext().getResourceAsStream("");
		
		
		
		//System.out.println(username);
		//System.out.println(name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
