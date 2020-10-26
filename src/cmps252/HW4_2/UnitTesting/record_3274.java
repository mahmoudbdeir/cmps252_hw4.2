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

@Tag("48")
class Record_3274 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3274: FirstName is Gayle")
	void FirstNameOfRecord3274() {
		assertEquals("Gayle", customers.get(3273).getFirstName());
	}

	@Test
	@DisplayName("Record 3274: LastName is Dearmon")
	void LastNameOfRecord3274() {
		assertEquals("Dearmon", customers.get(3273).getLastName());
	}

	@Test
	@DisplayName("Record 3274: Company is Lee, N Joseph Esq")
	void CompanyOfRecord3274() {
		assertEquals("Lee, N Joseph Esq", customers.get(3273).getCompany());
	}

	@Test
	@DisplayName("Record 3274: Address is 1418 Laurel St")
	void AddressOfRecord3274() {
		assertEquals("1418 Laurel St", customers.get(3273).getAddress());
	}

	@Test
	@DisplayName("Record 3274: City is Columbia")
	void CityOfRecord3274() {
		assertEquals("Columbia", customers.get(3273).getCity());
	}

	@Test
	@DisplayName("Record 3274: County is Richland")
	void CountyOfRecord3274() {
		assertEquals("Richland", customers.get(3273).getCounty());
	}

	@Test
	@DisplayName("Record 3274: State is SC")
	void StateOfRecord3274() {
		assertEquals("SC", customers.get(3273).getState());
	}

	@Test
	@DisplayName("Record 3274: ZIP is 29201")
	void ZIPOfRecord3274() {
		assertEquals("29201", customers.get(3273).getZIP());
	}

	@Test
	@DisplayName("Record 3274: Phone is 803-252-2106")
	void PhoneOfRecord3274() {
		assertEquals("803-252-2106", customers.get(3273).getPhone());
	}

	@Test
	@DisplayName("Record 3274: Fax is 803-252-8182")
	void FaxOfRecord3274() {
		assertEquals("803-252-8182", customers.get(3273).getFax());
	}

	@Test
	@DisplayName("Record 3274: Email is gayle@dearmon.com")
	void EmailOfRecord3274() {
		assertEquals("gayle@dearmon.com", customers.get(3273).getEmail());
	}

	@Test
	@DisplayName("Record 3274: Web is http://www.gayledearmon.com")
	void WebOfRecord3274() {
		assertEquals("http://www.gayledearmon.com", customers.get(3273).getWeb());
	}
}
