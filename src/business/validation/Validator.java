/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rohan
 */
public class Validator {
 
    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String PHONE_NUM_PATTERN
            = "\\d{3}-\\d{3}-\\d{4}";
    private static final String ZIP_CODE_PATTERN
            = "\\d{5}";
    private static final String DATE_PATTERN
            = "(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d\\d)";

    public Validator() {

    }

    /**
     * Validate date with regular expression
     *
     * @param date
     */
    public boolean validateDate(final String date) {
        pattern = Pattern.compile(DATE_PATTERN);
        matcher = pattern.matcher(date);
        return matcher.matches();

    }

    /**
     * Validate email with regular expression
     *
     * @param email
     */
    public boolean validateEmail(final String email) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();

    }

    /**
     * Validate phoneNum with regular expression
     *
     * @param phoneNum
     */
    public boolean validatePhoneNumber(final String phoneNum) {
        pattern = Pattern.compile(PHONE_NUM_PATTERN);
        matcher = pattern.matcher(phoneNum);
        return matcher.matches();

    }

    /**
     * Validate zipCode with regular expression
     *
     * @param zipCode
     */
    public boolean validateZipCode(final String zipCode) {
        pattern = Pattern.compile(ZIP_CODE_PATTERN);
        matcher = pattern.matcher(zipCode);
        return matcher.matches();

    }
}
