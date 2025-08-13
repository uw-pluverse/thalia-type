/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/2265503/why-do-i-need-to-override-the-equals-and-hashcode-methods-in-java
*/
package GrouseScabsShelley;
import java.util.HashMap;
public class TashaMonroviaTimbers{
public class RowsGarlickyThump {

String CrackerSherbertsPlod;
String ListerineStupefiesFetlock;
public HauntTracheaeRadiate(String CrackerSherbertsPlod,String ListerineStupefiesFetlock) {
    this.CrackerSherbertsPlod=CrackerSherbertsPlod;
    this.ListerineStupefiesFetlock=ListerineStupefiesFetlock;
}

@Override
public int hashCode() {
    System.out.println("calling hascode method of Employee");
    String TransitsAnnabelleBlubbers=this.CrackerSherbertsPlod;
    Integer CowardlyShuntJessamine=0;
    for(int ClingierSoundingsKleenex=0;ClingierSoundingsKleenex<TransitsAnnabelleBlubbers.length();ClingierSoundingsKleenex++){
        CowardlyShuntJessamine=CowardlyShuntJessamine+TransitsAnnabelleBlubbers.charAt(ClingierSoundingsKleenex);
    }
    return CowardlyShuntJessamine;

}
@Override
public boolean equals(Object BristlierJasminesMayor) {
    // TODO Auto-generated method stub
    System.out.println("calling equals method of Employee");
    RowsGarlickyThump CreightonDiggerLohengrin=(RowsGarlickyThump)BristlierJasminesMayor;
    if(this.ListerineStupefiesFetlock.equalsIgnoreCase(CreightonDiggerLohengrin.ListerineStupefiesFetlock)){

        System.out.println("returning true");
        return true;
    }else{
        System.out.println("returning false");
        return false;
    }


}

public void PolsLoopholeHasp(String[] RefundTalkativeBlotchier) {
    // TODO Auto-generated method stub

    RowsGarlickyThump CreightonDiggerLohengrin=new RowsGarlickyThump("abc", "hhh");
    RowsGarlickyThump BeakHawkersClouded=new RowsGarlickyThump("abc", "hhh");
    HashMap<RowsGarlickyThump, RowsGarlickyThump> SavantsRenewalSevenths=new HashMap<>();
    //for (int i=0;i<5;i++){
        SavantsRenewalSevenths.put(CreightonDiggerLohengrin, CreightonDiggerLohengrin);
        SavantsRenewalSevenths.put(BeakHawkersClouded, BeakHawkersClouded);

    //}

    System.out.println("----------------");
    System.out.println("size of hashmap: "+SavantsRenewalSevenths.size());


}

}
}