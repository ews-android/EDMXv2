package com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.interfaces;

import android.app.ProgressDialog;
import android.view.View;
import android.widget.EditText;

import com.festivalguide.v2.edmx.activities.EDMXBaseActivity;

/**
 * Created by ahsan.ijaz on 7/27/2015.
 */
public interface EDMXBaseFragmentInterface {
    public ProgressDialog buildProgressDialog();
    public ProgressDialog buildProgressDialog(String title, String message);
    public void setupUI(View view);
    public void setUICallbacks();
    public void updateUI();
    public String getNavBarTitle();
    public void onMenuButtonClick();
    public void onBackButtonClick();
    public EDMXBaseActivity getEDMXActivity();
    public void popFragmentFromActivity();
    public void dismissKeyboard(EditText editText);
}
