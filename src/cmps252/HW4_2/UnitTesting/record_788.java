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

@Tag("2")
class Record_788 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 788: FirstName is Maria")
	void FirstNameOfRecord788() {
		assertEquals("Maria", customers.get(787).getFirstName());
	}

	@Test
	@DisplayName("Record 788: LastName is Antenor")
	void LastNameOfRecord788() {
		assertEquals("Antenor", customers.get(787).getLastName());
	}

	@Test
	@DisplayName("Record 788: Company is Frank Mastolini & Sons Inc")
	void CompanyOfRecord788() {
		assertEquals("Frank Mastolini & Sons Inc", customers.get(787).getCompany());
	}

	@Test
	@DisplayName("Record 788: Address is 3445 Park Avenue W")
	void AddressOfRecord788() {
		assertEquals("3445 Park Avenue W", customers.get(787).getAddress());
	}

	@Test
	@DisplayName("Record 788: City is Denver")
	void CityOfRecord788() {
		assertEquals("Denver", customers.get(787).getCity());
	}

	@Test
	@DisplayName("Record 788: County is Denver")
	void CountyOfRecord788() {
		assertEquals("Denver", customers.get(787).getCounty());
	}

	@Test
	@DisplayName("Record 788: State is CO")
	void StateOfRecord788() {
		assertEquals("CO", customers.get(787).getState());
	}

	@Test
	@DisplayName("Record 788: ZIP is 80216")
	void ZIPOfRecord788() {
		assertEquals("80216", customers.get(787).getZIP());
	}

	@Test
	@DisplayName("Record 788: Phone is 303-458-6310")
	void PhoneOfRecord788() {
		assertEquals("303-458-6310", customers.get(787).getPhone());
	}

	@Test
	@DisplayName("Record 788: Fax is 303-458-3281")
	void FaxOfRecord788() {
		assertEquals("303-458-3281", customers.get(787).getFax());
	}

	@Test
	@DisplayName("Record 788: Email is maria@antenor.com")
	void EmailOfRecord788() {
		assertEquals("maria@antenor.com", customers.get(787).getEmail());
	}

	@Test
	@DisplayName("Record 788: Web is http://www.mariaantenor.com")
	void WebOfRecord788() {
		assertEquals("http://www.mariaantenor.com", customers.get(787).getWeb());
	}
}
