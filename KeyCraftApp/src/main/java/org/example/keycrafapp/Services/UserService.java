package org.example.keycrafapp.Services;

import org.example.keycrafapp.dao.UserDAO;
import org.example.keycrafapp.entities.User;

public class UserService {
    private final UserDAO userDAO = new UserDAO();

    public boolean registerUser(String email, String password) {
        if (userDAO.getUserByEmail(email) != null) {
            return false; // Usuario ya existe
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        userDAO.saveUser(user);
        return true;
    }

    public boolean loginUser(String email, String password) {
        User user = userDAO.getUserByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}