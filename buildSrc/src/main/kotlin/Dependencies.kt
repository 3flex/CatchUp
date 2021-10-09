object Versions {
    const val minAndroidSdk = 23
    const val compileSdk = 31
    const val targetSdk = compileSdk

    const val kotlin = "1.5.21"

    const val appCompat = "1.3.1"

    //compose
    const val compose = "1.0.1"
    const val navCompose = "2.4.0-alpha10"
    const val accompanist = "0.19.0"
    const val coilCompose = "1.4.0"
}

object Dependencies {
    object Gradle {
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }

    object Android {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    }

    object Compose {
        const val ui = "androidx.compose.ui:ui:${Versions.compose}"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
        const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
        const val material = "androidx.compose.material:material:${Versions.compose}"
        const val navigation = "androidx.navigation:navigation-compose:${Versions.navCompose}"
        const val jUnit = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
        const val coilCompose = "io.coil-kt:coil-compose:${Versions.coilCompose}"
        const val accompanistNavigationAnimation =  "com.google.accompanist:accompanist-navigation-animation:${Versions.accompanist}"
    }
}