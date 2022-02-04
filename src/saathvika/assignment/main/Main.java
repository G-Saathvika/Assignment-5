package saathvika.assignment.main;

import saathvika.assignment.data.Data;
import saathvika.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data dataObject = new Data();
        dataObject.printGlobalVariables();
        //dataObject.printLocalVariables();

        /*
        We get an error "Variable might not have been initialized" while printing the local variables.
        This is because in Java at compile time it is checked if local variables are initialized before accessing them
        or not.
        There will not be any error if we just declare and not use these variables.
         */


        Singleton singletonObj = Singleton.initializeName("saathvika");
        singletonObj.printDetails();
    }
}
