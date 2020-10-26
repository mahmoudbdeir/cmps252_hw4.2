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

@Tag("43")
class Record_4276 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4276: FirstName is Mara")
	void FirstNameOfRecord4276() {
		assertEquals("Mara", customers.get(4275).getFirstName());
	}

	@Test
	@DisplayName("Record 4276: LastName is Liechty")
	void LastNameOfRecord4276() {
		assertEquals("Liechty", customers.get(4275).getLastName());
	}

	@Test
	@DisplayName("Record 4276: Company is Plaza Nine")
	void CompanyOfRecord4276() {
		assertEquals("Plaza Nine", customers.get(4275).getCompany());
	}

	@Test
	@DisplayName("Record 4276: Address is 1888 Century Park E")
	void AddressOfRecord4276() {
		assertEquals("1888 Century Park E", customers.get(4275).getAddress());
	}

	@Test
	@DisplayName("Record 4276: City is Los Angeles")
	void CityOfRecord4276() {
		assertEquals("Los Angeles", customers.get(4275).getCity());
	}

	@Test
	@DisplayName("Record 4276: County is Los Angeles")
	void CountyOfRecord4276() {
		assertEquals("Los Angeles", customers.get(4275).getCounty());
	}

	@Test
	@DisplayName("Record 4276: State is CA")
	void StateOfRecord4276() {
		assertEquals("CA", customers.get(4275).getState());
	}

	@Test
	@DisplayName("Record 4276: ZIP is 90067")
	void ZIPOfRecord4276() {
		assertEquals("90067", customers.get(4275).getZIP());
	}

	@Test
	@DisplayName("Record 4276: Phone is 310-553-8257")
	void PhoneOfRecord4276() {
		assertEquals("310-553-8257", customers.get(4275).getPhone());
	}

	@Test
	@DisplayName("Record 4276: Fax is 310-553-9572")
	void FaxOfRecord4276() {
		assertEquals("310-553-9572", customers.get(4275).getFax());
	}

	@Test
	@DisplayName("Record 4276: Email is mara@liechty.com")
	void EmailOfRecord4276() {
		assertEquals("mara@liechty.com", customers.get(4275).getEmail());
	}

	@Test
	@DisplayName("Record 4276: Web is http://www.maraliechty.com")
	void WebOfRecord4276() {
		assertEquals("http://www.maraliechty.com", customers.get(4275).getWeb());
	}
}
