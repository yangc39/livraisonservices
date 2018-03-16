/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Chun
 */
@Embeddable
public class CommandePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idCommande")
    private int idCommande;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Livreur_idLivreur")
    private int livreuridLivreur;

    public CommandePK() {
    }

    public CommandePK(int idCommande, int livreuridLivreur) {
        this.idCommande = idCommande;
        this.livreuridLivreur = livreuridLivreur;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getLivreuridLivreur() {
        return livreuridLivreur;
    }

    public void setLivreuridLivreur(int livreuridLivreur) {
        this.livreuridLivreur = livreuridLivreur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCommande;
        hash += (int) livreuridLivreur;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommandePK)) {
            return false;
        }
        CommandePK other = (CommandePK) object;
        if (this.idCommande != other.idCommande) {
            return false;
        }
        if (this.livreuridLivreur != other.livreuridLivreur) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.CommandePK[ idCommande=" + idCommande + ", livreuridLivreur=" + livreuridLivreur + " ]";
    }
    
}
