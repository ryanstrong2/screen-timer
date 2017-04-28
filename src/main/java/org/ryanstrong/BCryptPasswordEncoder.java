package org.ryanstrong;

import org.springframework.security.crypto.password.PasswordEncoder;
import java.lang.Object;
import java.security.SecureRandom;

/**
 * Created by ryanstrong on 4/27/17.
 */
public class BCryptPasswordEncoder extends Object implements PasswordEncoder{
    BCryptPasswordEncoder() {

    }
    BCryptPasswordEncoder(int strength){
    }
    BCryptPasswordEncoder(int strength, SecureRandom random){
    }

    @Override
    public String encode(CharSequence rawPassword) {
        return null;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return false;
    }
    public BCryptPasswordEncoder();
}
