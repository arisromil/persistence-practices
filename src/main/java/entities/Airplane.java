package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airplane {

    @Id
    private String model;
    private String manufacturer;
    private String nationality;
    private int seats;

}
