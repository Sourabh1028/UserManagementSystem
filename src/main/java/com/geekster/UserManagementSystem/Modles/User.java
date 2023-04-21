package com.geekster.UserManagementSystem.Modles;

public class User {

    private String UserId;
    private String Name;
    private String UserName;
    private String Address;
    private String phoneNumber;

    public User(String userId, String name, String userName, String adress, String phoneNumber) {
        UserId = userId;
        Name = name;
        UserName = userName;
        Address = adress;
        this.phoneNumber = phoneNumber;
    }

    public String getUserId() {
        return UserId;
    }

    public String getName() {
        return Name;
    }

    public String getUserName() {
        return UserName;
    }

    public String getAddress() {

        return Address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
