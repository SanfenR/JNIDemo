package co.fensan.android.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("hello");
    }


    TextView mHelloText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloText = (TextView) findViewById(R.id.hello);
        mHelloText.setText(sayHelloByJNI());
    }

    public native String sayHelloByJNI();
}
