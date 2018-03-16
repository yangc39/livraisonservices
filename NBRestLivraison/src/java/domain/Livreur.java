/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Chun
 */
@Entity
@Table(name = "livreur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livreur.findAll", query = "SELECT l FROM Livreur l")
    , @NamedQuery(name = "Livreur.findByIdLivreur", query = "SELECT l FROM Livreur l WHERE l.idLivreur = :idLivreur")
    , @NamedQuery(name = "Livreur.findByPrenom", query = "SELECT l FROM Livreur l WHERE l.prenom = :prenom")
    , @NamedQuery(name = "Livreur.findByNom", query = "SELECT l FROM Livreur l WHERE l.nom = :nom")
    , @NamedQuery(name = "Livreur.findByLatitude", query = "SELECT l FROM Livreur l WHERE l.latitude = :latitude")
    , @NamedQuery(name = "Livreur.findByLongitude", query = "SELECT l FROM Livreur l WHERE l.longitude = :longitude")
    , @NamedQuery(name = "Livreur.findByStatus", query = "SELECT l FROM Livreur l WHERE l.status = :status")})
public class Livreur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idLivreur")
    private Integer idLivreur;
    @Size(max = 55)
    @Column(name = "prenom")
    private String prenom;
    @Size(max = 55)
    @Column(name = "nom")
    private String nom;
    @Size(max = 255)
    @Column(name = "latitude")
    private String latitude;
    @Size(max = 255)
    @Column(name = "longitude")
    private String longitude;
    @Size(max = 60)
    @Column(name = "status")
    private String status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "livreur")
    private Collection<Commande> commandeCollection;

    public Livreur() {
    }

    public Livreur(Integer idLivreur) {
        this.idLivreur = idLivreur;
    }

    public Integer getIdLivreur() {
        return idLivreur;
    }

    public void setIdLivreur(Integer idLivreur) {
        this.idLivreur = idLivreur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<Commande> getCommandeCollection() {
        return commandeCollection;
    }

    public void setCommandeCollection(Collection<Commande> commandeCollection) {
        this.commandeCollection = commandeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLivreur != null ? idLivreur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livreur)) {
            return false;
        }
        Livreur other = (Livreur) object;
        if ((this.idLivreur == null && other.idLivreur != null) || (this.idLivreur != null && !this.idLivreur.equals(other.idLivreur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Livreur[ idLivreur=" + idLivreur + " ]";
    }
    
}
