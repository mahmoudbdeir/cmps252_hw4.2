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

@Tag("29")
class Record_1597 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1597: FirstName is Deanne")
	void FirstNameOfRecord1597() {
		assertEquals("Deanne", customers.get(1596).getFirstName());
	}

	@Test
	@DisplayName("Record 1597: LastName is Chrisp")
	void LastNameOfRecord1597() {
		assertEquals("Chrisp", customers.get(1596).getLastName());
	}

	@Test
	@DisplayName("Record 1597: Company is Union Speer Abstract Co")
	void CompanyOfRecord1597() {
		assertEquals("Union Speer Abstract Co", customers.get(1596).getCompany());
	}

	@Test
	@DisplayName("Record 1597: Address is 850 Lancaster Dr Se")
	void AddressOfRecord1597() {
		assertEquals("850 Lancaster Dr Se", customers.get(1596).getAddress());
	}

	@Test
	@DisplayName("Record 1597: City is Salem")
	void CityOfRecord1597() {
		assertEquals("Salem", customers.get(1596).getCity());
	}

	@Test
	@DisplayName("Record 1597: County is Marion")
	void CountyOfRecord1597() {
		assertEquals("Marion", customers.get(1596).getCounty());
	}

	@Test
	@DisplayName("Record 1597: State is OR")
	void StateOfRecord1597() {
		assertEquals("OR", customers.get(1596).getState());
	}

	@Test
	@DisplayName("Record 1597: ZIP is 97301")
	void ZIPOfRecord1597() {
		assertEquals("97301", customers.get(1596).getZIP());
	}

	@Test
	@DisplayName("Record 1597: Phone is 503-399-3995")
	void PhoneOfRecord1597() {
		assertEquals("503-399-3995", customers.get(1596).getPhone());
	}

	@Test
	@DisplayName("Record 1597: Fax is 503-399-5952")
	void FaxOfRecord1597() {
		assertEquals("503-399-5952", customers.get(1596).getFax());
	}

	@Test
	@DisplayName("Record 1597: Email is deanne@chrisp.com")
	void EmailOfRecord1597() {
		assertEquals("deanne@chrisp.com", customers.get(1596).getEmail());
	}

	@Test
	@DisplayName("Record 1597: Web is http://www.deannechrisp.com")
	void WebOfRecord1597() {
		assertEquals("http://www.deannechrisp.com", customers.get(1596).getWeb());
	}
}
