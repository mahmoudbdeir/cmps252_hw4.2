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

@Tag("43")
class Record_1305 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1305: FirstName is Gary")
	void FirstNameOfRecord1305() {
		assertEquals("Gary", customers.get(1304).getFirstName());
	}

	@Test
	@DisplayName("Record 1305: LastName is Jenner")
	void LastNameOfRecord1305() {
		assertEquals("Jenner", customers.get(1304).getLastName());
	}

	@Test
	@DisplayName("Record 1305: Company is Country Kitchen Restrnt")
	void CompanyOfRecord1305() {
		assertEquals("Country Kitchen Restrnt", customers.get(1304).getCompany());
	}

	@Test
	@DisplayName("Record 1305: Address is 6253 Industrial Rd  #-g")
	void AddressOfRecord1305() {
		assertEquals("6253 Industrial Rd  #-g", customers.get(1304).getAddress());
	}

	@Test
	@DisplayName("Record 1305: City is Las Vegas")
	void CityOfRecord1305() {
		assertEquals("Las Vegas", customers.get(1304).getCity());
	}

	@Test
	@DisplayName("Record 1305: County is Clark")
	void CountyOfRecord1305() {
		assertEquals("Clark", customers.get(1304).getCounty());
	}

	@Test
	@DisplayName("Record 1305: State is NV")
	void StateOfRecord1305() {
		assertEquals("NV", customers.get(1304).getState());
	}

	@Test
	@DisplayName("Record 1305: ZIP is 89118")
	void ZIPOfRecord1305() {
		assertEquals("89118", customers.get(1304).getZIP());
	}

	@Test
	@DisplayName("Record 1305: Phone is 702-361-2449")
	void PhoneOfRecord1305() {
		assertEquals("702-361-2449", customers.get(1304).getPhone());
	}

	@Test
	@DisplayName("Record 1305: Fax is 702-361-3309")
	void FaxOfRecord1305() {
		assertEquals("702-361-3309", customers.get(1304).getFax());
	}

	@Test
	@DisplayName("Record 1305: Email is gary@jenner.com")
	void EmailOfRecord1305() {
		assertEquals("gary@jenner.com", customers.get(1304).getEmail());
	}

	@Test
	@DisplayName("Record 1305: Web is http://www.garyjenner.com")
	void WebOfRecord1305() {
		assertEquals("http://www.garyjenner.com", customers.get(1304).getWeb());
	}
}
