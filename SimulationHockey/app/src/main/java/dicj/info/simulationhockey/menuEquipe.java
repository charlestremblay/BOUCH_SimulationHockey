package dicj.info.simulationhockey;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class menuEquipe  extends AppCompatActivity {

    public static String ficheEquipe;
    private int nbrVictoires = 0, nbrDefaites = 0, nbrDefaitesProl = 0, nbrPoints = 0;
    public static int drawableId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_equipe);
        ficheEquipe = Integer.toString(nbrVictoires) + "-" + Integer.toString(nbrDefaites) + "-" + Integer.toString(nbrDefaitesProl);
        TextView TV = (TextView) findViewById(R.id.TVTeamA2);
        TextView TVFiche = (TextView) findViewById(R.id.ficheEquipe);
        TextView TVPoints = (TextView) findViewById(R.id.TVPoints);
        ImageView IV = (ImageView) findViewById(R.id.IVA2);
        TVFiche.setText(String.valueOf(ficheEquipe));
        TVPoints.setText(String.valueOf(nbrPoints));

        switch(choixEquipe.teamId){
            case R.id.team0: IV.setImageResource(R.drawable.ducks);
                TV.setText(R.string.ducks);
                drawableId = getResources().getIdentifier("ducks", "drawable", getPackageName());
                break;
            case R.id.team1: IV.setImageResource(R.drawable.coyotes);
                TV.setText(R.string.coyotes);
                drawableId = getResources().getIdentifier("coyotes", "drawable", getPackageName());;
                break;
            case R.id.team2: IV.setImageResource(R.drawable.bruins);
                TV.setText(R.string.bruins);
                drawableId = getResources().getIdentifier("bruins", "drawable", getPackageName());
                break;
            case R.id.team3: IV.setImageResource(R.drawable.sabres);
                TV.setText(R.string.sabres);
                drawableId = getResources().getIdentifier("sabres", "drawable", getPackageName());
                break;
            case R.id.team4: IV.setImageResource(R.drawable.flames);
                TV.setText(R.string.flames);
                drawableId = getResources().getIdentifier("flames", "drawable", getPackageName());
                break;
            case R.id.team5: IV.setImageResource(R.drawable.hurricanes);
                TV.setText(R.string.hurricanes);
                drawableId = getResources().getIdentifier("hurricanes", "drawable", getPackageName());
                break;
            case R.id.team6: IV.setImageResource(R.drawable.blackhawks);
                TV.setText(R.string.blackhawks);
                drawableId = getResources().getIdentifier("blackhawks", "drawable", getPackageName());
                break;
            case R.id.team7: IV.setImageResource(R.drawable.avalanche);
                TV.setText(R.string.avalanche);
                drawableId = getResources().getIdentifier("avalanche", "drawable", getPackageName());
                break;
            case R.id.team8: IV.setImageResource(R.drawable.blue_jackets);
                TV.setText(R.string.blue_jackets);
                drawableId = getResources().getIdentifier("blue_jackets", "drawable", getPackageName());
                break;
            case R.id.team9: IV.setImageResource(R.drawable.stars);
                TV.setText(R.string.stars);
                drawableId = getResources().getIdentifier("stars", "drawable", getPackageName());
                break;
            case R.id.team10: IV.setImageResource(R.drawable.red_wings);
                TV.setText(R.string.red_wings);
                drawableId = getResources().getIdentifier("red_wings", "drawable", getPackageName());
                break;
            case R.id.team11: IV.setImageResource(R.drawable.oilers);
                TV.setText(R.string.oilers);
                drawableId = getResources().getIdentifier("oilers", "drawable", getPackageName());
                break;
            case R.id.team12: IV.setImageResource(R.drawable.panthers);
                TV.setText(R.string.panthers);
                drawableId = getResources().getIdentifier("panthers", "drawable", getPackageName());
                break;
            case R.id.team13: IV.setImageResource(R.drawable.kings);
                TV.setText(R.string.kings);
                drawableId = getResources().getIdentifier("kings", "drawable", getPackageName());
                break;
            case R.id.team14: IV.setImageResource(R.drawable.wild);
                TV.setText(R.string.wild);
                drawableId = getResources().getIdentifier("wild", "drawable", getPackageName());
                break;
            case R.id.team15: IV.setImageResource(R.drawable.canadiens);
                TV.setText(R.string.canadiens);
                drawableId = getResources().getIdentifier("canadiens", "drawable", getPackageName());
                break;
            case R.id.team16: IV.setImageResource(R.drawable.predators);
                TV.setText(R.string.predators);
                drawableId = getResources().getIdentifier("predators", "drawable", getPackageName());
                break;
            case R.id.team17: IV.setImageResource(R.drawable.devils);
                TV.setText(R.string.devils);
                drawableId = getResources().getIdentifier("devils", "drawable", getPackageName());
                break;
            case R.id.team18: IV.setImageResource(R.drawable.islanders);
                TV.setText(R.string.islanders);
                drawableId = getResources().getIdentifier("islanders", "drawable", getPackageName());
                break;
            case R.id.team19: IV.setImageResource(R.drawable.rangers);
                TV.setText(R.string.rangers);
                drawableId = getResources().getIdentifier("rangers", "drawable", getPackageName());
                break;
            case R.id.team20: IV.setImageResource(R.drawable.senators);
                TV.setText(R.string.senators);
                drawableId = getResources().getIdentifier("senators", "drawable", getPackageName());
                break;
            case R.id.team21: IV.setImageResource(R.drawable.flyers);
                TV.setText(R.string.flyers);
                drawableId = getResources().getIdentifier("flyers", "drawable", getPackageName());
                break;
            case R.id.team22: IV.setImageResource(R.drawable.penguins);
                TV.setText(R.string.penguins);
                drawableId = getResources().getIdentifier("penguins", "drawable", getPackageName());
                break;
            case R.id.team23: IV.setImageResource(R.drawable.sharks);
                TV.setText(R.string.sharks);
                drawableId = getResources().getIdentifier("sharks", "drawable", getPackageName());
                break;
            case R.id.team24: IV.setImageResource(R.drawable.blues);
                TV.setText(R.string.blues);
                drawableId = getResources().getIdentifier("blues", "drawable", getPackageName());
                break;
            case R.id.team25: IV.setImageResource(R.drawable.lightning);
                TV.setText(R.string.lightning);
                drawableId = getResources().getIdentifier("lightning", "drawable", getPackageName());
                break;
            case R.id.team26: IV.setImageResource(R.drawable.maple_leafs);
                TV.setText(R.string.maple_leafs);
                drawableId = getResources().getIdentifier("maple_leafs", "drawable", getPackageName());
                break;
            case R.id.team27: IV.setImageResource(R.drawable.canucks);
                TV.setText(R.string.canucks);
                drawableId = getResources().getIdentifier("canucks", "drawable", getPackageName());
                break;
            case R.id.team28: IV.setImageResource(R.drawable.capitals);
                TV.setText(R.string.capitals);
                drawableId = getResources().getIdentifier("capitals", "drawable", getPackageName());
                break;
            case R.id.team29: IV.setImageResource(R.drawable.jets);
                TV.setText(R.string.jets);
                drawableId = getResources().getIdentifier("jets", "drawable", getPackageName());
                break;
        }
    }

    public void boutonMatch (View button){
        Intent intentA3 = new Intent(menuEquipe.this, match.class);
        startActivity(intentA3);
    }

    public void btnRetourA2(View button){
        Intent intentRetourA2 = new Intent(menuEquipe.this, choixEquipe.class);
        startActivity(intentRetourA2);
    }

}


