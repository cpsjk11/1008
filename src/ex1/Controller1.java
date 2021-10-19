package ex1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller1
 */
@WebServlet("/Controller1")
public class Controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// type이라는 파라미터 받기
		String type = request.getParameter("type");
		
		String viewPath = null;
		
		// type이 null 이거나  "greet"이면 GreetAction을 생성한다.
		if(type == null || type.equalsIgnoreCase("greet")) {
			
			GreetAction action = new GreetAction();
			
			viewPath = action.execute(request, response);
		}
		else if(type.equals("now")) {
			
			DateAction action = new DateAction();
			
			viewPath = action.execute(request, response);
		}
		else if(type.equalsIgnoreCase("str")) {
			HiAction action = new HiAction();
			
			viewPath = action.execute(request, response);
		}
		
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
