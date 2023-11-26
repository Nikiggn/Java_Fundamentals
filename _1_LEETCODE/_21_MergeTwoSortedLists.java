package _1_LEETCODE;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _21_MergeTwoSortedLists {
    public static void main(String[] args) {



    }
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j=0 ; j < nums.length; j++){
                result[i] += Math.abs(nums[j] - nums[j]);
            }
        }
        return  result;
    }
}
