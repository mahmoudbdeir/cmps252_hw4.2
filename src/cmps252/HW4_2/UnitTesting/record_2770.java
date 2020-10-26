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

@Tag("23")
class Record_2770 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2770: FirstName is Glen")
	void FirstNameOfRecord2770() {
		assertEquals("Glen", customers.get(2769).getFirstName());
	}

	@Test
	@DisplayName("Record 2770: LastName is Spalla")
	void LastNameOfRecord2770() {
		assertEquals("Spalla", customers.get(2769).getLastName());
	}

	@Test
	@DisplayName("Record 2770: Company is M G T Of America Inc")
	void CompanyOfRecord2770() {
		assertEquals("M G T Of America Inc", customers.get(2769).getCompany());
	}

	@Test
	@DisplayName("Record 2770: Address is 7200 Biscayne Blvd")
	void AddressOfRecord2770() {
		assertEquals("7200 Biscayne Blvd", customers.get(2769).getAddress());
	}

	@Test
	@DisplayName("Record 2770: City is Miami")
	void CityOfRecord2770() {
		assertEquals("Miami", customers.get(2769).getCity());
	}

	@Test
	@DisplayName("Record 2770: County is Miami-Dade")
	void CountyOfRecord2770() {
		assertEquals("Miami-Dade", customers.get(2769).getCounty());
	}

	@Test
	@DisplayName("Record 2770: State is FL")
	void StateOfRecord2770() {
		assertEquals("FL", customers.get(2769).getState());
	}

	@Test
	@DisplayName("Record 2770: ZIP is 33138")
	void ZIPOfRecord2770() {
		assertEquals("33138", customers.get(2769).getZIP());
	}

	@Test
	@DisplayName("Record 2770: Phone is 305-754-6987")
	void PhoneOfRecord2770() {
		assertEquals("305-754-6987", customers.get(2769).getPhone());
	}

	@Test
	@DisplayName("Record 2770: Fax is 305-754-5697")
	void FaxOfRecord2770() {
		assertEquals("305-754-5697", customers.get(2769).getFax());
	}

	@Test
	@DisplayName("Record 2770: Email is glen@spalla.com")
	void EmailOfRecord2770() {
		assertEquals("glen@spalla.com", customers.get(2769).getEmail());
	}

	@Test
	@DisplayName("Record 2770: Web is http://www.glenspalla.com")
	void WebOfRecord2770() {
		assertEquals("http://www.glenspalla.com", customers.get(2769).getWeb());
	}
}
