package edu.bu.projectportal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import edu.bu.projectportal.ProjectListAdapter.ProjectListViewHolder

class ProjectListAdapter(private val projects: Array<Project>) : RecyclerView.Adapter<ProjectListViewHolder>() {
    private var listener: Listener? = null

    interface Listener {
        fun onClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.project_list_item, parent,
                false)
        return ProjectListViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ProjectListViewHolder, position: Int) {
        viewHolder.projTitleView.text = projects[position].title
        viewHolder.cardView.setOnClickListener { view ->
            //Intent intent = new Intent(view.getContext(), ProjectDetailActivity.class);
            //intent.putExtra("projectid", position);
            //view.getContext().startActivity(intent);
            listener = view.context as Listener
            if (listener != null) listener!!.onClick(position)
        }
    }

    fun setListener(listener: Listener?) {
        this.listener = listener
    }

    override fun getItemCount(): Int {
        return projects.size
    }

    //ViewHolder inner class
    class ProjectListViewHolder(itemView: View) : ViewHolder(itemView) {
        val projTitleView: TextView
        val cardView: CardView

        init {
            cardView = itemView as CardView
            projTitleView = itemView.findViewById<View>(R.id.projListTitleTextViewId) as TextView
        }
    }
}