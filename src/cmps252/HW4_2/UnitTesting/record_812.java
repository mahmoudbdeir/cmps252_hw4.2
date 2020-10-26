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

@Tag("46")
class Record_812 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 812: FirstName is Taryn")
	void FirstNameOfRecord812() {
		assertEquals("Taryn", customers.get(811).getFirstName());
	}

	@Test
	@DisplayName("Record 812: LastName is Flynn")
	void LastNameOfRecord812() {
		assertEquals("Flynn", customers.get(811).getLastName());
	}

	@Test
	@DisplayName("Record 812: Company is Sherry, Jill L")
	void CompanyOfRecord812() {
		assertEquals("Sherry, Jill L", customers.get(811).getCompany());
	}

	@Test
	@DisplayName("Record 812: Address is 311 Sw 22nd Ave")
	void AddressOfRecord812() {
		assertEquals("311 Sw 22nd Ave", customers.get(811).getAddress());
	}

	@Test
	@DisplayName("Record 812: City is Miami")
	void CityOfRecord812() {
		assertEquals("Miami", customers.get(811).getCity());
	}

	@Test
	@DisplayName("Record 812: County is Miami-Dade")
	void CountyOfRecord812() {
		assertEquals("Miami-Dade", customers.get(811).getCounty());
	}

	@Test
	@DisplayName("Record 812: State is FL")
	void StateOfRecord812() {
		assertEquals("FL", customers.get(811).getState());
	}

	@Test
	@DisplayName("Record 812: ZIP is 33135")
	void ZIPOfRecord812() {
		assertEquals("33135", customers.get(811).getZIP());
	}

	@Test
	@DisplayName("Record 812: Phone is 305-649-4134")
	void PhoneOfRecord812() {
		assertEquals("305-649-4134", customers.get(811).getPhone());
	}

	@Test
	@DisplayName("Record 812: Fax is 305-649-1048")
	void FaxOfRecord812() {
		assertEquals("305-649-1048", customers.get(811).getFax());
	}

	@Test
	@DisplayName("Record 812: Email is taryn@flynn.com")
	void EmailOfRecord812() {
		assertEquals("taryn@flynn.com", customers.get(811).getEmail());
	}

	@Test
	@DisplayName("Record 812: Web is http://www.tarynflynn.com")
	void WebOfRecord812() {
		assertEquals("http://www.tarynflynn.com", customers.get(811).getWeb());
	}
}
