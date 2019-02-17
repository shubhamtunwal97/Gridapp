package markproj.markproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.github.mikephil.charting.charts.PieChart;

public class Activity99 extends AppCompatActivity {

    PieChart p91;PieChart p92;PieChart p93;PieChart p94;PieChart p95;PieChart p96;PieChart p97;PieChart p98;PieChart p99;PieChart p910;PieChart p911;PieChart p912;PieChart p913;PieChart p914;PieChart p915;PieChart p916;PieChart p917;PieChart p918;PieChart p919;PieChart p920;PieChart p921;PieChart p922;PieChart p923;PieChart p924;PieChart p925;PieChart p926;PieChart p927;PieChart p928;PieChart p929;PieChart p930;PieChart p931;PieChart p932;PieChart p933;PieChart p934;PieChart p935;PieChart p936;PieChart p937;PieChart p938;PieChart p939;PieChart p940;PieChart p941;PieChart p942;PieChart p943;PieChart p944;PieChart p945;PieChart p946;PieChart p947;PieChart p948;PieChart p949;PieChart p950;PieChart p951;PieChart p952;PieChart p953;PieChart p954;PieChart p955;PieChart p956;PieChart p957;PieChart p958;PieChart p959;PieChart p960;PieChart p961;PieChart p962;PieChart p963;PieChart p964;PieChart p965;PieChart p966;PieChart p967;PieChart p968;PieChart p969;PieChart p970;PieChart p971;PieChart p972;PieChart p973;PieChart p974;PieChart p975;PieChart p976;PieChart p977;PieChart p978;PieChart p979;PieChart p980;PieChart p981;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_99);
        inflateViews();



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

            PieMaker.makePie(p910,type,spin,this);

            PieMaker.makePie(p911,type,spin,this);

            PieMaker.makePie(p912,type,spin,this);

            PieMaker.makePie(p913,type,spin,this);

            PieMaker.makePie(p914,type,spin,this);

            PieMaker.makePie(p915,type,spin,this);

            PieMaker.makePie(p916,type,spin,this);

            PieMaker.makePie(p917,type,spin,this);

            PieMaker.makePie(p918,type,spin,this);

            PieMaker.makePie(p919,type,spin,this);

            PieMaker.makePie(p920,type,spin,this);

            PieMaker.makePie(p921,type,spin,this);

            PieMaker.makePie(p922,type,spin,this);

            PieMaker.makePie(p923,type,spin,this);

            PieMaker.makePie(p924,type,spin,this);

            PieMaker.makePie(p925,type,spin,this);

            PieMaker.makePie(p926,type,spin,this);

            PieMaker.makePie(p927,type,spin,this);

            PieMaker.makePie(p928,type,spin,this);

            PieMaker.makePie(p929,type,spin,this);

            PieMaker.makePie(p930,type,spin,this);

            PieMaker.makePie(p931,type,spin,this);

            PieMaker.makePie(p932,type,spin,this);

            PieMaker.makePie(p933,type,spin,this);

            PieMaker.makePie(p934,type,spin,this);

            PieMaker.makePie(p935,type,spin,this);

            PieMaker.makePie(p936,type,spin,this);

            PieMaker.makePie(p937,type,spin,this);

            PieMaker.makePie(p938,type,spin,this);

            PieMaker.makePie(p939,type,spin,this);

            PieMaker.makePie(p940,type,spin,this);

            PieMaker.makePie(p941,type,spin,this);

            PieMaker.makePie(p942,type,spin,this);

            PieMaker.makePie(p943,type,spin,this);

            PieMaker.makePie(p944,type,spin,this);

            PieMaker.makePie(p945,type,spin,this);

            PieMaker.makePie(p946,type,spin,this);

            PieMaker.makePie(p947,type,spin,this);

            PieMaker.makePie(p948,type,spin,this);

            PieMaker.makePie(p949,type,spin,this);

            PieMaker.makePie(p950,type,spin,this);

            PieMaker.makePie(p951,type,spin,this);

            PieMaker.makePie(p952,type,spin,this);

            PieMaker.makePie(p953,type,spin,this);

            PieMaker.makePie(p954,type,spin,this);

            PieMaker.makePie(p955,type,spin,this);

            PieMaker.makePie(p956,type,spin,this);

            PieMaker.makePie(p957,type,spin,this);

            PieMaker.makePie(p958,type,spin,this);

            PieMaker.makePie(p959,type,spin,this);

            PieMaker.makePie(p960,type,spin,this);

            PieMaker.makePie(p961,type,spin,this);

            PieMaker.makePie(p962,type,spin,this);

            PieMaker.makePie(p963,type,spin,this);

            PieMaker.makePie(p964,type,spin,this);

            PieMaker.makePie(p965,type,spin,this);

            PieMaker.makePie(p966,type,spin,this);

            PieMaker.makePie(p967,type,spin,this);

            PieMaker.makePie(p968,type,spin,this);

            PieMaker.makePie(p969,type,spin,this);

            PieMaker.makePie(p970,type,spin,this);

            PieMaker.makePie(p971,type,spin,this);

            PieMaker.makePie(p972,type,spin,this);

            PieMaker.makePie(p973,type,spin,this);

            PieMaker.makePie(p974,type,spin,this);

            PieMaker.makePie(p975,type,spin,this);

            PieMaker.makePie(p976,type,spin,this);

            PieMaker.makePie(p977,type,spin,this);

            PieMaker.makePie(p978,type,spin,this);

            PieMaker.makePie(p979,type,spin,this);

            PieMaker.makePie(p980,type,spin,this);
            PieMaker.makePie(p981,type,spin,this);
            final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            findViewById(R.id.ll99).startAnimation(animation);

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

            PieMaker.makePie(p910,type,spin,this);

            PieMaker.makePie(p911,type,spin,this);

            PieMaker.makePie(p912,type,spin,this);

            PieMaker.makePie(p913,type,spin,this);

            PieMaker.makePie(p914,type,spin,this);

            PieMaker.makePie(p915,type,spin,this);

            PieMaker.makePie(p916,type,spin,this);

            PieMaker.makePie(p917,type,spin,this);

            PieMaker.makePie(p918,type,spin,this);

            PieMaker.makePie(p919,type,spin,this);

            PieMaker.makePie(p920,type,spin,this);

            PieMaker.makePie(p921,type,spin,this);

            PieMaker.makePie(p922,type,spin,this);

            PieMaker.makePie(p923,type,spin,this);

            PieMaker.makePie(p924,type,spin,this);

            PieMaker.makePie(p925,type,spin,this);

            PieMaker.makePie(p926,type,spin,this);

            PieMaker.makePie(p927,type,spin,this);

            PieMaker.makePie(p928,type,spin,this);

            PieMaker.makePie(p929,type,spin,this);

            PieMaker.makePie(p930,type,spin,this);

            PieMaker.makePie(p931,type,spin,this);

            PieMaker.makePie(p932,type,spin,this);

            PieMaker.makePie(p933,type,spin,this);

            PieMaker.makePie(p934,type,spin,this);

            PieMaker.makePie(p935,type,spin,this);

            PieMaker.makePie(p936,type,spin,this);

            PieMaker.makePie(p937,type,spin,this);

            PieMaker.makePie(p938,type,spin,this);

            PieMaker.makePie(p939,type,spin,this);

            PieMaker.makePie(p940,type,spin,this);

            PieMaker.makePie(p941,type,spin,this);

            PieMaker.makePie(p942,type,spin,this);

            PieMaker.makePie(p943,type,spin,this);

            PieMaker.makePie(p944,type,spin,this);

            PieMaker.makePie(p945,type,spin,this);

            PieMaker.makePie(p946,type,spin,this);

            PieMaker.makePie(p947,type,spin,this);

            PieMaker.makePie(p948,type,spin,this);

            PieMaker.makePie(p949,type,spin,this);

            PieMaker.makePie(p950,type,spin,this);

            PieMaker.makePie(p951,type,spin,this);

            PieMaker.makePie(p952,type,spin,this);

            PieMaker.makePie(p953,type,spin,this);

            PieMaker.makePie(p954,type,spin,this);

            PieMaker.makePie(p955,type,spin,this);

            PieMaker.makePie(p956,type,spin,this);

            PieMaker.makePie(p957,type,spin,this);

            PieMaker.makePie(p958,type,spin,this);

            PieMaker.makePie(p959,type,spin,this);

            PieMaker.makePie(p960,type,spin,this);

            PieMaker.makePie(p961,type,spin,this);

            PieMaker.makePie(p962,type,spin,this);

            PieMaker.makePie(p963,type,spin,this);

            PieMaker.makePie(p964,type,spin,this);

            PieMaker.makePie(p965,type,spin,this);

            PieMaker.makePie(p966,type,spin,this);

            PieMaker.makePie(p967,type,spin,this);

            PieMaker.makePie(p968,type,spin,this);

            PieMaker.makePie(p969,type,spin,this);

            PieMaker.makePie(p970,type,spin,this);

            PieMaker.makePie(p971,type,spin,this);

            PieMaker.makePie(p972,type,spin,this);

            PieMaker.makePie(p973,type,spin,this);

            PieMaker.makePie(p974,type,spin,this);

            PieMaker.makePie(p975,type,spin,this);

            PieMaker.makePie(p976,type,spin,this);

            PieMaker.makePie(p977,type,spin,this);

            PieMaker.makePie(p978,type,spin,this);

            PieMaker.makePie(p979,type,spin,this);

            PieMaker.makePie(p980,type,spin,this);
            PieMaker.makePie(p981,type,spin,this);


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

            PieMaker.makePie(p910,type,spin,this);

            PieMaker.makePie(p911,type,spin,this);

            PieMaker.makePie(p912,type,spin,this);

            PieMaker.makePie(p913,type,spin,this);

            PieMaker.makePie(p914,type,spin,this);

            PieMaker.makePie(p915,type,spin,this);

            PieMaker.makePie(p916,type,spin,this);

            PieMaker.makePie(p917,type,spin,this);

            PieMaker.makePie(p918,type,spin,this);

            PieMaker.makePie(p919,type,spin,this);

            PieMaker.makePie(p920,type,spin,this);

            PieMaker.makePie(p921,type,spin,this);

            PieMaker.makePie(p922,type,spin,this);

            PieMaker.makePie(p923,type,spin,this);

            PieMaker.makePie(p924,type,spin,this);

            PieMaker.makePie(p925,type,spin,this);

            PieMaker.makePie(p926,type,spin,this);

            PieMaker.makePie(p927,type,spin,this);

            PieMaker.makePie(p928,type,spin,this);

            PieMaker.makePie(p929,type,spin,this);

            PieMaker.makePie(p930,type,spin,this);

            PieMaker.makePie(p931,type,spin,this);

            PieMaker.makePie(p932,type,spin,this);

            PieMaker.makePie(p933,type,spin,this);

            PieMaker.makePie(p934,type,spin,this);

            PieMaker.makePie(p935,type,spin,this);

            PieMaker.makePie(p936,type,spin,this);

            PieMaker.makePie(p937,type,spin,this);

            PieMaker.makePie(p938,type,spin,this);

            PieMaker.makePie(p939,type,spin,this);

            PieMaker.makePie(p940,type,spin,this);

            PieMaker.makePie(p941,type,spin,this);

            PieMaker.makePie(p942,type,spin,this);

            PieMaker.makePie(p943,type,spin,this);

            PieMaker.makePie(p944,type,spin,this);

            PieMaker.makePie(p945,type,spin,this);

            PieMaker.makePie(p946,type,spin,this);

            PieMaker.makePie(p947,type,spin,this);

            PieMaker.makePie(p948,type,spin,this);

            PieMaker.makePie(p949,type,spin,this);

            PieMaker.makePie(p950,type,spin,this);

            PieMaker.makePie(p951,type,spin,this);

            PieMaker.makePie(p952,type,spin,this);

            PieMaker.makePie(p953,type,spin,this);

            PieMaker.makePie(p954,type,spin,this);

            PieMaker.makePie(p955,type,spin,this);

            PieMaker.makePie(p956,type,spin,this);

            PieMaker.makePie(p957,type,spin,this);

            PieMaker.makePie(p958,type,spin,this);

            PieMaker.makePie(p959,type,spin,this);

            PieMaker.makePie(p960,type,spin,this);

            PieMaker.makePie(p961,type,spin,this);

            PieMaker.makePie(p962,type,spin,this);

            PieMaker.makePie(p963,type,spin,this);

            PieMaker.makePie(p964,type,spin,this);

            PieMaker.makePie(p965,type,spin,this);

            PieMaker.makePie(p966,type,spin,this);

            PieMaker.makePie(p967,type,spin,this);

            PieMaker.makePie(p968,type,spin,this);

            PieMaker.makePie(p969,type,spin,this);

            PieMaker.makePie(p970,type,spin,this);

            PieMaker.makePie(p971,type,spin,this);

            PieMaker.makePie(p972,type,spin,this);

            PieMaker.makePie(p973,type,spin,this);

            PieMaker.makePie(p974,type,spin,this);

            PieMaker.makePie(p975,type,spin,this);

            PieMaker.makePie(p976,type,spin,this);

            PieMaker.makePie(p977,type,spin,this);

            PieMaker.makePie(p978,type,spin,this);

            PieMaker.makePie(p979,type,spin,this);

            PieMaker.makePie(p980,type,spin,this);
            PieMaker.makePie(p981,type,spin,this);
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
        p910.setExtraOffsets(-8f,-8f,-8f,-8f);
        p911.setExtraOffsets(-8f,-8f,-8f,-8f);
        p912.setExtraOffsets(-8f,-8f,-8f,-8f);
        p913.setExtraOffsets(-8f,-8f,-8f,-8f);
        p914.setExtraOffsets(-8f,-8f,-8f,-8f);
        p915.setExtraOffsets(-8f,-8f,-8f,-8f);
        p916.setExtraOffsets(-8f,-8f,-8f,-8f);
        p917.setExtraOffsets(-8f,-8f,-8f,-8f);
        p918.setExtraOffsets(-8f,-8f,-8f,-8f);
        p919.setExtraOffsets(-8f,-8f,-8f,-8f);
        p920.setExtraOffsets(-8f,-8f,-8f,-8f);
        p921.setExtraOffsets(-8f,-8f,-8f,-8f);
        p922.setExtraOffsets(-8f,-8f,-8f,-8f);
        p923.setExtraOffsets(-8f,-8f,-8f,-8f);
        p924.setExtraOffsets(-8f,-8f,-8f,-8f);
        p925.setExtraOffsets(-8f,-8f,-8f,-8f);
        p926.setExtraOffsets(-8f,-8f,-8f,-8f);
        p927.setExtraOffsets(-8f,-8f,-8f,-8f);
        p928.setExtraOffsets(-8f,-8f,-8f,-8f);
        p929.setExtraOffsets(-8f,-8f,-8f,-8f);
        p930.setExtraOffsets(-8f,-8f,-8f,-8f);
        p931.setExtraOffsets(-8f,-8f,-8f,-8f);
        p932.setExtraOffsets(-8f,-8f,-8f,-8f);
        p933.setExtraOffsets(-8f,-8f,-8f,-8f);
        p934.setExtraOffsets(-8f,-8f,-8f,-8f);
        p935.setExtraOffsets(-8f,-8f,-8f,-8f);
        p936.setExtraOffsets(-8f,-8f,-8f,-8f);
        p937.setExtraOffsets(-8f,-8f,-8f,-8f);
        p938.setExtraOffsets(-8f,-8f,-8f,-8f);
        p939.setExtraOffsets(-8f,-8f,-8f,-8f);
        p940.setExtraOffsets(-8f,-8f,-8f,-8f);
        p941.setExtraOffsets(-8f,-8f,-8f,-8f);
        p942.setExtraOffsets(-8f,-8f,-8f,-8f);
        p943.setExtraOffsets(-8f,-8f,-8f,-8f);
        p944.setExtraOffsets(-8f,-8f,-8f,-8f);
        p945.setExtraOffsets(-8f,-8f,-8f,-8f);
        p946.setExtraOffsets(-8f,-8f,-8f,-8f);
        p947.setExtraOffsets(-8f,-8f,-8f,-8f);
        p948.setExtraOffsets(-8f,-8f,-8f,-8f);
        p949.setExtraOffsets(-8f,-8f,-8f,-8f);
        p950.setExtraOffsets(-8f,-8f,-8f,-8f);
        p951.setExtraOffsets(-8f,-8f,-8f,-8f);
        p952.setExtraOffsets(-8f,-8f,-8f,-8f);
        p953.setExtraOffsets(-8f,-8f,-8f,-8f);
        p954.setExtraOffsets(-8f,-8f,-8f,-8f);
        p955.setExtraOffsets(-8f,-8f,-8f,-8f);
        p956.setExtraOffsets(-8f,-8f,-8f,-8f);
        p957.setExtraOffsets(-8f,-8f,-8f,-8f);
        p958.setExtraOffsets(-8f,-8f,-8f,-8f);
        p959.setExtraOffsets(-8f,-8f,-8f,-8f);
        p960.setExtraOffsets(-8f,-8f,-8f,-8f);
        p961.setExtraOffsets(-8f,-8f,-8f,-8f);
        p962.setExtraOffsets(-8f,-8f,-8f,-8f);
        p963.setExtraOffsets(-8f,-8f,-8f,-8f);
        p964.setExtraOffsets(-8f,-8f,-8f,-8f);
        p965.setExtraOffsets(-8f,-8f,-8f,-8f);
        p966.setExtraOffsets(-8f,-8f,-8f,-8f);
        p967.setExtraOffsets(-8f,-8f,-8f,-8f);
        p968.setExtraOffsets(-8f,-8f,-8f,-8f);
        p969.setExtraOffsets(-8f,-8f,-8f,-8f);
        p970.setExtraOffsets(-8f,-8f,-8f,-8f);
        p971.setExtraOffsets(-8f,-8f,-8f,-8f);
        p972.setExtraOffsets(-8f,-8f,-8f,-8f);
        p973.setExtraOffsets(-8f,-8f,-8f,-8f);
        p974.setExtraOffsets(-8f,-8f,-8f,-8f);
        p975.setExtraOffsets(-8f,-8f,-8f,-8f);
        p976.setExtraOffsets(-8f,-8f,-8f,-8f);
        p977.setExtraOffsets(-8f,-8f,-8f,-8f);
        p978.setExtraOffsets(-8f,-8f,-8f,-8f);
        p979.setExtraOffsets(-8f,-8f,-8f,-8f);
        p980.setExtraOffsets(-8f,-8f,-8f,-8f);
        p981.setExtraOffsets(-8f,-8f,-8f,-8f);

    }


    void inflateViews(){
        p91=findViewById(R.id.pie91);
        p92=findViewById(R.id.pie92);
        p93=findViewById(R.id.pie93);
        p94=findViewById(R.id.pie94);
        p95=findViewById(R.id.pie95);
        p96=findViewById(R.id.pie96);
        p97=findViewById(R.id.pie97);
        p98=findViewById(R.id.pie98);
        p99=findViewById(R.id.pie99);
        p910=findViewById(R.id.pie910);
        p911=findViewById(R.id.pie911);
        p912=findViewById(R.id.pie912);
        p913=findViewById(R.id.pie913);
        p914=findViewById(R.id.pie914);
        p915=findViewById(R.id.pie915);
        p916=findViewById(R.id.pie916);
        p917=findViewById(R.id.pie917);
        p918=findViewById(R.id.pie918);
        p919=findViewById(R.id.pie919);
        p920=findViewById(R.id.pie920);
        p921=findViewById(R.id.pie921);
        p922=findViewById(R.id.pie922);
        p923=findViewById(R.id.pie923);
        p924=findViewById(R.id.pie924);
        p925=findViewById(R.id.pie925);
        p926=findViewById(R.id.pie926);
        p927=findViewById(R.id.pie927);
        p928=findViewById(R.id.pie928);
        p929=findViewById(R.id.pie929);
        p930=findViewById(R.id.pie930);
        p931=findViewById(R.id.pie931);
        p932=findViewById(R.id.pie932);
        p933=findViewById(R.id.pie933);
        p934=findViewById(R.id.pie934);
        p935=findViewById(R.id.pie935);
        p936=findViewById(R.id.pie936);
        p937=findViewById(R.id.pie937);
        p938=findViewById(R.id.pie938);
        p939=findViewById(R.id.pie939);
        p940=findViewById(R.id.pie940);
        p941=findViewById(R.id.pie941);
        p942=findViewById(R.id.pie942);
        p943=findViewById(R.id.pie943);
        p944=findViewById(R.id.pie944);
        p945=findViewById(R.id.pie945);
        p946=findViewById(R.id.pie946);
        p947=findViewById(R.id.pie947);
        p948=findViewById(R.id.pie948);
        p949=findViewById(R.id.pie949);
        p950=findViewById(R.id.pie950);
        p951=findViewById(R.id.pie951);
        p952=findViewById(R.id.pie952);
        p953=findViewById(R.id.pie953);
        p954=findViewById(R.id.pie954);
        p955=findViewById(R.id.pie955);
        p956=findViewById(R.id.pie956);
        p957=findViewById(R.id.pie957);
        p958=findViewById(R.id.pie958);
        p959=findViewById(R.id.pie959);
        p960=findViewById(R.id.pie960);
        p961=findViewById(R.id.pie961);
        p962=findViewById(R.id.pie962);
        p963=findViewById(R.id.pie963);
        p964=findViewById(R.id.pie964);
        p965=findViewById(R.id.pie965);
        p966=findViewById(R.id.pie966);
        p967=findViewById(R.id.pie967);
        p968=findViewById(R.id.pie968);
        p969=findViewById(R.id.pie969);
        p970=findViewById(R.id.pie970);
        p971=findViewById(R.id.pie971);
        p972=findViewById(R.id.pie972);
        p973=findViewById(R.id.pie973);
        p974=findViewById(R.id.pie974);
        p975=findViewById(R.id.pie975);
        p976=findViewById(R.id.pie976);
        p977=findViewById(R.id.pie977);
        p978=findViewById(R.id.pie978);
        p979=findViewById(R.id.pie979);
        p980=findViewById(R.id.pie980);
        p981=findViewById(R.id.pie981);



    }
}
