package com.test.aruh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.test.aruh.databinding.FragmentGroupsBinding;

public class GroupsFragment extends Fragment {

    private FragmentGroupsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGroupsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGroups;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}