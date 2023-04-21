package com.geekster.UserManagementSystem.Repositary;

import com.geekster.UserManagementSystem.Modles.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {
    private List<User> userList;

    public UserDAO() {
        userList = new ArrayList<>();
        userList.add(new User("1", "sourabh", "@sourabh", "a/p-kavalapur", "123456789"));
    }

    public List<User> getAllUser(){
        return userList;
    }
    public User getUserById(String id) {
        List<User> getCurrentList = userList;
        for(User user : getCurrentList){
            if(user.getUserId().equals(id)){
                return user;
            }
        }
        System.out.println("Not found user with id : " + id);
        return null;
    }

    public boolean save(User user){
        userList.add(user);
        return true;
    }

    public boolean remove(User user){
        userList.remove(user);
        return true;
    }

    public String update(String id, User user) {
        User user1 = getUserById(id);
        if(id != null){
            user1.setUserName(user.getUserName());
            user1.setName(user.getName());
            user1.setAddress(user.getAddress());
            user1.setPhoneNumber(user.getPhoneNumber());
            return "User with id " + user.getUserId() + " updated Successfully...!!!";
        }
        return "Cannot find the user with id " + user.getUserId();
    }
}
