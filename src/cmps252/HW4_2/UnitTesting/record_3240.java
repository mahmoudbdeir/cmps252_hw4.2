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
class Record_3240 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3240: FirstName is Christina")
	void FirstNameOfRecord3240() {
		assertEquals("Christina", customers.get(3239).getFirstName());
	}

	@Test
	@DisplayName("Record 3240: LastName is Laidlaw")
	void LastNameOfRecord3240() {
		assertEquals("Laidlaw", customers.get(3239).getLastName());
	}

	@Test
	@DisplayName("Record 3240: Company is Aklufi And Wysocki")
	void CompanyOfRecord3240() {
		assertEquals("Aklufi And Wysocki", customers.get(3239).getCompany());
	}

	@Test
	@DisplayName("Record 3240: Address is 501 S Falkenburg Rd  #-c1")
	void AddressOfRecord3240() {
		assertEquals("501 S Falkenburg Rd  #-c1", customers.get(3239).getAddress());
	}

	@Test
	@DisplayName("Record 3240: City is Tampa")
	void CityOfRecord3240() {
		assertEquals("Tampa", customers.get(3239).getCity());
	}

	@Test
	@DisplayName("Record 3240: County is Hillsborough")
	void CountyOfRecord3240() {
		assertEquals("Hillsborough", customers.get(3239).getCounty());
	}

	@Test
	@DisplayName("Record 3240: State is FL")
	void StateOfRecord3240() {
		assertEquals("FL", customers.get(3239).getState());
	}

	@Test
	@DisplayName("Record 3240: ZIP is 33619")
	void ZIPOfRecord3240() {
		assertEquals("33619", customers.get(3239).getZIP());
	}

	@Test
	@DisplayName("Record 3240: Phone is 813-654-8154")
	void PhoneOfRecord3240() {
		assertEquals("813-654-8154", customers.get(3239).getPhone());
	}

	@Test
	@DisplayName("Record 3240: Fax is 813-654-5448")
	void FaxOfRecord3240() {
		assertEquals("813-654-5448", customers.get(3239).getFax());
	}

	@Test
	@DisplayName("Record 3240: Email is christina@laidlaw.com")
	void EmailOfRecord3240() {
		assertEquals("christina@laidlaw.com", customers.get(3239).getEmail());
	}

	@Test
	@DisplayName("Record 3240: Web is http://www.christinalaidlaw.com")
	void WebOfRecord3240() {
		assertEquals("http://www.christinalaidlaw.com", customers.get(3239).getWeb());
	}
}
