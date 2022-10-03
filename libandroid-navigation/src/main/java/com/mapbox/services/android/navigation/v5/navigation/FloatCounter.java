package com.mapbox.services.android.navigation.v5.navigation;

import androidx.annotation.Keep;

@Keep
class FloatCounter extends Counter<Float> {

  FloatCounter(String name, Float value) {
    super(name, value);
  }
}
