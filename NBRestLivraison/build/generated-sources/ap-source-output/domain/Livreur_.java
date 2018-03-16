package domain;

import domain.Commande;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-15T21:28:13")
@StaticMetamodel(Livreur.class)
public class Livreur_ { 

    public static volatile SingularAttribute<Livreur, String> latitude;
    public static volatile SingularAttribute<Livreur, String> prenom;
    public static volatile SingularAttribute<Livreur, String> nom;
    public static volatile CollectionAttribute<Livreur, Commande> commandeCollection;
    public static volatile SingularAttribute<Livreur, Integer> idLivreur;
    public static volatile SingularAttribute<Livreur, String> longitude;
    public static volatile SingularAttribute<Livreur, String> status;

}