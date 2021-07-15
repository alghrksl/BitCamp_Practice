import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

public class NowServlet extends HttpServlet {

	protected void doget(HttpServlet req, HttpServletResponse resp) {
		System.out.println("GET 요청");
		
	}
}
