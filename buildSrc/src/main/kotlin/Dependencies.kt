object Versions {
    const val minAndroidSdk = 23
    const val compileSdk = 31
    const val targetSdk = compileSdk

    const val kotlin = "1.5.30"
}

object Deps {
    object Gradle {
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }
}