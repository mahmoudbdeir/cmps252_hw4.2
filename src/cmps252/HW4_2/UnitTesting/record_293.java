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

@Tag("34")
class Record_293 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 293: FirstName is Bob")
	void FirstNameOfRecord293() {
		assertEquals("Bob", customers.get(292).getFirstName());
	}

	@Test
	@DisplayName("Record 293: LastName is Toeller")
	void LastNameOfRecord293() {
		assertEquals("Toeller", customers.get(292).getLastName());
	}

	@Test
	@DisplayName("Record 293: Company is Front Row Experience")
	void CompanyOfRecord293() {
		assertEquals("Front Row Experience", customers.get(292).getCompany());
	}

	@Test
	@DisplayName("Record 293: Address is 1200 Auction Rd")
	void AddressOfRecord293() {
		assertEquals("1200 Auction Rd", customers.get(292).getAddress());
	}

	@Test
	@DisplayName("Record 293: City is Fallon")
	void CityOfRecord293() {
		assertEquals("Fallon", customers.get(292).getCity());
	}

	@Test
	@DisplayName("Record 293: County is Churchill")
	void CountyOfRecord293() {
		assertEquals("Churchill", customers.get(292).getCounty());
	}

	@Test
	@DisplayName("Record 293: State is NV")
	void StateOfRecord293() {
		assertEquals("NV", customers.get(292).getState());
	}

	@Test
	@DisplayName("Record 293: ZIP is 89406")
	void ZIPOfRecord293() {
		assertEquals("89406", customers.get(292).getZIP());
	}

	@Test
	@DisplayName("Record 293: Phone is 775-423-7972")
	void PhoneOfRecord293() {
		assertEquals("775-423-7972", customers.get(292).getPhone());
	}

	@Test
	@DisplayName("Record 293: Fax is 775-423-6897")
	void FaxOfRecord293() {
		assertEquals("775-423-6897", customers.get(292).getFax());
	}

	@Test
	@DisplayName("Record 293: Email is bob@toeller.com")
	void EmailOfRecord293() {
		assertEquals("bob@toeller.com", customers.get(292).getEmail());
	}

	@Test
	@DisplayName("Record 293: Web is http://www.bobtoeller.com")
	void WebOfRecord293() {
		assertEquals("http://www.bobtoeller.com", customers.get(292).getWeb());
	}
}
