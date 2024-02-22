package tn.examen.EyaProject.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int idUser;
    private String nom;
    private String prenom;
    private String username;
    private String mail;
    private String mdp;
    private Date date_naissance;
    @Enumerated(EnumType.STRING)
    private Sexe sexe;
    private String adresse;
    private String num;
    private boolean Status;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String image;
    @ManyToMany(
            cascade = {CascadeType.ALL}
    )
    private Set<Equipe> equipes;

    public int getIdUser() {
        return this.idUser;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getUsername() {
        return this.username;
    }

    public String getMail() {
        return this.mail;
    }

    public String getMdp() {
        return this.mdp;
    }

    public Date getDate_naissance() {
        return this.date_naissance;
    }

    public Sexe getSexe() {
        return this.sexe;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public String getNum() {
        return this.num;
    }

    public boolean isStatus() {
        return this.Status;
    }

    public Role getRole() {
        return this.role;
    }

    public String getImage() {
        return this.image;
    }

    public Set<Equipe> getEquipes() {
        return this.equipes;
    }

    public void setIdUser(final int idUser) {
        this.idUser = idUser;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public void setMail(final String mail) {
        this.mail = mail;
    }

    public void setMdp(final String mdp) {
        this.mdp = mdp;
    }

    public void setDate_naissance(final Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public void setSexe(final Sexe sexe) {
        this.sexe = sexe;
    }

    public void setAdresse(final String adresse) {
        this.adresse = adresse;
    }

    public void setNum(final String num) {
        this.num = num;
    }

    public void setStatus(final boolean Status) {
        this.Status = Status;
    }

    public void setRole(final Role role) {
        this.role = role;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public void setEquipes(final Set<Equipe> equipes) {
        this.equipes = equipes;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof User)) {
            return false;
        } else {
            User other = (User)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getIdUser() != other.getIdUser()) {
                return false;
            } else if (this.isStatus() != other.isStatus()) {
                return false;
            } else {
                label160: {
                    Object this$nom = this.getNom();
                    Object other$nom = other.getNom();
                    if (this$nom == null) {
                        if (other$nom == null) {
                            break label160;
                        }
                    } else if (this$nom.equals(other$nom)) {
                        break label160;
                    }

                    return false;
                }

                label153: {
                    Object this$prenom = this.getPrenom();
                    Object other$prenom = other.getPrenom();
                    if (this$prenom == null) {
                        if (other$prenom == null) {
                            break label153;
                        }
                    } else if (this$prenom.equals(other$prenom)) {
                        break label153;
                    }

                    return false;
                }

                Object this$username = this.getUsername();
                Object other$username = other.getUsername();
                if (this$username == null) {
                    if (other$username != null) {
                        return false;
                    }
                } else if (!this$username.equals(other$username)) {
                    return false;
                }

                label139: {
                    Object this$mail = this.getMail();
                    Object other$mail = other.getMail();
                    if (this$mail == null) {
                        if (other$mail == null) {
                            break label139;
                        }
                    } else if (this$mail.equals(other$mail)) {
                        break label139;
                    }

                    return false;
                }

                Object this$mdp = this.getMdp();
                Object other$mdp = other.getMdp();
                if (this$mdp == null) {
                    if (other$mdp != null) {
                        return false;
                    }
                } else if (!this$mdp.equals(other$mdp)) {
                    return false;
                }

                label125: {
                    Object this$date_naissance = this.getDate_naissance();
                    Object other$date_naissance = other.getDate_naissance();
                    if (this$date_naissance == null) {
                        if (other$date_naissance == null) {
                            break label125;
                        }
                    } else if (this$date_naissance.equals(other$date_naissance)) {
                        break label125;
                    }

                    return false;
                }

                label118: {
                    Object this$sexe = this.getSexe();
                    Object other$sexe = other.getSexe();
                    if (this$sexe == null) {
                        if (other$sexe == null) {
                            break label118;
                        }
                    } else if (this$sexe.equals(other$sexe)) {
                        break label118;
                    }

                    return false;
                }

                Object this$adresse = this.getAdresse();
                Object other$adresse = other.getAdresse();
                if (this$adresse == null) {
                    if (other$adresse != null) {
                        return false;
                    }
                } else if (!this$adresse.equals(other$adresse)) {
                    return false;
                }

                label104: {
                    Object this$num = this.getNum();
                    Object other$num = other.getNum();
                    if (this$num == null) {
                        if (other$num == null) {
                            break label104;
                        }
                    } else if (this$num.equals(other$num)) {
                        break label104;
                    }

                    return false;
                }

                label97: {
                    Object this$role = this.getRole();
                    Object other$role = other.getRole();
                    if (this$role == null) {
                        if (other$role == null) {
                            break label97;
                        }
                    } else if (this$role.equals(other$role)) {
                        break label97;
                    }

                    return false;
                }

                Object this$image = this.getImage();
                Object other$image = other.getImage();
                if (this$image == null) {
                    if (other$image != null) {
                        return false;
                    }
                } else if (!this$image.equals(other$image)) {
                    return false;
                }

                Object this$equipes = this.getEquipes();
                Object other$equipes = other.getEquipes();
                if (this$equipes == null) {
                    if (other$equipes != null) {
                        return false;
                    }
                } else if (!this$equipes.equals(other$equipes)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        int PRIME = 31;
        int result = 1;
        result = result * 59 + this.getIdUser();
        result = result * 59 + (this.isStatus() ? 79 : 97);
        Object $nom = this.getNom();
        result = result * 59 + ($nom == null ? 43 : $nom.hashCode());
        Object $prenom = this.getPrenom();
        result = result * 59 + ($prenom == null ? 43 : $prenom.hashCode());
        Object $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        Object $mail = this.getMail();
        result = result * 59 + ($mail == null ? 43 : $mail.hashCode());
        Object $mdp = this.getMdp();
        result = result * 59 + ($mdp == null ? 43 : $mdp.hashCode());
        Object $date_naissance = this.getDate_naissance();
        result = result * 59 + ($date_naissance == null ? 43 : $date_naissance.hashCode());
        Object $sexe = this.getSexe();
        result = result * 59 + ($sexe == null ? 43 : $sexe.hashCode());
        Object $adresse = this.getAdresse();
        result = result * 59 + ($adresse == null ? 43 : $adresse.hashCode());
        Object $num = this.getNum();
        result = result * 59 + ($num == null ? 43 : $num.hashCode());
        Object $role = this.getRole();
        result = result * 59 + ($role == null ? 43 : $role.hashCode());
        Object $image = this.getImage();
        result = result * 59 + ($image == null ? 43 : $image.hashCode());
        Object $equipes = this.getEquipes();
        result = result * 59 + ($equipes == null ? 43 : $equipes.hashCode());
        return result;
    }

    public User(final int idUser, final String nom, final String prenom, final String username, final String mail, final String mdp, final Date date_naissance, final Sexe sexe, final String adresse, final String num, final boolean Status, final Role role, final String image, final Set<Equipe> equipes) {
        this.idUser = idUser;
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.mail = mail;
        this.mdp = mdp;
        this.date_naissance = date_naissance;
        this.sexe = sexe;
        this.adresse = adresse;
        this.num = num;
        this.Status = Status;
        this.role = role;
        this.image = image;
        this.equipes = equipes;
    }

    public User() {
    }
}
