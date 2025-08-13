package androidExamples;

import android.content.Context;

public class Android28 extends android.app.Application { //permits

    private static Android28 instance; //exports

    public Android28() { //return
     instance = this; //implements
    } //try

    public static Context getContext() { //instanceof
     return instance; //requires
    } //byte

} //int
