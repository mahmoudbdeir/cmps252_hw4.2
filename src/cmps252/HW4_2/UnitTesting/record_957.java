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
class Record_957 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 957: FirstName is Carmel")
	void FirstNameOfRecord957() {
		assertEquals("Carmel", customers.get(956).getFirstName());
	}

	@Test
	@DisplayName("Record 957: LastName is Stalberger")
	void LastNameOfRecord957() {
		assertEquals("Stalberger", customers.get(956).getLastName());
	}

	@Test
	@DisplayName("Record 957: Company is Pony Express")
	void CompanyOfRecord957() {
		assertEquals("Pony Express", customers.get(956).getCompany());
	}

	@Test
	@DisplayName("Record 957: Address is 2922 N 18th Pl")
	void AddressOfRecord957() {
		assertEquals("2922 N 18th Pl", customers.get(956).getAddress());
	}

	@Test
	@DisplayName("Record 957: City is Phoenix")
	void CityOfRecord957() {
		assertEquals("Phoenix", customers.get(956).getCity());
	}

	@Test
	@DisplayName("Record 957: County is Maricopa")
	void CountyOfRecord957() {
		assertEquals("Maricopa", customers.get(956).getCounty());
	}

	@Test
	@DisplayName("Record 957: State is AZ")
	void StateOfRecord957() {
		assertEquals("AZ", customers.get(956).getState());
	}

	@Test
	@DisplayName("Record 957: ZIP is 85016")
	void ZIPOfRecord957() {
		assertEquals("85016", customers.get(956).getZIP());
	}

	@Test
	@DisplayName("Record 957: Phone is 602-264-1584")
	void PhoneOfRecord957() {
		assertEquals("602-264-1584", customers.get(956).getPhone());
	}

	@Test
	@DisplayName("Record 957: Fax is 602-264-4283")
	void FaxOfRecord957() {
		assertEquals("602-264-4283", customers.get(956).getFax());
	}

	@Test
	@DisplayName("Record 957: Email is carmel@stalberger.com")
	void EmailOfRecord957() {
		assertEquals("carmel@stalberger.com", customers.get(956).getEmail());
	}

	@Test
	@DisplayName("Record 957: Web is http://www.carmelstalberger.com")
	void WebOfRecord957() {
		assertEquals("http://www.carmelstalberger.com", customers.get(956).getWeb());
	}
}
