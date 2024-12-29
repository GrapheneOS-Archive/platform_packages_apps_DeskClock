plugins {
    id("com.android.application")
    kotlin("android")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

android {
    compileSdk = 35
    buildToolsVersion = "35.0.0"

    namespace = "com.android.deskclock"

    defaultConfig {
        versionCode = 15
        versionName = "1.0.001"
        minSdk = 35
        //noinspection ExpiredTargetSdkVersion
        targetSdk = 29
    }

    buildTypes {
        getByName("debug") {
            applicationIdSuffix = ".debug"
            resValue("string", "app_label", "Clock d")
        }
    }

    buildFeatures {
        buildConfig = true
    }

    sourceSets.getByName("main") {
        assets.srcDir("../assets")
        manifest.srcFile("../AndroidManifest.xml")
        java.srcDirs("../src")
        res.srcDir("../res")
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.annotation:annotation:1.9.1")
    implementation("androidx.collection:collection:1.4.5")
    implementation("androidx.arch.core:core-common:2.2.0")
    implementation("androidx.lifecycle:lifecycle-common:2.8.7")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.percentlayout:percentlayout:1.0.0")
    implementation("androidx.transition:transition:1.5.1")
    implementation("androidx.core:core:1.15.0")
    implementation("androidx.legacy:legacy-support-core-ui:1.0.0")
    implementation("androidx.media:media:1.7.0")
    implementation("androidx.legacy:legacy-support-v13:1.0.0")
    implementation("androidx.legacy:legacy-preference-v14:1.0.0")
    implementation("androidx.gridlayout:gridlayout:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}
