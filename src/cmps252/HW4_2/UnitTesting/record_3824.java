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

@Tag("35")
class Record_3824 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3824: FirstName is Desmond")
	void FirstNameOfRecord3824() {
		assertEquals("Desmond", customers.get(3823).getFirstName());
	}

	@Test
	@DisplayName("Record 3824: LastName is Duhan")
	void LastNameOfRecord3824() {
		assertEquals("Duhan", customers.get(3823).getLastName());
	}

	@Test
	@DisplayName("Record 3824: Company is Sure Temp")
	void CompanyOfRecord3824() {
		assertEquals("Sure Temp", customers.get(3823).getCompany());
	}

	@Test
	@DisplayName("Record 3824: Address is 2402 Seaman Ave")
	void AddressOfRecord3824() {
		assertEquals("2402 Seaman Ave", customers.get(3823).getAddress());
	}

	@Test
	@DisplayName("Record 3824: City is South El Monte")
	void CityOfRecord3824() {
		assertEquals("South El Monte", customers.get(3823).getCity());
	}

	@Test
	@DisplayName("Record 3824: County is Los Angeles")
	void CountyOfRecord3824() {
		assertEquals("Los Angeles", customers.get(3823).getCounty());
	}

	@Test
	@DisplayName("Record 3824: State is CA")
	void StateOfRecord3824() {
		assertEquals("CA", customers.get(3823).getState());
	}

	@Test
	@DisplayName("Record 3824: ZIP is 91733")
	void ZIPOfRecord3824() {
		assertEquals("91733", customers.get(3823).getZIP());
	}

	@Test
	@DisplayName("Record 3824: Phone is 626-401-7500")
	void PhoneOfRecord3824() {
		assertEquals("626-401-7500", customers.get(3823).getPhone());
	}

	@Test
	@DisplayName("Record 3824: Fax is 626-401-1424")
	void FaxOfRecord3824() {
		assertEquals("626-401-1424", customers.get(3823).getFax());
	}

	@Test
	@DisplayName("Record 3824: Email is desmond@duhan.com")
	void EmailOfRecord3824() {
		assertEquals("desmond@duhan.com", customers.get(3823).getEmail());
	}

	@Test
	@DisplayName("Record 3824: Web is http://www.desmondduhan.com")
	void WebOfRecord3824() {
		assertEquals("http://www.desmondduhan.com", customers.get(3823).getWeb());
	}
}
