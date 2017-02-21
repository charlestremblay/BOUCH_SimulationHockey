package dicj.info.simulationhockey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class choixEquipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_equipe);
    }

    public void selectTeam (View v){

        Button button = (Button)findViewById(R.id.buttonA1);

        if(button.isEnabled() == false)
        {
            Toast.makeText(getApplicationContext(), R.string.toastButtonA1, Toast.LENGTH_SHORT).show();
            Log.i("DICJ.info","Le bouton est désactivé.");
            button.setEnabled(true);
        }
        else
        {
            Toast.makeText(getApplicationContext(), , Toast.LENGTH_SHORT).show();
            Log.i("DICJ.info","Le bouton est activé.");
            button.setEnabled(false);
        }
    }
}
