class HW8{
    public String name;
    public int age;
    public HW8(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void celebrate(){
        age++;
        System.out.println("Happy birthday " + name + "! You are now " + age + ".");
    }
}
class Main{
    public static void main(String[]args){
        HW8 person1=new HW8("Alice",25);
        HW8 person2=person1;
        person2.name="Bob";
        person1.celebrate();
        System.out.println("Person 1: " + person1.name + ", Age: " + person1.age);
        System.out.println("Person 2: " + person2.name + ", Age: " + person2.age);
    }
}
//instance of overwriting object reference
// person2 is a reference to the same object as person1
// Changing person2 also affects person1