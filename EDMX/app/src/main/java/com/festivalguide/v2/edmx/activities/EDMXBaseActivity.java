package com.festivalguide.v2.edmx.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.festivalguide.v2.edmx.R;
import com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.fragments.HomeFragment;
import com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.fragmentbase.EDMXBaseFragment;
import com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.helpers.EDMXFragmentHelper;

public class EDMXBaseActivity extends Activity implements HomeFragment.OnFragmentInteractionListener, EDMXBaseFragment.OnFragmentInteractionListener{

    private EDMXFragmentHelper fragmentHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_activity);

        fragmentHelper = new EDMXFragmentHelper(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edmxbase, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void clearBackStack(){

        FragmentManager fm = this.getFragmentManager();
		for(int i = 0; i < fm.getBackStackEntryCount(); ++i) {
        fm.popBackStack(null, 0);
        fm.popBackStackImmediate();
			fm.executePendingTransactions();
		}
    }

    public void openHomeScreen()
    {
        HomeFragment homefrag;

        homefrag = new HomeFragment();


        clearBackStack();

        fragmentHelper.pushFragment(homefrag, R.id.fragmentContainer, "TEST",false,false);



    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
