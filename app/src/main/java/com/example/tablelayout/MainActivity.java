package com.example.tablelayout;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static ArrayList<Country> countries = new ArrayList<>();
    private TableLayout tableLayout;
    private TableRow tableRow;
    private ScrollView scrollView;
    private HorizontalScrollView horizontalScrollView;
    private static RecyclerView recyclerView;
    private Button button;

    private static CountryAdapter countryAdapter;

    private static final String NAMESPACE = "http://www.oorsprong.org/websamples.countryinfo";
    private static final String URL = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
    private static final String METHOD_NAME = "ListOfCountryNamesByName";
    private static final String SOAP_ACTION = "http://www.oorsprong.org/websamples.countryinfo/CountryInfoService";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
    }

    // Iniciar configuración de Adapter
    void setupRecyclerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        countryAdapter = new CountryAdapter(this, countries, country -> {
            Toast.makeText(this, country.getsName(), Toast.LENGTH_SHORT).show();
        });
        recyclerView.setAdapter(countryAdapter);
    }

    private class CallWebServiceTask extends AsyncTask<Void, Void, List<Country>> {
        @Override
        protected List<Country> doInBackground(Void... voids) {
            try {
                countries.clear();

                SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
                SoapSerializationEnvelope envelope = getSoapSerializationEnvelope(request);
                HttpTransportSE transport = getHttpTransportSE();

                transport.call(SOAP_ACTION, envelope);

                SoapObject response = (SoapObject) envelope.getResponse();

                for (int i = 0; i < response.getPropertyCount(); i++) {
                    SoapObject countryObject = (SoapObject) response.getProperty(i);
                    String code = countryObject.getProperty("sISOCode").toString();
                    String name = countryObject.getProperty("sName").toString();
                    countries.add(new Country(code, name));
                }

            } catch (Exception e) {
                Log.e("ERROR", e.getMessage());
                return null;
            }
            return countries;
        }

        @Override
        protected void onPostExecute(List<Country> result) {
            if (result != null) {
                // Luego de la llamada al web service se pinta el listado en el adapter
                setupRecyclerView();
            } else {
                Log.e("ERROR", "Error al llamar al servicio web");
            }
        }
    }

    void initButton() {
        button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            // Iniciando TableLayout
            initTabletLayout();

            // Llamando web service
            initWebService();
        });
    }

    void initTabletLayout() {
        // Inicialización de variables de componentes
        recyclerView = findViewById(R.id.recycler_view);
        tableLayout = findViewById(R.id.tableLayout);
        scrollView = findViewById(R.id.scrollView);
        horizontalScrollView = findViewById(R.id.horizontalScrollView);
    }

    // Recorriendo lista de personas
    void initWebService() {
        new CallWebServiceTask().execute();
    }

    // Configuracion SoapSerializationEnvelope //
    public static SoapSerializationEnvelope getSoapSerializationEnvelope(SoapObject request) {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = true;
        envelope.implicitTypes = true;
        envelope.setAddAdornments(false);
        //envelope.encodingStyle = SoapSerializationEnvelope.XSD;
        envelope.setOutputSoapObject(request);
        return envelope;
    }

    // Configuracion HttpTransportSE //
    public static HttpTransportSE getHttpTransportSE() {
        HttpTransportSE ht = new HttpTransportSE(URL);
        ht.debug = true;
        ht.setXmlVersionTag("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        return ht;
    }

}