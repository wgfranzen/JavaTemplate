# JavaTemplate

JavaTemplate provides a template for coding Java Projects.

## Source Structure
The source structure constructed as follows:
```
    src/
        assemmbly/
            bin.xml
            run.bat
            run.sh
            windows.xml     
        main/
            java/
                net.wf0b.code/
                    Main.java
            resources/
        site/
            markdown/
                download.md
                HowToUse.md
                index.md
                info.md
                license.md
                releaseNotes.md
            site.xml
        test/
            java/
            resources/
    LICENSE
    pom.xml
    README.md
```

## Maven Build Notes

Maven build requires two environmental variables to be setup:
*  ```SHARED_DIRECTORY```
*  ```GITHUB_IO_DIRECTORY```

```SHARED_DIRECTORY``` represents the location for Maven Install, while
the ```GITHUB_IO_DIRECTORY``` represents the location for Maven Site. 

## Logging

Logging is provided by SLF4J to enable the choice, upon execution, of supported logging packages.