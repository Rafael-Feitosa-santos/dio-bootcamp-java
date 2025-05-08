package jdbc_sample;

import jdbc_sample.model.EmployeeDAO;
import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcSampleApplication {

	private static EmployeeDAO employeeDAO = new EmployeeDAO();

	public static void main(String[] args) {
	}

}
