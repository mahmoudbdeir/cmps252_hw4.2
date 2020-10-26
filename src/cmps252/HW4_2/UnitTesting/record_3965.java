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

@Tag("16")
class Record_3965 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3965: FirstName is Johnny")
	void FirstNameOfRecord3965() {
		assertEquals("Johnny", customers.get(3964).getFirstName());
	}

	@Test
	@DisplayName("Record 3965: LastName is Kasson")
	void LastNameOfRecord3965() {
		assertEquals("Kasson", customers.get(3964).getLastName());
	}

	@Test
	@DisplayName("Record 3965: Company is Chapman Building Design")
	void CompanyOfRecord3965() {
		assertEquals("Chapman Building Design", customers.get(3964).getCompany());
	}

	@Test
	@DisplayName("Record 3965: Address is 101 E Davis St")
	void AddressOfRecord3965() {
		assertEquals("101 E Davis St", customers.get(3964).getAddress());
	}

	@Test
	@DisplayName("Record 3965: City is McKinney")
	void CityOfRecord3965() {
		assertEquals("McKinney", customers.get(3964).getCity());
	}

	@Test
	@DisplayName("Record 3965: County is Collin")
	void CountyOfRecord3965() {
		assertEquals("Collin", customers.get(3964).getCounty());
	}

	@Test
	@DisplayName("Record 3965: State is TX")
	void StateOfRecord3965() {
		assertEquals("TX", customers.get(3964).getState());
	}

	@Test
	@DisplayName("Record 3965: ZIP is 75069")
	void ZIPOfRecord3965() {
		assertEquals("75069", customers.get(3964).getZIP());
	}

	@Test
	@DisplayName("Record 3965: Phone is 972-562-7966")
	void PhoneOfRecord3965() {
		assertEquals("972-562-7966", customers.get(3964).getPhone());
	}

	@Test
	@DisplayName("Record 3965: Fax is 972-562-6645")
	void FaxOfRecord3965() {
		assertEquals("972-562-6645", customers.get(3964).getFax());
	}

	@Test
	@DisplayName("Record 3965: Email is johnny@kasson.com")
	void EmailOfRecord3965() {
		assertEquals("johnny@kasson.com", customers.get(3964).getEmail());
	}

	@Test
	@DisplayName("Record 3965: Web is http://www.johnnykasson.com")
	void WebOfRecord3965() {
		assertEquals("http://www.johnnykasson.com", customers.get(3964).getWeb());
	}
}
