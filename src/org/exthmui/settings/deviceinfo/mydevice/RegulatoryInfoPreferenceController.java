/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.exthmui.settings.deviceinfo.mydevice;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;

import com.android.settings.core.PreferenceControllerMixin;
import com.android.settings.R;
import com.android.settingslib.core.AbstractPreferenceController;

public class RegulatoryInfoPreferenceController extends AbstractPreferenceController implements
        PreferenceControllerMixin {

    private static final String KEY_REGULATORY_INFO = "regulatory_info";

    public RegulatoryInfoPreferenceController(Context context) {
        super(context);
    }

    @Override
    public boolean isAvailable() {
        return mContext.getResources().getBoolean(R.bool.config_show_regulatory_info);
    }

    @Override
    public String getPreferenceKey() {
        return KEY_REGULATORY_INFO;
    }
}