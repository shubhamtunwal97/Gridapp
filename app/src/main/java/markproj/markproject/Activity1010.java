package markproj.markproject;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Activity1010 extends AppCompatActivity {

    PieChart p101;PieChart p102;PieChart p103;PieChart p104;PieChart p105;PieChart p106;PieChart p107;PieChart p108;PieChart p109;PieChart p1010;PieChart p1011;PieChart p1012;PieChart p1013;PieChart p1014;PieChart p1015;PieChart p1016;PieChart p1017;PieChart p1018;PieChart p1019;PieChart p1020;PieChart p1021;PieChart p1022;PieChart p1023;PieChart p1024;PieChart p1025;PieChart p1026;PieChart p1027;PieChart p1028;PieChart p1029;PieChart p1030;PieChart p1031;PieChart p1032;PieChart p1033;PieChart p1034;PieChart p1035;PieChart p1036;PieChart p1037;PieChart p1038;PieChart p1039;PieChart p1040;PieChart p1041;PieChart p1042;PieChart p1043;PieChart p1044;PieChart p1045;PieChart p1046;PieChart p1047;PieChart p1048;PieChart p1049;PieChart p1050;PieChart p1051;PieChart p1052;PieChart p1053;PieChart p1054;PieChart p1055;PieChart p1056;PieChart p1057;PieChart p1058;PieChart p1059;PieChart p1060;PieChart p1061;PieChart p1062;PieChart p1063;PieChart p1064;PieChart p1065;PieChart p1066;PieChart p1067;PieChart p1068;PieChart p1069;PieChart p1070;PieChart p1071;PieChart p1072;PieChart p1073;PieChart p1074;PieChart p1075;PieChart p1076;PieChart p1077;PieChart p1078;PieChart p1079;PieChart p1080;PieChart p1081;PieChart p1082;PieChart p1083;PieChart p1084;PieChart p1085;PieChart p1086;PieChart p1087;PieChart p1088;PieChart p1089;PieChart p1090;PieChart p1091;PieChart p1092;PieChart p1093;PieChart p1094;PieChart p1095;PieChart p1096;PieChart p1097;PieChart p1098;PieChart p1099;PieChart p10100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1010);
        inflateViews();

//        piemaker(true,4);

        String mode=getIntent().getStringExtra("mode");
        int type=getIntent().getIntExtra("tp",4);
        boolean spin=false;

        if(mode.equals("rdg")){
            spin=false;
            makePie(p101,type,spin);
            makePie(p101,type,spin);
            makePie(p102,type,spin);
            makePie(p103,type,spin);
            makePie(p104,type,spin);
            makePie(p105,type,spin);
            makePie(p106,type,spin);
            makePie(p107,type,spin);
            makePie(p108,type,spin);
            makePie(p109,type,spin);
            makePie(p1010,type,spin);
            makePie(p1011,type,spin);
            makePie(p1012,type,spin);
            makePie(p1013,type,spin);
            makePie(p1014,type,spin);
            makePie(p1015,type,spin);
            makePie(p1016,type,spin);
            makePie(p1017,type,spin);
            makePie(p1018,type,spin);
            makePie(p1019,type,spin);
            makePie(p1020,type,spin);
            makePie(p1021,type,spin);
            makePie(p1022,type,spin);
            makePie(p1023,type,spin);
            makePie(p1024,type,spin);
            makePie(p1025,type,spin);
            makePie(p1026,type,spin);
            makePie(p1027,type,spin);
            makePie(p1028,type,spin);
            makePie(p1029,type,spin);
            makePie(p1030,type,spin);
            makePie(p1031,type,spin);
            makePie(p1032,type,spin);
            makePie(p1033,type,spin);
            makePie(p1034,type,spin);
            makePie(p1035,type,spin);
            makePie(p1036,type,spin);
            makePie(p1037,type,spin);
            makePie(p1038,type,spin);
            makePie(p1039,type,spin);
            makePie(p1040,type,spin);
            makePie(p1041,type,spin);
            makePie(p1042,type,spin);
            makePie(p1043,type,spin);
            makePie(p1044,type,spin);
            makePie(p1045,type,spin);
            makePie(p1046,type,spin);
            makePie(p1047,type,spin);
            makePie(p1048,type,spin);
            makePie(p1049,type,spin);
            makePie(p1050,type,spin);
            makePie(p1051,type,spin);
            makePie(p1052,type,spin);
            makePie(p1053,type,spin);
            makePie(p1054,type,spin);
            makePie(p1055,type,spin);
            makePie(p1056,type,spin);
            makePie(p1057,type,spin);
            makePie(p1058,type,spin);
            makePie(p1059,type,spin);
            makePie(p1060,type,spin);
            makePie(p1061,type,spin);
            makePie(p1062,type,spin);
            makePie(p1063,type,spin);
            makePie(p1064,type,spin);
            makePie(p1065,type,spin);
            makePie(p1066,type,spin);
            makePie(p1067,type,spin);
            makePie(p1068,type,spin);
            makePie(p1069,type,spin);
            makePie(p1070,type,spin);
            makePie(p1071,type,spin);
            makePie(p1072,type,spin);
            makePie(p1073,type,spin);
            makePie(p1074,type,spin);
            makePie(p1075,type,spin);
            makePie(p1076,type,spin);
            makePie(p1077,type,spin);
            makePie(p1078,type,spin);
            makePie(p1079,type,spin);
            makePie(p1080,type,spin);
            makePie(p1081,type,spin);
            makePie(p1082,type,spin);
            makePie(p1083,type,spin);
            makePie(p1084,type,spin);
            makePie(p1085,type,spin);
            makePie(p1086,type,spin);
            makePie(p1087,type,spin);
            makePie(p1088,type,spin);
            makePie(p1089,type,spin);
            makePie(p1090,type,spin);
            makePie(p1091,type,spin);
            makePie(p1092,type,spin);
            makePie(p1093,type,spin);
            makePie(p1094,type,spin);
            makePie(p1095,type,spin);
            makePie(p1096,type,spin);
            makePie(p1097,type,spin);
            makePie(p1098,type,spin);
            makePie(p1099,type,spin);
            makePie(p10100,type,spin);
            final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            findViewById(R.id.ll1010).startAnimation(animation);

        }else if(mode.equals("rdc")) {
            spin=true;
            makePie(p101,type,spin);
            makePie(p101,type,spin);
            makePie(p102,type,spin);
            makePie(p103,type,spin);
            makePie(p104,type,spin);
            makePie(p105,type,spin);
            makePie(p106,type,spin);
            makePie(p107,type,spin);
            makePie(p108,type,spin);
            makePie(p109,type,spin);
            makePie(p1010,type,spin);
            makePie(p1011,type,spin);
            makePie(p1012,type,spin);
            makePie(p1013,type,spin);
            makePie(p1014,type,spin);
            makePie(p1015,type,spin);
            makePie(p1016,type,spin);
            makePie(p1017,type,spin);
            makePie(p1018,type,spin);
            makePie(p1019,type,spin);
            makePie(p1020,type,spin);
            makePie(p1021,type,spin);
            makePie(p1022,type,spin);
            makePie(p1023,type,spin);
            makePie(p1024,type,spin);
            makePie(p1025,type,spin);
            makePie(p1026,type,spin);
            makePie(p1027,type,spin);
            makePie(p1028,type,spin);
            makePie(p1029,type,spin);
            makePie(p1030,type,spin);
            makePie(p1031,type,spin);
            makePie(p1032,type,spin);
            makePie(p1033,type,spin);
            makePie(p1034,type,spin);
            makePie(p1035,type,spin);
            makePie(p1036,type,spin);
            makePie(p1037,type,spin);
            makePie(p1038,type,spin);
            makePie(p1039,type,spin);
            makePie(p1040,type,spin);
            makePie(p1041,type,spin);
            makePie(p1042,type,spin);
            makePie(p1043,type,spin);
            makePie(p1044,type,spin);
            makePie(p1045,type,spin);
            makePie(p1046,type,spin);
            makePie(p1047,type,spin);
            makePie(p1048,type,spin);
            makePie(p1049,type,spin);
            makePie(p1050,type,spin);
            makePie(p1051,type,spin);
            makePie(p1052,type,spin);
            makePie(p1053,type,spin);
            makePie(p1054,type,spin);
            makePie(p1055,type,spin);
            makePie(p1056,type,spin);
            makePie(p1057,type,spin);
            makePie(p1058,type,spin);
            makePie(p1059,type,spin);
            makePie(p1060,type,spin);
            makePie(p1061,type,spin);
            makePie(p1062,type,spin);
            makePie(p1063,type,spin);
            makePie(p1064,type,spin);
            makePie(p1065,type,spin);
            makePie(p1066,type,spin);
            makePie(p1067,type,spin);
            makePie(p1068,type,spin);
            makePie(p1069,type,spin);
            makePie(p1070,type,spin);
            makePie(p1071,type,spin);
            makePie(p1072,type,spin);
            makePie(p1073,type,spin);
            makePie(p1074,type,spin);
            makePie(p1075,type,spin);
            makePie(p1076,type,spin);
            makePie(p1077,type,spin);
            makePie(p1078,type,spin);
            makePie(p1079,type,spin);
            makePie(p1080,type,spin);
            makePie(p1081,type,spin);
            makePie(p1082,type,spin);
            makePie(p1083,type,spin);
            makePie(p1084,type,spin);
            makePie(p1085,type,spin);
            makePie(p1086,type,spin);
            makePie(p1087,type,spin);
            makePie(p1088,type,spin);
            makePie(p1089,type,spin);
            makePie(p1090,type,spin);
            makePie(p1091,type,spin);
            makePie(p1092,type,spin);
            makePie(p1093,type,spin);
            makePie(p1094,type,spin);
            makePie(p1095,type,spin);
            makePie(p1096,type,spin);
            makePie(p1097,type,spin);
            makePie(p1098,type,spin);
            makePie(p1099,type,spin);
            makePie(p10100,type,spin);


        }else if(mode.equals("std")){
            spin=false;
            makePie(p101,type,spin);
            makePie(p101,type,spin);
            makePie(p102,type,spin);
            makePie(p103,type,spin);
            makePie(p104,type,spin);
            makePie(p105,type,spin);
            makePie(p106,type,spin);
            makePie(p107,type,spin);
            makePie(p108,type,spin);
            makePie(p109,type,spin);
            makePie(p1010,type,spin);
            makePie(p1011,type,spin);
            makePie(p1012,type,spin);
            makePie(p1013,type,spin);
            makePie(p1014,type,spin);
            makePie(p1015,type,spin);
            makePie(p1016,type,spin);
            makePie(p1017,type,spin);
            makePie(p1018,type,spin);
            makePie(p1019,type,spin);
            makePie(p1020,type,spin);
            makePie(p1021,type,spin);
            makePie(p1022,type,spin);
            makePie(p1023,type,spin);
            makePie(p1024,type,spin);
            makePie(p1025,type,spin);
            makePie(p1026,type,spin);
            makePie(p1027,type,spin);
            makePie(p1028,type,spin);
            makePie(p1029,type,spin);
            makePie(p1030,type,spin);
            makePie(p1031,type,spin);
            makePie(p1032,type,spin);
            makePie(p1033,type,spin);
            makePie(p1034,type,spin);
            makePie(p1035,type,spin);
            makePie(p1036,type,spin);
            makePie(p1037,type,spin);
            makePie(p1038,type,spin);
            makePie(p1039,type,spin);
            makePie(p1040,type,spin);
            makePie(p1041,type,spin);
            makePie(p1042,type,spin);
            makePie(p1043,type,spin);
            makePie(p1044,type,spin);
            makePie(p1045,type,spin);
            makePie(p1046,type,spin);
            makePie(p1047,type,spin);
            makePie(p1048,type,spin);
            makePie(p1049,type,spin);
            makePie(p1050,type,spin);
            makePie(p1051,type,spin);
            makePie(p1052,type,spin);
            makePie(p1053,type,spin);
            makePie(p1054,type,spin);
            makePie(p1055,type,spin);
            makePie(p1056,type,spin);
            makePie(p1057,type,spin);
            makePie(p1058,type,spin);
            makePie(p1059,type,spin);
            makePie(p1060,type,spin);
            makePie(p1061,type,spin);
            makePie(p1062,type,spin);
            makePie(p1063,type,spin);
            makePie(p1064,type,spin);
            makePie(p1065,type,spin);
            makePie(p1066,type,spin);
            makePie(p1067,type,spin);
            makePie(p1068,type,spin);
            makePie(p1069,type,spin);
            makePie(p1070,type,spin);
            makePie(p1071,type,spin);
            makePie(p1072,type,spin);
            makePie(p1073,type,spin);
            makePie(p1074,type,spin);
            makePie(p1075,type,spin);
            makePie(p1076,type,spin);
            makePie(p1077,type,spin);
            makePie(p1078,type,spin);
            makePie(p1079,type,spin);
            makePie(p1080,type,spin);
            makePie(p1081,type,spin);
            makePie(p1082,type,spin);
            makePie(p1083,type,spin);
            makePie(p1084,type,spin);
            makePie(p1085,type,spin);
            makePie(p1086,type,spin);
            makePie(p1087,type,spin);
            makePie(p1088,type,spin);
            makePie(p1089,type,spin);
            makePie(p1090,type,spin);
            makePie(p1091,type,spin);
            makePie(p1092,type,spin);
            makePie(p1093,type,spin);
            makePie(p1094,type,spin);
            makePie(p1095,type,spin);
            makePie(p1096,type,spin);
            makePie(p1097,type,spin);
            makePie(p1098,type,spin);
            makePie(p1099,type,spin);
            makePie(p10100,type,spin);
        }





        p101.setExtraOffsets(-8f,-8f,-8f,-8f);
        p102.setExtraOffsets(-8f,-8f,-8f,-8f);
        p103.setExtraOffsets(-8f,-8f,-8f,-8f);
        p104.setExtraOffsets(-8f,-8f,-8f,-8f);
        p105.setExtraOffsets(-8f,-8f,-8f,-8f);
        p106.setExtraOffsets(-8f,-8f,-8f,-8f);
        p107.setExtraOffsets(-8f,-8f,-8f,-8f);
        p108.setExtraOffsets(-8f,-8f,-8f,-8f);
        p109.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1010.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1011.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1012.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1013.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1014.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1015.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1016.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1017.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1018.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1019.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1020.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1021.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1022.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1023.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1024.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1025.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1026.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1027.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1028.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1029.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1030.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1031.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1032.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1033.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1034.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1035.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1036.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1037.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1038.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1039.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1040.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1041.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1042.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1043.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1044.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1045.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1046.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1047.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1048.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1049.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1050.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1051.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1052.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1053.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1054.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1055.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1056.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1057.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1058.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1059.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1060.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1061.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1062.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1063.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1064.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1065.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1066.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1067.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1068.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1069.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1070.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1071.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1072.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1073.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1074.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1075.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1076.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1077.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1078.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1079.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1080.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1081.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1082.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1083.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1084.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1085.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1086.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1087.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1088.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1089.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1090.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1091.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1092.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1093.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1094.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1095.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1096.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1097.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1098.setExtraOffsets(-8f,-8f,-8f,-8f);
        p1099.setExtraOffsets(-8f,-8f,-8f,-8f);
        p10100.setExtraOffsets(-8f,-8f,-8f,-8f);
    }

    void makePie(PieChart pieChart,int type,boolean spin){

//        pieChart.setMinOffset(-10);

        pieChart.setVisibility(View.VISIBLE);
        ArrayList<PieEntry> yvalues = new ArrayList<>();

        for(int i=0;i<type;i++){
            yvalues.add(new PieEntry(10F, ""));
        }
        PieDataSet dataSet = new PieDataSet(yvalues, "Net Worth");
        ArrayList<String> xVals = new ArrayList<String>();

        PieData data = new PieData(dataSet);
        pieChart.setCenterTextColor(Color.BLACK);
        pieChart.setData(data);

        pieChart.setDrawHoleEnabled(false);
        final int[] MY_COLORS = {
                Color.rgb(246,230,196),
                Color.rgb(200,237,253),
                Color.rgb(252,199,202),
                Color.rgb(179,233,216),
                Color.rgb(247,233,174),
                Color.rgb(211,211,246),
                Color.rgb(108,59,57),
                Color.rgb(75,132,138),
                Color.rgb(124,96,66),
                Color.rgb(247,173,89),
                Color.rgb(235,108,63),
                Color.rgb(208,75,52),
                Color.rgb(255,202,39),
                Color.rgb(147,37,166),
                Color.rgb(22,158,250),
                Color.rgb(118,7,47),
                Color.rgb(44,183,80),
                Color.rgb(100,22,151),
                Color.rgb(88,42,71),
                Color.rgb(27,40,121),
                Color.rgb(29,112,74),
                Color.rgb(252,216,82),
                Color.rgb(247,99,64),
                Color.rgb(232,57,52)
        };

        ArrayList<Integer> colors = new ArrayList<Integer>();
        dataSet.setColors(colors);

//        for(int c: ) colors.add(c);
        for(int i=0;i<type;i++){
            colors.add(getRandom(MY_COLORS));
        }





        List<LegendEntry> entries = new ArrayList<>();
        dataSet.setDrawValues(false);
        data.setValueTextSize(16f);
        data.setValueTextColor(Color.DKGRAY);
        pieChart.getDescription().setEnabled(false);
        pieChart.setTransparentCircleAlpha(0);
        pieChart.getLegend().setEnabled(false);
        pieChart.setRotationEnabled(false);
        pieChart.setClickable(false);
        pieChart.setTouchEnabled(false);
        pieChart.invalidate();
        if(spin){
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            pieChart.startAnimation(animation);

        }

    }


    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }



    void inflateViews(){
        p101=findViewById(R.id.pie101);
        p102=findViewById(R.id.pie102);
        p103=findViewById(R.id.pie103);
        p104=findViewById(R.id.pie104);
        p105=findViewById(R.id.pie105);
        p106=findViewById(R.id.pie106);
        p107=findViewById(R.id.pie107);
        p108=findViewById(R.id.pie108);
        p109=findViewById(R.id.pie109);
        p1010=findViewById(R.id.pie1010);
        p1011=findViewById(R.id.pie1011);
        p1012=findViewById(R.id.pie1012);
        p1013=findViewById(R.id.pie1013);
        p1014=findViewById(R.id.pie1014);
        p1015=findViewById(R.id.pie1015);
        p1016=findViewById(R.id.pie1016);
        p1017=findViewById(R.id.pie1017);
        p1018=findViewById(R.id.pie1018);
        p1019=findViewById(R.id.pie1019);
        p1020=findViewById(R.id.pie1020);
        p1021=findViewById(R.id.pie1021);
        p1022=findViewById(R.id.pie1022);
        p1023=findViewById(R.id.pie1023);
        p1024=findViewById(R.id.pie1024);
        p1025=findViewById(R.id.pie1025);
        p1026=findViewById(R.id.pie1026);
        p1027=findViewById(R.id.pie1027);
        p1028=findViewById(R.id.pie1028);
        p1029=findViewById(R.id.pie1029);
        p1030=findViewById(R.id.pie1030);
        p1031=findViewById(R.id.pie1031);
        p1032=findViewById(R.id.pie1032);
        p1033=findViewById(R.id.pie1033);
        p1034=findViewById(R.id.pie1034);
        p1035=findViewById(R.id.pie1035);
        p1036=findViewById(R.id.pie1036);
        p1037=findViewById(R.id.pie1037);
        p1038=findViewById(R.id.pie1038);
        p1039=findViewById(R.id.pie1039);
        p1040=findViewById(R.id.pie1040);
        p1041=findViewById(R.id.pie1041);
        p1042=findViewById(R.id.pie1042);
        p1043=findViewById(R.id.pie1043);
        p1044=findViewById(R.id.pie1044);
        p1045=findViewById(R.id.pie1045);
        p1046=findViewById(R.id.pie1046);
        p1047=findViewById(R.id.pie1047);
        p1048=findViewById(R.id.pie1048);
        p1049=findViewById(R.id.pie1049);
        p1050=findViewById(R.id.pie1050);
        p1051=findViewById(R.id.pie1051);
        p1052=findViewById(R.id.pie1052);
        p1053=findViewById(R.id.pie1053);
        p1054=findViewById(R.id.pie1054);
        p1055=findViewById(R.id.pie1055);
        p1056=findViewById(R.id.pie1056);
        p1057=findViewById(R.id.pie1057);
        p1058=findViewById(R.id.pie1058);
        p1059=findViewById(R.id.pie1059);
        p1060=findViewById(R.id.pie1060);
        p1061=findViewById(R.id.pie1061);
        p1062=findViewById(R.id.pie1062);
        p1063=findViewById(R.id.pie1063);
        p1064=findViewById(R.id.pie1064);
        p1065=findViewById(R.id.pie1065);
        p1066=findViewById(R.id.pie1066);
        p1067=findViewById(R.id.pie1067);
        p1068=findViewById(R.id.pie1068);
        p1069=findViewById(R.id.pie1069);
        p1070=findViewById(R.id.pie1070);
        p1071=findViewById(R.id.pie1071);
        p1072=findViewById(R.id.pie1072);
        p1073=findViewById(R.id.pie1073);
        p1074=findViewById(R.id.pie1074);
        p1075=findViewById(R.id.pie1075);
        p1076=findViewById(R.id.pie1076);
        p1077=findViewById(R.id.pie1077);
        p1078=findViewById(R.id.pie1078);
        p1079=findViewById(R.id.pie1079);
        p1080=findViewById(R.id.pie1080);
        p1081=findViewById(R.id.pie1081);
        p1082=findViewById(R.id.pie1082);
        p1083=findViewById(R.id.pie1083);
        p1084=findViewById(R.id.pie1084);
        p1085=findViewById(R.id.pie1085);
        p1086=findViewById(R.id.pie1086);
        p1087=findViewById(R.id.pie1087);
        p1088=findViewById(R.id.pie1088);
        p1089=findViewById(R.id.pie1089);
        p1090=findViewById(R.id.pie1090);
        p1091=findViewById(R.id.pie1091);
        p1092=findViewById(R.id.pie1092);
        p1093=findViewById(R.id.pie1093);
        p1094=findViewById(R.id.pie1094);
        p1095=findViewById(R.id.pie1095);
        p1096=findViewById(R.id.pie1096);
        p1097=findViewById(R.id.pie1097);
        p1098=findViewById(R.id.pie1098);
        p1099=findViewById(R.id.pie1099);
        p10100=findViewById(R.id.pie10100);    }


}
