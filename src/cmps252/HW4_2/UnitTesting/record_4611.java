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

@Tag("7")
class Record_4611 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4611: FirstName is Kelli")
	void FirstNameOfRecord4611() {
		assertEquals("Kelli", customers.get(4610).getFirstName());
	}

	@Test
	@DisplayName("Record 4611: LastName is Baldino")
	void LastNameOfRecord4611() {
		assertEquals("Baldino", customers.get(4610).getLastName());
	}

	@Test
	@DisplayName("Record 4611: Company is Rhode Island Convention Center")
	void CompanyOfRecord4611() {
		assertEquals("Rhode Island Convention Center", customers.get(4610).getCompany());
	}

	@Test
	@DisplayName("Record 4611: Address is 5220 Lankershim Blvd")
	void AddressOfRecord4611() {
		assertEquals("5220 Lankershim Blvd", customers.get(4610).getAddress());
	}

	@Test
	@DisplayName("Record 4611: City is North Hollywood")
	void CityOfRecord4611() {
		assertEquals("North Hollywood", customers.get(4610).getCity());
	}

	@Test
	@DisplayName("Record 4611: County is Los Angeles")
	void CountyOfRecord4611() {
		assertEquals("Los Angeles", customers.get(4610).getCounty());
	}

	@Test
	@DisplayName("Record 4611: State is CA")
	void StateOfRecord4611() {
		assertEquals("CA", customers.get(4610).getState());
	}

	@Test
	@DisplayName("Record 4611: ZIP is 91601")
	void ZIPOfRecord4611() {
		assertEquals("91601", customers.get(4610).getZIP());
	}

	@Test
	@DisplayName("Record 4611: Phone is 818-761-3544")
	void PhoneOfRecord4611() {
		assertEquals("818-761-3544", customers.get(4610).getPhone());
	}

	@Test
	@DisplayName("Record 4611: Fax is 818-761-1538")
	void FaxOfRecord4611() {
		assertEquals("818-761-1538", customers.get(4610).getFax());
	}

	@Test
	@DisplayName("Record 4611: Email is kelli@baldino.com")
	void EmailOfRecord4611() {
		assertEquals("kelli@baldino.com", customers.get(4610).getEmail());
	}

	@Test
	@DisplayName("Record 4611: Web is http://www.kellibaldino.com")
	void WebOfRecord4611() {
		assertEquals("http://www.kellibaldino.com", customers.get(4610).getWeb());
	}
}
