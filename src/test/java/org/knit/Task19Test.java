package org.knit;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.*;
import org.knit.solutions.Task19.Zip;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class Task19Test {
    private Zip zip;

    @Before
    public void setUp() {
        zip = new Zip(); // Инициализация перед каждым тестом
    }

    @Test
    public void testNorm() {
        int[] arr1 =new int[]{1,2,3,0,0,0};
        int[] arr2 =new int[]{2,5,6};
        int m=3,n=3;
        zip.merge(arr1,m,arr2,n);
        assertArrayEquals(arr1, new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    public void testSmall() {
        int[] arr1 =new int[]{1};
        int[] arr2 =new int[]{};
        int m=1,n=0;
        zip.merge(arr1,m,arr2,n);
        assertArrayEquals(arr1, new int[]{1});
    }

    @Test
    public void testEdge() {
        int[] arr1 =new int[]{0};
        int[] arr2 =new int[]{1};
        int m=0,n=1;
        zip.merge(arr1,m,arr2,n);
        assertArrayEquals(arr1, new int[]{1});
    }

    @Test
    public void testNull() {
        int[] arr1 =new int[]{};
        int[] arr2 =new int[]{};
        int m=0,n=0;
        zip.merge(arr1,m,arr2,n);
        assertArrayEquals(arr1, new int[]{});
    }
    @Test
    public void testNegDoubles() {
        int[] arr1 =new int[]{-3,-2,-1,0,0,2,3,4,0,0};
        int[] arr2 =new int[]{5,6};
        int m=8,n=2;
        zip.merge(arr1,m,arr2,n);
        assertArrayEquals(arr1, new int[]{-3,-2,-1,0,0,2,3,4,5,6});
    }

    @Test
    public void testTime() {
        long timeElapsed = 0;
        for (int i = 0; i < 101; i++) {
            int[] arr1t = IntStream.generate(() -> new Random().nextInt()).limit(10000).toArray();
            int[] arr2 = IntStream.generate(() -> new Random().nextInt()).limit(10000).toArray();
            int[] arr1 = ArrayUtils.addAll(arr1t, new int[10000]);
            int n=10000,m=10000;
            long startTime = System.nanoTime();
            zip.merge(arr1,m,arr2,n);;
            long endTime = System.nanoTime();
            timeElapsed = Math.max(timeElapsed,endTime - startTime);
        }

        assertTrue(timeElapsed < 21111111);
    }


    @After
    public void tearDown() {
        zip = null; // Очистка ресурсов после теста
    }
}