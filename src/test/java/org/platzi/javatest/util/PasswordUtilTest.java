package org.platzi.javatest.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.platzi.javatest.util.PasswordUtil.securityLeve.*;

public class PasswordUtilTest {

    @Test
    public void password_complete(){
       assertEquals(STRONG, PasswordUtil.assesPassword("Tango2017."));
    }

    @Test
    public void password_without_8_letters(){
       assertEquals(WEAK, PasswordUtil.assesPassword("12345"));
    }

    @Test
    public void password_with_only_letters(){
       assertEquals(MEDIUM, PasswordUtil.assesPassword("abcdefgh"));
    }

    @Test
    public void password_without_especialCaracters(){
       assertEquals(MEDIUM, PasswordUtil.assesPassword("Juanfe205"));
    }

}