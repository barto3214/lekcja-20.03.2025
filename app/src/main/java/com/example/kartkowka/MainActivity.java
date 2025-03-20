package com.example.kartkowka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.kartkowka.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    PunktyViewModel punktyViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        //.textView.setText("siema");            //jak chcesz sie dowiedziec jak to wszystko działa to ViewModel w neta
        punktyViewModel = new ViewModelProvider(this).get(PunktyViewModel.class);

        punktyViewModel.getPunkty().observe(this,
                new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer integer) {
                        binding.textView.setText(integer.toString());
                    }
                });

        binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addpunkty(1);

            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addpunkty(2);

            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addpunkty(3);

            }
        });

    }
}