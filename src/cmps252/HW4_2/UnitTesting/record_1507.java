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

@Tag("14")
class Record_1507 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1507: FirstName is Mose")
	void FirstNameOfRecord1507() {
		assertEquals("Mose", customers.get(1506).getFirstName());
	}

	@Test
	@DisplayName("Record 1507: LastName is Curie")
	void LastNameOfRecord1507() {
		assertEquals("Curie", customers.get(1506).getLastName());
	}

	@Test
	@DisplayName("Record 1507: Company is Wallace Creech Sarda & Zaytoun")
	void CompanyOfRecord1507() {
		assertEquals("Wallace Creech Sarda & Zaytoun", customers.get(1506).getCompany());
	}

	@Test
	@DisplayName("Record 1507: Address is 199 Carpenter Ave")
	void AddressOfRecord1507() {
		assertEquals("199 Carpenter Ave", customers.get(1506).getAddress());
	}

	@Test
	@DisplayName("Record 1507: City is Wheeling")
	void CityOfRecord1507() {
		assertEquals("Wheeling", customers.get(1506).getCity());
	}

	@Test
	@DisplayName("Record 1507: County is Cook")
	void CountyOfRecord1507() {
		assertEquals("Cook", customers.get(1506).getCounty());
	}

	@Test
	@DisplayName("Record 1507: State is IL")
	void StateOfRecord1507() {
		assertEquals("IL", customers.get(1506).getState());
	}

	@Test
	@DisplayName("Record 1507: ZIP is 60090")
	void ZIPOfRecord1507() {
		assertEquals("60090", customers.get(1506).getZIP());
	}

	@Test
	@DisplayName("Record 1507: Phone is 847-520-5062")
	void PhoneOfRecord1507() {
		assertEquals("847-520-5062", customers.get(1506).getPhone());
	}

	@Test
	@DisplayName("Record 1507: Fax is 847-520-4485")
	void FaxOfRecord1507() {
		assertEquals("847-520-4485", customers.get(1506).getFax());
	}

	@Test
	@DisplayName("Record 1507: Email is mose@curie.com")
	void EmailOfRecord1507() {
		assertEquals("mose@curie.com", customers.get(1506).getEmail());
	}

	@Test
	@DisplayName("Record 1507: Web is http://www.mosecurie.com")
	void WebOfRecord1507() {
		assertEquals("http://www.mosecurie.com", customers.get(1506).getWeb());
	}
}
