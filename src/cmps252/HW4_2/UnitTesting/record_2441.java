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

@Tag("10")
class Record_2441 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2441: FirstName is Emile")
	void FirstNameOfRecord2441() {
		assertEquals("Emile", customers.get(2440).getFirstName());
	}

	@Test
	@DisplayName("Record 2441: LastName is Ehlke")
	void LastNameOfRecord2441() {
		assertEquals("Ehlke", customers.get(2440).getLastName());
	}

	@Test
	@DisplayName("Record 2441: Company is Flanagan, Robert L Esq")
	void CompanyOfRecord2441() {
		assertEquals("Flanagan, Robert L Esq", customers.get(2440).getCompany());
	}

	@Test
	@DisplayName("Record 2441: Address is 4028 E Broadway Rd  #-606")
	void AddressOfRecord2441() {
		assertEquals("4028 E Broadway Rd  #-606", customers.get(2440).getAddress());
	}

	@Test
	@DisplayName("Record 2441: City is Phoenix")
	void CityOfRecord2441() {
		assertEquals("Phoenix", customers.get(2440).getCity());
	}

	@Test
	@DisplayName("Record 2441: County is Maricopa")
	void CountyOfRecord2441() {
		assertEquals("Maricopa", customers.get(2440).getCounty());
	}

	@Test
	@DisplayName("Record 2441: State is AZ")
	void StateOfRecord2441() {
		assertEquals("AZ", customers.get(2440).getState());
	}

	@Test
	@DisplayName("Record 2441: ZIP is 85040")
	void ZIPOfRecord2441() {
		assertEquals("85040", customers.get(2440).getZIP());
	}

	@Test
	@DisplayName("Record 2441: Phone is 602-437-9493")
	void PhoneOfRecord2441() {
		assertEquals("602-437-9493", customers.get(2440).getPhone());
	}

	@Test
	@DisplayName("Record 2441: Fax is 602-437-2312")
	void FaxOfRecord2441() {
		assertEquals("602-437-2312", customers.get(2440).getFax());
	}

	@Test
	@DisplayName("Record 2441: Email is emile@ehlke.com")
	void EmailOfRecord2441() {
		assertEquals("emile@ehlke.com", customers.get(2440).getEmail());
	}

	@Test
	@DisplayName("Record 2441: Web is http://www.emileehlke.com")
	void WebOfRecord2441() {
		assertEquals("http://www.emileehlke.com", customers.get(2440).getWeb());
	}
}
