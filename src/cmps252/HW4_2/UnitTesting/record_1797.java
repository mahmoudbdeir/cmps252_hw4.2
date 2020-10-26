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

@Tag("45")
class Record_1797 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1797: FirstName is Rolland")
	void FirstNameOfRecord1797() {
		assertEquals("Rolland", customers.get(1796).getFirstName());
	}

	@Test
	@DisplayName("Record 1797: LastName is Brienza")
	void LastNameOfRecord1797() {
		assertEquals("Brienza", customers.get(1796).getLastName());
	}

	@Test
	@DisplayName("Record 1797: Company is Grahovac, John E Esq")
	void CompanyOfRecord1797() {
		assertEquals("Grahovac, John E Esq", customers.get(1796).getCompany());
	}

	@Test
	@DisplayName("Record 1797: Address is 275 Lenox St")
	void AddressOfRecord1797() {
		assertEquals("275 Lenox St", customers.get(1796).getAddress());
	}

	@Test
	@DisplayName("Record 1797: City is Norwood")
	void CityOfRecord1797() {
		assertEquals("Norwood", customers.get(1796).getCity());
	}

	@Test
	@DisplayName("Record 1797: County is Norfolk")
	void CountyOfRecord1797() {
		assertEquals("Norfolk", customers.get(1796).getCounty());
	}

	@Test
	@DisplayName("Record 1797: State is MA")
	void StateOfRecord1797() {
		assertEquals("MA", customers.get(1796).getState());
	}

	@Test
	@DisplayName("Record 1797: ZIP is 2062")
	void ZIPOfRecord1797() {
		assertEquals("2062", customers.get(1796).getZIP());
	}

	@Test
	@DisplayName("Record 1797: Phone is 781-769-1744")
	void PhoneOfRecord1797() {
		assertEquals("781-769-1744", customers.get(1796).getPhone());
	}

	@Test
	@DisplayName("Record 1797: Fax is 781-769-9424")
	void FaxOfRecord1797() {
		assertEquals("781-769-9424", customers.get(1796).getFax());
	}

	@Test
	@DisplayName("Record 1797: Email is rolland@brienza.com")
	void EmailOfRecord1797() {
		assertEquals("rolland@brienza.com", customers.get(1796).getEmail());
	}

	@Test
	@DisplayName("Record 1797: Web is http://www.rollandbrienza.com")
	void WebOfRecord1797() {
		assertEquals("http://www.rollandbrienza.com", customers.get(1796).getWeb());
	}
}
