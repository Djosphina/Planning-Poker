package tn.examen.EyaProject.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Analyse implements Serializable {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;
    private String Description;
    private Date date_analyse;
    @OneToOne
    private Sprint sprint;
    @OneToOne
    private Projet projet;
    @OneToOne
    private Session session;

    public int getId() {
        return this.id;
    }

    public String getDescription() {
        return this.Description;
    }

    public Date getDate_analyse() {
        return this.date_analyse;
    }

    public Sprint getSprint() {
        return this.sprint;
    }

    public Projet getProjet() {
        return this.projet;
    }

    public Session getSession() {
        return this.session;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setDescription(final String Description) {
        this.Description = Description;
    }

    public void setDate_analyse(final Date date_analyse) {
        this.date_analyse = date_analyse;
    }

    public void setSprint(final Sprint sprint) {
        this.sprint = sprint;
    }

    public void setProjet(final Projet projet) {
        this.projet = projet;
    }

    public void setSession(final Session session) {
        this.session = session;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Analyse)) {
            return false;
        } else {
            Analyse other = (Analyse)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getId() != other.getId()) {
                return false;
            } else {
                label73: {
                    Object this$Description = this.getDescription();
                    Object other$Description = other.getDescription();
                    if (this$Description == null) {
                        if (other$Description == null) {
                            break label73;
                        }
                    } else if (this$Description.equals(other$Description)) {
                        break label73;
                    }

                    return false;
                }

                Object this$date_analyse = this.getDate_analyse();
                Object other$date_analyse = other.getDate_analyse();
                if (this$date_analyse == null) {
                    if (other$date_analyse != null) {
                        return false;
                    }
                } else if (!this$date_analyse.equals(other$date_analyse)) {
                    return false;
                }

                label59: {
                    Object this$sprint = this.getSprint();
                    Object other$sprint = other.getSprint();
                    if (this$sprint == null) {
                        if (other$sprint == null) {
                            break label59;
                        }
                    } else if (this$sprint.equals(other$sprint)) {
                        break label59;
                    }

                    return false;
                }

                Object this$projet = this.getProjet();
                Object other$projet = other.getProjet();
                if (this$projet == null) {
                    if (other$projet != null) {
                        return false;
                    }
                } else if (!this$projet.equals(other$projet)) {
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
        return other instanceof Analyse;
    }

    public int hashCode() {
        int PRIME = 31;
        int result = 1;
        result = result * 59 + this.getId();
        Object $Description = this.getDescription();
        result = result * 59 + ($Description == null ? 43 : $Description.hashCode());
        Object $date_analyse = this.getDate_analyse();
        result = result * 59 + ($date_analyse == null ? 43 : $date_analyse.hashCode());
        Object $sprint = this.getSprint();
        result = result * 59 + ($sprint == null ? 43 : $sprint.hashCode());
        Object $projet = this.getProjet();
        result = result * 59 + ($projet == null ? 43 : $projet.hashCode());
        Object $session = this.getSession();
        result = result * 59 + ($session == null ? 43 : $session.hashCode());
        return result;
    }

    public Analyse(final int id, final String Description, final Date date_analyse, final Sprint sprint, final Projet projet, final Session session) {
        this.id = id;
        this.Description = Description;
        this.date_analyse = date_analyse;
        this.sprint = sprint;
        this.projet = projet;
        this.session = session;
    }

    public Analyse() {
    }
}
