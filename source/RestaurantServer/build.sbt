name := "RestaurantServer"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,  
  "mysql" % "mysql-connector-java" % "5.1.12",
  javaJpa,
   "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final"
)      

play.Project.playJavaSettings
