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

@Tag("49")
class Record_3809 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3809: FirstName is Lela")
	void FirstNameOfRecord3809() {
		assertEquals("Lela", customers.get(3808).getFirstName());
	}

	@Test
	@DisplayName("Record 3809: LastName is Tevis")
	void LastNameOfRecord3809() {
		assertEquals("Tevis", customers.get(3808).getLastName());
	}

	@Test
	@DisplayName("Record 3809: Company is Kandi Roofing Company")
	void CompanyOfRecord3809() {
		assertEquals("Kandi Roofing Company", customers.get(3808).getCompany());
	}

	@Test
	@DisplayName("Record 3809: Address is 2161 Lanark St")
	void AddressOfRecord3809() {
		assertEquals("2161 Lanark St", customers.get(3808).getAddress());
	}

	@Test
	@DisplayName("Record 3809: City is Meridian")
	void CityOfRecord3809() {
		assertEquals("Meridian", customers.get(3808).getCity());
	}

	@Test
	@DisplayName("Record 3809: County is Ada")
	void CountyOfRecord3809() {
		assertEquals("Ada", customers.get(3808).getCounty());
	}

	@Test
	@DisplayName("Record 3809: State is ID")
	void StateOfRecord3809() {
		assertEquals("ID", customers.get(3808).getState());
	}

	@Test
	@DisplayName("Record 3809: ZIP is 83642")
	void ZIPOfRecord3809() {
		assertEquals("83642", customers.get(3808).getZIP());
	}

	@Test
	@DisplayName("Record 3809: Phone is 208-888-8983")
	void PhoneOfRecord3809() {
		assertEquals("208-888-8983", customers.get(3808).getPhone());
	}

	@Test
	@DisplayName("Record 3809: Fax is 208-888-3067")
	void FaxOfRecord3809() {
		assertEquals("208-888-3067", customers.get(3808).getFax());
	}

	@Test
	@DisplayName("Record 3809: Email is lela@tevis.com")
	void EmailOfRecord3809() {
		assertEquals("lela@tevis.com", customers.get(3808).getEmail());
	}

	@Test
	@DisplayName("Record 3809: Web is http://www.lelatevis.com")
	void WebOfRecord3809() {
		assertEquals("http://www.lelatevis.com", customers.get(3808).getWeb());
	}
}
