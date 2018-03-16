package domain;

import domain.CommandePK;
import domain.Livreur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-15T21:28:13")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, String> latitude;
    public static volatile SingularAttribute<Commande, CommandePK> commandePK;
    public static volatile SingularAttribute<Commande, String> addressdestination;
    public static volatile SingularAttribute<Commande, Livreur> livreur;
    public static volatile SingularAttribute<Commande, String> longitude;

}