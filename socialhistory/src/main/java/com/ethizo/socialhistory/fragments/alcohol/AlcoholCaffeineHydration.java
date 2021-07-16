package com.ethizo.socialhistory.fragments.alcohol;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.ethizo.socialhistory.model.alcohol.Alcohol;
import com.ethizo.socialhistory.model.alcohol.AlcoholData;
import com.ethizo.socialhistory.utilities.MaterialSpinner;
import com.google.gson.Gson;

import androidx.fragment.app.Fragment;

import com.ethizo.socialhistory.R;


public class AlcoholCaffeineHydration extends Fragment {
    private Button btnSave;

    public AlcoholCaffeineHydration() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alcohol_caffeine_hydration, container, false);
        btnSave = view.findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Alcohol alcohol = new Alcohol();
                AlcoholData alcoholData = alcohol.data;

                int DrinkAlcohol = ((RadioGroup)view.findViewById(R.id.rgrpDoYouDrinkAlcohol)).getCheckedRadioButtonId();
                alcoholData.DrinkAlcohol = ((RadioButton)view.findViewById(DrinkAlcohol)).getText().toString();

                alcoholData.TypeOfAlcohol = ((MaterialSpinner)view.findViewById(R.id.cslTypeOfAlcohol).findViewById(R.id.customMaterialSpinner)).getText().toString();
                alcoholData.Frequency = ((MaterialSpinner)view.findViewById(R.id.cslFrequency).findViewById(R.id.customMaterialSpinner)).getText().toString();
                alcoholData.Amount = ((MaterialSpinner)view.findViewById(R.id.cslAmount).findViewById(R.id.customMaterialSpinner)).getText().toString();
                alcoholData.LastDrink = ((MaterialSpinner)view.findViewById(R.id.cslLastDrink).findViewById(R.id.customMaterialSpinner)).getText().toString();
                alcoholData.FiveOrMoreDrinks = ((EditText)view.findViewById(R.id.edtDrinksInDay).findViewById(R.id.etFloating)).getText().toString();

                int ConsumeCaffeine = ((RadioGroup)view.findViewById(R.id.rgrpDoYouDrinkCaffeine)).getCheckedRadioButtonId();
                alcoholData.ConsumeCaffeine = ((RadioButton)view.findViewById(ConsumeCaffeine)).getText().toString();

                alcoholData.TypeOfCaffeine1 = ((MaterialSpinner)view.findViewById(R.id.cslTypeOfCaffeine1).findViewById(R.id.customMaterialSpinner)).getText().toString();
                alcoholData.TypeOfCaffeine2 = ((MaterialSpinner)view.findViewById(R.id.cslTypeOfCaffeine2).findViewById(R.id.customMaterialSpinner)).getText().toString();
                alcoholData.CaffeinePerDay = ((MaterialSpinner)view.findViewById(R.id.cslCaffeinePerDay).findViewById(R.id.customMaterialSpinner)).getText().toString();
                alcoholData.Hydration = ((MaterialSpinner)view.findViewById(R.id.cslHydration).findViewById(R.id.customMaterialSpinner)).getText().toString();

                Log.e( "onClick: ", new Gson().toJson(alcohol));

            }
        });


        return view;
    }
}