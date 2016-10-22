package edu.clemson.cpsc.project3;

/**
 * Created by andrewmarionhunter on 10/17/16.
 */
public interface StringQueueExtended extends StringQueue {
    /**
     * @param element Element to search for in the queue.
     * @ensures
     * contains = Occurs_Ct(element, this) > 0
     */
    boolean contains(String element);
    /**
     * @ensures
     * this = #this
     * queue = this
     */
    void copy(StringQueue queue);
}
