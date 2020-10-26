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

@Tag("3")
class Record_3783 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3783: FirstName is Tori")
	void FirstNameOfRecord3783() {
		assertEquals("Tori", customers.get(3782).getFirstName());
	}

	@Test
	@DisplayName("Record 3783: LastName is Mckissic")
	void LastNameOfRecord3783() {
		assertEquals("Mckissic", customers.get(3782).getLastName());
	}

	@Test
	@DisplayName("Record 3783: Company is Fleetwood Mach Prod Inc Aero")
	void CompanyOfRecord3783() {
		assertEquals("Fleetwood Mach Prod Inc Aero", customers.get(3782).getCompany());
	}

	@Test
	@DisplayName("Record 3783: Address is 59 Ala Muku St")
	void AddressOfRecord3783() {
		assertEquals("59 Ala Muku St", customers.get(3782).getAddress());
	}

	@Test
	@DisplayName("Record 3783: City is Hilo")
	void CityOfRecord3783() {
		assertEquals("Hilo", customers.get(3782).getCity());
	}

	@Test
	@DisplayName("Record 3783: County is Hawaii")
	void CountyOfRecord3783() {
		assertEquals("Hawaii", customers.get(3782).getCounty());
	}

	@Test
	@DisplayName("Record 3783: State is HI")
	void StateOfRecord3783() {
		assertEquals("HI", customers.get(3782).getState());
	}

	@Test
	@DisplayName("Record 3783: ZIP is 96720")
	void ZIPOfRecord3783() {
		assertEquals("96720", customers.get(3782).getZIP());
	}

	@Test
	@DisplayName("Record 3783: Phone is 808-969-5217")
	void PhoneOfRecord3783() {
		assertEquals("808-969-5217", customers.get(3782).getPhone());
	}

	@Test
	@DisplayName("Record 3783: Fax is 808-969-4259")
	void FaxOfRecord3783() {
		assertEquals("808-969-4259", customers.get(3782).getFax());
	}

	@Test
	@DisplayName("Record 3783: Email is tori@mckissic.com")
	void EmailOfRecord3783() {
		assertEquals("tori@mckissic.com", customers.get(3782).getEmail());
	}

	@Test
	@DisplayName("Record 3783: Web is http://www.torimckissic.com")
	void WebOfRecord3783() {
		assertEquals("http://www.torimckissic.com", customers.get(3782).getWeb());
	}
}
