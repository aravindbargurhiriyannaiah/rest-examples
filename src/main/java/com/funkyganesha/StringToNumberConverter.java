package com.funkyganesha;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by barga009 on 8/9/14 at 10:47 PM. Comment {"$EXPR$"}
 */
@RestController
public class StringToNumberConverter {

    @RequestMapping("/convertStringToNumbers")
    public static String generateNumbersForString(@RequestParam(value = "string", defaultValue = "", required = false) String string) {
        String result = null;
        string = StringUtils.trimAllWhitespace(string);
        if (!StringUtils.isEmpty(string)) {
            char[] chars = string.toLowerCase().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : chars) {
                sb.append(SingletonCharToNumberMap.getInstance().get(c));
            }
            result = sb.toString();
        }
        return result;
    }
}
