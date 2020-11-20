package com.halit.fragmentrecyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;

    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);
        myrecyclerview = v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Burak Ozcivit","(347) 7817575",R.drawable.burakozcivit));
        lstContact.add(new Contact("Acun Ilicali","(347) 7817576",R.drawable.acunilicali));
        lstContact.add(new Contact("Demet Ozdemir","(347) 7817577",R.drawable.demetozdemir));
        lstContact.add(new Contact("Fahriye Evcen","(347) 7817578",R.drawable.fahriyeevcen));
        lstContact.add(new Contact("Hadise uyanik","(347) 7817579",R.drawable.hadise));
        lstContact.add(new Contact("Hande Ercel","(347) 7817580",R.drawable.handeercel));
        lstContact.add(new Contact("Nusret Kasap","(347) 7817581",R.drawable.nusret));
        lstContact.add(new Contact("Neslihan Atagul","(347) 7817582",R.drawable.neslihanatagul));
        lstContact.add(new Contact("Murat Boz","(347) 7817583",R.drawable.muratboz));
        lstContact.add(new Contact("Burak Ozcivit","(347) 7817575",R.drawable.burakozcivit));
        lstContact.add(new Contact("Acun Ilicali","(347) 7817576",R.drawable.acunilicali));
        lstContact.add(new Contact("Demet Ozdemir","(347) 7817577",R.drawable.demetozdemir));
        lstContact.add(new Contact("Fahriye Evcen","(347) 7817578",R.drawable.fahriyeevcen));
        lstContact.add(new Contact("Hadise uyanik","(347) 7817579",R.drawable.hadise));
        lstContact.add(new Contact("Hande Ercel","(347) 7817580",R.drawable.handeercel));
        lstContact.add(new Contact("Nusret Kasap","(347) 7817581",R.drawable.nusret));
        lstContact.add(new Contact("Neslihan Atagul","(347) 7817582",R.drawable.neslihanatagul));
        lstContact.add(new Contact("Murat Boz","(347) 7817583",R.drawable.muratboz));

    }
}
