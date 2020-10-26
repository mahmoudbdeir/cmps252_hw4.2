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

@Tag("1")
class Record_4132 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4132: FirstName is Eloy")
	void FirstNameOfRecord4132() {
		assertEquals("Eloy", customers.get(4131).getFirstName());
	}

	@Test
	@DisplayName("Record 4132: LastName is Desiato")
	void LastNameOfRecord4132() {
		assertEquals("Desiato", customers.get(4131).getLastName());
	}

	@Test
	@DisplayName("Record 4132: Company is Hynrich, Amy B Esq")
	void CompanyOfRecord4132() {
		assertEquals("Hynrich, Amy B Esq", customers.get(4131).getCompany());
	}

	@Test
	@DisplayName("Record 4132: Address is 229 Main St")
	void AddressOfRecord4132() {
		assertEquals("229 Main St", customers.get(4131).getAddress());
	}

	@Test
	@DisplayName("Record 4132: City is Andover")
	void CityOfRecord4132() {
		assertEquals("Andover", customers.get(4131).getCity());
	}

	@Test
	@DisplayName("Record 4132: County is Sussex")
	void CountyOfRecord4132() {
		assertEquals("Sussex", customers.get(4131).getCounty());
	}

	@Test
	@DisplayName("Record 4132: State is NJ")
	void StateOfRecord4132() {
		assertEquals("NJ", customers.get(4131).getState());
	}

	@Test
	@DisplayName("Record 4132: ZIP is 7821")
	void ZIPOfRecord4132() {
		assertEquals("7821", customers.get(4131).getZIP());
	}

	@Test
	@DisplayName("Record 4132: Phone is 973-786-4778")
	void PhoneOfRecord4132() {
		assertEquals("973-786-4778", customers.get(4131).getPhone());
	}

	@Test
	@DisplayName("Record 4132: Fax is 973-786-0361")
	void FaxOfRecord4132() {
		assertEquals("973-786-0361", customers.get(4131).getFax());
	}

	@Test
	@DisplayName("Record 4132: Email is eloy@desiato.com")
	void EmailOfRecord4132() {
		assertEquals("eloy@desiato.com", customers.get(4131).getEmail());
	}

	@Test
	@DisplayName("Record 4132: Web is http://www.eloydesiato.com")
	void WebOfRecord4132() {
		assertEquals("http://www.eloydesiato.com", customers.get(4131).getWeb());
	}
}
