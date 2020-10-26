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
class Record_4715 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4715: FirstName is John")
	void FirstNameOfRecord4715() {
		assertEquals("John", customers.get(4714).getFirstName());
	}

	@Test
	@DisplayName("Record 4715: LastName is Schydler")
	void LastNameOfRecord4715() {
		assertEquals("Schydler", customers.get(4714).getLastName());
	}

	@Test
	@DisplayName("Record 4715: Company is Clara Barton Manor")
	void CompanyOfRecord4715() {
		assertEquals("Clara Barton Manor", customers.get(4714).getCompany());
	}

	@Test
	@DisplayName("Record 4715: Address is Ben Simon ' S")
	void AddressOfRecord4715() {
		assertEquals("Ben Simon ' S", customers.get(4714).getAddress());
	}

	@Test
	@DisplayName("Record 4715: City is Lincoln")
	void CityOfRecord4715() {
		assertEquals("Lincoln", customers.get(4714).getCity());
	}

	@Test
	@DisplayName("Record 4715: County is Lancaster")
	void CountyOfRecord4715() {
		assertEquals("Lancaster", customers.get(4714).getCounty());
	}

	@Test
	@DisplayName("Record 4715: State is NE")
	void StateOfRecord4715() {
		assertEquals("NE", customers.get(4714).getState());
	}

	@Test
	@DisplayName("Record 4715: ZIP is 68505")
	void ZIPOfRecord4715() {
		assertEquals("68505", customers.get(4714).getZIP());
	}

	@Test
	@DisplayName("Record 4715: Phone is 402-434-8807")
	void PhoneOfRecord4715() {
		assertEquals("402-434-8807", customers.get(4714).getPhone());
	}

	@Test
	@DisplayName("Record 4715: Fax is 402-434-5641")
	void FaxOfRecord4715() {
		assertEquals("402-434-5641", customers.get(4714).getFax());
	}

	@Test
	@DisplayName("Record 4715: Email is john@schydler.com")
	void EmailOfRecord4715() {
		assertEquals("john@schydler.com", customers.get(4714).getEmail());
	}

	@Test
	@DisplayName("Record 4715: Web is http://www.johnschydler.com")
	void WebOfRecord4715() {
		assertEquals("http://www.johnschydler.com", customers.get(4714).getWeb());
	}
}
