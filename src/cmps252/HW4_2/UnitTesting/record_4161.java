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

@Tag("26")
class Record_4161 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4161: FirstName is Joan")
	void FirstNameOfRecord4161() {
		assertEquals("Joan", customers.get(4160).getFirstName());
	}

	@Test
	@DisplayName("Record 4161: LastName is Rugga")
	void LastNameOfRecord4161() {
		assertEquals("Rugga", customers.get(4160).getLastName());
	}

	@Test
	@DisplayName("Record 4161: Company is Schmalts, Harry W Md")
	void CompanyOfRecord4161() {
		assertEquals("Schmalts, Harry W Md", customers.get(4160).getCompany());
	}

	@Test
	@DisplayName("Record 4161: Address is 219 Broadway St")
	void AddressOfRecord4161() {
		assertEquals("219 Broadway St", customers.get(4160).getAddress());
	}

	@Test
	@DisplayName("Record 4161: City is San Antonio")
	void CityOfRecord4161() {
		assertEquals("San Antonio", customers.get(4160).getCity());
	}

	@Test
	@DisplayName("Record 4161: County is Bexar")
	void CountyOfRecord4161() {
		assertEquals("Bexar", customers.get(4160).getCounty());
	}

	@Test
	@DisplayName("Record 4161: State is TX")
	void StateOfRecord4161() {
		assertEquals("TX", customers.get(4160).getState());
	}

	@Test
	@DisplayName("Record 4161: ZIP is 78205")
	void ZIPOfRecord4161() {
		assertEquals("78205", customers.get(4160).getZIP());
	}

	@Test
	@DisplayName("Record 4161: Phone is 210-222-4391")
	void PhoneOfRecord4161() {
		assertEquals("210-222-4391", customers.get(4160).getPhone());
	}

	@Test
	@DisplayName("Record 4161: Fax is 210-222-0869")
	void FaxOfRecord4161() {
		assertEquals("210-222-0869", customers.get(4160).getFax());
	}

	@Test
	@DisplayName("Record 4161: Email is joan@rugga.com")
	void EmailOfRecord4161() {
		assertEquals("joan@rugga.com", customers.get(4160).getEmail());
	}

	@Test
	@DisplayName("Record 4161: Web is http://www.joanrugga.com")
	void WebOfRecord4161() {
		assertEquals("http://www.joanrugga.com", customers.get(4160).getWeb());
	}
}
