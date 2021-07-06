package com.codingdojo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.web.models.Dog;

/**
 * Servlet implementation class Dogs
 */
@WebServlet("/Dogs")
public class Dogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dogs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Procesar la solicitud
        String name = request.getParameter("name");
        String breed = request.getParameter("breed");
        //String weight= request.getParameter("weight");
        int weight = Integer.parseInt(request.getParameter("weight"));
        
        
        
        // Crear el modelo 
        //Person person = new Person(name, age);
        Dog dog = new Dog(name,breed,weight);
        
        // Establecer el modelo para la vista
        //request.setAttribute("person", person);
        request.setAttribute("dog", dog);
        
        // Permita que la vista maneje la solicitud 
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/dog.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
