package br.unigran.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double n1,n2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSoma=(Button)findViewById(R.id.btnSoma);
        Button btnSubtrai=(Button)findViewById(R.id.btnSubtrai);
        Button btnMultiplica=(Button)findViewById(R.id.btnMultiplica);
        Button btnDivide=(Button)findViewById(R.id.btnDivide);

        TextView tvResultado=(TextView)findViewById(R.id.tvResultado);
        EditText etValor1=(EditText)findViewById(R.id.etValor1);
        EditText etValor2=(EditText)findViewById(R.id.etValor2);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(etValor1.getText().toString());
                n2=Double.parseDouble(etValor2.getText().toString());
                res=n1+n2;
                tvResultado.setText(String.valueOf(res));
            }
        });

        btnSubtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(etValor1.getText().toString());
                n2=Double.parseDouble(etValor2.getText().toString());
                res=n1-n2;
                tvResultado.setText(String.valueOf(res));
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(etValor1.getText().toString());
                n2=Double.parseDouble(etValor2.getText().toString());
                res=n1*n2;
                tvResultado.setText(String.valueOf(res));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(etValor1.getText().toString());
                n2=Double.parseDouble(etValor2.getText().toString());
                res=n1/n2;
                tvResultado.setText(String.valueOf(res));
            }
        });

    }
}