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

@Tag("48")
class Record_2133 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2133: FirstName is Eddie")
	void FirstNameOfRecord2133() {
		assertEquals("Eddie", customers.get(2132).getFirstName());
	}

	@Test
	@DisplayName("Record 2133: LastName is Collar")
	void LastNameOfRecord2133() {
		assertEquals("Collar", customers.get(2132).getLastName());
	}

	@Test
	@DisplayName("Record 2133: Company is Omni Transport Inc")
	void CompanyOfRecord2133() {
		assertEquals("Omni Transport Inc", customers.get(2132).getCompany());
	}

	@Test
	@DisplayName("Record 2133: Address is 4200 Creekside Ave")
	void AddressOfRecord2133() {
		assertEquals("4200 Creekside Ave", customers.get(2132).getAddress());
	}

	@Test
	@DisplayName("Record 2133: City is Toledo")
	void CityOfRecord2133() {
		assertEquals("Toledo", customers.get(2132).getCity());
	}

	@Test
	@DisplayName("Record 2133: County is Lucas")
	void CountyOfRecord2133() {
		assertEquals("Lucas", customers.get(2132).getCounty());
	}

	@Test
	@DisplayName("Record 2133: State is OH")
	void StateOfRecord2133() {
		assertEquals("OH", customers.get(2132).getState());
	}

	@Test
	@DisplayName("Record 2133: ZIP is 43612")
	void ZIPOfRecord2133() {
		assertEquals("43612", customers.get(2132).getZIP());
	}

	@Test
	@DisplayName("Record 2133: Phone is 419-476-7112")
	void PhoneOfRecord2133() {
		assertEquals("419-476-7112", customers.get(2132).getPhone());
	}

	@Test
	@DisplayName("Record 2133: Fax is 419-476-7962")
	void FaxOfRecord2133() {
		assertEquals("419-476-7962", customers.get(2132).getFax());
	}

	@Test
	@DisplayName("Record 2133: Email is eddie@collar.com")
	void EmailOfRecord2133() {
		assertEquals("eddie@collar.com", customers.get(2132).getEmail());
	}

	@Test
	@DisplayName("Record 2133: Web is http://www.eddiecollar.com")
	void WebOfRecord2133() {
		assertEquals("http://www.eddiecollar.com", customers.get(2132).getWeb());
	}
}
