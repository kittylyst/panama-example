plugins {
  id("org.beryx.jlink") version("2.24.2")
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
  options.compilerArgs = listOf()
}

tasks.jar {
  manifest {
    attributes("Main-Class" to application.mainClassName)
  }
}

//jlink {
//  targetPlatform("local", System.getProperty("java.home"))
//
//  launcher{
//    name = "pngreader"
//    jvmArgs = listOf("--add-modules", "jdk.incubator.foreign", "--enable-native-access=ALL-UNNAMED")
//  }
//}
