package com.hz;
import java.util.List;
import java.util.Arrays;

public class Adapter {
    public boolean contains(String answer) {

        String[] positiveAnswers = new String[]{"true", "yes", "yeah", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
//        System.out.println(positiveAnswers[0]);
        List<String> list = Arrays.asList(positiveAnswers);

        if (list.contains(answer)) {
            return true;
        }
        return false;
    }
}
