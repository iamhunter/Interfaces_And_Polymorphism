package edu.clemson.cpsc.project3;

import java.io.IOException;

/**
 * Created by andrewmarionhunter on 10/17/16.
 */
public class main {
    public static void main(String[] args) throws IOException {
        StringQueue2 test = new StringQueue2(10);
        StringQueue2 test1 = new StringQueue2(10);

        test.enqueue("1");
        test.enqueue("2");
        test.enqueue("3");
        test.enqueue("4");
        test.enqueue("5");
        test.enqueue("6");
        test.enqueue("7");


        test.dequeue();
        test.dequeue();

        test.enqueue("10");

        //System.out.println(test.contains("11"));

        //test.copy(test1);

        System.out.println(test.toString());
    }
}
