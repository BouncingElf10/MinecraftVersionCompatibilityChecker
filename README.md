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