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

@Tag("13")
class Record_1821 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1821: FirstName is Eloy")
	void FirstNameOfRecord1821() {
		assertEquals("Eloy", customers.get(1820).getFirstName());
	}

	@Test
	@DisplayName("Record 1821: LastName is Grima")
	void LastNameOfRecord1821() {
		assertEquals("Grima", customers.get(1820).getLastName());
	}

	@Test
	@DisplayName("Record 1821: Company is Imdec Inc")
	void CompanyOfRecord1821() {
		assertEquals("Imdec Inc", customers.get(1820).getCompany());
	}

	@Test
	@DisplayName("Record 1821: Address is 8 State Route 36")
	void AddressOfRecord1821() {
		assertEquals("8 State Route 36", customers.get(1820).getAddress());
	}

	@Test
	@DisplayName("Record 1821: City is Leonardo")
	void CityOfRecord1821() {
		assertEquals("Leonardo", customers.get(1820).getCity());
	}

	@Test
	@DisplayName("Record 1821: County is Monmouth")
	void CountyOfRecord1821() {
		assertEquals("Monmouth", customers.get(1820).getCounty());
	}

	@Test
	@DisplayName("Record 1821: State is NJ")
	void StateOfRecord1821() {
		assertEquals("NJ", customers.get(1820).getState());
	}

	@Test
	@DisplayName("Record 1821: ZIP is 7737")
	void ZIPOfRecord1821() {
		assertEquals("7737", customers.get(1820).getZIP());
	}

	@Test
	@DisplayName("Record 1821: Phone is 732-291-4381")
	void PhoneOfRecord1821() {
		assertEquals("732-291-4381", customers.get(1820).getPhone());
	}

	@Test
	@DisplayName("Record 1821: Fax is 732-291-7208")
	void FaxOfRecord1821() {
		assertEquals("732-291-7208", customers.get(1820).getFax());
	}

	@Test
	@DisplayName("Record 1821: Email is eloy@grima.com")
	void EmailOfRecord1821() {
		assertEquals("eloy@grima.com", customers.get(1820).getEmail());
	}

	@Test
	@DisplayName("Record 1821: Web is http://www.eloygrima.com")
	void WebOfRecord1821() {
		assertEquals("http://www.eloygrima.com", customers.get(1820).getWeb());
	}
}
