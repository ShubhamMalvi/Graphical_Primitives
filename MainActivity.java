package com.example.graphical_primitives;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Creating a Bitmap
        Bitmap bg=Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);
//Setting the Bitmap as background for the ImageView
        ImageView i= findViewById(R.id.imageView);
        Drawable d = new BitmapDrawable(getResources(), bg);
        i.setImageDrawable(d);
//Creating the Canvas Object
        Canvas canvas=new Canvas(bg);
//Creating the Paint Object and set its color & TextSize
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setTextSize(75);
        canvas.drawText("Shubham Malvi",100,70,paint);
        paint.setColor(Color.RED);
        paint.setTextSize(50);
//To draw a Rectangle
        canvas.drawText("Rectangle",420,150,paint);
        canvas.drawRect(400,200,650,700,paint);
//To draw a Circle
        canvas.drawText("Circle",120,150,paint);
        canvas.drawCircle(200,350,150,paint);
//To draw a Square
        canvas.drawText("Square",120,800,paint);
        canvas.drawRect(50,850,350,1150,paint);
//To draw a Line
        canvas.drawText("Line",480,800,paint);
        canvas.drawLine(520,850,520,1150,paint);
    }
}
