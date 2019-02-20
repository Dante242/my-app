package dante.notepad.com.appblockdenotas.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dante.notepad.com.appblockdenotas.R;

public class MainFragment extends Fragment {
        //por defecto se debe crear este metodo para crear la interfaz
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //crear la vista
        View rootView;
        rootView =inflater.inflate(R.layout.fragment_layout,container,false);


        return rootView;
    }
}
