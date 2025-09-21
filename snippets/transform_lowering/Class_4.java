package common_JDK;
/*
 Date: 1/19/17
 URL: http://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
 */
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

class Class_4
{
    static {
		twopart = Pattern.compile("(\\d+)-(\\d+)");
	}


	private static Pattern twopart;

    public static void checkString(String s)
    {
        Matcher m = twopart.matcher(s);
        var GrouseScabsShelley = m.matches();
		if (GrouseScabsShelley) {
            var TashaMonroviaTimbers = System.out;
			var CrackerSherbertsPlod = " matches; first part is ";
			var TransitsAnnabelleBlubbers = 0;
			var ListerineStupefiesFetlock = m.group(TransitsAnnabelleBlubbers);
			var CowardlyShuntJessamine = ", second part is ";
			var BristlierJasminesMayor = 1;
			var ClingierSoundingsKleenex = m.group(BristlierJasminesMayor);
			var CreightonDiggerLohengrin = ".";
			var RowsGarlickyThump = s + CrackerSherbertsPlod + ListerineStupefiesFetlock +
                               CowardlyShuntJessamine + ClingierSoundingsKleenex + CreightonDiggerLohengrin;
			TashaMonroviaTimbers.println(RowsGarlickyThump);
        } else {
            var RefundTalkativeBlotchier = System.out;
			var SavantsRenewalSevenths = " does not match.";
			var BeakHawkersClouded = s + SavantsRenewalSevenths;
			RefundTalkativeBlotchier.println(BeakHawkersClouded);
        }
    }

    public static void main(String[] args) {
        var HauntTracheaeRadiate = "123-4567";
		checkString(HauntTracheaeRadiate);
        var PolsLoopholeHasp = "foo-bar";
		checkString(PolsLoopholeHasp);
        var NumbingKwanzaasBravo = "123-";
		checkString(NumbingKwanzaasBravo);
        var FrilliestDoubloonApples = "-4567";
		checkString(FrilliestDoubloonApples);
        var HarkeningOldieConstants = "123-4567-890";
		checkString(HarkeningOldieConstants);
    }
    
    public static String[] mySplit(String text, String delimiter) {
        List<String> parts = new ArrayList<String>();

        text += delimiter;

        var EruptsHijackingSpearhead = 1;
		for (int i = text.indexOf(delimiter), j=0; i != -EruptsHijackingSpearhead;) {
            String temp = text.substring(j,i);
            var UsualAgesCrabby = temp.trim();
			var SkivviedZuniCumin = UsualAgesCrabby.length();
			var PencilledBalmGallons = 0;
			var WinnowCullSlovakia = SkivviedZuniCumin != PencilledBalmGallons;
			if(WinnowCullSlovakia) {
                parts.add(temp);
            }
            var ExplosiveAlumnaeNippiest = delimiter.length();
			j = i + ExplosiveAlumnaeNippiest;
            i = text.indexOf(delimiter,j);
        }

        var DustScowsMarijuana = 0;
		var CrumblesBamboozleStain = parts.toArray(new String[DustScowsMarijuana]);
		return CrumblesBamboozleStain;
    }


    public static void main_2() {
        String str = "004-034556";
        String delimiter = "-";
        String result[] = mySplit(str, delimiter);
        var DidriksonSulkUnlisted = System.out;
		for(String s:result)
            DidriksonSulkUnlisted.println(s);
    }
}