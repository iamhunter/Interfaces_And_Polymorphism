package edu.clemson.cpsc.project3;

import java.util.Objects;

/**
 * Created by andrewmarionhunter on 10/22/16.
 */
public class StringSet2 extends AbstractSSE {
    /*
    This class uses a StringQueueExtended implementation, such
    that the unique elements of the set are stored in any order
    in an instance of StringQueueExtended.
    invariant for all s: String, Occurs_Ct(s, q) <= 1;
    correspondence maxSize = maxLength of q;
    correspondence conceptual this = Entries(q);
    */
    private StringQueueExtended myQueue;
    private int myCurrentlength;

    StringSet2(StringQueueExtended queue) {
        myQueue = queue;
        myCurrentlength = 0;


    }

    @Override
    public void insert(String element) {
        myQueue.enqueue(element);
        myCurrentlength++;
    }

    @Override
    public boolean contains(String element) {
        StringSet tempSet = new StringSet1(100);
        this.copy(tempSet);

        while(tempSet.sizeOfSet() > 0)
        {
            if(Objects.equals(tempSet.removeAny(), element))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(String element) {
        myCurrentlength--;

        myQueue.dequeue();
    }

    @Override
    public String removeAny() {
        myCurrentlength--;

        return myQueue.dequeue();
    }

    @Override
    public int sizeOfSet() {
        return myCurrentlength;
    }

    @Override
    public int getMaxSize() {
        return myQueue.getMaxLength();
    }

    @Override
    public void clear() {
        myQueue.clear();

    }
}