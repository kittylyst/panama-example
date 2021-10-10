plugins {
  id("org.beryx.jlink") version("2.23.3")
}

repositories {
  mavenCentral()
}

application {
  mainModule.set("wgjd.png")
  mainClass.set("wgjd.png.PngReader")
}

java {
    modularity.inferModulePath.set(true)
}

sourceSets {
  main {
    java {
      setSrcDirs(listOf("src/main/java/wgjd.png"))
    }
  }
}

tasks.withType<JavaCompile> {
  options.compilerArgs = listOf("--add-exports", "jdk.internal.jvmstat/sun.jvmstat.monitor=wgjd.discovery")
}

tasks.jar {
  manifest {
    attributes("Main-Class" to application.mainClassName)
  }
}

jlink {
  targetPlatform("local", System.getProperty("java.home"))

  launcher{
    jvmArgs = listOf("--add-exports", "jdk.internal.jvmstat/sun.jvmstat.monitor=wgjd.discovery")
  }
}
