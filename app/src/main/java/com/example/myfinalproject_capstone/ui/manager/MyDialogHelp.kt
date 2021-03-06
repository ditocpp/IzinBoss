package com.example.myfinalproject_capstone.ui.manager

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.myfinalproject_capstone.R

class MyDialogHelp : DialogFragment(){
    @SuppressLint("InflateParams")
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val alertDialog = AlertDialog.Builder(it)
            alertDialog.setView(requireActivity().layoutInflater.inflate(R.layout.dialog_help, null))
            alertDialog.setPositiveButton("Cancel", DialogInterface.OnClickListener({dialog, id ->
                dismiss()
            }))
            alertDialog.create()
        }?:throw IllegalStateException("Activity is null !!")
    }
}