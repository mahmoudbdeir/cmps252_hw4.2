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

@Tag("49")
class Record_2333 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2333: FirstName is Tuan")
	void FirstNameOfRecord2333() {
		assertEquals("Tuan", customers.get(2332).getFirstName());
	}

	@Test
	@DisplayName("Record 2333: LastName is Raya")
	void LastNameOfRecord2333() {
		assertEquals("Raya", customers.get(2332).getLastName());
	}

	@Test
	@DisplayName("Record 2333: Company is Hairston Express")
	void CompanyOfRecord2333() {
		assertEquals("Hairston Express", customers.get(2332).getCompany());
	}

	@Test
	@DisplayName("Record 2333: Address is 2600 El Camino Real")
	void AddressOfRecord2333() {
		assertEquals("2600 El Camino Real", customers.get(2332).getAddress());
	}

	@Test
	@DisplayName("Record 2333: City is Palo Alto")
	void CityOfRecord2333() {
		assertEquals("Palo Alto", customers.get(2332).getCity());
	}

	@Test
	@DisplayName("Record 2333: County is Santa Clara")
	void CountyOfRecord2333() {
		assertEquals("Santa Clara", customers.get(2332).getCounty());
	}

	@Test
	@DisplayName("Record 2333: State is CA")
	void StateOfRecord2333() {
		assertEquals("CA", customers.get(2332).getState());
	}

	@Test
	@DisplayName("Record 2333: ZIP is 94306")
	void ZIPOfRecord2333() {
		assertEquals("94306", customers.get(2332).getZIP());
	}

	@Test
	@DisplayName("Record 2333: Phone is 650-856-9488")
	void PhoneOfRecord2333() {
		assertEquals("650-856-9488", customers.get(2332).getPhone());
	}

	@Test
	@DisplayName("Record 2333: Fax is 650-856-2334")
	void FaxOfRecord2333() {
		assertEquals("650-856-2334", customers.get(2332).getFax());
	}

	@Test
	@DisplayName("Record 2333: Email is tuan@raya.com")
	void EmailOfRecord2333() {
		assertEquals("tuan@raya.com", customers.get(2332).getEmail());
	}

	@Test
	@DisplayName("Record 2333: Web is http://www.tuanraya.com")
	void WebOfRecord2333() {
		assertEquals("http://www.tuanraya.com", customers.get(2332).getWeb());
	}
}
