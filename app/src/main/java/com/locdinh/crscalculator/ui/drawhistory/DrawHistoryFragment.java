package com.locdinh.crscalculator.ui.drawhistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.locdinh.crscalculator.R;

public class DrawHistoryFragment extends Fragment {

    private DrawHistoryViewModel drawHistoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        drawHistoryViewModel =
                new ViewModelProvider(this).get(DrawHistoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_drawhistory, container, false);
        final TextView textView = root.findViewById(R.id.text_draw_history);
        drawHistoryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}