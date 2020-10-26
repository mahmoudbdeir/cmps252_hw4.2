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

@Tag("44")
class Record_3029 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3029: FirstName is Maribel")
	void FirstNameOfRecord3029() {
		assertEquals("Maribel", customers.get(3028).getFirstName());
	}

	@Test
	@DisplayName("Record 3029: LastName is Bowser")
	void LastNameOfRecord3029() {
		assertEquals("Bowser", customers.get(3028).getLastName());
	}

	@Test
	@DisplayName("Record 3029: Company is Yoder, Mark G Esq")
	void CompanyOfRecord3029() {
		assertEquals("Yoder, Mark G Esq", customers.get(3028).getCompany());
	}

	@Test
	@DisplayName("Record 3029: Address is 320 Smith Ln")
	void AddressOfRecord3029() {
		assertEquals("320 Smith Ln", customers.get(3028).getAddress());
	}

	@Test
	@DisplayName("Record 3029: City is San Marcos")
	void CityOfRecord3029() {
		assertEquals("San Marcos", customers.get(3028).getCity());
	}

	@Test
	@DisplayName("Record 3029: County is Hays")
	void CountyOfRecord3029() {
		assertEquals("Hays", customers.get(3028).getCounty());
	}

	@Test
	@DisplayName("Record 3029: State is TX")
	void StateOfRecord3029() {
		assertEquals("TX", customers.get(3028).getState());
	}

	@Test
	@DisplayName("Record 3029: ZIP is 78666")
	void ZIPOfRecord3029() {
		assertEquals("78666", customers.get(3028).getZIP());
	}

	@Test
	@DisplayName("Record 3029: Phone is 512-357-2277")
	void PhoneOfRecord3029() {
		assertEquals("512-357-2277", customers.get(3028).getPhone());
	}

	@Test
	@DisplayName("Record 3029: Fax is 512-357-9222")
	void FaxOfRecord3029() {
		assertEquals("512-357-9222", customers.get(3028).getFax());
	}

	@Test
	@DisplayName("Record 3029: Email is maribel@bowser.com")
	void EmailOfRecord3029() {
		assertEquals("maribel@bowser.com", customers.get(3028).getEmail());
	}

	@Test
	@DisplayName("Record 3029: Web is http://www.maribelbowser.com")
	void WebOfRecord3029() {
		assertEquals("http://www.maribelbowser.com", customers.get(3028).getWeb());
	}
}
