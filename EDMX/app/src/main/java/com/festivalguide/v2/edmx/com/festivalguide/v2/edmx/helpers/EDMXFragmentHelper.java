package com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.helpers;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import com.festivalguide.v2.edmx.R;
import com.festivalguide.v2.edmx.activities.EDMXBaseActivity;
import com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.fragmentbase.EDMXBaseFragment;
import com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.interfaces.EDMXFragmentNestedNavigationInterface;

/**
 * Created by ahsan.ijaz on 7/27/2015.
 */
public class EDMXFragmentHelper implements EDMXFragmentNestedNavigationInterface{

    private FragmentManager fm;
    private FragmentTransaction ft;


    public EDMXFragmentHelper(EDMXBaseActivity activity)
    {
        fm = activity.getFragmentManager();
       // supportFm = activity.getSupportFragmentManager();
    }
    public void pushFragment(Fragment fragment, int container, String tag, boolean animated, boolean putInBackStack) {
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        //if (animated) fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right);

        fragmentTransaction.replace(container, fragment, tag);

        if (putInBackStack) fragmentTransaction.addToBackStack(tag);

        fragmentTransaction.commit();
    }

    public void pushFragment(Fragment fragment, int container, boolean animated, boolean putInBackStack) {
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
       // if (animated) fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right);

        fragmentTransaction.replace(container, fragment);

        if (putInBackStack) fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }



    @Override
    public String getEDMXTag() {
        return null;
    }

    @Override
    public void pushFragment(EDMXBaseActivity activity, EDMXBaseFragment fragment, boolean animated, boolean backStack) {
        pushFragment(fragment, R.id.fragmentContainer, fragment.getEDMXTag(), animated, backStack);
    }

    @Override
    public void pushFragment(EDMXBaseFragment fragment, boolean animated, boolean backStack) {
        pushFragment(fragment, R.id.fragmentContainer, fragment.getEDMXTag(), animated, backStack);
    }

    @Override
    public void popLastFragmentFromActivity() {

    }
}
