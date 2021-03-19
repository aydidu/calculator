package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
//    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bd, bmu, bm, bp, bc, be;
    TextView t1;
    int a, b;
    boolean isEqual = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.tview);
    }
    public void sob(View view) {
        if (t1.getText().toString().contains("=")) {
            t1.setText("");
        }
        switch (view.getId()){
            case R.id.b_0 :
                t1.append("0");
                break;
            case R.id.b_1 :
                t1.append("1");
                break;
            case R.id.b_2 :
                t1.append("2");
                break;
            case R.id.b_3 :
                t1.append("3");
                break;
            case R.id.b_4 :
                t1.append("4");
                break;
            case R.id.b_5 :
                t1.append("5");
                break;
            case R.id.b_6 :
                t1.append("6");
                break;
            case R.id.b_7 :
                t1.append("7");
                break;
            case R.id.b_8 :
                t1.append("8");
                break;
            case R.id.b_9 :
                t1.append("9");
                break;
            case R.id.b_u :
                if (t1.getText() != "") {
                    t1.append("*");
                    break;
                }
            case R.id.b_d :
                if (t1.getText() != "") {
                    t1.append("/");
                    break;
                }
            case R.id.b_p :
                if (t1.getText() != "") {
                    t1.append("+");
                    break;
                }
            case R.id.b_m :
                if (t1.getText() != "") {
                    t1.append("-");
                    break;
                }
            case R.id.b_c :
                t1.setText("");
                break;
        }
    }
    public void res(View view){
        isEqual = true;
        String text = t1.getText().toString();
        double res = 0.0;
        if (text.contains("+")) {
            int indexp = text.indexOf("+");
            a = Integer.parseInt(text.substring(0, indexp));
            b = Integer.parseInt(text.substring(indexp + 1));
            res = Double.valueOf(a) + Double.valueOf(b);

        }
        if (text.contains("-")) {
            int indexm = text.indexOf("-");
            a = Integer.parseInt(text.substring(0, indexm));
            b = Integer.parseInt(text.substring(indexm + 1));
            res = a - b;

        }
        else if (text.contains("*")) {
            int indexu = text.indexOf("*");
            a = Integer.parseInt(text.substring(0, indexu));
            b = Integer.parseInt(text.substring(indexu + 1));
            res = a * b;

        }
        else if (text.contains("/")) {
            int indexd = text.indexOf("/");
            a = Integer.parseInt(text.substring(0, indexd));
            b = Integer.parseInt(text.substring(indexd + 1));
            res = Double.valueOf(a) / Double.valueOf(b);

        }
        t1.append("=" + String.valueOf(res));
    }
}
