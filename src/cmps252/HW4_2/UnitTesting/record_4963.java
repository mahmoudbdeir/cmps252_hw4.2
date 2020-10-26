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

@Tag("19")
class Record_4963 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4963: FirstName is Alta")
	void FirstNameOfRecord4963() {
		assertEquals("Alta", customers.get(4962).getFirstName());
	}

	@Test
	@DisplayName("Record 4963: LastName is Kozik")
	void LastNameOfRecord4963() {
		assertEquals("Kozik", customers.get(4962).getLastName());
	}

	@Test
	@DisplayName("Record 4963: Company is 3700 Building")
	void CompanyOfRecord4963() {
		assertEquals("3700 Building", customers.get(4962).getCompany());
	}

	@Test
	@DisplayName("Record 4963: Address is 203 W 15th Ave  #-107")
	void AddressOfRecord4963() {
		assertEquals("203 W 15th Ave  #-107", customers.get(4962).getAddress());
	}

	@Test
	@DisplayName("Record 4963: City is Anchorage")
	void CityOfRecord4963() {
		assertEquals("Anchorage", customers.get(4962).getCity());
	}

	@Test
	@DisplayName("Record 4963: County is Anchorage")
	void CountyOfRecord4963() {
		assertEquals("Anchorage", customers.get(4962).getCounty());
	}

	@Test
	@DisplayName("Record 4963: State is AK")
	void StateOfRecord4963() {
		assertEquals("AK", customers.get(4962).getState());
	}

	@Test
	@DisplayName("Record 4963: ZIP is 99501")
	void ZIPOfRecord4963() {
		assertEquals("99501", customers.get(4962).getZIP());
	}

	@Test
	@DisplayName("Record 4963: Phone is 907-278-7346")
	void PhoneOfRecord4963() {
		assertEquals("907-278-7346", customers.get(4962).getPhone());
	}

	@Test
	@DisplayName("Record 4963: Fax is 907-278-8683")
	void FaxOfRecord4963() {
		assertEquals("907-278-8683", customers.get(4962).getFax());
	}

	@Test
	@DisplayName("Record 4963: Email is alta@kozik.com")
	void EmailOfRecord4963() {
		assertEquals("alta@kozik.com", customers.get(4962).getEmail());
	}

	@Test
	@DisplayName("Record 4963: Web is http://www.altakozik.com")
	void WebOfRecord4963() {
		assertEquals("http://www.altakozik.com", customers.get(4962).getWeb());
	}
}
