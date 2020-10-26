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

@Tag("20")
class Record_573 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 573: FirstName is Michele")
	void FirstNameOfRecord573() {
		assertEquals("Michele", customers.get(572).getFirstName());
	}

	@Test
	@DisplayName("Record 573: LastName is Paskow")
	void LastNameOfRecord573() {
		assertEquals("Paskow", customers.get(572).getLastName());
	}

	@Test
	@DisplayName("Record 573: Company is United National Real Estate")
	void CompanyOfRecord573() {
		assertEquals("United National Real Estate", customers.get(572).getCompany());
	}

	@Test
	@DisplayName("Record 573: Address is 183 N Main St")
	void AddressOfRecord573() {
		assertEquals("183 N Main St", customers.get(572).getAddress());
	}

	@Test
	@DisplayName("Record 573: City is Manteno")
	void CityOfRecord573() {
		assertEquals("Manteno", customers.get(572).getCity());
	}

	@Test
	@DisplayName("Record 573: County is Kankakee")
	void CountyOfRecord573() {
		assertEquals("Kankakee", customers.get(572).getCounty());
	}

	@Test
	@DisplayName("Record 573: State is IL")
	void StateOfRecord573() {
		assertEquals("IL", customers.get(572).getState());
	}

	@Test
	@DisplayName("Record 573: ZIP is 60950")
	void ZIPOfRecord573() {
		assertEquals("60950", customers.get(572).getZIP());
	}

	@Test
	@DisplayName("Record 573: Phone is 815-468-2563")
	void PhoneOfRecord573() {
		assertEquals("815-468-2563", customers.get(572).getPhone());
	}

	@Test
	@DisplayName("Record 573: Fax is 815-468-9841")
	void FaxOfRecord573() {
		assertEquals("815-468-9841", customers.get(572).getFax());
	}

	@Test
	@DisplayName("Record 573: Email is michele@paskow.com")
	void EmailOfRecord573() {
		assertEquals("michele@paskow.com", customers.get(572).getEmail());
	}

	@Test
	@DisplayName("Record 573: Web is http://www.michelepaskow.com")
	void WebOfRecord573() {
		assertEquals("http://www.michelepaskow.com", customers.get(572).getWeb());
	}
}
