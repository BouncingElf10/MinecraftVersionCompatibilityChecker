
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-client-core:2.3.7")
    implementation("io.ktor:ktor-client-cio:2.3.7")
    implementation("io.ktor:ktor-client-content-negotiation:2.3.7")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.7")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.2")
}

plugins {
    `kotlin-dsl`
    kotlin("jvm") version "2.0.0"
    kotlin("plugin.serialization") version "2.0.0"
    id("com.gradle.plugin-publish") version "1.2.1"
}


group = "com.bouncingelf10"
version = "1.3.0"

gradlePlugin {
    website = "https://github.com/BouncingElf10/MinecraftVersionCompatibilityChecker"
    vcsUrl = "https://github.com/BouncingElf10/MinecraftVersionCompatibilityChecker"

    plugins {
        create("minecraftVersionCompatibilityChecker") {
            id = "com.bouncingelf10.minecraft-version-compatibility-checker"
            displayName = "MinecraftVersionCompatibilityChecker"
            description = "A gradle plugin that tests if your mod is compatible with other versions automatically"
            tags = listOf("minecraft", "fabric", "modding")
            implementationClass = "fabric.compat.FabricCompatPlugin"
        }
    }
}