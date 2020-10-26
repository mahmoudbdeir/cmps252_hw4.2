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

@Tag("27")
class Record_3131 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3131: FirstName is Eunice")
	void FirstNameOfRecord3131() {
		assertEquals("Eunice", customers.get(3130).getFirstName());
	}

	@Test
	@DisplayName("Record 3131: LastName is Kuenzi")
	void LastNameOfRecord3131() {
		assertEquals("Kuenzi", customers.get(3130).getLastName());
	}

	@Test
	@DisplayName("Record 3131: Company is Longley Supply Co")
	void CompanyOfRecord3131() {
		assertEquals("Longley Supply Co", customers.get(3130).getCompany());
	}

	@Test
	@DisplayName("Record 3131: Address is 2209 S 58th St")
	void AddressOfRecord3131() {
		assertEquals("2209 S 58th St", customers.get(3130).getAddress());
	}

	@Test
	@DisplayName("Record 3131: City is Philadelphia")
	void CityOfRecord3131() {
		assertEquals("Philadelphia", customers.get(3130).getCity());
	}

	@Test
	@DisplayName("Record 3131: County is Philadelphia")
	void CountyOfRecord3131() {
		assertEquals("Philadelphia", customers.get(3130).getCounty());
	}

	@Test
	@DisplayName("Record 3131: State is PA")
	void StateOfRecord3131() {
		assertEquals("PA", customers.get(3130).getState());
	}

	@Test
	@DisplayName("Record 3131: ZIP is 19143")
	void ZIPOfRecord3131() {
		assertEquals("19143", customers.get(3130).getZIP());
	}

	@Test
	@DisplayName("Record 3131: Phone is 215-729-8661")
	void PhoneOfRecord3131() {
		assertEquals("215-729-8661", customers.get(3130).getPhone());
	}

	@Test
	@DisplayName("Record 3131: Fax is 215-729-6745")
	void FaxOfRecord3131() {
		assertEquals("215-729-6745", customers.get(3130).getFax());
	}

	@Test
	@DisplayName("Record 3131: Email is eunice@kuenzi.com")
	void EmailOfRecord3131() {
		assertEquals("eunice@kuenzi.com", customers.get(3130).getEmail());
	}

	@Test
	@DisplayName("Record 3131: Web is http://www.eunicekuenzi.com")
	void WebOfRecord3131() {
		assertEquals("http://www.eunicekuenzi.com", customers.get(3130).getWeb());
	}
}
