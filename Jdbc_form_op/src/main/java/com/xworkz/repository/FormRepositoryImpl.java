package com.xworkz.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.constants.ConnectionConstants;
import com.xworkz.dto.FormDB;
public class FormRepositoryImpl implements FormRepository {
    @Override
    public void saveForm(FormDB form) {
        try (Connection connection = ConnectionConstants.getConnection()) {
            if (connection != null) {
                String query = "INSERT INTO form_data (name, age, email, contact, password, address) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, form.getName());
                    preparedStatement.setInt(2, form.getAge());
                    preparedStatement.setString(3, form.getEmail());
                    preparedStatement.setLong(4, form.getContact());
                    preparedStatement.setString(5, form.getPassword());
                    preparedStatement.setString(6, form.getAddress());
                    preparedStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            System.out.println("Error saving form data: " + e.getMessage());
        }
    }

    @Override
    public FormDB getFormById(int id) {
        FormDB form = null;
        try (Connection connection = ConnectionConstants.getConnection()) {
            if (connection != null) {
                String query = "SELECT * FROM form_data WHERE id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setInt(1, id);
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        if (resultSet.next()) {
                            form = new FormDB(
                                    resultSet.getInt("id"),
                                    resultSet.getString("name"),
                                    resultSet.getInt("age"),
                                    resultSet.getString("email"),
                                    resultSet.getLong("contact"),
                                    resultSet.getString("password"),
                                    resultSet.getString("address")
                            );
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error fetching form data: " + e.getMessage());
        }
        return form;
    }

    @Override
    public FormDB getFormByContact(long contact) {
        FormDB form = null;
        try (Connection connection = ConnectionConstants.getConnection()) {
            if (connection != null) {
                String query = "SELECT * FROM form_data WHERE contact = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setLong(1, contact);
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        if (resultSet.next()) {
                            form = new FormDB(
                                    resultSet.getInt("id"),
                                    resultSet.getString("name"),
                                    resultSet.getInt("age"),
                                    resultSet.getString("email"),
                                    resultSet.getLong("contact"),
                                    resultSet.getString("password"),
                                    resultSet.getString("address")
                            );
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error fetching form data by contact: " + e.getMessage());
        }
        return form;
    }

    @Override
    public boolean verifyPasswordForUser(String email, String password) {
        try (Connection connection = ConnectionConstants.getConnection()) {
            if (connection != null) {
                String query = "SELECT * FROM form_data WHERE  email = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, email);

                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        if (resultSet.next()) {
                            String storedPassword = resultSet.getString("password");
                            return storedPassword.equals(password);  // Check if the password matches
                        }
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error verifying password: " + e.getMessage());
        }
        return false;  
    }
    @Override
    public boolean deleteFormById(int id) {
        try (Connection connection = ConnectionConstants.getConnection()) {
            if (connection != null) {
                String query = "DELETE FROM form_data WHERE id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setInt(1, id);
                    int rowsAffected = preparedStatement.executeUpdate();
                    if (rowsAffected == 0) {
                        System.out.println("No data found for the given ID.");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error deleting form data: " + e.getMessage());
        }
		return false;
    }
    @Override
    public boolean updateFormByEmail(String email, FormDB updatedForm) {
        try (Connection connection = ConnectionConstants.getConnection()) {
            if (connection != null) {
                String query = "UPDATE form_data SET name = ?, age = ?, contact = ?, password = ?, address = ? WHERE email = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, updatedForm.getName());
                    preparedStatement.setInt(2, updatedForm.getAge());
                    preparedStatement.setLong(3, updatedForm.getContact());
                    preparedStatement.setString(4, updatedForm.getPassword());
                    preparedStatement.setString(5, updatedForm.getAddress());
                    preparedStatement.setString(6, email);
                    
                    int rowsAffected = preparedStatement.executeUpdate();
                    return rowsAffected > 0; 
                }
            }
        } catch (SQLException e) {
            System.out.println("Error updating form data: " + e.getMessage());
        }
        return false;  
    }

}
