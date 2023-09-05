package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int [] shiftArray = new int[array.length];
        if(array.length > 0) {
            System.arraycopy(array, 0, shiftArray, 1, array.length - 1);
            System.arraycopy(array, array.length - 1, shiftArray, 0, 1);
            System.arraycopy(shiftArray, 0, array, 0, array.length);
        }
    }

    static void cycleSwap(int[] array, int shift) {
        int[] shiftArray = new int[array.length];
        if (shift < array.length) {
            System.arraycopy(array, 0, shiftArray, shift, array.length - shift);
            System.arraycopy(array, array.length - shift, shiftArray, 0, shift);
            System.arraycopy(shiftArray, 0, array, 0, array.length);
        }
    }
}
