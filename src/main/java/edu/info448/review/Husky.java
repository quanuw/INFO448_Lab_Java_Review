package edu.info448.review; //package declaration (needed)

public class Husky extends Dog implements Huggable {
    /* class body goes here */

    public Husky(String name) {
	    super(name, "Husky");
	}

    public void pullSled() {
        System.out.println("Pull Sled");
    }

    public void bark() {
		System.out.println(this+" says: woof!");
	}

    public void hug() {
    }
}
