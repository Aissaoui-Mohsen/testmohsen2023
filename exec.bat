mvn  -Dsut.test.environment=sinext   -Dbrowser=CHROME   -Dbrowser.headless=false   -Dtest=**/*.java   clean compile test