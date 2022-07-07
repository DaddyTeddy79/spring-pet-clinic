package fr.teddy.springpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contact_info")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactInfo extends BaseEntity {

	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "zip_code")
	private String zipCode;
	@Column(name = "telephone")
	private String telephone;
}
