import java.util.Arrays;
public class Main {
    public static void main(String[] args) {


      int [] arrayInitializer = new int []{ 3,4,5,6};
        System.out.println(arrayInitializer[0]);
        //setting array with pre-known values all at the time of initialization. "int [ ] myArray = new int[ ] {#,#,#,}"

        int[] anonymousArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //like array initializer but 'new int[ ]' not needed.
        // like "int [ ] myArrray = {#,#,#}. but can only occur
        // with declaration statemement. cant do empty arrray like
        // int [ ] myArray;  Then say myArray = {#,#,#}. Will need the new keyword.
        System.out.println("first = " + anonymousArray[0]);


        int[] newArray; //array initializer
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        //for loop
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        //for each loop
        for (int element : newArray) { // format of (declaration : collection) where collecetion is an array or other collection
            // will traditionally use a more specific variable name unlike 'i' with the normal for loop, since we are looping
            // through actual element, not just the array index.
            //the collection is just what we are looping through
            System.out.print(element + " "); //note we don't have to indicate the index when printing and the element
            //is directly printed. we either don't know or don't need the index.
        }

        System.out.println(newArray); // prints memory address
        System.out.println(Arrays.toString(newArray)); // prints full array contents as String

        Object objectVariable = newArray; //can assign an array reference to an object reference
        if (objectVariable instanceof int[]) { // test if is really an int array
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3]; //can actually create an array of objects of different types
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray; //see that we have an array of ints set as an index in an array of Objects. 'nested array'
    }
}