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

@Tag("25")
class Record_1718 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1718: FirstName is Marybeth")
	void FirstNameOfRecord1718() {
		assertEquals("Marybeth", customers.get(1717).getFirstName());
	}

	@Test
	@DisplayName("Record 1718: LastName is Szczepanek")
	void LastNameOfRecord1718() {
		assertEquals("Szczepanek", customers.get(1717).getLastName());
	}

	@Test
	@DisplayName("Record 1718: Company is Gulf Marine & Ind Supl Inc")
	void CompanyOfRecord1718() {
		assertEquals("Gulf Marine & Ind Supl Inc", customers.get(1717).getCompany());
	}

	@Test
	@DisplayName("Record 1718: Address is 4550 Torresdale Ave")
	void AddressOfRecord1718() {
		assertEquals("4550 Torresdale Ave", customers.get(1717).getAddress());
	}

	@Test
	@DisplayName("Record 1718: City is Philadelphia")
	void CityOfRecord1718() {
		assertEquals("Philadelphia", customers.get(1717).getCity());
	}

	@Test
	@DisplayName("Record 1718: County is Philadelphia")
	void CountyOfRecord1718() {
		assertEquals("Philadelphia", customers.get(1717).getCounty());
	}

	@Test
	@DisplayName("Record 1718: State is PA")
	void StateOfRecord1718() {
		assertEquals("PA", customers.get(1717).getState());
	}

	@Test
	@DisplayName("Record 1718: ZIP is 19124")
	void ZIPOfRecord1718() {
		assertEquals("19124", customers.get(1717).getZIP());
	}

	@Test
	@DisplayName("Record 1718: Phone is 215-743-6875")
	void PhoneOfRecord1718() {
		assertEquals("215-743-6875", customers.get(1717).getPhone());
	}

	@Test
	@DisplayName("Record 1718: Fax is 215-743-4317")
	void FaxOfRecord1718() {
		assertEquals("215-743-4317", customers.get(1717).getFax());
	}

	@Test
	@DisplayName("Record 1718: Email is marybeth@szczepanek.com")
	void EmailOfRecord1718() {
		assertEquals("marybeth@szczepanek.com", customers.get(1717).getEmail());
	}

	@Test
	@DisplayName("Record 1718: Web is http://www.marybethszczepanek.com")
	void WebOfRecord1718() {
		assertEquals("http://www.marybethszczepanek.com", customers.get(1717).getWeb());
	}
}
