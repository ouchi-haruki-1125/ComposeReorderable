pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    
}

plugins {
    id("org.gradle.toolchains.foojay-resolver") version("0.4.0")
}

rootProject.name = "ComposeReorderList"

include(":android")
include(":desktop")
include(":reorderable")
include(":web")
