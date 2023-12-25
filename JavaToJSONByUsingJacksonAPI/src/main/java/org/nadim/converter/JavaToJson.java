package org.nadim.converter;
import java.io.File;
import org.nadim.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JavaToJson {
	public static void main(String [] args) throws Exception {
		Student st = new Student(101,"Nadim", "CSE");
		ObjectMapper om = new ObjectMapper();
		om.writeValue(new File("student.json"), st);
	}
}
