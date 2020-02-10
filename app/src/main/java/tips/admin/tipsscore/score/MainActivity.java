package tips.admin.tipsscore.score;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String PREF_NAMES="myscore";
TextView score;
Button add,sub;
Context context;
int Score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        score=(TextView)findViewById ( R.id.score );
        add=(Button)findViewById ( R.id.increase );
        sub=(Button)findViewById ( R.id.decrease );
        SharedPreferences myScore=getSharedPreferences ("myscore", Context.MODE_PRIVATE);
        Score=myScore.getInt ( "score_value",0 );
        score.setText ( "SCORE :  "+Score );
        add.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Score+=45;
                SharedPreferences.Editor editor= sharedPreferences.edit ();
                editor.putInt                 SharedPreferences sharedPreferences=getSharedPreferences ("myscore", Context.MODE_PRIVATE);
                ( "score_value",Score);
                editor.commit ();
                score.setText ( "SCORE :  "+Score );

            }
        } );
        sub.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Score-=21;
                SharedPreferences sharedPreferences=getSharedPreferences ("myscore", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor= sharedPreferences.edit ();
                editor.putInt ( "score ",Score);
                editor.commit ();
                score.setText ( "SCORE :  "+Score );
            }
        } );
    }
}
