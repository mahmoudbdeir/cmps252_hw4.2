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

@Tag("23")
class Record_912 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 912: FirstName is Flossie")
	void FirstNameOfRecord912() {
		assertEquals("Flossie", customers.get(911).getFirstName());
	}

	@Test
	@DisplayName("Record 912: LastName is Cottew")
	void LastNameOfRecord912() {
		assertEquals("Cottew", customers.get(911).getLastName());
	}

	@Test
	@DisplayName("Record 912: Company is Cal Doran Metallurgical Svc")
	void CompanyOfRecord912() {
		assertEquals("Cal Doran Metallurgical Svc", customers.get(911).getCompany());
	}

	@Test
	@DisplayName("Record 912: Address is 1227 E 119th St")
	void AddressOfRecord912() {
		assertEquals("1227 E 119th St", customers.get(911).getAddress());
	}

	@Test
	@DisplayName("Record 912: City is Grandview")
	void CityOfRecord912() {
		assertEquals("Grandview", customers.get(911).getCity());
	}

	@Test
	@DisplayName("Record 912: County is Jackson")
	void CountyOfRecord912() {
		assertEquals("Jackson", customers.get(911).getCounty());
	}

	@Test
	@DisplayName("Record 912: State is MO")
	void StateOfRecord912() {
		assertEquals("MO", customers.get(911).getState());
	}

	@Test
	@DisplayName("Record 912: ZIP is 64030")
	void ZIPOfRecord912() {
		assertEquals("64030", customers.get(911).getZIP());
	}

	@Test
	@DisplayName("Record 912: Phone is 816-761-4379")
	void PhoneOfRecord912() {
		assertEquals("816-761-4379", customers.get(911).getPhone());
	}

	@Test
	@DisplayName("Record 912: Fax is 816-761-8904")
	void FaxOfRecord912() {
		assertEquals("816-761-8904", customers.get(911).getFax());
	}

	@Test
	@DisplayName("Record 912: Email is flossie@cottew.com")
	void EmailOfRecord912() {
		assertEquals("flossie@cottew.com", customers.get(911).getEmail());
	}

	@Test
	@DisplayName("Record 912: Web is http://www.flossiecottew.com")
	void WebOfRecord912() {
		assertEquals("http://www.flossiecottew.com", customers.get(911).getWeb());
	}
}
