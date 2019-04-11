package com.lambdaschool.linededittext;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lambdaschool.linededittext.views.LinedEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // S04M04-10 construct a view and add it programmatically
        /*LinedEditText view = new LinedEditText(this);
        view.setPreviousColor(Color.MAGENTA);
        view.setOffset(25);
        view.setThickness(10);
        view.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce malesuada elit sed dolor lobortis lobortis. Suspendisse potenti. Donec efficitur ornare leo, vitae placerat lorem convallis ac. Fusce prets tortor leo ac mauris. Pellentesque nec pharetra dolor. Nulla blandit tristique sem ultricies consequat. Quisque ut sem pellentesque, vehicula augue sed, malesuada libero.");

        ((ViewGroup)findViewById(R.id.parent)).addView(view);*/

        // S04M04-11A utilize your custom methods to adjust vie on the fly
        /*LinedEditText view = findViewById(R.id.edit_view);
        view.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus) {
                    ((LinedEditText)v).setPreviousColor(Color.RED);
                }
            }
        });*/
    }
}
