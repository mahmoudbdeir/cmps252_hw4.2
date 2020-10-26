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

@Tag("10")
class Record_120 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 120: FirstName is Lynwood")
	void FirstNameOfRecord120() {
		assertEquals("Lynwood", customers.get(119).getFirstName());
	}

	@Test
	@DisplayName("Record 120: LastName is Cossey")
	void LastNameOfRecord120() {
		assertEquals("Cossey", customers.get(119).getLastName());
	}

	@Test
	@DisplayName("Record 120: Company is Cirlin, Vincent J Esq")
	void CompanyOfRecord120() {
		assertEquals("Cirlin, Vincent J Esq", customers.get(119).getCompany());
	}

	@Test
	@DisplayName("Record 120: Address is 55 Maynesboro St")
	void AddressOfRecord120() {
		assertEquals("55 Maynesboro St", customers.get(119).getAddress());
	}

	@Test
	@DisplayName("Record 120: City is Berlin")
	void CityOfRecord120() {
		assertEquals("Berlin", customers.get(119).getCity());
	}

	@Test
	@DisplayName("Record 120: County is Coos")
	void CountyOfRecord120() {
		assertEquals("Coos", customers.get(119).getCounty());
	}

	@Test
	@DisplayName("Record 120: State is NH")
	void StateOfRecord120() {
		assertEquals("NH", customers.get(119).getState());
	}

	@Test
	@DisplayName("Record 120: ZIP is 3570")
	void ZIPOfRecord120() {
		assertEquals("3570", customers.get(119).getZIP());
	}

	@Test
	@DisplayName("Record 120: Phone is 603-752-9314")
	void PhoneOfRecord120() {
		assertEquals("603-752-9314", customers.get(119).getPhone());
	}

	@Test
	@DisplayName("Record 120: Fax is 603-752-0694")
	void FaxOfRecord120() {
		assertEquals("603-752-0694", customers.get(119).getFax());
	}

	@Test
	@DisplayName("Record 120: Email is lynwood@cossey.com")
	void EmailOfRecord120() {
		assertEquals("lynwood@cossey.com", customers.get(119).getEmail());
	}

	@Test
	@DisplayName("Record 120: Web is http://www.lynwoodcossey.com")
	void WebOfRecord120() {
		assertEquals("http://www.lynwoodcossey.com", customers.get(119).getWeb());
	}
}
