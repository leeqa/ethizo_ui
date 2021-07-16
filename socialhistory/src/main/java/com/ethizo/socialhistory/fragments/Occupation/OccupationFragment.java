package com.ethizo.socialhistory.fragments.Occupation;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.google.gson.Gson;
import androidx.fragment.app.Fragment;

import com.ethizo.socialhistory.R;
import com.ethizo.socialhistory.model.occupation.Occupation;
import com.ethizo.socialhistory.model.occupation.OccupationData;
import com.ethizo.socialhistory.utilities.MaterialSpinner;

public class OccupationFragment extends Fragment {
    private Button btnSave;


    public OccupationFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_occupation, container, false);
        btnSave = view.findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Occupation occupation = new Occupation();
                OccupationData occupationData = occupation.data;

                occupationData.Employment = ((EditText)view.findViewById(R.id.edtEmployment).findViewById(R.id.etFloating)).getText().toString();
                occupationData.Status = ((MaterialSpinner)view.findViewById(R.id.cslEmploymentStatus).findViewById(R.id.customMaterialSpinner)).getText().toString();
                occupationData.Phone = ((EditText)view.findViewById(R.id.edtPhone).findViewById(R.id.etFloating)).getText().toString();
                occupationData.PhoneExt = ((EditText)view.findViewById(R.id.edtPhoneExt).findViewById(R.id.etFloating)).getText().toString();
                occupationData.Restrictions = ((MaterialSpinner)view.findViewById(R.id.cslRestrictions).findViewById(R.id.customMaterialSpinner)).getText().toString();
                occupationData.Occupation = ((MaterialSpinner)view.findViewById(R.id.cslOccupation).findViewById(R.id.customMaterialSpinner)).getText().toString();
                occupationData.Retired = ((EditText)view.findViewById(R.id.edtRetired).findViewById(R.id.etFloating)).getText().toString();

                Log.e( "onClick: ", new Gson().toJson(occupation));


            }
        });
        return view;
    }
}