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

@Tag("23")
class Record_2569 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2569: FirstName is Porter")
	void FirstNameOfRecord2569() {
		assertEquals("Porter", customers.get(2568).getFirstName());
	}

	@Test
	@DisplayName("Record 2569: LastName is Jetton")
	void LastNameOfRecord2569() {
		assertEquals("Jetton", customers.get(2568).getLastName());
	}

	@Test
	@DisplayName("Record 2569: Company is Guest Quarters Suite Resort")
	void CompanyOfRecord2569() {
		assertEquals("Guest Quarters Suite Resort", customers.get(2568).getCompany());
	}

	@Test
	@DisplayName("Record 2569: Address is 736 Main St")
	void AddressOfRecord2569() {
		assertEquals("736 Main St", customers.get(2568).getAddress());
	}

	@Test
	@DisplayName("Record 2569: City is New Rochelle")
	void CityOfRecord2569() {
		assertEquals("New Rochelle", customers.get(2568).getCity());
	}

	@Test
	@DisplayName("Record 2569: County is Westchester")
	void CountyOfRecord2569() {
		assertEquals("Westchester", customers.get(2568).getCounty());
	}

	@Test
	@DisplayName("Record 2569: State is NY")
	void StateOfRecord2569() {
		assertEquals("NY", customers.get(2568).getState());
	}

	@Test
	@DisplayName("Record 2569: ZIP is 10801")
	void ZIPOfRecord2569() {
		assertEquals("10801", customers.get(2568).getZIP());
	}

	@Test
	@DisplayName("Record 2569: Phone is 914-622-7981")
	void PhoneOfRecord2569() {
		assertEquals("914-622-7981", customers.get(2568).getPhone());
	}

	@Test
	@DisplayName("Record 2569: Fax is 914-622-6647")
	void FaxOfRecord2569() {
		assertEquals("914-622-6647", customers.get(2568).getFax());
	}

	@Test
	@DisplayName("Record 2569: Email is porter@jetton.com")
	void EmailOfRecord2569() {
		assertEquals("porter@jetton.com", customers.get(2568).getEmail());
	}

	@Test
	@DisplayName("Record 2569: Web is http://www.porterjetton.com")
	void WebOfRecord2569() {
		assertEquals("http://www.porterjetton.com", customers.get(2568).getWeb());
	}
}
