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

@Tag("10")
class Record_2663 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2663: FirstName is Ola")
	void FirstNameOfRecord2663() {
		assertEquals("Ola", customers.get(2662).getFirstName());
	}

	@Test
	@DisplayName("Record 2663: LastName is Philps")
	void LastNameOfRecord2663() {
		assertEquals("Philps", customers.get(2662).getLastName());
	}

	@Test
	@DisplayName("Record 2663: Company is White Fulfillment")
	void CompanyOfRecord2663() {
		assertEquals("White Fulfillment", customers.get(2662).getCompany());
	}

	@Test
	@DisplayName("Record 2663: Address is 731 S Sherman St")
	void AddressOfRecord2663() {
		assertEquals("731 S Sherman St", customers.get(2662).getAddress());
	}

	@Test
	@DisplayName("Record 2663: City is Richardson")
	void CityOfRecord2663() {
		assertEquals("Richardson", customers.get(2662).getCity());
	}

	@Test
	@DisplayName("Record 2663: County is Dallas")
	void CountyOfRecord2663() {
		assertEquals("Dallas", customers.get(2662).getCounty());
	}

	@Test
	@DisplayName("Record 2663: State is TX")
	void StateOfRecord2663() {
		assertEquals("TX", customers.get(2662).getState());
	}

	@Test
	@DisplayName("Record 2663: ZIP is 75081")
	void ZIPOfRecord2663() {
		assertEquals("75081", customers.get(2662).getZIP());
	}

	@Test
	@DisplayName("Record 2663: Phone is 972-296-6864")
	void PhoneOfRecord2663() {
		assertEquals("972-296-6864", customers.get(2662).getPhone());
	}

	@Test
	@DisplayName("Record 2663: Fax is 972-296-7054")
	void FaxOfRecord2663() {
		assertEquals("972-296-7054", customers.get(2662).getFax());
	}

	@Test
	@DisplayName("Record 2663: Email is ola@philps.com")
	void EmailOfRecord2663() {
		assertEquals("ola@philps.com", customers.get(2662).getEmail());
	}

	@Test
	@DisplayName("Record 2663: Web is http://www.olaphilps.com")
	void WebOfRecord2663() {
		assertEquals("http://www.olaphilps.com", customers.get(2662).getWeb());
	}
}
