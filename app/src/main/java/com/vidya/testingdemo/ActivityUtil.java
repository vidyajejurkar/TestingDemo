package com.vidya.testingdemo;

import android.content.Context;
import android.content.Intent;

import com.vidya.testingdemo.main.MainActivity;


public class ActivityUtil {
  private Context context;

  public ActivityUtil(Context context) {
    this.context = context;
  }

  public void startMainActivity() {
    context.startActivity(new Intent(context, MainActivity.class));
  }
}
