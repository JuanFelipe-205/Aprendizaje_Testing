package org.platzi.javatest.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_String_Onces(){
        /// 1. Primer parametro: Dato esperado
        /// 2. Segundo parametro: Dato ingresado
        Assert.assertEquals("Hola", StringUtil.repat("Hola", 1));
    }

    @Test
    public void repeat_String_ZeroTimes(){
        Assert.assertEquals("", StringUtil.repat("Hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_String_AnyTime(){
        /// 1. Primer parametro: Dato esperado
        /// 2. Segundo parametro: Dato ingresado
        StringUtil.repat("Hola", -1);
    }

}