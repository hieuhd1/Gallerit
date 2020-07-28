private object Versions {
    const val androidGradlePlugin = "4.0.1"
    const val kotlin = "1.3.72"
    const val coroutines = "1.3.8"
    const val appcompat = "1.1.0"
    const val fragment = "1.2.5"
    const val constraintlayout = "1.1.3"
    const val swiperefreshlayout = "1.1.0"
    const val recyclerview = "1.1.0"
    const val viewpager = "1.0.0"
    const val material = "1.1.0"
    const val lifecycle = "2.2.0"
    const val navigation = "2.3.0"
    const val room = "2.2.5"
    const val retrofit = "2.9.0"
    const val okhttp = "4.7.2"
    const val koin = "2.1.6"
    const val glide = "4.11.0"
    const val photoview = "2.0.0"
    const val timber = "4.7.1"
    const val junit = "4.13"
    const val mockk = "1.10.0"
    const val kotest = "4.1.1"
    const val androidxTest = "1.2.0"
    const val robolectric = "4.3.1"
}

object BuildPlugins {
    const val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val safeArgsGradle = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefreshlayout}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val viewpager = "androidx.viewpager2:viewpager2:${Versions.viewpager}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val navigationKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val koinAndroid = "org.koin:koin-android:${Versions.koin}"
    const val koinViewmodel = "org.koin:koin-android-viewmodel:${Versions.koin}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val photoview = "com.github.chrisbanes:PhotoView:${Versions.photoview}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}

object TestLibs {
    const val junit = "junit:junit:${Versions.junit}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val kotestAssertions = "io.kotest:kotest-assertions-core-jvm:${Versions.kotest}"
    const val androidxTest = "androidx.test:core:${Versions.androidxTest}"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
}