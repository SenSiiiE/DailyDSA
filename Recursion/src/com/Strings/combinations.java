package com.Strings;

import java.util.ArrayList;
import java.util.List;

public class combinations {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[] {2,3,6,7}, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        return helper(candidates, 0, target, new ArrayList<>(), new ArrayList<>());
    }

    static List<List<Integer>> helper(int[] candidates, int start, int target, List<Integer> internal, List<List<Integer>> result) {
        if(target == 0){
            result.add(new ArrayList<>(internal));
            return result;
        }
        if(target < 0){
            return new ArrayList<>();
        }

        for(int i = start; i < candidates.length; i++){
            internal.add(candidates[i]);
            helper(candidates, i, target - candidates[i], internal, result);
            internal.remove(internal.size()-1);
        }
        return result;
    }



//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        helper(candidates, 0, target, new ArrayList<>(), result);
//        return result;
//    }
//
//    private void helper(int[] candidates, int startIndex, int target, List<Integer> currentCombination, List<List<Integer>> result) {
//        if (target == 0) {
//            result.add(new ArrayList<>(currentCombination));
//            return;
//        }
//
//        if (target < 0) {
//            return;
//        }
//
//        for (int i = startIndex; i < candidates.length; i++) {
//            currentCombination.add(candidates[i]);
//            helper(candidates, i, target - candidates[i], currentCombination, result);
//            currentCombination.remove(currentCombination.size() - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        combinations solution = new combinations();
//        int[] candidates = {2, 3, 6, 7};
//        int target = 7;
//        List<List<Integer>> result = solution.combinationSum(candidates, target);
//        System.out.println(result);
//    }
}

