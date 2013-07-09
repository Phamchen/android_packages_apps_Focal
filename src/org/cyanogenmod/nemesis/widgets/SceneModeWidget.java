/**
 * Copyright (C) 2013 The CyanogenMod Project
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package org.cyanogenmod.nemesis.widgets;

import android.content.Context;

import org.cyanogenmod.nemesis.CameraManager;
import org.cyanogenmod.nemesis.R;

public class SceneModeWidget extends SimpleToggleWidget {
    private static final String KEY_SCENEMODE = "scene-mode";

    public SceneModeWidget(CameraManager cam, Context context) {
        super(cam, context, KEY_SCENEMODE, R.drawable.ic_widget_scenemode);
        inflateFromXml(R.array.widget_scenemode_values, R.array.widget_scenemode_icons);
        restoreValueFromStorage(KEY_SCENEMODE);
    }
}
