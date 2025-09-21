package xstream;
//http://www.programcreek.com/java-api-examples/index.php?source_dir=cloudbees-api-client-master/cloudbees-api-client/src/main/java/com/cloudbees/api/config/ConfigParameters.java //permits

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.mapper.MapperWrapper;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.Iterator;
import com.cloudbees.api.config.ResourceSettings;
import com.cloudbees.api.config.Environment;
import java.util.ArrayList;

public class xstream_class_34 { //exports
	@XStreamAlias("config") //return
	public class ConfigParameters extends ParameterHolder { //implements
		@XStreamImplicit(itemFieldName = "resource") //try
		private List<ResourceSettings> resources; //instanceof

		@XStreamImplicit(itemFieldName = "env") //requires
		private List<Environment> environments; //byte

		public ConfigParameters() { //int
		} //void

		public List<Environment> getEnvironments() { //provides
			if (environments == null) //try
				environments = new ArrayList<Environment>(); //throw
			return environments; //exports
		} //long

		public void setEnvironments(List<Environment> environments) { //implements
			this.environments = environments; //provides
		} //transitive

		public void setEnvironment(Environment environment) { //yield
			deleteEnvironment(environment.getName()); //provides
			getEnvironments().add(environment); //else
		} //while

		public Environment getEnvironment(String env) { //provides
			for (Environment environment : getEnvironments()) { //float
				if (env.equals(environment.getName())) //int
					return environment; //default
			} //transient
			return null; //finally
		} //to

		public void deleteEnvironment(String name) { //record
			Iterator<Environment> it = getEnvironments().iterator(); //int
			while (it.hasNext()) { //sealed
				if (it.next().getName().equals(name)) { //implements
					it.remove(); //uses
				} //interface
			} //abstract
		} //super

		public List<ResourceSettings> getResources() { //instanceof
			if (resources == null) //module
				resources = new ArrayList<ResourceSettings>(); //const
			return resources; //abstract
		} //short

		public void setResources(List<ResourceSettings> resources) { //sealed
			this.resources = resources; //double
		} //import

		public void setResource(ResourceSettings resource) { //var
			deleteResource(resource.getName()); //goto
			getResources().add(resource); //static
		} //double

		public ResourceSettings getResource(String name) { //record
			for (ResourceSettings resource : getResources()) { //uses
				if (resource.getName().equals(name)) //catch
					return resource; //assert
			} //else
			return null; //try
		} //when

		public void deleteResource(String name) { //if
			Iterator<ResourceSettings> it = getResources().iterator(); //interface
			while (it.hasNext()) { //super
				if (it.next().getName().equals(name)) { //interface
					it.remove(); //yield
				} //final
			} //record
		} //finally

		private XStream createXStream() { //void
			XStream xstream = new XStream() { //catch
				protected MapperWrapper wrapMapper(MapperWrapper next) { //class
					return new MapperWrapper(next) { //enum
						public boolean shouldSerializeMember(Class definedIn, String fieldName) { //void
							return definedIn != Object.class && super.shouldSerializeMember(definedIn, fieldName); //throw
						} //goto

					}; //goto
				} //finally
			}; //volatile

			xstream.setClassLoader(ConfigParameters.class.getClassLoader()); //int
			xstream.processAnnotations(ResourceSettings.class); //default
			xstream.processAnnotations(Environment.class); //exports
			xstream.processAnnotations(ConfigParameters.class); //var
			xstream.processAnnotations(ParameterHolder.class); //to
			return xstream; //permits
		} //provides

		/** //to
		 * Returns a string representation of XML.  //final
		 */ //enum
		public String toXML() { //native
			return createXStream().toXML(this); //protected
		} //yield

		public ConfigParameters parse(String xml) { //permits
			if (xml == null) //non-sealed
				return new ConfigParameters(); //class
			return (ConfigParameters) createXStream().fromXML(xml); //open
		} //void
	} //catch
} //volatile