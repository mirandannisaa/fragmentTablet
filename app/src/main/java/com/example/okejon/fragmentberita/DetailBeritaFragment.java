package com.example.okejon.fragmentberita;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailBeritaFragment extends Fragment {

    private long beritaId;
    public DetailBeritaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_berita, container, false);
    }

    public void setBerita(long id)
    {
        this.beritaId = id;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView tittle = (TextView) view.findViewById(R.id.textJudul);
            Berita br = Berita.beritaku[(int) beritaId];
            tittle.setText(br.getNama_berita());

            TextView detail = (TextView) view.findViewById(R.id.textDetail);
            detail.setText(br.getDetail_berita());

            ImageView img = (ImageView) view.findViewById(R.id.gambar);
            img.setImageResource(br.getGambar());

            TextView auth = (TextView) view.findViewById(R.id.textAuth);
            auth.setText(br.get_author());

            TextView tanggal = (TextView) view.findViewById(R.id.textTanggal);
            tanggal.setText(br.get_date());
        }
    }

}
