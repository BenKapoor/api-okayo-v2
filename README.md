# api-okayo-v2

Déploiement heroku :

- Paramettrer la db avec les infos trouvable dans heroku/postgre
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
spring.datasource.port=

spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.maxActive=10
spring.datasource.maxIdle=5
spring.datasource.minIdle=2
spring.datasource.initialSize=5
spring.datasource.removeAbandoned=true

- Modifier le format des données sql pas de ```

- ajout du fichier DatabasConfig dans configuration 

@Configuration
public class DatabaseConfig {
	
	@Value("${spring.datasource.url}")
	private String dbUrl;

	@Bean
	public DataSource dataSource() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl(dbUrl);
		return new HikariDataSource(config);
	}
}

- ajouter les dépendances dans le pom :
  <dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
  </dependency>
  
  <plugin>
				<groupId>com.heroku.sdk</groupId>
				<artifactId>heroku-maven-plugin</artifactId>
				<version>3.0.3</version>
				<configuration>
				  <appName>api-okayo</appName>
				  <processTypes>
				     <web>java $JAVA_OPTS -cp target/classes:target/dependency/* Main</web>
				  </processTypes>
				</configuration>
  </plugin>
  
  
  - exécuter les lignes de commandes : 
  heroku create
  mvn heroku:deploy -Dheroku.appName=myapp
  
  *Coté Heroku : https://dashboard.heroku.com/apps/...*
  - faire la liaison entre le projet Git et celui généré afin de mettre en pace une intégration continue
  
  liens utils :
  https://devcenter.heroku.com/articles/deploying-java-applications-with-the-heroku-maven-plugin#adding-the-plugin 
