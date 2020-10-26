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

@Tag("21")
class Record_1474 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1474: FirstName is Valarie")
	void FirstNameOfRecord1474() {
		assertEquals("Valarie", customers.get(1473).getFirstName());
	}

	@Test
	@DisplayName("Record 1474: LastName is Macedonio")
	void LastNameOfRecord1474() {
		assertEquals("Macedonio", customers.get(1473).getLastName());
	}

	@Test
	@DisplayName("Record 1474: Company is Woodholly Productions")
	void CompanyOfRecord1474() {
		assertEquals("Woodholly Productions", customers.get(1473).getCompany());
	}

	@Test
	@DisplayName("Record 1474: Address is 2030 Central St")
	void AddressOfRecord1474() {
		assertEquals("2030 Central St", customers.get(1473).getAddress());
	}

	@Test
	@DisplayName("Record 1474: City is Kansas City")
	void CityOfRecord1474() {
		assertEquals("Kansas City", customers.get(1473).getCity());
	}

	@Test
	@DisplayName("Record 1474: County is Jackson")
	void CountyOfRecord1474() {
		assertEquals("Jackson", customers.get(1473).getCounty());
	}

	@Test
	@DisplayName("Record 1474: State is MO")
	void StateOfRecord1474() {
		assertEquals("MO", customers.get(1473).getState());
	}

	@Test
	@DisplayName("Record 1474: ZIP is 64108")
	void ZIPOfRecord1474() {
		assertEquals("64108", customers.get(1473).getZIP());
	}

	@Test
	@DisplayName("Record 1474: Phone is 816-842-6628")
	void PhoneOfRecord1474() {
		assertEquals("816-842-6628", customers.get(1473).getPhone());
	}

	@Test
	@DisplayName("Record 1474: Fax is 816-842-5396")
	void FaxOfRecord1474() {
		assertEquals("816-842-5396", customers.get(1473).getFax());
	}

	@Test
	@DisplayName("Record 1474: Email is valarie@macedonio.com")
	void EmailOfRecord1474() {
		assertEquals("valarie@macedonio.com", customers.get(1473).getEmail());
	}

	@Test
	@DisplayName("Record 1474: Web is http://www.valariemacedonio.com")
	void WebOfRecord1474() {
		assertEquals("http://www.valariemacedonio.com", customers.get(1473).getWeb());
	}
}
