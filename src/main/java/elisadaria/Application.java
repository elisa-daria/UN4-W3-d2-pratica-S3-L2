package elisadaria;

import elisadaria.dao.EventsDAO;
import elisadaria.dao.LocationDAO;
import elisadaria.entities.Event;
import elisadaria.entities.Location;
import elisadaria.enums.EventType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
static EntityManagerFactory emf= Persistence.createEntityManagerFactory("gestione-eventi");

    public static void main(String[] args) {
        EntityManager em=emf.createEntityManager();
        EventsDAO evd=new EventsDAO(em);
        LocationDAO ld=new LocationDAO(em);
        Event birthday=new Event("Compleanno Bee", LocalDate.of(2024,5,1),"big big party", EventType.PRIVATO,50);
        Event blabla=new Event("BLA party",LocalDate.ofYearDay(2025,5),"hfakgklsfgaogfjlasfgl",EventType.PUBBLICO,800);
        Event coco= new Event("Cocorico-Easter-Party",LocalDate.of(2024,3,31),"deborah deluca djset",EventType.PUBBLICO,2000);
//        evd.save(birthday);
//        evd.save(blabla);
//        evd.save(coco);
//        evd.getById(5);
       birthday= evd.getById(1);
        Location space=new Location("B-Day","universe",birthday);
//        ld.save(space);






        System.out.println("Hello World!");
        em.close();
        emf.close();
    }
}
