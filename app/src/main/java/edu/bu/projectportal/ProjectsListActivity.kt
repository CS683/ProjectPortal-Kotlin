package edu.bu.projectportal

/**
 * Created by danazh on 4/23/18.
 */
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ProjectsListActivity : AppCompatActivity(), ProjectListAdapter.Listener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects_list)
    }

    override fun onClick(position: Int) {
        val detailFragment = getSupportFragmentManager().findFragmentById(R.id.detailfragment) as ProjectDetailFragment?
        if (detailFragment != null) {
            detailFragment.setProject(position)
        } else {
            val intent = Intent(this, ProjectDetailActivity::class.java)
            intent.putExtra("projectId", position)
            startActivity(intent)
        }
    }
}