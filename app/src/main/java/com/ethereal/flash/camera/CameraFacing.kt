/*
 * SPDX-FileCopyrightText: 2022 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ethereal.flash.camera

enum class CameraFacing(
    val cameraType: CameraType,
) {
    UNKNOWN(
        CameraType.INTERNAL,
    ),
    FRONT(
        CameraType.INTERNAL,
    ),
    BACK(
        CameraType.INTERNAL,
    ),
    EXTERNAL(
        CameraType.EXTERNAL,
    ),
}
