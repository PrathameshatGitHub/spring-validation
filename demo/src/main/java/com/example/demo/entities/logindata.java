package com.example.demo.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class logindata {

    @NotBlank(message = "user name dalna loude !!")
   
    @Size(min = 2,  max=435   )
    private String username;
    
    @NotBlank(message = "ab email tera baap dalega !!")
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" ,message="Invalid Email")
  private String email;
@AssertTrue(message = "you should agree terms and condition")
    private boolean agreed;
  
    public logindata(
            @NotBlank(message = "ab email tera baap dalega !!") @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email") @AssertTrue(message = "you should agreed terms and condition") boolean agreed) {
        this.agreed = agreed;
    }
    public boolean isAgreed() {
        return agreed;
    }
    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }
    
    public logindata() {
        this.username =username;
        this.email = email;
    }
   
    @Override
    public String toString() {
        return "logindata [username=" + username + ", email=" + email + "]";
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
