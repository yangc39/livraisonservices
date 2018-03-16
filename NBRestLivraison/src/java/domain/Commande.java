/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chun
 */
@Entity
@Table(name = "commande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c")
    , @NamedQuery(name = "Commande.findByIdCommande", query = "SELECT c FROM Commande c WHERE c.commandePK.idCommande = :idCommande")
    , @NamedQuery(name = "Commande.findByLatitude", query = "SELECT c FROM Commande c WHERE c.latitude = :latitude")
    , @NamedQuery(name = "Commande.findByLongitude", query = "SELECT c FROM Commande c WHERE c.longitude = :longitude")
    , @NamedQuery(name = "Commande.findByAddressdestination", query = "SELECT c FROM Commande c WHERE c.addressdestination = :addressdestination")
    , @NamedQuery(name = "Commande.findByLivreuridLivreur", query = "SELECT c FROM Commande c WHERE c.commandePK.livreuridLivreur = :livreuridLivreur")})
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CommandePK commandePK;
    @Size(max = 255)
    @Column(name = "latitude")
    private String latitude;
    @Size(max = 255)
    @Column(name = "longitude")
    private String longitude;
    @Size(max = 255)
    @Column(name = "addressdestination")
    private String addressdestination;
    @JoinColumn(name = "Livreur_idLivreur", referencedColumnName = "idLivreur", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Livreur livreur;

    public Commande() {
    }

    public Commande(CommandePK commandePK) {
        this.commandePK = commandePK;
    }

    public Commande(int idCommande, int livreuridLivreur) {
        this.commandePK = new CommandePK(idCommande, livreuridLivreur);
    }

    public CommandePK getCommandePK() {
        return commandePK;
    }

    public void setCommandePK(CommandePK commandePK) {
        this.commandePK = commandePK;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddressdestination() {
        return addressdestination;
    }

    public void setAddressdestination(String addressdestination) {
        this.addressdestination = addressdestination;
    }

    public Livreur getLivreur() {
        return livreur;
    }

    public void setLivreur(Livreur livreur) {
        this.livreur = livreur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commandePK != null ? commandePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.commandePK == null && other.commandePK != null) || (this.commandePK != null && !this.commandePK.equals(other.commandePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Commande[ commandePK=" + commandePK + " ]";
    }
    
}
