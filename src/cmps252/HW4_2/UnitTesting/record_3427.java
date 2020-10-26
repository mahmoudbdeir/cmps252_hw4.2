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

@Tag("0")
class Record_3427 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3427: FirstName is Luciano")
	void FirstNameOfRecord3427() {
		assertEquals("Luciano", customers.get(3426).getFirstName());
	}

	@Test
	@DisplayName("Record 3427: LastName is Payenda")
	void LastNameOfRecord3427() {
		assertEquals("Payenda", customers.get(3426).getLastName());
	}

	@Test
	@DisplayName("Record 3427: Company is Crower Cams & Equip Co")
	void CompanyOfRecord3427() {
		assertEquals("Crower Cams & Equip Co", customers.get(3426).getCompany());
	}

	@Test
	@DisplayName("Record 3427: Address is 1640 E 15th St")
	void AddressOfRecord3427() {
		assertEquals("1640 E 15th St", customers.get(3426).getAddress());
	}

	@Test
	@DisplayName("Record 3427: City is Little Rock")
	void CityOfRecord3427() {
		assertEquals("Little Rock", customers.get(3426).getCity());
	}

	@Test
	@DisplayName("Record 3427: County is Pulaski")
	void CountyOfRecord3427() {
		assertEquals("Pulaski", customers.get(3426).getCounty());
	}

	@Test
	@DisplayName("Record 3427: State is AR")
	void StateOfRecord3427() {
		assertEquals("AR", customers.get(3426).getState());
	}

	@Test
	@DisplayName("Record 3427: ZIP is 72202")
	void ZIPOfRecord3427() {
		assertEquals("72202", customers.get(3426).getZIP());
	}

	@Test
	@DisplayName("Record 3427: Phone is 501-376-7557")
	void PhoneOfRecord3427() {
		assertEquals("501-376-7557", customers.get(3426).getPhone());
	}

	@Test
	@DisplayName("Record 3427: Fax is 501-376-5521")
	void FaxOfRecord3427() {
		assertEquals("501-376-5521", customers.get(3426).getFax());
	}

	@Test
	@DisplayName("Record 3427: Email is luciano@payenda.com")
	void EmailOfRecord3427() {
		assertEquals("luciano@payenda.com", customers.get(3426).getEmail());
	}

	@Test
	@DisplayName("Record 3427: Web is http://www.lucianopayenda.com")
	void WebOfRecord3427() {
		assertEquals("http://www.lucianopayenda.com", customers.get(3426).getWeb());
	}
}
