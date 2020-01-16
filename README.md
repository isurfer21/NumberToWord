# NumberToWord
Convert a number into words using Indian or western numbering system

## Development
Clone the repository and run the below commands

### Build
Compile and create jar file
```
make compile
make jar
```

Check if the build is Ok
```
make run
```

Note: You may rename the `package.jar` to `n2w.jar` for ease of use.

### Usage
To see app version
```
java -jar package.jar -v
```

To see help options of app
```
java -jar package.jar -h
```

To convert number to word using Indian numbering system
```
java -jar package.jar -i 1234
```

To convert number to word using Western numbering system
```
java -jar package.jar -w 1234
```

To convert number to word using Indian numbering system by default if no flag is passed in argument 
```
java -jar package.jar 1234
```