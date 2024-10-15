package calculator.entity;

import java.util.Set;

public class Separator {

    private static final String COMMA = ",";
    private static final String COLON = ":";
    private final String sep;


    public Separator(String separator) {
        if (separator.length() > 2) {
            throw new IllegalArgumentException("Separator should be a single character");
        }
        this.sep = separator;
    }

    public static String getAllSeparators(Set<Separator> separatorSet) {
        StringBuilder sb = new StringBuilder(COLON + COMMA);
        for (Separator separator : separatorSet) {
            sb.append(separator.sep);
        }
        return sb.toString();
    }

}
