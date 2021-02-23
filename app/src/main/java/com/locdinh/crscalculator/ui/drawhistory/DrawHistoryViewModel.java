package com.locdinh.crscalculator.ui.drawhistory;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DrawHistoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DrawHistoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is draw history fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}