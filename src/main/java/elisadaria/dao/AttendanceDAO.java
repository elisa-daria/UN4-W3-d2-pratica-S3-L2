package elisadaria.dao;

import elisadaria.entities.Attendance;
import elisadaria.entities.Event;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class AttendanceDAO {
    EntityManager em;

    public AttendanceDAO(EntityManager em) {
        this.em = em;
    }

    //methods
    public void save(Attendance attendance){
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.persist(attendance);
        transaction.commit();
        System.out.println("attendance "+ attendance.toString()+" salvata");
    }
    public Attendance getById(long attendance_id){
        Attendance attendance=em.find(Attendance.class,attendance_id);
        if(attendance.equals(null))throw new RuntimeException();
        else{
            System.out.println(attendance.toString());
            return attendance;
        }
    }
    public void delete(long attendance_id){
        Attendance attendanceToDelete=this.getById(attendance_id);
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.remove(attendanceToDelete);
        transaction.commit();
        System.out.println("attendance"+ attendanceToDelete.toString()+" eliminata");
    }
}
