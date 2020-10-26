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

@Tag("31")
class Record_2372 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2372: FirstName is Jena")
	void FirstNameOfRecord2372() {
		assertEquals("Jena", customers.get(2371).getFirstName());
	}

	@Test
	@DisplayName("Record 2372: LastName is Trulli")
	void LastNameOfRecord2372() {
		assertEquals("Trulli", customers.get(2371).getLastName());
	}

	@Test
	@DisplayName("Record 2372: Company is Kncn Fm C 101")
	void CompanyOfRecord2372() {
		assertEquals("Kncn Fm C 101", customers.get(2371).getCompany());
	}

	@Test
	@DisplayName("Record 2372: Address is 3601 Hamilton St")
	void AddressOfRecord2372() {
		assertEquals("3601 Hamilton St", customers.get(2371).getAddress());
	}

	@Test
	@DisplayName("Record 2372: City is Hyattsville")
	void CityOfRecord2372() {
		assertEquals("Hyattsville", customers.get(2371).getCity());
	}

	@Test
	@DisplayName("Record 2372: County is Prince Georges")
	void CountyOfRecord2372() {
		assertEquals("Prince Georges", customers.get(2371).getCounty());
	}

	@Test
	@DisplayName("Record 2372: State is MD")
	void StateOfRecord2372() {
		assertEquals("MD", customers.get(2371).getState());
	}

	@Test
	@DisplayName("Record 2372: ZIP is 20782")
	void ZIPOfRecord2372() {
		assertEquals("20782", customers.get(2371).getZIP());
	}

	@Test
	@DisplayName("Record 2372: Phone is 301-927-5095")
	void PhoneOfRecord2372() {
		assertEquals("301-927-5095", customers.get(2371).getPhone());
	}

	@Test
	@DisplayName("Record 2372: Fax is 301-927-0912")
	void FaxOfRecord2372() {
		assertEquals("301-927-0912", customers.get(2371).getFax());
	}

	@Test
	@DisplayName("Record 2372: Email is jena@trulli.com")
	void EmailOfRecord2372() {
		assertEquals("jena@trulli.com", customers.get(2371).getEmail());
	}

	@Test
	@DisplayName("Record 2372: Web is http://www.jenatrulli.com")
	void WebOfRecord2372() {
		assertEquals("http://www.jenatrulli.com", customers.get(2371).getWeb());
	}
}
