// Generated by view binder compiler. Do not edit!
package com.mintic2022.easyorder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.mintic2022.easyorder.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ItemProductsBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  private ItemProductsBinding(@NonNull CardView rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemProductsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemProductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_products, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemProductsBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ItemProductsBinding((CardView) rootView);
  }
}