// package com;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class TestReportForStudent{

	private static int totalFailureCount=0;
	private static int totalErrorCount=0;
	private static int totalTests;
	 private static int showCount=0;
	 private static int hiddenCount=0;
	    private static int hiddenflag=0;
	 //   private static int count=1;
	    private static ArrayList<String> visibleTestCases = new ArrayList<String>();
	    private static Map<String,String>  desc = new HashMap<>();
	    
	
	public static String parseFile(String fileName,String layer)
	{
		//System.out.println("FileName: "+fileName);
				String result="";
				int count=1;
				int failcount=0;
				int errorcount=0;
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				try {
					DocumentBuilder builder = factory.newDocumentBuilder();
					Document document = builder.parse(new File(fileName));
					Element element=document.getDocumentElement();
					String failures=element.getAttribute("failures");
					
					String errors=element.getAttribute("errors");
							
					totalFailureCount+=Integer.parseInt(failures);
					totalErrorCount+=Integer.parseInt(errors);
					String tests=element.getAttribute("tests");
					//System.out.println("Tests: "+tests);
					totalTests+=Integer.parseInt(tests);
					result+="Tests: "+tests+"\n";
					//System.out.println("Failures: "+failures);
					result+="Failures: "+failures+"\n";
					result+="Errors: "+Integer.parseInt(errors);
					NodeList nList=document.getElementsByTagName("testcase");
					for(int i=0;i<nList.getLength();i++)
					{
						NodeList cNodes=nList.item(i).getChildNodes();
					//	System.out.println("TEEEEEEEEEEEEEEEEE");
						//System.out.println("outside"+nList.item(i).getAttributes().getNamedItem("name").getNodeValue());
						for(int j=0;j<cNodes.getLength();j++)
						{
						
							if(cNodes.item(j).getNodeName().equals("failure")||cNodes.item(j).getNodeName().equals("error"))
							{
							   if(nList.item(i).getAttributes().getNamedItem("name").getNodeValue().contains("initializationError"))
									{
										ArrayList<String> allTest=new ArrayList<String>();
								    	
										allTest.add("testShowPage");
								    	allTest.add("testResultPage");
								    	allTest.add("testToInvokingcalculateCourseFeesMethodInEPortalServiceClass");
								    	for(String test: allTest)
								    	{
								    	//testcaseFailList.add(test);
								        new GradeLibrary().writeString(test, "testcasefail.txt");
								    	}
									}
								System.out.println(nList.item(i).getAttributes().getNamedItem("name").getNodeValue());
								  new GradeLibrary().writeString(nList.item(i).getAttributes().getNamedItem("name").getNodeValue(), "testcasefail.txt");
								  
								  String nameText=nList.item(i).getAttributes().getNamedItem("name").getNodeValue();
								// if(count==1)
								// {
								// 	System.out.println("Comment :=>> FAILURE TESTCASES- "+layer);
								// 	count--;
								// }
								//System.out.println(cNodes.item(j).getTextContent()); 
								NamedNodeMap attributes = cNodes.item(j).getAttributes();

							      for (int a = 0; a < attributes.getLength(); a++) {
							        Node theAttribute = attributes.item(a);
							       // System.out.println(theAttribute.getNodeName() + "=" + theAttribute.getNodeValue());
							       // failcount++;
							       
							       	if(count==1 && visibleTestCases.contains(nameText))
								{
									System.out.println("Comment :=>> FAILURE TESTCASES- "+layer);
									count--;
								}
							        if(theAttribute.getNodeName().equals("message") && visibleTestCases.contains(nameText) ) {
							        	
							        	System.out.println("Comment :=>> "+"Fail "+(++failcount)+" - "+theAttribute.getNodeValue());
							        	showCount++;
							        }
							        else{
							            hiddenflag=1;
							            hiddenCount++;
							        }
							      }
							}
						}
					}
					
					
					
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					if(fileName.contains("FeatureTest.xml"))
					{
						ArrayList<String> allTest=new ArrayList<String>();
				    	
						allTest.add("testAnnotationAboveController");
				    	allTest.add("testAnnotationAboveMethod");
				    	allTest.add("testDependencyInjection");
				    	allTest.add("testAnnotationAboveService");
				    	allTest.add("testAnnotationValueAboveMethod");
				    	allTest.add("test12AnnotationAboveMethod");
				    	
				    	for(String test: allTest)
				    	{
				    	//testcaseFailList.add(test);
				        new GradeLibrary().writeString(test, "testcasefail.txt");
				    	}
					}
					else if(fileName.contains("WebTest.xml")) {
						ArrayList<String> allTest=new ArrayList<String>();
				    	
						allTest.add("test11showpageJSPForCourseJava");
				    	allTest.add("test11showpageJSPForCourseJEE");
				    	allTest.add("test11showpageJSPForCourseFrameworks");
				    	allTest.add("test11showpageJSPForCourseDataScience");
				    	allTest.add("test14showpageJSPForStudentName");
				    	allTest.add("test15SuccessFlowForJavaCourseNormalDuration");
				    	allTest.add("test15SuccessFlowForJEECourseFastTrackDuration");
				    	
				    	allTest.add("test15SuccessFlowForFrameworksCourseWeekendDuration");
				    	allTest.add("test15SuccessFlowForDataScienceCourseWeekendDuration");
				    	allTest.add("test1showPageUIForDefaultEnglish");
				    	allTest.add("test1showPageUIForGerman");
				    	allTest.add("test3showPageUIForFrench");
				    	allTest.add("test4ErrorMessageForStudentNameEmptyInGerman");
				    	allTest.add("test6ErrorMessageForRegistrationNumberNegativeCheckInGerman");
				    	allTest.add("test6ErrorMessageForRegistrationNumberExceedCheckInGerman");
				    			    	
				    	for(String test: allTest)
				    	{
				    	//testcaseFailList.add(test);
				        new GradeLibrary().writeString(test, "testcasefail.txt");
				    	}
					}
					else if(fileName.contains("SpringTest.xml")) {
						ArrayList<String> allTest=new ArrayList<String>();
				    	
						allTest.add("testShowPage");
				    	allTest.add("testResultPage");
				    	allTest.add("testToInvokingcalculateCourseFeesMethodInEPortalServiceClass");
				    	
				    	
				    	for(String test: allTest)
				    	{
				    	//testcaseFailList.add(test);
				        new GradeLibrary().writeString(test, "testcasefail.txt");
				    	}
					}
					else if(fileName.contains("FunctionalTest.xml")) {
						ArrayList<String> allTest=new ArrayList<String>();
				    	
						allTest.add("testCalculateCourseFeesForJavaWhenDurationIsNormal");
				    	allTest.add("testCalculateCourseFeesForJavaWhenDurationIsWeekend");
				    	allTest.add("testCalculateCourseFeesForJavaWhenDurationIsFastTrack");
				    	allTest.add("testCalculateCourseFeesForJEEWhenDurationIsNormal");
				    	allTest.add("testCalculateCourseFeesForJEEWhenDurationIsWeekend");
				    	allTest.add("testCalculateCourseFeesForJEEWhenDurationIsFastTrack");
				    	allTest.add("testCalculateCourseFeesForFrameworksWhenDurationIsNormal");
				    	allTest.add("testCalculateCourseFeesForFrameworksWhenDurationIsWeekend");
				    	allTest.add("testCalculateCourseFeesForFrameworksWhenDurationIsFastTrack");
				    	allTest.add("testCalculateCourseFeesForDataScienceWhenDurationIsNormal");
				    	allTest.add("testCalculateCourseFeesForDataScienceWhenDurationIsWeekend");
				    	allTest.add("testCalculateCourseFeesForDataScienceWhenDurationIsFastTrack");
				    	
				    	for(String test: allTest)
				    	{
				    	//testcaseFailList.add(test);
				        new GradeLibrary().writeString(test, "testcasefail.txt");
				    	}
					}
					
					return "-1";
				}
				
				
				
				
				return result;
	}
	
	static ArrayList<String> testcaseFailList = new ArrayList<String>();
     
   static  float totalMark_FeatureTest_allocated=0;

   
	static Testscript testscript;
	//static ArrayList<String> testcaseFailList = new ArrayList<String>();
	static ArrayList<String> featureTestcaseFailListCount=new ArrayList<String>();
	
	//static float totalMark_FeatureTest_allocated=0;
	static float totalMark=0f;
	static float actualmark=0;
	public static String fixedLengthString(String string, int length) {
		//System.out.println("&&&&&&&&&&"+string + "    "+length);
		//if(length == 0)
		//	length=1;
		return String.format("%1$"+length+ "s", string);
	}
	public static void generateReport(){
	    
	  		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("testcasefail.txt"));
			String test=null;
			while((test=reader.readLine())!=null){
				testcaseFailList.add(test);
			}
			System.out.println(testcaseFailList);
			reader.close();
			
			
			BufferedReader reader1 = new BufferedReader(new FileReader("testcasefailcount.txt"));
					String test1=null;
		
					
					while((test1=reader1.readLine())!=null){
						featureTestcaseFailListCount.add(test1);
					}
				
					reader1.close();
			
		} catch (IOException e) {
			
		}
	    try {
			BufferedWriter out = new BufferedWriter(new FileWriter("output.out"));
		
		JAXBContext jaxbContext;
		try {
			
			
			
			
			jaxbContext = JAXBContext.newInstance(Testscript.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			File XMLfile = new File("mark_config.xml");
			// this will create Java object from the XML file
			testscript=(Testscript)jaxbUnmarshaller.unmarshal(XMLfile);
			ArrayList<Functiontested> functiontestedList=(ArrayList<Functiontested>)testscript.getFunctiontested();
			//System.out.println("Comment :=>>- Grading and Feedback");
			for(int i=0;i<150;i++){
				//out.write("=");
			}
			//out.newLine();
			//out.newLine();
			//System.out.println();
			String comp="Competency";
		//	String subComp=fixedLengthString("SubCompetency",comp.length()+(33-comp.length()));
			String grade1=fixedLengthString("Grade",comp.length()+(33-comp.length()));//115-(comp.length()+subComp.length()));
			String feedback=fixedLengthString("Feedback",115-(comp.length()+grade1.length()));
			//out.write("Competency          SubCompetency                                     Grade          Feedback" );
			//out.write(comp+grade1+feedback);
			//out.newLine();
			//out.newLine();
//			for(int i=0;i<150;i++){
//				out.write("=");
//			}
//			out.newLine();
			int subcompetencylength=30;
			int gradelength=33;
			int feedbacklength=60;
			for(int i=0;i<functiontestedList.size();i++){
				
				// The below map is used to store the sub topic description, max mask allocated to that sub topic and the obtained mark
				Map<String, Map<Double,Double>> subTopicList=new LinkedHashMap<String, Map<Double,Double>>();
				
				
				Functiontested functiontested= functiontestedList.get(i);
				out.write(functiontested.getName());
				
				
				ArrayList<Expertise> expertiseList=(ArrayList<Expertise>)functiontested.getExpertises();

				for(int j=0;j<expertiseList.size();j++){
					if(j!=0){
						
						//out.newLine();
					}
					Expertise expertise=expertiseList.get(j);
				//	String pattern_0="";
				//	String pattern="";
					if(j==0){
						//pattern_0=fixedLengthString(pattern, subcompetencylength-functiontested.getName().length());
						//out.write(pattern_0+expertise.getName());
					}
					else{

						//pattern=fixedLengthString(pattern, subcompetencylength);
						//out.write(pattern+expertise.getName());
					}
					ArrayList<Testcase> testcaseList=(ArrayList<Testcase>)expertise.getTestcases();
					float maxmark=0;
					float obtainedmark=0f;
					
					for(int k=0;k<testcaseList.size();k++){
						Testcase testcase=testcaseList.get(k);
						totalMark+=Double.parseDouble(testcase.getMaxmark());
						//System.out.println(testcase.getName());
						System.out.println(testcase.getDescription());
						
						
						int flag=0;
						double featureTestMark=0;
						
						for (int i1 = 0; i1 <featureTestcaseFailListCount.size(); i1 ++)
						{
											
						if(testcaseFailList.contains(testcase.getName())&&featureTestcaseFailListCount.get(i1).contains(testcase.getName())){
						    	String totaltestCase[]=featureTestcaseFailListCount.get(i1).split(":");
															int totalCount=Integer.parseInt(totaltestCase[1]);
															int failedCount=Integer.parseInt(totaltestCase[2]);
															int totalmarkallocated=Integer.parseInt(testcase.getMaxmark());
															totalMark_FeatureTest_allocated+=totalmarkallocated;
															float singleTestCaseScore=((float)totalmarkallocated)/totalCount;
															int totalPassedTestCase=totalCount-failedCount;
															obtainedmark=singleTestCaseScore*totalPassedTestCase;
															flag=1;
															featureTestMark=obtainedmark;
															
															Map<Double,Double> marks=new LinkedHashMap<Double,Double>();
															marks.put(featureTestMark, Double.parseDouble(testcase.getMaxmark()));
															
															subTopicList.put(testcase.getShortdescription(), marks);
						}
						}
						if(!testcaseFailList.contains(testcase.getName())){
						    
							obtainedmark+=Double.parseDouble(testcase.getMaxmark());
							Map<Double,Double> marks=new LinkedHashMap<Double,Double>();
							marks.put(Double.parseDouble(testcase.getMaxmark()), Double.parseDouble(testcase.getMaxmark()));
							
							
							subTopicList.put(testcase.getShortdescription(), marks);
						}
						else
						{
							double temp=0;
//							if(testcase.getName().equals("test25TestSearchUIToDisplayProductNameWhenReturnedListIsEmpty") && !(testcaseFailList.contains("test13ReturnReorderListWhenTheMapHasOneValue"))&& !(testcaseFailList.contains("test14ReturnReorderListWhenTheMapHasNValue"))&& !(testcaseFailList.contains("test15ReturnReorderListWhenTheMapIsEmpty")))
//							{
//								temp=(Double.parseDouble(testcase.getMaxmark())*.75);
//								obtainedmark+=temp;
//							}
//							else if(testcase.getName().equals("test24TestSearchUIToDisplayProductNameWhenReturnedListHasOneValue") && !(testcaseFailList.contains("test16ReturnReorderListWhenTheMapHasOneValueThatMatchesWithReorderLevel")))
//							{
//								//obtainedmark+=(Double.parseDouble(testcase.getMaxmark())*.75);
//								temp=(Double.parseDouble(testcase.getMaxmark())*.75);
//								obtainedmark+=temp;
//							}
//							else if(testcase.getName().equals("test23TestSearchUIToDisplayProductNamesWhenReturnedListHasNValues") && !(testcaseFailList.contains("test17ReturnReorderListWhenTheMapHasNValueThatMatchesWithReorderLevel")))
//							{
//								//obtainedmark+=(Double.parseDouble(testcase.getMaxmark())*.75);
//								temp=(Double.parseDouble(testcase.getMaxmark())*.75);
//								obtainedmark+=temp;
//							}
//							else if(testcase.getName().equals("test17MainMethodTestHikeInvalid") && !(testcaseFailList.contains("test20ServiceTestisHikeValidInvalidValue")) && !(testcaseFailList.contains("test12TestUpdateProductOneUpdate")))
//							{
//								//obtainedmark+=(Double.parseDouble(testcase.getMaxmark())*.75);
//								temp=(Double.parseDouble(testcase.getMaxmark())*.75);
//								obtainedmark+=temp;
//							}
//							else if(testcase.getName().equals("test25TestMainMenu") && !(testcaseFailList.contains("test12TestUpdateProductOneUpdate")))
//							{
//								//obtainedmark+=(Double.parseDouble(testcase.getMaxmark())*.75);
//								temp=(Double.parseDouble(testcase.getMaxmark())*.75);
//								obtainedmark+=temp;
//							}
//							else if(testcase.getName().equals("test26MainMenuUpdateProduct") && !(testcaseFailList.contains("test12TestUpdateProductOneUpdate")))
//							{
//								temp=(Double.parseDouble(testcase.getMaxmark())*.75);
//								obtainedmark+=temp;
//								//obtainedmark+=(Double.parseDouble(testcase.getMaxmark())*.75);
//							}
//								else if(testcase.getName().equals("test28MainMethodForOneUpdatewithoutprice") && !(testcaseFailList.contains("test23TestUpdateProductNUpdatesMapUpdation")) && !(testcaseFailList.contains("test24TestUpdateProductOneUpdateMapUpdation")))
//							{
//								temp=(Double.parseDouble(testcase.getMaxmark()));
//								obtainedmark+=temp;
//								//obtainedmark+=(Double.parseDouble(testcase.getMaxmark())*.75);
//							}
							
							if(flag==0){
							
							Map<Double,Double> marks=new LinkedHashMap<Double,Double>();
							marks.put(temp, Double.parseDouble(testcase.getMaxmark()));
							
							
							subTopicList.put(testcase.getShortdescription(), marks);
							}
							
						}
					//	else
					//	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
						maxmark+=Double.parseDouble(testcase.getMaxmark());
					}
					
					
					
					if(testcaseFailList.isEmpty()){
					   // System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
						obtainedmark=maxmark;
					}
						actualmark+=obtainedmark;
					
					String pattern1="";
					String pattern1_0="";
					String mark=null;
					if(j==0){
						//pattern1_0=fixedLengthString(pattern1_0, comp.length()+(33-functiontested.getName().length()));//gradelength-(functiontested.getName().length()));
						mark=obtainedmark+" / "+maxmark;
						out.write(" - "+mark);
					}
					else{
						//pattern1=fixedLengthString(pattern1, gradelength);//-(pattern.length()+expertise.getName().length()));
						mark=obtainedmark+" / "+maxmark;
						out.write(" - "+mark);
					}
					
					
					Grade grade = expertise.getGrade();

					String pattern2="";
					String pattern2_0="";
					if(j==0){
					    //System.out.println("*************************"+(feedbacklength-((pattern1_0+mark).length()+functiontested.getName().length()+expertise.getName().length()+pattern_0.length())));
						//pattern2_0=fixedLengthString(pattern2_0, feedbacklength-((pattern1_0+mark).length()+functiontested.getName().length()));
						//maxmark=(maxmark/maxmark)*100;
						//System.out.println("obtained mark before:"+obtainedmark);
						obtainedmark=(obtainedmark/maxmark)*100;
						//System.out.println("obtained mark after:"+obtainedmark);
						if(obtainedmark>=70 && obtainedmark<=100 ){
							out.write("("+grade.getComplete()+")");
							out.newLine();
						}
						else if(obtainedmark>=40 && obtainedmark<=69){
							out.write("("+grade.getPartial()+")");
							out.newLine();
						}
						else if(obtainedmark>=0 && obtainedmark<=39){
							out.write("("+grade.getIncomplete()+")");
							out.newLine();
						}
							
					}
					else{
						//pattern2=fixedLengthString(pattern2, feedbacklength-((pattern1+mark).length()));
						if(obtainedmark==maxmark){
							out.write("("+grade.getComplete()+")");
							out.newLine();
						}
						else if(obtainedmark == 0){
							out.write("("+grade.getComplete()+")");
							out.newLine();
						}
						else{
							out.write("("+grade.getComplete()+")");
							out.newLine();
						}
					}
					
					
					//out.newLine();
					Set<String> keys=subTopicList.keySet();
					
					for(String x : keys){
						  Set<Double> val = subTopicList.get(x).keySet();
						  Iterator<Double> it = val.iterator();
						  while(it.hasNext())
						  {
							  
							  Double val1=it.next();
							  out.write("\t* "+x+" - "+val1+" / "+subTopicList.get(x).get(val1));
							  out.newLine();
						  }
						
					}
					
					
				}
				for(int j=0;j<150;j++){
					//out.write("-");
				}
				out.newLine();
			}
//			float goodprogpractice_score=0f;
//			if(actualmark != 0){
//			    goodprogpractice_score=generatePMDScore();
//    			System.out.println("gooood:"+goodprogpractice_score);
//    			if(goodprogpractice_score==6.0f)
//    				out.write("Comments and best practices/standards - "+goodprogpractice_score+" / 6.0(Success)");
//    			else if(goodprogpractice_score==0.0f)
//    				out.write("Comments and best practices/standards - "+goodprogpractice_score+" / 6.0(Failed)");	
//    			else
//    				out.write("Comments and best practices/standards - "+goodprogpractice_score+" / 6.0(Partial)");	
//    				actualmark+=goodprogpractice_score;
//    				out.newLine();
//    				out.newLine();
//			}
//			else{
//			    out.write("Comments and best practices/standards - "+goodprogpractice_score+" / 6.0(Failed)");	
//			}  
			//float goodprogpractice_score=generatePMDScore();
//			double coverage=coverage();
//			DecimalFormat df = new DecimalFormat();
//	        df.setMaximumFractionDigits(2);
//        	if(coverage >= 5f){
//        	    coverage=6f;
//        	}
//			if(coverage >= 5f)
//				out.write("Junit Testcases - "+df.format(coverage)+" / 6.0(Success)");
//			else if(coverage <= 0.0f)
//				out.write("Junit Testcases - 0 / 6.0(Failed)");	
//			else
//				out.write("Junit Testcases - "+df.format(coverage)+" / 6.0(Partial)");	
//			
//				//System.out.println("************************good:"+	goodprogpractice_score);
//			
//			actualmark+=coverage;
//				out.newLine();
			System.out.println("************************"+actualmark);
		//	System.out.println("Comment :=>> "+actualmark);
			new GradeLibrary().writeString("actualmark:"+actualmark, "grade.txt");
			out.close();
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	 public static ArrayList<String> getVisibleTestCases(){
	        //get the test case to show in the UI
		    
			 String filePath = "mark_config.xml";
		        File xmlFile = new File(filePath);
		        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		        DocumentBuilder dBuilder;
		        try {
		            dBuilder = dbFactory.newDocumentBuilder();
		            Document doc = dBuilder.parse(xmlFile);
		            doc.getDocumentElement().normalize();
		           // System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		            NodeList nodeList = doc.getElementsByTagName("testcase");
		           // System.out.println(nodeList.getLength());
		            String name=null;
		            boolean flag=false;
		            String nn="";
		            for (int i = 0; i < nodeList.getLength(); i++) {
		                NodeList childList = nodeList.item(i).getChildNodes();
		                
		                for (int j = 0; j < childList.getLength(); j++) {
		                    Node childNode = childList.item(j);
		                    
		                   if(childNode.getNodeName().equals("name")){
		                	   name=childNode.getTextContent();
		                    	if(childNode.getAttributes().getNamedItem("visible").getNodeValue().equals("yes")){
		                    		name=childNode.getTextContent();
		                    		nn=name;
		                   // 		System.out.println(name);
		                    		visibleTestCases.add(name);
		                    	}
		                    	else if(childNode.getAttributes().getNamedItem("visible").getNodeValue().equals("no"))
		                    	     hiddenflag=1;
		                    	
		                    }
		                    if(childNode.getNodeName().equals("message")){
		                	   //desc.put(childNode.getTextContent(), value)
		                	   desc.put(name, childNode.getTextContent());
		                   }
		                   
		                }
		                
		            }
		            return visibleTestCases;
		        }
		        catch (Exception e) {
					// TODO: handle exception
					return null;
				}
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getVisibleTestCases();
//		for(String s : getVisibleTestCases())
//		{
//			System.out.println("Visible test case "+s);
//		}
		String featureTest="target//surefire-reports//TEST-com.example.demo.FeatureTest.xml";
		//String featureTest2="ExpenseManagement//target//surefire-reports//TEST-com.example.demo.ControllerServiceDAOFeatureTest.xml";
		String functionalTest="target//surefire-reports//TEST-com.example.demo.FunctionalTest.xml";
		String springTest="target//surefire-reports//TEST-com.example.demo.SpringTest.xml";
		String webTest="target//surefire-reports//TEST-com.example.demo.WebTest.xml";
		
		int featureTests=0;
		int featureTestFailures=0;
		int featureTestErrors=0;
				
		//FeatureTest Score Calculation(score will be 10)
		String resultFeature=parseFile(featureTest,"FEATURE");
		
		//String i=parseFile(featureTest2);
		String j=parseFile(functionalTest,"FUNCTIONAL");
		String k=parseFile(springTest,"SPRING");
		String l=parseFile(webTest,"UI");
		
		
		
			System.out.println("rrrrrrrrrrrrrrrrrrr:"+resultFeature+"j:"+j+"k:"+k+"l:"+l);
		    
		if(resultFeature.equals("-1")||j.equals("-1")||k.equals("-1")||l.equals("-1"))
		{
			    System.out.println("Comment :=>> DO NOT CHANGE THE CODE SKELETON / YOU HAVE NOT IMPLEMENTED THE LOGIC AS PER PROBLEM STATEMENT/CHECK YOUR CODE HAS COMPILE TIME ERRORS");
		}
		else {
			generateReport();
			
			
			if(showCount==0){
	        	 			      System.out.println("Comment :=>>- All the sample testcases are passed.");
	                              System.out.println("Comment :=>>- Your solution is submitted for detailed evaluation against hidden test cases.");
	        	 	}
	        	 	if(showCount!=0 && hiddenflag==1 && hiddenCount==0)
	        	 	{
	        	 	    System.out.println("Comment :=>>- Your solution is submitted for detailed evaluation against hidden test cases.");
	        	 	}
	        	 	if(hiddenflag==1){
		 			    if(hiddenCount==0){
		 			         // System.out.println("Comment :=>>- All hidden test cases passed");
		 			    }
		 			    else {
		 			        
		 			          System.out.println("Comment :=>>- "+"Few hidden test case(s) failed.");
		 			          //System.out.println("Comment :=>>- Your solution is submitted for detailed evaluation against hidden test cases.");
		 			           // Set<String> keys = hiddenDtls.keySet();
		 			           // for(String s : keys){
		 			    	      //  System.out.println("Comment :=>>- ---> "+hiddenDtls.get(s));
		 			           // }
		 			    }
	        	 	}
			}

	}

}







