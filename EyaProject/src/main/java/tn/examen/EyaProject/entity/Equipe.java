package tn.examen.EyaProject.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;
    private String nom_equipe;
    private String Description_Equipe;
    private int satisfactionSM;
    private int satisfactionPO;
    private String chat;
    private DISPONIBILITE disponibilites;
    @ManyToMany(
            mappedBy = "equipes",
            cascade = {CascadeType.ALL}
    )
    private Set<User> users;
    @ManyToMany(
            cascade = {CascadeType.ALL}
    )
    private Set<Projet> projets;

    public int getId() {
        return this.id;
    }

    public String getNom_equipe() {
        return this.nom_equipe;
    }

    public String getDescription_Equipe() {
        return this.Description_Equipe;
    }

    public int getSatisfactionSM() {
        return this.satisfactionSM;
    }

    public int getSatisfactionPO() {
        return this.satisfactionPO;
    }

    public String getChat() {
        return this.chat;
    }

    public DISPONIBILITE getDisponibilites() {
        return this.disponibilites;
    }

    public Set<User> getUsers() {
        return this.users;
    }

    public Set<Projet> getProjets() {
        return this.projets;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setNom_equipe(final String nom_equipe) {
        this.nom_equipe = nom_equipe;
    }

    public void setDescription_Equipe(final String Description_Equipe) {
        this.Description_Equipe = Description_Equipe;
    }

    public void setSatisfactionSM(final int satisfactionSM) {
        this.satisfactionSM = satisfactionSM;
    }

    public void setSatisfactionPO(final int satisfactionPO) {
        this.satisfactionPO = satisfactionPO;
    }

    public void setChat(final String chat) {
        this.chat = chat;
    }

    public void setDisponibilites(final DISPONIBILITE disponibilites) {
        this.disponibilites = disponibilites;
    }

    public void setUsers(final Set<User> users) {
        this.users = users;
    }

    public void setProjets(final Set<Projet> projets) {
        this.projets = projets;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Equipe)) {
            return false;
        } else {
            Equipe other = (Equipe)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getId() != other.getId()) {
                return false;
            } else if (this.getSatisfactionSM() != other.getSatisfactionSM()) {
                return false;
            } else if (this.getSatisfactionPO() != other.getSatisfactionPO()) {
                return false;
            } else {
                Object this$nom_equipe = this.getNom_equipe();
                Object other$nom_equipe = other.getNom_equipe();
                if (this$nom_equipe == null) {
                    if (other$nom_equipe != null) {
                        return false;
                    }
                } else if (!this$nom_equipe.equals(other$nom_equipe)) {
                    return false;
                }

                Object this$Description_Equipe = this.getDescription_Equipe();
                Object other$Description_Equipe = other.getDescription_Equipe();
                if (this$Description_Equipe == null) {
                    if (other$Description_Equipe != null) {
                        return false;
                    }
                } else if (!this$Description_Equipe.equals(other$Description_Equipe)) {
                    return false;
                }

                label76: {
                    Object this$chat = this.getChat();
                    Object other$chat = other.getChat();
                    if (this$chat == null) {
                        if (other$chat == null) {
                            break label76;
                        }
                    } else if (this$chat.equals(other$chat)) {
                        break label76;
                    }

                    return false;
                }

                Object this$disponibilites = this.getDisponibilites();
                Object other$disponibilites = other.getDisponibilites();
                if (this$disponibilites == null) {
                    if (other$disponibilites != null) {
                        return false;
                    }
                } else if (!this$disponibilites.equals(other$disponibilites)) {
                    return false;
                }

                Object this$users = this.getUsers();
                Object other$users = other.getUsers();
                if (this$users == null) {
                    if (other$users != null) {
                        return false;
                    }
                } else if (!this$users.equals(other$users)) {
                    return false;
                }

                Object this$projets = this.getProjets();
                Object other$projets = other.getProjets();
                if (this$projets == null) {
                    if (other$projets != null) {
                        return false;
                    }
                } else if (!this$projets.equals(other$projets)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Equipe;
    }

    public int hashCode() {
        int PRIME = 31;
        int result = 1;
        result = result * 59 + this.getId();
        result = result * 59 + this.getSatisfactionSM();
        result = result * 59 + this.getSatisfactionPO();
        Object $nom_equipe = this.getNom_equipe();
        result = result * 59 + ($nom_equipe == null ? 43 : $nom_equipe.hashCode());
        Object $Description_Equipe = this.getDescription_Equipe();
        result = result * 59 + ($Description_Equipe == null ? 43 : $Description_Equipe.hashCode());
        Object $chat = this.getChat();
        result = result * 59 + ($chat == null ? 43 : $chat.hashCode());
        Object $disponibilites = this.getDisponibilites();
        result = result * 59 + ($disponibilites == null ? 43 : $disponibilites.hashCode());
        Object $users = this.getUsers();
        result = result * 59 + ($users == null ? 43 : $users.hashCode());
        Object $projets = this.getProjets();
        result = result * 59 + ($projets == null ? 43 : $projets.hashCode());
        return result;
    }

    public Equipe(final int id, final String nom_equipe, final String Description_Equipe, final int satisfactionSM, final int satisfactionPO, final String chat, final DISPONIBILITE disponibilites, final Set<User> users, final Set<Projet> projets) {
        this.id = id;
        this.nom_equipe = nom_equipe;
        this.Description_Equipe = Description_Equipe;
        this.satisfactionSM = satisfactionSM;
        this.satisfactionPO = satisfactionPO;
        this.chat = chat;
        this.disponibilites = disponibilites;
        this.users = users;
        this.projets = projets;
    }

    public Equipe() {
    }
}
