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

@Tag("24")
class Record_1489 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1489: FirstName is Tommie")
	void FirstNameOfRecord1489() {
		assertEquals("Tommie", customers.get(1488).getFirstName());
	}

	@Test
	@DisplayName("Record 1489: LastName is Mayen")
	void LastNameOfRecord1489() {
		assertEquals("Mayen", customers.get(1488).getLastName());
	}

	@Test
	@DisplayName("Record 1489: Company is Wekiva Assembly")
	void CompanyOfRecord1489() {
		assertEquals("Wekiva Assembly", customers.get(1488).getCompany());
	}

	@Test
	@DisplayName("Record 1489: Address is 100 W Main St")
	void AddressOfRecord1489() {
		assertEquals("100 W Main St", customers.get(1488).getAddress());
	}

	@Test
	@DisplayName("Record 1489: City is Riverton")
	void CityOfRecord1489() {
		assertEquals("Riverton", customers.get(1488).getCity());
	}

	@Test
	@DisplayName("Record 1489: County is Fremont")
	void CountyOfRecord1489() {
		assertEquals("Fremont", customers.get(1488).getCounty());
	}

	@Test
	@DisplayName("Record 1489: State is WY")
	void StateOfRecord1489() {
		assertEquals("WY", customers.get(1488).getState());
	}

	@Test
	@DisplayName("Record 1489: ZIP is 82501")
	void ZIPOfRecord1489() {
		assertEquals("82501", customers.get(1488).getZIP());
	}

	@Test
	@DisplayName("Record 1489: Phone is 307-857-4814")
	void PhoneOfRecord1489() {
		assertEquals("307-857-4814", customers.get(1488).getPhone());
	}

	@Test
	@DisplayName("Record 1489: Fax is 307-857-4307")
	void FaxOfRecord1489() {
		assertEquals("307-857-4307", customers.get(1488).getFax());
	}

	@Test
	@DisplayName("Record 1489: Email is tommie@mayen.com")
	void EmailOfRecord1489() {
		assertEquals("tommie@mayen.com", customers.get(1488).getEmail());
	}

	@Test
	@DisplayName("Record 1489: Web is http://www.tommiemayen.com")
	void WebOfRecord1489() {
		assertEquals("http://www.tommiemayen.com", customers.get(1488).getWeb());
	}
}
