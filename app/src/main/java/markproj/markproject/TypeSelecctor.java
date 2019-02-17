package markproj.markproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

public class TypeSelecctor extends AppCompatActivity {

    RadioButton rd1,rd2,rd4,rds,rdc,rdg;

    int gridx,crtype;
     String mode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_selecctor);


        rd1=findViewById(R.id.rd1);
        rd2=findViewById(R.id.rd2);
        rd4=findViewById(R.id.rd4);
        rds=findViewById(R.id.rdstd);
        rdc=findViewById(R.id.rdrc);
        rdg=findViewById(R.id.rdrg);



        findViewById(R.id.btgj).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gridx=getIntent().getIntExtra("type",3);

                if(rd1.isChecked()){
                    crtype=1;

                }else if(rd2.isChecked()){
                    crtype=2;
                }else if(rd4.isChecked()){
                    crtype=4;
                }

                if(rds.isChecked()){
                    mode="std";
                }else if(rdg.isChecked()){
                    mode="rdg";
                }else if(rdc.isChecked()){
                    mode="rdc";
                }
                Log.e("Gr", "onClick: "+mode+"\n"+crtype+"\n"+gridx );

                doIt(mode,crtype,gridx);
            }
        });


    }

    private void doIt(String mode, int crtype, int gridx) {

        switch (gridx){
            case 2:
                Intent i2 =new Intent(TypeSelecctor.this,Activity22.class);
                i2.putExtra("mode",mode);
                i2.putExtra("tp",crtype);
                startActivity(i2);
                break;
            case 3:
                Intent i3 =new Intent(TypeSelecctor.this,Activity33.class);
                i3.putExtra("mode",mode);
                i3.putExtra("tp",crtype);
                startActivity(i3);
                break;
            case 4:
                Intent i4 =new Intent(TypeSelecctor.this,Activity44.class);
                i4.putExtra("mode",mode);
                i4.putExtra("tp",crtype);
                startActivity(i4);
                break;
            case 5:
                Intent i5 =new Intent(TypeSelecctor.this,Activity55.class);
                i5.putExtra("mode",mode);
                i5.putExtra("tp",crtype);
                startActivity(i5);
                break;
            case 6:
                Intent i6 =new Intent(TypeSelecctor.this,Activity66.class);
                i6.putExtra("mode",mode);
                i6.putExtra("tp",crtype);
                startActivity(i6);
                break;
            case 7:
                Intent i7 =new Intent(TypeSelecctor.this,Activity77.class);
                i7.putExtra("mode",mode);
                i7.putExtra("tp",crtype);
                startActivity(i7);
                break;
            case 8:
                Intent i8 =new Intent(TypeSelecctor.this,Activity88.class);
                i8.putExtra("mode",mode);
                i8.putExtra("tp",crtype);
                startActivity(i8);
                break;
            case 9:
                Intent i9 =new Intent(TypeSelecctor.this,Activity99.class);
                i9.putExtra("mode",mode);
                i9.putExtra("tp",crtype);
                startActivity(i9);
                break;
            case 10:
                Intent i10 =new Intent(TypeSelecctor.this,Activity1010.class);
                i10.putExtra("mode",mode);
                i10.putExtra("tp",crtype);
                startActivity(i10);
                break;

        }
    }
}
