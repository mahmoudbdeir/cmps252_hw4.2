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

@Tag("28")
class Record_1879 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1879: FirstName is Janell")
	void FirstNameOfRecord1879() {
		assertEquals("Janell", customers.get(1878).getFirstName());
	}

	@Test
	@DisplayName("Record 1879: LastName is Yozzo")
	void LastNameOfRecord1879() {
		assertEquals("Yozzo", customers.get(1878).getLastName());
	}

	@Test
	@DisplayName("Record 1879: Company is Marco Polo Club")
	void CompanyOfRecord1879() {
		assertEquals("Marco Polo Club", customers.get(1878).getCompany());
	}

	@Test
	@DisplayName("Record 1879: Address is 1938 Route 37 E")
	void AddressOfRecord1879() {
		assertEquals("1938 Route 37 E", customers.get(1878).getAddress());
	}

	@Test
	@DisplayName("Record 1879: City is Toms River")
	void CityOfRecord1879() {
		assertEquals("Toms River", customers.get(1878).getCity());
	}

	@Test
	@DisplayName("Record 1879: County is Ocean")
	void CountyOfRecord1879() {
		assertEquals("Ocean", customers.get(1878).getCounty());
	}

	@Test
	@DisplayName("Record 1879: State is NJ")
	void StateOfRecord1879() {
		assertEquals("NJ", customers.get(1878).getState());
	}

	@Test
	@DisplayName("Record 1879: ZIP is 8753")
	void ZIPOfRecord1879() {
		assertEquals("8753", customers.get(1878).getZIP());
	}

	@Test
	@DisplayName("Record 1879: Phone is 732-270-5643")
	void PhoneOfRecord1879() {
		assertEquals("732-270-5643", customers.get(1878).getPhone());
	}

	@Test
	@DisplayName("Record 1879: Fax is 732-270-8331")
	void FaxOfRecord1879() {
		assertEquals("732-270-8331", customers.get(1878).getFax());
	}

	@Test
	@DisplayName("Record 1879: Email is janell@yozzo.com")
	void EmailOfRecord1879() {
		assertEquals("janell@yozzo.com", customers.get(1878).getEmail());
	}

	@Test
	@DisplayName("Record 1879: Web is http://www.janellyozzo.com")
	void WebOfRecord1879() {
		assertEquals("http://www.janellyozzo.com", customers.get(1878).getWeb());
	}
}
