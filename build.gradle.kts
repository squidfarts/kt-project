import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val junitJupiterVer = "5.3.1"

plugins {
    application
    kotlin("jvm") version "1.3.41"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterVer")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVer")
}

application {
    applicationName = rootProject.name
    mainClassName = "MainKt"
    group = "com.squidfarts.idea.project"
    version = "0.1.0"
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}