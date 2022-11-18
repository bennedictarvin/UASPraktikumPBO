/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Arvin Situmorang
 */
public class User {

    int userId;
    String userName;
    String userEmail;
    String userGender;
    String userCategory;
    int userFollowers;

    public User() {
    }

    public User(int userId, String userName, String userEmail, String userGender, String userCategory, int userFollowers) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.userCategory = userCategory;
        this.userFollowers = userFollowers;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(String userCategory) {
        this.userCategory = userCategory;
    }

    public int getUserFollowers() {
        return userFollowers;
    }

    public void setUserFollowers(int userFollowers) {
        this.userFollowers = userFollowers;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userGender=" + userGender + ", userCategory=" + userCategory + ", userFollowers=" + userFollowers + '}';
    }

}
