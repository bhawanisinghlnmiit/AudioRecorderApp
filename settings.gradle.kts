pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AudioRecorderApp"
include(":app")
include(":common")
include(":build-logic")

include(":core:ui")
include(":core:designsystem")
include(":core:data")
include(":core:di")
include(":core:domain")

include(":model:apiresponse")
include(":model:entity")

include(":features:feature-record")
