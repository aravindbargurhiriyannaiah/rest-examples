package com.funkyganesha;

import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by barga009 on 8/10/14 at 3:57 AM. Comment {"$EXPR$"}
 */
public class StringToNumberConverterTest {

    @Test
    public void testGenerateNumbersForString_cornerCases()  {
        String str = StringToNumberConverter.generateNumbersForString(null);
        assertNull(str);

        str = StringToNumberConverter.generateNumbersForString("");
        assertNull(str);

        str= StringToNumberConverter.generateNumbersForString("    ");
        assertNull(str);
    }

    @Test
    public void testGenerateNumbersForString_validCases() {
        String str = StringToNumberConverter.generateNumbersForString("aravind");
        assertEquals("Invalid char to number mapping", "1181229144", str);
    }
}
