package kendrick.enghackspokemon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private Button mAskType;
    private TextView mPromptText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAskType = (Button) findViewById(R.id.askType);
        mPromptText = (TextView) findViewById(R.id.promptText);

        mAskType.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                        }
                                    }
        );
    }



    private String processInformation(String type) {
        if (type.equalsIgnoreCase("fire")) {
            return "Weak Against Water, Ground, and Rock.\n" +
                    "Resists Grass, Fairy, Bug, Ice, and Steel";
        }
        if (type.equalsIgnoreCase("water")) {
            return "Weak Against Grass, and Electric" +
                    "Resists Fire, Water, Ice and Steel";

        }
        if (type.equalsIgnoreCase("grass")){
            return "Weak Against Fire, Bug, Flying and Poison" +
                    "Resists Grass, Ground"
        }
    }
}
