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

@Tag("25")
class Record_210 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 210: FirstName is Damian")
	void FirstNameOfRecord210() {
		assertEquals("Damian", customers.get(209).getFirstName());
	}

	@Test
	@DisplayName("Record 210: LastName is Adell")
	void LastNameOfRecord210() {
		assertEquals("Adell", customers.get(209).getLastName());
	}

	@Test
	@DisplayName("Record 210: Company is P E Ralph Dumack & Assocs")
	void CompanyOfRecord210() {
		assertEquals("P E Ralph Dumack & Assocs", customers.get(209).getCompany());
	}

	@Test
	@DisplayName("Record 210: Address is 5784 Hellyer Ave")
	void AddressOfRecord210() {
		assertEquals("5784 Hellyer Ave", customers.get(209).getAddress());
	}

	@Test
	@DisplayName("Record 210: City is San Jose")
	void CityOfRecord210() {
		assertEquals("San Jose", customers.get(209).getCity());
	}

	@Test
	@DisplayName("Record 210: County is Santa Clara")
	void CountyOfRecord210() {
		assertEquals("Santa Clara", customers.get(209).getCounty());
	}

	@Test
	@DisplayName("Record 210: State is CA")
	void StateOfRecord210() {
		assertEquals("CA", customers.get(209).getState());
	}

	@Test
	@DisplayName("Record 210: ZIP is 95138")
	void ZIPOfRecord210() {
		assertEquals("95138", customers.get(209).getZIP());
	}

	@Test
	@DisplayName("Record 210: Phone is 408-578-7427")
	void PhoneOfRecord210() {
		assertEquals("408-578-7427", customers.get(209).getPhone());
	}

	@Test
	@DisplayName("Record 210: Fax is 408-578-7495")
	void FaxOfRecord210() {
		assertEquals("408-578-7495", customers.get(209).getFax());
	}

	@Test
	@DisplayName("Record 210: Email is damian@adell.com")
	void EmailOfRecord210() {
		assertEquals("damian@adell.com", customers.get(209).getEmail());
	}

	@Test
	@DisplayName("Record 210: Web is http://www.damianadell.com")
	void WebOfRecord210() {
		assertEquals("http://www.damianadell.com", customers.get(209).getWeb());
	}
}
