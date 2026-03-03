//Encapsulation Example
// package learn;
// class Student{
//     private String name;
//     public void name_set(String name){
//       this.name=name;
//     }
//     public void show_name(){
//         System.out.println("Name is "+name);
//     }
// }
// public class Assignment{
//     public static void main(String[] args) {
//     	Student s=new Student();
//     	s.name_set("Sarvil");
//     	s.show_name();
//     }
// }
// package learn;
// interface Greet{
//     String namaste();
//     void hello();
// }
// class Greeting implements Greet{
//     @Override
//     public String namaste(){
//         return "Namaste";
//     }
//     @Override
//     public void hello(){
//         System.out.println("hello");
//     }
// }
// public class Assignment{
//     public static void main(String[] args) {
//     	Greeting g=new Greeting();
//     	g.hello();
//     	String a=g.namaste();
//     	System.out.println(a);
//     }
// }

package learn;
class Animal{
    void eat(){
        System.out.println("eating.....");
    }
}
class Dog{
    void bark(){
        System.out.println("barking");
    }
}
public class Assignment{
    
}
