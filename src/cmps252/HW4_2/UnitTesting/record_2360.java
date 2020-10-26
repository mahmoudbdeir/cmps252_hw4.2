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

@Tag("17")
class Record_2360 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2360: FirstName is Veronica")
	void FirstNameOfRecord2360() {
		assertEquals("Veronica", customers.get(2359).getFirstName());
	}

	@Test
	@DisplayName("Record 2360: LastName is Massard")
	void LastNameOfRecord2360() {
		assertEquals("Massard", customers.get(2359).getLastName());
	}

	@Test
	@DisplayName("Record 2360: Company is Knack Industries Inc")
	void CompanyOfRecord2360() {
		assertEquals("Knack Industries Inc", customers.get(2359).getCompany());
	}

	@Test
	@DisplayName("Record 2360: Address is 246 N Main St")
	void AddressOfRecord2360() {
		assertEquals("246 N Main St", customers.get(2359).getAddress());
	}

	@Test
	@DisplayName("Record 2360: City is Prineville")
	void CityOfRecord2360() {
		assertEquals("Prineville", customers.get(2359).getCity());
	}

	@Test
	@DisplayName("Record 2360: County is Crook")
	void CountyOfRecord2360() {
		assertEquals("Crook", customers.get(2359).getCounty());
	}

	@Test
	@DisplayName("Record 2360: State is OR")
	void StateOfRecord2360() {
		assertEquals("OR", customers.get(2359).getState());
	}

	@Test
	@DisplayName("Record 2360: ZIP is 97754")
	void ZIPOfRecord2360() {
		assertEquals("97754", customers.get(2359).getZIP());
	}

	@Test
	@DisplayName("Record 2360: Phone is 541-447-6160")
	void PhoneOfRecord2360() {
		assertEquals("541-447-6160", customers.get(2359).getPhone());
	}

	@Test
	@DisplayName("Record 2360: Fax is 541-447-5002")
	void FaxOfRecord2360() {
		assertEquals("541-447-5002", customers.get(2359).getFax());
	}

	@Test
	@DisplayName("Record 2360: Email is veronica@massard.com")
	void EmailOfRecord2360() {
		assertEquals("veronica@massard.com", customers.get(2359).getEmail());
	}

	@Test
	@DisplayName("Record 2360: Web is http://www.veronicamassard.com")
	void WebOfRecord2360() {
		assertEquals("http://www.veronicamassard.com", customers.get(2359).getWeb());
	}
}
