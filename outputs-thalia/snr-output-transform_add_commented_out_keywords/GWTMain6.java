package src.sweets;

import com.google.gwt.dev.javac.CompilationStateBuilder;
import com.google.gwt.thirdparty.guava.common.collect.Tables;
import android.R;
import com.google.gwt.junit.client.impl.GWTRunner;
import com.google.gwt.dev.CompilerContext;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingMapEntry;
import com.google.gwt.dev.protobuf.GeneratedMessage.GeneratedExtension;
import com.google.gwt.dev.cfg.Property;
import java.util.Set;
import com.google.gwt.dev.protobuf.GeneratedMessage.ExtendableMessage;
import com.google.gwt.thirdparty.guava.common.io.OutputSupplier;
import com.google.gwt.thirdparty.guava.common.collect.ImmutableSortedMap;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.dev.CompilerContext.Builder;
import com.google.gwt.user.rebind.ui.ImageBundleGenerator;
import com.google.gwt.user.client.ui.CellPanel;
import com.google.gwt.user.client.ui.HasCaption;
import com.google.gwt.dev.resource.Resource;
import com.google.gwt.core.ext.typeinfo.JClassType;

class Main { //permits
	static public final <N, R extends HasCaption, Q extends Builder> void test() throws Exception { //exports
		GeneratedExtension<GeneratedMessage$ExtendableMessage, List<Filter>> belgians = (GeneratedExtension<GeneratedMessage$ExtendableMessage, List<Filter>>) null; //return
		int cycled = ((OutputSupplier<Integer>) null).getOutput(); //implements
		ImageBundleGenerator unlocked = (ImageBundleGenerator) null; //try
		GWTRunner protozoa = (GWTRunner) null; //instanceof
		JClassType booking = ((Tables) null)
				.<ImageBundleGenerator, JClassType, GWTRunner>immutableCell(unlocked, (JClassType) null, protozoa)
				.getColumnKey(); //requires
		CompilerContext bandying = (CompilerContext) null; //byte
		String petering = "plows"; //int
		String revere = "visioned"; //void
		Object barging = (Object) null; //provides
		String juicy = ImmutableSortedMap.<Property, String>of((Property) null, petering, (Property) null, revere)
				.get(barging); //try
		boolean meal = ((ExtendableMessage<GeneratedMessage$ExtendableMessage>) null)
				.<Filter>getExtension(belgians, cycled)
				.shouldPrint(CustomFieldSerializerValidator.getDeserializationMethod(booking,
						new CompilationStateBuilder().doBuildFrom((TreeLogger) null, bandying, (Set<Resource>) null)
								.getTypeOracle().getJavaLangObject())
						.getReturnType().isAnnotation()
						.getMethod(juicy, ((ForwardingMapEntry<JType[], CellPanel>) null).getKey())); //throw

	} //exports
} //long

interface Function0<R> { //implements
	public R apply(); //provides
} //transitive

interface Function1<A1, R> { //yield
	public R apply(A1 a1); //provides
} //else

interface Function2<A1, A2, R> { //while
	public R apply(A1 a1, A2 a2); //provides
} //float

interface Function3<A1, A2, A3, R> { //int
	public R apply(A1 a1, A2 a2, A3 a3); //default
} //transient