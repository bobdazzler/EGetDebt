package hackaton.e_get_debt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import hackaton.e_get_debt.model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {

}
