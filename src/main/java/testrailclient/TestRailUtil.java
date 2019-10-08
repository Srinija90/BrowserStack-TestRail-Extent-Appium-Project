package testrailclient;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;

public class TestRailUtil {
    public static String getTestRailCaseId(Collection<String> tags) {
        Pattern p = Pattern.compile("^@");

        for (Iterator<String> iterator = tags.iterator(); iterator.hasNext(); ) {
            String tag = iterator.next();

            if (Pattern.matches("^@C(.*)", tag)) {
                return tag.substring(2);
            }
        }

        return null;
    }

    public static int getTestRailStatus(String status) {
        switch (status) {
            case "passed":
                return 1;
            case "failed":
                return 5;
            default:
                return 4;
        }
    }

}
