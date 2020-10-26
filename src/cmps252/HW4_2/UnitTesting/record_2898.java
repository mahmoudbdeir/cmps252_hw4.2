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
class Record_2898 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2898: FirstName is Jamey")
	void FirstNameOfRecord2898() {
		assertEquals("Jamey", customers.get(2897).getFirstName());
	}

	@Test
	@DisplayName("Record 2898: LastName is Lanski")
	void LastNameOfRecord2898() {
		assertEquals("Lanski", customers.get(2897).getLastName());
	}

	@Test
	@DisplayName("Record 2898: Company is Mcvehil Monnett Associates")
	void CompanyOfRecord2898() {
		assertEquals("Mcvehil Monnett Associates", customers.get(2897).getCompany());
	}

	@Test
	@DisplayName("Record 2898: Address is 4807 El Camino Ave")
	void AddressOfRecord2898() {
		assertEquals("4807 El Camino Ave", customers.get(2897).getAddress());
	}

	@Test
	@DisplayName("Record 2898: City is Carmichael")
	void CityOfRecord2898() {
		assertEquals("Carmichael", customers.get(2897).getCity());
	}

	@Test
	@DisplayName("Record 2898: County is Sacramento")
	void CountyOfRecord2898() {
		assertEquals("Sacramento", customers.get(2897).getCounty());
	}

	@Test
	@DisplayName("Record 2898: State is CA")
	void StateOfRecord2898() {
		assertEquals("CA", customers.get(2897).getState());
	}

	@Test
	@DisplayName("Record 2898: ZIP is 95608")
	void ZIPOfRecord2898() {
		assertEquals("95608", customers.get(2897).getZIP());
	}

	@Test
	@DisplayName("Record 2898: Phone is 916-483-3168")
	void PhoneOfRecord2898() {
		assertEquals("916-483-3168", customers.get(2897).getPhone());
	}

	@Test
	@DisplayName("Record 2898: Fax is 916-483-3445")
	void FaxOfRecord2898() {
		assertEquals("916-483-3445", customers.get(2897).getFax());
	}

	@Test
	@DisplayName("Record 2898: Email is jamey@lanski.com")
	void EmailOfRecord2898() {
		assertEquals("jamey@lanski.com", customers.get(2897).getEmail());
	}

	@Test
	@DisplayName("Record 2898: Web is http://www.jameylanski.com")
	void WebOfRecord2898() {
		assertEquals("http://www.jameylanski.com", customers.get(2897).getWeb());
	}
}
