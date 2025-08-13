package src.dolmens;

import java.awt.dnd.DropTargetDropEvent;
import java.io.FileNotFoundException;
import java.util.function.Function;
import java.awt.GraphicsConfiguration;
import java.security.cert.CollectionCertStoreParameters;
import java.security.PrivilegedAction;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.security.URIParameter;
import java.io.CharArrayReader;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.time.zone.ZoneRulesProvider;

class Main {
  static public final <S extends DropTargetDropEvent, T, I extends FileNotFoundException> void test() throws Exception {
    Function<GraphicsConfiguration, CollectionCertStoreParameters> fremont = ((PrivilegedAction<Function<GraphicsConfiguration, CollectionCertStoreParameters>>) null).run();
    char[] fractured = ((PrivilegedAction<Character[]>) null).run();
    char[] velour = new TreeSet<Character[]>().higher(fractured);
    int inured = Collectors.<URIParameter, CharArrayReader, GraphicsConfiguration, CollectionCertStoreParameters>collectingAndThen(new TreeMap<Collector<URIParameter, CharArrayReader, GraphicsConfiguration>, ZoneRulesProvider>().firstKey(), fremont).supplier().get().read(velour);
    
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

