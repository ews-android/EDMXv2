package com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.interfaces;

import com.festivalguide.v2.edmx.activities.EDMXBaseActivity;
import com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.fragmentbase.EDMXBaseFragment;

/**
 * Created by ahsan.ijaz on 7/27/2015.
 */
public interface EDMXFragmentNestedNavigationInterface {
    public String getEDMXTag();

    public void pushFragment(EDMXBaseActivity activity, EDMXBaseFragment fragment, boolean animated, boolean backStack);
   // public void pushFragment(EDMXBaseActivity activity, EDMXBaseListFragment fragment, boolean animated, boolean backStack);

    //	public void pushFragment(Fragment fragment, int container, String tag, boolean animated, boolean putInBackStack);
    public void pushFragment(EDMXBaseFragment fragment, boolean animated, boolean backStack);
    //public void pushFragment(EDMXBaseListFragment fragment, boolean animated, boolean backStack);
//	public void popFragment(Fragment fragment);

//	public void pushChildFragment(EDMXBaseFragment fragment, boolean animated, boolean backStack);
//	public void pushChildFragment(EDMXBaseListFragment fragment, boolean animated, boolean backStack);

    public void popLastFragmentFromActivity();
}
