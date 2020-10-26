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

@Tag("21")
class Record_635 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 635: FirstName is Alton")
	void FirstNameOfRecord635() {
		assertEquals("Alton", customers.get(634).getFirstName());
	}

	@Test
	@DisplayName("Record 635: LastName is Bonder")
	void LastNameOfRecord635() {
		assertEquals("Bonder", customers.get(634).getLastName());
	}

	@Test
	@DisplayName("Record 635: Company is Matthews, Jeffrey R Esq")
	void CompanyOfRecord635() {
		assertEquals("Matthews, Jeffrey R Esq", customers.get(634).getCompany());
	}

	@Test
	@DisplayName("Record 635: Address is 691 Main St")
	void AddressOfRecord635() {
		assertEquals("691 Main St", customers.get(634).getAddress());
	}

	@Test
	@DisplayName("Record 635: City is Lumberton")
	void CityOfRecord635() {
		assertEquals("Lumberton", customers.get(634).getCity());
	}

	@Test
	@DisplayName("Record 635: County is Burlington")
	void CountyOfRecord635() {
		assertEquals("Burlington", customers.get(634).getCounty());
	}

	@Test
	@DisplayName("Record 635: State is NJ")
	void StateOfRecord635() {
		assertEquals("NJ", customers.get(634).getState());
	}

	@Test
	@DisplayName("Record 635: ZIP is 8048")
	void ZIPOfRecord635() {
		assertEquals("8048", customers.get(634).getZIP());
	}

	@Test
	@DisplayName("Record 635: Phone is 609-265-0359")
	void PhoneOfRecord635() {
		assertEquals("609-265-0359", customers.get(634).getPhone());
	}

	@Test
	@DisplayName("Record 635: Fax is 609-265-3315")
	void FaxOfRecord635() {
		assertEquals("609-265-3315", customers.get(634).getFax());
	}

	@Test
	@DisplayName("Record 635: Email is alton@bonder.com")
	void EmailOfRecord635() {
		assertEquals("alton@bonder.com", customers.get(634).getEmail());
	}

	@Test
	@DisplayName("Record 635: Web is http://www.altonbonder.com")
	void WebOfRecord635() {
		assertEquals("http://www.altonbonder.com", customers.get(634).getWeb());
	}
}
