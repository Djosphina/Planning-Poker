package tn.examen.EyaProject.entity;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Reclamation {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private Long utilisateurId;
    private String description;
    @Enumerated(EnumType.STRING)
    private Priorite priorite;
    @Enumerated(EnumType.STRING)
    private Statut statut;
    private String pieceJointe;
    private Date dateSoumission;
    private Date dateMiseAJour;
    private Long utilisateurTraitantId;
    @ManyToOne
    Projet projet;

    public Reclamation() {
    }


    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Reclamation)) {
            return false;
        } else {
            Reclamation other = (Reclamation)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$id = this.getId();
                Object other$id = other.getId();
                if (this$id == null) {
                    if (other$id != null) {
                        return false;
                    }
                } else if (!this$id.equals(other$id)) {
                    return false;
                }

                Object this$utilisateurId = this.getUtilisateurId();
                Object other$utilisateurId = other.getUtilisateurId();
                if (this$utilisateurId == null) {
                    if (other$utilisateurId != null) {
                        return false;
                    }
                } else if (!this$utilisateurId.equals(other$utilisateurId)) {
                    return false;
                }

                Object this$utilisateurTraitantId = this.getUtilisateurTraitantId();
                Object other$utilisateurTraitantId = other.getUtilisateurTraitantId();
                if (this$utilisateurTraitantId == null) {
                    if (other$utilisateurTraitantId != null) {
                        return false;
                    }
                } else if (!this$utilisateurTraitantId.equals(other$utilisateurTraitantId)) {
                    return false;
                }

                label110: {
                    Object this$description = this.getDescription();
                    Object other$description = other.getDescription();
                    if (this$description == null) {
                        if (other$description == null) {
                            break label110;
                        }
                    } else if (this$description.equals(other$description)) {
                        break label110;
                    }

                    return false;
                }

                label103: {
                    Object this$priorite = this.getPriorite();
                    Object other$priorite = other.getPriorite();
                    if (this$priorite == null) {
                        if (other$priorite == null) {
                            break label103;
                        }
                    } else if (this$priorite.equals(other$priorite)) {
                        break label103;
                    }

                    return false;
                }

                Object this$statut = this.getStatut();
                Object other$statut = other.getStatut();
                if (this$statut == null) {
                    if (other$statut != null) {
                        return false;
                    }
                } else if (!this$statut.equals(other$statut)) {
                    return false;
                }

                label89: {
                    Object this$pieceJointe = this.getPieceJointe();
                    Object other$pieceJointe = other.getPieceJointe();
                    if (this$pieceJointe == null) {
                        if (other$pieceJointe == null) {
                            break label89;
                        }
                    } else if (this$pieceJointe.equals(other$pieceJointe)) {
                        break label89;
                    }

                    return false;
                }

                label82: {
                    Object this$dateSoumission = this.getDateSoumission();
                    Object other$dateSoumission = other.getDateSoumission();
                    if (this$dateSoumission == null) {
                        if (other$dateSoumission == null) {
                            break label82;
                        }
                    } else if (this$dateSoumission.equals(other$dateSoumission)) {
                        break label82;
                    }

                    return false;
                }

                Object this$dateMiseAJour = this.getDateMiseAJour();
                Object other$dateMiseAJour = other.getDateMiseAJour();
                if (this$dateMiseAJour == null) {
                    if (other$dateMiseAJour != null) {
                        return false;
                    }
                } else if (!this$dateMiseAJour.equals(other$dateMiseAJour)) {
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

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Reclamation;
    }

    public int hashCode() {
        int PRIME = 31;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $utilisateurId = this.getUtilisateurId();
        result = result * 59 + ($utilisateurId == null ? 43 : $utilisateurId.hashCode());
        Object $utilisateurTraitantId = this.getUtilisateurTraitantId();
        result = result * 59 + ($utilisateurTraitantId == null ? 43 : $utilisateurTraitantId.hashCode());
        Object $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        Object $priorite = this.getPriorite();
        result = result * 59 + ($priorite == null ? 43 : $priorite.hashCode());
        Object $statut = this.getStatut();
        result = result * 59 + ($statut == null ? 43 : $statut.hashCode());
        Object $pieceJointe = this.getPieceJointe();
        result = result * 59 + ($pieceJointe == null ? 43 : $pieceJointe.hashCode());
        Object $dateSoumission = this.getDateSoumission();
        result = result * 59 + ($dateSoumission == null ? 43 : $dateSoumission.hashCode());
        Object $dateMiseAJour = this.getDateMiseAJour();
        result = result * 59 + ($dateMiseAJour == null ? 43 : $dateMiseAJour.hashCode());
        Object $projet = this.getProjet();
        result = result * 59 + ($projet == null ? 43 : $projet.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "Reclamation(id=" + var10000 + ", utilisateurId=" + this.getUtilisateurId() + ", description=" + this.getDescription() + ", priorite=" + this.getPriorite() + ", statut=" + this.getStatut() + ", pieceJointe=" + this.getPieceJointe() + ", dateSoumission=" + this.getDateSoumission() + ", dateMiseAJour=" + this.getDateMiseAJour() + ", utilisateurTraitantId=" + this.getUtilisateurTraitantId() + ", projet=" + this.getProjet() + ")";
    }
}
