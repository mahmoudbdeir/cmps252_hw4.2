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

@Tag("33")
class Record_4056 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4056: FirstName is Jarvis")
	void FirstNameOfRecord4056() {
		assertEquals("Jarvis", customers.get(4055).getFirstName());
	}

	@Test
	@DisplayName("Record 4056: LastName is Hedspeth")
	void LastNameOfRecord4056() {
		assertEquals("Hedspeth", customers.get(4055).getLastName());
	}

	@Test
	@DisplayName("Record 4056: Company is Akron Brass Co")
	void CompanyOfRecord4056() {
		assertEquals("Akron Brass Co", customers.get(4055).getCompany());
	}

	@Test
	@DisplayName("Record 4056: Address is 840 Commercial Ave")
	void AddressOfRecord4056() {
		assertEquals("840 Commercial Ave", customers.get(4055).getAddress());
	}

	@Test
	@DisplayName("Record 4056: City is San Gabriel")
	void CityOfRecord4056() {
		assertEquals("San Gabriel", customers.get(4055).getCity());
	}

	@Test
	@DisplayName("Record 4056: County is Los Angeles")
	void CountyOfRecord4056() {
		assertEquals("Los Angeles", customers.get(4055).getCounty());
	}

	@Test
	@DisplayName("Record 4056: State is CA")
	void StateOfRecord4056() {
		assertEquals("CA", customers.get(4055).getState());
	}

	@Test
	@DisplayName("Record 4056: ZIP is 91776")
	void ZIPOfRecord4056() {
		assertEquals("91776", customers.get(4055).getZIP());
	}

	@Test
	@DisplayName("Record 4056: Phone is 626-309-2016")
	void PhoneOfRecord4056() {
		assertEquals("626-309-2016", customers.get(4055).getPhone());
	}

	@Test
	@DisplayName("Record 4056: Fax is 626-309-4216")
	void FaxOfRecord4056() {
		assertEquals("626-309-4216", customers.get(4055).getFax());
	}

	@Test
	@DisplayName("Record 4056: Email is jarvis@hedspeth.com")
	void EmailOfRecord4056() {
		assertEquals("jarvis@hedspeth.com", customers.get(4055).getEmail());
	}

	@Test
	@DisplayName("Record 4056: Web is http://www.jarvishedspeth.com")
	void WebOfRecord4056() {
		assertEquals("http://www.jarvishedspeth.com", customers.get(4055).getWeb());
	}
}
