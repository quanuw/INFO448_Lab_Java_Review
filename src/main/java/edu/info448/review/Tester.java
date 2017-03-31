package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
        Dog[] pups = Dog.createPuppies(3);
        System.out.println(Arrays.toString(pups));
        Dog v1 = new Husky("Henry");
        //Huggable v2 = new Husky(); will not compile
        Huggable v3 = new TeddyBear();
        //Husky v4 = new TeddyBear(); will not compile
        Husky v2 = (Husky)v1;
        v2.bark();
        ArrayList<Huggable> hugList = new ArrayList<Huggable>(); //a list of huggable things
        hugList.add(new Husky("Fred")); //a Husky is Huggable
        hugList.add(new TeddyBear()); //so are Teddybears!

        //enhanced for loop ("foreach" loop)
        //read: "for each Huggable in the hugList"
        for(Huggable thing : hugList) {
            thing.hug();
        }

        Animal fish = new Animal();
        GiftBox<Husky> gift = new GiftBox<Husky>(v2);

	}
}
