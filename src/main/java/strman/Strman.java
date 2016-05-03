package strman;

import java.util.StringJoiner;

/**
 * A String manipulation library without any dependencies
 */
public interface Strman {


    /**
     * Appends Strings to value
     *
     * @param value   initial String
     * @param appends an array of strings to append
     * @return full String
     */
    static String append(final String value, final String... appends) throws IllegalArgumentException {
        return appendArray(value, appends);
    }

    /**
     * Append an array of String to value
     *
     * @param value   initial String
     * @param appends an array of strings to append
     * @return full String
     */
    static String appendArray(String value, String[] appends) {
        if (value == null) {
            throw new IllegalArgumentException("'value' should be not null.");
        }
        if (appends == null || appends.length == 0) {
            return value;
        }
        StringJoiner joiner = new StringJoiner("");
        for (String append : appends) {
            joiner.add(append);
        }
        return value + joiner.toString();
    }
}