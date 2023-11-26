package OpinionPoll_03_;

public class Person {
    // описваме човек

    //полета - характеристики ( име и възратс)
    private String name; // всеки човек се хар с име което съхраняваме в name
    private int age;

    // конструктура - метод, чрез който създаваме обект
    // казва се както класа

    public  Person (String name, int age){
        // нов празен обект
        // притежава name; age но са празни

        this.name = name; //срещу полето name ще стои подаденото горе име "String name"
        this.age = age;
    }

    // методи - deйствия
    // getters = методи за достъпваме стойността на полетата

    public  String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
