package com.kozka.hospitaldepartmentservlet.services;

import com.kozka.hospitaldepartmentservlet.dao.UserDAO;
import com.kozka.hospitaldepartmentservlet.entities.User;
import com.kozka.hospitaldepartmentservlet.entities.UserRole;

import java.util.List;

/**
 * @author Kozka Ivan
 */
public class UserService {
    public static User getUserById(int id) {
        return UserDAO.getUserById(id);
    }
    public static User getUserByEmail(String email) {
        return UserDAO.getUserByEmail(email);
    }
    public static List<User> getAllActivePatients() {
        return UserDAO.getAllActiveUsersByUserRole(UserRole.PATIENT);
    }
    public static List<User> getAllActiveDoctors() {
        return UserDAO.getAllActiveUsersByUserRole(UserRole.DOCTOR);
    }
}
