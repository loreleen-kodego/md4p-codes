package com.sablot.activity.objects_and_classes.exercises.two

class Task(
    val id: Int,
    val description: String,
    val deadline: String
) {

    init {
        require(id > 0) {"ID must be greater than 0"}
        require(description.isNotBlank()) {"Description cannot be blank"}

        //Format yyyy-MM-dd
        require(deadline.matches(Regex("\\d{4}-\\d{2}-\\d{2}")))
        {"Deadline must be in the format of 'yyyy-MM-dd"}
    }


    companion object {
        fun sortById(tasks: List<Task>): List<Task> {
            return tasks.sortedBy {
                it.id
            }
        }

        fun sortByDeadline(tasks: List<Task>) : List<Task> {
            return tasks.sortedBy { it.deadline }
        }
    }
}




fun main() {

    //Task() -> object
    //Task.sortById ->

    val tasks = listOf(
        Task(2, "Write report", "2022-04-20"),
        Task(1, "Clean kitchen", "2022-03-05"),
        Task(3, "Buy groceries", "2022-03-10")
    )

    val tasksById = Task.sortById(tasks)
    val tasksByDeadline = Task.sortByDeadline(tasks)

    println("Tasks sorted by ID")
    tasksById.forEach {
        println(it.id.toString() + " " + it.description + " " + it.deadline)
    }

    println("Tasks sorted by Deadline")
    tasksByDeadline.forEach {
        println(it.id.toString() + " " + it.description + " " + it.deadline)
    }

}