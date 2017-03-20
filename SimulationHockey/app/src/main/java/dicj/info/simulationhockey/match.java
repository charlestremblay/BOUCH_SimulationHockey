package dicj.info.simulationhockey;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class match extends AppCompatActivity {

    public static int scoreExterieur, scoreDomicile;
    Random rnd = new Random();

    @Override
    protected void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_match);
        scoreExterieur = 0;
        scoreDomicile = 0;
        ImageView IVExterieur = (ImageView) findViewById(R.id.IVVisiteurs);
        ImageView IVDomicile = (ImageView) findViewById(R.id.IVDomicile);
        TextView TVA3 = (TextView) findViewById(R.id.TVA3);
        TVA3.setText("          " + Integer.toString(scoreExterieur) + "               -               " + Integer.toString(scoreDomicile) + "              ");

        int rndDomicile = rnd.nextInt(2);
        if(rndDomicile == 0){
            IVExterieur.setImageResource(menuEquipe.drawableId);
        }
        else{
            IVDomicile.setImageResource(menuEquipe.drawableId);
        }

        for(int i = 0; i <= 29; i++){
            if(Integer.toString(choixEquipe.teamId) == "R.id.team" + Integer.toString(i)){
                Log.i("dicj.info", Integer.toString(i));
            }
        }
    }

    public void btnRetourA3(View button){
        Intent intentRetourA3 = new Intent(match.this, menuEquipe.class);
        startActivity(intentRetourA3);
    }

}
