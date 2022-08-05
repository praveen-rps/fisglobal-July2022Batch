package com.examples.mvc.testmvc.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	
	@RequestMapping(value="/validate", method=RequestMethod.POST)
	public ModelAndView validateData(HttpServletRequest request) throws Exception {
		
		String uname=null,passwd=null;
		String l = request.getParameter("lid");
		String p = request.getParameter("pwd");
		boolean isFound=false;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fisglobal","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from fisusers");
		while(rs.next()) {
			uname=rs.getString(1);
			passwd=rs.getString(2);
			if(l.equals(uname) && p.equals(passwd)) {
				isFound=true;
				break;
			}	
		}
		if(isFound)
			return new ModelAndView("success","uname",uname);
		else
			return new ModelAndView("fail","uname",l);
		
	}
	
	@RequestMapping(value="/search")
	public String searchpage() throws Exception{
		/*Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fisglobal","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from notes");
		*/
		return "search";
	}
	
	@RequestMapping(value="/searchNotes")
	public ModelAndView searchNotes(HttpServletRequest request) throws Exception{
		int pid = Integer.parseInt(request.getParameter("pid"));
		List<Notes> notes = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fisglobal","root","root");
		PreparedStatement pst = con.prepareStatement("select * from notes where pid=?");
		pst.setInt(1, pid);
		
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			notes.add(new Notes(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}
			
		
			return new ModelAndView("displaynote", "notes",notes);
	}
	
	@RequestMapping(value="/showAll")
	public ModelAndView getData() throws Exception{
		List<Notes> notes = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fisglobal","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from notes");
		while(rs.next()) {
			notes.add(new Notes(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}
		
		return new ModelAndView("display","notes",notes);
	}

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public String test2() {
		return "test";
	}
}
