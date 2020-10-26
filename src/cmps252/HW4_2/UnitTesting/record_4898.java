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

@Tag("12")
class Record_4898 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4898: FirstName is Mckinley")
	void FirstNameOfRecord4898() {
		assertEquals("Mckinley", customers.get(4897).getFirstName());
	}

	@Test
	@DisplayName("Record 4898: LastName is Storbeck")
	void LastNameOfRecord4898() {
		assertEquals("Storbeck", customers.get(4897).getLastName());
	}

	@Test
	@DisplayName("Record 4898: Company is Solter, George D Esq")
	void CompanyOfRecord4898() {
		assertEquals("Solter, George D Esq", customers.get(4897).getCompany());
	}

	@Test
	@DisplayName("Record 4898: Address is 2 Overhill Rd")
	void AddressOfRecord4898() {
		assertEquals("2 Overhill Rd", customers.get(4897).getAddress());
	}

	@Test
	@DisplayName("Record 4898: City is Scarsdale")
	void CityOfRecord4898() {
		assertEquals("Scarsdale", customers.get(4897).getCity());
	}

	@Test
	@DisplayName("Record 4898: County is Westchester")
	void CountyOfRecord4898() {
		assertEquals("Westchester", customers.get(4897).getCounty());
	}

	@Test
	@DisplayName("Record 4898: State is NY")
	void StateOfRecord4898() {
		assertEquals("NY", customers.get(4897).getState());
	}

	@Test
	@DisplayName("Record 4898: ZIP is 10583")
	void ZIPOfRecord4898() {
		assertEquals("10583", customers.get(4897).getZIP());
	}

	@Test
	@DisplayName("Record 4898: Phone is 914-725-7611")
	void PhoneOfRecord4898() {
		assertEquals("914-725-7611", customers.get(4897).getPhone());
	}

	@Test
	@DisplayName("Record 4898: Fax is 914-725-5057")
	void FaxOfRecord4898() {
		assertEquals("914-725-5057", customers.get(4897).getFax());
	}

	@Test
	@DisplayName("Record 4898: Email is mckinley@storbeck.com")
	void EmailOfRecord4898() {
		assertEquals("mckinley@storbeck.com", customers.get(4897).getEmail());
	}

	@Test
	@DisplayName("Record 4898: Web is http://www.mckinleystorbeck.com")
	void WebOfRecord4898() {
		assertEquals("http://www.mckinleystorbeck.com", customers.get(4897).getWeb());
	}
}
