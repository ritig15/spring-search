package com.xworkz.press.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Table(name = "press_order")
@NamedQueries({
		@NamedQuery(query = "select order from PressOrderDTO order where order.orderFrom=:orderFrom", name = "fetchByOrderFrom") })
@Entity
public class PressOrderDTO {
	public PressOrderDTO() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "ORDER_FROM")
	private String orderFrom;
	@Column(name = "PHONE_NUMBER")
	private long phoneNo;
	@Column(name = "CARD_TYPE")
	private String cardType;
	@Column(name = "NO_OF_COPIES")
	private int noOfCopies;
	@Column(name = "CONTENT")
	private String content;
}
