plugins {
    kotlin("multiplatform")
}

kotlin {
    androidTarget()  // Android
    ios()           // iOS
    js(IR) {        // Веб
        browser()
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.1")
            }
        }
    }
}