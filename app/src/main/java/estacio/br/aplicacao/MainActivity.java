package estacio.br.aplicacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nome = findViewById(R.id.edtNome);
        EditText sobreNome = findViewById(R.id.edtSobreNome);
        EditText idade = findViewById(R.id.edtIdade);
        EditText altura = findViewById(R.id.edtAltura);
        EditText peso = findViewById(R.id.edtPeso);
    }
}
