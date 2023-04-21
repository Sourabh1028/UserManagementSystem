package com.geekster.UserManagementSystem.Service;

import com.geekster.UserManagementSystem.Modles.User;
import com.geekster.UserManagementSystem.Repositary.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    public List<User> getAllUser(){
        return userDAO.getAllUser();
    }

    public String addMyUser(User user){
        boolean UserStatus = userDAO.save(user);
        if(UserStatus){
            return "user added Successfully !!!";
        }
        else{
            return "Failed... to add !!!";
        }
    }

    public User getUserById(String id) {
        return userDAO.getUserById(id);
    }

    public String deleteUserById(String id) {
        List<User> getCurrentList = userDAO.getAllUser();
        if(id != null){
            for(User user : getCurrentList){
                if(user.getUserId().equals(id)){
                    userDAO.remove(user);
                    return  "User with "+ id + "was deleted !!!";
                }
            }
        }
        return "user with "+id+" does not exist !!!";
    }

    public String updateUser(String id, User user){
        return userDAO.update(id, user);
    }

}
