package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here


        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        Adapter adapter = new Adapter();

//        Boolean ans1 = adapter.contains(reader.readLine()); line 29

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        Boolean ans1 = adapter.contains(reader.readLine());

//        // read response
//        Boolean ans1 = reader.readLine().equals("Yep");

        //TODO
        // the reader should accept the following values as true:
        // "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"


        if (ans1) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }
}