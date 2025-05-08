package jdbc_sample.model;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class EmployeeEntity {

    private Long id;

    private String name;

    private Double salary;

    private OffsetDateTime birthday;

}
