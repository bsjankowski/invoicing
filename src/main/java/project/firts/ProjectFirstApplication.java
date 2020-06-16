package project.firts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import project.firts.model.Invoices;
import project.firts.repository.LettersRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjectFirstApplication {

    public static void main(String[] args) {
    {
        SpringApplication.run(ProjectFirstApplication.class, args);
    }

/*
        ConfigurableApplicationContext ctx = SpringApplication.run(ProjectFirstApplication.class, args);

        List<Invoices> invoices = new ArrayList<>();
        invoices.add(new Invoices(LocalDate.of(2020, 05, 15), LocalDate.of(2020, 06, 15), 52.23));
        invoices.add(new Invoices(LocalDate.of(2020, 03, 15), LocalDate.of(2019, 11, 12), 52.23));
        invoices.add(new Invoices(LocalDate.of(2015, 05, 12), LocalDate.of(2016, 12, 14), 52.23));

        LettersRepository lettersRepository = ctx.getBean(LettersRepository.class);
        invoices.forEach(lettersRepository::save);
*/



    }


}
