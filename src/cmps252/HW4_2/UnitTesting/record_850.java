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

@Tag("17")
class Record_850 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 850: FirstName is Shelia")
	void FirstNameOfRecord850() {
		assertEquals("Shelia", customers.get(849).getFirstName());
	}

	@Test
	@DisplayName("Record 850: LastName is Demaire")
	void LastNameOfRecord850() {
		assertEquals("Demaire", customers.get(849).getLastName());
	}

	@Test
	@DisplayName("Record 850: Company is Neal & Davis")
	void CompanyOfRecord850() {
		assertEquals("Neal & Davis", customers.get(849).getCompany());
	}

	@Test
	@DisplayName("Record 850: Address is 215 Cook Ave")
	void AddressOfRecord850() {
		assertEquals("215 Cook Ave", customers.get(849).getAddress());
	}

	@Test
	@DisplayName("Record 850: City is Middlesex")
	void CityOfRecord850() {
		assertEquals("Middlesex", customers.get(849).getCity());
	}

	@Test
	@DisplayName("Record 850: County is Middlesex")
	void CountyOfRecord850() {
		assertEquals("Middlesex", customers.get(849).getCounty());
	}

	@Test
	@DisplayName("Record 850: State is NJ")
	void StateOfRecord850() {
		assertEquals("NJ", customers.get(849).getState());
	}

	@Test
	@DisplayName("Record 850: ZIP is 8846")
	void ZIPOfRecord850() {
		assertEquals("8846", customers.get(849).getZIP());
	}

	@Test
	@DisplayName("Record 850: Phone is 732-560-1019")
	void PhoneOfRecord850() {
		assertEquals("732-560-1019", customers.get(849).getPhone());
	}

	@Test
	@DisplayName("Record 850: Fax is 732-560-8229")
	void FaxOfRecord850() {
		assertEquals("732-560-8229", customers.get(849).getFax());
	}

	@Test
	@DisplayName("Record 850: Email is shelia@demaire.com")
	void EmailOfRecord850() {
		assertEquals("shelia@demaire.com", customers.get(849).getEmail());
	}

	@Test
	@DisplayName("Record 850: Web is http://www.sheliademaire.com")
	void WebOfRecord850() {
		assertEquals("http://www.sheliademaire.com", customers.get(849).getWeb());
	}
}
