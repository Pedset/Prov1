package prov1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class animalPic
 */
@WebServlet("/animalPic")
public class animalPic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public animalPic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		switch (request.getParameter("animal")){
		case "lion": {
			out.print("<img src=\"https://upload.wikimedia.org/wikipedia/commons/7/73/Lion_waiting_in_Namibia.jpg\" alt=\"Lion\" height=\"500\" width=\"500\">");
		}
		case "dog": {
			out.print("<img src=\"https://i.ytimg.com/vi/MPV2METPeJU/maxresdefault.jpg\" alt=\"Dog\" height=\"500\" width=\"500\">");
			
		}
		case "cat": {
			out.print("<img src=\"https://www.purina.se/proplan/sites/g/files/mcldtz2506/files/2018-10/Article_Helping-your-cat-stay-in-healthy-shape_Header_Mobile_600px_1.jpg\" alt=\"Cat\" height=\"500\" width=\"500\">");
			
		}
		case "bird": {
			out.print("<img src=\"https://ichef.bbci.co.uk/news/410/cpsprodpb/67CF/production/_108857562_mediaitem108857561.jpg\" alt=\"bird\" height=\"500\" width=\"500\">");
			
		}
			default:{
				out.print("<img src=\"https://upload.wikimedia.org/wikipedia/commons/7/73/Lion_waiting_in_Namibia.jpg\" alt=\"Lion\" height=\"500\" width=\"500\">");
			}
		
			}
			
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
