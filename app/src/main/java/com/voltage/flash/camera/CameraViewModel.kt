/*
 * SPDX-FileCopyrightText: 2023 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.voltage.flash.camera

import androidx.camera.video.Quality
import androidx.camera.video.Recording
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.voltage.flash.utils.GridMode
import com.voltage.flash.utils.Rotation
import com.voltage.flash.utils.TimerMode

/**
 * [ViewModel] representing a camera session. This data is used to receive
 * live data regarding the setting currently enabled.
 */
class CameraViewModel : ViewModel() {
    // Base

    /**
     * The camera currently in use.
     */
    val camera = MutableLiveData<Camera>()

    /**
     * Current camera mode.
     */
    val cameraMode = MutableLiveData<CameraMode>()

    /**
     * Whether the current session is in single capture mode.
     */
    val inSingleCaptureMode = MutableLiveData(false)

    /**
     * Current camera state.
     */
    val cameraState = MutableLiveData<CameraState>()

    /**
     * Current screen rotation.
     */
    val screenRotation = MutableLiveData<Rotation>()

    // General

    /**
     * Flash mode.
     */
    val flashMode = MutableLiveData(FlashMode.AUTO)

    /**
     * Grid mode.
     */
    val gridMode = MutableLiveData<GridMode>()

    /**
     * Timer mode.
     */
    val timerMode = MutableLiveData<TimerMode>()

    // Photo

    /**
     * Photo capture mode.
     */
    val photoCaptureMode = MutableLiveData<Int>()

    /**
     * Photo aspect ratio.
     */
    val photoAspectRatio = MutableLiveData<Int>()

    /**
     * Photo effect.
     */
    val photoEffect = MutableLiveData<Int>()

    // Video

    /**
     * Video quality.
     */
    val videoQuality = MutableLiveData<Quality>()

    /**
     * Video frame rate.
     */
    val videoFrameRate = MutableLiveData<FrameRate?>()

    /**
     * Video mic mode.
     */
    val videoMicMode = MutableLiveData<Boolean>()

    /**
     * Video [Recording].
     */
    val videoRecording = MutableLiveData<Recording?>()

    /**
     * Video recording duration.
     */
    val videoRecordingDuration = MutableLiveData<Long>()
}
