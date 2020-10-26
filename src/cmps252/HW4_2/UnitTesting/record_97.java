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
class Record_97 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 97: FirstName is Curt")
	void FirstNameOfRecord97() {
		assertEquals("Curt", customers.get(96).getFirstName());
	}

	@Test
	@DisplayName("Record 97: LastName is Bleggi")
	void LastNameOfRecord97() {
		assertEquals("Bleggi", customers.get(96).getLastName());
	}

	@Test
	@DisplayName("Record 97: Company is Pml Securities Inc")
	void CompanyOfRecord97() {
		assertEquals("Pml Securities Inc", customers.get(96).getCompany());
	}

	@Test
	@DisplayName("Record 97: Address is 2260 Salschyder Ct")
	void AddressOfRecord97() {
		assertEquals("2260 Salschyder Ct", customers.get(96).getAddress());
	}

	@Test
	@DisplayName("Record 97: City is Green Bay")
	void CityOfRecord97() {
		assertEquals("Green Bay", customers.get(96).getCity());
	}

	@Test
	@DisplayName("Record 97: County is Brown")
	void CountyOfRecord97() {
		assertEquals("Brown", customers.get(96).getCounty());
	}

	@Test
	@DisplayName("Record 97: State is WI")
	void StateOfRecord97() {
		assertEquals("WI", customers.get(96).getState());
	}

	@Test
	@DisplayName("Record 97: ZIP is 54313")
	void ZIPOfRecord97() {
		assertEquals("54313", customers.get(96).getZIP());
	}

	@Test
	@DisplayName("Record 97: Phone is 920-434-7048")
	void PhoneOfRecord97() {
		assertEquals("920-434-7048", customers.get(96).getPhone());
	}

	@Test
	@DisplayName("Record 97: Fax is 920-434-8065")
	void FaxOfRecord97() {
		assertEquals("920-434-8065", customers.get(96).getFax());
	}

	@Test
	@DisplayName("Record 97: Email is curt@bleggi.com")
	void EmailOfRecord97() {
		assertEquals("curt@bleggi.com", customers.get(96).getEmail());
	}

	@Test
	@DisplayName("Record 97: Web is http://www.curtbleggi.com")
	void WebOfRecord97() {
		assertEquals("http://www.curtbleggi.com", customers.get(96).getWeb());
	}
}
