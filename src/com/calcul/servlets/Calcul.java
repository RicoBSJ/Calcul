package com.calcul.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.calcul.beans.Operation;

@WebServlet("/Calcul")
public class Calcul extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Calcul() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calcul.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in do post");
		double nbr1 = Double.parseDouble(request.getParameter("nbr1"));

		System.out.println("nbr1 : " + nbr1);
		double nbr2 = Double.parseDouble(request.getParameter("nbr2"));

		System.out.println("nbr2 : " + nbr2);

		Operation operation = new Operation(Double.parseDouble(request.getParameter("nbr1")),
				request.getParameter("operateur"), Double.parseDouble(request.getParameter("nbr2")));

		request.setAttribute("operation", operation);
		System.out.println("out doPost");
		this.getServletContext().getRequestDispatcher("/WEB-INF/calcul.jsp").forward(request, response);
	}
}
