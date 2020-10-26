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

@Tag("43")
class Record_3945 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3945: FirstName is Michael")
	void FirstNameOfRecord3945() {
		assertEquals("Michael", customers.get(3944).getFirstName());
	}

	@Test
	@DisplayName("Record 3945: LastName is Hubner")
	void LastNameOfRecord3945() {
		assertEquals("Hubner", customers.get(3944).getLastName());
	}

	@Test
	@DisplayName("Record 3945: Company is Community Development Board")
	void CompanyOfRecord3945() {
		assertEquals("Community Development Board", customers.get(3944).getCompany());
	}

	@Test
	@DisplayName("Record 3945: Address is 124 S 2nd St")
	void AddressOfRecord3945() {
		assertEquals("124 S 2nd St", customers.get(3944).getAddress());
	}

	@Test
	@DisplayName("Record 3945: City is Aberdeen")
	void CityOfRecord3945() {
		assertEquals("Aberdeen", customers.get(3944).getCity());
	}

	@Test
	@DisplayName("Record 3945: County is Brown")
	void CountyOfRecord3945() {
		assertEquals("Brown", customers.get(3944).getCounty());
	}

	@Test
	@DisplayName("Record 3945: State is SD")
	void StateOfRecord3945() {
		assertEquals("SD", customers.get(3944).getState());
	}

	@Test
	@DisplayName("Record 3945: ZIP is 57401")
	void ZIPOfRecord3945() {
		assertEquals("57401", customers.get(3944).getZIP());
	}

	@Test
	@DisplayName("Record 3945: Phone is 605-229-1330")
	void PhoneOfRecord3945() {
		assertEquals("605-229-1330", customers.get(3944).getPhone());
	}

	@Test
	@DisplayName("Record 3945: Fax is 605-229-0366")
	void FaxOfRecord3945() {
		assertEquals("605-229-0366", customers.get(3944).getFax());
	}

	@Test
	@DisplayName("Record 3945: Email is michael@hubner.com")
	void EmailOfRecord3945() {
		assertEquals("michael@hubner.com", customers.get(3944).getEmail());
	}

	@Test
	@DisplayName("Record 3945: Web is http://www.michaelhubner.com")
	void WebOfRecord3945() {
		assertEquals("http://www.michaelhubner.com", customers.get(3944).getWeb());
	}
}
