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

@Tag("12")
class Record_1746 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1746: FirstName is Briana")
	void FirstNameOfRecord1746() {
		assertEquals("Briana", customers.get(1745).getFirstName());
	}

	@Test
	@DisplayName("Record 1746: LastName is Bukowiecki")
	void LastNameOfRecord1746() {
		assertEquals("Bukowiecki", customers.get(1745).getLastName());
	}

	@Test
	@DisplayName("Record 1746: Company is Kleefield, Claude H Esq")
	void CompanyOfRecord1746() {
		assertEquals("Kleefield, Claude H Esq", customers.get(1745).getCompany());
	}

	@Test
	@DisplayName("Record 1746: Address is 875 W 17th St")
	void AddressOfRecord1746() {
		assertEquals("875 W 17th St", customers.get(1745).getAddress());
	}

	@Test
	@DisplayName("Record 1746: City is Costa Mesa")
	void CityOfRecord1746() {
		assertEquals("Costa Mesa", customers.get(1745).getCity());
	}

	@Test
	@DisplayName("Record 1746: County is Orange")
	void CountyOfRecord1746() {
		assertEquals("Orange", customers.get(1745).getCounty());
	}

	@Test
	@DisplayName("Record 1746: State is CA")
	void StateOfRecord1746() {
		assertEquals("CA", customers.get(1745).getState());
	}

	@Test
	@DisplayName("Record 1746: ZIP is 92627")
	void ZIPOfRecord1746() {
		assertEquals("92627", customers.get(1745).getZIP());
	}

	@Test
	@DisplayName("Record 1746: Phone is 949-545-4628")
	void PhoneOfRecord1746() {
		assertEquals("949-545-4628", customers.get(1745).getPhone());
	}

	@Test
	@DisplayName("Record 1746: Fax is 949-545-3621")
	void FaxOfRecord1746() {
		assertEquals("949-545-3621", customers.get(1745).getFax());
	}

	@Test
	@DisplayName("Record 1746: Email is briana@bukowiecki.com")
	void EmailOfRecord1746() {
		assertEquals("briana@bukowiecki.com", customers.get(1745).getEmail());
	}

	@Test
	@DisplayName("Record 1746: Web is http://www.brianabukowiecki.com")
	void WebOfRecord1746() {
		assertEquals("http://www.brianabukowiecki.com", customers.get(1745).getWeb());
	}
}
