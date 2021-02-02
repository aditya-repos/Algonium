package com.kepler51.ds.array.leetcode.easy;

public class Array1409 {

    //PD: 1409. Queries on a Permutation With Key
    //Link : https://leetcode.com/problems/queries-on-a-permutation-with-key/
    public static int[] processQueries(int[] queries, int m) {
        int[] permutation = new int[m];
        for (int i = 0; i < m; i++)
            permutation[i] = i + 1;
        for (int i =0; i< queries.length; i++) {
            int pos = findPosition(permutation, queries[i]);
            reStructureArray(permutation, pos, permutation[pos]);
            queries[i] = pos;
        }
        return queries;
    }

    private static void reStructureArray(int[] permutation, int pos, int ele) {
        for (int i = pos; i > 0; i--) {
            permutation[i] = permutation[i - 1];
        }
        permutation[0] = ele;
    }

    private static int findPosition(int[] queries, int ele) {
        for (int i = 0; i < queries.length; i++)
            if (ele == queries[i])
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] queries = {7,5,5,8,3};
        int m = 8;
        for (int i : processQueries(queries,m)) {
            System.out.println(i);
        }
    }

}
