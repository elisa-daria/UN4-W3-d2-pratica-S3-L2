package elisadaria;

import elisadaria.entities.Event;
import elisadaria.enums.EventType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
static EntityManagerFactory emf= Persistence.createEntityManagerFactory("un4w3d2");

    public static void main(String[] args) {
        EntityManager em=emf.createEntityManager();
        Event birthday=new Event("Compleanno Bee", LocalDate.of(2024,5,1),"big big party", EventType.PRIVATO,50);
        Event blabla=new Event("BLA party",LocalDate.ofYearDay(2025,5),"hfakgklsfgaogfjlasfgl",EventType.PUBBLICO,800);
        Event Coco= new Event("Cocorico-Easter-Party",LocalDate.of(2024,3,31),"deborah deluca djset",EventType.PUBBLICO,2000);




        System.out.println("Hello World!");
        em.close();
        emf.close();
    }
}
