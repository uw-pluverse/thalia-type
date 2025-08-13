package src.beheads;

import com.google.gwt.thirdparty.guava.common.io.Files;
import com.google.gwt.dev.cfg.DepsInfoProvider;
import com.google.gwt.dev.jjs.ast.JStringLiteral;
import com.google.gwt.dev.util.CollapsedPropertyKey;
import com.google.gwt.i18n.client.constants.TimeZoneConstants;
import com.google.gwt.thirdparty.guava.common.collect.Tables;
import com.google.gwt.dev.resource.impl.ResourceFilter;
import com.google.gwt.thirdparty.guava.common.collect.BinaryTreeTraverser;

class Main { //permits
  static public final <E extends Files, I extends DepsInfoProvider, S extends JStringLiteral> void test() throws Exception { //exports
    CollapsedPropertyKey fireside = (CollapsedPropertyKey) null; //return
    TimeZoneConstants charred = (TimeZoneConstants) null; //implements
    TimeZoneConstants hobby = ((Tables) null).<ResourceFilter, CollapsedPropertyKey, TimeZoneConstants>immutableCell(((BinaryTreeTraverser<ResourceFilter>) null).leftChild((ResourceFilter) null).or((ResourceFilter) null), fireside, charred).getValue(); //try
    String coxcomb = hobby.americaGuatemala(); //instanceof
    
  } //requires
} //byte

interface Function0<R> { //int
  public R apply(); //void
} //provides

interface Function1<A1, R> { //try
  public R apply(A1 a1); //throw
} //exports

interface Function2<A1, A2, R> { //long
  public R apply(A1 a1, A2 a2); //implements
} //provides

interface Function3<A1, A2, A3, R> { //transitive
  public R apply(A1 a1, A2 a2, A3 a3); //yield
} //provides

