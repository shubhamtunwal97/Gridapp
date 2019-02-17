package markproj.markproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.github.mikephil.charting.charts.PieChart;

public class Activity66 extends AppCompatActivity {
    PieChart p361;PieChart p362;PieChart p363;PieChart p364;PieChart p365;PieChart p366;PieChart p367;PieChart p368;PieChart p369;PieChart p3610;PieChart p3611;PieChart p3612;PieChart p3613;PieChart p3614;PieChart p3615;PieChart p3616;PieChart p3617;PieChart p3618;PieChart p3619;PieChart p3620;PieChart p3621;PieChart p3622;PieChart p3623;PieChart p3624;PieChart p3625;PieChart p3626;PieChart p3627;PieChart p3628;PieChart p3629;PieChart p3630;PieChart p3631;PieChart p3632;PieChart p3633;PieChart p3634;PieChart p3635;PieChart p3636;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_66);
        inf();



        String mode=getIntent().getStringExtra("mode");
        int type=getIntent().getIntExtra("tp",4);
        boolean spin=false;

        if(mode.equals("rdg")){
            spin=false;
            PieMaker.makePie(p361,type,spin,this);

            PieMaker.makePie(p362,type,spin,this);

            PieMaker.makePie(p363,type,spin,this);

            PieMaker.makePie(p364,type,spin,this);

            PieMaker.makePie(p365,type,spin,this);

            PieMaker.makePie(p366,type,spin,this);

            PieMaker.makePie(p367,type,spin,this);

            PieMaker.makePie(p368,type,spin,this);

            PieMaker.makePie(p369,type,spin,this);

            PieMaker.makePie(p3610,type,spin,this);

            PieMaker.makePie(p3611,type,spin,this);

            PieMaker.makePie(p3612,type,spin,this);

            PieMaker.makePie(p3613,type,spin,this);

            PieMaker.makePie(p3614,type,spin,this);

            PieMaker.makePie(p3615,type,spin,this);

            PieMaker.makePie(p3616,type,spin,this);

            PieMaker.makePie(p3617,type,spin,this);

            PieMaker.makePie(p3618,type,spin,this);

            PieMaker.makePie(p3619,type,spin,this);

            PieMaker.makePie(p3620,type,spin,this);

            PieMaker.makePie(p3621,type,spin,this);

            PieMaker.makePie(p3622,type,spin,this);

            PieMaker.makePie(p3623,type,spin,this);

            PieMaker.makePie(p3624,type,spin,this);

            PieMaker.makePie(p3625,type,spin,this);

            PieMaker.makePie(p3626,type,spin,this);

            PieMaker.makePie(p3627,type,spin,this);

            PieMaker.makePie(p3628,type,spin,this);

            PieMaker.makePie(p3629,type,spin,this);

            PieMaker.makePie(p3630,type,spin,this);

            PieMaker.makePie(p3631,type,spin,this);

            PieMaker.makePie(p3632,type,spin,this);

            PieMaker.makePie(p3633,type,spin,this);

            PieMaker.makePie(p3634,type,spin,this);

            PieMaker.makePie(p3635,type,spin,this);

            PieMaker.makePie(p3636,type,spin,this);
            final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            findViewById(R.id.ll66).startAnimation(animation);

        }else if(mode.equals("rdc")) {
            spin=true;
            PieMaker.makePie(p361,type,spin,this);

            PieMaker.makePie(p362,type,spin,this);

            PieMaker.makePie(p363,type,spin,this);

            PieMaker.makePie(p364,type,spin,this);

            PieMaker.makePie(p365,type,spin,this);

            PieMaker.makePie(p366,type,spin,this);

            PieMaker.makePie(p367,type,spin,this);

            PieMaker.makePie(p368,type,spin,this);

            PieMaker.makePie(p369,type,spin,this);

            PieMaker.makePie(p3610,type,spin,this);

            PieMaker.makePie(p3611,type,spin,this);

            PieMaker.makePie(p3612,type,spin,this);

            PieMaker.makePie(p3613,type,spin,this);

            PieMaker.makePie(p3614,type,spin,this);

            PieMaker.makePie(p3615,type,spin,this);

            PieMaker.makePie(p3616,type,spin,this);

            PieMaker.makePie(p3617,type,spin,this);

            PieMaker.makePie(p3618,type,spin,this);

            PieMaker.makePie(p3619,type,spin,this);

            PieMaker.makePie(p3620,type,spin,this);

            PieMaker.makePie(p3621,type,spin,this);

            PieMaker.makePie(p3622,type,spin,this);

            PieMaker.makePie(p3623,type,spin,this);

            PieMaker.makePie(p3624,type,spin,this);

            PieMaker.makePie(p3625,type,spin,this);

            PieMaker.makePie(p3626,type,spin,this);

            PieMaker.makePie(p3627,type,spin,this);

            PieMaker.makePie(p3628,type,spin,this);

            PieMaker.makePie(p3629,type,spin,this);

            PieMaker.makePie(p3630,type,spin,this);

            PieMaker.makePie(p3631,type,spin,this);

            PieMaker.makePie(p3632,type,spin,this);

            PieMaker.makePie(p3633,type,spin,this);

            PieMaker.makePie(p3634,type,spin,this);

            PieMaker.makePie(p3635,type,spin,this);

            PieMaker.makePie(p3636,type,spin,this);


        }else if(mode.equals("std")){
            spin=false;
            PieMaker.makePie(p361,type,spin,this);

            PieMaker.makePie(p362,type,spin,this);

            PieMaker.makePie(p363,type,spin,this);

            PieMaker.makePie(p364,type,spin,this);

            PieMaker.makePie(p365,type,spin,this);

            PieMaker.makePie(p366,type,spin,this);

            PieMaker.makePie(p367,type,spin,this);

            PieMaker.makePie(p368,type,spin,this);

            PieMaker.makePie(p369,type,spin,this);

            PieMaker.makePie(p3610,type,spin,this);

            PieMaker.makePie(p3611,type,spin,this);

            PieMaker.makePie(p3612,type,spin,this);

            PieMaker.makePie(p3613,type,spin,this);

            PieMaker.makePie(p3614,type,spin,this);

            PieMaker.makePie(p3615,type,spin,this);

            PieMaker.makePie(p3616,type,spin,this);

            PieMaker.makePie(p3617,type,spin,this);

            PieMaker.makePie(p3618,type,spin,this);

            PieMaker.makePie(p3619,type,spin,this);

            PieMaker.makePie(p3620,type,spin,this);

            PieMaker.makePie(p3621,type,spin,this);

            PieMaker.makePie(p3622,type,spin,this);

            PieMaker.makePie(p3623,type,spin,this);

            PieMaker.makePie(p3624,type,spin,this);

            PieMaker.makePie(p3625,type,spin,this);

            PieMaker.makePie(p3626,type,spin,this);

            PieMaker.makePie(p3627,type,spin,this);

            PieMaker.makePie(p3628,type,spin,this);

            PieMaker.makePie(p3629,type,spin,this);

            PieMaker.makePie(p3630,type,spin,this);

            PieMaker.makePie(p3631,type,spin,this);

            PieMaker.makePie(p3632,type,spin,this);

            PieMaker.makePie(p3633,type,spin,this);

            PieMaker.makePie(p3634,type,spin,this);

            PieMaker.makePie(p3635,type,spin,this);

            PieMaker.makePie(p3636,type,spin,this);
        }




        p361.setExtraOffsets(-8f,-8f,-8f,-8f);
        p362.setExtraOffsets(-8f,-8f,-8f,-8f);
        p363.setExtraOffsets(-8f,-8f,-8f,-8f);
        p364.setExtraOffsets(-8f,-8f,-8f,-8f);
        p365.setExtraOffsets(-8f,-8f,-8f,-8f);
        p366.setExtraOffsets(-8f,-8f,-8f,-8f);
        p367.setExtraOffsets(-8f,-8f,-8f,-8f);
        p368.setExtraOffsets(-8f,-8f,-8f,-8f);
        p369.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3610.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3611.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3612.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3613.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3614.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3615.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3616.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3617.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3618.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3619.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3620.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3621.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3622.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3623.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3624.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3625.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3626.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3627.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3628.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3629.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3630.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3631.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3632.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3633.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3634.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3635.setExtraOffsets(-8f,-8f,-8f,-8f);
        p3636.setExtraOffsets(-8f,-8f,-8f,-8f);
    }

    public void inf(){
        p361=findViewById(R.id.pie61);
        p362=findViewById(R.id.pie62);
        p363=findViewById(R.id.pie63);
        p364=findViewById(R.id.pie64);
        p365=findViewById(R.id.pie65);
        p366=findViewById(R.id.pie66);
        p367=findViewById(R.id.pie67);
        p368=findViewById(R.id.pie68);
        p369=findViewById(R.id.pie69);
        p3610=findViewById(R.id.pie610);
        p3611=findViewById(R.id.pie611);
        p3612=findViewById(R.id.pie612);
        p3613=findViewById(R.id.pie613);
        p3614=findViewById(R.id.pie614);
        p3615=findViewById(R.id.pie615);
        p3616=findViewById(R.id.pie616);
        p3617=findViewById(R.id.pie617);
        p3618=findViewById(R.id.pie618);
        p3619=findViewById(R.id.pie619);
        p3620=findViewById(R.id.pie620);
        p3621=findViewById(R.id.pie621);
        p3622=findViewById(R.id.pie622);
        p3623=findViewById(R.id.pie623);
        p3624=findViewById(R.id.pie624);
        p3625=findViewById(R.id.pie625);
        p3626=findViewById(R.id.pie626);
        p3627=findViewById(R.id.pie627);
        p3628=findViewById(R.id.pie628);
        p3629=findViewById(R.id.pie629);
        p3630=findViewById(R.id.pie630);
        p3631=findViewById(R.id.pie631);
        p3632=findViewById(R.id.pie632);
        p3633=findViewById(R.id.pie633);
        p3634=findViewById(R.id.pie634);
        p3635=findViewById(R.id.pie635);
        p3636=findViewById(R.id.pie636);

    }
}
