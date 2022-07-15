rootProject.name = "warden"

include(
    ":core",
    ":ktor",
    ":docs",
    ":atts",
)

project(":core").name = "warden-core"
project(":ktor").name = "warden-ktor"
project(":atts").name = "warden-atts"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

apply(from = "./buildSrc/repositories.settings.gradle.kts")

@Suppress("UnstableApiUsage") // Central declaration of repositories is an incubating feature
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
}
