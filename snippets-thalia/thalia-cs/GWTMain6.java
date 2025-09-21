package src.sweets;

import com.google.gwt.user.client.ui.HasCaption;
import com.google.gwt.dev.shell.remoteui.RemoteMessageProto.Message.Request.DevModeRequest.CapabilityExchange.Builder;
import com.google.gwt.dev.protobuf.GeneratedMessage.GeneratedExtension;
import com.google.gwt.dev.protobuf.GeneratedMessage$ExtendableMessage;
import java.util.List;
import com.google.gwt.dev.SignatureDumper.Filter;
import com.google.gwt.thirdparty.guava.common.io.OutputSupplier;
import com.google.gwt.user.rebind.ui.ImageBundleGenerator;
import com.google.gwt.junit.client.impl.GWTRunner;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.thirdparty.guava.common.collect.Tables;
import com.google.gwt.dev.CompilerContext;
import com.google.gwt.thirdparty.guava.common.collect.ImmutableSortedMap;
import com.google.gwt.dev.cfg.Property;
import com.google.gwt.dev.protobuf.GeneratedMessage.ExtendableMessage;
import com.google.gwt.user.rebind.rpc.CustomFieldSerializerValidator;
import com.google.gwt.dev.javac.CompilationStateBuilder;
import com.google.gwt.core.ext.TreeLogger;
import java.util.Set;
import com.google.gwt.dev.resource.Resource;
import com.google.gwt.thirdparty.guava.common.collect.ForwardingMapEntry;
import com.google.gwt.core.ext.typeinfo.JType;
import com.google.gwt.user.client.ui.CellPanel;

class Main {
  static public final <N, R extends HasCaption, Q extends Builder> void test() throws Exception {
    GeneratedExtension<GeneratedMessage$ExtendableMessage, List<Filter>> belgians = (GeneratedExtension<GeneratedMessage$ExtendableMessage, List<Filter>>) null;
    int cycled = ((OutputSupplier<Integer>) null).getOutput();
    ImageBundleGenerator unlocked = (ImageBundleGenerator) null;
    GWTRunner protozoa = (GWTRunner) null;
    JClassType booking = ((Tables) null).<ImageBundleGenerator, JClassType, GWTRunner>immutableCell(unlocked, (JClassType) null, protozoa).getColumnKey();
    CompilerContext bandying = (CompilerContext) null;
    String petering = "plows";
    String revere = "visioned";
    Object barging = (Object) null;
    String juicy = ImmutableSortedMap.<Property, String>of((Property) null, petering, (Property) null, revere).get(barging);
    boolean meal = ((ExtendableMessage<GeneratedMessage$ExtendableMessage>) null).<Filter>getExtension(belgians, cycled).shouldPrint(CustomFieldSerializerValidator.getDeserializationMethod(booking, new CompilationStateBuilder().doBuildFrom((TreeLogger) null, bandying, (Set<Resource>) null).getTypeOracle().getJavaLangObject()).getReturnType().isAnnotation().getMethod(juicy, ((ForwardingMapEntry<JType[], CellPanel>) null).getKey()));
    
  }
}

interface Function0<R> {
  public R apply();
}

interface Function1<A1, R> {
  public R apply(A1 a1);
}

interface Function2<A1, A2, R> {
  public R apply(A1 a1, A2 a2);
}

interface Function3<A1, A2, A3, R> {
  public R apply(A1 a1, A2 a2, A3 a3);
}

