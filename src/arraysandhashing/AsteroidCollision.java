package arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 735. Asteroid Collision
 *
 * We are given an array asteroids of integers representing asteroids in a row.
 *
 * For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
 *
 * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
 *
 *
 *
 * Example 1:
 *
 * Input: asteroids = [5,10,-5]
 * Output: [5,10]
 * Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
 * Example 2:
 *
 * Input: asteroids = [8,-8]
 * Output: []
 * Explanation: The 8 and -8 collide exploding each other.
 * Example 3:
 *
 * Input: asteroids = [10,2,-5]
 * Output: [10]
 * Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 *
 *
 * Constraints:
 *
 * 2 <= asteroids.length <= 104
 * -1000 <= asteroids[i] <= 1000
 * asteroids[i] != 0
 */
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < asteroids.length; i++) {
            int ast = asteroids[i];
            if(ast>0){
                list.add(ast);
                continue;
            }
            if(ast<0){
                if(list.isEmpty() || list.get(list.size()-1)<0){
                    list.add(ast);
                    continue;
                }
                if(list.get(list.size()-1)==Math.abs(ast)){
                    list.remove(list.size()-1);
                    continue;
                }
                if(list.get(list.size()-1)>Math.abs(ast)){
                    continue;
                }
                if(list.get(list.size()-1)<Math.abs(ast)){
                    list.remove(list.size()-1);
                    i--;
                    continue;
                }
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new AsteroidCollision().asteroidCollision(new int[]{5,10,-5})));
        System.out.println(Arrays.toString(new AsteroidCollision().asteroidCollision(new int[]{8,-8})));
        System.out.println(Arrays.toString(new AsteroidCollision().asteroidCollision(new int[]{10,2,-5})));

    }
}
