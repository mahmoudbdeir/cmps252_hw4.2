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

@Tag("29")
class Record_2930 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2930: FirstName is Eleanore")
	void FirstNameOfRecord2930() {
		assertEquals("Eleanore", customers.get(2929).getFirstName());
	}

	@Test
	@DisplayName("Record 2930: LastName is Hughlett")
	void LastNameOfRecord2930() {
		assertEquals("Hughlett", customers.get(2929).getLastName());
	}

	@Test
	@DisplayName("Record 2930: Company is Collins Environmental Svc Inc")
	void CompanyOfRecord2930() {
		assertEquals("Collins Environmental Svc Inc", customers.get(2929).getCompany());
	}

	@Test
	@DisplayName("Record 2930: Address is 3715 W Main St")
	void AddressOfRecord2930() {
		assertEquals("3715 W Main St", customers.get(2929).getAddress());
	}

	@Test
	@DisplayName("Record 2930: City is Kalamazoo")
	void CityOfRecord2930() {
		assertEquals("Kalamazoo", customers.get(2929).getCity());
	}

	@Test
	@DisplayName("Record 2930: County is Kalamazoo")
	void CountyOfRecord2930() {
		assertEquals("Kalamazoo", customers.get(2929).getCounty());
	}

	@Test
	@DisplayName("Record 2930: State is MI")
	void StateOfRecord2930() {
		assertEquals("MI", customers.get(2929).getState());
	}

	@Test
	@DisplayName("Record 2930: ZIP is 49006")
	void ZIPOfRecord2930() {
		assertEquals("49006", customers.get(2929).getZIP());
	}

	@Test
	@DisplayName("Record 2930: Phone is 269-382-2362")
	void PhoneOfRecord2930() {
		assertEquals("269-382-2362", customers.get(2929).getPhone());
	}

	@Test
	@DisplayName("Record 2930: Fax is 269-382-3797")
	void FaxOfRecord2930() {
		assertEquals("269-382-3797", customers.get(2929).getFax());
	}

	@Test
	@DisplayName("Record 2930: Email is eleanore@hughlett.com")
	void EmailOfRecord2930() {
		assertEquals("eleanore@hughlett.com", customers.get(2929).getEmail());
	}

	@Test
	@DisplayName("Record 2930: Web is http://www.eleanorehughlett.com")
	void WebOfRecord2930() {
		assertEquals("http://www.eleanorehughlett.com", customers.get(2929).getWeb());
	}
}
