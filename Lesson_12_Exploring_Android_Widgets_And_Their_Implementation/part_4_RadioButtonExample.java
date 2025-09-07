import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        RadioGroup radioGroup = new RadioGroup(this);
        RadioButton option1 = new RadioButton(this);
        option1.setText("Option 1");
        RadioButton option2 = new RadioButton(this);
        option2.setText("Option 2");
        Button button = new Button(this);
        button.setText("Submit");

        radioGroup.addView(option1);
        radioGroup.addView(option2);
        layout.addView(radioGroup);
        layout.addView(button);
        setContentView(layout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                RadioButton selectedButton = findViewById(selectedId);
                String selectedText = selectedButton != null ? selectedButton.getText().toString() : "No option selected";

                Toast.makeText(MainActivity.this, "Selected: " + selectedText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
