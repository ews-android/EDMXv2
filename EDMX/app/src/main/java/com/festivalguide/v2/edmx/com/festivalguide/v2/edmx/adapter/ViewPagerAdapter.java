package com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.festivalguide.v2.edmx.R;

/**
 * Created by ahsan.ijaz on 8/12/2015.
 */
public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    String[] rank;
    String[] country;
    String[] population;
    int[] flag;
    LayoutInflater inflater;

    public ViewPagerAdapter(Context context, String[] rank, String[] country,
                            String[] population, int[] flag) {
        this.context = context;
        this.rank = rank;
        this.country = country;
        this.population = population;
        this.flag = flag;
    }

    @Override
    public int getCount() {
        return rank.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        // Declare Variables
        TextView txtrank;
        TextView txtcountry;
        TextView txtpopulation;
        TextView featuredText;
        ImageView imgflag;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.viewpager_item, container,
                false);

        // Locate the TextViews in viewpager_item.xml
        //txtrank = (TextView) itemView.findViewById(R.id.rank);
        //txtcountry = (TextView) itemView.findViewById(R.id.country);
        //txtpopulation = (TextView) itemView.findViewById(R.id.population);

        // Capture position and set to the TextViews
        //txtrank.setText(rank[position]);
        //txtcountry.setText(country[position]);
        //txtpopulation.setText(population[position]);

        featuredText = (TextView) itemView.findViewById(R.id.featuredText);

        featuredText.setText(country[position]);

        // Locate the ImageView in viewpager_item.xml
        imgflag = (ImageView) itemView.findViewById(R.id.flag);
        // Capture position and set to the ImageView
        imgflag.setImageResource(flag[position]);

        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ((ViewPager) container).removeView((RelativeLayout) object);
    }
}
