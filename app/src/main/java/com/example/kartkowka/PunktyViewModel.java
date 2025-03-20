package com.example.kartkowka;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PunktyViewModel extends ViewModel {
    private MutableLiveData<Integer> points;
    public MutableLiveData<Integer> getPunkty() {
        if(points == null){
            points = new MutableLiveData<>();
            points.setValue(0);
        }
        return points;
    }
    public void setpunkty(MutableLiveData<Integer> points) {
        this.points = points;
    }
    public void addpunkty(int p){
        if(points==null)
        {
            points = new MutableLiveData<>();
            points.setValue(0);
        }
        else{
            points.setValue(points.getValue()+p);
        }


    }
}
