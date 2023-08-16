package com.anyaudit;

import com.anyaudit.controller.TokenAuthenticationService;
import com.anyaudit.models.ERole;
import com.anyaudit.models.Role;
import com.anyaudit.models.User;
import com.anyaudit.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public abstract class BaseControllerTest extends BaseTest{

    @Autowired
    private UserRepository userRepository;
    public static final String userName = "TestUser";
    protected String token ;
    protected User currentUser;

    public void setup() {
        Set<Role> roles = new HashSet<>();
        roles.add(new Role(ERole.ROLE_ADMIN));
        currentUser = userRepository.save(
                new User(userName,userName+"@gmail.com","test@123","9912345678",new HashSet<>())
        );
        token = "Bearer " + TokenAuthenticationService.createToken(currentUser.getUsername());
    }
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
