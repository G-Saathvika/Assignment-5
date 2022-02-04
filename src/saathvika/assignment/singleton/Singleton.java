package saathvika.assignment.singleton;

public class Singleton {
    String name;

    public static Singleton initializeName(String val){
        Singleton obj = new Singleton();
        obj.name = val;

        return obj;
    }

    public void printDetails(){
        System.out.println("Name: "+name);
    }
}
