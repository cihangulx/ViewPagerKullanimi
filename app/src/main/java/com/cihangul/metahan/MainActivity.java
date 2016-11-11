package com.cihangul.metahan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public ViewPager viewPager;
    TextView textView;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ViewPager Tanımlamaları
        fragmentManager = getSupportFragmentManager();
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        viewPager.setAdapter(new SayfaAdapter(fragmentManager));

    }
    public class SayfaAdapter extends FragmentPagerAdapter {

        public SayfaAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment fragment = null;
//Bu kısımda hangi sayfada nerenin görüntüleneceğini seçiyoruz.
            //0 birinci sayfa...
            if (position == 0) {
                fragment = new Sayfa1();
            } else if (position == 1) {
                fragment = new Sayfa2();
            } else if (position == 2) {
                fragment = new Sayfa3();
            } else if (position == 3) {
                fragment = new Sayfa4();
            }

            return fragment;
        }

        @Override
        public int getCount() {

            //kaç sayfa varsa onu yazacaksın
            return 4;

        }
    }
}
