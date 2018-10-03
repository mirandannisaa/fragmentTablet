package com.example.okejon.fragmentberita;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BeritaListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void onShowDetails(View view){
//        Intent intent = new Intent(this, DetailActivity.class);
//        startActivity(intent);
//    }

    /*@Override
    public void itemClicked(long id){
        View fragmentContainer = findViewById(R.id.fragment_container);
        if(fragmentContainer != null){
            ResepDetailFragment details = new ResepDetailFragment();
        }else{

        }
    }*/
    public void itemClicked(long id) {
        View fragmentDetail = findViewById(R.id.detailingFrag);
        if(fragmentDetail!=null){
            DetailBeritaFragment deta = new DetailBeritaFragment();

            FragmentTransaction fragTrans = getSupportFragmentManager().beginTransaction();
            deta.setBerita(id);
            fragTrans.replace(R.id.detailingFrag,deta);
            fragTrans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            fragTrans.addToBackStack(null);
            fragTrans.commit();
        }else{
            Toast.makeText(this, "Item " + id + " was clicked", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this.getApplicationContext(), DetailActivity.class);
            Bundle b = new Bundle();
            b.putDouble("id",id);
            intent.putExtras(b);
            startActivity(intent);
        }
    }
}
