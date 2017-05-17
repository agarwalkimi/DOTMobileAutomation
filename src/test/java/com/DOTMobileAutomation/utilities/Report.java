package com.DOTMobileAutomation.utilities;

import com.DOTMobileAutomation.controller.Controller;
import com.relevantcodes.extentreports.ExtentReports;

public class Report extends Controller{

		public static void Reports(){
		//Where to keep the report
		extent = new ExtentReports("D:\\Report\\report.html", true);
		}
		public static void StartTest(){
		//test start here
		test = extent.startTest("Testname", "Description");
		}
		public static void AuthorName(){
		//Author name
		test.assignAuthor("Kimi Agarwal");
		}
		public static void EndTest(){
		//test end here
		extent.endTest(test);
		}
		public static void Flush(){
		extent.flush();
		}
		public static void Close(){
		extent.close();
		}
}
