// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCallsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final Toolbar calltoolbar;

  @NonNull
  public final RecyclerView recyclerview;

  private ActivityCallsBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView bottomNavigationView, @NonNull Toolbar calltoolbar,
      @NonNull RecyclerView recyclerview) {
    this.rootView = rootView;
    this.bottomNavigationView = bottomNavigationView;
    this.calltoolbar = calltoolbar;
    this.recyclerview = recyclerview;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCallsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCallsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_calls, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCallsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      id = R.id.calltoolbar;
      Toolbar calltoolbar = ViewBindings.findChildViewById(rootView, id);
      if (calltoolbar == null) {
        break missingId;
      }

      id = R.id.recyclerview;
      RecyclerView recyclerview = ViewBindings.findChildViewById(rootView, id);
      if (recyclerview == null) {
        break missingId;
      }

      return new ActivityCallsBinding((ConstraintLayout) rootView, bottomNavigationView,
          calltoolbar, recyclerview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
