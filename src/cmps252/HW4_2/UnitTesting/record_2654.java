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

@Tag("13")
class Record_2654 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2654: FirstName is Kris")
	void FirstNameOfRecord2654() {
		assertEquals("Kris", customers.get(2653).getFirstName());
	}

	@Test
	@DisplayName("Record 2654: LastName is Wollmer")
	void LastNameOfRecord2654() {
		assertEquals("Wollmer", customers.get(2653).getLastName());
	}

	@Test
	@DisplayName("Record 2654: Company is Macdonald Illig Jones")
	void CompanyOfRecord2654() {
		assertEquals("Macdonald Illig Jones", customers.get(2653).getCompany());
	}

	@Test
	@DisplayName("Record 2654: Address is 22 Zebra Pl")
	void AddressOfRecord2654() {
		assertEquals("22 Zebra Pl", customers.get(2653).getAddress());
	}

	@Test
	@DisplayName("Record 2654: City is Staten Island")
	void CityOfRecord2654() {
		assertEquals("Staten Island", customers.get(2653).getCity());
	}

	@Test
	@DisplayName("Record 2654: County is Richmond")
	void CountyOfRecord2654() {
		assertEquals("Richmond", customers.get(2653).getCounty());
	}

	@Test
	@DisplayName("Record 2654: State is NY")
	void StateOfRecord2654() {
		assertEquals("NY", customers.get(2653).getState());
	}

	@Test
	@DisplayName("Record 2654: ZIP is 10309")
	void ZIPOfRecord2654() {
		assertEquals("10309", customers.get(2653).getZIP());
	}

	@Test
	@DisplayName("Record 2654: Phone is 718-979-7831")
	void PhoneOfRecord2654() {
		assertEquals("718-979-7831", customers.get(2653).getPhone());
	}

	@Test
	@DisplayName("Record 2654: Fax is 718-979-9296")
	void FaxOfRecord2654() {
		assertEquals("718-979-9296", customers.get(2653).getFax());
	}

	@Test
	@DisplayName("Record 2654: Email is kris@wollmer.com")
	void EmailOfRecord2654() {
		assertEquals("kris@wollmer.com", customers.get(2653).getEmail());
	}

	@Test
	@DisplayName("Record 2654: Web is http://www.kriswollmer.com")
	void WebOfRecord2654() {
		assertEquals("http://www.kriswollmer.com", customers.get(2653).getWeb());
	}
}
