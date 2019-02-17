package markproj.markproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.github.mikephil.charting.charts.PieChart;

public class Activity33 extends AppCompatActivity {

    PieChart p91;PieChart p92;PieChart p93;PieChart p94;PieChart p95;PieChart p96;PieChart p97;PieChart p98;PieChart p99;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_33);
        inf();




        String mode=getIntent().getStringExtra("mode");
        int type=getIntent().getIntExtra("tp",4);
        boolean spin=false;

        if(mode.equals("rdg")){
            spin=false;
            PieMaker.makePie(p91,type,spin,this);

            PieMaker.makePie(p92,type,spin,this);

            PieMaker.makePie(p93,type,spin,this);

            PieMaker.makePie(p94,type,spin,this);

            PieMaker.makePie(p95,type,spin,this);

            PieMaker.makePie(p96,type,spin,this);

            PieMaker.makePie(p97,type,spin,this);

            PieMaker.makePie(p98,type,spin,this);

            PieMaker.makePie(p99,type,spin,this);
            final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            findViewById(R.id.ll33).startAnimation(animation);

        }else if(mode.equals("rdc")) {
            spin=true;
            PieMaker.makePie(p91,type,spin,this);

            PieMaker.makePie(p92,type,spin,this);

            PieMaker.makePie(p93,type,spin,this);

            PieMaker.makePie(p94,type,spin,this);

            PieMaker.makePie(p95,type,spin,this);

            PieMaker.makePie(p96,type,spin,this);

            PieMaker.makePie(p97,type,spin,this);

            PieMaker.makePie(p98,type,spin,this);

            PieMaker.makePie(p99,type,spin,this);


        }else if(mode.equals("std")){
            spin=false;
            PieMaker.makePie(p91,type,spin,this);

            PieMaker.makePie(p92,type,spin,this);

            PieMaker.makePie(p93,type,spin,this);

            PieMaker.makePie(p94,type,spin,this);

            PieMaker.makePie(p95,type,spin,this);

            PieMaker.makePie(p96,type,spin,this);

            PieMaker.makePie(p97,type,spin,this);

            PieMaker.makePie(p98,type,spin,this);

            PieMaker.makePie(p99,type,spin,this);
        }



        p91.setExtraOffsets(-8f,-8f,-8f,-8f);
        p92.setExtraOffsets(-8f,-8f,-8f,-8f);
        p93.setExtraOffsets(-8f,-8f,-8f,-8f);
        p94.setExtraOffsets(-8f,-8f,-8f,-8f);
        p95.setExtraOffsets(-8f,-8f,-8f,-8f);
        p96.setExtraOffsets(-8f,-8f,-8f,-8f);
        p97.setExtraOffsets(-8f,-8f,-8f,-8f);
        p98.setExtraOffsets(-8f,-8f,-8f,-8f);
        p99.setExtraOffsets(-8f,-8f,-8f,-8f);
    }

    private void inf() {
        p91=findViewById(R.id.pie31);
        p92=findViewById(R.id.pie32);
        p93=findViewById(R.id.pie33);
        p94=findViewById(R.id.pie34);
        p95=findViewById(R.id.pie35);
        p96=findViewById(R.id.pie36);
        p97=findViewById(R.id.pie37);
        p98=findViewById(R.id.pie38);
        p99=findViewById(R.id.pie39);
    }
}
