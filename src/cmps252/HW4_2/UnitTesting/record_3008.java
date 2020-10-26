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

@Tag("5")
class Record_3008 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3008: FirstName is Paula")
	void FirstNameOfRecord3008() {
		assertEquals("Paula", customers.get(3007).getFirstName());
	}

	@Test
	@DisplayName("Record 3008: LastName is Wagnon")
	void LastNameOfRecord3008() {
		assertEquals("Wagnon", customers.get(3007).getLastName());
	}

	@Test
	@DisplayName("Record 3008: Company is Trans World Services Inc")
	void CompanyOfRecord3008() {
		assertEquals("Trans World Services Inc", customers.get(3007).getCompany());
	}

	@Test
	@DisplayName("Record 3008: Address is 1642 W Nelson St")
	void AddressOfRecord3008() {
		assertEquals("1642 W Nelson St", customers.get(3007).getAddress());
	}

	@Test
	@DisplayName("Record 3008: City is Chicago")
	void CityOfRecord3008() {
		assertEquals("Chicago", customers.get(3007).getCity());
	}

	@Test
	@DisplayName("Record 3008: County is Cook")
	void CountyOfRecord3008() {
		assertEquals("Cook", customers.get(3007).getCounty());
	}

	@Test
	@DisplayName("Record 3008: State is IL")
	void StateOfRecord3008() {
		assertEquals("IL", customers.get(3007).getState());
	}

	@Test
	@DisplayName("Record 3008: ZIP is 60657")
	void ZIPOfRecord3008() {
		assertEquals("60657", customers.get(3007).getZIP());
	}

	@Test
	@DisplayName("Record 3008: Phone is 773-348-9330")
	void PhoneOfRecord3008() {
		assertEquals("773-348-9330", customers.get(3007).getPhone());
	}

	@Test
	@DisplayName("Record 3008: Fax is 773-348-5027")
	void FaxOfRecord3008() {
		assertEquals("773-348-5027", customers.get(3007).getFax());
	}

	@Test
	@DisplayName("Record 3008: Email is paula@wagnon.com")
	void EmailOfRecord3008() {
		assertEquals("paula@wagnon.com", customers.get(3007).getEmail());
	}

	@Test
	@DisplayName("Record 3008: Web is http://www.paulawagnon.com")
	void WebOfRecord3008() {
		assertEquals("http://www.paulawagnon.com", customers.get(3007).getWeb());
	}
}
