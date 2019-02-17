package markproj.markproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.github.mikephil.charting.charts.PieChart;

public class Activity88 extends AppCompatActivity {
    PieChart p641;PieChart p642;PieChart p643;PieChart p644;PieChart p645;PieChart p646;PieChart p647;PieChart p648;PieChart p649;PieChart p6410;PieChart p6411;PieChart p6412;PieChart p6413;PieChart p6414;PieChart p6415;PieChart p6416;PieChart p6417;PieChart p6418;PieChart p6419;PieChart p6420;PieChart p6421;PieChart p6422;PieChart p6423;PieChart p6424;PieChart p6425;PieChart p6426;PieChart p6427;PieChart p6428;PieChart p6429;PieChart p6430;PieChart p6431;PieChart p6432;PieChart p6433;PieChart p6434;PieChart p6435;PieChart p6436;PieChart p6437;PieChart p6438;PieChart p6439;PieChart p6440;PieChart p6441;PieChart p6442;PieChart p6443;PieChart p6444;PieChart p6445;PieChart p6446;PieChart p6447;PieChart p6448;PieChart p6449;PieChart p6450;PieChart p6451;PieChart p6452;PieChart p6453;PieChart p6454;PieChart p6455;PieChart p6456;PieChart p6457;PieChart p6458;PieChart p6459;PieChart p6460;PieChart p6461;PieChart p6462;PieChart p6463;PieChart p6464;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_88);
        inflateViews();



        String mode=getIntent().getStringExtra("mode");
        int type=getIntent().getIntExtra("tp",4);
        boolean spin=false;

        if(mode.equals("rdg")){
            spin=false;
            PieMaker.makePie(p641,type,spin,this);

            PieMaker.makePie(p642,type,spin,this);

            PieMaker.makePie(p643,type,spin,this);

            PieMaker.makePie(p644,type,spin,this);

            PieMaker.makePie(p645,type,spin,this);

            PieMaker.makePie(p646,type,spin,this);

            PieMaker.makePie(p647,type,spin,this);

            PieMaker.makePie(p648,type,spin,this);

            PieMaker.makePie(p649,type,spin,this);

            PieMaker.makePie(p6410,type,spin,this);

            PieMaker.makePie(p6411,type,spin,this);

            PieMaker.makePie(p6412,type,spin,this);

            PieMaker.makePie(p6413,type,spin,this);

            PieMaker.makePie(p6414,type,spin,this);

            PieMaker.makePie(p6415,type,spin,this);

            PieMaker.makePie(p6416,type,spin,this);

            PieMaker.makePie(p6417,type,spin,this);

            PieMaker.makePie(p6418,type,spin,this);

            PieMaker.makePie(p6419,type,spin,this);

            PieMaker.makePie(p6420,type,spin,this);

            PieMaker.makePie(p6421,type,spin,this);

            PieMaker.makePie(p6422,type,spin,this);

            PieMaker.makePie(p6423,type,spin,this);

            PieMaker.makePie(p6424,type,spin,this);

            PieMaker.makePie(p6425,type,spin,this);

            PieMaker.makePie(p6426,type,spin,this);

            PieMaker.makePie(p6427,type,spin,this);

            PieMaker.makePie(p6428,type,spin,this);

            PieMaker.makePie(p6429,type,spin,this);

            PieMaker.makePie(p6430,type,spin,this);

            PieMaker.makePie(p6431,type,spin,this);

            PieMaker.makePie(p6432,type,spin,this);

            PieMaker.makePie(p6433,type,spin,this);

            PieMaker.makePie(p6434,type,spin,this);

            PieMaker.makePie(p6435,type,spin,this);

            PieMaker.makePie(p6436,type,spin,this);

            PieMaker.makePie(p6437,type,spin,this);

            PieMaker.makePie(p6438,type,spin,this);

            PieMaker.makePie(p6439,type,spin,this);

            PieMaker.makePie(p6440,type,spin,this);

            PieMaker.makePie(p6441,type,spin,this);

            PieMaker.makePie(p6442,type,spin,this);

            PieMaker.makePie(p6443,type,spin,this);

            PieMaker.makePie(p6444,type,spin,this);

            PieMaker.makePie(p6445,type,spin,this);

            PieMaker.makePie(p6446,type,spin,this);

            PieMaker.makePie(p6447,type,spin,this);

            PieMaker.makePie(p6448,type,spin,this);

            PieMaker.makePie(p6449,type,spin,this);

            PieMaker.makePie(p6450,type,spin,this);

            PieMaker.makePie(p6451,type,spin,this);

            PieMaker.makePie(p6452,type,spin,this);

            PieMaker.makePie(p6453,type,spin,this);

            PieMaker.makePie(p6454,type,spin,this);

            PieMaker.makePie(p6455,type,spin,this);

            PieMaker.makePie(p6456,type,spin,this);

            PieMaker.makePie(p6457,type,spin,this);

            PieMaker.makePie(p6458,type,spin,this);

            PieMaker.makePie(p6459,type,spin,this);

            PieMaker.makePie(p6460,type,spin,this);

            PieMaker.makePie(p6461,type,spin,this);

            PieMaker.makePie(p6462,type,spin,this);

            PieMaker.makePie(p6463,type,spin,this);

            PieMaker.makePie(p6464,type,spin,this);

            final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            findViewById(R.id.ll88).startAnimation(animation);

        }else if(mode.equals("rdc")) {
            spin=true;
            PieMaker.makePie(p641,type,spin,this);

            PieMaker.makePie(p642,type,spin,this);

            PieMaker.makePie(p643,type,spin,this);

            PieMaker.makePie(p644,type,spin,this);

            PieMaker.makePie(p645,type,spin,this);

            PieMaker.makePie(p646,type,spin,this);

            PieMaker.makePie(p647,type,spin,this);

            PieMaker.makePie(p648,type,spin,this);

            PieMaker.makePie(p649,type,spin,this);

            PieMaker.makePie(p6410,type,spin,this);

            PieMaker.makePie(p6411,type,spin,this);

            PieMaker.makePie(p6412,type,spin,this);

            PieMaker.makePie(p6413,type,spin,this);

            PieMaker.makePie(p6414,type,spin,this);

            PieMaker.makePie(p6415,type,spin,this);

            PieMaker.makePie(p6416,type,spin,this);

            PieMaker.makePie(p6417,type,spin,this);

            PieMaker.makePie(p6418,type,spin,this);

            PieMaker.makePie(p6419,type,spin,this);

            PieMaker.makePie(p6420,type,spin,this);

            PieMaker.makePie(p6421,type,spin,this);

            PieMaker.makePie(p6422,type,spin,this);

            PieMaker.makePie(p6423,type,spin,this);

            PieMaker.makePie(p6424,type,spin,this);

            PieMaker.makePie(p6425,type,spin,this);

            PieMaker.makePie(p6426,type,spin,this);

            PieMaker.makePie(p6427,type,spin,this);

            PieMaker.makePie(p6428,type,spin,this);

            PieMaker.makePie(p6429,type,spin,this);

            PieMaker.makePie(p6430,type,spin,this);

            PieMaker.makePie(p6431,type,spin,this);

            PieMaker.makePie(p6432,type,spin,this);

            PieMaker.makePie(p6433,type,spin,this);

            PieMaker.makePie(p6434,type,spin,this);

            PieMaker.makePie(p6435,type,spin,this);

            PieMaker.makePie(p6436,type,spin,this);

            PieMaker.makePie(p6437,type,spin,this);

            PieMaker.makePie(p6438,type,spin,this);

            PieMaker.makePie(p6439,type,spin,this);

            PieMaker.makePie(p6440,type,spin,this);

            PieMaker.makePie(p6441,type,spin,this);

            PieMaker.makePie(p6442,type,spin,this);

            PieMaker.makePie(p6443,type,spin,this);

            PieMaker.makePie(p6444,type,spin,this);

            PieMaker.makePie(p6445,type,spin,this);

            PieMaker.makePie(p6446,type,spin,this);

            PieMaker.makePie(p6447,type,spin,this);

            PieMaker.makePie(p6448,type,spin,this);

            PieMaker.makePie(p6449,type,spin,this);

            PieMaker.makePie(p6450,type,spin,this);

            PieMaker.makePie(p6451,type,spin,this);

            PieMaker.makePie(p6452,type,spin,this);

            PieMaker.makePie(p6453,type,spin,this);

            PieMaker.makePie(p6454,type,spin,this);

            PieMaker.makePie(p6455,type,spin,this);

            PieMaker.makePie(p6456,type,spin,this);

            PieMaker.makePie(p6457,type,spin,this);

            PieMaker.makePie(p6458,type,spin,this);

            PieMaker.makePie(p6459,type,spin,this);

            PieMaker.makePie(p6460,type,spin,this);

            PieMaker.makePie(p6461,type,spin,this);

            PieMaker.makePie(p6462,type,spin,this);

            PieMaker.makePie(p6463,type,spin,this);

            PieMaker.makePie(p6464,type,spin,this);



        }else if(mode.equals("std")){
            spin=false;
            PieMaker.makePie(p641,type,spin,this);

            PieMaker.makePie(p642,type,spin,this);

            PieMaker.makePie(p643,type,spin,this);

            PieMaker.makePie(p644,type,spin,this);

            PieMaker.makePie(p645,type,spin,this);

            PieMaker.makePie(p646,type,spin,this);

            PieMaker.makePie(p647,type,spin,this);

            PieMaker.makePie(p648,type,spin,this);

            PieMaker.makePie(p649,type,spin,this);

            PieMaker.makePie(p6410,type,spin,this);

            PieMaker.makePie(p6411,type,spin,this);

            PieMaker.makePie(p6412,type,spin,this);

            PieMaker.makePie(p6413,type,spin,this);

            PieMaker.makePie(p6414,type,spin,this);

            PieMaker.makePie(p6415,type,spin,this);

            PieMaker.makePie(p6416,type,spin,this);

            PieMaker.makePie(p6417,type,spin,this);

            PieMaker.makePie(p6418,type,spin,this);

            PieMaker.makePie(p6419,type,spin,this);

            PieMaker.makePie(p6420,type,spin,this);

            PieMaker.makePie(p6421,type,spin,this);

            PieMaker.makePie(p6422,type,spin,this);

            PieMaker.makePie(p6423,type,spin,this);

            PieMaker.makePie(p6424,type,spin,this);

            PieMaker.makePie(p6425,type,spin,this);

            PieMaker.makePie(p6426,type,spin,this);

            PieMaker.makePie(p6427,type,spin,this);

            PieMaker.makePie(p6428,type,spin,this);

            PieMaker.makePie(p6429,type,spin,this);

            PieMaker.makePie(p6430,type,spin,this);

            PieMaker.makePie(p6431,type,spin,this);

            PieMaker.makePie(p6432,type,spin,this);

            PieMaker.makePie(p6433,type,spin,this);

            PieMaker.makePie(p6434,type,spin,this);

            PieMaker.makePie(p6435,type,spin,this);

            PieMaker.makePie(p6436,type,spin,this);

            PieMaker.makePie(p6437,type,spin,this);

            PieMaker.makePie(p6438,type,spin,this);

            PieMaker.makePie(p6439,type,spin,this);

            PieMaker.makePie(p6440,type,spin,this);

            PieMaker.makePie(p6441,type,spin,this);

            PieMaker.makePie(p6442,type,spin,this);

            PieMaker.makePie(p6443,type,spin,this);

            PieMaker.makePie(p6444,type,spin,this);

            PieMaker.makePie(p6445,type,spin,this);

            PieMaker.makePie(p6446,type,spin,this);

            PieMaker.makePie(p6447,type,spin,this);

            PieMaker.makePie(p6448,type,spin,this);

            PieMaker.makePie(p6449,type,spin,this);

            PieMaker.makePie(p6450,type,spin,this);

            PieMaker.makePie(p6451,type,spin,this);

            PieMaker.makePie(p6452,type,spin,this);

            PieMaker.makePie(p6453,type,spin,this);

            PieMaker.makePie(p6454,type,spin,this);

            PieMaker.makePie(p6455,type,spin,this);

            PieMaker.makePie(p6456,type,spin,this);

            PieMaker.makePie(p6457,type,spin,this);

            PieMaker.makePie(p6458,type,spin,this);

            PieMaker.makePie(p6459,type,spin,this);

            PieMaker.makePie(p6460,type,spin,this);

            PieMaker.makePie(p6461,type,spin,this);

            PieMaker.makePie(p6462,type,spin,this);

            PieMaker.makePie(p6463,type,spin,this);

            PieMaker.makePie(p6464,type,spin,this);

        }




        p641.setExtraOffsets(-8f,-8f,-8f,-8f);
        p642.setExtraOffsets(-8f,-8f,-8f,-8f);
        p643.setExtraOffsets(-8f,-8f,-8f,-8f);
        p644.setExtraOffsets(-8f,-8f,-8f,-8f);
        p645.setExtraOffsets(-8f,-8f,-8f,-8f);
        p646.setExtraOffsets(-8f,-8f,-8f,-8f);
        p647.setExtraOffsets(-8f,-8f,-8f,-8f);
        p648.setExtraOffsets(-8f,-8f,-8f,-8f);
        p649.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6410.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6411.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6412.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6413.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6414.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6415.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6416.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6417.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6418.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6419.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6420.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6421.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6422.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6423.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6424.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6425.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6426.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6427.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6428.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6429.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6430.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6431.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6432.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6433.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6434.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6435.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6436.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6437.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6438.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6439.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6440.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6441.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6442.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6443.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6444.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6445.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6446.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6447.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6448.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6449.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6450.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6451.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6452.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6453.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6454.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6455.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6456.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6457.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6458.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6459.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6460.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6461.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6462.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6463.setExtraOffsets(-8f,-8f,-8f,-8f);
        p6464.setExtraOffsets(-8f,-8f,-8f,-8f);
    }


    public  void inflateViews(){
        p641=findViewById(R.id.pie81);
        p642=findViewById(R.id.pie82);
        p643=findViewById(R.id.pie83);
        p644=findViewById(R.id.pie84);
        p645=findViewById(R.id.pie85);
        p646=findViewById(R.id.pie86);
        p647=findViewById(R.id.pie87);
        p648=findViewById(R.id.pie88);
        p649=findViewById(R.id.pie89);
        p6410=findViewById(R.id.pie810);
        p6411=findViewById(R.id.pie811);
        p6412=findViewById(R.id.pie812);
        p6413=findViewById(R.id.pie813);
        p6414=findViewById(R.id.pie814);
        p6415=findViewById(R.id.pie815);
        p6416=findViewById(R.id.pie816);
        p6417=findViewById(R.id.pie817);
        p6418=findViewById(R.id.pie818);
        p6419=findViewById(R.id.pie819);
        p6420=findViewById(R.id.pie820);
        p6421=findViewById(R.id.pie821);
        p6422=findViewById(R.id.pie822);
        p6423=findViewById(R.id.pie823);
        p6424=findViewById(R.id.pie824);
        p6425=findViewById(R.id.pie825);
        p6426=findViewById(R.id.pie826);
        p6427=findViewById(R.id.pie827);
        p6428=findViewById(R.id.pie828);
        p6429=findViewById(R.id.pie829);
        p6430=findViewById(R.id.pie830);
        p6431=findViewById(R.id.pie831);
        p6432=findViewById(R.id.pie832);
        p6433=findViewById(R.id.pie833);
        p6434=findViewById(R.id.pie834);
        p6435=findViewById(R.id.pie835);
        p6436=findViewById(R.id.pie836);
        p6437=findViewById(R.id.pie837);
        p6438=findViewById(R.id.pie838);
        p6439=findViewById(R.id.pie839);
        p6440=findViewById(R.id.pie840);
        p6441=findViewById(R.id.pie841);
        p6442=findViewById(R.id.pie842);
        p6443=findViewById(R.id.pie843);
        p6444=findViewById(R.id.pie844);
        p6445=findViewById(R.id.pie845);
        p6446=findViewById(R.id.pie846);
        p6447=findViewById(R.id.pie847);
        p6448=findViewById(R.id.pie848);
        p6449=findViewById(R.id.pie849);
        p6450=findViewById(R.id.pie850);
        p6451=findViewById(R.id.pie851);
        p6452=findViewById(R.id.pie852);
        p6453=findViewById(R.id.pie853);
        p6454=findViewById(R.id.pie854);
        p6455=findViewById(R.id.pie855);
        p6456=findViewById(R.id.pie856);
        p6457=findViewById(R.id.pie857);
        p6458=findViewById(R.id.pie858);
        p6459=findViewById(R.id.pie859);
        p6460=findViewById(R.id.pie860);
        p6461=findViewById(R.id.pie861);
        p6462=findViewById(R.id.pie862);
        p6463=findViewById(R.id.pie863);
        p6464=findViewById(R.id.pie864);
    }
}
