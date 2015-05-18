package za.co.morristech.android.demo.activities.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import za.co.morristech.android.demo.R;

/**
 * Created by Wade Morris.
 */
public class BaseActivity extends AppCompatActivity {

    private static final String TAG = BaseActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base);
    }

}
