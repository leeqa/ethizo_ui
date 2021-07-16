package com.ethizo.socialhistory.fragments.DietHistory;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.ethizo.socialhistory.R;
import com.ethizo.socialhistory.model.breakfast.Breakfast;
import com.ethizo.socialhistory.utilities.MaterialSpinner;
import com.google.gson.Gson;

public class BreakfastFragment extends Fragment {


    public BreakfastFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_breakfast, container, false);
        DietHistoryFragment.initTitles(view, "Breakfast");

        Button btnSave = view.findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*                Breakfast breakfast = new Breakfast();
                String breakfast1 = ((EditText)view.findViewById(R.id.edtBreakfast1).findViewById(R.id.etFloating)).getText().toString();
                String breakfast2 = ((EditText)view.findViewById(R.id.edtBreakfast2).findViewById(R.id.etFloating)).getText().toString();
                String breakfast3 = ((EditText)view.findViewById(R.id.edtBreakfast3).findViewById(R.id.etFloating)).getText().toString();
                String breakfast4 = ((EditText)view.findViewById(R.id.edtBreakfast4).findViewById(R.id.etFloating)).getText().toString();
                String breakfast5 = ((EditText)view.findViewById(R.id.edtBreakfast5).findViewById(R.id.etFloating)).getText().toString();


                String serving1 = ((MaterialSpinner)view.findViewById(R.id.cslServing1).findViewById(R.id.customMaterialSpinner)).getText().toString();
                String serving2 = ((MaterialSpinner)view.findViewById(R.id.cslServing2).findViewById(R.id.customMaterialSpinner)).getText().toString();
                String serving3 = ((MaterialSpinner)view.findViewById(R.id.cslServing3).findViewById(R.id.customMaterialSpinner)).getText().toString();
                String serving4 = ((MaterialSpinner)view.findViewById(R.id.cslServing4).findViewById(R.id.customMaterialSpinner)).getText().toString();
                String serving5 = ((MaterialSpinner)view.findViewById(R.id.cslServing5).findViewById(R.id.customMaterialSpinner)).getText().toString();

                String measure1 = ((EditText)view.findViewById(R.id.edtMeasure1).findViewById(R.id.etFloating)).getText().toString();
                String measure2 = ((EditText)view.findViewById(R.id.edtMeasure2).findViewById(R.id.etFloating)).getText().toString();
                String measure3 = ((EditText)view.findViewById(R.id.edtMeasure3).findViewById(R.id.etFloating)).getText().toString();
                String measure4 = ((EditText)view.findViewById(R.id.edtMeasure4).findViewById(R.id.etFloating)).getText().toString();
                String measure5 = ((EditText)view.findViewById(R.id.edtMeasure5).findViewById(R.id.etFloating)).getText().toString();



                breakfast.addBreakfast("","","");


                Log.e("onClick: ", new Gson().toJson(breakfast));*/
            }
        });
        return view;
    }
}