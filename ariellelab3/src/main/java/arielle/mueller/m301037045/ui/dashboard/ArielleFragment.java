package arielle.mueller.m301037045.ui.dashboard;

//Arielle Mueller
//Student Number: 301037045
//Sec: 002

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import arielle.mueller.m301037045.R;

public class ArielleFragment extends Fragment {

    private ArielleViewModel drawingViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        drawingViewModel =
                ViewModelProviders.of(this).get(ArielleViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mueller, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        drawingViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}