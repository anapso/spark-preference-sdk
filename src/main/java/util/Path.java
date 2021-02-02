package util;

public class Path {

    // The @Getter methods are needed in order to access
    // the variables from Velocity Templates
    public static class Web {
        public static final String CREATE_PREFERENCE = "/preference/";

    }

    public static class Template{
        public final static String HOME = "/velocity/home.vm";
    }

}
