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

@Tag("35")
class Record_3377 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3377: FirstName is Caroline")
	void FirstNameOfRecord3377() {
		assertEquals("Caroline", customers.get(3376).getFirstName());
	}

	@Test
	@DisplayName("Record 3377: LastName is Siminski")
	void LastNameOfRecord3377() {
		assertEquals("Siminski", customers.get(3376).getLastName());
	}

	@Test
	@DisplayName("Record 3377: Company is Travis Times")
	void CompanyOfRecord3377() {
		assertEquals("Travis Times", customers.get(3376).getCompany());
	}

	@Test
	@DisplayName("Record 3377: Address is 1830 Vernon St")
	void AddressOfRecord3377() {
		assertEquals("1830 Vernon St", customers.get(3376).getAddress());
	}

	@Test
	@DisplayName("Record 3377: City is Roseville")
	void CityOfRecord3377() {
		assertEquals("Roseville", customers.get(3376).getCity());
	}

	@Test
	@DisplayName("Record 3377: County is Placer")
	void CountyOfRecord3377() {
		assertEquals("Placer", customers.get(3376).getCounty());
	}

	@Test
	@DisplayName("Record 3377: State is CA")
	void StateOfRecord3377() {
		assertEquals("CA", customers.get(3376).getState());
	}

	@Test
	@DisplayName("Record 3377: ZIP is 95678")
	void ZIPOfRecord3377() {
		assertEquals("95678", customers.get(3376).getZIP());
	}

	@Test
	@DisplayName("Record 3377: Phone is 916-784-1365")
	void PhoneOfRecord3377() {
		assertEquals("916-784-1365", customers.get(3376).getPhone());
	}

	@Test
	@DisplayName("Record 3377: Fax is 916-784-1971")
	void FaxOfRecord3377() {
		assertEquals("916-784-1971", customers.get(3376).getFax());
	}

	@Test
	@DisplayName("Record 3377: Email is caroline@siminski.com")
	void EmailOfRecord3377() {
		assertEquals("caroline@siminski.com", customers.get(3376).getEmail());
	}

	@Test
	@DisplayName("Record 3377: Web is http://www.carolinesiminski.com")
	void WebOfRecord3377() {
		assertEquals("http://www.carolinesiminski.com", customers.get(3376).getWeb());
	}
}
