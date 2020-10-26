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

@Tag("15")
class Record_1625 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1625: FirstName is Morton")
	void FirstNameOfRecord1625() {
		assertEquals("Morton", customers.get(1624).getFirstName());
	}

	@Test
	@DisplayName("Record 1625: LastName is Lichtenstone")
	void LastNameOfRecord1625() {
		assertEquals("Lichtenstone", customers.get(1624).getLastName());
	}

	@Test
	@DisplayName("Record 1625: Company is Amercn Fmly Life Assurnc Co")
	void CompanyOfRecord1625() {
		assertEquals("Amercn Fmly Life Assurnc Co", customers.get(1624).getCompany());
	}

	@Test
	@DisplayName("Record 1625: Address is 4865 S Pecos Rd")
	void AddressOfRecord1625() {
		assertEquals("4865 S Pecos Rd", customers.get(1624).getAddress());
	}

	@Test
	@DisplayName("Record 1625: City is Las Vegas")
	void CityOfRecord1625() {
		assertEquals("Las Vegas", customers.get(1624).getCity());
	}

	@Test
	@DisplayName("Record 1625: County is Clark")
	void CountyOfRecord1625() {
		assertEquals("Clark", customers.get(1624).getCounty());
	}

	@Test
	@DisplayName("Record 1625: State is NV")
	void StateOfRecord1625() {
		assertEquals("NV", customers.get(1624).getState());
	}

	@Test
	@DisplayName("Record 1625: ZIP is 89121")
	void ZIPOfRecord1625() {
		assertEquals("89121", customers.get(1624).getZIP());
	}

	@Test
	@DisplayName("Record 1625: Phone is 702-454-6951")
	void PhoneOfRecord1625() {
		assertEquals("702-454-6951", customers.get(1624).getPhone());
	}

	@Test
	@DisplayName("Record 1625: Fax is 702-454-6164")
	void FaxOfRecord1625() {
		assertEquals("702-454-6164", customers.get(1624).getFax());
	}

	@Test
	@DisplayName("Record 1625: Email is morton@lichtenstone.com")
	void EmailOfRecord1625() {
		assertEquals("morton@lichtenstone.com", customers.get(1624).getEmail());
	}

	@Test
	@DisplayName("Record 1625: Web is http://www.mortonlichtenstone.com")
	void WebOfRecord1625() {
		assertEquals("http://www.mortonlichtenstone.com", customers.get(1624).getWeb());
	}
}
