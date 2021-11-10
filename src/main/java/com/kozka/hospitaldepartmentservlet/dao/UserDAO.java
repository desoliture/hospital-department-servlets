package com.kozka.hospitaldepartmentservlet.dao;

import com.kozka.hospitaldepartmentservlet.entities.User;
import com.kozka.hospitaldepartmentservlet.entities.UserRole;
import com.kozka.hospitaldepartmentservlet.services.ConnectionPool;
import com.kozka.hospitaldepartmentservlet.utils.UserMapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Kozka Ivan
 */
public interface UserDAO {

    String GET_USER_BY_ID_SQL = "select * from users as u where u.user_id = ?";
    String GET_USER_BY_EMAIL_SQL = "select * from users as u where u.email = ?";
    String GET_ALL_ACTIVE_USERS_SQL = "select * from users as u where u.active = true";
    String GET_ALL_ACTIVE_USERS_WITH_ROLE_SQL = "select * from users as u where u.active = true and u.u_role = ?";

    static User getUserById(int id) {
        try (
                Connection con = ConnectionPool.getConnection();
                PreparedStatement statement = con.prepareStatement(GET_USER_BY_ID_SQL)
        ) {

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next())
                return UserMapper.mapUserFrom(rs);
            else throw new NoSuchElementException("User with id={" + id + "} not found!");

        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }
    }

    static User getUserByEmail(String email) {
        try (
                Connection con = ConnectionPool.getConnection();
                PreparedStatement statement = con.prepareStatement(GET_USER_BY_EMAIL_SQL)
        ) {

            statement.setString(1, email);
            ResultSet rs = statement.executeQuery();

            if (rs.next())
                return UserMapper.mapUserFrom(rs);
            else throw new NoSuchElementException("User with email={" + email + "} not found!");
        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }
    }

    static List<User> getAllActiveUsers() {
        try (
                Connection con = ConnectionPool.getConnection();
                PreparedStatement statement = con.prepareStatement(GET_ALL_ACTIVE_USERS_SQL)
        ) {

            ResultSet rs = statement.executeQuery();

            List<User> users = new ArrayList<>();

            while (rs.next()) {
                users.add(
                        UserMapper.mapUserFrom(rs)
                );
            }

            return users;

        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }
    }

    static List<User> getAllActiveUsersByUserRole(UserRole userRole) {
        try (
                Connection con = ConnectionPool.getConnection();
                PreparedStatement statement = con.prepareStatement(GET_ALL_ACTIVE_USERS_WITH_ROLE_SQL)
        ) {

            statement.setString(1, userRole.name());
            ResultSet rs = statement.executeQuery();

            List<User> users = new ArrayList<>();

            while (rs.next()) {
                users.add(
                        UserMapper.mapUserFrom(rs)
                );
            }

            return users;

        } catch (SQLException e) {
            e.printStackTrace();

            return null;
        }
    }
}
