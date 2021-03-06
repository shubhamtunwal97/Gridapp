package markproj.markproject;

import android.content.Context;
import android.graphics.Color;
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

public class PieMaker {

//
//    PieChart pieChart;
//
//    int type;boolean spin;
//    Context con;
//
//    public PieMaker(PieChart pieChart, int type, boolean spin, Context con) {
//        this.pieChart = pieChart;
//        this.type = type;
//        this.spin = spin;
//        this.con = con;
//    }

    static void makePie(PieChart pieChart, int type, boolean spin, Context con){


//        pieChart.setExtraOffsets(-10, 0, -10, -200);

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


        pieChart.setExtraOffsets(-10,0,-10,0);
        pieChart.invalidate();
        if(spin){
            Animation animation = AnimationUtils.loadAnimation(con, R.anim.rotate);
            pieChart.startAnimation(animation);

        }

    }




    public static int getRandom(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
