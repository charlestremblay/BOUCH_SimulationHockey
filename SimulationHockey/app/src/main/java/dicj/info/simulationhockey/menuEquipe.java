package dicj.info.simulationhockey;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Random;

public class menuEquipe  extends AppCompatActivity {

    public static String ficheEquipe;
    public static int nbrVictoires = 0, nbrDefaites = 0, nbrDefaitesProl = 0, nbrPoints = 0, matchsJoues = 0;
    public static int drawableId;
    public static String équipe;
    public static boolean nouvelleFiche = false;
    public String[] joueursAlignement = new String[6];
    Random rnd = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_equipe);
        setTitle(R.string.menuÉquipe);
        ficheEquipe = Integer.toString(0) + "-" + Integer.toString(0) + "-" + Integer.toString(0);
        TextView TV = (TextView) findViewById(R.id.TVTeamA2);
        TextView TVFiche = (TextView) findViewById(R.id.ficheEquipe);
        TextView TVPoints = (TextView) findViewById(R.id.TVPoints);
        TextView TVFL1 = (TextView) findViewById(R.id.TVFL1);
        TextView TVFL2 = (TextView) findViewById(R.id.TVFL2);
        TextView TVFL3 = (TextView) findViewById(R.id.TVFL3);
        TextView TVFL4 = (TextView) findViewById(R.id.TVFL4);
        TextView TVFL5 = (TextView) findViewById(R.id.TVFL5);
        TextView TVFL6 = (TextView) findViewById(R.id.TVFL6);
        Button btnSauvegarder = (Button) findViewById(R.id.btnSauvegarder);
        ImageView IV = (ImageView) findViewById(R.id.IVA2);
        FrameLayout FLA2 = (FrameLayout) findViewById(R.id.FLA2);
        btnSauvegarder.setVisibility(View.GONE);
        FLA2.setVisibility(View.GONE);
        TVFiche.setText(String.valueOf(ficheEquipe));
        TVPoints.setText(String.valueOf(nbrPoints));

        for(int i = 0; i < 6; i++){
            joueursAlignement[i] = "";
        }

        switch(choixEquipe.teamId){
            case R.id.team0: IV.setImageResource(R.drawable.ducks);
                TV.setText(R.string.ducks);
                drawableId = getResources().getIdentifier("ducks", "drawable", getPackageName());
                équipe = getString(R.string.ducks);
                joueursAlignement[0] = "Rickard Rakell";
                joueursAlignement[1] = "Ryan Getzlaf";
                joueursAlignement[2] = "Corey Perry";
                joueursAlignement[3] = "Hampus Lindholm";
                joueursAlignement[4] = "Kevin Bieksa";
                joueursAlignement[5] = "John Gibson";
                break;
            case R.id.team1: IV.setImageResource(R.drawable.coyotes);
                TV.setText(R.string.coyotes);
                drawableId = getResources().getIdentifier("coyotes", "drawable", getPackageName());
                équipe = getString(R.string.coyotes);
                joueursAlignement[0] = "Max Domi";
                joueursAlignement[1] = "Christian Dvorak";
                joueursAlignement[2] = "Shane Doan";
                joueursAlignement[3] = "Alex Goligoski";
                joueursAlignement[4] = "Luke Schenn";
                joueursAlignement[5] = "Mike Smith";
                break;
            case R.id.team2: IV.setImageResource(R.drawable.bruins);
                TV.setText(R.string.bruins);
                drawableId = getResources().getIdentifier("bruins", "drawable", getPackageName());
                équipe = getString(R.string.bruins);
                joueursAlignement[0] = "Brad Marchand";
                joueursAlignement[1] = "Patrice Bergeron";
                joueursAlignement[2] = "David Pastrnak";
                joueursAlignement[3] = "Zdeno Chara";
                joueursAlignement[4] = "Charlie McAvoy";
                joueursAlignement[5] = "Tuuka Rask";
                break;
            case R.id.team3: IV.setImageResource(R.drawable.sabres);
                TV.setText(R.string.sabres);
                drawableId = getResources().getIdentifier("sabres", "drawable", getPackageName());
                équipe = getString(R.string.sabres);
                joueursAlignement[0] = "Evander Kane";
                joueursAlignement[1] = "Ryan O'Reilly";
                joueursAlignement[2] = "Jack Eichel";
                joueursAlignement[3] = "Josh Gorges";
                joueursAlignement[4] = "Rasmus Ristolainen";
                joueursAlignement[5] = "Robin Lehner";
                break;
            case R.id.team4: IV.setImageResource(R.drawable.flames);
                TV.setText(R.string.flames);
                drawableId = getResources().getIdentifier("flames", "drawable", getPackageName());
                équipe = getString(R.string.flames);
                joueursAlignement[0] = "Johnny Gaudreau";
                joueursAlignement[1] = "Sean Monahan";
                joueursAlignement[2] = "Michael Frolik";
                joueursAlignement[3] = "Mark Giordano";
                joueursAlignement[4] = "Dougie Hamilton";
                joueursAlignement[5] = "Brian Elliott";
                break;
            case R.id.team5: IV.setImageResource(R.drawable.hurricanes);
                TV.setText(R.string.hurricanes);
                drawableId = getResources().getIdentifier("hurricanes", "drawable", getPackageName());
                équipe = getString(R.string.hurricanes);
                joueursAlignement[0] = "Sebastian Aho";
                joueursAlignement[1] = "Jordan Staal";
                joueursAlignement[2] = "Jeff Skinner";
                joueursAlignement[3] = "Noah Hanifin";
                joueursAlignement[4] = "Justin Faulk";
                joueursAlignement[5] = "Cam Ward";
                break;
            case R.id.team6: IV.setImageResource(R.drawable.blackhawks);
                TV.setText(R.string.blackhawks);
                drawableId = getResources().getIdentifier("blackhawks", "drawable", getPackageName());
                équipe = getString(R.string.blackhawks);
                joueursAlignement[0] = "Artemi Panarin";
                joueursAlignement[1] = "Jonathan Toews";
                joueursAlignement[2] = "Patrick Kane";
                joueursAlignement[3] = "Duncan Keith";
                joueursAlignement[4] = "Brent Seabrook";
                joueursAlignement[5] = "Corey Crawford";
                break;
            case R.id.team7: IV.setImageResource(R.drawable.avalanche);
                TV.setText(R.string.avalanche);
                drawableId = getResources().getIdentifier("avalanche", "drawable", getPackageName());
                équipe = getString(R.string.avalanche);
                joueursAlignement[0] = "Gabriel Landeskog";
                joueursAlignement[1] = "Nathan MacKinnon";
                joueursAlignement[2] = "Matt Duchene";
                joueursAlignement[3] = "François Beauchemin";
                joueursAlignement[4] = "Erik Johnson";
                joueursAlignement[5] = "Calvin Pickard";
                break;
            case R.id.team8: IV.setImageResource(R.drawable.blue_jackets);
                TV.setText(R.string.blue_jackets);
                drawableId = getResources().getIdentifier("blue_jackets", "drawable", getPackageName());
                équipe = getString(R.string.blue_jackets);
                joueursAlignement[0] = "Nick Foligno";
                joueursAlignement[1] = "Brandon Dubinsky";
                joueursAlignement[2] = "Cam Atkinson";
                joueursAlignement[3] = "David Savard";
                joueursAlignement[4] = "Seth Jones";
                joueursAlignement[5] = "Sergei Bobrovsky";
                break;
            case R.id.team9: IV.setImageResource(R.drawable.stars);
                TV.setText(R.string.stars);
                drawableId = getResources().getIdentifier("stars", "drawable", getPackageName());
                équipe = getString(R.string.stars);
                joueursAlignement[0] = "Jamie Benn";
                joueursAlignement[1] = "Tyler Seguin";
                joueursAlignement[2] = "Jason Spezza";
                joueursAlignement[3] = "Dan Hamhuis";
                joueursAlignement[4] = "John Klingberg";
                joueursAlignement[5] = "Kari Lehtonen";
                break;
            case R.id.team10: IV.setImageResource(R.drawable.red_wings);
                TV.setText(R.string.red_wings);
                drawableId = getResources().getIdentifier("red_wings", "drawable", getPackageName());
                équipe = getString(R.string.red_wings);
                joueursAlignement[0] = "Gustav Nyquist";
                joueursAlignement[1] = "Henrik Zetterberg";
                joueursAlignement[2] = "Tomas Tatar";
                joueursAlignement[3] = "Niklas Kronwall";
                joueursAlignement[4] = "Mike Green";
                joueursAlignement[5] = "Jimmy Howard";
                break;
            case R.id.team11: IV.setImageResource(R.drawable.oilers);
                TV.setText(R.string.oilers);
                drawableId = getResources().getIdentifier("oilers", "drawable", getPackageName());
                équipe = getString(R.string.oilers);
                joueursAlignement[0] = "Patrick Maroon";
                joueursAlignement[1] = "Connor McDavid";
                joueursAlignement[2] = "Leon Draisaitl";
                joueursAlignement[3] = "Oscar Klefbom";
                joueursAlignement[4] = "Adam Larsson";
                joueursAlignement[5] = "Cam Talbot";
                break;
            case R.id.team12: IV.setImageResource(R.drawable.panthers);
                TV.setText(R.string.panthers);
                drawableId = getResources().getIdentifier("panthers", "drawable", getPackageName());
                équipe = getString(R.string.panthers);
                joueursAlignement[0] = "Jonathan Huberdeau";
                joueursAlignement[1] = "Vincent Trocheck";
                joueursAlignement[2] = "Jaromir Jagr";
                joueursAlignement[3] = "Keith Yandle";
                joueursAlignement[4] = "Alex Petrovic";
                joueursAlignement[5] = "Reto Berra";
                break;
            case R.id.team13: IV.setImageResource(R.drawable.kings);
                TV.setText(R.string.kings);
                drawableId = getResources().getIdentifier("kings", "drawable", getPackageName());
                équipe = getString(R.string.kings);
                joueursAlignement[0] = "Marian Gaborik";
                joueursAlignement[1] = "Anze Kopitar";
                joueursAlignement[2] = "Tyler Toffoli";
                joueursAlignement[3] = "Drew Doughty";
                joueursAlignement[4] = "Jake Muzzin";
                joueursAlignement[5] = "Jonathan Quick";
                break;
            case R.id.team14: IV.setImageResource(R.drawable.wild);
                TV.setText(R.string.wild);
                drawableId = getResources().getIdentifier("wild", "drawable", getPackageName());
                équipe = getString(R.string.wild);
                joueursAlignement[0] = "Nino Niederreiter";
                joueursAlignement[1] = "Mikko Koivu";
                joueursAlignement[2] = "Zach Parise";
                joueursAlignement[3] = "Ryan Suter";
                joueursAlignement[4] = "Jared Spurgeon";
                joueursAlignement[5] = "Devan Dubnyk";
                break;
            case R.id.team15: IV.setImageResource(R.drawable.canadiens);
                TV.setText(R.string.canadiens);
                drawableId = getResources().getIdentifier("canadiens", "drawable", getPackageName());
                équipe = getString(R.string.canadiens);
                joueursAlignement[0] = "Max Pacioretty";
                joueursAlignement[1] = "Alex Galchenyuk";
                joueursAlignement[2] = "Alexander Radulov";
                joueursAlignement[3] = "Andrei Markov";
                joueursAlignement[4] = "Shea Weber";
                joueursAlignement[5] = "Carey Price";
                break;
            case R.id.team16: IV.setImageResource(R.drawable.predators);
                TV.setText(R.string.predators);
                drawableId = getResources().getIdentifier("predators", "drawable", getPackageName());
                équipe = getString(R.string.predators);
                joueursAlignement[0] = "Filip Forsberg";
                joueursAlignement[1] = "Ryan Johansen";
                joueursAlignement[2] = "Viktor Arvidsson";
                joueursAlignement[3] = "Roman Josi";
                joueursAlignement[4] = "P.K. Subban";
                joueursAlignement[5] = "Pekka Rinne";
                break;
            case R.id.team17: IV.setImageResource(R.drawable.devils);
                TV.setText(R.string.devils);
                drawableId = getResources().getIdentifier("devils", "drawable", getPackageName());
                équipe = getString(R.string.devils);
                joueursAlignement[0] = "Taylor Hall";
                joueursAlignement[1] = "Travis Zajac";
                joueursAlignement[2] = "Kyle Palmieri";
                joueursAlignement[3] = "Andy Greene";
                joueursAlignement[4] = "Ben Lovejoy";
                joueursAlignement[5] = "Cory Schneider";
                break;
            case R.id.team18: IV.setImageResource(R.drawable.islanders);
                TV.setText(R.string.islanders);
                drawableId = getResources().getIdentifier("islanders", "drawable", getPackageName());
                équipe = getString(R.string.islanders);
                joueursAlignement[0] = "Andrew Ladd";
                joueursAlignement[1] = "John Tavares";
                joueursAlignement[2] = "Cal Clutterbuck";
                joueursAlignement[3] = "Nick Leddy";
                joueursAlignement[4] = "Johnny Boychuk";
                joueursAlignement[5] = "Jaroslav Halak";
                break;
            case R.id.team19: IV.setImageResource(R.drawable.rangers);
                TV.setText(R.string.rangers);
                drawableId = getResources().getIdentifier("rangers", "drawable", getPackageName());
                équipe = getString(R.string.rangers);
                joueursAlignement[0] = "Rick Nash";
                joueursAlignement[1] = "Derek Stepan";
                joueursAlignement[2] = "Mats Zuccarello";
                joueursAlignement[3] = "Ryan McDonagh";
                joueursAlignement[4] = "Marc Staal";
                joueursAlignement[5] = "Henrik Lundqvist";
                break;
            case R.id.team20: IV.setImageResource(R.drawable.senators);
                TV.setText(R.string.senators);
                drawableId = getResources().getIdentifier("senators", "drawable", getPackageName());
                équipe = getString(R.string.senators);
                joueursAlignement[0] = "Mike Hoffman";
                joueursAlignement[1] = "Kyle Turris";
                joueursAlignement[2] = "Bobby Ryan";
                joueursAlignement[3] = "Erik Karlsson";
                joueursAlignement[4] = "Marc Methot";
                joueursAlignement[5] = "Craig Anderson";
                break;
            case R.id.team21: IV.setImageResource(R.drawable.flyers);
                TV.setText(R.string.flyers);
                drawableId = getResources().getIdentifier("flyers", "drawable", getPackageName());
                équipe = getString(R.string.flyers);
                joueursAlignement[0] = "Wayne Simmonds";
                joueursAlignement[1] = "Claude Giroux";
                joueursAlignement[2] = "Jakub Voracek";
                joueursAlignement[3] = "Ivan Provorov";
                joueursAlignement[4] = "Shayne Gostisbehere";
                joueursAlignement[5] = "Steve Mason";
                break;
            case R.id.team22: IV.setImageResource(R.drawable.penguins);
                TV.setText(R.string.penguins);
                drawableId = getResources().getIdentifier("penguins", "drawable", getPackageName());
                équipe = getString(R.string.penguins);
                joueursAlignement[0] = "Patric Hornqvist";
                joueursAlignement[1] = "Sidney Crosby";
                joueursAlignement[2] = "Phil Kessel";
                joueursAlignement[3] = "Kristopher Letang";
                joueursAlignement[4] = "Olli Maatta";
                joueursAlignement[5] = "Marc-André Fleury";
                break;
            case R.id.team23: IV.setImageResource(R.drawable.sharks);
                TV.setText(R.string.sharks);
                drawableId = getResources().getIdentifier("sharks", "drawable", getPackageName());
                équipe = getString(R.string.sharks);
                joueursAlignement[0] = "Patrick Marleau";
                joueursAlignement[1] = "Joe Thornton";
                joueursAlignement[2] = "Joe Pavelski";
                joueursAlignement[3] = "Marc-Édouard Vlasic";
                joueursAlignement[4] = "Brent Burns";
                joueursAlignement[5] = "Martin Jones";
                break;
            case R.id.team24: IV.setImageResource(R.drawable.blues);
                TV.setText(R.string.blues);
                drawableId = getResources().getIdentifier("blues", "drawable", getPackageName());
                équipe = getString(R.string.blues);
                joueursAlignement[0] = "Alexander Steen";
                joueursAlignement[1] = "Paul Stastny";
                joueursAlignement[2] = "Vladimir Tarasenko";
                joueursAlignement[3] = "Jay Bouwmeester";
                joueursAlignement[4] = "Alex Pietrangelo";
                joueursAlignement[5] = "Jake Allen";
                break;
            case R.id.team25: IV.setImageResource(R.drawable.lightning);
                TV.setText(R.string.lightning);
                drawableId = getResources().getIdentifier("lightning", "drawable", getPackageName());
                équipe = getString(R.string.lightning);
                joueursAlignement[0] = "Jonathan Drouin";
                joueursAlignement[1] = "Steven Stamkos";
                joueursAlignement[2] = "Nikita Kucherov";
                joueursAlignement[3] = "Victor Hedman";
                joueursAlignement[4] = "Anton Stralman";
                joueursAlignement[5] = "Andrei Vasilevskiy";
                break;
            case R.id.team26: IV.setImageResource(R.drawable.maple_leafs);
                TV.setText(R.string.maple_leafs);
                drawableId = getResources().getIdentifier("maple_leafs", "drawable", getPackageName());
                équipe = getString(R.string.maple_leafs);
                joueursAlignement[0] = "James van Riemsdyk";
                joueursAlignement[1] = "Auston Matthews";
                joueursAlignement[2] = "Mitchell Marner";
                joueursAlignement[3] = "Morgan Rielly";
                joueursAlignement[4] = "Jake Gardiner";
                joueursAlignement[5] = "Frederik Andersen";
                break;
            case R.id.team27: IV.setImageResource(R.drawable.canucks);
                TV.setText(R.string.canucks);
                drawableId = getResources().getIdentifier("canucks", "drawable", getPackageName());
                équipe = getString(R.string.canucks);
                joueursAlignement[0] = "Daniel Sedin";
                joueursAlignement[1] = "Henrik Sedin";
                joueursAlignement[2] = "Nikolay Goldobin";
                joueursAlignement[3] = "Alexander Edler";
                joueursAlignement[4] = "Chris Tanev";
                joueursAlignement[5] = "Ryan Miller";
                break;
            case R.id.team28: IV.setImageResource(R.drawable.capitals);
                TV.setText(R.string.capitals);
                drawableId = getResources().getIdentifier("capitals", "drawable", getPackageName());
                équipe = getString(R.string.capitals);
                joueursAlignement[0] = "Alexander Ovechkin";
                joueursAlignement[1] = "Nicklas Backstrom";
                joueursAlignement[2] = "T.J. Oshie";
                joueursAlignement[3] = "Kevin Shattenkirk";
                joueursAlignement[4] = "John Carlson";
                joueursAlignement[5] = "Brayden Holtby";
                break;
            case R.id.team29: IV.setImageResource(R.drawable.jets);
                TV.setText(R.string.jets);
                drawableId = getResources().getIdentifier("jets", "drawable", getPackageName());
                équipe = getString(R.string.jets);
                joueursAlignement[0] = "Blake Wheeler";
                joueursAlignement[1] = "Mark Scheifele";
                joueursAlignement[2] = "Patrik Laine";
                joueursAlignement[3] = "Dustin Byfuglien";
                joueursAlignement[4] = "Jacob Trouba";
                joueursAlignement[5] = "Connor Hellebuyck";
                break;
        }

        TVFL1.setText(String.valueOf(joueursAlignement[0]));
        TVFL2.setText(String.valueOf(joueursAlignement[1]));
        TVFL3.setText(String.valueOf(joueursAlignement[2]));
        TVFL4.setText(String.valueOf(joueursAlignement[3]));
        TVFL5.setText(String.valueOf(joueursAlignement[4]));
        TVFL6.setText(String.valueOf(joueursAlignement[5]));
    }

    @Override
    protected void onResume(){
        super.onResume();
        TextView TVFiche = (TextView) findViewById(R.id.ficheEquipe);
        TextView TVPoints = (TextView) findViewById(R.id.TVPoints);
        TextView TVSaisonFinie = (TextView) findViewById(R.id.TVSaisonFinie);
        Button btnMatch = (Button) findViewById(R.id.btnMatch);
        Button btnSaison = (Button) findViewById(R.id.btnSaison);
        Button btnSauvegarder = (Button) findViewById(R.id.btnSauvegarder);

        if(matchsJoues < 82) {
            if (nouvelleFiche == true) {
                nbrVictoires = 0;
                nbrDefaites = 0;
                nbrDefaitesProl = 0;
                nbrPoints = 0;
                ficheEquipe = Integer.toString(nbrVictoires) + "-" + Integer.toString(nbrDefaites) + "-" + Integer.toString(nbrDefaitesProl);
                TVPoints.setText(String.valueOf(nbrPoints));
            } else {
                ficheEquipe = Integer.toString(nbrVictoires) + "-" + Integer.toString(nbrDefaites) + "-" + Integer.toString(nbrDefaitesProl);
                TVFiche.setText(String.valueOf(ficheEquipe));
                TVPoints.setText(String.valueOf(nbrPoints));
            }
        }
        else{
            if(nouvelleFiche == true){
                nbrVictoires = 0;
                nbrDefaites = 0;
                nbrDefaitesProl = 0;
                nbrPoints = 0;
            }
            ficheEquipe = Integer.toString(nbrVictoires) + "-" + Integer.toString(nbrDefaites) + "-" + Integer.toString(nbrDefaitesProl);
            TVFiche.setText(String.valueOf(ficheEquipe));
            TVPoints.setText(String.valueOf(nbrPoints));
            btnMatch.setEnabled(false);
            btnSaison.setEnabled(false);
            TVSaisonFinie.setVisibility(View.VISIBLE);
            btnSauvegarder.setVisibility(View.VISIBLE);
        }
        Log.i("DICJ.info", "Matchs joués : " + String.valueOf(matchsJoues));
        nouvelleFiche = false;
    }

    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this)
        .setMessage(menuEquipe.this.getString(R.string.confirmation))
        .setCancelable(false)
        .setPositiveButton(menuEquipe.this.getString(R.string.oui), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                nouvelleFiche = true;
                Intent intentRetourA2 = new Intent(menuEquipe.this, choixEquipe.class);
                startActivity(intentRetourA2);
            }
        })
                .setNegativeButton(menuEquipe.this.getString(R.string.non), null)
                .show();
    }

    public void boutonMatch (View button){
        Intent intentA3 = new Intent(menuEquipe.this, match.class);
        startActivity(intentA3);
    }

    public void btnRetourA2(View button){
        new AlertDialog.Builder(this)
                .setMessage(menuEquipe.this.getString(R.string.confirmation))
                .setCancelable(false)
                .setPositiveButton(menuEquipe.this.getString(R.string.oui), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        nouvelleFiche = true;
                        Intent intentRetourA2 = new Intent(menuEquipe.this, choixEquipe.class);
                        startActivity(intentRetourA2);
                    }
                })
                .setNegativeButton(menuEquipe.this.getString(R.string.non), null)
                .show();
    }

    public void btnSimulerSaison(View button){

        TextView TVFiche = (TextView) findViewById(R.id.ficheEquipe);
        TextView TVPoints = (TextView) findViewById(R.id.TVPoints);
        TextView TVSaisonFinie = (TextView) findViewById(R.id.TVSaisonFinie);
        Button btnMatch = (Button) findViewById(R.id.btnMatch);
        Button btnSaison = (Button) findViewById(R.id.btnSaison);
        Button btnSauvergarder = (Button) findViewById(R.id.btnSauvegarder);

        for(int i = 1; i <= (82 - matchsJoues); i++){
            int rndResultatMatch = rnd.nextInt(10);
            if(rndResultatMatch <= 4){
                nbrVictoires++;
                nbrPoints = nbrPoints + 2;
            }
            else if(rndResultatMatch <= 8){
                nbrDefaites++;
            }
            else{
                nbrDefaitesProl++;
                nbrPoints++;
            }
        }

        ficheEquipe = Integer.toString(nbrVictoires) + "-" + Integer.toString(nbrDefaites) + "-" + Integer.toString(nbrDefaitesProl);
        TVFiche.setText(String.valueOf(ficheEquipe));
        TVPoints.setText(String.valueOf(nbrPoints));
        btnMatch.setEnabled(false);
        btnSaison.setEnabled(false);
        TVSaisonFinie.setVisibility(View.VISIBLE);
        btnSauvergarder.setVisibility(View.VISIBLE);
    }

    public void btnAlignement(View button){
        FrameLayout FLA2 = (FrameLayout) findViewById(R.id.FLA2);
        FLA2.setVisibility(View.VISIBLE);
    }

    public void btnRetourFL(View button){
        FrameLayout FLA2 = (FrameLayout) findViewById(R.id.FLA2);
        FLA2.setVisibility(View.GONE);
    }

    public void sauvegarderSaison(View button){
        String nomFichier = "résultats_Saison";
        File fichierTexte = new File(getApplicationContext().getFilesDir(), nomFichier);
        FileOutputStream outputStream;

        try{
            outputStream = openFileOutput(nomFichier, Context.MODE_APPEND);
            String infos = équipe + " : " + nbrVictoires + "-" + nbrDefaites + "-" + nbrDefaitesProl + ". Points : " + nbrPoints + ".\n";
            outputStream.write((infos).getBytes());
            outputStream.close();
            Toast.makeText(getApplicationContext(), infos, Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), getString(R.string.sauvegardeRéussie), Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void afficherContenuFichier(View button){
        String nomFichier = "résultats_Saison";
        int ch;
        StringBuffer contenuFichier = new StringBuffer("");
        FileInputStream inputStream;

        try {
            inputStream = getApplicationContext().openFileInput(nomFichier);
            try {
                while ((ch = inputStream.read()) != -1)
                    contenuFichier.append((char) ch);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        String donnees = new String(contenuFichier);

        if(donnees.equals("")) {
            Toast.makeText(getApplicationContext(), getString(R.string.fichierVide), Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(), donnees, Toast.LENGTH_LONG).show();
        }
    }

    public void effacerContenuFichier(View button){
        String nomFichier = "résultats_Saison";
        FileOutputStream writer;

        try{
            writer = openFileOutput(nomFichier, Context.MODE_PRIVATE);
            writer.write(("").getBytes());
            writer.close();
            Toast.makeText(getApplicationContext(), getString(R.string.effacementRéussi), Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}