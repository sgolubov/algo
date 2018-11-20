package ua.com.golubov.algo.stepik;

import java.util.Arrays;
import java.util.Comparator;

public class HighPopulationService {

    public static int getYearWithHighestPopulation(Profile[] profiles) {
        if (profiles == null) {
            throw new IllegalArgumentException();
        }

        int smallest = findSmallestBirthYear(profiles);
        int biggest = findBiggestDeathYear(profiles);
        int[] yearDictionary = new int[biggest - smallest + 1];

        Arrays.stream(profiles)
                .forEach(p -> {
                    yearDictionary[p.birth - smallest] = ++yearDictionary[p.birth - smallest];
                    yearDictionary[p.death - smallest] = --yearDictionary[p.death - smallest];
                });

        int currentPopulation = 0;
        int maxPopulation = 0;
        int maxIndex = 0;

        for (int i = 0; i < yearDictionary.length; i++) {
            currentPopulation += yearDictionary[i];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxIndex = i;
            }
        }

        return smallest + maxIndex;
    }

    private static int findBiggestDeathYear(Profile[] profiles) {
        return Arrays.stream(profiles)
                .max(Comparator.comparing(p -> p.death))
                .map(p -> p.death)
                .get();
    }

    private static int findSmallestBirthYear(Profile[] profiles) {
        return Arrays.stream(profiles)
                .min(Comparator.comparing(p -> p.birth))
                .map(p -> p.birth)
                .get();
    }

    public static class Profile {
        int birth;
        int death;

        public Profile(int birth, int death) {
            this.birth = birth;
            this.death = death;
        }
    }


}
