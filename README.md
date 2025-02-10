Please visit:
http://code.google.com/p/json-simple/

## Pre-requisiste

- Java 17 / 21
- Maven

## Test / Coverage

```terminal
mvn test
```

OR

```terminal
mvn test jacoco:report
```

### Test just single file

```terminal
mvn test -Dtest=org.json.simple.JSONArrayTest
```

### Coverage Report location

`target/site/jacoco/jacoco.csv`
