package sv.ub.com.guia_3_paises.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import sv.ub.com.guia_3_paises.Contract.PaisContract;
import sv.ub.com.guia_3_paises.Model.Pais;
import sv.ub.com.guia_3_paises.Presenter.CountryPresenter;
import sv.ub.com.guia_3_paises.R;

public class MainActivity extends AppCompatActivity implements PaisContract.View {

    CountryPresenter presenter;

    @BindView(R.id.txtInput)
    TextView input;

    @OnClick(R.id.btnBoton)
    public void submit(View view) {
       presenter.getCountryInfo(input.getText().toString());
    }

    @BindView(R.id.txtNombre)
    TextView nombre;

    @BindView(R.id.txtPoblacion)
    TextView poblacion;

    @BindView(R.id.txtExtencion)
    TextView extencion;

    @BindView(R.id.image)
    ImageView uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new CountryPresenter(this);

    }

    @Override
    public void showCountryInfo(Pais pais) {
        nombre.setText(pais.getNombre());
        poblacion.setText(pais.getPoblacion());
        extencion.setText(pais.getExtencion());

        Glide.with(uri.getContext()).load(pais.getUri()).into(uri);
    }

    @Override
    public void showError() {
        Toast.makeText(this, "Hubo un error", Toast.LENGTH_SHORT).show();
    }
}
