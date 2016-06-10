package me.roney.alertdialogbug;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;

public class DatePickerFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.custom_dialog_view, null);
        return new AlertDialog.Builder(getActivity())
                .setTitle("Buggy McBuggybug")
                .setView(v)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
