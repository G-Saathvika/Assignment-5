package saathvika.assignment.data;

public class Data {
    static int num;
    static char ch;

    public void printGlobalVariables(){
        System.out.println(num);
        System.out.println(ch);
    }

    public void printLocalVariables(){
        int age;
        String name;
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
    }
}
