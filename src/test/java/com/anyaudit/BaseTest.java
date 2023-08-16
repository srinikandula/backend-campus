package com.anyaudit;


import com.anyaudit.controller.TokenAuthenticationService;
import com.anyaudit.models.ERole;
import com.anyaudit.models.Role;
import com.anyaudit.models.User;
import com.anyaudit.repository.UserRepository;
import com.anyaudit.security.jwt.JwtUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
public class BaseTest {

    public static final String userName = "TestUser";
    protected String token ;
    protected User currentUser;
    public void setup(UserRepository userDAO) {
        userDAO.deleteAll();
        Set<Role> roles = new HashSet<>();
        roles.add(new Role(ERole.ROLE_ADMIN));
        currentUser = userDAO.save(
                new User(userName,userName+"@gmail.com","test@123","9912345678",new HashSet<>())
        );
        token = "Bearer " + TokenAuthenticationService.createToken(currentUser.getUsername());
    }
}
