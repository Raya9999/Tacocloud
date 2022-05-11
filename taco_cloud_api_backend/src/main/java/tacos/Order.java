package tacos;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.Data;
@Data
@Entity
public class Order {
@Id
private String id;
private String name;
private String street;
private String city;
private String state;
private String zip;
private String ccNumber;
private String ccExpiration;
private String ccCVV;
private Date placeAt;
private List<Taco> tacos;
@PrePersist
void placeAt() {
	this.placeAt = new Date();
}
}