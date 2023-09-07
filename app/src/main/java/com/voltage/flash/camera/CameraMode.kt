/*
 * SPDX-FileCopyrightText: 2022 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.voltage.flash.camera

import androidx.annotation.StringRes
import com.voltage.flash.R

enum class CameraMode(@StringRes val title: Int) {
    PHOTO(R.string.camera_mode_photo),
    VIDEO(R.string.camera_mode_video),
    QR(R.string.camera_mode_qr),
}
