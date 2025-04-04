package org.knit;

import org.junit.*;
import org.knit.solutions.Task18.Arara;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class Task18Test {
    private Arara ara;

    @Before
    public void setUp() {
        ara = new Arara(); // Инициализация перед каждым тестом
    }

    @Test
    public void testNorm() {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        ara.duplicateZeros(arr);

        assertArrayEquals(arr, new int[]{1, 0, 0, 2, 3, 0, 0, 4});
    }

    @Test
    public void testSmall() {
        int[] arr = new int[]{1, 2, 3};
        ara.duplicateZeros(arr);
        assertArrayEquals(arr, new int[]{1, 2, 3});
    }

    @Test
    public void testEdge() {
        int[] arr = new int[]{0, 1, 2, 3, 4, 0};
        ara.duplicateZeros(arr);
        assertArrayEquals(arr, new int[]{0, 0, 1, 2, 3, 4});
    }

    @Test
    public void testNull() {
        int[] arr = new int[]{};
        ara.duplicateZeros(arr);
        assertArrayEquals(arr, new int[]{});
    }

    @Test
    public void testTime() {
        long timeElapsed = 0;
        for (int i = 0; i < 101; i++) {
            int[] arr = IntStream.generate(() -> new Random().nextInt(10)).limit(10000).toArray();
            long startTime = System.nanoTime();
            ara.duplicateZeros(arr);
            long endTime = System.nanoTime();
            timeElapsed = Math.max(timeElapsed,endTime - startTime);
        }

        assertTrue(timeElapsed < 21111111);
    }


    @After
    public void tearDown() {
        ara = null; // Очистка ресурсов после теста
    }
}
