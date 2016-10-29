package kendrick.enghackspokemon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private Button mAskType;
    private TextView mPromptText;
    private EditText mTypeField;
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAskType = (Button) findViewById(R.id.askType);
        mPromptText = (TextView) findViewById(R.id.promptText);
        mTypeField = (EditText) findViewById(R.id.editText);
        mTextView = (TextView) findViewById(R.id.textView);
        mAskType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String type =  mTypeField.getText().toString();
                mTextView.setText(processInformation(type));
            }
        });

    }


    private String processInformation(String type) {
        if (type.equalsIgnoreCase("fire")) {
            return "Weak Against Water, Ground, and Rock.\n" +
                    "Resists Grass, Fairy, Bug, Ice, and Steel";
        } else if (type.equalsIgnoreCase("water")) {
            return "Weak Against Grass, and Electric" +
                    "Resists Fire, Water, Ice and Steel";
        } else if (type.equalsIgnoreCase("grass")) {
            return "Weak Against Fire, Bug, Flying, and Poison" +
                    "Resists Grass, Ground";
        } else if (type.equalsIgnoreCase("electric")){
            return "Weak Against Ground" +
                    "Resists Electric, Flying and Steel";
        } else if (type.equalsIgnoreCase("ice")){
            return "Weak Against Fighting, Fire, Rock, Steel ";
        }
        return "Enter a type dingus";
    }
}
