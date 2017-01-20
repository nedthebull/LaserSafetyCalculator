package comtradingjournal.wix.treycartercaldwell.lasersafetycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener buttonListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent new_calculation = new Intent(this.getApplication().getApplicationContext(), NewCalcActivity.class);
//        this.startActivity(new_calculation);

        Button buttonNew = (Button) findViewById(R.id.buttonNew);
        buttonListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText = ((Button) view).getText().toString();

                MainActivity.this.setTitle("You Clicked This:" + buttonText);

                Intent new_calculation = new Intent(MainActivity.this.getApplication().getApplicationContext(), NewCalcActivity.class);
                MainActivity.this.startActivity(new_calculation);
            }
        };
        buttonNew.setOnClickListener(buttonListener);

        //Button buttonReview = (Button) findViewById(R.id.buttonReview);
        //buttonReview.setOnClickListener(buttonListener);



    }

}
