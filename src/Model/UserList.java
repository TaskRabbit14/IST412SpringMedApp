/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UserList 
{
    private ArrayList <User> userList = new ArrayList<>();
   
    public UserList()
    {
        userList.add(new User("DRtest" , "test"));
    }
    public ArrayList<User> getUserList() {
        return userList;
    }

   
    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    @FXML
    public boolean authenticate(TextField username, PasswordField password) 
    {
        boolean authenticate = false;
        int i = 0;
        
        while (!authenticate && i < userList.size())
        {
           if(username.getText().equals(userList.get(i).getUsername()) && 
                        password.getText().equals(userList.get(i).getPassword()))
                {
                authenticate = true;
                }
           else
           {
                i++;
           }
        }
            
            
        return authenticate;
     } 
}
