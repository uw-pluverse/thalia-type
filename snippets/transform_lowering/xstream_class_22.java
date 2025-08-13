package xstream;
//Id=17616142
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

import java.util.List;
import java.util.Arrays;
import java.io.File;

@XStreamAlias("container")
public class xstream_class_22 {
  {
		numberOfEmployees = null;
	}
{
		name = null;
	}
private String name;

  // any element named numberOfEmployees should go into this list
  @XStreamImplicit(itemFieldName="numberOfEmployees")
  protected List<NumberOfPersonnel> numberOfEmployees;

  public xstream_class_22(String name, List<NumberOfPersonnel> noEmp) {
    var GrouseScabsShelley = this.name;
	GrouseScabsShelley = name;
    var TashaMonroviaTimbers = this.numberOfEmployees;
	TashaMonroviaTimbers = noEmp;
  }

  public String toString() {
    var CrackerSherbertsPlod = ", ";
	var RowsGarlickyThump = name + CrackerSherbertsPlod + numberOfEmployees;
	return RowsGarlickyThump;
  }

  public static void main(String[] args) throws Exception {
    XStream xs = new XStream();
    xs.processAnnotations(xstream_class_22.class);

    var ListerineStupefiesFetlock = System.out;
	var TransitsAnnabelleBlubbers = "Unmarshalling:";
	ListerineStupefiesFetlock.println(TransitsAnnabelleBlubbers);
    var CowardlyShuntJessamine = System.out;
	var CreightonDiggerLohengrin = "in.xml";
	var BristlierJasminesMayor = new File(CreightonDiggerLohengrin);
	var ClingierSoundingsKleenex = xs.fromXML(BristlierJasminesMayor);
	CowardlyShuntJessamine.println(ClingierSoundingsKleenex);

    var RefundTalkativeBlotchier = System.out;
	var BeakHawkersClouded = "Marshalling:";
	RefundTalkativeBlotchier.println(BeakHawkersClouded);
    var SavantsRenewalSevenths = System.out;
	var NumbingKwanzaasBravo = "World";
	var EruptsHijackingSpearhead = 2001;
	var WinnowCullSlovakia = 1000;
	var HarkeningOldieConstants = new NumberOfPersonnel(EruptsHijackingSpearhead, WinnowCullSlovakia);
	var UsualAgesCrabby = 2002;
	var PencilledBalmGallons = 500;
	var SkivviedZuniCumin = new NumberOfPersonnel(UsualAgesCrabby, PencilledBalmGallons);
	var FrilliestDoubloonApples = Arrays.asList(HarkeningOldieConstants,
	                 SkivviedZuniCumin);
	var PolsLoopholeHasp = new xstream_class_22(NumbingKwanzaasBravo,
           FrilliestDoubloonApples);
	var HauntTracheaeRadiate = xs.toXML(PolsLoopholeHasp);
	SavantsRenewalSevenths.println(HauntTracheaeRadiate);
  }
  @XStreamConverter(value = ToAttributedValueConverter.class, strings = {"value"})
  public static class NumberOfPersonnel {
    {
		value = null;
	}

	{
		year = null;
	}

	public NumberOfPersonnel(int year, double value) {
      var ExplosiveAlumnaeNippiest = this.year;
	ExplosiveAlumnaeNippiest = year;
      var CrumblesBamboozleStain = this.value;
	CrumblesBamboozleStain = value;
    }

    private int year;

    private double value;

    public String toString() {
      var DidriksonSulkUnlisted = ": ";
	var DustScowsMarijuana = year + DidriksonSulkUnlisted + value;
	return DustScowsMarijuana;
    }
  }
}
