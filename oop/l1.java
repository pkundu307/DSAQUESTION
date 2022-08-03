package oop;

class l1 {
    public static void main(String[] args) {

        Student p = new Student(0, null, 0);

        System.out.println(p.rno);// create object/default constructor
        p.greet();
        Student pk = new Student(15, "prasanna", 15.2);// parameterize constructor
        pk.greet();
        System.out.println(pk.name);
    }

}

class Student {// new data type
    int rno;
    String name;
    float marks;

    Student(int rno, String name, double d) {
        this.name = name;
    }

    void greet() {
        System.out.println("my name is " + name);
    }
}