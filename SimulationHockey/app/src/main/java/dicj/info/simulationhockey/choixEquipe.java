package dicj.info.simulationhockey;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class choixEquipe extends AppCompatActivity {

    public static int teamId;
    private boolean isFrench;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_equipe);
        Button btnLanguage = (Button) findViewById(R.id.btnLanguage);
        TextView TVChoixEquipe = (TextView) findViewById(R.id.TVChoixEquipe);
        if(TVChoixEquipe.getText().toString() == "Sélectionnez une équipe pour poursuivre."){
            btnLanguage.setText(getString(R.string.changerAnglais));
            isFrench = true;
        }
        else{
            btnLanguage.setText(getString(R.string.switchFrench));
            isFrench = false;
        }
        setTitle(R.string.choixÉquipe);
        menuEquipe.matchsJoues = 0;
    }

    @Override
    protected void onResume(){
       super.onResume();
        TableLayout TL = (TableLayout) findViewById(R.id.tableLayoutA1);
        for (int i = 0; i <= (TL.getChildCount() - 1); i++) {
            TL.getChildAt(i).setBackgroundColor(Color.parseColor("#F68C13"));
        }
        Button button = (Button) findViewById(R.id.buttonA1);
        button.setEnabled(false);
    }

    public void selectTeam (View v) {

        Button button = (Button) findViewById(R.id.buttonA1);
        TableLayout TL = (TableLayout) findViewById(R.id.tableLayoutA1);

        if (button.isEnabled() == false) {
            int TR_id = v.getId();
            TableRow TR = (TableRow) findViewById(TR_id);
            TR.setBackgroundColor(Color.parseColor("#990000"));
            Toast.makeText(getApplicationContext(), R.string.selectTeam1, Toast.LENGTH_SHORT).show();
            Log.i("DICJ.info", "Le bouton est activé.");
            teamId = v.getId();
            button.setEnabled(true);
        } else {
            for (int i = 0; i <= (TL.getChildCount() - 1); i++) {
                TL.getChildAt(i).setBackgroundColor(Color.parseColor("#F68C13"));
            }

            Toast.makeText(getApplicationContext(), R.string.selectTeam2, Toast.LENGTH_SHORT).show();
            Log.i("DICJ.info", "Le bouton est désactivé.");
            button.setEnabled(false);
        }
    }

    public void boutonActivite1 (View button){

        Button b = (Button)button;

        Intent intentA2 = new Intent(choixEquipe.this, menuEquipe.class);
        startActivity(intentA2);
    }

    public void changerLanguage(View button){
        String nouveauLanguage;
        Configuration config = new Configuration();
        Locale langue;
        Button btnLanguage = (Button) findViewById(R.id.btnLanguage);
        if(btnLanguage.getText() == getString(R.string.switchFrench)){
            nouveauLanguage = "fr";
            langue = new Locale(nouveauLanguage);
            langue.setDefault(langue);
            config.locale = langue;
            getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            this.setContentView(R.layout.activity_choix_equipe);
            isFrench = true;
        }
        else{
            nouveauLanguage = "en";
            langue = new Locale(nouveauLanguage);
            langue.setDefault(langue);
            config.locale = langue;
            getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
            this.setContentView(R.layout.activity_choix_equipe);
            isFrench = false;
        }


    }
}
