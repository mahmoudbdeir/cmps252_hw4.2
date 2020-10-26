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

@Tag("27")
class Record_2170 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2170: FirstName is Natasha")
	void FirstNameOfRecord2170() {
		assertEquals("Natasha", customers.get(2169).getFirstName());
	}

	@Test
	@DisplayName("Record 2170: LastName is Shubeck")
	void LastNameOfRecord2170() {
		assertEquals("Shubeck", customers.get(2169).getLastName());
	}

	@Test
	@DisplayName("Record 2170: Company is Kelly Michener Inc")
	void CompanyOfRecord2170() {
		assertEquals("Kelly Michener Inc", customers.get(2169).getCompany());
	}

	@Test
	@DisplayName("Record 2170: Address is 10765 E River")
	void AddressOfRecord2170() {
		assertEquals("10765 E River", customers.get(2169).getAddress());
	}

	@Test
	@DisplayName("Record 2170: City is Truckee")
	void CityOfRecord2170() {
		assertEquals("Truckee", customers.get(2169).getCity());
	}

	@Test
	@DisplayName("Record 2170: County is Nevada")
	void CountyOfRecord2170() {
		assertEquals("Nevada", customers.get(2169).getCounty());
	}

	@Test
	@DisplayName("Record 2170: State is CA")
	void StateOfRecord2170() {
		assertEquals("CA", customers.get(2169).getState());
	}

	@Test
	@DisplayName("Record 2170: ZIP is 96161")
	void ZIPOfRecord2170() {
		assertEquals("96161", customers.get(2169).getZIP());
	}

	@Test
	@DisplayName("Record 2170: Phone is 530-587-9222")
	void PhoneOfRecord2170() {
		assertEquals("530-587-9222", customers.get(2169).getPhone());
	}

	@Test
	@DisplayName("Record 2170: Fax is 530-587-1929")
	void FaxOfRecord2170() {
		assertEquals("530-587-1929", customers.get(2169).getFax());
	}

	@Test
	@DisplayName("Record 2170: Email is natasha@shubeck.com")
	void EmailOfRecord2170() {
		assertEquals("natasha@shubeck.com", customers.get(2169).getEmail());
	}

	@Test
	@DisplayName("Record 2170: Web is http://www.natashashubeck.com")
	void WebOfRecord2170() {
		assertEquals("http://www.natashashubeck.com", customers.get(2169).getWeb());
	}
}
