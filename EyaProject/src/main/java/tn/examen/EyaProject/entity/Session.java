package tn.examen.EyaProject.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Session {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;
    private Date start_date;
    private String estimation;
    @OneToOne
    private Historique historique;

    public int getId() {
        return this.id;
    }

    public Date getStart_date() {
        return this.start_date;
    }

    public String getEstimation() {
        return this.estimation;
    }

    public Historique getHistorique() {
        return this.historique;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setStart_date(final Date start_date) {
        this.start_date = start_date;
    }

    public void setEstimation(final String estimation) {
        this.estimation = estimation;
    }

    public void setHistorique(final Historique historique) {
        this.historique = historique;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Session)) {
            return false;
        } else {
            Session other = (Session)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getId() != other.getId()) {
                return false;
            } else {
                label49: {
                    Object this$start_date = this.getStart_date();
                    Object other$start_date = other.getStart_date();
                    if (this$start_date == null) {
                        if (other$start_date == null) {
                            break label49;
                        }
                    } else if (this$start_date.equals(other$start_date)) {
                        break label49;
                    }

                    return false;
                }

                Object this$estimation = this.getEstimation();
                Object other$estimation = other.getEstimation();
                if (this$estimation == null) {
                    if (other$estimation != null) {
                        return false;
                    }
                } else if (!this$estimation.equals(other$estimation)) {
                    return false;
                }

                Object this$historique = this.getHistorique();
                Object other$historique = other.getHistorique();
                if (this$historique == null) {
                    if (other$historique != null) {
                        return false;
                    }
                } else if (!this$historique.equals(other$historique)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Session;
    }

    public int hashCode() {
        int PRIME = 31;
        int result = 1;
        result = result * 59 + this.getId();
        Object $start_date = this.getStart_date();
        result = result * 59 + ($start_date == null ? 43 : $start_date.hashCode());
        Object $estimation = this.getEstimation();
        result = result * 59 + ($estimation == null ? 43 : $estimation.hashCode());
        Object $historique = this.getHistorique();
        result = result * 59 + ($historique == null ? 43 : $historique.hashCode());
        return result;
    }

    public Session(final int id, final Date start_date, final String estimation, final Historique historique) {
        this.id = id;
        this.start_date = start_date;
        this.estimation = estimation;
        this.historique = historique;
    }

    public Session() {
    }
}