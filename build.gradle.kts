import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    kotlin("jvm") version "1.8.22"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin="java-library")
    apply(plugin="maven-publish")
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "demo"
    version = "1.0"

    tasks {
        kotlin {
            jvmToolchain(17)
        }

        withType<KotlinCompile> {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
            }
        }

        test {
            systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
            useJUnitPlatform()
        }
    }
}