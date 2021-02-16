package org.jvmreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String json) {
		
		// 1. Mension the target folder
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		
		// 2.  Add details to the report
		Configuration con = new Configuration(f, "Adactin Application");
		con.addClassifications("Platform Name", "Windows");
		con.addClassifications("Platform Version", "10");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "88.0");
		con.addClassifications("Sprint No", "3");
		
		// 3. To store json file path in list
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		// 4. Generate report
		ReportBuilder rb = new ReportBuilder(li, con);
		rb.generateReports();
	}
}
