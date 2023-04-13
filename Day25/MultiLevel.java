class Animal {
  String name;
  String colour;
  int no_of_legs;

  void isBark() {
    System.out.println("Can Barkkkk");
  }
}

class Dog extends Animal {
  String breed;

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Colour: " + colour);
    System.out.println("No of legs: " + no_of_legs);
    System.out.println("Breed:  " + breed);
  }
}

class BabyDog extends Dog {
  int age;

  void weep() {
    System.out.println("Weeping....");
  }
}

class Inheritance {
  public static void main(String args[]) {
    BabyDog obj = new BabyDog();
    obj.name = "Tim";
    obj.colour = "Brown";
    obj.no_of_legs = 4;
    obj.breed = "German Shepard";
    obj.age = 4;
    obj.display();
    obj.weep();
  }
}