package br.edu.utfpr.pg.projeto;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

//import static br.edu.utfpr.pg.projeto.R.id.image;

public class MainActivity extends AppCompatActivity {

    Image images;

    protected static void InsertImage()
    {
       // images.setImageResorce(R.drawable.eu);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        InsertImage();

    }
}
