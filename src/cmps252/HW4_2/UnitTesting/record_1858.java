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
class Record_1858 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1858: FirstName is Mayra")
	void FirstNameOfRecord1858() {
		assertEquals("Mayra", customers.get(1857).getFirstName());
	}

	@Test
	@DisplayName("Record 1858: LastName is Manaker")
	void LastNameOfRecord1858() {
		assertEquals("Manaker", customers.get(1857).getLastName());
	}

	@Test
	@DisplayName("Record 1858: Company is Jones Osteen Jones & Arnold")
	void CompanyOfRecord1858() {
		assertEquals("Jones Osteen Jones & Arnold", customers.get(1857).getCompany());
	}

	@Test
	@DisplayName("Record 1858: Address is 7171 Country Ln")
	void AddressOfRecord1858() {
		assertEquals("7171 Country Ln", customers.get(1857).getAddress());
	}

	@Test
	@DisplayName("Record 1858: City is Chagrin Falls")
	void CityOfRecord1858() {
		assertEquals("Chagrin Falls", customers.get(1857).getCity());
	}

	@Test
	@DisplayName("Record 1858: County is Geauga")
	void CountyOfRecord1858() {
		assertEquals("Geauga", customers.get(1857).getCounty());
	}

	@Test
	@DisplayName("Record 1858: State is OH")
	void StateOfRecord1858() {
		assertEquals("OH", customers.get(1857).getState());
	}

	@Test
	@DisplayName("Record 1858: ZIP is 44023")
	void ZIPOfRecord1858() {
		assertEquals("44023", customers.get(1857).getZIP());
	}

	@Test
	@DisplayName("Record 1858: Phone is 440-543-3850")
	void PhoneOfRecord1858() {
		assertEquals("440-543-3850", customers.get(1857).getPhone());
	}

	@Test
	@DisplayName("Record 1858: Fax is 440-543-9436")
	void FaxOfRecord1858() {
		assertEquals("440-543-9436", customers.get(1857).getFax());
	}

	@Test
	@DisplayName("Record 1858: Email is mayra@manaker.com")
	void EmailOfRecord1858() {
		assertEquals("mayra@manaker.com", customers.get(1857).getEmail());
	}

	@Test
	@DisplayName("Record 1858: Web is http://www.mayramanaker.com")
	void WebOfRecord1858() {
		assertEquals("http://www.mayramanaker.com", customers.get(1857).getWeb());
	}
}
