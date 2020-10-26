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

@Tag("44")
class Record_3215 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3215: FirstName is Lynette")
	void FirstNameOfRecord3215() {
		assertEquals("Lynette", customers.get(3214).getFirstName());
	}

	@Test
	@DisplayName("Record 3215: LastName is Kissik")
	void LastNameOfRecord3215() {
		assertEquals("Kissik", customers.get(3214).getLastName());
	}

	@Test
	@DisplayName("Record 3215: Company is Ryder Services Inc")
	void CompanyOfRecord3215() {
		assertEquals("Ryder Services Inc", customers.get(3214).getCompany());
	}

	@Test
	@DisplayName("Record 3215: Address is 830 Cherry St")
	void AddressOfRecord3215() {
		assertEquals("830 Cherry St", customers.get(3214).getAddress());
	}

	@Test
	@DisplayName("Record 3215: City is Chico")
	void CityOfRecord3215() {
		assertEquals("Chico", customers.get(3214).getCity());
	}

	@Test
	@DisplayName("Record 3215: County is Butte")
	void CountyOfRecord3215() {
		assertEquals("Butte", customers.get(3214).getCounty());
	}

	@Test
	@DisplayName("Record 3215: State is CA")
	void StateOfRecord3215() {
		assertEquals("CA", customers.get(3214).getState());
	}

	@Test
	@DisplayName("Record 3215: ZIP is 95928")
	void ZIPOfRecord3215() {
		assertEquals("95928", customers.get(3214).getZIP());
	}

	@Test
	@DisplayName("Record 3215: Phone is 530-893-9159")
	void PhoneOfRecord3215() {
		assertEquals("530-893-9159", customers.get(3214).getPhone());
	}

	@Test
	@DisplayName("Record 3215: Fax is 530-893-5124")
	void FaxOfRecord3215() {
		assertEquals("530-893-5124", customers.get(3214).getFax());
	}

	@Test
	@DisplayName("Record 3215: Email is lynette@kissik.com")
	void EmailOfRecord3215() {
		assertEquals("lynette@kissik.com", customers.get(3214).getEmail());
	}

	@Test
	@DisplayName("Record 3215: Web is http://www.lynettekissik.com")
	void WebOfRecord3215() {
		assertEquals("http://www.lynettekissik.com", customers.get(3214).getWeb());
	}
}
