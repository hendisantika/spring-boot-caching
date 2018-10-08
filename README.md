# spring-boot-caching

Run this project by this command :

`mvn clean spring-boot:run`

```

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.5.RELEASE)

2018-10-09 05:49:25.864  INFO 17987 --- [           main] c.h.s.SpringBootCachingApplication       : Starting SpringBootCachingApplication on Hendis-MacBook-Pro-2.local with PID 17987 (/Users/hendisantika/Documents/IdeaProjects/spring-boot-caching/target/classes started by hendisantika in /Users/hendisantika/Documents/IdeaProjects/spring-boot-caching)
2018-10-09 05:49:25.870  INFO 17987 --- [           main] c.h.s.SpringBootCachingApplication       : No active profile set, falling back to default profiles: default
2018-10-09 05:49:25.920  INFO 17987 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@1f6a42cc: startup date [Tue Oct 09 05:49:25 WIB 2018]; root of context hierarchy
2018-10-09 05:49:26.586  INFO 17987 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-10-09 05:49:26.598  INFO 17987 --- [           main] c.h.s.SpringBootCachingApplication       : Started SpringBootCachingApplication in 0.991 seconds (JVM running for 4.024)
2018-10-09 05:49:26.599  INFO 17987 --- [           main] c.h.s.SpringBootCachingApplication       : .... Fetching books
2018-10-09 05:49:29.610  INFO 17987 --- [           main] c.h.s.SpringBootCachingApplication       : isbn-1234 -->Book{isbn='isbn-1234', title='Some book'}
2018-10-09 05:49:32.612  INFO 17987 --- [           main] c.h.s.SpringBootCachingApplication       : isbn-4567 -->Book{isbn='isbn-4567', title='Some book'}
2018-10-09 05:49:32.613  INFO 17987 --- [           main] c.h.s.SpringBootCachingApplication       : isbn-1234 -->Book{isbn='isbn-1234', title='Some book'}
2018-10-09 05:49:32.613  INFO 17987 --- [           main] c.h.s.SpringBootCachingApplication       : isbn-4567 -->Book{isbn='isbn-4567', title='Some book'}
2018-10-09 05:49:32.614  INFO 17987 --- [           main] c.h.s.SpringBootCachingApplication       : isbn-1234 -->Book{isbn='isbn-1234', title='Some book'}
2018-10-09 05:49:32.614  INFO 17987 --- [           main] c.h.s.SpringBootCachingApplication       : isbn-1234 -->Book{isbn='isbn-1234', title='Some book'}
```