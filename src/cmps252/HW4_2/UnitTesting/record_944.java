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

@Tag("2")
class Record_944 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 944: FirstName is Rocio")
	void FirstNameOfRecord944() {
		assertEquals("Rocio", customers.get(943).getFirstName());
	}

	@Test
	@DisplayName("Record 944: LastName is Shines")
	void LastNameOfRecord944() {
		assertEquals("Shines", customers.get(943).getLastName());
	}

	@Test
	@DisplayName("Record 944: Company is Nardini Fire Equip Co N Dakota")
	void CompanyOfRecord944() {
		assertEquals("Nardini Fire Equip Co N Dakota", customers.get(943).getCompany());
	}

	@Test
	@DisplayName("Record 944: Address is 1315 Walnut St")
	void AddressOfRecord944() {
		assertEquals("1315 Walnut St", customers.get(943).getAddress());
	}

	@Test
	@DisplayName("Record 944: City is Philadelphia")
	void CityOfRecord944() {
		assertEquals("Philadelphia", customers.get(943).getCity());
	}

	@Test
	@DisplayName("Record 944: County is Philadelphia")
	void CountyOfRecord944() {
		assertEquals("Philadelphia", customers.get(943).getCounty());
	}

	@Test
	@DisplayName("Record 944: State is PA")
	void StateOfRecord944() {
		assertEquals("PA", customers.get(943).getState());
	}

	@Test
	@DisplayName("Record 944: ZIP is 19107")
	void ZIPOfRecord944() {
		assertEquals("19107", customers.get(943).getZIP());
	}

	@Test
	@DisplayName("Record 944: Phone is 215-546-5882")
	void PhoneOfRecord944() {
		assertEquals("215-546-5882", customers.get(943).getPhone());
	}

	@Test
	@DisplayName("Record 944: Fax is 215-546-6318")
	void FaxOfRecord944() {
		assertEquals("215-546-6318", customers.get(943).getFax());
	}

	@Test
	@DisplayName("Record 944: Email is rocio@shines.com")
	void EmailOfRecord944() {
		assertEquals("rocio@shines.com", customers.get(943).getEmail());
	}

	@Test
	@DisplayName("Record 944: Web is http://www.rocioshines.com")
	void WebOfRecord944() {
		assertEquals("http://www.rocioshines.com", customers.get(943).getWeb());
	}
}
