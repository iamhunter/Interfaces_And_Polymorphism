package edu.clemson.cpsc2150.project3;

/**
 * Created by andrewmarionhunter on 10/17/16.
 */
public interface StringSet {
    void insert(String element);
    boolean contains(String element);
    void remove(String element);
    String removeAny();
    int sizeOfSet();
    int getMaxSize();
    void clear();
}
