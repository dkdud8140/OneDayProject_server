package com.com.food.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.com.food.model.MyfoodsDTO;
import com.com.food.service.DBConnection;
import com.com.food.service.impl.FoodImplV1;

@WebServlet("/food/*")
public class MainController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DBConnection dbConn;
	public FoodImplV1 fSer;

	public MainController() {
		dbConn = new DBConnection();
		fSer = new FoodImplV1();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");
		//String subPath = req.getPathInfo();

		List<MyfoodsDTO> mfList = fSer.selectAll();

		req.setAttribute("MFLIST", mfList);
		RequestDispatcher rDis = req.getRequestDispatcher("/WEB-INF/view/selectall.jsp");
		rDis.forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
