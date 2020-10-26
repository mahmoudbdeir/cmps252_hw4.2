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
class Record_1967 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1967: FirstName is Vesta")
	void FirstNameOfRecord1967() {
		assertEquals("Vesta", customers.get(1966).getFirstName());
	}

	@Test
	@DisplayName("Record 1967: LastName is Vodopich")
	void LastNameOfRecord1967() {
		assertEquals("Vodopich", customers.get(1966).getLastName());
	}

	@Test
	@DisplayName("Record 1967: Company is Reeds Flowers")
	void CompanyOfRecord1967() {
		assertEquals("Reeds Flowers", customers.get(1966).getCompany());
	}

	@Test
	@DisplayName("Record 1967: Address is 46 Samsondale Ave")
	void AddressOfRecord1967() {
		assertEquals("46 Samsondale Ave", customers.get(1966).getAddress());
	}

	@Test
	@DisplayName("Record 1967: City is West Haverstraw")
	void CityOfRecord1967() {
		assertEquals("West Haverstraw", customers.get(1966).getCity());
	}

	@Test
	@DisplayName("Record 1967: County is Rockland")
	void CountyOfRecord1967() {
		assertEquals("Rockland", customers.get(1966).getCounty());
	}

	@Test
	@DisplayName("Record 1967: State is NY")
	void StateOfRecord1967() {
		assertEquals("NY", customers.get(1966).getState());
	}

	@Test
	@DisplayName("Record 1967: ZIP is 10993")
	void ZIPOfRecord1967() {
		assertEquals("10993", customers.get(1966).getZIP());
	}

	@Test
	@DisplayName("Record 1967: Phone is 845-947-2770")
	void PhoneOfRecord1967() {
		assertEquals("845-947-2770", customers.get(1966).getPhone());
	}

	@Test
	@DisplayName("Record 1967: Fax is 845-947-7276")
	void FaxOfRecord1967() {
		assertEquals("845-947-7276", customers.get(1966).getFax());
	}

	@Test
	@DisplayName("Record 1967: Email is vesta@vodopich.com")
	void EmailOfRecord1967() {
		assertEquals("vesta@vodopich.com", customers.get(1966).getEmail());
	}

	@Test
	@DisplayName("Record 1967: Web is http://www.vestavodopich.com")
	void WebOfRecord1967() {
		assertEquals("http://www.vestavodopich.com", customers.get(1966).getWeb());
	}
}
