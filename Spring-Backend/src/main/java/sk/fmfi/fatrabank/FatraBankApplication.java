package sk.fmfi.fatrabank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@EntityScan()
@SpringBootApplication
public class FatraBankApplication {

	public static void main(String[] args) {
		loadHibernateMappings();
        SpringApplication.run(FatraBankApplication.class, args);
	}

    private static void loadHibernateMappings() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource("hibernate");
        String path = url.getPath();

        List<String> hbmMappings = Stream.of(new File(path).listFiles())
            .map(file -> "hibernate/" + file.getName())
            .collect(Collectors.toList());

        String mappingResources = String.join(",", hbmMappings);

        System.setProperty("spring.jpa.mapping-resources", mappingResources);
    }
}
