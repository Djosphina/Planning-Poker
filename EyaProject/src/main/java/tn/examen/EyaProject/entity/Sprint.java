package tn.examen.EyaProject.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(
        name = "Sprint"
)
public class Sprint implements Serializable {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "idSprint"
    )
    private long id;
    private String self;
    private String state;
    private String name;
    private String startDate;
    private String endDate;
    private String createdDate;
    private long originBoardId;
    private String goal;
    @ManyToOne
    Projet projet;
    @OneToMany(
            cascade = {CascadeType.ALL},
            mappedBy = "sprint"
    )
    private Set<Ticket> Tickets;

    public long getId() {
        return this.id;
    }

    public String getSelf() {
        return this.self;
    }

    public String getState() {
        return this.state;
    }

    public String getName() {
        return this.name;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public long getOriginBoardId() {
        return this.originBoardId;
    }

    public String getGoal() {
        return this.goal;
    }

    public Projet getProjet() {
        return this.projet;
    }

    public Set<Ticket> getTickets() {
        return this.Tickets;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public void setSelf(final String self) {
        this.self = self;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(final String endDate) {
        this.endDate = endDate;
    }

    public void setCreatedDate(final String createdDate) {
        this.createdDate = createdDate;
    }

    public void setOriginBoardId(final long originBoardId) {
        this.originBoardId = originBoardId;
    }

    public void setGoal(final String goal) {
        this.goal = goal;
    }

    public void setProjet(final Projet projet) {
        this.projet = projet;
    }

    public void setTickets(final Set<Ticket> Tickets) {
        this.Tickets = Tickets;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Sprint)) {
            return false;
        } else {
            Sprint other = (Sprint)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getId() != other.getId()) {
                return false;
            } else if (this.getOriginBoardId() != other.getOriginBoardId()) {
                return false;
            } else {
                label124: {
                    Object this$self = this.getSelf();
                    Object other$self = other.getSelf();
                    if (this$self == null) {
                        if (other$self == null) {
                            break label124;
                        }
                    } else if (this$self.equals(other$self)) {
                        break label124;
                    }

                    return false;
                }

                Object this$state = this.getState();
                Object other$state = other.getState();
                if (this$state == null) {
                    if (other$state != null) {
                        return false;
                    }
                } else if (!this$state.equals(other$state)) {
                    return false;
                }

                label110: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label110;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label110;
                    }

                    return false;
                }

                label103: {
                    Object this$startDate = this.getStartDate();
                    Object other$startDate = other.getStartDate();
                    if (this$startDate == null) {
                        if (other$startDate == null) {
                            break label103;
                        }
                    } else if (this$startDate.equals(other$startDate)) {
                        break label103;
                    }

                    return false;
                }

                Object this$endDate = this.getEndDate();
                Object other$endDate = other.getEndDate();
                if (this$endDate == null) {
                    if (other$endDate != null) {
                        return false;
                    }
                } else if (!this$endDate.equals(other$endDate)) {
                    return false;
                }

                label89: {
                    Object this$createdDate = this.getCreatedDate();
                    Object other$createdDate = other.getCreatedDate();
                    if (this$createdDate == null) {
                        if (other$createdDate == null) {
                            break label89;
                        }
                    } else if (this$createdDate.equals(other$createdDate)) {
                        break label89;
                    }

                    return false;
                }

                label82: {
                    Object this$goal = this.getGoal();
                    Object other$goal = other.getGoal();
                    if (this$goal == null) {
                        if (other$goal == null) {
                            break label82;
                        }
                    } else if (this$goal.equals(other$goal)) {
                        break label82;
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

                Object this$Tickets = this.getTickets();
                Object other$Tickets = other.getTickets();
                if (this$Tickets == null) {
                    if (other$Tickets != null) {
                        return false;
                    }
                } else if (!this$Tickets.equals(other$Tickets)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Sprint;
    }

    public int hashCode() {
        int PRIME = 31;
        int result = 1;
        long $id = this.getId();
        result = result * 59 + (int)($id >>> 32 ^ $id);
        long $originBoardId = this.getOriginBoardId();
        result = result * 59 + (int)($originBoardId >>> 32 ^ $originBoardId);
        Object $self = this.getSelf();
        result = result * 59 + ($self == null ? 43 : $self.hashCode());
        Object $state = this.getState();
        result = result * 59 + ($state == null ? 43 : $state.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $startDate = this.getStartDate();
        result = result * 59 + ($startDate == null ? 43 : $startDate.hashCode());
        Object $endDate = this.getEndDate();
        result = result * 59 + ($endDate == null ? 43 : $endDate.hashCode());
        Object $createdDate = this.getCreatedDate();
        result = result * 59 + ($createdDate == null ? 43 : $createdDate.hashCode());
        Object $goal = this.getGoal();
        result = result * 59 + ($goal == null ? 43 : $goal.hashCode());
        Object $projet = this.getProjet();
        result = result * 59 + ($projet == null ? 43 : $projet.hashCode());
        Object $Tickets = this.getTickets();
        result = result * 59 + ($Tickets == null ? 43 : $Tickets.hashCode());
        return result;
    }

    public String toString() {
        long var10000 = this.getId();
        return "Sprint(id=" + var10000 + ", self=" + this.getSelf() + ", state=" + this.getState() + ", name=" + this.getName() + ", startDate=" + this.getStartDate() + ", endDate=" + this.getEndDate() + ", createdDate=" + this.getCreatedDate() + ", originBoardId=" + this.getOriginBoardId() + ", goal=" + this.getGoal() + ", projet=" + this.getProjet() + ", Tickets=" + this.getTickets() + ")";
    }

    public Sprint() {
    }

    public Sprint(final long id, final String self, final String state, final String name, final String startDate, final String endDate, final String createdDate, final long originBoardId, final String goal, final Projet projet, final Set<Ticket> Tickets) {
        this.id = id;
        this.self = self;
        this.state = state;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdDate = createdDate;
        this.originBoardId = originBoardId;
        this.goal = goal;
        this.projet = projet;
        this.Tickets = Tickets;
    }
}

