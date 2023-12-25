package org.nadim.converter;
import java.io.File;
import org.nadim.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
	public static void main(String [] args) throws Exception {
		File f   = new File("student.json");
		ObjectMapper om = new ObjectMapper();
		Student std = om.readValue(f, Student.class);
		System.out.println(std);
	}
}
