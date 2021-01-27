package com.framework.dashboards.taghandlers;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DashboardTag extends SimpleTagSupport {
	
	
	private String dashboard_id;
	private Long role_cd;
	private Long template_id;
	private String table_class="table table-striped";
	private String row_class;
	private String column_class;
	private String header_row_class;
	private String header_col_class;
	
	
	
	
	@Override
	public void doTag() throws JspException, IOException {
		
		JspWriter js = getJspContext().getOut();
		System.out.println("Dashboard Name is " + this.dashboard_id);
		System.out.println("Role Code is " + this.role_cd);
		System.out.println("Template id is " + this.template_id);
		
		//js.println("<h1> This is from custom tag:::  "+ this.dashboard_id +"</h1>");
		
		js.println("<table id="+ this.dashboard_id +"  class='"+ this.table_class+"'>");
			js.println("<thead class='"+ this.header_row_class +"'>");
			js.println("<tr class='"+ this.header_row_class +"'>");
				js.print("<th>");
				js.print("Sno");
				js.print("</th>");
				js.print("<th>");
				js.print("Name");
				js.print("</th>");
				js.print("<th>");
				js.print("Address");
				js.print("</th>");
			js.println("</tr>");
			js.println("</thead>");
			js.println("</tbody>");
			js.println("<tr>");
				js.print("<td>");
				js.print("1");
				js.print("</td>");
				js.print("<td>");
				js.print("Krishan Sahay");
				js.print("</td>");
				js.print("<td>");
				js.print("5425 Asherbrand lane");
				js.print("</td>");
			js.println("</tr>");
				js.println("<tr>");
				js.print("<td>");
				js.print("1");
				js.print("</td>");
				js.print("<td>");
				js.print("Kashvy Sahay");
				js.print("</td>");
				js.print("<td>");
				js.print("5425 Asherbrand lane");
				js.print("</td>");
				js.print("</tr>");
				js.println("<tr>");
				js.println("<td>");
				js.print("1");
				js.print("</td>");
				js.print("<td>");
				js.print("Pallavii Sahay");
				js.print("</td>");
				js.print("<td>");
				js.print("5425 Asherbrand lane");
				js.print("</td>");
				js.println("</tr>");
		js.println("</tbody>");
		js.println("</table>");
		/*
		 * js.println("  <script>\r\n" + "    $(document).ready( function () {\r\n" +
		 * "    $('#abc').DataTable();\r\n" + "	} );\r\n" + "    </script>");
		 */
	}

	
	public String getDashboard_id() {
		return dashboard_id;
	}


	public void setDashboard_id(String dashboard_id) {
		this.dashboard_id = dashboard_id;
	}


	public Long getRole_cd() {
		return role_cd;
	}

	public void setRole_cd(Long role_cd) {
		this.role_cd = role_cd;
	}

	public Long getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(Long template_id) {
		this.template_id = template_id;
	}
	
	public String getTable_class() {
		return table_class;
	}


	public void setTable_class(String table_class) {
		this.table_class = table_class;
	}


	public String getRow_class() {
		return row_class;
	}


	public void setRow_class(String row_class) {
		this.row_class = row_class;
	}


	public String getColumn_class() {
		return column_class;
	}


	public void setColumn_class(String column_class) {
		this.column_class = column_class;
	}


	public String getHeader_row_class() {
		return header_row_class;
	}


	public void setHeader_row_class(String header_row_class) {
		this.header_row_class = header_row_class;
	}


	public String getHeader_col_class() {
		return header_col_class;
	}


	public void setHeader_col_class(String header_col_class) {
		this.header_col_class = header_col_class;
	}



}
