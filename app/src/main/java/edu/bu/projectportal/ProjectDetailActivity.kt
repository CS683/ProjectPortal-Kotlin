package edu.bu.projectportal

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class ProjectDetailActivity : AppCompatActivity() {
    var projectDetailFragment: ProjectDetailFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_detail)

        //add fragments dynamically
        //create a fragment object
        projectDetailFragment = ProjectDetailFragment()
        projectDetailFragment!!.setArguments(intent.extras)
        // get the reference to the FragmentManger object
        val fragManager = supportFragmentManager
        // get the reference to the FragmentTransaction object
        val transaction = fragManager.beginTransaction()
        // add the fragment into the transaction
        transaction.add(R.id.proDetailfragContainer, projectDetailFragment!!)
        // commit the transaction.
        transaction.commit()
    }

    fun onClick(view: View?) {
        val id: Int = projectDetailFragment!!.projectId
        projectDetailFragment!!.setProject((id + 1) % Project.projects.size)
    }
}