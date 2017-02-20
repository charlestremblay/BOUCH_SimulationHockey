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

    public void boutonA1(Button button){
        if(button.isEnabled() == false)
        {
            Toast.makeText(getApplicationContext(), "@string/toastButtonA1", Toast.LENGTH_SHORT).show();
            Log.i("DICJ.info","Le bouton est désactivé.");
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Une équipe est sélectionnée!", Toast.LENGTH_SHORT).show();
            Log.i("DICJ.info","Le bouton est activé.");
        }
    }
}
