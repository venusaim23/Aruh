package com.test.aruh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.test.aruh.databinding.FragmentActivityBinding;

public class ActivityFragment extends Fragment {

    private FragmentActivityBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentActivityBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textActivity;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}