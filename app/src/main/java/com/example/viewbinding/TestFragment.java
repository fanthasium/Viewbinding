package com.example.viewbinding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.viewbinding.databinding.FragTestBinding;

public class TestFragment extends Fragment {

    private FragTestBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        binding = FragTestBinding.inflate(inflater,container,false);

        binding.btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.tvFragment.setText("프래그먼트 출력 !");
            }
        });
        return binding.getRoot();
    }
}
