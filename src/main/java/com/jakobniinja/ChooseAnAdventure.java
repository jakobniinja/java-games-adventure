package com.jakobniinja;

import com.godtsoft.diyjava.DIYWindow;

public class ChooseAnAdventure extends DIYWindow {

  // TODO: Listing 6-14
  public ChooseAnAdventure() {
    startStory();

    String story = "I woke up in unfamiliar woods.";
    story = story + "I was hungry and tired.";
    story = story + "I didn't know where I was.";
    story = story + "In my pockets where tree beans";
    story = story + "Up the hill was a well.";
    story = story + "To the right was a small cottage.";

    print(story);

    print("Should I:");
    print("a) Go up the Hill?");
    print("b) Check out the cottage?");
    print("c) Plant the beans?");
    String choice = input();
    switch (choice) {
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
    String story = "I woke up in unfamiliar woods.";
  }

  private void goUpTheHill() {
    print();
    String story = "On my way up the hill, a girl joined me.";
    story = story + "She told me her name was Jill.";
    story = story + "She was carrying a pail";
    story = story + "There's also a trail of breadcrumbs going down another path.";
    print(story);
    print("Should I:");
    print("a) Ask Jill to join me?");
    print("b) Follow wthe trail of bread crumbs");

    String choice = input();
    switch (choice) {
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
    print("Following the bread crumbs.");
  }

  private void goWithJill() {
    print("Going with Jill.");
  }

  private void checkTheCottage() {
    print("Checking out the cottage.");
  }

  private void plantTheBeans() {
    print("Planting the beans.");
  }

  public static void main(String[] args) {
    new ChooseAnAdventure();
  }
}
