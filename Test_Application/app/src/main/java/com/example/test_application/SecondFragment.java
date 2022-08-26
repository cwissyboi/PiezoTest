package com.example.test_application;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {
    private Button sendButton;
    private SeekBar lowCutFrequency;
    private SeekBar lowCutSlope;

    private SeekBar highCutFrequency;
    private SeekBar highCutSlope;

    private SeekBar peakGain;
    private SeekBar peakQuality;
    private SeekBar peakFrequency;


    private TextView lowCutValue;
    private TextView lowCutSlopeValue;
    private TextView highCutValue;
    private TextView highCutSlopeValue;
    private TextView peakGainValue;
    private TextView peakQualityValue;
    private TextView peakFrequencyValue;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });


        initialiseAllUIElements(view);
        setUpListeners();




    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    private void initialiseAllUIElements(View view) {
        sendButton = (Button) view.findViewById(R.id.send_button);
        lowCutFrequency = (SeekBar) view.findViewById(R.id.lowCutFrequency);
        lowCutSlope = (SeekBar) view.findViewById(R.id.lowCutSlope);
        highCutFrequency = (SeekBar) view.findViewById(R.id.highCutFrequency);
        highCutSlope = (SeekBar) view.findViewById(R.id.highCutSlope);
        peakGain = (SeekBar) view.findViewById(R.id.peakGain);
        peakQuality = (SeekBar) view.findViewById(R.id.peakQuality);
        peakFrequency = (SeekBar) view.findViewById(R.id.peakFrequency);


        lowCutValue = (TextView) view.findViewById(R.id.lowCutValue);
        lowCutSlopeValue = (TextView) view.findViewById(R.id.lowCutSlopeValue);
        highCutValue = (TextView) view.findViewById(R.id.highCutValue);
        highCutSlopeValue = (TextView) view.findViewById(R.id.highCutSlopeValue);
        peakGainValue = (TextView) view.findViewById(R.id.peakGainValue);
        peakQualityValue = (TextView) view.findViewById(R.id.peakQualityValue);
        peakFrequencyValue = (TextView) view.findViewById(R.id.PeakFrequencyValue);


        lowCutFrequency.setMin(20);
        lowCutFrequency.setMax(20000);

        highCutFrequency.setMin(20);
        highCutFrequency.setMax(20000);

        peakFrequency.setMin(20);
        peakFrequency.setMax(20000);

        peakGain.setMin(-24);
        peakGain.setMax(24);


        peakQuality.setMin(1);
        peakQuality.setMax(10);


        lowCutSlope.setMin(12);
        lowCutSlope.setMax(48);

        highCutSlope.setMin(12);
        highCutSlope.setMax(48);

    }

    private void setUpListeners() {


        lowCutFrequency.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                lowCutValue.setText(progress + " Hz");

            }
        });


        highCutFrequency.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                highCutValue.setText(progress + " Hz");

            }
        });


       peakFrequency.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                peakFrequencyValue.setText(progress + " Hz");

            }
        });


        peakQuality.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                peakQualityValue.setText(progress + " ");

            }
        });

        peakGain.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                peakGainValue.setText(progress + " db");

            }
        });

        lowCutSlope.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub

                int realValue = progress - (progress % 12);
                lowCutSlopeValue.setText(realValue + " db/Oct");

            }
        });


        highCutSlope.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub

                int realValue = progress - (progress % 12);
                highCutSlopeValue.setText(realValue + " db/Oct");

            }
        });
    }
}