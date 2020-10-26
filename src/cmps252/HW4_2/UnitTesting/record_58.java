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

@Tag("8")
class Record_58 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 58: FirstName is Ivan")
	void FirstNameOfRecord58() {
		assertEquals("Ivan", customers.get(57).getFirstName());
	}

	@Test
	@DisplayName("Record 58: LastName is Cimaglia")
	void LastNameOfRecord58() {
		assertEquals("Cimaglia", customers.get(57).getLastName());
	}

	@Test
	@DisplayName("Record 58: Company is Surveying And Mapping Inc")
	void CompanyOfRecord58() {
		assertEquals("Surveying And Mapping Inc", customers.get(57).getCompany());
	}

	@Test
	@DisplayName("Record 58: Address is 29524 Kohoutek Way")
	void AddressOfRecord58() {
		assertEquals("29524 Kohoutek Way", customers.get(57).getAddress());
	}

	@Test
	@DisplayName("Record 58: City is Union City")
	void CityOfRecord58() {
		assertEquals("Union City", customers.get(57).getCity());
	}

	@Test
	@DisplayName("Record 58: County is Alameda")
	void CountyOfRecord58() {
		assertEquals("Alameda", customers.get(57).getCounty());
	}

	@Test
	@DisplayName("Record 58: State is CA")
	void StateOfRecord58() {
		assertEquals("CA", customers.get(57).getState());
	}

	@Test
	@DisplayName("Record 58: ZIP is 94587")
	void ZIPOfRecord58() {
		assertEquals("94587", customers.get(57).getZIP());
	}

	@Test
	@DisplayName("Record 58: Phone is 510-429-4828")
	void PhoneOfRecord58() {
		assertEquals("510-429-4828", customers.get(57).getPhone());
	}

	@Test
	@DisplayName("Record 58: Fax is 510-429-1348")
	void FaxOfRecord58() {
		assertEquals("510-429-1348", customers.get(57).getFax());
	}

	@Test
	@DisplayName("Record 58: Email is ivan@cimaglia.com")
	void EmailOfRecord58() {
		assertEquals("ivan@cimaglia.com", customers.get(57).getEmail());
	}

	@Test
	@DisplayName("Record 58: Web is http://www.ivancimaglia.com")
	void WebOfRecord58() {
		assertEquals("http://www.ivancimaglia.com", customers.get(57).getWeb());
	}
}
