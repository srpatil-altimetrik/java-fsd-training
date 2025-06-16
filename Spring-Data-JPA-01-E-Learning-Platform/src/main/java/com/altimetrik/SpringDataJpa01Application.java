package com.altimetrik;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.altimetrik.model.Author;
import com.altimetrik.model.Video;
import com.altimetrik.repository.AuthorRepository;
import com.altimetrik.repository.VideoRepository;
import com.github.javafaker.Faker;
import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class SpringDataJpa01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa01Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository, VideoRepository videoRepository) {
		return args -> {
			/*
			 * var author =
			 * Author.builder().authorFirstName("Shubham").authorLastName("Patil").authorAge
			 * (25) .authorMailId("srpatil1@gmail.com").build();
			 * authorRepository.save(author);
			 */

//			var video = Video.builder().resourceName("abc").length(50).build();
//			videoRepository.save(video); 

			for (int i = 0; i <= 10; i++) {
				Faker faker = new Faker();

				var author = Author.builder().authorFirstName(faker.name().firstName())
						.authorLastName(faker.name().lastName()).authorAge(faker.number().numberBetween(9, 99))
						.authorMailId(faker.name().username() + "gmail.com").build();
//				authorRepository.save(author);
			}

			// It is upda te the data in table using the id
			var author = Author.builder().id(10).authorFirstName("Shubham").authorLastName("Patil").authorAge(25)
					.authorMailId("srpatil1@gmail.com").build();
			authorRepository.updateAuthor(25, 10);

			authorRepository.findByNameQuery(60).forEach(System.out::println);
		};
	}
}