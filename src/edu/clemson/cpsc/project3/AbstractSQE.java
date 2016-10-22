package edu.clemson.cpsc.project3;

/**
 * Created by andrewmarionhunter on 10/17/16.
 */
public abstract class AbstractSQE implements StringQueueExtended {
    @Override
    public final boolean contains(String element) {
        String temp;
        boolean tempResult = false;

        for(int i = 0; i < this.length(); i++)
        {
            temp = this.dequeue();
            if(temp == element)
            {
                tempResult = true;
            }
            this.enqueue(temp);
        }
    return tempResult;
    }
    @Override
    public final void copy(StringQueue queue) {
        String temp;
        for(int i = 0; i < this.length(); i++)
        {
            temp = this.dequeue();
            queue.enqueue(temp);
            this.enqueue(temp);
        }
    }

    @Override
    public final boolean equals(Object obj) {
    /* insert code here */
        return obj == this;

    }
    /**
     * This method returns a string representation of the queue,
     * listing the elements from front to back.
     * Example: [ "front", "elem2", "elem3", "back" ]
     */
    @Override
    public final String toString() {
        String returnedString = "[ ";
        for(int length = this.length(); length > 0; length--)
        {
            returnedString += "\"" + this.dequeue() + "\", ";
        }
        returnedString += "]";
        return returnedString;
    }
}
