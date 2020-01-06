package com.aakriti.imageviewer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    RadioButton rdnRose, rdnMe, rdnMom;
    ImageView imgPhoto;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdnRose =findViewById(R.id.rdoRose);
        rdnMe =findViewById(R.id.rdoMe);
        rdnMom= findViewById(R.id.rdoMom);

        imgPhoto= findViewById(R.id.imgPhoto);

        rdnRose.setOnClickListener(this);
        rdnMe.setOnClickListener(this);
        rdnMom.setOnClickListener(this);
        builder= new AlertDialog.Builder(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.rdoRose :
                builder.setMessage("Do you want to load message ? "). setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        imgPhoto.setImageResource(R.drawable.me);
                    }
                })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                               /* imgPhoto.setImageResource(R.drawable.me);
*/
                            }
                        });

                AlertDialog alert= builder.create();
                alert.setTitle("My Title");
                alert.show();

                break;

            case R.id.rdoMe :
                imgPhoto.setImageResource(R.drawable.a);
                break;

            case R.id.rdoMom :
                imgPhoto.setImageResource(R.drawable.hihi);
                break;


        }

    }






}
