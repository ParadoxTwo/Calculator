package paradox.com.calculatoradd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
    }

    static double numsa=0;
    static double numdm=1;
    static int op=-1;
    static int count=0;
    static boolean flag=true;
    public void add(View v){
        count++;
        op=0;
        if(count>1)
            return;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(flag){
            numsa = Double.parseDouble(textView.getText().toString());
            numdm = numsa;
            flag=false;
        }
        else
            equal(v);
        textView.setText("0");
    }
    public void sub(View v){
        count++;
        op=1;
        if(count>1)
            return;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(flag){
            numsa = Double.parseDouble(textView.getText().toString());
            numdm = numsa;
            flag=false;
        }
        else
            equal(v);
        textView.setText("0");
    }
    public void mul(View v){
        count++;
        op=2;
        if(count>1)
            return;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(flag){
            numsa = Double.parseDouble(textView.getText().toString());
            numdm = numsa;
            flag=false;
        }
        else
            equal(v);
        textView.setText("0");
    }
    public void div(View v){
        count++;
        op=3;
        if(count>1)
            return;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(flag){
            numsa = Double.parseDouble(textView.getText().toString());
            numdm = numsa;
            flag=false;
        }
        else
            equal(v);
        textView.setText("0");
    }
    public void back(View v){
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("0");
    }
    public void clear(View v){
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("0");
        op=-1;
        flag=true;
        numdm=1;
        numsa=0;
    }
    public void equal(View v){
        TextView textView = (TextView) findViewById(R.id.textView);
        switch(op){
            case 0 : {
                numsa = numsa + Double.parseDouble(textView.getText().toString());
                numdm = numsa;
                break;
            }
            case 1 : {
                numsa = numsa - Double.parseDouble(textView.getText().toString());
                numdm = numsa;
                break;
            }
            case 2 : {
                numdm = numdm * Double.parseDouble(textView.getText().toString());
                numsa = numdm;
                break;
            }
            case 3 : {
                numdm = numdm / Double.parseDouble(textView.getText().toString());
                numsa = numdm;
                break;
            }
            default :{
                break;
            }
        }
        textView.setText(""+numdm);
        flag=true;
    }
    public void period(View view) {
        count=0;
        int i=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        String t = textView.getText().toString();
        for(;i<t.length();i++)
            if(t.charAt(i)=='.')
                return;
        textView.setText(textView.getText()+".");
    }
    public void zero(View view) {
        count=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getText().toString().equals("0"))
            textView.setText("0");
        else
            textView.setText(textView.getText()+"0");
    }
    public void one(View view) {
        count=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getText().toString().equals("0"))
            textView.setText("1");
        else
            textView.setText(textView.getText()+"1");
    }
    public void two(View view) {
        count=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getText().toString().equals("0"))
            textView.setText("2");
        else
            textView.setText(textView.getText()+"2");
    }
    public void three(View view) {
        count=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getText().toString().equals("0"))
            textView.setText("3");
        else
            textView.setText(textView.getText()+"3");
    }
    public void four(View view) {
        count=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getText().toString().equals("0"))
            textView.setText("4");
        else
            textView.setText(textView.getText()+"4");
    }
    public void five(View view) {
        count=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getText().toString().equals("0"))
            textView.setText("5");
        else
            textView.setText(textView.getText()+"5");
    }
    public void six(View view) {
        count=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getText().toString().equals("0"))
            textView.setText("6");
        else
            textView.setText(textView.getText()+"6");
    }
    public void seven(View view) {
        count=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getText().toString().equals("0"))
            textView.setText("7");
        else
            textView.setText(textView.getText()+"7");
    }
    public void eight(View view) {
        count=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getText().toString().equals("0"))
            textView.setText("8");
        else
            textView.setText(textView.getText()+"8");
    }
    public void nine(View view) {
        count=0;
        TextView textView = (TextView) findViewById(R.id.textView);
        if(textView.getText().toString().equals("0"))
            textView.setText("9");
        else
            textView.setText(textView.getText()+"9");
    }
}
