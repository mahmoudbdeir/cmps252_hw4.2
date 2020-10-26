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

@Tag("20")
class Record_264 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 264: FirstName is Cindy")
	void FirstNameOfRecord264() {
		assertEquals("Cindy", customers.get(263).getFirstName());
	}

	@Test
	@DisplayName("Record 264: LastName is Dundon")
	void LastNameOfRecord264() {
		assertEquals("Dundon", customers.get(263).getLastName());
	}

	@Test
	@DisplayName("Record 264: Company is Doubletree Downtown")
	void CompanyOfRecord264() {
		assertEquals("Doubletree Downtown", customers.get(263).getCompany());
	}

	@Test
	@DisplayName("Record 264: Address is 731 E 22nd St")
	void AddressOfRecord264() {
		assertEquals("731 E 22nd St", customers.get(263).getAddress());
	}

	@Test
	@DisplayName("Record 264: City is Cookeville")
	void CityOfRecord264() {
		assertEquals("Cookeville", customers.get(263).getCity());
	}

	@Test
	@DisplayName("Record 264: County is Putnam")
	void CountyOfRecord264() {
		assertEquals("Putnam", customers.get(263).getCounty());
	}

	@Test
	@DisplayName("Record 264: State is TN")
	void StateOfRecord264() {
		assertEquals("TN", customers.get(263).getState());
	}

	@Test
	@DisplayName("Record 264: ZIP is 38501")
	void ZIPOfRecord264() {
		assertEquals("38501", customers.get(263).getZIP());
	}

	@Test
	@DisplayName("Record 264: Phone is 931-528-6085")
	void PhoneOfRecord264() {
		assertEquals("931-528-6085", customers.get(263).getPhone());
	}

	@Test
	@DisplayName("Record 264: Fax is 931-528-6032")
	void FaxOfRecord264() {
		assertEquals("931-528-6032", customers.get(263).getFax());
	}

	@Test
	@DisplayName("Record 264: Email is cindy@dundon.com")
	void EmailOfRecord264() {
		assertEquals("cindy@dundon.com", customers.get(263).getEmail());
	}

	@Test
	@DisplayName("Record 264: Web is http://www.cindydundon.com")
	void WebOfRecord264() {
		assertEquals("http://www.cindydundon.com", customers.get(263).getWeb());
	}
}
