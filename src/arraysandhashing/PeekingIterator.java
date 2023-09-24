package arraysandhashing;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 284. Peeking Iterator
 *
 * Design an iterator that supports the peek operation on an existing iterator in addition to the hasNext and the next operations.
 *
 * Implement the PeekingIterator class:
 *
 * PeekingIterator(Iterator<int> nums) Initializes the object with the given integer iterator iterator.
 * int next() Returns the next element in the array and moves the pointer to the next element.
 * boolean hasNext() Returns true if there are still elements in the array.
 * int peek() Returns the next element in the array without moving the pointer.
 * Note: Each language may have a different implementation of the constructor and Iterator, but they all support the int next() and boolean hasNext() functions.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["PeekingIterator", "next", "peek", "next", "next", "hasNext"]
 * [[[1, 2, 3]], [], [], [], [], []]
 * Output
 * [null, 1, 2, 2, 3, false]
 *
 * Explanation
 * PeekingIterator peekingIterator = new PeekingIterator([1, 2, 3]); // [1,2,3]
 * peekingIterator.next();    // return 1, the pointer moves to the next element [1,2,3].
 * peekingIterator.peek();    // return 2, the pointer does not move [1,2,3].
 * peekingIterator.next();    // return 2, the pointer moves to the next element [1,2,3]
 * peekingIterator.next();    // return 3, the pointer moves to the next element [1,2,3]
 * peekingIterator.hasNext(); // return False
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 1000
 * All the calls to next and peek are valid.
 * At most 1000 calls will be made to next, hasNext, and peek.
 */
public class PeekingIterator implements Iterator<Integer> {

    private LinkedList<Integer> list = new LinkedList<>();
    private int pointer = 0;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iterator.forEachRemaining(v->{
            list.add(v);
        });
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(hasNext()){
            return list.get(pointer);
        }else{
            return null;
        }
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
            Integer result = list.get(pointer);
            pointer++;
            return result;
    }

    @Override
    public boolean hasNext() {
        return pointer<=list.size()-1;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3,4);
        integers.iterator();
        PeekingIterator peekingIterator = new PeekingIterator(integers.iterator());
        System.out.println(peekingIterator.hasNext());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.hasNext());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.hasNext());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.hasNext());
    }

    public static void main2(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        integers.iterator();
        PeekingIterator peekingIterator = new PeekingIterator(integers.iterator());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.hasNext());
    }
}
