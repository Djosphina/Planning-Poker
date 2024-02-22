package tn.examen.EyaProject.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Historique implements Serializable {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id_historique;
    private String description;
    private int estimation_finale;
    private Date date;
    @OneToOne(
            mappedBy = "historique"
    )
    private Session session;

    public int getId_historique() {
        return this.id_historique;
    }

    public String getDescription() {
        return this.description;
    }

    public int getEstimation_finale() {
        return this.estimation_finale;
    }

    public Date getDate() {
        return this.date;
    }

    public Session getSession() {
        return this.session;
    }

    public void setId_historique(final int id_historique) {
        this.id_historique = id_historique;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setEstimation_finale(final int estimation_finale) {
        this.estimation_finale = estimation_finale;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public void setSession(final Session session) {
        this.session = session;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Historique)) {
            return false;
        } else {
            Historique other = (Historique)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getId_historique() != other.getId_historique()) {
                return false;
            } else if (this.getEstimation_finale() != other.getEstimation_finale()) {
                return false;
            } else {
                label52: {
                    Object this$description = this.getDescription();
                    Object other$description = other.getDescription();
                    if (this$description == null) {
                        if (other$description == null) {
                            break label52;
                        }
                    } else if (this$description.equals(other$description)) {
                        break label52;
                    }

                    return false;
                }

                Object this$date = this.getDate();
                Object other$date = other.getDate();
                if (this$date == null) {
                    if (other$date != null) {
                        return false;
                    }
                } else if (!this$date.equals(other$date)) {
                    return false;
                }

                Object this$session = this.getSession();
                Object other$session = other.getSession();
                if (this$session == null) {
                    if (other$session != null) {
                        return false;
                    }
                } else if (!this$session.equals(other$session)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Historique;
    }

    public int hashCode() {
        int PRIME = 31;
        int result = 1;
        result = result * 59 + this.getId_historique();
        result = result * 59 + this.getEstimation_finale();
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        Object $date = this.getDate();
        result = result * 59 + ($date == null ? 43 : $date.hashCode());
        Object $session = this.getSession();
        result = result * 59 + ($session == null ? 43 : $session.hashCode());
        return result;
    }

    public Historique(final int id_historique, final String description, final int estimation_finale, final Date date, final Session session) {
        this.id_historique = id_historique;
        this.description = description;
        this.estimation_finale = estimation_finale;
        this.date = date;
        this.session = session;
    }

    public Historique() {
    }
}