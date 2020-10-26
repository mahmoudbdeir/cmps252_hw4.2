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

@Tag("47")
class Record_269 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 269: FirstName is Gordon")
	void FirstNameOfRecord269() {
		assertEquals("Gordon", customers.get(268).getFirstName());
	}

	@Test
	@DisplayName("Record 269: LastName is Gayheart")
	void LastNameOfRecord269() {
		assertEquals("Gayheart", customers.get(268).getLastName());
	}

	@Test
	@DisplayName("Record 269: Company is Tidwell, James C Esq")
	void CompanyOfRecord269() {
		assertEquals("Tidwell, James C Esq", customers.get(268).getCompany());
	}

	@Test
	@DisplayName("Record 269: Address is 1679 W 9th St")
	void AddressOfRecord269() {
		assertEquals("1679 W 9th St", customers.get(268).getAddress());
	}

	@Test
	@DisplayName("Record 269: City is Long Beach")
	void CityOfRecord269() {
		assertEquals("Long Beach", customers.get(268).getCity());
	}

	@Test
	@DisplayName("Record 269: County is Los Angeles")
	void CountyOfRecord269() {
		assertEquals("Los Angeles", customers.get(268).getCounty());
	}

	@Test
	@DisplayName("Record 269: State is CA")
	void StateOfRecord269() {
		assertEquals("CA", customers.get(268).getState());
	}

	@Test
	@DisplayName("Record 269: ZIP is 90813")
	void ZIPOfRecord269() {
		assertEquals("90813", customers.get(268).getZIP());
	}

	@Test
	@DisplayName("Record 269: Phone is 562-432-4981")
	void PhoneOfRecord269() {
		assertEquals("562-432-4981", customers.get(268).getPhone());
	}

	@Test
	@DisplayName("Record 269: Fax is 562-432-0461")
	void FaxOfRecord269() {
		assertEquals("562-432-0461", customers.get(268).getFax());
	}

	@Test
	@DisplayName("Record 269: Email is gordon@gayheart.com")
	void EmailOfRecord269() {
		assertEquals("gordon@gayheart.com", customers.get(268).getEmail());
	}

	@Test
	@DisplayName("Record 269: Web is http://www.gordongayheart.com")
	void WebOfRecord269() {
		assertEquals("http://www.gordongayheart.com", customers.get(268).getWeb());
	}
}
