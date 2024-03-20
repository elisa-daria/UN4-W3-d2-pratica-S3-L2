package elisadaria.dao;

import elisadaria.entities.Event;
import elisadaria.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LocationDAO {

    EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    //methods
    public void save(Location location){
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.persist(location);
        transaction.commit();
        System.out.println("Location "+ location.getName()+" salvata");
    }
    public Location getById(long location_id){
        Location location=em.find(Location.class,location_id);
        if(location.equals(null))throw new RuntimeException();
        else{
            System.out.println(location.toString());
            return location;
        }
    }
    public void delete(long location_id){
        Location locationToDelete=this.getById(location_id);
        EntityTransaction transaction=em.getTransaction();
        transaction.begin();
        em.remove(locationToDelete);
        transaction.commit();
        System.out.println("Location "+ locationToDelete.toString()+" eliminata");
    }
}
