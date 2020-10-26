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

@Tag("16")
class Record_1856 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1856: FirstName is Armand")
	void FirstNameOfRecord1856() {
		assertEquals("Armand", customers.get(1855).getFirstName());
	}

	@Test
	@DisplayName("Record 1856: LastName is Diekema")
	void LastNameOfRecord1856() {
		assertEquals("Diekema", customers.get(1855).getLastName());
	}

	@Test
	@DisplayName("Record 1856: Company is Denburg, Samuel A Esq")
	void CompanyOfRecord1856() {
		assertEquals("Denburg, Samuel A Esq", customers.get(1855).getCompany());
	}

	@Test
	@DisplayName("Record 1856: Address is 339 Pleasant St")
	void AddressOfRecord1856() {
		assertEquals("339 Pleasant St", customers.get(1855).getAddress());
	}

	@Test
	@DisplayName("Record 1856: City is Malden")
	void CityOfRecord1856() {
		assertEquals("Malden", customers.get(1855).getCity());
	}

	@Test
	@DisplayName("Record 1856: County is Middlesex")
	void CountyOfRecord1856() {
		assertEquals("Middlesex", customers.get(1855).getCounty());
	}

	@Test
	@DisplayName("Record 1856: State is MA")
	void StateOfRecord1856() {
		assertEquals("MA", customers.get(1855).getState());
	}

	@Test
	@DisplayName("Record 1856: ZIP is 2148")
	void ZIPOfRecord1856() {
		assertEquals("2148", customers.get(1855).getZIP());
	}

	@Test
	@DisplayName("Record 1856: Phone is 781-324-3612")
	void PhoneOfRecord1856() {
		assertEquals("781-324-3612", customers.get(1855).getPhone());
	}

	@Test
	@DisplayName("Record 1856: Fax is 781-324-0746")
	void FaxOfRecord1856() {
		assertEquals("781-324-0746", customers.get(1855).getFax());
	}

	@Test
	@DisplayName("Record 1856: Email is armand@diekema.com")
	void EmailOfRecord1856() {
		assertEquals("armand@diekema.com", customers.get(1855).getEmail());
	}

	@Test
	@DisplayName("Record 1856: Web is http://www.armanddiekema.com")
	void WebOfRecord1856() {
		assertEquals("http://www.armanddiekema.com", customers.get(1855).getWeb());
	}
}
