package com.orhanobut.sample;

public class LoggerUtil {

    public enum LOGGER_ACTIVE_PROFILE {
        LOCAL, DEVELOP, PRODUCT
    }
    public static void init(LOGGER_ACTIVE_PROFILE profile)
    {
        switch (profile)
        {
            case LOCAL:
                break;
            case DEVELOP:
                break;
            case PRODUCT:
                break;
        }
    }
}
