package com.funkyganesha;

import com.funkyganesha.stringtonumber.SingletonCharToNumberMap;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Created by barga009 on 8/10/14 at 3:41 AM. Comment {"$EXPR$"}
 */
public class SingletonCharToNumberMapTest {
    @Test
    public void testGetInstance() throws Exception {
        Map<Character, Integer> instance1 = SingletonCharToNumberMap.getInstance();
        Map<Character, Integer> instance2 = SingletonCharToNumberMap.getInstance();
        assertTrue("The two instances should be the same", instance1 == instance2);
    }
}
