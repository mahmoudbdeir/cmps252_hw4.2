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

@Tag("31")
class Record_1314 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1314: FirstName is Pete")
	void FirstNameOfRecord1314() {
		assertEquals("Pete", customers.get(1313).getFirstName());
	}

	@Test
	@DisplayName("Record 1314: LastName is Davidsmeyer")
	void LastNameOfRecord1314() {
		assertEquals("Davidsmeyer", customers.get(1313).getLastName());
	}

	@Test
	@DisplayName("Record 1314: Company is Eclectic Co")
	void CompanyOfRecord1314() {
		assertEquals("Eclectic Co", customers.get(1313).getCompany());
	}

	@Test
	@DisplayName("Record 1314: Address is 1407 S Harrison Rd")
	void AddressOfRecord1314() {
		assertEquals("1407 S Harrison Rd", customers.get(1313).getAddress());
	}

	@Test
	@DisplayName("Record 1314: City is East Lansing")
	void CityOfRecord1314() {
		assertEquals("East Lansing", customers.get(1313).getCity());
	}

	@Test
	@DisplayName("Record 1314: County is Ingham")
	void CountyOfRecord1314() {
		assertEquals("Ingham", customers.get(1313).getCounty());
	}

	@Test
	@DisplayName("Record 1314: State is MI")
	void StateOfRecord1314() {
		assertEquals("MI", customers.get(1313).getState());
	}

	@Test
	@DisplayName("Record 1314: ZIP is 48823")
	void ZIPOfRecord1314() {
		assertEquals("48823", customers.get(1313).getZIP());
	}

	@Test
	@DisplayName("Record 1314: Phone is 517-332-3520")
	void PhoneOfRecord1314() {
		assertEquals("517-332-3520", customers.get(1313).getPhone());
	}

	@Test
	@DisplayName("Record 1314: Fax is 517-332-4247")
	void FaxOfRecord1314() {
		assertEquals("517-332-4247", customers.get(1313).getFax());
	}

	@Test
	@DisplayName("Record 1314: Email is pete@davidsmeyer.com")
	void EmailOfRecord1314() {
		assertEquals("pete@davidsmeyer.com", customers.get(1313).getEmail());
	}

	@Test
	@DisplayName("Record 1314: Web is http://www.petedavidsmeyer.com")
	void WebOfRecord1314() {
		assertEquals("http://www.petedavidsmeyer.com", customers.get(1313).getWeb());
	}
}
