package dicj.info.simulationhockey;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class match extends AppCompatActivity {

    public int scoreExterieur, scoreDomicile;
    Random rnd;
    int rndDomicile, rndDefaiteProl;
    TextView TVA3;
    ImageView IVExterieur;
    ImageView IVDomicile;
    Button btnSimuler;
    String texteTVA3 = "          " + Integer.toString(scoreExterieur) + "               -               " + Integer.toString(scoreDomicile) + "              ";

    @Override
    protected void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_match);
        setTitle(R.string.matchActuel);
        menuEquipe.matchsJoues++;
        rnd = new Random();
        TVA3 = (TextView) findViewById(R.id.TVA3);
        IVExterieur = (ImageView) findViewById(R.id.IVVisiteurs);
        IVDomicile = (ImageView) findViewById(R.id.IVDomicile);
        btnSimuler = (Button) findViewById(R.id.btnSimuler);
        btnSimuler.setEnabled(true);
        int idExterieur, idDomicile;
        Drawable.ConstantState imgExterieur, imgDomicile;
        scoreExterieur = 0;
        scoreDomicile = 0;
        TVA3.setText(texteTVA3);
        rndDomicile = rnd.nextInt(2);
        if(rndDomicile == 0){
            IVExterieur.setImageResource(menuEquipe.drawableId);
        }
        else{
            IVDomicile.setImageResource(menuEquipe.drawableId);
        }

        do{
            int rndAdversaire = rnd.nextInt(30);

            switch(rndAdversaire) {
                case 0:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.ducks);
                }else {
                    IVExterieur.setImageResource(R.drawable.ducks);
                }
                    break;
                case 1:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.coyotes);
                }else {
                    IVExterieur.setImageResource(R.drawable.coyotes);
                }
                    break;
                case 2:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.bruins);
                }else {
                    IVExterieur.setImageResource(R.drawable.bruins);
                }
                    break;
                case 3:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.sabres);
                }else {
                    IVExterieur.setImageResource(R.drawable.sabres);
                }
                    break;
                case 4:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.flames);
                }else {
                    IVExterieur.setImageResource(R.drawable.flames);
                }
                    break;
                case 5:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.hurricanes);
                }else {
                    IVExterieur.setImageResource(R.drawable.hurricanes);
                }
                    break;
                case 6:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.blackhawks);
                }else {
                    IVExterieur.setImageResource(R.drawable.blackhawks);
                }
                    break;
                case 7:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.avalanche);
                }else {
                    IVExterieur.setImageResource(R.drawable.avalanche);
                }
                    break;
                case 8:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.blue_jackets);
                }else {
                    IVExterieur.setImageResource(R.drawable.blue_jackets);
                }
                    break;
                case 9:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.stars);
                }else {
                    IVExterieur.setImageResource(R.drawable.stars);
                }
                    break;
                case 10:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.red_wings);
                }else {
                    IVExterieur.setImageResource(R.drawable.red_wings);
                }
                    break;
                case 11:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.oilers);
                }else {
                    IVExterieur.setImageResource(R.drawable.oilers);
                }
                    break;
                case 12:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.panthers);
                }else {
                    IVExterieur.setImageResource(R.drawable.panthers);
                }
                    break;
                case 13:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.kings);
                }else {
                    IVExterieur.setImageResource(R.drawable.kings);
                }
                    break;
                case 14:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.wild);
                }else {
                    IVExterieur.setImageResource(R.drawable.wild);
                }
                    break;
                case 15:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.canadiens);
                }else {
                    IVExterieur.setImageResource(R.drawable.canadiens);
                }
                    break;
                case 16:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.predators);
                }else {
                    IVExterieur.setImageResource(R.drawable.predators);
                }
                    break;
                case 17:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.devils);
                }else {
                    IVExterieur.setImageResource(R.drawable.devils);
                }
                    break;
                case 18:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.islanders);
                }else {
                    IVExterieur.setImageResource(R.drawable.islanders);
                }
                    break;
                case 19:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.rangers);
                }else {
                    IVExterieur.setImageResource(R.drawable.rangers);
                }
                    break;
                case 20:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.senators);
                }else {
                    IVExterieur.setImageResource(R.drawable.senators);
                }
                    break;
                case 21:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.flyers);
                }else {
                    IVExterieur.setImageResource(R.drawable.flyers);
                }
                    break;
                case 22:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.penguins);
                }else {
                    IVExterieur.setImageResource(R.drawable.penguins);
                }
                    break;
                case 23:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.sharks);
                }else {
                    IVExterieur.setImageResource(R.drawable.sharks);
                }
                    break;
                case 24:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.blues);
                }else {
                    IVExterieur.setImageResource(R.drawable.blues);
                }
                    break;
                case 25:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.lightning);
                }else {
                    IVExterieur.setImageResource(R.drawable.lightning);
                }
                    break;
                case 26:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.maple_leafs);
                }else {
                    IVExterieur.setImageResource(R.drawable.maple_leafs);
                }
                    break;
                case 27:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.canucks);
                }else {
                    IVExterieur.setImageResource(R.drawable.canucks);
                }
                    break;
                case 28:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.capitals);
                }else {
                    IVExterieur.setImageResource(R.drawable.capitals);
                }
                    break;
                case 29:if(rndDomicile == 0) {
                    IVDomicile.setImageResource(R.drawable.jets);
                }else {
                    IVExterieur.setImageResource(R.drawable.jets);
                }
                    break;
            }

            imgExterieur = IVExterieur.getDrawable().getConstantState();
            imgDomicile = IVDomicile.getDrawable().getConstantState();

            if(imgExterieur == imgDomicile) {
                Toast.makeText(getApplicationContext(), "Reroll effectué!", Toast.LENGTH_LONG).show();
                Log.i("DICJ.info", "Reroll effectué!");
            }
            else{
                Log.i("DICJ.info", "Les équipes sont différentes. Reroll non nécessaire.");
            }

        }while(imgExterieur == imgDomicile);
    }

    public void btnRetourA3(View button){
        if((scoreExterieur == 0) && (scoreDomicile == 0)){
            Log.i("DICJ.info", "Le match n'est pas encore fini.");
            Toast.makeText(getApplicationContext(), "Simulez d'abord le match!", Toast.LENGTH_LONG).show();
        }
        else{
            Intent intentA3 = new Intent(match.this,menuEquipe.class );
            startActivity(intentA3);
        }
    }

    public void btnSimulation (View button) {
        TextView TVA3 = (TextView) findViewById(R.id.TVA3);
        TextView TVResultatMatch = (TextView) findViewById(R.id.TVResultatMatch);

        do {
            scoreExterieur = attributionScore();
            scoreDomicile = attributionScore();
        } while (scoreExterieur == scoreDomicile);

        texteTVA3 = "          " + Integer.toString(scoreExterieur) + "               -               " + Integer.toString(scoreDomicile) + "              ";
        TVA3.setText(texteTVA3);
        button.setEnabled(false);

        if(rndDomicile == 0){
            if(scoreDomicile - scoreExterieur == 1){
                rndDefaiteProl = rnd.nextInt(2);

                if(rndDefaiteProl == 1){
                    menuEquipe.nbrDefaitesProl++;
                    menuEquipe.nbrPoints = menuEquipe.nbrPoints + 1;
                    Log.i("DICJ.info", "Défaite en prolongation.");
                    TVResultatMatch.setText(getResources().getString(R.string.défaiteProl));
                }
                else{
                    menuEquipe.nbrDefaites++;
                    Log.i("DICJ.info", "Défaite en temps réglementaire.");
                    TVResultatMatch.setText(getResources().getString(R.string.défaite));
                }
            }
            else{
                if(scoreExterieur > scoreDomicile){
                    menuEquipe.nbrVictoires++;
                    menuEquipe.nbrPoints = menuEquipe.nbrPoints + 2;
                    Log.i("DICJ.info", "Victoire!");
                    TVResultatMatch.setText(getResources().getString(R.string.victoire));
                }
                else{
                    menuEquipe.nbrDefaites++;
                    Log.i("DICJ.info", "Défaite en temps réglementaire.");
                    TVResultatMatch.setText(getResources().getString(R.string.défaite));
                }
            }
        }
        else {
            if (scoreExterieur - scoreDomicile == 1) {
                rndDefaiteProl = rnd.nextInt(2);

                if (rndDefaiteProl == 1) {
                    menuEquipe.nbrDefaitesProl++;
                    menuEquipe.nbrPoints = menuEquipe.nbrPoints + 1;
                    Log.i("DICJ.info", "Défaite en prolongation.");
                    TVResultatMatch.setText(getResources().getString(R.string.défaiteProl));
                }
                else{
                    menuEquipe.nbrDefaites++;
                    Log.i("DICJ.info", "Défaite en temps réglementaire.");
                    TVResultatMatch.setText(getResources().getString(R.string.défaite));
                }
            }
            else{
                if(scoreDomicile > scoreExterieur){
                    menuEquipe.nbrVictoires++;
                    menuEquipe.nbrPoints = menuEquipe.nbrPoints + 2;
                    Log.i("DICJ.info", "Victoire!");
                    TVResultatMatch.setText(getResources().getString(R.string.victoire));
                }
                else{
                    menuEquipe.nbrDefaites++;
                    Log.i("DICJ.info", "Défaite en temps réglementaire.");
                    TVResultatMatch.setText(getResources().getString(R.string.défaite));
                }
            }
        }
    }

    private int genererScore(int nombre){
        int resultat = rnd.nextInt(nombre + 1);
        return resultat;
    }

    public int attributionScore(){
        int score;
        int typeScore = genererScore(10);

        if (typeScore < 10) {
            score = genererScore(6);
        }
        else{
            typeScore = genererScore(20);

            if(typeScore < 12){
                score = 7;
            }
            else if(typeScore < 15){
                score = 8;
            }
            else if(typeScore < 18){
                score = 9;
            }
            else if(typeScore < 20){
                score = 10;
            }
            else{
                score = 11;
            }
        }
        return score;
    }
}


