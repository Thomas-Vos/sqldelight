plugins {
  `kotlin-dsl`
}

repositories {
  mavenCentral()
  maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

dependencies {
  compile(gradleApi())
  compile("org.jetbrains.kotlin:kotlin-stdlib:1.3.70-eap-274") // Why does this not use the version in: gradle/dependencies.gradle
}
