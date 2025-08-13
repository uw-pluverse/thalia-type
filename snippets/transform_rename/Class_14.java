/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/160970/how-do-i-invoke-a-java-method-when-given-the-method-name-as-a-string
*/
package GrouseScabsShelley;
import java.lang.reflect.Method;
public class TashaMonroviaTimbers
{

    public static void SavantsRenewalSevenths(String[] RowsGarlickyThump) throws Exception {
        String CrackerSherbertsPlod = "com.mypackage.bean.Dog";
        Class<?> ListerineStupefiesFetlock = Class.forName(CrackerSherbertsPlod); // convert string classname to class
        Object TransitsAnnabelleBlubbers = ListerineStupefiesFetlock.newInstance(); // invoke empty constructor

        String CowardlyShuntJessamine = "";

        // with single parameter, return void
        CowardlyShuntJessamine = "setName";
        Method ClingierSoundingsKleenex = TransitsAnnabelleBlubbers.getClass().getMethod(CowardlyShuntJessamine, String.class);
        ClingierSoundingsKleenex.invoke(TransitsAnnabelleBlubbers, "Mishka"); // pass arg

        // without parameters, return string
        CowardlyShuntJessamine = "getName";
        Method BristlierJasminesMayor = TransitsAnnabelleBlubbers.getClass().getMethod(CowardlyShuntJessamine);
        String CreightonDiggerLohengrin = (String) BristlierJasminesMayor.invoke(TransitsAnnabelleBlubbers); // explicit cast

        // with multiple parameters
        CowardlyShuntJessamine = "printDog";
        Class<?>[] RefundTalkativeBlotchier = {String.class, int.class};
        Method BeakHawkersClouded = TransitsAnnabelleBlubbers.getClass().getMethod(CowardlyShuntJessamine, RefundTalkativeBlotchier);
        BeakHawkersClouded.invoke(TransitsAnnabelleBlubbers, CreightonDiggerLohengrin, 3); // pass args
    }
    
}