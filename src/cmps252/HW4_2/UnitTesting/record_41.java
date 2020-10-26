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
class Record_41 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 41: FirstName is Carlo")
	void FirstNameOfRecord41() {
		assertEquals("Carlo", customers.get(40).getFirstName());
	}

	@Test
	@DisplayName("Record 41: LastName is Reasor")
	void LastNameOfRecord41() {
		assertEquals("Reasor", customers.get(40).getLastName());
	}

	@Test
	@DisplayName("Record 41: Company is Nelson, David L Esq")
	void CompanyOfRecord41() {
		assertEquals("Nelson, David L Esq", customers.get(40).getCompany());
	}

	@Test
	@DisplayName("Record 41: Address is 1900 Wyatt Dr")
	void AddressOfRecord41() {
		assertEquals("1900 Wyatt Dr", customers.get(40).getAddress());
	}

	@Test
	@DisplayName("Record 41: City is Santa Clara")
	void CityOfRecord41() {
		assertEquals("Santa Clara", customers.get(40).getCity());
	}

	@Test
	@DisplayName("Record 41: County is Santa Clara")
	void CountyOfRecord41() {
		assertEquals("Santa Clara", customers.get(40).getCounty());
	}

	@Test
	@DisplayName("Record 41: State is CA")
	void StateOfRecord41() {
		assertEquals("CA", customers.get(40).getState());
	}

	@Test
	@DisplayName("Record 41: ZIP is 95054")
	void ZIPOfRecord41() {
		assertEquals("95054", customers.get(40).getZIP());
	}

	@Test
	@DisplayName("Record 41: Phone is 408-748-9685")
	void PhoneOfRecord41() {
		assertEquals("408-748-9685", customers.get(40).getPhone());
	}

	@Test
	@DisplayName("Record 41: Fax is 408-748-2159")
	void FaxOfRecord41() {
		assertEquals("408-748-2159", customers.get(40).getFax());
	}

	@Test
	@DisplayName("Record 41: Email is carlo@reasor.com")
	void EmailOfRecord41() {
		assertEquals("carlo@reasor.com", customers.get(40).getEmail());
	}

	@Test
	@DisplayName("Record 41: Web is http://www.carloreasor.com")
	void WebOfRecord41() {
		assertEquals("http://www.carloreasor.com", customers.get(40).getWeb());
	}
}
