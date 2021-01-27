package com.framework.dashboards.taghandlers;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DashboardEndTag extends SimpleTagSupport {
	
	private String dashboard_id;
	

	public String getDashboard_id() {
		return dashboard_id;
	}




	public void setDashboard_id(String dashboard_id) {
		this.dashboard_id = dashboard_id;
	}




	
	
	 
	 
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter js = getJspContext().getOut();	 
		js.println("  <script>\r\n"
				+ "    $(document).ready( function () {\r\n"
				+ "    $('#"+ this.dashboard_id +"').DataTable( {\r\n"
						+ "        \"dom\": '<\"top\"i>rt<\"bottom\"flp><\"clear\">'\r\n"
						+ "    });\r\n"
				+ "	} );\r\n"
				+ "    </script>");
		
		super.doTag();
	}

 
	
	

}
