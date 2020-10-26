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

@Tag("25")
class Record_3920 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3920: FirstName is Lynn")
	void FirstNameOfRecord3920() {
		assertEquals("Lynn", customers.get(3919).getFirstName());
	}

	@Test
	@DisplayName("Record 3920: LastName is Fikes")
	void LastNameOfRecord3920() {
		assertEquals("Fikes", customers.get(3919).getLastName());
	}

	@Test
	@DisplayName("Record 3920: Company is Johnsons Roofing")
	void CompanyOfRecord3920() {
		assertEquals("Johnsons Roofing", customers.get(3919).getCompany());
	}

	@Test
	@DisplayName("Record 3920: Address is 7747 Van Buren St")
	void AddressOfRecord3920() {
		assertEquals("7747 Van Buren St", customers.get(3919).getAddress());
	}

	@Test
	@DisplayName("Record 3920: City is Forest Park")
	void CityOfRecord3920() {
		assertEquals("Forest Park", customers.get(3919).getCity());
	}

	@Test
	@DisplayName("Record 3920: County is Cook")
	void CountyOfRecord3920() {
		assertEquals("Cook", customers.get(3919).getCounty());
	}

	@Test
	@DisplayName("Record 3920: State is IL")
	void StateOfRecord3920() {
		assertEquals("IL", customers.get(3919).getState());
	}

	@Test
	@DisplayName("Record 3920: ZIP is 60130")
	void ZIPOfRecord3920() {
		assertEquals("60130", customers.get(3919).getZIP());
	}

	@Test
	@DisplayName("Record 3920: Phone is 708-366-5417")
	void PhoneOfRecord3920() {
		assertEquals("708-366-5417", customers.get(3919).getPhone());
	}

	@Test
	@DisplayName("Record 3920: Fax is 708-366-9816")
	void FaxOfRecord3920() {
		assertEquals("708-366-9816", customers.get(3919).getFax());
	}

	@Test
	@DisplayName("Record 3920: Email is lynn@fikes.com")
	void EmailOfRecord3920() {
		assertEquals("lynn@fikes.com", customers.get(3919).getEmail());
	}

	@Test
	@DisplayName("Record 3920: Web is http://www.lynnfikes.com")
	void WebOfRecord3920() {
		assertEquals("http://www.lynnfikes.com", customers.get(3919).getWeb());
	}
}
