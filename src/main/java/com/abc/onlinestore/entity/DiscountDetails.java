package com.abc.onlinestore.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DiscountDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private String discountcoupon;
private int discountpercentage;
private String discounttype;

public DiscountDetails() {
	super();
	
}

public DiscountDetails(String discountcoupon, int discountpercentage, String discounttype) {
	this.discountcoupon = discountcoupon;
	this.discountpercentage = discountpercentage;
	this.discounttype = discounttype;
}

public String getDiscountcoupon() {
	return discountcoupon;
}

public void setDiscountcoupon(String discountcoupon) {
	this.discountcoupon = discountcoupon;
}

public int getDiscountpercentage() {
	return discountpercentage;
}

public void setDiscountpercentage(int discountpercentage) {
	this.discountpercentage = discountpercentage;
}

public String getDiscounttype() {
	return discounttype;
}

public void setDiscounttype(String discounttype) {
	this.discounttype = discounttype;
}

@Override
public int hashCode() {
	return Objects.hash(discountcoupon, discountpercentage,discounttype);
}
	
	


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	DiscountDetails other = (DiscountDetails) obj;
	return Objects.equals(discountcoupon, other.discountcoupon) && Objects.equals(discountpercentage , other.discountpercentage)
			&& Objects.equals(discounttype,other.discounttype);
}

}