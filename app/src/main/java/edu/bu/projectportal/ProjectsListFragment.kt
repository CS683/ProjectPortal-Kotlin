package edu.bu.projectportal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * A simple [Fragment] subclass.
 */
class ProjectsListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_projects_list, container, false)
        val projectsListRecyclerView = v.findViewById<View>(R.id.projectlist_recyclerview) as RecyclerView
        val projectListAdapter = ProjectListAdapter(Project.projects)
        projectsListRecyclerView.adapter = projectListAdapter
        projectListAdapter.setListener(activity as ProjectListAdapter.Listener?)

        val mLayoutManager = LinearLayoutManager(activity)
        projectsListRecyclerView.layoutManager = mLayoutManager
        return v
    }
}