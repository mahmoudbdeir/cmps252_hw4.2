package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("0")
class Record_3488 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3488: FirstName is Cristopher")
	void FirstNameOfRecord3488() {
		assertEquals("Cristopher", customers.get(3487).getFirstName());
	}

	@Test
	@DisplayName("Record 3488: LastName is Andracki")
	void LastNameOfRecord3488() {
		assertEquals("Andracki", customers.get(3487).getLastName());
	}

	@Test
	@DisplayName("Record 3488: Company is Hand & Quinn Sc")
	void CompanyOfRecord3488() {
		assertEquals("Hand & Quinn Sc", customers.get(3487).getCompany());
	}

	@Test
	@DisplayName("Record 3488: Address is 30 Garden Ave")
	void AddressOfRecord3488() {
		assertEquals("30 Garden Ave", customers.get(3487).getAddress());
	}

	@Test
	@DisplayName("Record 3488: City is Bensenville")
	void CityOfRecord3488() {
		assertEquals("Bensenville", customers.get(3487).getCity());
	}

	@Test
	@DisplayName("Record 3488: County is DuPage")
	void CountyOfRecord3488() {
		assertEquals("DuPage", customers.get(3487).getCounty());
	}

	@Test
	@DisplayName("Record 3488: State is IL")
	void StateOfRecord3488() {
		assertEquals("IL", customers.get(3487).getState());
	}

	@Test
	@DisplayName("Record 3488: ZIP is 60106")
	void ZIPOfRecord3488() {
		assertEquals("60106", customers.get(3487).getZIP());
	}

	@Test
	@DisplayName("Record 3488: Phone is 630-595-9720")
	void PhoneOfRecord3488() {
		assertEquals("630-595-9720", customers.get(3487).getPhone());
	}

	@Test
	@DisplayName("Record 3488: Fax is 630-595-3771")
	void FaxOfRecord3488() {
		assertEquals("630-595-3771", customers.get(3487).getFax());
	}

	@Test
	@DisplayName("Record 3488: Email is cristopher@andracki.com")
	void EmailOfRecord3488() {
		assertEquals("cristopher@andracki.com", customers.get(3487).getEmail());
	}

	@Test
	@DisplayName("Record 3488: Web is http://www.cristopherandracki.com")
	void WebOfRecord3488() {
		assertEquals("http://www.cristopherandracki.com", customers.get(3487).getWeb());
	}
}
