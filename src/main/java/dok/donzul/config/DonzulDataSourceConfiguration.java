package dok.donzul.config;

import java.util.Optional;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

//@Configuration
//@MapperScan(basePackages = "dok.donzul.mapper", sqlSessionTemplateRef = "donzulSqlSessionTemplate")
public class DonzulDataSourceConfiguration {
	
//	@Autowired
//	private DonzulDBProperties donzulDBProperties;
//	
//	@Autowired
//	private ApplicationContext context;
//	
//	@Bean(name = { "dataSource", "donzulDataSource" })
//	@ConfigurationProperties(prefix = "spring.donzul.datasource")
//	@Primary
//	public DataSource dataSource() {
//		return donzulDBProperties.getDatasource();
//	}
//	
//	@Bean(name = "donzulSqlSessionTemplate")
//	public SqlSessionTemplate sqlSessionTemplate(@Qualifier("donzulDataSource") DataSource dataSource)
//	    throws Exception {
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//		bean.setDataSource(dataSource);
//		// MyBatis のコンフィグレーションファイル
//		bean.setConfigLocation(context.getResource(context.getEnvironment().getProperty("mybatis.config")));
//		return new SqlSessionTemplate(bean.getObject());
//	}
//	
//	@Bean(name = "donzulDataSourceInitializer")
//	public DataSourceInitializer dataSourceInitializer(@Qualifier("donzulDataSource") DataSource dataSource) {
//		DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
//		dataSourceInitializer.setDataSource(dataSource);
//		ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
//		// schema,dataをpropertiesファイルで指定しない場合、Location must not be nullが出るため、nullの場合は処理を行わないように修正(2016/06/28)
//		Optional.ofNullable(donzulDBProperties.getDatasource().getSchema()).map(schema -> context.getResource(schema))
//		    .ifPresent(resource -> databasePopulator.addScript(resource));
//		Optional.ofNullable(donzulDBProperties.getDatasource().getData()).map(data -> context.getResource(data))
//		    .ifPresent(resource -> databasePopulator.addScript(resource));
//			
//		dataSourceInitializer.setDatabasePopulator(databasePopulator);
//		dataSourceInitializer.setEnabled(true);
//		
//		return dataSourceInitializer;
//	}
//	
//	@Primary
//	@Bean(name = "donzulTransactionManager")
//	public DataSourceTransactionManager transactionManagerInitializer(
//	    @Qualifier("donzulDataSource") DataSource dataSource) throws Exception {
//		
//		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//		transactionManager.setDataSource(dataSource);
//		return transactionManager;
//	}
}
