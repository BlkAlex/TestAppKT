# TestAppKT
Project for debugging androit espresso tests

Running single class/tests via gradle console. It will runs at all connected devices
needs gradle >5 
gradlew -Pandroid.testInstrumentationRunnerArguments.class=<package name>.<ClassName>#<Method Name if needs> connectedAndroidTest