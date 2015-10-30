package tw.idv.chunhsin.class8_gesturephone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by student on 2015/10/30.
 */
public class AddGestureActivity extends AppCompatActivity {

    Button saveGesture, clearGesture;
    EditText editText,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addgesture);
        findviews();

    }

    void findviews(){
        saveGesture = (Button)findViewById(R.id.button3);
        clearGesture = (Button)findViewById(R.id.button4);
        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
    }
}
