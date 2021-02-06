/**
 * 플러그인 추가하기 
 * Gradle은 Jetbrain에서 제공하는 플러그인으로 JVM용 코틀린 컴파일을 지원한다.
 * 코틀린 Gradle 플러그인은 Gradle 플러그인 레포지토리에 등록되어있고 아래의 내용으로 Import 한다.
 */

// plugin을 제일 위에 선언해주고 그 아래에는 순서 무관하다.
plugins {

	// Add gradle task from java library plugin 
	// build, complieJava, javadoc, jar, etc...
	`java-library`		
	 
	kotlin("jvm") version "1.3.50"	// Add kotlin plugin in gradle
}

ext {
  javaVersion='1.8'
}

sourceCompatibility = javaVersion
targetCompatibility = javaVersion

javadoc {
    options.encoding = 'UTF-8'
}

sourceSets.main {
    java.srcDirs("src/main/kotlin", "src/main/java")
}

repositories {
	jcenter()
}
	
dependencies {
	implementation(kotlin("stdlib'))	// Add kotlin standard library when compliling
}
