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

@Tag("18")
class Record_3010 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3010: FirstName is Marisol")
	void FirstNameOfRecord3010() {
		assertEquals("Marisol", customers.get(3009).getFirstName());
	}

	@Test
	@DisplayName("Record 3010: LastName is Dusik")
	void LastNameOfRecord3010() {
		assertEquals("Dusik", customers.get(3009).getLastName());
	}

	@Test
	@DisplayName("Record 3010: Company is A B C Quickprinters")
	void CompanyOfRecord3010() {
		assertEquals("A B C Quickprinters", customers.get(3009).getCompany());
	}

	@Test
	@DisplayName("Record 3010: Address is 8427 Bird Rd")
	void AddressOfRecord3010() {
		assertEquals("8427 Bird Rd", customers.get(3009).getAddress());
	}

	@Test
	@DisplayName("Record 3010: City is Miami")
	void CityOfRecord3010() {
		assertEquals("Miami", customers.get(3009).getCity());
	}

	@Test
	@DisplayName("Record 3010: County is Miami-Dade")
	void CountyOfRecord3010() {
		assertEquals("Miami-Dade", customers.get(3009).getCounty());
	}

	@Test
	@DisplayName("Record 3010: State is FL")
	void StateOfRecord3010() {
		assertEquals("FL", customers.get(3009).getState());
	}

	@Test
	@DisplayName("Record 3010: ZIP is 33155")
	void ZIPOfRecord3010() {
		assertEquals("33155", customers.get(3009).getZIP());
	}

	@Test
	@DisplayName("Record 3010: Phone is 305-223-2725")
	void PhoneOfRecord3010() {
		assertEquals("305-223-2725", customers.get(3009).getPhone());
	}

	@Test
	@DisplayName("Record 3010: Fax is 305-223-0413")
	void FaxOfRecord3010() {
		assertEquals("305-223-0413", customers.get(3009).getFax());
	}

	@Test
	@DisplayName("Record 3010: Email is marisol@dusik.com")
	void EmailOfRecord3010() {
		assertEquals("marisol@dusik.com", customers.get(3009).getEmail());
	}

	@Test
	@DisplayName("Record 3010: Web is http://www.marisoldusik.com")
	void WebOfRecord3010() {
		assertEquals("http://www.marisoldusik.com", customers.get(3009).getWeb());
	}
}
