package com.example.kyrah.aaflightday;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EnumClasses {
    Random rand = new Random();
    enum Alphabet {
        a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;

        private static final List<Alphabet> AlphabetList =
                Collections.unmodifiableList(Arrays.asList(values()));

    }

    private Alphabet indexToLetter(int index) {
        return Alphabet.AlphabetList.get(index);
    }

    public char getLetterAtIndex(int index) {
        String letter = Alphabet.AlphabetList.get(index).toString();
        return letter.charAt(0);
    }

    enum POITypes {
        Restaurant, Store, Restroom
    }

    /*public String randomPOIType() {
        return POITypes.valueOf(rand.nextInt(3)).toString();
    }*/

    enum Restaurant {
        Popeyes, ChickFilA, BurgerKing, Chipotle, FiveGuys, Starbucks;

        private static final List<Restaurant> RestaurantList =
                Collections.unmodifiableList(Arrays.asList(values()));
    }

    private Restaurant indexToRestaurant(int index) {
        return Restaurant.RestaurantList.get(index);
    }

    public String randomRestaurant(){
        return indexToRestaurant(rand.nextInt(Restaurant.RestaurantList.size())).toString();
    }

}
