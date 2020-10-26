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

@Tag("9")
class Record_591 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 591: FirstName is Cruz")
	void FirstNameOfRecord591() {
		assertEquals("Cruz", customers.get(590).getFirstName());
	}

	@Test
	@DisplayName("Record 591: LastName is Scafe")
	void LastNameOfRecord591() {
		assertEquals("Scafe", customers.get(590).getLastName());
	}

	@Test
	@DisplayName("Record 591: Company is Ledger, Brian M Esq")
	void CompanyOfRecord591() {
		assertEquals("Ledger, Brian M Esq", customers.get(590).getCompany());
	}

	@Test
	@DisplayName("Record 591: Address is 329 Sip Ave")
	void AddressOfRecord591() {
		assertEquals("329 Sip Ave", customers.get(590).getAddress());
	}

	@Test
	@DisplayName("Record 591: City is Jersey City")
	void CityOfRecord591() {
		assertEquals("Jersey City", customers.get(590).getCity());
	}

	@Test
	@DisplayName("Record 591: County is Hudson")
	void CountyOfRecord591() {
		assertEquals("Hudson", customers.get(590).getCounty());
	}

	@Test
	@DisplayName("Record 591: State is NJ")
	void StateOfRecord591() {
		assertEquals("NJ", customers.get(590).getState());
	}

	@Test
	@DisplayName("Record 591: ZIP is 7306")
	void ZIPOfRecord591() {
		assertEquals("7306", customers.get(590).getZIP());
	}

	@Test
	@DisplayName("Record 591: Phone is 201-435-3249")
	void PhoneOfRecord591() {
		assertEquals("201-435-3249", customers.get(590).getPhone());
	}

	@Test
	@DisplayName("Record 591: Fax is 201-435-1383")
	void FaxOfRecord591() {
		assertEquals("201-435-1383", customers.get(590).getFax());
	}

	@Test
	@DisplayName("Record 591: Email is cruz@scafe.com")
	void EmailOfRecord591() {
		assertEquals("cruz@scafe.com", customers.get(590).getEmail());
	}

	@Test
	@DisplayName("Record 591: Web is http://www.cruzscafe.com")
	void WebOfRecord591() {
		assertEquals("http://www.cruzscafe.com", customers.get(590).getWeb());
	}
}
