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

@Tag("46")
class Record_3562 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3562: FirstName is Lashawn")
	void FirstNameOfRecord3562() {
		assertEquals("Lashawn", customers.get(3561).getFirstName());
	}

	@Test
	@DisplayName("Record 3562: LastName is Haynsworth")
	void LastNameOfRecord3562() {
		assertEquals("Haynsworth", customers.get(3561).getLastName());
	}

	@Test
	@DisplayName("Record 3562: Company is Wolf Road Shoppers Park")
	void CompanyOfRecord3562() {
		assertEquals("Wolf Road Shoppers Park", customers.get(3561).getCompany());
	}

	@Test
	@DisplayName("Record 3562: Address is 58 Teed Dr")
	void AddressOfRecord3562() {
		assertEquals("58 Teed Dr", customers.get(3561).getAddress());
	}

	@Test
	@DisplayName("Record 3562: City is Randolph")
	void CityOfRecord3562() {
		assertEquals("Randolph", customers.get(3561).getCity());
	}

	@Test
	@DisplayName("Record 3562: County is Norfolk")
	void CountyOfRecord3562() {
		assertEquals("Norfolk", customers.get(3561).getCounty());
	}

	@Test
	@DisplayName("Record 3562: State is MA")
	void StateOfRecord3562() {
		assertEquals("MA", customers.get(3561).getState());
	}

	@Test
	@DisplayName("Record 3562: ZIP is 2368")
	void ZIPOfRecord3562() {
		assertEquals("2368", customers.get(3561).getZIP());
	}

	@Test
	@DisplayName("Record 3562: Phone is 781-986-1549")
	void PhoneOfRecord3562() {
		assertEquals("781-986-1549", customers.get(3561).getPhone());
	}

	@Test
	@DisplayName("Record 3562: Fax is 781-986-3433")
	void FaxOfRecord3562() {
		assertEquals("781-986-3433", customers.get(3561).getFax());
	}

	@Test
	@DisplayName("Record 3562: Email is lashawn@haynsworth.com")
	void EmailOfRecord3562() {
		assertEquals("lashawn@haynsworth.com", customers.get(3561).getEmail());
	}

	@Test
	@DisplayName("Record 3562: Web is http://www.lashawnhaynsworth.com")
	void WebOfRecord3562() {
		assertEquals("http://www.lashawnhaynsworth.com", customers.get(3561).getWeb());
	}
}
