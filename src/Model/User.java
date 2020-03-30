/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
public class User 
{
    private String username;
    private String password;
    
    
    public User(String un, String pw)
    {
         username = un;
         password = pw; 
    }
    
    //test User
    
    public String getUsername() {
        return username;
    }

   
    public String getPassword() {
        return password;
    }

  
    public void setUsername(String username) {
        this.username = username;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

}
