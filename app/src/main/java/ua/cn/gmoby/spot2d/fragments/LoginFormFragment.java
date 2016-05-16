package ua.cn.gmoby.spot2d.fragments;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import ua.cn.gmoby.spot2d.R;


public class LoginFormFragment extends Fragment implements  View.OnFocusChangeListener{

    public LoginFormFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login_form, container, false);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (v instanceof  EditText){
            Log.w("TAG", "onFocusChange: ");
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
