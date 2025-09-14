package com.app.leetcode;

import java.util.*;

public class AllReciepe {

    public static void main(String[] args) {

        String[] recipes = {"bread", "sandwich", "burger"};
        List<List<String>> ingredients = new ArrayList<>();
        List<String> ingredient1 = new ArrayList<>(Arrays.asList("yeast", "flour"));
        List<String> ingredient2 = new ArrayList<>(Arrays.asList("bread", "meat"));
        List<String> ingredient3 = new ArrayList<>(Arrays.asList("sandwich", "meat", "bread"));
        ingredients.add(ingredient1);
        ingredients.add(ingredient2);
        ingredients.add(ingredient3);
        String[] supplies = {"yeast", "flour", "meat"};
        System.out.println(findAllRecipes(recipes, ingredients, supplies));


    }

    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {

        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> inDegree = new HashMap<>();
        Set<String> available = new HashSet<>(Arrays.asList(supplies));

        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            inDegree.put(recipe, ingredients.get(i).size());

            for (String ing : ingredients.get(i)) {
                graph.computeIfAbsent(ing, k -> new ArrayList<>()).add(recipe);
            }
        }

        Queue<String> queue = new LinkedList<>(available);
        List<String> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            String current = queue.poll();

            if (inDegree.containsKey(current)) {
                result.add(current);
            }

            if (!graph.containsKey(current)) continue;

            for (String next : graph.get(current)) {
                inDegree.put(next, inDegree.get(next) - 1);
                if (inDegree.get(next) == 0) {
                    queue.add(next);
                }
            }
        }

        return result;
    }


}
