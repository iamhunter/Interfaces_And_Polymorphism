package edu.clemson.cpsc2150.project3;

/**
 * Created by andrewmarionhunter on 10/19/16.
 */
public class StringQueue1 extends AbstractSQE {
    private int myLast;
    private String[] myContents;
    private int myMaxLength;

    public StringQueue1(int maxLength) {
        myContents = new String[maxLength];
        myMaxLength = maxLength;
    }

    @Override
    public void enqueue(String element) {
        myContents[myLast++] = element;
    }

    @Override
    public String dequeue() {
        String toReturn = myContents[0];
        --myLast;
        System.arraycopy(myContents, 1, myContents, 0, myLast);

        return toReturn;
    }

    @Override
    public String front() {
        return myContents[0];
    }

    @Override
    public int length() {
        return myLast;
    }

    @Override
    public int getMaxLength() {
        return myMaxLength;
    }

    @Override
    public void clear() {
        while(myLast > 0)
        {
            this.dequeue();
        }
    }
/*
This class uses a standard array implementation, such that
the front of the queue is always located at the zero-index
of the array.
You must write a convention and correspondence that matches
your implementation.
*/
}
