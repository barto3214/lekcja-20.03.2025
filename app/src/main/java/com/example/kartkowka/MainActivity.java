package com.example.kartkowka;

import androidx.appcompat.app.AppCompatActivity;
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
        binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addpunkty(1);
                binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addpunkty(2);
                binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.addpunkty(3);
                binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
            }
        });
    }
}