package com.abc.onlinestore.DTO;
import java.util.Objects;

public class OnlineElectronicStoreResponseDTOAdmin{
 private int productId;
 private String productName;
 private String productType;
 private boolean productStatus;
 private String userName;
 private String phoneNumber;
 private String emailId;
 public OnlineElectronicStoreResponseDTOAdmin() {
  super();
  // TODO Auto-generated constructor stub
 }
 public OnlineElectronicStoreResponseDTOAdmin(int productId, String userName, String phoneNumber, String emailId,
   String productName, boolean productStatus) {
  super();
  this.productId = productId;
  this.userName = userName;
  this.phoneNumber = phoneNumber;
  this.emailId = emailId;
  this.productName = productName;
  this.productStatus = productStatus;
 }
 public int getproductId() {
  return productId;
 }
 public void setHotelId(int productId) {
  this.productId = productId;
 }
 public String getUserName() {
  return userName;
 }
 public void setUserName(String userName) {
  this.userName = userName;
 }
 public String getPhoneNumber() {
  return phoneNumber;
 }
 public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;
 }
 public String getEmailId() {
  return emailId;
 }
 public void setEmailId(String emailId) {
  this.emailId = emailId;
 }
 public String getproductName() {
  return productName;
 }
 public void setHotelName(String productName) {
  this.productName = productName;
 }
 public boolean getproductStatus() {
  return productStatus;
 }
 public void setproductStatus(boolean roomStatus, boolean productStatus) {
  this.productStatus = productStatus;
 }
 @Override
 public int hashCode() {
  return Objects.hash(emailId, productId, productName, phoneNumber, productStatus, userName);
 }
 @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (obj == null)
   return false;
  if (getClass() != obj.getClass())
   return false;
  OnlineElectronicStoreResponseDTOAdmin other = (OnlineElectronicStoreResponseDTOAdmin) obj;
  return Objects.equals(emailId, other.emailId) && productId == other.productId
    && Objects.equals(productName, other.productName) && Objects.equals(phoneNumber, other.phoneNumber)
    && productStatus == other.productStatus && Objects.equals(userName, other.userName);
 }
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
 
 
}