package com.funkyganesha.stringtonumber;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by barga009 on 8/10/14 at 3:09 AM. Comment {"$EXPR$"}
 */
public class SingletonCharToNumberMap {
    private SingletonCharToNumberMap(){}

    public static Map<Character, Integer> getInstance() {
        return InnerClass.map;
    }

    private static class InnerClass {
        private static Map<Character, Integer> map = Maps.newConcurrentMap();
        static {
            int index = 1;
            for (int i = 97; i <= 122; i++) {
                map.put((char) i, index++);
            }
        }
    }
}
