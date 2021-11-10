package com.kozka.hospitaldepartmentservlet.utils;

import com.kozka.hospitaldepartmentservlet.entities.Specialization;
import com.kozka.hospitaldepartmentservlet.entities.User;
import com.kozka.hospitaldepartmentservlet.entities.UserRole;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 * @author Kozka Ivan
 */
public class UserMapper {
    public static User mapUserFrom(ResultSet rs) throws SQLException {
        User user = new User();

        user.setId(rs.getInt(1));
        user.setEmail(rs.getString(2));
        user.setPass(rs.getString(3));
        user.setFirstName(rs.getString(4));
        user.setLastName(rs.getString(5));
        user.setUserRole(
                UserRole.valueOf(
                        rs.getString(6)
                )
        );
        user.setSpecialization(
                Specialization.valueOf(
                        rs.getString(7)
                )
        );
        user.setActive(rs.getBoolean(8));
        user.setBirth(rs.getDate(9).toLocalDate());

        return user;
    }
}
