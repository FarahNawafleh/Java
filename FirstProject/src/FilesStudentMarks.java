
public class FilesStudentMarks {
	public static void main(String[] args) {
		String marks = FilesReadWrite.readFile(
				"C:\\Users\\Farah\\Desktop\\Upskilling\\Cohort5_Java_FarahNawafleh\\FirstProject\\src\\marks.txt");
		System.out.println(marks);
			String studentsMarks[] = marks.split("\r\n");
			for (int i = 0; i < studentsMarks.length; i++) {
				String student = studentsMarks[i];
				System.out.println("Student Info: \t" + student);
			}

		for (String student : studentsMarks) {
			String[] this_student = student.split(",");
			String name = this_student[0];
			int sum = 0;
			for (int i = 1; i < this_student.length; i++) {
				int mark = Integer.parseInt(this_student[i]);
				sum += mark;
			}
			int avg = sum / (this_student.length - 1);
			System.out.println("Student " + name + "\t sum =" + sum + " avg= " + avg);
		}
	}

}
