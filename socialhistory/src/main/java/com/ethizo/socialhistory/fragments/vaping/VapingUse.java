package com.ethizo.socialhistory.fragments.vaping;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;

import com.ethizo.socialhistory.R;
import com.ethizo.socialhistory.model.vaping.Vaping;
import com.ethizo.socialhistory.model.vaping.VapingData;
import com.ethizo.socialhistory.utilities.MaterialSpinner;
import com.google.gson.Gson;
public class VapingUse extends Fragment {

    private Button btnSave;

    public VapingUse() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vaping_use, container, false);


        btnSave = view.findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vaping vaping = new Vaping();
                VapingData data = vaping.data;
                data.durationAgeStarted = ((EditText)view.findViewById(R.id.edtAgeStarted).findViewById(R.id.etFloating)).getText().toString();
                data.durationAgeStopped = ((EditText)view.findViewById(R.id.edtAgeStopped).findViewById(R.id.etFloating)).getText().toString();
                data.deviceType = ((MaterialSpinner)view.findViewById(R.id.cslDeviceType).findViewById(R.id.customMaterialSpinner)).getText().toString();
                data.deviceTypeOther = ((EditText)view.findViewById(R.id.edtDeviceType).findViewById(R.id.etFloating)).getText().toString();
                data.frequency = ((MaterialSpinner)view.findViewById(R.id.cslFrequency).findViewById(R.id.customMaterialSpinner)).getText().toString();
                data.frequencyOther = ((EditText)view.findViewById(R.id.edtFrequency).findViewById(R.id.etFloating)).getText().toString();
                data.currentStrength = ((MaterialSpinner)view.findViewById(R.id.cslCurrentStrength).findViewById(R.id.customMaterialSpinner)).getText().toString();
                data.currentStrengthOther = ((EditText)view.findViewById(R.id.edtCurrentStrength).findViewById(R.id.etFloating)).getText().toString();
                data.previousStrength = ((MaterialSpinner)view.findViewById(R.id.cslPreviousStrength).findViewById(R.id.customMaterialSpinner)).getText().toString();
                data.previousStrengthOther = ((EditText)view.findViewById(R.id.edtPreviousStrength).findViewById(R.id.etFloating)).getText().toString();

                int vapingReasonSelectedId = ((RadioGroup)view.findViewById(R.id.rgrpVapingReason)).getCheckedRadioButtonId();
                data.vapingReason = ((RadioButton)view.findViewById(vapingReasonSelectedId)).getText().toString();
                data.vapingReasonOther = ((EditText)view.findViewById(R.id.edtVapingReason).findViewById(R.id.etFloating)).getText().toString();

                int vapingCessationDiscussedSelectedId = ((RadioGroup)view.findViewById(R.id.rgrpVapingReason)).getCheckedRadioButtonId();
                data.vapingCessationDiscussed = ((RadioButton)view.findViewById(vapingCessationDiscussedSelectedId)).getText().toString();
                data.vapingCessationDiscussedComments = ((EditText)view.findViewById(R.id.edtVappingCessationDiscussedComment).findViewById(R.id.etFloating)).getText().toString();




                Log.e( "onClick: ", new Gson().toJson(vaping));
            }
        });
        return view;
    }
}