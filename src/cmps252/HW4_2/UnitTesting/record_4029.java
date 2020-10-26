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

@Tag("7")
class Record_4029 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4029: FirstName is Marci")
	void FirstNameOfRecord4029() {
		assertEquals("Marci", customers.get(4028).getFirstName());
	}

	@Test
	@DisplayName("Record 4029: LastName is Roers")
	void LastNameOfRecord4029() {
		assertEquals("Roers", customers.get(4028).getLastName());
	}

	@Test
	@DisplayName("Record 4029: Company is Rich Pak Inc")
	void CompanyOfRecord4029() {
		assertEquals("Rich Pak Inc", customers.get(4028).getCompany());
	}

	@Test
	@DisplayName("Record 4029: Address is 3585 S Maryland Pky  #-i")
	void AddressOfRecord4029() {
		assertEquals("3585 S Maryland Pky  #-i", customers.get(4028).getAddress());
	}

	@Test
	@DisplayName("Record 4029: City is Las Vegas")
	void CityOfRecord4029() {
		assertEquals("Las Vegas", customers.get(4028).getCity());
	}

	@Test
	@DisplayName("Record 4029: County is Clark")
	void CountyOfRecord4029() {
		assertEquals("Clark", customers.get(4028).getCounty());
	}

	@Test
	@DisplayName("Record 4029: State is NV")
	void StateOfRecord4029() {
		assertEquals("NV", customers.get(4028).getState());
	}

	@Test
	@DisplayName("Record 4029: ZIP is 89109")
	void ZIPOfRecord4029() {
		assertEquals("89109", customers.get(4028).getZIP());
	}

	@Test
	@DisplayName("Record 4029: Phone is 702-794-4370")
	void PhoneOfRecord4029() {
		assertEquals("702-794-4370", customers.get(4028).getPhone());
	}

	@Test
	@DisplayName("Record 4029: Fax is 702-794-5304")
	void FaxOfRecord4029() {
		assertEquals("702-794-5304", customers.get(4028).getFax());
	}

	@Test
	@DisplayName("Record 4029: Email is marci@roers.com")
	void EmailOfRecord4029() {
		assertEquals("marci@roers.com", customers.get(4028).getEmail());
	}

	@Test
	@DisplayName("Record 4029: Web is http://www.marciroers.com")
	void WebOfRecord4029() {
		assertEquals("http://www.marciroers.com", customers.get(4028).getWeb());
	}
}
