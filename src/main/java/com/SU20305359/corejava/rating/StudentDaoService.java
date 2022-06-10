package com.SU20305359.corejava.rating;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.stream.Collectors;

		public class StudentDaoService {
		static List<StudentData> studentList = new ArrayList<StudentData>();
		static Map<String, Integer> map = new HashMap<>();
		
		public static void addStudentData() throws Exception{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\susmi\\Downloads\\StudentData.csv"));
			List<String> data = Arrays.asList("name", "subject", "assignment_category", "date_Of_Submission","points");
			String string = null;
			StudentData student= null;
			while((string =br.readLine())!=null) {
				String[] arr = string.split(",");
				student = new StudentData(arr[data.indexOf("name")], arr[data.indexOf("subject")], arr[data.indexOf("assignment_category")],
						arr[data.indexOf("date_Of_Submission")], Integer.valueOf(arr[data.indexOf("points")]));
				studentList.add(student);
			}
			map.put("test", 40);
			map.put("quiz", 20);
			map.put("lab", 10);
			map.put("project", 30);
			br.close();
		}
		
		public static List<StudentData> searchByStudentName(String name){
			return studentList.stream().filter(val->val.getName().equals(name)).collect(Collectors.toList());
		}
		
		public static List<StudentData> searchBySubjectName(String subName){
			return studentList.stream().filter(val->val.getSubject().equals(subName)).collect(Collectors.toList());
		}
		
		public static void main(String[] args) throws Exception {
			addStudentData();
			System.out.println(searchByStudentName("Ananth"));
			Map<String, List<StudentData>> hashMap = new HashMap<>();
			for(StudentData student: searchByStudentName("Ananth")) {
			     List<StudentData> list = hashMap.get(student.getSubject());
			     if(list==null) {
			    	 list = new ArrayList<StudentData>();
			    	 list.add(student);
			    	 hashMap.put(student.getSubject(),list);
			     }else {
			    	 list.add(student);
			     }
			System.out.println(hashMap);
			for(Map.Entry<String, List<StudentData>>entry: hashMap.entrySet()) {
			String subject = entry.getKey();
			List<StudentData> studentList = entry.getValue();
		System.out.println(subject);
			System.out.println("************************************************************");
			for(Map.Entry<String, Integer>firstEntry: map.entrySet()) {
				String str = firstEntry.getKey();
				int points = firstEntry.getValue();
				float score =0;
				for(StudentData student1 : studentList) {
					if(student1.getAssignment_category().toLowerCase().concat(str) != null) {
						score +=(points)*student1.getPoints()/100;
					}
				}
				System.out.println(str+"\t");
				//double result = ((points/2)*score)/100;
				System.out.println(score);
			}
			
		}
	}
		}
	}


