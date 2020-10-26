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

@Tag("19")
class Record_1214 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1214: FirstName is Antione")
	void FirstNameOfRecord1214() {
		assertEquals("Antione", customers.get(1213).getFirstName());
	}

	@Test
	@DisplayName("Record 1214: LastName is Farina")
	void LastNameOfRecord1214() {
		assertEquals("Farina", customers.get(1213).getLastName());
	}

	@Test
	@DisplayName("Record 1214: Company is Cooper Graci & Co Cpas")
	void CompanyOfRecord1214() {
		assertEquals("Cooper Graci & Co Cpas", customers.get(1213).getCompany());
	}

	@Test
	@DisplayName("Record 1214: Address is 5627 Lafayette Pl")
	void AddressOfRecord1214() {
		assertEquals("5627 Lafayette Pl", customers.get(1213).getAddress());
	}

	@Test
	@DisplayName("Record 1214: City is Hyattsville")
	void CityOfRecord1214() {
		assertEquals("Hyattsville", customers.get(1213).getCity());
	}

	@Test
	@DisplayName("Record 1214: County is Prince Georges")
	void CountyOfRecord1214() {
		assertEquals("Prince Georges", customers.get(1213).getCounty());
	}

	@Test
	@DisplayName("Record 1214: State is MD")
	void StateOfRecord1214() {
		assertEquals("MD", customers.get(1213).getState());
	}

	@Test
	@DisplayName("Record 1214: ZIP is 20781")
	void ZIPOfRecord1214() {
		assertEquals("20781", customers.get(1213).getZIP());
	}

	@Test
	@DisplayName("Record 1214: Phone is 301-277-2400")
	void PhoneOfRecord1214() {
		assertEquals("301-277-2400", customers.get(1213).getPhone());
	}

	@Test
	@DisplayName("Record 1214: Fax is 301-277-2558")
	void FaxOfRecord1214() {
		assertEquals("301-277-2558", customers.get(1213).getFax());
	}

	@Test
	@DisplayName("Record 1214: Email is antione@farina.com")
	void EmailOfRecord1214() {
		assertEquals("antione@farina.com", customers.get(1213).getEmail());
	}

	@Test
	@DisplayName("Record 1214: Web is http://www.antionefarina.com")
	void WebOfRecord1214() {
		assertEquals("http://www.antionefarina.com", customers.get(1213).getWeb());
	}
}
