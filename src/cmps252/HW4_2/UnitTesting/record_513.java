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

@Tag("29")
class Record_513 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 513: FirstName is Iola")
	void FirstNameOfRecord513() {
		assertEquals("Iola", customers.get(512).getFirstName());
	}

	@Test
	@DisplayName("Record 513: LastName is Antell")
	void LastNameOfRecord513() {
		assertEquals("Antell", customers.get(512).getLastName());
	}

	@Test
	@DisplayName("Record 513: Company is Alescis Of South Euclid")
	void CompanyOfRecord513() {
		assertEquals("Alescis Of South Euclid", customers.get(512).getCompany());
	}

	@Test
	@DisplayName("Record 513: Address is 822 N Elm Pl")
	void AddressOfRecord513() {
		assertEquals("822 N Elm Pl", customers.get(512).getAddress());
	}

	@Test
	@DisplayName("Record 513: City is Broken Arrow")
	void CityOfRecord513() {
		assertEquals("Broken Arrow", customers.get(512).getCity());
	}

	@Test
	@DisplayName("Record 513: County is Tulsa")
	void CountyOfRecord513() {
		assertEquals("Tulsa", customers.get(512).getCounty());
	}

	@Test
	@DisplayName("Record 513: State is OK")
	void StateOfRecord513() {
		assertEquals("OK", customers.get(512).getState());
	}

	@Test
	@DisplayName("Record 513: ZIP is 74012")
	void ZIPOfRecord513() {
		assertEquals("74012", customers.get(512).getZIP());
	}

	@Test
	@DisplayName("Record 513: Phone is 918-251-0193")
	void PhoneOfRecord513() {
		assertEquals("918-251-0193", customers.get(512).getPhone());
	}

	@Test
	@DisplayName("Record 513: Fax is 918-251-8558")
	void FaxOfRecord513() {
		assertEquals("918-251-8558", customers.get(512).getFax());
	}

	@Test
	@DisplayName("Record 513: Email is iola@antell.com")
	void EmailOfRecord513() {
		assertEquals("iola@antell.com", customers.get(512).getEmail());
	}

	@Test
	@DisplayName("Record 513: Web is http://www.iolaantell.com")
	void WebOfRecord513() {
		assertEquals("http://www.iolaantell.com", customers.get(512).getWeb());
	}
}
