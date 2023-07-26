package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "offices")
public class Office {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "office_code")
	private String officeCode;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name = "address_line1", nullable = false)
	private String addressLine1;

	@Column(name = "address_line2")
	private String addressLine2;

	@Column(name = "state")
	private String state;

	@Column(name = "country", nullable = false)
	private String country;

	@Column(name = "postal_code", nullable = false)
	private String postalCode;

	@Column(name = "territory", nullable = false)
	private String territory;

}