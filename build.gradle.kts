// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    dependencies {
        //Leave this here since this helps android studio to help auto update these.
        classpath("com.android.tools.build:gradle:7.0.2")
        classpath(Dependencies.Gradle.kotlin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
        classpath(Dependencies.Gradle.detekt)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}