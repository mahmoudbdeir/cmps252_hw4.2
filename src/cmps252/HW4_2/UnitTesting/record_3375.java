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

@Tag("23")
class Record_3375 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3375: FirstName is Merle")
	void FirstNameOfRecord3375() {
		assertEquals("Merle", customers.get(3374).getFirstName());
	}

	@Test
	@DisplayName("Record 3375: LastName is Maerz")
	void LastNameOfRecord3375() {
		assertEquals("Maerz", customers.get(3374).getLastName());
	}

	@Test
	@DisplayName("Record 3375: Company is Wood Carving Shop")
	void CompanyOfRecord3375() {
		assertEquals("Wood Carving Shop", customers.get(3374).getCompany());
	}

	@Test
	@DisplayName("Record 3375: Address is 8665 Us Highway 421w W")
	void AddressOfRecord3375() {
		assertEquals("8665 Us Highway 421w W", customers.get(3374).getAddress());
	}

	@Test
	@DisplayName("Record 3375: City is Greensboro")
	void CityOfRecord3375() {
		assertEquals("Greensboro", customers.get(3374).getCity());
	}

	@Test
	@DisplayName("Record 3375: County is Guilford")
	void CountyOfRecord3375() {
		assertEquals("Guilford", customers.get(3374).getCounty());
	}

	@Test
	@DisplayName("Record 3375: State is NC")
	void StateOfRecord3375() {
		assertEquals("NC", customers.get(3374).getState());
	}

	@Test
	@DisplayName("Record 3375: ZIP is 27409")
	void ZIPOfRecord3375() {
		assertEquals("27409", customers.get(3374).getZIP());
	}

	@Test
	@DisplayName("Record 3375: Phone is 336-668-2685")
	void PhoneOfRecord3375() {
		assertEquals("336-668-2685", customers.get(3374).getPhone());
	}

	@Test
	@DisplayName("Record 3375: Fax is 336-668-8246")
	void FaxOfRecord3375() {
		assertEquals("336-668-8246", customers.get(3374).getFax());
	}

	@Test
	@DisplayName("Record 3375: Email is merle@maerz.com")
	void EmailOfRecord3375() {
		assertEquals("merle@maerz.com", customers.get(3374).getEmail());
	}

	@Test
	@DisplayName("Record 3375: Web is http://www.merlemaerz.com")
	void WebOfRecord3375() {
		assertEquals("http://www.merlemaerz.com", customers.get(3374).getWeb());
	}
}
