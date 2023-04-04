/*package com.balim.eticaret.business.rules;
import org.apache.commons.validator.routines.PasswordValidator;
import org.apache.commons.validator.routines.RegexValidator;

public class PasswordRules {

        public static final int MIN_LENGTH = 8;
        public static final int MAX_LENGTH = 20;
        public static final String SPECIAL_CHARS_REGEX = "[!@#$%^&*()_+=\\[\\]{}|;':\",./<>?\\\\-]";

        private static PasswordValidator passwordValidator = new PasswordValidator(
                new RegexValidator(SPECIAL_CHARS_REGEX),
                new RegexValidator("\\d"),
                new RegexValidator("[a-z]"),
                new RegexValidator("[A-Z]"),
                new RegexValidator(".{" + MIN_LENGTH + "," + MAX_LENGTH + "}")
        );

        public static boolean validatePassword(String password) {
            return passwordValidator.isValid(password);
        }
    }*/

