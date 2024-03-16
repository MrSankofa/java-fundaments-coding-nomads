package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("result of mulitply " + multipy(10, 10));
        System.out.println("result of divide " + divide(10, 10));
        jokeyJoke();
        System.out.println("result of computerYearsToSeconds " + computerYearsToSeconds(37));
        System.out.println("result of lengthOfArgs " + lengthOfArgs(new String[]{"what", "are", "we", "doing?"}));

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multipy(int a, int b) {
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static double divide(int a, int b) {
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console

    static void jokeyJoke() {
        System.out.println("where do pencils come from? Pencil-vania");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static float computerYearsToSeconds(int years) {
        return years * 12 * 30 * 24 * 60 * 60;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int lengthOfArgs(String[] varargs) {
        return varargs.length;
    }






}
