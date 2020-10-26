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

@Tag("32")
class Record_4641 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4641: FirstName is Dave")
	void FirstNameOfRecord4641() {
		assertEquals("Dave", customers.get(4640).getFirstName());
	}

	@Test
	@DisplayName("Record 4641: LastName is Lepera")
	void LastNameOfRecord4641() {
		assertEquals("Lepera", customers.get(4640).getLastName());
	}

	@Test
	@DisplayName("Record 4641: Company is J & L Fasteners")
	void CompanyOfRecord4641() {
		assertEquals("J & L Fasteners", customers.get(4640).getCompany());
	}

	@Test
	@DisplayName("Record 4641: Address is 605 W Saint Mary Blvd")
	void AddressOfRecord4641() {
		assertEquals("605 W Saint Mary Blvd", customers.get(4640).getAddress());
	}

	@Test
	@DisplayName("Record 4641: City is Lafayette")
	void CityOfRecord4641() {
		assertEquals("Lafayette", customers.get(4640).getCity());
	}

	@Test
	@DisplayName("Record 4641: County is Lafayette")
	void CountyOfRecord4641() {
		assertEquals("Lafayette", customers.get(4640).getCounty());
	}

	@Test
	@DisplayName("Record 4641: State is LA")
	void StateOfRecord4641() {
		assertEquals("LA", customers.get(4640).getState());
	}

	@Test
	@DisplayName("Record 4641: ZIP is 70506")
	void ZIPOfRecord4641() {
		assertEquals("70506", customers.get(4640).getZIP());
	}

	@Test
	@DisplayName("Record 4641: Phone is 337-235-1178")
	void PhoneOfRecord4641() {
		assertEquals("337-235-1178", customers.get(4640).getPhone());
	}

	@Test
	@DisplayName("Record 4641: Fax is 337-235-3013")
	void FaxOfRecord4641() {
		assertEquals("337-235-3013", customers.get(4640).getFax());
	}

	@Test
	@DisplayName("Record 4641: Email is dave@lepera.com")
	void EmailOfRecord4641() {
		assertEquals("dave@lepera.com", customers.get(4640).getEmail());
	}

	@Test
	@DisplayName("Record 4641: Web is http://www.davelepera.com")
	void WebOfRecord4641() {
		assertEquals("http://www.davelepera.com", customers.get(4640).getWeb());
	}
}
