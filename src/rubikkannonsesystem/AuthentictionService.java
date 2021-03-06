/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubikkannonsesystem;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;
import java.util.logging.Level;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.security.enterprise.identitystore.CredentialValidationResult;
import javax.security.enterprise.identitystore.IdentityStoreHandler;
import javax.security.enterprise.identitystore.PasswordHash;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import javax.validation.constraints.NotBlank;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import lombok.extern.java.Log;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.InvalidKeyException;
import javax.annotation.Resource;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import no.ntnu.tollefsen.chat.configuration.DatasourceProducer;

import org.eclipse.microprofile.config.inject.ConfigProperty;


import org.eclipse.microprofile.jwt.JsonWebToken;


/**
 *
 * @author Stigus
 * REST service class used for authentication */
public class AuthentictionService {
    
    @Inject
    PasswordHash hasher;
    
    @Inject
    JsonWebToken principal;
    
 public Response login(String userid, String password) {} // Login user
 
 @POST
 @Path("create")
 @Produces (MediaType.APPLICATION_JSON)
 public Response createUser(String userid, String password) {
 User user = em.find(User.class, userid);
 if (user != null) {
     log.log(Level.INFO, "user already exists {0}", userid);
     return Response.status(Response.Status.BAD_REQUEST).build();
 } else {
     user = new User();
     user.setUserid(userid);
     user.setPassword(hasher.generate(password.toCharArray()));
     return Response.ok(em.merge(user)).build();
 }
 } // Create new user
 
 public User getCurrentUser() {} // Get information about current user
 /** Change password of current user or any user if current user has the role of
 administrator */
 public Response changePassword(String userid, String password) {}
}

