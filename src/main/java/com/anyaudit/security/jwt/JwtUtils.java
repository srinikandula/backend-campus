package com.anyaudit.security.jwt;

import java.util.Date;

import com.anyaudit.security.services.UserDetailsImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.*;

@Component
public class JwtUtils {
  private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

  @Value("${bezkoder.app.jwtSecret}")
  private String jwtSecret;

  @Value("${bezkoder.app.jwtExpirationMs}")
  private long jwtExpirationMs = 86400000; // one day in milliseconds


  @Value("${bezkoder.app.jwt.refreshExpirationDateInMs}")
  private long refreshExpirationDateInMs = 9000000;

  public String generateJwtToken(Authentication authentication) {

    UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();

    Date expirationTime = new Date(System.currentTimeMillis() + jwtExpirationMs);

    return Jwts.builder()
            .setSubject(userPrincipal.getUsername())
            .setIssuedAt(new Date())
            .setExpiration(expirationTime)
            .signWith(SignatureAlgorithm.HS512, jwtSecret)
            .compact();
  }


  public String getUserNameFromJwtToken(String token) {
    return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
  }


  public boolean validateJwtToken(String authToken) {
    try {
      Claims claims = Jwts.parser()
              .setSigningKey(jwtSecret)
              .setAllowedClockSkewSeconds(1389611144)
              .parseClaimsJws(authToken)
              .getBody();

      Date expiration = claims.getExpiration();
      Date now = new Date();

      if (now.before(expiration)) {
        return true;
      }
//      else {
////        logger.error("JWT token is expired: {}", expiration);
//      }
    } catch (SignatureException e) {
      logger.error("Invalid JWT signature: {}", e.getMessage());
    } catch (MalformedJwtException e) {
      logger.error("Invalid JWT token: {}", e.getMessage());
    } catch (ExpiredJwtException e) {
      logger.error("JWT token is expired: {}", e.getMessage());
    } catch (UnsupportedJwtException e) {
      logger.error("JWT token is unsupported: {}", e.getMessage());
    } catch (IllegalArgumentException e) {
      logger.error("JWT claims string is empty: {}", e.getMessage());
    }

    return false;
  }

}



