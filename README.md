# Openshift workshop demo

This is a maven + spring boot demo for openshift workshop

# Run local
```bash
mvn spring-boot:run
```

# How to generate source yaml
```bash
mvn fabric8:resource
```

# How build s2i

```bash
mvn fabric8:build
```

# How to deploy to openshift
```bash
mvn fabric8:deploy
```