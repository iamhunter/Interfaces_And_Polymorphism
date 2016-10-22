package edu.clemson.cpsc.project3;

/**
 * Created by andrewmarionhunter on 10/17/16.
 */
public abstract class AbstractSSE implements StringSetExtended {
    @Override
    public final void union(StringSet rhs, StringSet result) {
        StringSet copiedThis = new StringSet1(100);
        StringSet copiedrhs = new StringSet1(100);
        this.copy(copiedThis);


        StringSet tempSet = new StringSet1(100);
        while(rhs.sizeOfSet() > 0)
        {
            String temp = rhs.removeAny();
            copiedrhs.insert(temp);
            tempSet.insert(temp);
        }
        while(tempSet.sizeOfSet() > 0)
        {
            rhs.insert(tempSet.removeAny());
        }



        while(copiedThis.sizeOfSet() > 0)
        {
            String tempOrary = copiedThis.removeAny();
            if(!result.contains(tempOrary)) {
                result.insert(tempOrary);
            }
        }
        while(copiedrhs.sizeOfSet() > 0) {
            String tempOrary = copiedrhs.removeAny();
            if (!result.contains(tempOrary)) {
                result.insert(tempOrary);
            }
        }
    }

    @Override
    public final void intersect(StringSet rhs, StringSet result)
    {
        
    }
    @Override
    public final void difference(StringSet rhs, StringSet result) {


    }
    @Override
    public final void copy(StringSet set) {
        StringSet tempSet = new StringSet1(100);
        while(this.sizeOfSet() > 0)
        {
            String temp = this.removeAny();
            set.insert(temp);
            tempSet.insert(temp);
        }
        while(tempSet.sizeOfSet() > 0)
        {
            this.insert(tempSet.removeAny());
        }
    }
    @Override
    public final boolean equals(Object obj) {
    /* insert code here */
        return true;
    }
    /**
     * This method returns a string representation of the set,
     * listing the elements in any order.
     * Example: { "elem1", "elem2", "elem3", "elem4" }
     */
    @Override
    public final String toString() {
        String returnedString = "{ ";
        for(int length = this.sizeOfSet(); length > 0; length--)
        {
            returnedString += "\"" + this.removeAny() + "\", ";
        }
        returnedString += "}";
        return returnedString;
    }
}
