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

@Tag("37")
class Record_541 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 541: FirstName is Jodie")
	void FirstNameOfRecord541() {
		assertEquals("Jodie", customers.get(540).getFirstName());
	}

	@Test
	@DisplayName("Record 541: LastName is Wald")
	void LastNameOfRecord541() {
		assertEquals("Wald", customers.get(540).getLastName());
	}

	@Test
	@DisplayName("Record 541: Company is L R Brown Mfg Co Inc")
	void CompanyOfRecord541() {
		assertEquals("L R Brown Mfg Co Inc", customers.get(540).getCompany());
	}

	@Test
	@DisplayName("Record 541: Address is 76 East St")
	void AddressOfRecord541() {
		assertEquals("76 East St", customers.get(540).getAddress());
	}

	@Test
	@DisplayName("Record 541: City is Pawtucket")
	void CityOfRecord541() {
		assertEquals("Pawtucket", customers.get(540).getCity());
	}

	@Test
	@DisplayName("Record 541: County is Providence")
	void CountyOfRecord541() {
		assertEquals("Providence", customers.get(540).getCounty());
	}

	@Test
	@DisplayName("Record 541: State is RI")
	void StateOfRecord541() {
		assertEquals("RI", customers.get(540).getState());
	}

	@Test
	@DisplayName("Record 541: ZIP is 2860")
	void ZIPOfRecord541() {
		assertEquals("2860", customers.get(540).getZIP());
	}

	@Test
	@DisplayName("Record 541: Phone is 401-728-3841")
	void PhoneOfRecord541() {
		assertEquals("401-728-3841", customers.get(540).getPhone());
	}

	@Test
	@DisplayName("Record 541: Fax is 401-728-9999")
	void FaxOfRecord541() {
		assertEquals("401-728-9999", customers.get(540).getFax());
	}

	@Test
	@DisplayName("Record 541: Email is jodie@wald.com")
	void EmailOfRecord541() {
		assertEquals("jodie@wald.com", customers.get(540).getEmail());
	}

	@Test
	@DisplayName("Record 541: Web is http://www.jodiewald.com")
	void WebOfRecord541() {
		assertEquals("http://www.jodiewald.com", customers.get(540).getWeb());
	}
}
