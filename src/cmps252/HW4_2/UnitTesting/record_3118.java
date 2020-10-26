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

@Tag("20")
class Record_3118 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3118: FirstName is Lindsay")
	void FirstNameOfRecord3118() {
		assertEquals("Lindsay", customers.get(3117).getFirstName());
	}

	@Test
	@DisplayName("Record 3118: LastName is Rashed")
	void LastNameOfRecord3118() {
		assertEquals("Rashed", customers.get(3117).getLastName());
	}

	@Test
	@DisplayName("Record 3118: Company is Arnold Missouri Corp")
	void CompanyOfRecord3118() {
		assertEquals("Arnold Missouri Corp", customers.get(3117).getCompany());
	}

	@Test
	@DisplayName("Record 3118: Address is 1501 Fm")
	void AddressOfRecord3118() {
		assertEquals("1501 Fm", customers.get(3117).getAddress());
	}

	@Test
	@DisplayName("Record 3118: City is College Station")
	void CityOfRecord3118() {
		assertEquals("College Station", customers.get(3117).getCity());
	}

	@Test
	@DisplayName("Record 3118: County is Brazos")
	void CountyOfRecord3118() {
		assertEquals("Brazos", customers.get(3117).getCounty());
	}

	@Test
	@DisplayName("Record 3118: State is TX")
	void StateOfRecord3118() {
		assertEquals("TX", customers.get(3117).getState());
	}

	@Test
	@DisplayName("Record 3118: ZIP is 77840")
	void ZIPOfRecord3118() {
		assertEquals("77840", customers.get(3117).getZIP());
	}

	@Test
	@DisplayName("Record 3118: Phone is 979-693-3180")
	void PhoneOfRecord3118() {
		assertEquals("979-693-3180", customers.get(3117).getPhone());
	}

	@Test
	@DisplayName("Record 3118: Fax is 979-693-1201")
	void FaxOfRecord3118() {
		assertEquals("979-693-1201", customers.get(3117).getFax());
	}

	@Test
	@DisplayName("Record 3118: Email is lindsay@rashed.com")
	void EmailOfRecord3118() {
		assertEquals("lindsay@rashed.com", customers.get(3117).getEmail());
	}

	@Test
	@DisplayName("Record 3118: Web is http://www.lindsayrashed.com")
	void WebOfRecord3118() {
		assertEquals("http://www.lindsayrashed.com", customers.get(3117).getWeb());
	}
}
