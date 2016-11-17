package Student;



public class Data {

	public static void main(String[] args) {
		
final int studentdata = 4;
students[] student = new students [studentdata];
student [0] = new students("Иванов Иван Иванович", 5, 328 );
student [1] = new students("Петров Петр Петрович", 4, 864 );
student [2] = new students("Тимофеев Олег Янович", 3, 692 );
	System.out.println(1);
	}

	
private static void studentD(students[] student) {
		for(int i = 0; i < student.length; ++i) {
			students students = student[i];
			String studentInString = studentToString(student);
			System.out.printf("%d. %s%n", i + 1, 
					studentInString);
		}
}


private static String studentToString(students[] student) {
	
	return null;
}
}