package elisadaria.dao;

import elisadaria.entities.Event;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventsDAO {
    EntityManager em;

    public EventsDAO(EntityManager em) {
        this.em = em;
    }

    //methods
    public void save(Event event){
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.persist(event);
        transaction.commit();
        System.out.println("Evento "+ event.getDescription()+" salvato");
    }
}
