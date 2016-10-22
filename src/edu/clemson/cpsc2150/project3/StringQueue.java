package edu.clemson.cpsc2150.project3;

/**
 * Created by andrewmarionhunter on 10/17/16.
 */
public interface StringQueue {
    void enqueue(String element);
    String dequeue();
    String front();
    int length();
    int getMaxLength();
    void clear();
}