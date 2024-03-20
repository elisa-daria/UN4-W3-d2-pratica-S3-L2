package elisadaria.entities;

import elisadaria.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "people")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
    private Gender gender;
    @OneToMany(mappedBy = "person")
    private List <Attendance> attendancesList;


    public long getID() {
        return ID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Attendance> getAttendancesList() {
        return attendancesList;
    }

    public void setAttendancesList(List<Attendance> attendancesList) {
        this.attendancesList = attendancesList;
    }

    public Person() {
    }

    public Person(String name, String surname, String email, LocalDate dateOfBirth, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", attendancesList=" + attendancesList +
                '}';
    }
}


