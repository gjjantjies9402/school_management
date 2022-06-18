package za.ac.cput.Utility;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {
    public static boolean isEmpty(String t){
        return (t.equals(null) || t.isEmpty() || t.equals("") || t.equalsIgnoreCase("null"));
    }

    //Using org.apache.commons.lang3.StringUtils
    public static boolean isEmptyOrNull(String str){
        return StringUtils.isEmpty(str);
    }

    //Helper to set string empty in place of null
    public static String setEmptyIfNull(String str){
        if(isEmptyOrNull(str)) return StringUtils.EMPTY;
        return str;
    }
    //reuse of isEmptyOrNull by checking string param
    public static void checkStringParam(String paramName, String paramValue){
        if(isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(String.format("Invalid value for param: %s", paramName));
    }

    public static boolean isValidEmail(String email){
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);
    }

    public static String generateID(){
        return UUID.randomUUID().toString();
    }
}
