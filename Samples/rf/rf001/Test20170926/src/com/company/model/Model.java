package com.company.model;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;

/**
 * Created by student on 26.09.2017.
 */
public class Model {
    private static ArrayList<User> ar = new ArrayList<User>();

    public static void addNewUser(User newUser){
        ar.add(newUser);
    }
}
