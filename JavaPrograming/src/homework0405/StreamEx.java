package homework0405;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import homework0405.clazz.Student;

public class StreamEx {
	
	public static void main(String[] args) {

		//스트림 01
//		List<Integer> intList = new ArrayList<Integer>();
//		
//		for(int i = 0; i < 10; i++) {
//			intList.add((int)(Math.random() * 10) + 1);
//			System.out.print(intList.get(i) + ", ");
//		}
//		
//		Stream<Integer> intStream = intList.stream();
//		Stream<Integer> intMulStream =
//				intStream.map(i -> i * 3);
//		
//		System.out.println();
//		intMulStream.forEach(i -> System.out.print(i + ", "));
		
		//스트림 02
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺽정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
//		Stream<Student> sStream = studentList.stream();
//		
//		Stream<Student> newStream =
//				sStream.filter(student -> 
//				student.getScore() >= 95);
//		
//		
//		
//		Stream<Student> aStream =
//				newStream.map(student ->{ 
//				student.setGrade("A+");
//				return student;
//				});
//		
//		aStream.forEach(student -> System.out.println(student.toString()));
		
		studentList.stream()
				   .filter(s -> s.getScore() >= 95)
				   .map(s -> {
					   s.setGrade("A+");
					   return s;
				   })
				   .forEach(s -> System.out.println(s.toString()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
