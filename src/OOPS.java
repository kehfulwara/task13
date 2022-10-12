class Student{
    String name;
    int age;
    Student(String name, int age){
    this.name=name;
    this.age=age;
    }
    public void display(){
        System.out.println("name is" + name + "   " + " age is"+ age);
    }
    public  String toString(){
        return name +"  "+ age;
    }
}
public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", 18);
        Student s2 = new Student("Tony", 18);
       // s1.display();
       // s2.display();
        System.out.println(s1);
        System.out.println(s2);
    }
}