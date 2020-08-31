package edu.bu.projectportal

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


/**
 * A simple [Fragment] subclass.
 */
class ProjectDetailFragment : Fragment() {
    var projectId = 0
        private set


    private var titleTextView: TextView? = null
    private var summaryTextView: TextView? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_project_detail, container, false)
        titleTextView = view.findViewById(R.id.projTitleTextViewId)
        summaryTextView = view.findViewById(R.id.projSummaryTextViewId)
        projectId = 0
        Log.d(TAG, " Project Id: $projectId")
        setProject(projectId)
        return view
    }

    fun setProject(projId: Int) {
        projectId = projId
        titleTextView!!.text = Project.projects[projectId].title
        summaryTextView!!.text = Project.projects[projectId].summary
    }

    companion object {
        private val TAG = ProjectDetailFragment::class.java.simpleName
    }
}
