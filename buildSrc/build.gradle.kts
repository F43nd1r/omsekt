plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    val kotlinVersion: String by project
    implementation(kotlin("gradle-plugin:$kotlinVersion"))
    val dokkaVersion: String by project
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:$dokkaVersion")
    implementation("org.jetbrains.dokka:dokka-core:$dokkaVersion")
    val nexusPublishVersion: String by project
    implementation("io.github.gradle-nexus:publish-plugin:$nexusPublishVersion")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}
