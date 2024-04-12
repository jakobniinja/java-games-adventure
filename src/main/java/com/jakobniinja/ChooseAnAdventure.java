package com.jakobniinja;

import com.godtsoft.diyjava.DIYWindow;

public class ChooseAnAdventure extends DIYWindow {

  public ChooseAnAdventure() {
    startStory();

    String story = "I woke up in unfamiliar woods. ";
    story = story + "I was hungry and tired. ";
    story = story + "I didn't know where I was. ";
    story = story + "In my pockets where three beans. ";
    story = story + "Up the hill was a well. ";
    story = story + "To the right was a small cottage. ";

    print(story);

    print();
    print("Should I:");
    print("a) Go up the Hill? ");
    print("b) Check out the cottage? ");
    print("c) Plant the beans? ");
    String choice = input();
    switch (choice.toLowerCase()) {
      case "a":
        goUpTheHill();
        break;

      case "b":
        checkTheCottage();
        break;

      case "c":
        plantTheBeans();
        break;

      default:
        startStory();
    }
  }

  private void startStory() {
    print();
  }

  private void goUpTheHill() {
    print();
    String story = "On my way up the hill, a girl joined me. ";
    story = story + "She told me her name was Jill. ";
    story = story + "She was carrying a pail. ";
    story = story + "There's also a trail of breadcrumbs going down another path. ";
    print(story);

    print();
    print("Should I: ");
    print("a) Ask Jill to join me? ");
    print("b) Follow the trail of bread crumbs? ");

    String choice = input();
    switch (choice.toLowerCase()) {
      case "a":
        goWithJill();
        break;

      case "b":
        followBreadCrumbs();
        break;
      default:
        goUpTheHill();
    }
  }

  private void followBreadCrumbs() {
    print();
    String story = "I followed the bread crumbs for a while. ";
    story = story + " Jill had to go to her grandmother's house. ";
    story = story + " Before she left, Jill warned me about the cottage in the woods. ";
    print(story);

    print();
    print("Should I: ");
    print("a) Go with Jill? ");
    print("b) Check out the cottage in the woods? ");

    String choice = input();
    switch (choice.toLowerCase()) {
      case "a":
        goWithJill();
        break;

      case "b":
        checkTheCottage();
        break;
      default:
        followBreadCrumbs();
    }
  }

  private void goWithJill() {
    print();
    String story = "I was so much enjoying listening to Jill's stories. ";
    story = story + " I didn't notice the branch across the path. ";
    story = story + " I fell down. ";
    print(story);

    print();
    print("What happened next? ");
    print("a) I broke my crown and Jill came tumbling after. ");
    print("b) The beans fell out of my and immediately sprouted a bean stalk. ");

    String choice = input();

    switch (choice.toLowerCase()) {
      case "a":
        brokeMyCrown();
        break;

      case "b":
        sproutedABeanstalk();
        break;
      default:
        goWithJill();
    }
  }

  private void checkTheCottage() {
    print("Checking out the cottage. ");
  }

  private void plantTheBeans() {
    print("Planting the beans. ");
  }

  private void brokeMyCrown() {
    print("Broke my crown. ");
  }

  private void sproutedABeanstalk() {
    print("Sprouted a beanstalk. ");
  }

  public static void main(String[] args) {
    new ChooseAnAdventure();
  }
}