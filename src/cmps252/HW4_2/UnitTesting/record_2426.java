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

@Tag("7")
class Record_2426 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2426: FirstName is Rolland")
	void FirstNameOfRecord2426() {
		assertEquals("Rolland", customers.get(2425).getFirstName());
	}

	@Test
	@DisplayName("Record 2426: LastName is Shadid")
	void LastNameOfRecord2426() {
		assertEquals("Shadid", customers.get(2425).getLastName());
	}

	@Test
	@DisplayName("Record 2426: Company is H & H Machine Tool Co Inc")
	void CompanyOfRecord2426() {
		assertEquals("H & H Machine Tool Co Inc", customers.get(2425).getCompany());
	}

	@Test
	@DisplayName("Record 2426: Address is 8575 Ronda Dr")
	void AddressOfRecord2426() {
		assertEquals("8575 Ronda Dr", customers.get(2425).getAddress());
	}

	@Test
	@DisplayName("Record 2426: City is Canton")
	void CityOfRecord2426() {
		assertEquals("Canton", customers.get(2425).getCity());
	}

	@Test
	@DisplayName("Record 2426: County is Wayne")
	void CountyOfRecord2426() {
		assertEquals("Wayne", customers.get(2425).getCounty());
	}

	@Test
	@DisplayName("Record 2426: State is MI")
	void StateOfRecord2426() {
		assertEquals("MI", customers.get(2425).getState());
	}

	@Test
	@DisplayName("Record 2426: ZIP is 48187")
	void ZIPOfRecord2426() {
		assertEquals("48187", customers.get(2425).getZIP());
	}

	@Test
	@DisplayName("Record 2426: Phone is 734-459-1350")
	void PhoneOfRecord2426() {
		assertEquals("734-459-1350", customers.get(2425).getPhone());
	}

	@Test
	@DisplayName("Record 2426: Fax is 734-459-7748")
	void FaxOfRecord2426() {
		assertEquals("734-459-7748", customers.get(2425).getFax());
	}

	@Test
	@DisplayName("Record 2426: Email is rolland@shadid.com")
	void EmailOfRecord2426() {
		assertEquals("rolland@shadid.com", customers.get(2425).getEmail());
	}

	@Test
	@DisplayName("Record 2426: Web is http://www.rollandshadid.com")
	void WebOfRecord2426() {
		assertEquals("http://www.rollandshadid.com", customers.get(2425).getWeb());
	}
}
