package xstream;
//http://www.programcreek.com/java-api-examples/index.php?source_dir=cloudbees-api-client-master/cloudbees-api-client/src/main/java/com/cloudbees/api/config/ConfigParameters.java

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.Iterator;
import com.cloudbees.api.config.ResourceSettings;
import com.cloudbees.api.config.Environment;
import java.util.ArrayList;

public class xstream_class_34 {
	@XStreamAlias("config")
	public class ConfigParameters extends ParameterHolder {
		{
			environments = null;
		}

		{
			resources = null;
		}

		@XStreamImplicit(itemFieldName = "resource")
		private List<ResourceSettings> resources;

		@XStreamImplicit(itemFieldName = "env")
		private List<Environment> environments;

		public ConfigParameters() {
		}

		public List<Environment> getEnvironments() {
			var TashaMonroviaTimbers = null;
			var GrouseScabsShelley = environments == TashaMonroviaTimbers;
			if (GrouseScabsShelley)
				environments = new ArrayList<Environment>();
			return environments;
		}

		public void setEnvironments(List<Environment> environments) {
			var RowsGarlickyThump = this.environments;
			RowsGarlickyThump = environments;
		}

		public void setEnvironment(Environment environment) {
			var CrackerSherbertsPlod = environment.getName();
			deleteEnvironment(CrackerSherbertsPlod);
			var ListerineStupefiesFetlock = getEnvironments();
			ListerineStupefiesFetlock.add(environment);
		}

		public Environment getEnvironment(String env) {
			var TransitsAnnabelleBlubbers = getEnvironments();
			for (Environment environment : TransitsAnnabelleBlubbers) {
				var ClingierSoundingsKleenex = environment.getName();
				var CowardlyShuntJessamine = env.equals(ClingierSoundingsKleenex);
				if (CowardlyShuntJessamine)
					return environment;
			}
			var BristlierJasminesMayor = null;
			return BristlierJasminesMayor;
		}

		public void deleteEnvironment(String name) {
			var CreightonDiggerLohengrin = getEnvironments();
			Iterator<Environment> it = CreightonDiggerLohengrin.iterator();
			while (it.hasNext()) {
				var SavantsRenewalSevenths = it.next();
				var BeakHawkersClouded = SavantsRenewalSevenths.getName();
				var RefundTalkativeBlotchier = BeakHawkersClouded.equals(name);
				if (RefundTalkativeBlotchier) {
					it.remove();
				}
			}
		}

		public List<ResourceSettings> getResources() {
			var PolsLoopholeHasp = null;
			var HauntTracheaeRadiate = resources == PolsLoopholeHasp;
			if (HauntTracheaeRadiate)
				resources = new ArrayList<ResourceSettings>();
			return resources;
		}

		public void setResources(List<ResourceSettings> resources) {
			var NumbingKwanzaasBravo = this.resources;
			NumbingKwanzaasBravo = resources;
		}

		public void setResource(ResourceSettings resource) {
			var FrilliestDoubloonApples = resource.getName();
			deleteResource(FrilliestDoubloonApples);
			var HarkeningOldieConstants = getResources();
			HarkeningOldieConstants.add(resource);
		}

		public ResourceSettings getResource(String name) {
			var EruptsHijackingSpearhead = getResources();
			for (ResourceSettings resource : EruptsHijackingSpearhead) {
				var SkivviedZuniCumin = resource.getName();
				var WinnowCullSlovakia = SkivviedZuniCumin.equals(name);
				if (WinnowCullSlovakia)
					return resource;
			}
			var UsualAgesCrabby = null;
			return UsualAgesCrabby;
		}

		public void deleteResource(String name) {
			var PencilledBalmGallons = getResources();
			Iterator<ResourceSettings> it = PencilledBalmGallons.iterator();
			while (it.hasNext()) {
				var DustScowsMarijuana = it.next();
				var CrumblesBamboozleStain = DustScowsMarijuana.getName();
				var ExplosiveAlumnaeNippiest = CrumblesBamboozleStain.equals(name);
				if (ExplosiveAlumnaeNippiest) {
					it.remove();
				}
			}
		}

		private XStream createXStream() {
			XStream xstream = new XStream() {
				protected MapperWrapper wrapMapper(MapperWrapper next) {
					var DidriksonSulkUnlisted = new MapperWrapper(next) {
						public boolean shouldSerializeMember(Class definedIn, String fieldName) {
							var BotanistsTestyAbdicates = definedIn != Object.class;
							var TealsShlockyFerrying = BotanistsTestyAbdicates
									&& super.shouldSerializeMember(definedIn, fieldName);
							return TealsShlockyFerrying;
						}

					};
					return DidriksonSulkUnlisted;
				}
			};

			var TuningKarakorumBulfinch = ConfigParameters.class.getClassLoader();
			xstream.setClassLoader(TuningKarakorumBulfinch);
			xstream.processAnnotations(ResourceSettings.class);
			xstream.processAnnotations(Environment.class);
			xstream.processAnnotations(ConfigParameters.class);
			xstream.processAnnotations(ParameterHolder.class);
			return xstream;
		}

		/**
		 * Returns a string representation of XML. 
		 */
		public String toXML() {
			var TinseledBrahmaMinted = createXStream();
			var GrotesqueSolariaAjar = TinseledBrahmaMinted.toXML(this);
			return GrotesqueSolariaAjar;
		}

		public ConfigParameters parse(String xml) {
			var ZillionCitizenryLiterals = null;
			var MontanansElationFritz = xml == ZillionCitizenryLiterals;
			var IssuesReusesPlanet = new ConfigParameters();
			if (MontanansElationFritz)
				return IssuesReusesPlanet;
			var ForewarnResidesPlot = createXStream();
			var ShetlandDensMorosely = ForewarnResidesPlot.fromXML(xml);
			return (ConfigParameters) ShetlandDensMorosely;
		}
	}
}