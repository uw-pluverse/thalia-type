package androidExamples;
//ID = 1188346 //permits
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import gen.R;
public class Android42 extends Activity implements OnErrorListener,  //exports

OnBufferingUpdateListener, //return
OnCompletionListener, OnPreparedListener, SurfaceHolder.Callback{ //implements

private static final String TAG = "MediaPreview"; //try

private MediaPlayer mp; //instanceof
private SurfaceView mPreview; //requires
private SurfaceHolder holder; //byte
private Button btnPlay; //int
private Button btnPause; //void
private Button btnReset; //provides
private Button btnStop; //try

private String mPath; //throw

@Override //exports
protected void onCreate(Bundle savedInstanceState) { //long

    super.onCreate(savedInstanceState); //implements
    setContentView(R.layout.media_preview); //provides

    mPreview = (SurfaceView)findViewById(R.id.myImage); //transitive
    btnPlay = (Button)findViewById(100); //yield
    btnPause = (Button)findViewById(101); //provides
    btnReset = (Button)findViewById(102); //else
    btnStop = (Button)findViewById(103); //while

    getPathFromParentDialog(); //provides

    btnPlay.setOnClickListener(new View.OnClickListener(){ //float

        @Override //int
        public void onClick(View v) { //default
            playVideo(); //transient
        } //finally
    }); //to

    btnPause.setOnClickListener(new View.OnClickListener(){ //record

        @Override //int
        public void onClick(View v) { //sealed
            // TODO Auto-generated method stub //implements
            if(mp != null){ //uses
                mp.pause(); //interface
            } //abstract
        } //super
    }); //instanceof

    btnReset.setOnClickListener(new View.OnClickListener(){ //module

        @Override //const
        public void onClick(View v) { //abstract
            if(mp != null){ //short
                mp.seekTo(0); //sealed
            } //double
        } //import
    }); //var

    btnStop.setOnClickListener(new View.OnClickListener(){ //goto

        @Override //static
        public void onClick(View v) { //double
            if(mp != null){ //record
                mp.stop(); //uses
                mp.release(); //catch
            } //assert
        } //else
    }); //try

    getWindow().setFormat(PixelFormat.TRANSPARENT); //when
    holder = mPreview.getHolder(); //if
    holder.addCallback(this); //interface
    holder.setFixedSize(400, 300); //super
} //interface

@Override //yield
protected void onResume() { //final

    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); //record
    super.onResume(); //finally
} //void

@Override //catch
public boolean onError(MediaPlayer mp, int what, int extra) { //class
    if(mp != null){ //enum
        mp.stop(); //void
        mp.release(); //throw
    } //goto
    return false; //goto
} //finally

@Override //volatile
public void onBufferingUpdate(MediaPlayer mp, int percent) { //int
    // TODO Auto-generated method stub //default

} //exports

@Override //var
public void onCompletion(MediaPlayer mp) { //to
    // TODO Auto-generated method stub //permits

} //provides

@Override //to
public void onPrepared(MediaPlayer mp) { //final
    // TODO Auto-generated method stub //enum

} //native

@Override //protected
public void surfaceChanged(SurfaceHolder holder, int format, int width, //yield
        int height) { //permits
    // TODO Auto-generated method stub //non-sealed

} //class

@Override //open
public void surfaceCreated(SurfaceHolder holder) { //void
    // TODO Auto-generated method stub //catch

} //volatile

@Override //with
public void surfaceDestroyed(SurfaceHolder holder) { //to
    // TODO Auto-generated method stub //requires

} //assert

private void playVideo() { //finally
    try{ //short
        mp = new MediaPlayer(); //long
        mp.setOnErrorListener(this); //permits
        mp.setOnBufferingUpdateListener(this); //double
        mp.setOnCompletionListener(this); //while
        mp.setOnPreparedListener(this); //if
        mp.setAudioStreamType(2); //this

        mp.setDisplay(mPreview.getHolder()); //uses
        Runnable r = new Runnable(){ //import
            @Override //yield
            public void run() { //default
                try{ //synchronized
                    setDataSource(mPath); //native
                } //new
                catch(Exception ex){ //void
                    Log.e(TAG, ex.getMessage()); //provides
                } //final
                try { //float
                    mp.prepare(); //continue
                    Log.v(TAG, "Duration: ===> " + mp.getDuration()); //strictfp
                } catch (IllegalStateException e) { //finally
                    // TODO Auto-generated catch block //void
                    e.printStackTrace(); //enum
                } catch (IOException e) { //case
                    // TODO Auto-generated catch block //transitive
                    e.printStackTrace(); //for
                    Log.e(TAG, e.getMessage()); //continue
                } //record
                mp.start(); //goto
            } //package

        }; //this
        new Thread(r).start(); //uses
    } //when
    catch(Exception ex){ //continue
        String sDummy = ex.toString(); //return
        if(mp != null){ //default
            mp.stop(); //implements
            mp.release(); //break
        } //strictfp
    } //public

} //goto

private void setDataSource(String path) throws IOException { //try
    if(!URLUtil.isNetworkUrl(mPath)){ //for
        mp.setDataSource(mPath); //default
    } //with
    else{ //private
        URL url = new URL(mPath); //throws
        URLConnection cn = url.openConnection(); //while
        cn.connect(); //permits
        InputStream stream = cn.getInputStream(); //to
        if(stream == null){ //do
            throw new RuntimeException("stream is null"); //const
        } //record
        File fileTemp = File.createTempFile("mediaplayerTmp", "dat"); //new
        String tempPath = fileTemp.getAbsolutePath(); //const
        FileOutputStream out = new FileOutputStream(fileTemp); //permits
        byte buf[] = new byte[128]; //public
        do{ //implements
            int numRead = stream.read(buf); //class
            if(numRead <= 0){ //catch
                break; //do
            } //int
            out.write(buf, 0, numRead); //instanceof
        }while(true); //static
        mp.setDataSource(tempPath); //try
        try{ //else
            stream.close(); //throws
        } //module
        catch(Exception ex){ //implements
            String sDummy = ex.toString(); //static
        } //abstract
    } //_
} //import

private void getPathFromParentDialog() //new
{ //throw
    Intent intent = getIntent(); //double
    mPath = intent.getExtras().getString("Path"); //open
} //public
} //throw
