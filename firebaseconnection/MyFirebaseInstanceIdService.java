package com.solution.s.firebaseconnection;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {


    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        //now we will have the token
        String token = FirebaseInstanceId.getInstance().getToken();

        Log.d("MyRefreshedToken", token);
    }
}