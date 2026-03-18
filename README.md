## Minecraft Version Compatibility Checker

A Gradle plugin that verifies your fabric mod's compatibility across different Minecraft versions.

## Usage

```kotlin
plugins {
    id("com.bouncingelf10.minecraft-version-compatibility-checker") version "1.0.0"
}
```

`checkMinecraftCompatibility` -> starts the testing

`revertCompatPatches` -> reverts the changes if you made the plugin change any files

## Config

All options are set via the fabricCompat block in your build.gradle. Everything has a good default, unless something is wrong you should need to change anything.

```groovy
// build.gradle
fabricCompat {
    // How many consecutive failures in one direction before stopping.
    // Default: 3
    maxStrikes = 3

    // Whether to test versions newer than your current version.
    // Default: true
    checkNewerVersions = true

    // Whether to test versions older than your current version.
    // Default: true
    checkOlderVersions = true

    // Pin the Fabric Loom version used for test builds.
    // Default: null (auto-resolved from Fabric Maven)
    loomVersion = null

    // Pin the Fabric loader version used for test builds.
    // Default: null (latest stable loader)
    loaderVersion = null

    // Gradle tasks to run for each version check.
    // Use ["compileJava"] to skip jar packaging and run faster.
    // Default: ["build"]
    buildTasks = ["build"]

    // Extra JVM args for the Gradle daemon spawned per build.
    // Default: [] (no extra args)
    daemonJvmArgs = ["-Xmx2g"]

    // Print full build output for passing versions too.
    // Default: false
    verbose = false
}
```