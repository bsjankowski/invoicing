package project.firts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.firts.model.Invoices;

@Repository
public interface LettersRepository extends JpaRepository<Invoices,Long > {




  /*  @Modifying
    @Query(name = "firstRecords",value = "insert into Invoices (numberInvoice,  startOfContractl,  stopOfContractl,  costInvoice) " +
            "VALUES (:numberInvoice,:startOfContractl,:stopOfContractl,:costInvoice)", nativeQuery = true)
    @Transactional
    void inserRecords(@Param("numberInvoice") String numberInvoice, @Param("startOfContractl") String startOfContractl,
                @Param("stopOfContractl") String stopOfContractl, @Param("costInvoice") double costInvoice);*/

}

