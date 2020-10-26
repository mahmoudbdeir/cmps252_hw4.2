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
class Record_3625 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3625: FirstName is Jeanna")
	void FirstNameOfRecord3625() {
		assertEquals("Jeanna", customers.get(3624).getFirstName());
	}

	@Test
	@DisplayName("Record 3625: LastName is Granneman")
	void LastNameOfRecord3625() {
		assertEquals("Granneman", customers.get(3624).getLastName());
	}

	@Test
	@DisplayName("Record 3625: Company is Carrier Components Corp")
	void CompanyOfRecord3625() {
		assertEquals("Carrier Components Corp", customers.get(3624).getCompany());
	}

	@Test
	@DisplayName("Record 3625: Address is 145 S Jackson St")
	void AddressOfRecord3625() {
		assertEquals("145 S Jackson St", customers.get(3624).getAddress());
	}

	@Test
	@DisplayName("Record 3625: City is Jackson")
	void CityOfRecord3625() {
		assertEquals("Jackson", customers.get(3624).getCity());
	}

	@Test
	@DisplayName("Record 3625: County is Jackson")
	void CountyOfRecord3625() {
		assertEquals("Jackson", customers.get(3624).getCounty());
	}

	@Test
	@DisplayName("Record 3625: State is MI")
	void StateOfRecord3625() {
		assertEquals("MI", customers.get(3624).getState());
	}

	@Test
	@DisplayName("Record 3625: ZIP is 49201")
	void ZIPOfRecord3625() {
		assertEquals("49201", customers.get(3624).getZIP());
	}

	@Test
	@DisplayName("Record 3625: Phone is 517-787-6180")
	void PhoneOfRecord3625() {
		assertEquals("517-787-6180", customers.get(3624).getPhone());
	}

	@Test
	@DisplayName("Record 3625: Fax is 517-787-3822")
	void FaxOfRecord3625() {
		assertEquals("517-787-3822", customers.get(3624).getFax());
	}

	@Test
	@DisplayName("Record 3625: Email is jeanna@granneman.com")
	void EmailOfRecord3625() {
		assertEquals("jeanna@granneman.com", customers.get(3624).getEmail());
	}

	@Test
	@DisplayName("Record 3625: Web is http://www.jeannagranneman.com")
	void WebOfRecord3625() {
		assertEquals("http://www.jeannagranneman.com", customers.get(3624).getWeb());
	}
}
