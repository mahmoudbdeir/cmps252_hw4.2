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

@Tag("42")
class Record_3335 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3335: FirstName is Martina")
	void FirstNameOfRecord3335() {
		assertEquals("Martina", customers.get(3334).getFirstName());
	}

	@Test
	@DisplayName("Record 3335: LastName is Rissman")
	void LastNameOfRecord3335() {
		assertEquals("Rissman", customers.get(3334).getLastName());
	}

	@Test
	@DisplayName("Record 3335: Company is Criterion Electronics Inc")
	void CompanyOfRecord3335() {
		assertEquals("Criterion Electronics Inc", customers.get(3334).getCompany());
	}

	@Test
	@DisplayName("Record 3335: Address is 726 Plymouth Park")
	void AddressOfRecord3335() {
		assertEquals("726 Plymouth Park", customers.get(3334).getAddress());
	}

	@Test
	@DisplayName("Record 3335: City is Irving")
	void CityOfRecord3335() {
		assertEquals("Irving", customers.get(3334).getCity());
	}

	@Test
	@DisplayName("Record 3335: County is Dallas")
	void CountyOfRecord3335() {
		assertEquals("Dallas", customers.get(3334).getCounty());
	}

	@Test
	@DisplayName("Record 3335: State is TX")
	void StateOfRecord3335() {
		assertEquals("TX", customers.get(3334).getState());
	}

	@Test
	@DisplayName("Record 3335: ZIP is 75061")
	void ZIPOfRecord3335() {
		assertEquals("75061", customers.get(3334).getZIP());
	}

	@Test
	@DisplayName("Record 3335: Phone is 972-986-7704")
	void PhoneOfRecord3335() {
		assertEquals("972-986-7704", customers.get(3334).getPhone());
	}

	@Test
	@DisplayName("Record 3335: Fax is 972-986-3501")
	void FaxOfRecord3335() {
		assertEquals("972-986-3501", customers.get(3334).getFax());
	}

	@Test
	@DisplayName("Record 3335: Email is martina@rissman.com")
	void EmailOfRecord3335() {
		assertEquals("martina@rissman.com", customers.get(3334).getEmail());
	}

	@Test
	@DisplayName("Record 3335: Web is http://www.martinarissman.com")
	void WebOfRecord3335() {
		assertEquals("http://www.martinarissman.com", customers.get(3334).getWeb());
	}
}
