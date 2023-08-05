pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        id("io.quarkus.extension") version "3.2.2.Final"
    }
}

include("my-ext")
project(":my-ext").projectDir = File("runtime")

include("my-ext-deployment")
project(":my-ext-deployment").projectDir = File("deployment")
