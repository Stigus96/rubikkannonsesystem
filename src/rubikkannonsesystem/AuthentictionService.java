/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikkannonsesystem;

/**
 *
 * @author Stigus
 * REST service class used for authentication */
public class AuthentictionService {
    
 public Response login(String userid, String password) {} // Login user
 public Response createUser(String userid, String password) {} // Create new user
 public User getCurrentUser() {} // Get information about current user
 /** Change password of current user or any user if current user has the role of
 administrator */
 public Response changePassword(String userid, String password) {}
}

