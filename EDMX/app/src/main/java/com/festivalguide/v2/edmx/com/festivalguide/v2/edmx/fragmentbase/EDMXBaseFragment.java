package com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.fragmentbase;

import android.app.Activity;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.festivalguide.v2.edmx.R;
import com.festivalguide.v2.edmx.activities.EDMXBaseActivity;
import com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.interfaces.EDMXBaseFragmentInterface;
import com.festivalguide.v2.edmx.com.festivalguide.v2.edmx.interfaces.EDMXFragmentNestedNavigationInterface;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link EDMXBaseFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.

 * create an instance of this fragment.
 */
public abstract class EDMXBaseFragment extends Fragment implements EDMXFragmentNestedNavigationInterface, EDMXBaseFragmentInterface{
    @Override
    public ProgressDialog buildProgressDialog() {
        return null;
    }

    @Override
    public ProgressDialog buildProgressDialog(String title, String message) {
        return null;
    }

    @Override
    public void setupUI(View view) {

    }

    @Override
    public void setUICallbacks() {

    }

    @Override
    public void updateUI() {

    }

    @Override
    public String getNavBarTitle() {
        return null;
    }

    @Override
    public void onMenuButtonClick() {

    }

    @Override
    public void onBackButtonClick() {

    }

    @Override
    public EDMXBaseActivity getEDMXActivity() {
        return null;
    }

    @Override
    public void popFragmentFromActivity() {

    }

    @Override
    public void dismissKeyboard(EditText editText) {

    }


    @Override
    public void pushFragment(EDMXBaseActivity activity, EDMXBaseFragment fragment, boolean animated, boolean backStack) {

    }

    @Override
    public void pushFragment(EDMXBaseFragment fragment, boolean animated, boolean backStack) {

    }

    @Override
    public void popLastFragmentFromActivity() {

    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment EDMXBaseFragment.
     */
    // TODO: Rename and change types and number of parameters
//    public static EDMXBaseFragment newInstance(String param1, String param2) {
//        EDMXBaseFragment fragment = new EDMXBaseFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

    public EDMXBaseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edmxbasefragment, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
