package elisadaria.entities;

import elisadaria.enums.AttendenceType;
import jakarta.persistence.*;

@Entity
@Table(name = "attendances")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private AttendenceType state;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name="person_id",nullable = false,unique = true)
    private Person person;

    public Attendance() {
    }

    public Attendance(Person person, AttendenceType state, Event event) {
        this.person = person;
        this.state = state;
        this.event = event;
    }

    public long getID() {
        return ID;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public AttendenceType getState() {
        return state;
    }

    public void setState(AttendenceType state) {
        this.state = state;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "ID=" + ID +
                ", state=" + state +
                '}';
    }
}
