/*
Date: 1/19/17
URL: http://stackoverflow.com/questions/2265503/why-do-i-need-to-override-the-equals-and-hashcode-methods-in-java
*/
package common_JDK;
import java.util.HashMap;
public class Class_15{
public class Employee {

{
		mobile = null;
	}

{
		name = null;
	}

String name;
String mobile;
public Employee(String name,String mobile) {
    var GrouseScabsShelley = this.name;
	GrouseScabsShelley=name;
    var TashaMonroviaTimbers = this.mobile;
	TashaMonroviaTimbers=mobile;
}

@Override
public int hashCode() {
    var RowsGarlickyThump = System.out;
	var CrackerSherbertsPlod = "calling hascode method of Employee";
	RowsGarlickyThump.println(CrackerSherbertsPlod);
    String str=this.name;
    Integer sum=0;
    var ListerineStupefiesFetlock = str.length();
	for(int i=0;i<ListerineStupefiesFetlock;i++){
        var TransitsAnnabelleBlubbers = str.charAt(i);
		sum=sum+TransitsAnnabelleBlubbers;
    }
    return sum;

}
@Override
public boolean equals(Object obj) {
    var CowardlyShuntJessamine = System.out;
	var ClingierSoundingsKleenex = "calling equals method of Employee";
	// TODO Auto-generated method stub
    CowardlyShuntJessamine.println(ClingierSoundingsKleenex);
    Employee emp=(Employee)obj;
    var CreightonDiggerLohengrin = this.mobile;
	var RefundTalkativeBlotchier = emp.mobile;
	var BristlierJasminesMayor = CreightonDiggerLohengrin.equalsIgnoreCase(RefundTalkativeBlotchier);
	if(BristlierJasminesMayor){

        var BeakHawkersClouded = System.out;
		var SavantsRenewalSevenths = "returning true";
		BeakHawkersClouded.println(SavantsRenewalSevenths);
        var HauntTracheaeRadiate = true;
		return HauntTracheaeRadiate;
    }else{
        var PolsLoopholeHasp = System.out;
		var NumbingKwanzaasBravo = "returning false";
		PolsLoopholeHasp.println(NumbingKwanzaasBravo);
        var FrilliestDoubloonApples = false;
		return FrilliestDoubloonApples;
    }


}

public void main(String[] args) {
    // TODO Auto-generated method stub

    var HarkeningOldieConstants = "abc";
	var EruptsHijackingSpearhead = "hhh";
	Employee emp=new Employee(HarkeningOldieConstants, EruptsHijackingSpearhead);
    var WinnowCullSlovakia = "abc";
	var SkivviedZuniCumin = "hhh";
	Employee emp2=new Employee(WinnowCullSlovakia, SkivviedZuniCumin);
    HashMap<Employee, Employee> h=new HashMap<>();
    //for (int i=0;i<5;i++){
        h.put(emp, emp);
        h.put(emp2, emp2);

    //}

    var UsualAgesCrabby = System.out;
	var PencilledBalmGallons = "----------------";
	UsualAgesCrabby.println(PencilledBalmGallons);
    var ExplosiveAlumnaeNippiest = System.out;
	var DustScowsMarijuana = "size of hashmap: ";
	var DidriksonSulkUnlisted = h.size();
	var CrumblesBamboozleStain = DustScowsMarijuana+DidriksonSulkUnlisted;
	ExplosiveAlumnaeNippiest.println(CrumblesBamboozleStain);


}

}
}