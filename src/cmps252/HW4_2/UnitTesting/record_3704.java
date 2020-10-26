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

@Tag("40")
class Record_3704 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3704: FirstName is Maureen")
	void FirstNameOfRecord3704() {
		assertEquals("Maureen", customers.get(3703).getFirstName());
	}

	@Test
	@DisplayName("Record 3704: LastName is Clarendon")
	void LastNameOfRecord3704() {
		assertEquals("Clarendon", customers.get(3703).getLastName());
	}

	@Test
	@DisplayName("Record 3704: Company is Yes Were Nuts Plus Ltd")
	void CompanyOfRecord3704() {
		assertEquals("Yes Were Nuts Plus Ltd", customers.get(3703).getCompany());
	}

	@Test
	@DisplayName("Record 3704: Address is 510 W Reno Ave")
	void AddressOfRecord3704() {
		assertEquals("510 W Reno Ave", customers.get(3703).getAddress());
	}

	@Test
	@DisplayName("Record 3704: City is Oklahoma City")
	void CityOfRecord3704() {
		assertEquals("Oklahoma City", customers.get(3703).getCity());
	}

	@Test
	@DisplayName("Record 3704: County is Oklahoma")
	void CountyOfRecord3704() {
		assertEquals("Oklahoma", customers.get(3703).getCounty());
	}

	@Test
	@DisplayName("Record 3704: State is OK")
	void StateOfRecord3704() {
		assertEquals("OK", customers.get(3703).getState());
	}

	@Test
	@DisplayName("Record 3704: ZIP is 73102")
	void ZIPOfRecord3704() {
		assertEquals("73102", customers.get(3703).getZIP());
	}

	@Test
	@DisplayName("Record 3704: Phone is 405-236-8354")
	void PhoneOfRecord3704() {
		assertEquals("405-236-8354", customers.get(3703).getPhone());
	}

	@Test
	@DisplayName("Record 3704: Fax is 405-236-4304")
	void FaxOfRecord3704() {
		assertEquals("405-236-4304", customers.get(3703).getFax());
	}

	@Test
	@DisplayName("Record 3704: Email is maureen@clarendon.com")
	void EmailOfRecord3704() {
		assertEquals("maureen@clarendon.com", customers.get(3703).getEmail());
	}

	@Test
	@DisplayName("Record 3704: Web is http://www.maureenclarendon.com")
	void WebOfRecord3704() {
		assertEquals("http://www.maureenclarendon.com", customers.get(3703).getWeb());
	}
}
