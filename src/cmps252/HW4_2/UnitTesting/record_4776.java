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

@Tag("6")
class Record_4776 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4776: FirstName is Elton")
	void FirstNameOfRecord4776() {
		assertEquals("Elton", customers.get(4775).getFirstName());
	}

	@Test
	@DisplayName("Record 4776: LastName is Ulberg")
	void LastNameOfRecord4776() {
		assertEquals("Ulberg", customers.get(4775).getLastName());
	}

	@Test
	@DisplayName("Record 4776: Company is Murai Farms Inc")
	void CompanyOfRecord4776() {
		assertEquals("Murai Farms Inc", customers.get(4775).getCompany());
	}

	@Test
	@DisplayName("Record 4776: Address is Box #-1662")
	void AddressOfRecord4776() {
		assertEquals("Box #-1662", customers.get(4775).getAddress());
	}

	@Test
	@DisplayName("Record 4776: City is Rancho Santa Fe")
	void CityOfRecord4776() {
		assertEquals("Rancho Santa Fe", customers.get(4775).getCity());
	}

	@Test
	@DisplayName("Record 4776: County is San Diego")
	void CountyOfRecord4776() {
		assertEquals("San Diego", customers.get(4775).getCounty());
	}

	@Test
	@DisplayName("Record 4776: State is CA")
	void StateOfRecord4776() {
		assertEquals("CA", customers.get(4775).getState());
	}

	@Test
	@DisplayName("Record 4776: ZIP is 92067")
	void ZIPOfRecord4776() {
		assertEquals("92067", customers.get(4775).getZIP());
	}

	@Test
	@DisplayName("Record 4776: Phone is 760-259-1798")
	void PhoneOfRecord4776() {
		assertEquals("760-259-1798", customers.get(4775).getPhone());
	}

	@Test
	@DisplayName("Record 4776: Fax is 760-259-2797")
	void FaxOfRecord4776() {
		assertEquals("760-259-2797", customers.get(4775).getFax());
	}

	@Test
	@DisplayName("Record 4776: Email is elton@ulberg.com")
	void EmailOfRecord4776() {
		assertEquals("elton@ulberg.com", customers.get(4775).getEmail());
	}

	@Test
	@DisplayName("Record 4776: Web is http://www.eltonulberg.com")
	void WebOfRecord4776() {
		assertEquals("http://www.eltonulberg.com", customers.get(4775).getWeb());
	}
}
