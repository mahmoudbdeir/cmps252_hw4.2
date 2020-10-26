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

@Tag("2")
class Record_2967 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2967: FirstName is Mickey")
	void FirstNameOfRecord2967() {
		assertEquals("Mickey", customers.get(2966).getFirstName());
	}

	@Test
	@DisplayName("Record 2967: LastName is Bucco")
	void LastNameOfRecord2967() {
		assertEquals("Bucco", customers.get(2966).getLastName());
	}

	@Test
	@DisplayName("Record 2967: Company is Hollibaugh, Greg Cpa")
	void CompanyOfRecord2967() {
		assertEquals("Hollibaugh, Greg Cpa", customers.get(2966).getCompany());
	}

	@Test
	@DisplayName("Record 2967: Address is 3585 S Maryland Pky  #-1")
	void AddressOfRecord2967() {
		assertEquals("3585 S Maryland Pky  #-1", customers.get(2966).getAddress());
	}

	@Test
	@DisplayName("Record 2967: City is Las Vegas")
	void CityOfRecord2967() {
		assertEquals("Las Vegas", customers.get(2966).getCity());
	}

	@Test
	@DisplayName("Record 2967: County is Clark")
	void CountyOfRecord2967() {
		assertEquals("Clark", customers.get(2966).getCounty());
	}

	@Test
	@DisplayName("Record 2967: State is NV")
	void StateOfRecord2967() {
		assertEquals("NV", customers.get(2966).getState());
	}

	@Test
	@DisplayName("Record 2967: ZIP is 89109")
	void ZIPOfRecord2967() {
		assertEquals("89109", customers.get(2966).getZIP());
	}

	@Test
	@DisplayName("Record 2967: Phone is 702-794-0930")
	void PhoneOfRecord2967() {
		assertEquals("702-794-0930", customers.get(2966).getPhone());
	}

	@Test
	@DisplayName("Record 2967: Fax is 702-794-1579")
	void FaxOfRecord2967() {
		assertEquals("702-794-1579", customers.get(2966).getFax());
	}

	@Test
	@DisplayName("Record 2967: Email is mickey@bucco.com")
	void EmailOfRecord2967() {
		assertEquals("mickey@bucco.com", customers.get(2966).getEmail());
	}

	@Test
	@DisplayName("Record 2967: Web is http://www.mickeybucco.com")
	void WebOfRecord2967() {
		assertEquals("http://www.mickeybucco.com", customers.get(2966).getWeb());
	}
}
