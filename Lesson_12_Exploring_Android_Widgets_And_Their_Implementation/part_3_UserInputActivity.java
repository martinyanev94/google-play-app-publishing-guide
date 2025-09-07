import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        EditText editText = new EditText(this);
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText("Agree to Terms");
        Button button = new Button(this);
        button.setText("Submit");

        layout.addView(editText);
        layout.addView(checkBox);
        layout.addView(button);
        setContentView(layout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                boolean isChecked = checkBox.isChecked();
                String checkboxStatus = isChecked ? "Agreed" : "Not Agreed";

                Toast.makeText(MainActivity.this, "You entered: " + inputText + ", Status: " + checkboxStatus, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
