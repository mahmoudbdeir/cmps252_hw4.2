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

@Tag("37")
class Record_1699 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1699: FirstName is Kylie")
	void FirstNameOfRecord1699() {
		assertEquals("Kylie", customers.get(1698).getFirstName());
	}

	@Test
	@DisplayName("Record 1699: LastName is Hoseman")
	void LastNameOfRecord1699() {
		assertEquals("Hoseman", customers.get(1698).getLastName());
	}

	@Test
	@DisplayName("Record 1699: Company is Whitney H Roddy Inc")
	void CompanyOfRecord1699() {
		assertEquals("Whitney H Roddy Inc", customers.get(1698).getCompany());
	}

	@Test
	@DisplayName("Record 1699: Address is 53 Batavia St")
	void AddressOfRecord1699() {
		assertEquals("53 Batavia St", customers.get(1698).getAddress());
	}

	@Test
	@DisplayName("Record 1699: City is Springfield")
	void CityOfRecord1699() {
		assertEquals("Springfield", customers.get(1698).getCity());
	}

	@Test
	@DisplayName("Record 1699: County is Hampden")
	void CountyOfRecord1699() {
		assertEquals("Hampden", customers.get(1698).getCounty());
	}

	@Test
	@DisplayName("Record 1699: State is MA")
	void StateOfRecord1699() {
		assertEquals("MA", customers.get(1698).getState());
	}

	@Test
	@DisplayName("Record 1699: ZIP is 1109")
	void ZIPOfRecord1699() {
		assertEquals("1109", customers.get(1698).getZIP());
	}

	@Test
	@DisplayName("Record 1699: Phone is 413-734-1389")
	void PhoneOfRecord1699() {
		assertEquals("413-734-1389", customers.get(1698).getPhone());
	}

	@Test
	@DisplayName("Record 1699: Fax is 413-734-7324")
	void FaxOfRecord1699() {
		assertEquals("413-734-7324", customers.get(1698).getFax());
	}

	@Test
	@DisplayName("Record 1699: Email is kylie@hoseman.com")
	void EmailOfRecord1699() {
		assertEquals("kylie@hoseman.com", customers.get(1698).getEmail());
	}

	@Test
	@DisplayName("Record 1699: Web is http://www.kyliehoseman.com")
	void WebOfRecord1699() {
		assertEquals("http://www.kyliehoseman.com", customers.get(1698).getWeb());
	}
}
