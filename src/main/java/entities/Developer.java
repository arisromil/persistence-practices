package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Developer {

    @Id
    private String nickname;
    private String name;
    private String city;
    private String language;
}
