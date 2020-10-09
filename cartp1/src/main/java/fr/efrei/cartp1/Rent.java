package fr.efrei.cartp1;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Rent {

    @Id
    private String id_Rent;
    private Date beginRent;
    private Date endRent;

    public String getId_Rent() {
        return id_Rent;
    }

    public Date getBeginRent() {
        return beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setId_Rent(String id_Rent) {
        this.id_Rent = id_Rent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return Objects.equals(id_Rent, rent.id_Rent) &&
                Objects.equals(beginRent, rent.beginRent) &&
                Objects.equals(endRent, rent.endRent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_Rent, beginRent, endRent);
    }
}
