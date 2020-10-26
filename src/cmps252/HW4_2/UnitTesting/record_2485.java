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

@Tag("8")
class Record_2485 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2485: FirstName is Cruz")
	void FirstNameOfRecord2485() {
		assertEquals("Cruz", customers.get(2484).getFirstName());
	}

	@Test
	@DisplayName("Record 2485: LastName is Bankert")
	void LastNameOfRecord2485() {
		assertEquals("Bankert", customers.get(2484).getLastName());
	}

	@Test
	@DisplayName("Record 2485: Company is Finizio, Steven P Esq")
	void CompanyOfRecord2485() {
		assertEquals("Finizio, Steven P Esq", customers.get(2484).getCompany());
	}

	@Test
	@DisplayName("Record 2485: Address is 1423 Lowry Ave N")
	void AddressOfRecord2485() {
		assertEquals("1423 Lowry Ave N", customers.get(2484).getAddress());
	}

	@Test
	@DisplayName("Record 2485: City is Minneapolis")
	void CityOfRecord2485() {
		assertEquals("Minneapolis", customers.get(2484).getCity());
	}

	@Test
	@DisplayName("Record 2485: County is Hennepin")
	void CountyOfRecord2485() {
		assertEquals("Hennepin", customers.get(2484).getCounty());
	}

	@Test
	@DisplayName("Record 2485: State is MN")
	void StateOfRecord2485() {
		assertEquals("MN", customers.get(2484).getState());
	}

	@Test
	@DisplayName("Record 2485: ZIP is 55411")
	void ZIPOfRecord2485() {
		assertEquals("55411", customers.get(2484).getZIP());
	}

	@Test
	@DisplayName("Record 2485: Phone is 612-521-9507")
	void PhoneOfRecord2485() {
		assertEquals("612-521-9507", customers.get(2484).getPhone());
	}

	@Test
	@DisplayName("Record 2485: Fax is 612-521-4215")
	void FaxOfRecord2485() {
		assertEquals("612-521-4215", customers.get(2484).getFax());
	}

	@Test
	@DisplayName("Record 2485: Email is cruz@bankert.com")
	void EmailOfRecord2485() {
		assertEquals("cruz@bankert.com", customers.get(2484).getEmail());
	}

	@Test
	@DisplayName("Record 2485: Web is http://www.cruzbankert.com")
	void WebOfRecord2485() {
		assertEquals("http://www.cruzbankert.com", customers.get(2484).getWeb());
	}
}
