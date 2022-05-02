package com.abc.onlinestore.exceptions;




public class InvalidUserException extends Exception{
 
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String username;
 private String password;
 
 public InvalidUserException() {
  super();
  // TODO Auto-generated constructor stub
 }
 public InvalidUserException(String username, String password) {
  super();
  this.username = username;
  this.password = password;
 }
 public String getUsername() {
  return username;
 }
 public void setUsername(String username) {
  this.username = username;
 }
 public String getPassword() {
  return password;
 }
 public void setPassword(String password) {
  this.password = password;
 }
 
 
 public String passwordCoverter() {
 int len = password.length();
 String encryedCode = "";
 for(int i = 0;i<len/2;i++)
 {
  encryedCode+="*";
 }
 String lastString = password.substring(len/2, len);
 password =  encryedCode+lastString;
 return password;
 }
}