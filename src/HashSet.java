// Time Complexity : Add: O(1), Remove: O(1), Contains: O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none


// Your code here along with comments explaining your approach
/**
 * Did not implement Collision, instead used the input size and Modulo hash function.
 * Will try and improvise it by using collision control methods.
 */

import java.util.Arrays;

public class HashSet {
    int[] hset;
    int capacity, size;

    HashSet() {
        hset = new int[1000000];
        capacity = 99999;
        size = 0;
        Arrays.fill(hset, Integer.MAX_VALUE);
    }

    public void add(int key) {
        int hashval = hashCode(key);
        if (hset[hashval] == Integer.MAX_VALUE)
            hset[hashval] = key;
        // else
        //     return false;
        // return true;
    }

    public int hashCode(int key) {
        // int val = key ^ ((key>>>20) ^ (key>>>12));
        // val = val ^ (val >>> 7) ^ (val >>>4);
        // return (val & (capacity-1));
        return key % capacity;
    }

    public void remove(int key) {
        int hashval = hashCode(key);
        if (hset[hashval] != Integer.MAX_VALUE)
            hset[hashval] = Integer.MAX_VALUE;
    }

    public boolean contains(int key) {
        int hashval = hashCode(key);
        if (hset[hashval] != Integer.MAX_VALUE)
            return true;
        return false;
    }
}
