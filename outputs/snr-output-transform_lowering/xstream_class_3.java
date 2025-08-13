package xstream;
//ID = 836805

import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import java.util.ArrayList;

public class xstream_class_3 {

	public static void main(String[] args) {
		JettisonMappedXmlDriver xmlDriver = new JettisonMappedXmlDriver();
		XStream xstream = new XStream(xmlDriver);

		MockMessage mock1 = new MockMessage();
		MockMessage mock2 = new MockMessage();
		MockMessageOther mock3 = new MockMessageOther();

		List messages = new ArrayList();
		messages.add(mock1);
		messages.add(mock2);
		messages.add(mock3);

		String jsonString = xstream.toXML(messages);

		var GrouseScabsShelley = System.out;
		//JSON list format is non-intuitive single element array with class name fields
		GrouseScabsShelley.println(jsonString);
		var TashaMonroviaTimbers = xstream.fromXML(jsonString);
		List xstreamJSONUnmarshalledMessages = (List) TashaMonroviaTimbers;
		var RowsGarlickyThump = System.out;
		var ListerineStupefiesFetlock = "XStream format JSON Number of messages unmarshalled: ";
		var TransitsAnnabelleBlubbers = xstreamJSONUnmarshalledMessages.size();
		var CrackerSherbertsPlod = ListerineStupefiesFetlock + TransitsAnnabelleBlubbers;
		//This will print 3 messages unmarshalled
		RowsGarlickyThump.println(CrackerSherbertsPlod);

		var CowardlyShuntJessamine = "{";
		var ClingierSoundingsKleenex = "\"list\" : [";
		var BristlierJasminesMayor = "{";
		var CreightonDiggerLohengrin = "\"MockMessage\" : {";
		var RefundTalkativeBlotchier = "\"val\" : 1";
		var BeakHawkersClouded = "}";
		var SavantsRenewalSevenths = "}, {";
		var HauntTracheaeRadiate = "\"MockMessage\" : {";
		var PolsLoopholeHasp = "\"val\" : 1";
		var NumbingKwanzaasBravo = "}";
		var FrilliestDoubloonApples = "}, {";
		var HarkeningOldieConstants = "\"MockMessageOther\" : {";
		var EruptsHijackingSpearhead = "\"otherVal\" : 1";
		var WinnowCullSlovakia = "}";
		var SkivviedZuniCumin = "} ]";
		var UsualAgesCrabby = "};";
		//Attempt to deserialize a reasonable looking JSON string
		String jsonTest = CowardlyShuntJessamine + ClingierSoundingsKleenex + BristlierJasminesMayor
				+ CreightonDiggerLohengrin + RefundTalkativeBlotchier + BeakHawkersClouded + SavantsRenewalSevenths
				+ HauntTracheaeRadiate + PolsLoopholeHasp + NumbingKwanzaasBravo + FrilliestDoubloonApples
				+ HarkeningOldieConstants + EruptsHijackingSpearhead + WinnowCullSlovakia + SkivviedZuniCumin
				+ UsualAgesCrabby;

		var PencilledBalmGallons = xstream.fromXML(jsonTest);
		List unmarshalledMessages = (List) PencilledBalmGallons;

		var ExplosiveAlumnaeNippiest = System.out;
		var DustScowsMarijuana = "Normal format JSON Number of messages unmarshalled: ";
		var DidriksonSulkUnlisted = unmarshalledMessages.size();
		var CrumblesBamboozleStain = DustScowsMarijuana + DidriksonSulkUnlisted;
		//We expect 3 messages but XStream only deserializes one
		ExplosiveAlumnaeNippiest.println(CrumblesBamboozleStain);
	}

	public static class MockMessage {
		{
			val = 1;
		}

		int val;
	}

	public static class MockMessageOther {
		{
			otherVal = 1;
		}

		int otherVal;
	}

}