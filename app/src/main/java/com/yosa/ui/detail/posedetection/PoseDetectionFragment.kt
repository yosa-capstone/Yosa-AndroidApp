package com.yosa.ui.detail.posedetection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yosa.Constanta.EXTRA_DETAIL
import com.yosa.R

class PoseDetectionFragment : Fragment() {
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(EXTRA_DETAIL)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pose_detection, container, false)
    }

    companion object {
        fun newInstance(param1: String) =
            PoseDetectionFragment().apply {
                arguments = Bundle().apply {
                    putString(EXTRA_DETAIL, param1)
                }
            }
    }
}