package com.kgisl.register.register.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Register{

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long registerId;

    @Column
    private String userName ;

    @Column

    private String email;

    
    @Column
    private String password;
    
    @Column
    private double confirmPassword;

/**
 * @return the userName
 */
public String getUserName() {
    return userName;
}
/**
 * @return the confirmPassword
 */
public double getConfirmPassword() {
    return confirmPassword;
}
/**
 * @return the email
 */
public String getEmail() {
    return email;
}
/**
 * @return the password
 */
public String getPassword() {
    return password;
}
/**
 * @return the registerId
 */

/**
 * @param confirmPassword the confirmPassword to set
 */
public void setConfirmPassword(double confirmPassword) {
    this.confirmPassword = confirmPassword;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
    this.email = email;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
    this.password = password;
}
/**
 * @param registerId the registerId to set
 */

/**
 * @param userName the userName to set
 */
public void setUserName(String userName) {
    this.userName = userName;
}

}