package com.example.agussantoso.njajal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CeritaDetailFragment extends Fragment {
    private long CeritaId;


    public CeritaDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cerita_detail, container, false);
    }
    public void setResep(long id){
        this.CeritaId = id;
    }
    public void onStart() {
        super.onStart();
        View view = getView();

        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Cerita resepmakanan = Cerita.resepmakanan[(int) CeritaId];

            title.setText(resepmakanan.getJudul_cerita());

            TextView harga = (TextView) view.findViewById(R.id.textHarga);
            harga.setText(resepmakanan.getNama_pengarang());

            TextView tipe = (TextView) view.findViewById(R.id.textTipe);
            tipe.setText(resepmakanan.getNama_editor());

            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(resepmakanan.getIsi());


        }
    }


}
