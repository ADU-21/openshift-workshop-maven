# Openshift workshop demo

This is a maven + spring boot demo for openshift workshop

# How build s2i

```bash
mvn fabric8:build
```

# How to generate source yaml
```bash
mvn fabric8:source
```

# How to deploy to openshift
```bash
mvn fabric8:deploy
```