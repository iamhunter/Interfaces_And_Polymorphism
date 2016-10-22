package edu.clemson.cpsc2150.project3;

/**
 * Created by andrewmarionhunter on 10/17/16.
 */
public interface StringSetExtended extends StringSet {
    /**
     * @param rhs The right-hand-side of the union operation,
    i.e. the set to union with this
     * @param result The set which will contain the result
    of the union operation
     * @requires
     * result = { }
     * result.maxSize >= |this| + |rhs|
     * @ensures
     * this = #this
     * rhs = #rhs
     * result = this union rhs
     */
    void union(StringSet rhs, StringSet result);
    /**
     * @param rhs The right-hand-side of the intersect operation,
    i.e. the set to intersect with this
     * @param result The set which will contain the result
    of the intersect operation
     * @requires
     * result = { }
     * result.maxSize >= |this| or result.maxSize >= |rhs|
     * @ensures
     * this = #this
     * rhs = #rhs
     * result = this intersect rhs
     */
    void intersect(StringSet rhs, StringSet result);    /**
     * @param rhs The right-hand-side of the difference operation,
    i.e. the set to subtract from this
     * @param result The set which will contain the result
    of the difference operation
     * @requires
     * result = { }
     * result.maxSize >= |this|
     * @ensures
     * this = #this
     * rhs = #rhs
     * result = this \ rhs
     */
    void difference(StringSet rhs, StringSet result);
    /**
     * @ensures
     * this = #this
     * queue = this
     */
    void copy(StringSet set);
}
