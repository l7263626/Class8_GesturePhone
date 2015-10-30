package tw.idv.chunhsin.class8_gesturephone;

import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;

/**
 * Created by student on 2015/10/30.
 */
public class AddGestureActivity extends AppCompatActivity {

    Button saveGesture, clearGesture;
    EditText editText,editText2;
    GestureOverlayView overlayView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addgesture);
        findviews();

    }

    void findviews(){
        saveGesture = (Button)findViewById(R.id.button3);
        saveGesture.setOnClickListener(btnOnClick);
        clearGesture = (Button)findViewById(R.id.button4);
        clearGesture.setOnClickListener(btnOnClick);
        overlayView=(GestureOverlayView)findViewById(R.id.gestureOverlayView2);
        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
    }

    View.OnClickListener btnOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.button3:
                    File path= Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
                    File file=new File(path,"gesture");
                    GestureLibrary library= GestureLibraries.fromFile(file);
                    if(library.load()){
                        library.addGesture(editText2.getText().toString(),overlayView.getGesture());
                        library.save();
                    }else{
                        library.addGesture(editText2.getText().toString(),overlayView.getGesture());
                        library.save();
                    }
                    break;
                case R.id.button4:
                    break;
            }
        }
    };
}
