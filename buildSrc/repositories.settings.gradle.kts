// A settings.gradle.kts plugin for defining shared repositories used by both buildSrc and the root project

@Suppress("UnstableApiUsage") // Central declaration of repositories is an incubating feature
dependencyResolutionManagement {

    repositories {
        jcenter()
        mavenCentral()
        gradlePluginPortal()
    }

    pluginManagement {
        repositories {
            jcenter()
            gradlePluginPortal()
            mavenCentral()
        }
    }
}
