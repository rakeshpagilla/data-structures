/**
 * 
 */
package com.rakesh.datastructures.common;

/**
 * @author RPagilla 
 *https://www.dotnetperls.com/shuffle-java
 *http://introcs.cs.princeton.edu/java/21function/Shuffle.java.html
 * Created at 10:06:15 PM
 *
 */
import java.util.Random;

public class ShuffleArray {
        public static void shuffleArray(int[] a) {
                int n = a.length;
                Random random = new Random();
                for (int i = 0; i < n; i++) {
                	// Get a random index of the array past i.
                        int change = i + random.nextInt(n - i);
                        System.out.println(change);
                        swap(a, i, change);
                }
        }

        private static void swap(int[] a, int i, int change) {
                int helper = a[i];
                a[i] = a[change];
                a[change] = helper;
        }

        public static void main(String[] args) {
                int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };
                shuffleArray(a);
                for (int i : a) {
                        System.out.print(i + " ");
                }
        }
}
