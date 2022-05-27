package com.github.ivansky.testwebstormplugin.services

import com.intellij.openapi.project.Project
import com.github.ivansky.testwebstormplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
