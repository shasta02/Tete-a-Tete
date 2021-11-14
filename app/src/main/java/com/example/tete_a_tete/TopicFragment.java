package com.example.tete_a_tete;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tete_a_tete.databinding.FragmentThirdBinding;
import com.example.tete_a_tete.databinding.FragmentTopicBinding;

public class TopicFragment extends Fragment {
    private FragmentTopicBinding binding;
    variables vars = new variables();
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentTopicBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vars.topic = "sports";
                NavHostFragment.findNavController(TopicFragment.this)
                        .navigate(R.id.action_topicFragment_to_cardFragment);
            }
        });

        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vars.topic = "food";
                NavHostFragment.findNavController(TopicFragment.this)
                        .navigate(R.id.action_topicFragment_to_cardFragment);//change destination?
            }
        });

        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vars.topic = "origin";
                NavHostFragment.findNavController(TopicFragment.this)
                        .navigate(R.id.action_topicFragment_to_cardFragment);//change destination?
            }
        });



    }





    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}