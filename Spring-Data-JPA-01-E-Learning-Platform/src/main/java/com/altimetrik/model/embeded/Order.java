package com.altimetrik.model.embeded;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
	
	@EmbeddedId
	private OrderId orderId;
	
	@Embedded
	private Address address;

	private String orderInfo;

	private String anotherField;
}
