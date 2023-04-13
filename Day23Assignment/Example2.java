class PersonDemo {
  String name;
  int age;
  String address;

  PersonDemo(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;

  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Address: " + address);
  }
}

class Person {
  public static void main(String args[]) {
    PersonDemo obj = new PersonDemo("Vinayak", 21, "Hospet");
    obj.display();
  }
}