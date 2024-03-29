/*
 * SPDX-FileCopyrightText: 2022 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ethereal.flash

import com.ethereal.flash.camera.CameraMode

@androidx.camera.camera2.interop.ExperimentalCamera2Interop
@androidx.camera.core.ExperimentalZeroShutterLag
class QrScannerActivity : CameraActivity() {
    override fun overrideInitialCameraMode() = CameraMode.QR
}
