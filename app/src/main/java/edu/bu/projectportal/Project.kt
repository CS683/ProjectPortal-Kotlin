package edu.bu.projectportal


/**
 * Created by danazh on 2/21/18.
 */
class Project(var title: String, var summary: String) {

    override fun toString(): String {
        return "Project{" +
                "title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                '}'
    }

    companion object {
        val projects = arrayOf(
                Project("Weather Forecast", "Weather Forcast is an app ..."),
                Project("Connect Me", "Connect Me is an app ... "),
                Project("What to Eat", "What to Eat is an app ..."),
                Project("Project Portal", "Project Portal is an app ...")
        )
    }

}
