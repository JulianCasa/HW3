/*
 * *** YOUR NAME GOES HERE / YOUR SECTION NUMBER ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    /*The program creates copies of the given sets */
    Set<Integer> tempA = new TreeSet<Integer>(setA);
    Set<Integer> tempB = new TreeSet<Integer>(setB);

    /*It then uses the remove all method of the Set nterface to leave only the unique
     * elements of each set in the temp sets
    */
    tempA.removeAll(setB);
    tempB.removeAll(setA);

    /*It then creates a new TreeSet to store the unique elements of the temp sets and returns 
     * the new TreeSet
    */
    Set<Integer> difSet = new TreeSet<Integer>(setA);
    difSet.clear();
    difSet.addAll(tempA);
    difSet.addAll(tempB);

    return difSet;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.
    //First creates an arraylist to store the even keys
    List<Integer> evenKeys = new ArrayList<Integer>();

    //It iterates through the keys of the treeMap and adds the even keys to the arraylist
    for (Integer key : treeMap.keySet()) {
      if (key % 2 == 0) {
        evenKeys.add(key);
      }
    }

    //Finally it uses the remove method of the Map interface to remove the even keys values from the treeMap
    for (Integer key : evenKeys) {
      treeMap.remove(key);
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    /*Creates a boolean variable that is initially set to false*/
    Boolean isEqual = false;

    /*It then checks if the trees are equal using the map equals method
     * If they are equal it sets the boolean variable to true. Otherwise it 
     * remains false
    */
    if (tree1.equals(tree2)) {
      isEqual = true;
    }

    //The boolean is then returned
    return isEqual;

  }

} // end treeProblems class
