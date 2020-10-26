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

@Tag("6")
class Record_2839 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2839: FirstName is Jonah")
	void FirstNameOfRecord2839() {
		assertEquals("Jonah", customers.get(2838).getFirstName());
	}

	@Test
	@DisplayName("Record 2839: LastName is Opsahl")
	void LastNameOfRecord2839() {
		assertEquals("Opsahl", customers.get(2838).getLastName());
	}

	@Test
	@DisplayName("Record 2839: Company is Audubon Plumbing Supply Co")
	void CompanyOfRecord2839() {
		assertEquals("Audubon Plumbing Supply Co", customers.get(2838).getCompany());
	}

	@Test
	@DisplayName("Record 2839: Address is 671 Montgomery St")
	void AddressOfRecord2839() {
		assertEquals("671 Montgomery St", customers.get(2838).getAddress());
	}

	@Test
	@DisplayName("Record 2839: City is Oroville")
	void CityOfRecord2839() {
		assertEquals("Oroville", customers.get(2838).getCity());
	}

	@Test
	@DisplayName("Record 2839: County is Butte")
	void CountyOfRecord2839() {
		assertEquals("Butte", customers.get(2838).getCounty());
	}

	@Test
	@DisplayName("Record 2839: State is CA")
	void StateOfRecord2839() {
		assertEquals("CA", customers.get(2838).getState());
	}

	@Test
	@DisplayName("Record 2839: ZIP is 95965")
	void ZIPOfRecord2839() {
		assertEquals("95965", customers.get(2838).getZIP());
	}

	@Test
	@DisplayName("Record 2839: Phone is 530-533-9826")
	void PhoneOfRecord2839() {
		assertEquals("530-533-9826", customers.get(2838).getPhone());
	}

	@Test
	@DisplayName("Record 2839: Fax is 530-533-0577")
	void FaxOfRecord2839() {
		assertEquals("530-533-0577", customers.get(2838).getFax());
	}

	@Test
	@DisplayName("Record 2839: Email is jonah@opsahl.com")
	void EmailOfRecord2839() {
		assertEquals("jonah@opsahl.com", customers.get(2838).getEmail());
	}

	@Test
	@DisplayName("Record 2839: Web is http://www.jonahopsahl.com")
	void WebOfRecord2839() {
		assertEquals("http://www.jonahopsahl.com", customers.get(2838).getWeb());
	}
}
