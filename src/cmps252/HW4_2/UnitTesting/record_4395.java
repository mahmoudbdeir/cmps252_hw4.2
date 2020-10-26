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

@Tag("5")
class Record_4395 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4395: FirstName is Doug")
	void FirstNameOfRecord4395() {
		assertEquals("Doug", customers.get(4394).getFirstName());
	}

	@Test
	@DisplayName("Record 4395: LastName is Redner")
	void LastNameOfRecord4395() {
		assertEquals("Redner", customers.get(4394).getLastName());
	}

	@Test
	@DisplayName("Record 4395: Company is W S A Insurance Services")
	void CompanyOfRecord4395() {
		assertEquals("W S A Insurance Services", customers.get(4394).getCompany());
	}

	@Test
	@DisplayName("Record 4395: Address is 4825 Packard Ct")
	void AddressOfRecord4395() {
		assertEquals("4825 Packard Ct", customers.get(4394).getAddress());
	}

	@Test
	@DisplayName("Record 4395: City is Fort Worth")
	void CityOfRecord4395() {
		assertEquals("Fort Worth", customers.get(4394).getCity());
	}

	@Test
	@DisplayName("Record 4395: County is Tarrant")
	void CountyOfRecord4395() {
		assertEquals("Tarrant", customers.get(4394).getCounty());
	}

	@Test
	@DisplayName("Record 4395: State is TX")
	void StateOfRecord4395() {
		assertEquals("TX", customers.get(4394).getState());
	}

	@Test
	@DisplayName("Record 4395: ZIP is 76119")
	void ZIPOfRecord4395() {
		assertEquals("76119", customers.get(4394).getZIP());
	}

	@Test
	@DisplayName("Record 4395: Phone is 817-531-0234")
	void PhoneOfRecord4395() {
		assertEquals("817-531-0234", customers.get(4394).getPhone());
	}

	@Test
	@DisplayName("Record 4395: Fax is 817-531-2415")
	void FaxOfRecord4395() {
		assertEquals("817-531-2415", customers.get(4394).getFax());
	}

	@Test
	@DisplayName("Record 4395: Email is doug@redner.com")
	void EmailOfRecord4395() {
		assertEquals("doug@redner.com", customers.get(4394).getEmail());
	}

	@Test
	@DisplayName("Record 4395: Web is http://www.dougredner.com")
	void WebOfRecord4395() {
		assertEquals("http://www.dougredner.com", customers.get(4394).getWeb());
	}
}
