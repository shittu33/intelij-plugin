package com.github.shittu33.intelijplugin.services

import com.github.shittu33.intelijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
