package edu.clemson.cpsc2150.project3;

import java.util.Objects;

/**
 * Created by andrewmarionhunter on 10/22/16.
 */
public class StringSet1 extends AbstractSSE {
    /*
    This class uses a standard array implementation, such that
    the unique elements of the set are stored in any order
    in the array.
    invariant 0 <= next <= contents.length
    and for all i and j between 0 and next,
    if i != j then contents[i] != contents[j]
    correspondence maxSize = contents.length;
    correspondence conceptual this = Union {contents(i)}
    for i = 1 to next
    */
    private String[] myContents;
    private int myLength;
    private int myCurrentlength;

    StringSet1(int length) {
        myContents = new String[length];
        myLength = length;
        myCurrentlength = 0;
    }

    @Override
    public void insert(String element) {
        for(int i = 0; i < myLength; i++)
        {
            if(myContents[i] == null)
            {
                myContents[i] = element;
                myCurrentlength++;
                return;
            }
        }
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

        for(int i = 0; i < myLength; i ++)
        {
            if(Objects.equals(myContents[i], element))
            {
                myContents[i] = null;
                myCurrentlength++;
                return;
            }
        }

    }

    @Override
    public String removeAny() {
        int i;
        for(i = 0; i < myLength; i++)
        {
            if(myContents[i] != null)
            {
                String tempString = myContents[i];
                myContents[i] = null;
                myCurrentlength--;
                return tempString;
            }
        }
        return null;
    }

    @Override
    public int sizeOfSet() {
        return myCurrentlength;
    }

    @Override
    public int getMaxSize() {
        return myLength;
    }

    @Override
    public void clear() {
        while(this.sizeOfSet() > 0)
        {
            removeAny();
        }

    }
}
