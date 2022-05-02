package com.abc.onlinestore.DTO;
import java.util.Objects;
public class OnlineElectronicStoreResponseDTOUser {
 private int productId;
 private String productlocation;
 private String productName;
 private String productreivew;
 private String userName;
 private String phoneNumber;
 private String emailId;
 private int userRating;
 private String feedback;
 private int productRate;
 private String userAddress;
 
 public OnlineElectronicStoreResponseDTOUser() {
  super();
 }
 public OnlineElectronicStoreResponseDTOUser (int productId, String userName, String phoneNumber, String emailId,
   String productName,String userAddress, int userRating,String feedback,int productRate) {
  super();
  this.productId = productId;
  this.userName = userName;
  this.userAddress = userAddress;
  this.phoneNumber = phoneNumber;
  this.emailId = emailId;
  this.productName = productName;
  this.userRating = userRating;
  this.feedback = feedback;
  this.productRate=productRate;
 }
 
 public int getProductId() {
  return productId;
 }
 public void setProductId(int productId) {
  this.productId = productId;
 }
 public String getProductlocation() {
  return productlocation;
 }
 public void setProductlocation(String productlocation) {
  this.productlocation = productlocation;
 }
 public String getProductName() {
  return productName;
 }
 public void setProductName(String productName) {
  this.productName = productName;
 }
 public String getProductreivew() {
  return productreivew;
 }
 public void setProductreivew(String productreivew) {
  this.productreivew = productreivew;
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
 public int getUserRating() {
  return userRating;
 }
 public void setUserRating(int userRating) {
  this.userRating = userRating;
 }
 public String getFeedback() {
  return feedback;
 }
 public void setFeedback(String feedback) {
  this.feedback = feedback;
 }
 public int getProductRate() {
  return productRate;
 }
 public void setProductRate(int productRate) {
  this.productRate = productRate;
 }
 public String getUserAddress() {
  return userAddress;
 }
 public void setUserAddress(String userAddress) {
  this.userAddress = userAddress;
 }
 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
  result = prime * result + ((feedback == null) ? 0 : feedback.hashCode());
  result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
  result = prime * result + productId;
  result = prime * result + ((productName == null) ? 0 : productName.hashCode());
  result = prime * result + productRate;
  result = prime * result + ((productlocation == null) ? 0 : productlocation.hashCode());
  result = prime * result + ((productreivew == null) ? 0 : productreivew.hashCode());
  result = prime * result + ((userName == null) ? 0 : userName.hashCode());
  result = prime * result + userRating;
  return result;
 }
 @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (obj == null)
   return false;
  if (getClass() != obj.getClass())
   return false;
  OnlineElectronicStoreResponseDTOUser other = (OnlineElectronicStoreResponseDTOUser) obj;
  return Objects.equals(emailId, other.emailId) && Objects.equals(feedback, other.feedback)
    && productId == other.productId && Objects.equals(productlocation, other.productlocation)
    && Objects.equals(productName, other.productName) && productRate == other.productRate
    && Objects.equals(phoneNumber, other.phoneNumber) 
    && Objects.equals(userAddress, other.userAddress) && Objects.equals(userName, other.userName)
    && userRating == other.userRating;
 }
 
}