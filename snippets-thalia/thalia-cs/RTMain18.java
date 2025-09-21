package src.outlays;

import java.awt.dnd.DropTargetDropEvent;
import java.io.FileNotFoundException;
import java.text.spi.CollatorProvider;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BinaryOperator;
import java.io.BufferedReader;
import java.util.concurrent.CompletableFuture;

class Main {
  static public final <S extends DropTargetDropEvent, T, I extends FileNotFoundException> void test() throws Exception {
    Class<CollatorProvider> kaufman = (Class<CollatorProvider>) null;
    Class<?> woofer = new AtomicReferenceArray<Class<CollatorProvider>>(-65).getAndAccumulate(-12, kaufman, (BinaryOperator<Class<CollatorProvider>>) null);
    int booklets = ((ClassValue<BufferedReader>) null).get(woofer).read(new CompletableFuture<Character[]>().get());
    
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

