package com.github.kwuerl.golandgoblinlinemarkers.services

import com.github.kwuerl.golandgoblinlinemarkers.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
