package markproj.markproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.github.mikephil.charting.charts.PieChart;

public class Activity44 extends AppCompatActivity {

    PieChart p161;PieChart p162;PieChart p163;PieChart p164;PieChart p165;PieChart p166;PieChart p167;PieChart p168;PieChart p169;PieChart p1610;PieChart p1611;PieChart p1612;PieChart p1613;PieChart p1614;PieChart p1615;PieChart p1616;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_44);
        inf();



        String mode=getIntent().getStringExtra("mode");
        int type=getIntent().getIntExtra("tp",4);
        boolean spin=false;

        if(mode.equals("rdg")){
            spin=false;
            PieMaker.makePie(p161,type,spin,this);
            PieMaker.makePie(p162,type,spin,this);

            PieMaker.makePie(p163,type,spin,this);

            PieMaker.makePie(p164,type,spin,this);

            PieMaker.makePie(p165,type,spin,this);

            PieMaker.makePie(p166,type,spin,this);

            PieMaker.makePie(p167,type,spin,this);

            PieMaker.makePie(p168,type,spin,this);

            PieMaker.makePie(p169,type,spin,this);

            PieMaker.makePie(p1610,type,spin,this);

            PieMaker.makePie(p1611,type,spin,this);

            PieMaker.makePie(p1612,type,spin,this);

            PieMaker.makePie(p1613,type,spin,this);

            PieMaker.makePie(p1614,type,spin,this);

            PieMaker.makePie(p1615,type,spin,this);

            PieMaker.makePie(p1616,type,spin,this);
            final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            findViewById(R.id.ll44).startAnimation(animation);

        }else if(mode.equals("rdc")) {
            spin=true;
            PieMaker.makePie(p161,type,spin,this);
            PieMaker.makePie(p162,type,spin,this);

            PieMaker.makePie(p163,type,spin,this);

            PieMaker.makePie(p164,type,spin,this);

            PieMaker.makePie(p165,type,spin,this);

            PieMaker.makePie(p166,type,spin,this);

            PieMaker.makePie(p167,type,spin,this);

            PieMaker.makePie(p168,type,spin,this);

            PieMaker.makePie(p169,type,spin,this);

            PieMaker.makePie(p1610,type,spin,this);

            PieMaker.makePie(p1611,type,spin,this);

            PieMaker.makePie(p1612,type,spin,this);

            PieMaker.makePie(p1613,type,spin,this);

            PieMaker.makePie(p1614,type,spin,this);

            PieMaker.makePie(p1615,type,spin,this);

            PieMaker.makePie(p1616,type,spin,this);


        }else if(mode.equals("std")){
            spin=false;
            PieMaker.makePie(p161,type,spin,this);
            PieMaker.makePie(p162,type,spin,this);

            PieMaker.makePie(p163,type,spin,this);

            PieMaker.makePie(p164,type,spin,this);

            PieMaker.makePie(p165,type,spin,this);

            PieMaker.makePie(p166,type,spin,this);

            PieMaker.makePie(p167,type,spin,this);

            PieMaker.makePie(p168,type,spin,this);

            PieMaker.makePie(p169,type,spin,this);

            PieMaker.makePie(p1610,type,spin,this);

            PieMaker.makePie(p1611,type,spin,this);

            PieMaker.makePie(p1612,type,spin,this);

            PieMaker.makePie(p1613,type,spin,this);

            PieMaker.makePie(p1614,type,spin,this);

            PieMaker.makePie(p1615,type,spin,this);

            PieMaker.makePie(p1616,type,spin,this);
        }













        p161.setExtraOffsets(-8f,-8f,-8f,-8f);
        p162.setExtraOffsets(-8f,-8f,-8f,-8f);
        p163.setExtraOffsets(-8f,-8f,-8f,-8f);
        p164.setExtraOffsets(-8f,-8f,-8f,-8f);
        p165.setExtraOffsets(-8f,-8f,-8f,-8f);
        p166.setExtraOffsets(-8f,-8f,-8f,-8f);
        p167.setExtraOffsets(-8f,-8f,-8f,-8f);
        p168.setExtraOffsets(-8f,-8f,-8f,-8f);
        p169.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1610.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1611.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1612.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1613.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1614.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1615.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1616.setExtraOffsets(-8f,-8f,-8f,-8f);
    }

    private void inf() {

        p161=findViewById(R.id.pie41);
        p162=findViewById(R.id.pie42);
        p163=findViewById(R.id.pie43);
        p164=findViewById(R.id.pie44);
        p165=findViewById(R.id.pie45);
        p166=findViewById(R.id.pie46);
        p167=findViewById(R.id.pie47);
        p168=findViewById(R.id.pie48);
        p169=findViewById(R.id.pie49);
        p1610=findViewById(R.id.pie410);
        p1611=findViewById(R.id.pie411);
        p1612=findViewById(R.id.pie412);
        p1613=findViewById(R.id.pie413);
        p1614=findViewById(R.id.pie414);
        p1615=findViewById(R.id.pie415);
        p1616=findViewById(R.id.pie416);
    }
}
