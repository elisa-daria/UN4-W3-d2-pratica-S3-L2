package elisadaria.dao;

import elisadaria.entities.Attendance;
import elisadaria.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PersonDAO {
    EntityManager em;

    public PersonDAO(EntityManager em) {
        this.em = em;
    }

    //methods
    public void save(Person person){
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.persist(person);
        transaction.commit();
        System.out.println("persona"+ person.toString()+" salvata");
    }
    public Person getById(long person_id){
        Person person=em.find(Person.class,person_id);
        if(person.equals(null))throw new RuntimeException();
        else{
            System.out.println(person.toString());
            return person;
        }
    }
    public void delete(long person_id){
        Person personToDelete=this.getById(person_id);
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.remove(personToDelete);
        transaction.commit();
        System.out.println("persona"+ personToDelete.toString()+" eliminata");
    }
}
