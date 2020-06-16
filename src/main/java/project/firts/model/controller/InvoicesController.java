package project.firts.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.firts.model.Invoices;
import project.firts.repository.LettersRepository;

import java.io.*;
import java.util.List;
import java.util.Optional;

@Controller
public class InvoicesController {

    private LettersRepository lettersRepository;

    @Autowired
    public InvoicesController(LettersRepository lettersRepository) {
        this.lettersRepository = lettersRepository;
    }

    @PostMapping("/save")
    public String saveInvoices(@ModelAttribute Invoices invoices) {
        lettersRepository.save(invoices);
        return "redirect:/";
    }




    @PostMapping("/saveTxtInvoiceGenerator")
    public String saveInvoicesTxt() throws FileNotFoundException {
        String fileName = "fv.txt";
        var fileReader = new FileReader(fileName);
        var reader = new BufferedReader(fileReader);

        try (
                fileReader;
                reader;
        ) {
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null) {
                String[] recordsValues = nextLine.split(";");
                double fourValue = Double.valueOf(recordsValues[4]);
                Invoices invoices = new Invoices();
                invoices.setIdInvoice(Long.valueOf(recordsValues[0]));
                invoices.setNumberInvoice(recordsValues[1]);
                invoices.setStartOfContractl(recordsValues[2]);
                invoices.setStopOfContractl(recordsValues[3]);
                invoices.setCostInvoice(fourValue);
                lettersRepository.save(invoices);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }
    


    @GetMapping("/showAllInvoices")
    public String showAllInvoices(Model model){
        List<Invoices> allInvoices = lettersRepository.findAll();
        model.addAttribute("allInvoices", allInvoices);
        return "showAllInvoices";
    }


    @GetMapping("/back")
    public String back() {
        return "redirect:/";
    }


}
