package com.anyaudit.base;

import com.anyaudit.models.ERole;
import com.anyaudit.security.services.UserDetailsImpl;
import org.junit.After;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseManagerTest extends BaseTest{

    public void setUp(ERole role){
        List<GrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority(role.name()));
        UserDetailsImpl userDetails = new UserDetailsImpl(123l,"TestManager","Manager@gmail.com","1234567890","123456",authorities);
        UsernamePasswordAuthenticationToken authentication =
                new UsernamePasswordAuthenticationToken(
                        userDetails,
                        null,
                        userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }


}
