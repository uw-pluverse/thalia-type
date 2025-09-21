import java.util.Deque;

interface OptionRemoteUI {
    boolean getJavaGenericServices();
}

class ForwardingDeque<M> implements Deque<Builder> {
    public Builder pollLast() { return null; }
}

class Builder {}