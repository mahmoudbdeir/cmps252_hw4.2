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

@Tag("5")
class Record_4020 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4020: FirstName is Melba")
	void FirstNameOfRecord4020() {
		assertEquals("Melba", customers.get(4019).getFirstName());
	}

	@Test
	@DisplayName("Record 4020: LastName is Pownell")
	void LastNameOfRecord4020() {
		assertEquals("Pownell", customers.get(4019).getLastName());
	}

	@Test
	@DisplayName("Record 4020: Company is Wggo Am W Q R T Fm")
	void CompanyOfRecord4020() {
		assertEquals("Wggo Am W Q R T Fm", customers.get(4019).getCompany());
	}

	@Test
	@DisplayName("Record 4020: Address is 402 Cedar St")
	void AddressOfRecord4020() {
		assertEquals("402 Cedar St", customers.get(4019).getAddress());
	}

	@Test
	@DisplayName("Record 4020: City is Abilene")
	void CityOfRecord4020() {
		assertEquals("Abilene", customers.get(4019).getCity());
	}

	@Test
	@DisplayName("Record 4020: County is Taylor")
	void CountyOfRecord4020() {
		assertEquals("Taylor", customers.get(4019).getCounty());
	}

	@Test
	@DisplayName("Record 4020: State is TX")
	void StateOfRecord4020() {
		assertEquals("TX", customers.get(4019).getState());
	}

	@Test
	@DisplayName("Record 4020: ZIP is 79601")
	void ZIPOfRecord4020() {
		assertEquals("79601", customers.get(4019).getZIP());
	}

	@Test
	@DisplayName("Record 4020: Phone is 325-676-3449")
	void PhoneOfRecord4020() {
		assertEquals("325-676-3449", customers.get(4019).getPhone());
	}

	@Test
	@DisplayName("Record 4020: Fax is 325-676-9515")
	void FaxOfRecord4020() {
		assertEquals("325-676-9515", customers.get(4019).getFax());
	}

	@Test
	@DisplayName("Record 4020: Email is melba@pownell.com")
	void EmailOfRecord4020() {
		assertEquals("melba@pownell.com", customers.get(4019).getEmail());
	}

	@Test
	@DisplayName("Record 4020: Web is http://www.melbapownell.com")
	void WebOfRecord4020() {
		assertEquals("http://www.melbapownell.com", customers.get(4019).getWeb());
	}
}
