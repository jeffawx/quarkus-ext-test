import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    kotlin("jvm") version "1.8.22"
    `maven-publish`
}

allprojects {
    apply(plugin="maven-publish")
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin="java-library")
    apply(plugin = "org.jetbrains.kotlin.jvm")

    publishing {
        publications {
            val sourcesJar by tasks.registering(Jar::class) {
                archiveClassifier.set("sources")
                from(sourceSets.main.get().allSource)
            }

            create<MavenPublication>("default") {
                from(components["java"])
                artifact(sourcesJar.get())
            }
        }
    }

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