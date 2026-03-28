## Minecraft Version Compatibility Checker

A Gradle plugin that verifies your minecraft mod's compatibility across different Minecraft versions.

## Usage

```kotlin
plugins {
    id("com.bouncingelf10.minecraft-version-compatibility-checker") version "1.X.0"
}
```
check version at: [the gradle website](https://plugins.gradle.org/plugin/com.bouncingelf10.minecraft-version-compatibility-checker)

`checkMinecraftCompatibility` -> starts the testing

`bumpMinecraftVersion` -> bumps the current version by one

`revertCompatPatches` -> reverts the changes if you made the plugin change any files

## Config

All options are set via the fabricCompat block in your build.gradle. Everything has a good default, unless something is wrong you should need to change anything.

```groovy
// build.gradle
minecraftCompat {
    // Max consecutive failures before stopping in one direction
    // Default: 3
    maxStrikes = 3

    // Test newer Minecraft versions
    // Default: true
    checkNewerVersions = true

    // Test older Minecraft versions
    // Default: true
    checkOlderVersions = true

    // Override Fabric Loom version
    // Default: auto-detected
    loomVersion = null

    // Override Fabric Loader version
    // Default: latest stable
    loaderVersion = null

    // Override NeoForge version
    // Default: latest per MC version
    neoforgeVersion = null

    // Tasks to run per version check
    // Use ["compileJava"] for faster checks
    // Default: ["build"]
    buildTasks = ["build"]

    // Extra JVM args for Gradle daemons
    // Default: []
    daemonJvmArgs = ["-Xmx2g"]

    // Print full logs even on success
    // Default: false
    verbose = false

    // Direction for version bumping
    // true = newer, false = older
    // Default: true
    bumpUp = true

    // Force a specific target version instead of auto-detecting
    // Example: "1.21.4"
    bumpTargetVersion = null
}
```
