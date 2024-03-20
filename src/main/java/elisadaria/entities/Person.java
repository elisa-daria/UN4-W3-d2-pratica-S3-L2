package elisadaria.entities;

import elisadaria.enums.Gender;

import java.time.LocalDate;
import java.util.List;

public class Person {
    private long ID;
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
    private Gender gender;
    private List <Attendance> attendancesList;
}
