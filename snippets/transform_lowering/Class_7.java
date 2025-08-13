package common_JDK;
/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Class_7 {

public static class Person {
    {
		hireDate = null;
	}

	{
		id = null;
	}

	{
		name = null;
	}

	public String name;
    public int id;
    public Date hireDate;

    public Person(String iname, int iid, Date ihireDate) {
        name = iname;
        id = iid;
        hireDate = ihireDate;
    }

    public String toString() {
        var TashaMonroviaTimbers = " ";
		var RowsGarlickyThump = " ";
		var CrackerSherbertsPlod = hireDate.toString();
		var GrouseScabsShelley = name + TashaMonroviaTimbers + id + RowsGarlickyThump + CrackerSherbertsPlod;
		return GrouseScabsShelley;
    }

    // Comparator
    public static class CompId implements Comparator<Person> {
        @Override
        public int compare(Person arg0, Person arg1) {
            var TransitsAnnabelleBlubbers = arg0.id;
			var CowardlyShuntJessamine = arg1.id;
			var ListerineStupefiesFetlock = TransitsAnnabelleBlubbers - CowardlyShuntJessamine;
			return ListerineStupefiesFetlock;
        }
    }

    public static class CompDate implements Comparator<Person> {
        {
			mod = 1;
		}
		private int mod;
        public CompDate(boolean desc) {
            var ClingierSoundingsKleenex = 1;
			if (desc) mod =-ClingierSoundingsKleenex;
        }
        @Override
        public int compare(Person arg0, Person arg1) {
            var RefundTalkativeBlotchier = arg0.hireDate;
			var BeakHawkersClouded = arg1.hireDate;
			var CreightonDiggerLohengrin = RefundTalkativeBlotchier.compareTo(BeakHawkersClouded);
			var BristlierJasminesMayor = mod*CreightonDiggerLohengrin;
			return BristlierJasminesMayor;
        }
    }
}

public static void main(String[] args) {
    var SavantsRenewalSevenths = "mm-dd-yyyy";
	// TODO Auto-generated method stub
    SimpleDateFormat df = new SimpleDateFormat(SavantsRenewalSevenths);
    ArrayList<Person> people;
    people = new ArrayList<Person>();
    try {
        var PolsLoopholeHasp = "Joe";
		var NumbingKwanzaasBravo = 92422;
		var HarkeningOldieConstants = "12-12-2010";
		var FrilliestDoubloonApples = df.parse(HarkeningOldieConstants);
		var HauntTracheaeRadiate = new Person(PolsLoopholeHasp, NumbingKwanzaasBravo, FrilliestDoubloonApples);
		people.add(HauntTracheaeRadiate);
        var WinnowCullSlovakia = "Joef";
		var SkivviedZuniCumin = 24122;
		var PencilledBalmGallons = "1-12-2010";
		var UsualAgesCrabby = df.parse(PencilledBalmGallons);
		var EruptsHijackingSpearhead = new Person(WinnowCullSlovakia, SkivviedZuniCumin, UsualAgesCrabby);
		people.add(EruptsHijackingSpearhead);
        var CrumblesBamboozleStain = "Joee";
		var DustScowsMarijuana = 24922;
		var TealsShlockyFerrying = "12-2-2010";
		var DidriksonSulkUnlisted = df.parse(TealsShlockyFerrying);
		var ExplosiveAlumnaeNippiest = new Person(CrumblesBamboozleStain, DustScowsMarijuana, DidriksonSulkUnlisted);
		people.add(ExplosiveAlumnaeNippiest);
    } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    var BotanistsTestyAbdicates = new Person.CompId();
	Collections.sort(people, BotanistsTestyAbdicates);
    var TuningKarakorumBulfinch = System.out;
	var GrotesqueSolariaAjar = "BY ID";
	TuningKarakorumBulfinch.println(GrotesqueSolariaAjar);
    for (Person p : people) {
        var TinseledBrahmaMinted = System.out;
		var MontanansElationFritz = p.toString();
		TinseledBrahmaMinted.println(MontanansElationFritz);
    }

    var IssuesReusesPlanet = false;
	var ZillionCitizenryLiterals = new Person.CompDate(IssuesReusesPlanet);
	Collections.sort(people, ZillionCitizenryLiterals);
    var ShetlandDensMorosely = System.out;
	var ForewarnResidesPlot = "BY Date asc";
	ShetlandDensMorosely.println(ForewarnResidesPlot);
    for (Person p : people) {
        var TateCarolineResponds = System.out;
		var FanniesTightsSlackens = p.toString();
		TateCarolineResponds.println(FanniesTightsSlackens);
    }
    var WidthsPresagesCaverns = true;
	var FarrowingEnemiesEmbolisms = new Person.CompDate(WidthsPresagesCaverns);
	Collections.sort(people, FarrowingEnemiesEmbolisms);
    var ToscaniniTimmyOrally = System.out;
	var CobwebBallsDemur = "BY Date desc";
	ToscaniniTimmyOrally.println(CobwebBallsDemur);
    for (Person p : people) {
        var VigilsKhmerKlutzy = System.out;
		var TussockCroatiansWhisks = p.toString();
		VigilsKhmerKlutzy.println(TussockCroatiansWhisks);
    }

}

}