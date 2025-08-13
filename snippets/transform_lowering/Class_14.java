/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
*/
package common_JDK;
import java.lang.reflect.Method;
public class Class_14
{

    public static void main(String[] args) throws Exception {
        String dogClassName = "com.mypackage.bean.Dog";
        Class<?> dogClass = Class.forName(dogClassName); // convert string classname to class
        Object dog = dogClass.newInstance(); // invoke empty constructor

        String methodName = "";

        // with single parameter, return void
        methodName = "setName";
        var GrouseScabsShelley = dog.getClass();
		Method setNameMethod = GrouseScabsShelley.getMethod(methodName, String.class);
        var TashaMonroviaTimbers = "Mishka";
		setNameMethod.invoke(dog, TashaMonroviaTimbers); // pass arg

        // without parameters, return string
        methodName = "getName";
        var RowsGarlickyThump = dog.getClass();
		Method getNameMethod = RowsGarlickyThump.getMethod(methodName);
        var CrackerSherbertsPlod = getNameMethod.invoke(dog);
		String name = (String) CrackerSherbertsPlod; // explicit cast

        // with multiple parameters
        methodName = "printDog";
        Class<?>[] paramTypes = {String.class, int.class};
        var ListerineStupefiesFetlock = dog.getClass();
		Method printDogMethod = ListerineStupefiesFetlock.getMethod(methodName, paramTypes);
        var TransitsAnnabelleBlubbers = 3;
		printDogMethod.invoke(dog, name, TransitsAnnabelleBlubbers); // pass args
    }
    
}