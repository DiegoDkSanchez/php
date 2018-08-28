package sv.ub.com.guia_3_paises.Contract;

import sv.ub.com.guia_3_paises.Model.Pais;

/**
 * Created by DK-Ragnar on 27/8/2018.
 */

public interface PaisContract {

    interface View{
        void showCountryInfo(Pais pais);
        void showError();


    }
    interface Presenter{
        void getCountryInfo(String country);

    }
}
