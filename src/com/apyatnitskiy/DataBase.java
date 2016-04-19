package com.apyatnitskiy;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    List<User> userList = new ArrayList<>();
//create
    public void add(User user) {
        userList.add(user);
    }
//read
    public User get(String name) {
        User resultUser = null;
        for (User user : userList) {
            if (user.getName().equals(name)) {
                resultUser = user;
                return resultUser;
            }
        }
        return resultUser;
    }

    public List<User> getAll() {
        return userList;
    }

    public void init(User... users) {
        for (User user : users) {
            userList.add(user);
        }
    }
}
