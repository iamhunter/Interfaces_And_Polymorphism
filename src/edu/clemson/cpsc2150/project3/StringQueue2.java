package edu.clemson.cpsc2150.project3;

/**
 * Created by andrewmarionhunter on 10/22/16.
 */
public class StringQueue2 extends AbstractSQE {
    /*
    This class uses a circular array implementation, such that
    the front of the queue moves around the array as elements
    are enqueued and dequeued.
    invariant 0 <= last <= contents.length;
    correspondence maxLength = contents.length;
    correspondence conceptual this = contents[0..last-1]
    */
    private int myLast;
    private int myFirst;
    private int myMaxLength;
    private String[] myContents;

    public StringQueue2(int maxLength) {
        myContents = new String[maxLength];
        myMaxLength = maxLength;
        myFirst = 0;
        myLast = 0;
    }

    @Override
    public void enqueue(String element) {
        myContents[myLast] = element;
        myLast = (myLast + 1) % myContents.length;
    }

    @Override
    public String dequeue() {
        String tempDequeue = myContents[myFirst];
        myContents[myFirst] = null;
        myFirst = (myFirst + 1) % myContents.length;
        return tempDequeue;
    }

    @Override
    public String front() {
        return myContents[myFirst];
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
}