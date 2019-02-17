package markproj.markproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.github.mikephil.charting.charts.PieChart;

public class Activity55 extends AppCompatActivity {
    PieChart p251;PieChart p252;PieChart p253;PieChart p254;PieChart p255;PieChart p256;PieChart p257;PieChart p258;PieChart p259;PieChart p2510;PieChart p2511;PieChart p2512;PieChart p2513;PieChart p2514;PieChart p2515;PieChart p2516;PieChart p2517;PieChart p2518;PieChart p2519;PieChart p2520;PieChart p2521;PieChart p2522;PieChart p2523;PieChart p2524;PieChart p2525;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_55);
        inf();


        String mode=getIntent().getStringExtra("mode");
        int type=getIntent().getIntExtra("tp",4);
        boolean spin=false;


        if(mode.equals("rdg")){
            spin=false;
            PieMaker.makePie(p251,type,spin,this);

            PieMaker.makePie(p252,type,spin,this);

            PieMaker.makePie(p253,type,spin,this);

            PieMaker.makePie(p254,type,spin,this);

            PieMaker.makePie(p255,type,spin,this);

            PieMaker.makePie(p256,type,spin,this);

            PieMaker.makePie(p257,type,spin,this);

            PieMaker.makePie(p258,type,spin,this);

            PieMaker.makePie(p259,type,spin,this);

            PieMaker.makePie(p2510,type,spin,this);

            PieMaker.makePie(p2511,type,spin,this);

            PieMaker.makePie(p2512,type,spin,this);

            PieMaker.makePie(p2513,type,spin,this);

            PieMaker.makePie(p2514,type,spin,this);

            PieMaker.makePie(p2515,type,spin,this);

            PieMaker.makePie(p2516,type,spin,this);

            PieMaker.makePie(p2517,type,spin,this);

            PieMaker.makePie(p2518,type,spin,this);

            PieMaker.makePie(p2519,type,spin,this);

            PieMaker.makePie(p2520,type,spin,this);

            PieMaker.makePie(p2521,type,spin,this);

            PieMaker.makePie(p2522,type,spin,this);

            PieMaker.makePie(p2523,type,spin,this);

            PieMaker.makePie(p2524,type,spin,this);

            PieMaker.makePie(p2525,type,spin,this);
            final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            findViewById(R.id.ll55).startAnimation(animation);

        }else if(mode.equals("rdc")) {
            spin=true;
            PieMaker.makePie(p251,type,spin,this);

            PieMaker.makePie(p252,type,spin,this);

            PieMaker.makePie(p253,type,spin,this);

            PieMaker.makePie(p254,type,spin,this);

            PieMaker.makePie(p255,type,spin,this);

            PieMaker.makePie(p256,type,spin,this);

            PieMaker.makePie(p257,type,spin,this);

            PieMaker.makePie(p258,type,spin,this);

            PieMaker.makePie(p259,type,spin,this);

            PieMaker.makePie(p2510,type,spin,this);

            PieMaker.makePie(p2511,type,spin,this);

            PieMaker.makePie(p2512,type,spin,this);

            PieMaker.makePie(p2513,type,spin,this);

            PieMaker.makePie(p2514,type,spin,this);

            PieMaker.makePie(p2515,type,spin,this);

            PieMaker.makePie(p2516,type,spin,this);

            PieMaker.makePie(p2517,type,spin,this);

            PieMaker.makePie(p2518,type,spin,this);

            PieMaker.makePie(p2519,type,spin,this);

            PieMaker.makePie(p2520,type,spin,this);

            PieMaker.makePie(p2521,type,spin,this);

            PieMaker.makePie(p2522,type,spin,this);

            PieMaker.makePie(p2523,type,spin,this);

            PieMaker.makePie(p2524,type,spin,this);

            PieMaker.makePie(p2525,type,spin,this);


        }else if(mode.equals("std")){
            spin=false;
            PieMaker.makePie(p251,type,spin,this);

            PieMaker.makePie(p252,type,spin,this);

            PieMaker.makePie(p253,type,spin,this);

            PieMaker.makePie(p254,type,spin,this);

            PieMaker.makePie(p255,type,spin,this);

            PieMaker.makePie(p256,type,spin,this);

            PieMaker.makePie(p257,type,spin,this);

            PieMaker.makePie(p258,type,spin,this);

            PieMaker.makePie(p259,type,spin,this);

            PieMaker.makePie(p2510,type,spin,this);

            PieMaker.makePie(p2511,type,spin,this);

            PieMaker.makePie(p2512,type,spin,this);

            PieMaker.makePie(p2513,type,spin,this);

            PieMaker.makePie(p2514,type,spin,this);

            PieMaker.makePie(p2515,type,spin,this);

            PieMaker.makePie(p2516,type,spin,this);

            PieMaker.makePie(p2517,type,spin,this);

            PieMaker.makePie(p2518,type,spin,this);

            PieMaker.makePie(p2519,type,spin,this);

            PieMaker.makePie(p2520,type,spin,this);

            PieMaker.makePie(p2521,type,spin,this);

            PieMaker.makePie(p2522,type,spin,this);

            PieMaker.makePie(p2523,type,spin,this);

            PieMaker.makePie(p2524,type,spin,this);

            PieMaker.makePie(p2525,type,spin,this);
        }








        p251.setExtraOffsets(-8f,-8f,-8f,-8f);
        p252.setExtraOffsets(-8f,-8f,-8f,-8f);
        p253.setExtraOffsets(-8f,-8f,-8f,-8f);
        p254.setExtraOffsets(-8f,-8f,-8f,-8f);
        p255.setExtraOffsets(-8f,-8f,-8f,-8f);
        p256.setExtraOffsets(-8f,-8f,-8f,-8f);
        p257.setExtraOffsets(-8f,-8f,-8f,-8f);
        p258.setExtraOffsets(-8f,-8f,-8f,-8f);
        p259.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2510.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2511.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2512.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2513.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2514.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2515.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2516.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2517.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2518.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2519.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2520.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2521.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2522.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2523.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2524.setExtraOffsets(-8f,-8f,-8f,-8f);
        p2525.setExtraOffsets(-8f,-8f,-8f,-8f);


    }

    private void inf() {
        p251=findViewById(R.id.pie51);
        p252=findViewById(R.id.pie52);
        p253=findViewById(R.id.pie53);
        p254=findViewById(R.id.pie54);
        p255=findViewById(R.id.pie55);
        p256=findViewById(R.id.pie56);
        p257=findViewById(R.id.pie57);
        p258=findViewById(R.id.pie58);
        p259=findViewById(R.id.pie59);
        p2510=findViewById(R.id.pie510);
        p2511=findViewById(R.id.pie511);
        p2512=findViewById(R.id.pie512);
        p2513=findViewById(R.id.pie513);
        p2514=findViewById(R.id.pie514);
        p2515=findViewById(R.id.pie515);
        p2516=findViewById(R.id.pie516);
        p2517=findViewById(R.id.pie517);
        p2518=findViewById(R.id.pie518);
        p2519=findViewById(R.id.pie519);
        p2520=findViewById(R.id.pie520);
        p2521=findViewById(R.id.pie521);
        p2522=findViewById(R.id.pie522);
        p2523=findViewById(R.id.pie523);
        p2524=findViewById(R.id.pie524);
        p2525=findViewById(R.id.pie525);
    }
}
