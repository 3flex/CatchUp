import io.gitlab.arturbosch.detekt.Detekt

plugins {
    id("com.android.application")
    kotlin("android")
    id("io.gitlab.arturbosch.detekt")
}

android {
    compileSdk = Versions.compileSdk

    buildFeatures {
        compose = true
    }

    defaultConfig {
        applicationId = "com.catchup.app"
        minSdk = Versions.minAndroidSdk
        targetSdk = Versions.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

detekt {
    source = files("src/main/kotlin", "src/test/kotlin", "src/androidTest/kotlin")
    buildUponDefaultConfig = true // preconfigure defaults
    allRules = false // activate all available (even unstable) rules.
    baseline = file("./detekt-baseline.yml")
    ignoreFailures = false
    config =
        files("$rootDir/detekt-config.yml") // point to your custom config defining rules to run, overwriting default behavior

    reports {
        xml.enabled = true // checkstyle like format mainly for integrations like Jenkins
    }
}

tasks.withType<Detekt>().configureEach {
    // Target version of the generated JVM bytecode. It is used for type resolution.
    jvmTarget = "1.8"
}

dependencies {

    implementation(Dependencies.Android.appCompat)

    //Compose
    debugImplementation(Dependencies.Compose.uiTooling)

    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.navigation)
    implementation(Dependencies.Compose.coilCompose)
    implementation(Dependencies.Compose.uiToolingPreview)
    implementation(Dependencies.Compose.accompanistNavigationAnimation)

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")
    androidTestImplementation(Dependencies.Compose.jUnit)

}