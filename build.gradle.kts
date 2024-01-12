plugins {
    `maven-publish`
    kotlin("jvm") version "1.6.10" apply false
    id("com.android.library") version "8.0.2" apply false
    id("org.jetbrains.kotlin.multiplatform") version "1.9.21" apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
    id("org.jetbrains.compose") version "1.6.0-dev1357" apply false
}

ext {
    extra["compileSdkVersion"] = 34
    extra["minSdkVersion"] = 24
    extra["targetSdkVersion"] = 34
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
