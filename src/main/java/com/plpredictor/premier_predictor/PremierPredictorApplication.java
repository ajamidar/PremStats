package com.plpredictor.premier_predictor;

import com.plpredictor.premier_predictor.player.PlayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;


@SpringBootApplication
public class PremierPredictorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PremierPredictorApplication.class, args);
	}

	@Bean
	CommandLineRunner testConnection(DataSource dataSource) {
		return args -> {
			try (Connection conn = dataSource.getConnection()) {
				System.out.println("✅ Connected to database: " + conn.getMetaData().getURL());
			} catch (Exception e) {
				System.err.println("❌ Database connection failed: " + e.getMessage());
			}
		};
	}

}
