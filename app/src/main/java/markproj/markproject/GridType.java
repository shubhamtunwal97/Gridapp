package markproj.markproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GridType extends AppCompatActivity {

    Button p101;Button p102;Button p103;Button p104;Button p105;Button p106;Button p107;Button p108;Button p109;Button p1010;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_type);
        inf();


        p102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GridType.this,TypeSelecctor.class);
                i.putExtra("type",2);
                startActivity(i);
            }
        });
        p103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GridType.this,TypeSelecctor.class);
                i.putExtra("type",3);
                startActivity(i);
            }
        });
        p104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GridType.this,TypeSelecctor.class);
                i.putExtra("type",4);
                startActivity(i);
            }
        });
        p105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GridType.this,TypeSelecctor.class);
                i.putExtra("type",5);
                startActivity(i);
            }
        });
        p106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GridType.this,TypeSelecctor.class);
                i.putExtra("type",6);
                startActivity(i);
            }
        });
        p107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GridType.this,TypeSelecctor.class);
                i.putExtra("type",7);
                startActivity(i);
            }
        });
        p108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GridType.this,TypeSelecctor.class);
                i.putExtra("type",8);
                startActivity(i);
            }
        });
        p109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GridType.this,TypeSelecctor.class);
                i.putExtra("type",9);
                startActivity(i);
            }
        });
        p1010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(GridType.this,TypeSelecctor.class);
                i.putExtra("type",10);
                startActivity(i);
            }
        });
    }

    private void inf() {
        p102=findViewById(R.id.bt22);
        p103=findViewById(R.id.bt33);
        p104=findViewById(R.id.bt44);
        p105=findViewById(R.id.bt55);
        p106=findViewById(R.id.bt66);
        p107=findViewById(R.id.bt77);
        p108=findViewById(R.id.bt88);
        p109=findViewById(R.id.bt99);
        p1010=findViewById(R.id.bt1010);    }
}
