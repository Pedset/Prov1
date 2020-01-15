package prov1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class generateList
 */
@WebServlet("/generateList")
public class generateList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public generateList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// Jag skrev ingen jsp file for detta. Skriv bara i url, length = längden på listan
		// och varje element har namnet itemy där "y" ändras 1, 2, 3 osv
		// example http://localhost:8080/prov1/generateList?length=3&item1=fork&item2=spoon&item3=bowl
		
		PrintWriter out = response.getWriter();
		out.print("<h1> List </h1>");
		if (request.getParameter("length")!=null && (Integer.parseInt(request.getParameter("length"))>0)) {
		out.print("<br><br><ol>");
		for (int y = 1; y <= Integer.parseInt(request.getParameter("length")); y++) {
			out.print("<li>");
			out.print(request.getParameter("item" + y));
			out.print("</li>");
		}}
		else {
			out.print("<p>Incorrect list length</p>");
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
