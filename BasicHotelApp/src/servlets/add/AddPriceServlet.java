package servlets.add;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import db.Db;
import db.dao.HotelDAO;
import db.dao.impl.HotelDAOImpl;
import model.Hotel;
import model.RoomSpecial;
import services.general.PathCreatorPrefixAndSufix;
import services.general.PathCreatorPrefixAndSufixImpl;

/**
 * Servlet implementation class AddPriceServlet
 */
@WebServlet("/AddPriceServlet")
public class AddPriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPriceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("$$ ###");
		
		System.out.println(request.getContentType());
		System.out.println(request.getContentLength());
		
		//Gson gson = new Gson();
		
		
		BufferedReader reader = request.getReader();
		Gson gson = new Gson();

		
		RoomSpecial room = gson.fromJson(reader, RoomSpecial.class);
		
		System.out.println(room.getName());
		System.out.println(room.getPrice());
	
		
		HotelDAO hotelDAO = new HotelDAOImpl();
		List<Hotel> list = hotelDAO.getAllHotels(Db.getConn());
		
		request.setAttribute("list", list);
		
		String pageName="Hotel";
		PathCreatorPrefixAndSufix pathCreator = new PathCreatorPrefixAndSufixImpl();
		RequestDispatcher requestDispatcher = pathCreator.createPathForDispatcher(request, pageName);
		requestDispatcher.forward(request, response);
		
	
		
		
	}

}
