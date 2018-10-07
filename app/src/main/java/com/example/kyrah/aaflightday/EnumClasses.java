package com.example.kyrah.aaflightday;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EnumClasses {
    Random rand = new Random();

    enum Alphabet {
        a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

        private static final List<Alphabet> AlphabetList =
                Collections.unmodifiableList(Arrays.asList(values()));

    }

    private Alphabet indexToLetter(int index) {
        return Alphabet.AlphabetList.get(index);
    }

    public String getLetterAtIndex(int index) {
        return indexToLetter(index).name();
    }

    enum POITypes {
        Restaurant, Store, Restroom;

        private static final List<POITypes> POITypeList =
                Collections.unmodifiableList(Arrays.asList(values()));
    }

    public String randomPOIType() {
        return POITypes.POITypeList.get(rand.nextInt(3)).toString();
    }

    public String randomPOINameFromType(String type) {
        if (type.equals("Restaurant")) { return randomRestaurant(); }
        else if (type.equals("Restroom")) { return randomRestroom(); }
        else if (type.equals("Store")) { return randomStore(); }
        else { return "Placeholder"; }
    }

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

    enum Restroom {
        MaleRestroom, FemaleRestroom;

        private static final List<Restroom> RestroomList =
                Collections.unmodifiableList(Arrays.asList(values()));
    }

    private Restroom indexToRestroom(int index) { return Restroom.RestroomList.get(index); }

    public String randomRestroom(){
        return indexToRestroom(rand.nextInt(Restroom.RestroomList.size())).toString();
    }

    enum Store {
        TechStop, Bookstore, NewsStand, Grocery;

        private static final List<Store> StoreList =
                Collections.unmodifiableList(Arrays.asList(values()));
    }

    private Store indexToStore(int index) { return Store.StoreList.get(index); }

    public String randomStore(){
        return indexToStore(rand.nextInt(Store.StoreList.size())).toString();
    }
}
