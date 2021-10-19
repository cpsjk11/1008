package ex2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller2
 */
@WebServlet("/Controller2")
public class Controller2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("type");
		
		Action action = null;
		if(type == null || type.equalsIgnoreCase("greet"))
			action = new GreetAction();
		else if(type.equals("now"))
			action = new DateAction();
		else if(type.equals("hi"))
			action = new HiAction();
		
		String viewPath = action.execute(request, response);
		
		// forward를 위한 객체 생성
		RequestDispatcher disp = request.getRequestDispatcher(viewPath); // 이동할 경로를넣어서 forward를 위한 requestdispatcher 객체를 생성한다.
		disp.forward(request, response); // forward로 페이지 이동!
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
