package com.e.uas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class Onboarding extends AppCompatActivity {
    ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_onboarding);

        mViewPager = (ViewPager) findViewById (R.id.pager);
        mViewPager.setAdapter (new ViewPagerAdapter(
                getSupportFragmentManager ()
        ));

    }

    public class ViewPagerAdapter extends FragmentPagerAdapter {
        public ViewPagerAdapter(FragmentManager fm){super(fm);}

        @Override
        public Fragment getItem(int position) {
            if(position == 0){
                return new FragmentOnboarding1 ();
            }else if(position == 1){
                return new FragmentOnboarding2 ();
            }else{
                return new FragmentOnboarding3 ();
            }
        }
        public int getCount(){return 3;}
    }
}
