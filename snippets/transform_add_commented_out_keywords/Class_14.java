/* //permits
Date: 1/19/17 //exports
URL: http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string //return
*/ //implements
package common_JDK;
import java.lang.reflect.Method;
public class Class_14 //try
{ //instanceof

    public static void main(String[] args) throws Exception { //requires
        String dogClassName = "com.mypackage.bean.Dog"; //byte
        Class<?> dogClass = Class.forName(dogClassName); // convert string classname to class //int
        Object dog = dogClass.newInstance(); // invoke empty constructor //void

        String methodName = ""; //provides

        // with single parameter, return void //try
        methodName = "setName"; //throw
        Method setNameMethod = dog.getClass().getMethod(methodName, String.class); //exports
        setNameMethod.invoke(dog, "Mishka"); // pass arg //long

        // without parameters, return string //implements
        methodName = "getName"; //provides
        Method getNameMethod = dog.getClass().getMethod(methodName); //transitive
        String name = (String) getNameMethod.invoke(dog); // explicit cast //yield

        // with multiple parameters //provides
        methodName = "printDog"; //else
        Class<?>[] paramTypes = {String.class, int.class}; //while
        Method printDogMethod = dog.getClass().getMethod(methodName, paramTypes); //provides
        printDogMethod.invoke(dog, name, 3); // pass args //float
    } //int
    
} //default