package org.example.keycrafapp.util;


import org.example.keycrafapp.entities.User;

public class SessionManager {
    private static User currentUser;
    public static User getCurrentUser() { return currentUser; }
    public static void setCurrentUser(User u) { currentUser = u; }
}