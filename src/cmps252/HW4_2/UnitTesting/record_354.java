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

@Tag("35")
class Record_354 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 354: FirstName is Theodora")
	void FirstNameOfRecord354() {
		assertEquals("Theodora", customers.get(353).getFirstName());
	}

	@Test
	@DisplayName("Record 354: LastName is Brezinka")
	void LastNameOfRecord354() {
		assertEquals("Brezinka", customers.get(353).getLastName());
	}

	@Test
	@DisplayName("Record 354: Company is Century 21 Golden Star")
	void CompanyOfRecord354() {
		assertEquals("Century 21 Golden Star", customers.get(353).getCompany());
	}

	@Test
	@DisplayName("Record 354: Address is 2797 Ne Columbia Blvd")
	void AddressOfRecord354() {
		assertEquals("2797 Ne Columbia Blvd", customers.get(353).getAddress());
	}

	@Test
	@DisplayName("Record 354: City is Portland")
	void CityOfRecord354() {
		assertEquals("Portland", customers.get(353).getCity());
	}

	@Test
	@DisplayName("Record 354: County is Multnomah")
	void CountyOfRecord354() {
		assertEquals("Multnomah", customers.get(353).getCounty());
	}

	@Test
	@DisplayName("Record 354: State is OR")
	void StateOfRecord354() {
		assertEquals("OR", customers.get(353).getState());
	}

	@Test
	@DisplayName("Record 354: ZIP is 97211")
	void ZIPOfRecord354() {
		assertEquals("97211", customers.get(353).getZIP());
	}

	@Test
	@DisplayName("Record 354: Phone is 503-284-9070")
	void PhoneOfRecord354() {
		assertEquals("503-284-9070", customers.get(353).getPhone());
	}

	@Test
	@DisplayName("Record 354: Fax is 503-284-1284")
	void FaxOfRecord354() {
		assertEquals("503-284-1284", customers.get(353).getFax());
	}

	@Test
	@DisplayName("Record 354: Email is theodora@brezinka.com")
	void EmailOfRecord354() {
		assertEquals("theodora@brezinka.com", customers.get(353).getEmail());
	}

	@Test
	@DisplayName("Record 354: Web is http://www.theodorabrezinka.com")
	void WebOfRecord354() {
		assertEquals("http://www.theodorabrezinka.com", customers.get(353).getWeb());
	}
}
