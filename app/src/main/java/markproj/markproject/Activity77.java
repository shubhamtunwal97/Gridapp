package markproj.markproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.github.mikephil.charting.charts.PieChart;

public class Activity77 extends AppCompatActivity {
    PieChart p491;PieChart p492;PieChart p493;PieChart p494;PieChart p495;PieChart p496;PieChart p497;PieChart p498;PieChart p499;PieChart p4910;PieChart p4911;PieChart p4912;PieChart p4913;PieChart p4914;PieChart p4915;PieChart p4916;PieChart p4917;PieChart p4918;PieChart p4919;PieChart p4920;PieChart p4921;PieChart p4922;PieChart p4923;PieChart p4924;PieChart p4925;PieChart p4926;PieChart p4927;PieChart p4928;PieChart p4929;PieChart p4930;PieChart p4931;PieChart p4932;PieChart p4933;PieChart p4934;PieChart p4935;PieChart p4936;PieChart p4937;PieChart p4938;PieChart p4939;PieChart p4940;PieChart p4941;PieChart p4942;PieChart p4943;PieChart p4944;PieChart p4945;PieChart p4946;PieChart p4947;PieChart p4948;PieChart p4949;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_77);
        inflate();



        String mode=getIntent().getStringExtra("mode");
        int type=getIntent().getIntExtra("tp",4);
        boolean spin=false;

        if(mode.equals("rdg")){
            spin=false;
            PieMaker.makePie(p491,type,spin,this);

            PieMaker.makePie(p492,type,spin,this);

            PieMaker.makePie(p493,type,spin,this);

            PieMaker.makePie(p494,type,spin,this);

            PieMaker.makePie(p495,type,spin,this);

            PieMaker.makePie(p496,type,spin,this);

            PieMaker.makePie(p497,type,spin,this);

            PieMaker.makePie(p498,type,spin,this);

            PieMaker.makePie(p499,type,spin,this);

            PieMaker.makePie(p4910,type,spin,this);

            PieMaker.makePie(p4911,type,spin,this);

            PieMaker.makePie(p4912,type,spin,this);

            PieMaker.makePie(p4913,type,spin,this);

            PieMaker.makePie(p4914,type,spin,this);

            PieMaker.makePie(p4915,type,spin,this);

            PieMaker.makePie(p4916,type,spin,this);

            PieMaker.makePie(p4917,type,spin,this);

            PieMaker.makePie(p4918,type,spin,this);

            PieMaker.makePie(p4919,type,spin,this);

            PieMaker.makePie(p4920,type,spin,this);

            PieMaker.makePie(p4921,type,spin,this);

            PieMaker.makePie(p4922,type,spin,this);

            PieMaker.makePie(p4923,type,spin,this);

            PieMaker.makePie(p4924,type,spin,this);

            PieMaker.makePie(p4925,type,spin,this);

            PieMaker.makePie(p4926,type,spin,this);

            PieMaker.makePie(p4927,type,spin,this);

            PieMaker.makePie(p4928,type,spin,this);

            PieMaker.makePie(p4929,type,spin,this);

            PieMaker.makePie(p4930,type,spin,this);

            PieMaker.makePie(p4931,type,spin,this);

            PieMaker.makePie(p4932,type,spin,this);

            PieMaker.makePie(p4933,type,spin,this);

            PieMaker.makePie(p4934,type,spin,this);

            PieMaker.makePie(p4935,type,spin,this);

            PieMaker.makePie(p4936,type,spin,this);

            PieMaker.makePie(p4937,type,spin,this);

            PieMaker.makePie(p4938,type,spin,this);

            PieMaker.makePie(p4939,type,spin,this);

            PieMaker.makePie(p4940,type,spin,this);

            PieMaker.makePie(p4941,type,spin,this);

            PieMaker.makePie(p4942,type,spin,this);

            PieMaker.makePie(p4943,type,spin,this);

            PieMaker.makePie(p4944,type,spin,this);

            PieMaker.makePie(p4945,type,spin,this);

            PieMaker.makePie(p4946,type,spin,this);

            PieMaker.makePie(p4947,type,spin,this);

            PieMaker.makePie(p4948,type,spin,this);

            PieMaker.makePie(p4949,type,spin,this);
            final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            findViewById(R.id.ll77).startAnimation(animation);

        }else if(mode.equals("rdc")) {
            spin=true;
            PieMaker.makePie(p491,type,spin,this);

            PieMaker.makePie(p492,type,spin,this);

            PieMaker.makePie(p493,type,spin,this);

            PieMaker.makePie(p494,type,spin,this);

            PieMaker.makePie(p495,type,spin,this);

            PieMaker.makePie(p496,type,spin,this);

            PieMaker.makePie(p497,type,spin,this);

            PieMaker.makePie(p498,type,spin,this);

            PieMaker.makePie(p499,type,spin,this);

            PieMaker.makePie(p4910,type,spin,this);

            PieMaker.makePie(p4911,type,spin,this);

            PieMaker.makePie(p4912,type,spin,this);

            PieMaker.makePie(p4913,type,spin,this);

            PieMaker.makePie(p4914,type,spin,this);

            PieMaker.makePie(p4915,type,spin,this);

            PieMaker.makePie(p4916,type,spin,this);

            PieMaker.makePie(p4917,type,spin,this);

            PieMaker.makePie(p4918,type,spin,this);

            PieMaker.makePie(p4919,type,spin,this);

            PieMaker.makePie(p4920,type,spin,this);

            PieMaker.makePie(p4921,type,spin,this);

            PieMaker.makePie(p4922,type,spin,this);

            PieMaker.makePie(p4923,type,spin,this);

            PieMaker.makePie(p4924,type,spin,this);

            PieMaker.makePie(p4925,type,spin,this);

            PieMaker.makePie(p4926,type,spin,this);

            PieMaker.makePie(p4927,type,spin,this);

            PieMaker.makePie(p4928,type,spin,this);

            PieMaker.makePie(p4929,type,spin,this);

            PieMaker.makePie(p4930,type,spin,this);

            PieMaker.makePie(p4931,type,spin,this);

            PieMaker.makePie(p4932,type,spin,this);

            PieMaker.makePie(p4933,type,spin,this);

            PieMaker.makePie(p4934,type,spin,this);

            PieMaker.makePie(p4935,type,spin,this);

            PieMaker.makePie(p4936,type,spin,this);

            PieMaker.makePie(p4937,type,spin,this);

            PieMaker.makePie(p4938,type,spin,this);

            PieMaker.makePie(p4939,type,spin,this);

            PieMaker.makePie(p4940,type,spin,this);

            PieMaker.makePie(p4941,type,spin,this);

            PieMaker.makePie(p4942,type,spin,this);

            PieMaker.makePie(p4943,type,spin,this);

            PieMaker.makePie(p4944,type,spin,this);

            PieMaker.makePie(p4945,type,spin,this);

            PieMaker.makePie(p4946,type,spin,this);

            PieMaker.makePie(p4947,type,spin,this);

            PieMaker.makePie(p4948,type,spin,this);

            PieMaker.makePie(p4949,type,spin,this);


        }else if(mode.equals("std")){
            spin=false;
            PieMaker.makePie(p491,type,spin,this);

            PieMaker.makePie(p492,type,spin,this);

            PieMaker.makePie(p493,type,spin,this);

            PieMaker.makePie(p494,type,spin,this);

            PieMaker.makePie(p495,type,spin,this);

            PieMaker.makePie(p496,type,spin,this);

            PieMaker.makePie(p497,type,spin,this);

            PieMaker.makePie(p498,type,spin,this);

            PieMaker.makePie(p499,type,spin,this);

            PieMaker.makePie(p4910,type,spin,this);

            PieMaker.makePie(p4911,type,spin,this);

            PieMaker.makePie(p4912,type,spin,this);

            PieMaker.makePie(p4913,type,spin,this);

            PieMaker.makePie(p4914,type,spin,this);

            PieMaker.makePie(p4915,type,spin,this);

            PieMaker.makePie(p4916,type,spin,this);

            PieMaker.makePie(p4917,type,spin,this);

            PieMaker.makePie(p4918,type,spin,this);

            PieMaker.makePie(p4919,type,spin,this);

            PieMaker.makePie(p4920,type,spin,this);

            PieMaker.makePie(p4921,type,spin,this);

            PieMaker.makePie(p4922,type,spin,this);

            PieMaker.makePie(p4923,type,spin,this);

            PieMaker.makePie(p4924,type,spin,this);

            PieMaker.makePie(p4925,type,spin,this);

            PieMaker.makePie(p4926,type,spin,this);

            PieMaker.makePie(p4927,type,spin,this);

            PieMaker.makePie(p4928,type,spin,this);

            PieMaker.makePie(p4929,type,spin,this);

            PieMaker.makePie(p4930,type,spin,this);

            PieMaker.makePie(p4931,type,spin,this);

            PieMaker.makePie(p4932,type,spin,this);

            PieMaker.makePie(p4933,type,spin,this);

            PieMaker.makePie(p4934,type,spin,this);

            PieMaker.makePie(p4935,type,spin,this);

            PieMaker.makePie(p4936,type,spin,this);

            PieMaker.makePie(p4937,type,spin,this);

            PieMaker.makePie(p4938,type,spin,this);

            PieMaker.makePie(p4939,type,spin,this);

            PieMaker.makePie(p4940,type,spin,this);

            PieMaker.makePie(p4941,type,spin,this);

            PieMaker.makePie(p4942,type,spin,this);

            PieMaker.makePie(p4943,type,spin,this);

            PieMaker.makePie(p4944,type,spin,this);

            PieMaker.makePie(p4945,type,spin,this);

            PieMaker.makePie(p4946,type,spin,this);

            PieMaker.makePie(p4947,type,spin,this);

            PieMaker.makePie(p4948,type,spin,this);

            PieMaker.makePie(p4949,type,spin,this);
        }


        p491.setExtraOffsets(-8f,-8f,-8f,-8f);
        p492.setExtraOffsets(-8f,-8f,-8f,-8f);
        p493.setExtraOffsets(-8f,-8f,-8f,-8f);
        p494.setExtraOffsets(-8f,-8f,-8f,-8f);
        p495.setExtraOffsets(-8f,-8f,-8f,-8f);
        p496.setExtraOffsets(-8f,-8f,-8f,-8f);
        p497.setExtraOffsets(-8f,-8f,-8f,-8f);
        p498.setExtraOffsets(-8f,-8f,-8f,-8f);
        p499.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4910.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4911.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4912.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4913.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4914.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4915.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4916.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4917.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4918.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4919.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4920.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4921.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4922.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4923.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4924.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4925.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4926.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4927.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4928.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4929.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4930.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4931.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4932.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4933.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4934.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4935.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4936.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4937.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4938.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4939.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4940.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4941.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4942.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4943.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4944.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4945.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4946.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4947.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4948.setExtraOffsets(-8f,-8f,-8f,-8f);
        p4949.setExtraOffsets(-8f,-8f,-8f,-8f);



    }


    public void inflate(){
        p491=findViewById(R.id.pie71);
        p492=findViewById(R.id.pie72);
        p493=findViewById(R.id.pie73);
        p494=findViewById(R.id.pie74);
        p495=findViewById(R.id.pie75);
        p496=findViewById(R.id.pie76);
        p497=findViewById(R.id.pie77);
        p498=findViewById(R.id.pie78);
        p499=findViewById(R.id.pie79);
        p4910=findViewById(R.id.pie710);
        p4911=findViewById(R.id.pie711);
        p4912=findViewById(R.id.pie712);
        p4913=findViewById(R.id.pie713);
        p4914=findViewById(R.id.pie714);
        p4915=findViewById(R.id.pie715);
        p4916=findViewById(R.id.pie716);
        p4917=findViewById(R.id.pie717);
        p4918=findViewById(R.id.pie718);
        p4919=findViewById(R.id.pie719);
        p4920=findViewById(R.id.pie720);
        p4921=findViewById(R.id.pie721);
        p4922=findViewById(R.id.pie722);
        p4923=findViewById(R.id.pie723);
        p4924=findViewById(R.id.pie724);
        p4925=findViewById(R.id.pie725);
        p4926=findViewById(R.id.pie726);
        p4927=findViewById(R.id.pie727);
        p4928=findViewById(R.id.pie728);
        p4929=findViewById(R.id.pie729);
        p4930=findViewById(R.id.pie730);
        p4931=findViewById(R.id.pie731);
        p4932=findViewById(R.id.pie732);
        p4933=findViewById(R.id.pie733);
        p4934=findViewById(R.id.pie734);
        p4935=findViewById(R.id.pie735);
        p4936=findViewById(R.id.pie736);
        p4937=findViewById(R.id.pie737);
        p4938=findViewById(R.id.pie738);
        p4939=findViewById(R.id.pie739);
        p4940=findViewById(R.id.pie740);
        p4941=findViewById(R.id.pie741);
        p4942=findViewById(R.id.pie742);
        p4943=findViewById(R.id.pie743);
        p4944=findViewById(R.id.pie744);
        p4945=findViewById(R.id.pie745);
        p4946=findViewById(R.id.pie746);
        p4947=findViewById(R.id.pie747);
        p4948=findViewById(R.id.pie748);
        p4949=findViewById(R.id.pie749);
    }
}
