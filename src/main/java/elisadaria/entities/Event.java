package elisadaria.entities;

import elisadaria.enums.EventType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "evento")
public class Event {
    //attributes
    @Id
    @Column(name="event_id")
    private int id;
    @Column(name = "nome_evento")
    private String title;
    @Column(name="data_evento")
    private LocalDate eventDate;
    private String description;
    @Column(name = "tipo_evento")
    private EventType tipoEvento;
    private int nMaxPartecipanti;

    //constructors

    public Event() {
    }

    public Event(String title, LocalDate eventDate, String description, EventType tipoEvento,int nMaxPartecipanti) {
        this.setTitle(title);
        this.setEventDate(eventDate);
        this.setDescription(description);
        this.setTipoEvento(tipoEvento);
        this.setnMaxPartecipanti(nMaxPartecipanti);
    }

    //getters

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public String getDescription() {
        return description;
    }

    public EventType getTipoEvento() {
        return tipoEvento;
    }

    public int getnMaxPartecipanti() {
        return nMaxPartecipanti;
    }
    //setters


    public void setTitle(String title) {
        this.title = title;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTipoEvento(EventType tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setnMaxPartecipanti(int nMaxPartecipanti) {
        this.nMaxPartecipanti = nMaxPartecipanti;
    }

    //methods

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", eventDate=" + eventDate +
                ", description='" + description + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", nMaxPartecipanti=" + nMaxPartecipanti +
                '}';
    }
}
