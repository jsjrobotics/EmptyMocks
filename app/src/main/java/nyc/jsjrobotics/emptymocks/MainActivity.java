package nyc.jsjrobotics.emptymocks;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            final ViewPager viewPager = (ViewPager) findViewById(R.id.content);
            viewPager.setAdapter(new DisplayedFragmentsAdapter(getFragmentManager()));
        }
    }
}
