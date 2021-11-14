package com.example.tete_a_tete;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tete_a_tete.databinding.FragmentCard4Binding;
import com.example.tete_a_tete.databinding.FragmentCardBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cardFragment4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cardFragment4 extends Fragment {
    private FragmentCard4Binding binding;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentCard4Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment cardFragment4.
     */
    // TODO: Rename and change types and number of parameters
    public static cardFragment4 newInstance(String param1, String param2) {
        cardFragment4 fragment = new cardFragment4();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView9.setText(
                        "Who was your first kiss?");
            }
        });
    }
}