package com.example.rmcconkey.pushnotificationexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rmcconkey on 8/23/15.
 */
public class Utility {
    //Email Pattern
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Validate Email with regular expression
     *
     */
    public static boolean validate(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }}
