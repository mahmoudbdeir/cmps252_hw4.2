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

@Tag("40")
class Record_3711 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3711: FirstName is Dollie")
	void FirstNameOfRecord3711() {
		assertEquals("Dollie", customers.get(3710).getFirstName());
	}

	@Test
	@DisplayName("Record 3711: LastName is Frew")
	void LastNameOfRecord3711() {
		assertEquals("Frew", customers.get(3710).getLastName());
	}

	@Test
	@DisplayName("Record 3711: Company is Wjpz Radio Z89")
	void CompanyOfRecord3711() {
		assertEquals("Wjpz Radio Z89", customers.get(3710).getCompany());
	}

	@Test
	@DisplayName("Record 3711: Address is 913 North Fwy")
	void AddressOfRecord3711() {
		assertEquals("913 North Fwy", customers.get(3710).getAddress());
	}

	@Test
	@DisplayName("Record 3711: City is Fort Worth")
	void CityOfRecord3711() {
		assertEquals("Fort Worth", customers.get(3710).getCity());
	}

	@Test
	@DisplayName("Record 3711: County is Tarrant")
	void CountyOfRecord3711() {
		assertEquals("Tarrant", customers.get(3710).getCounty());
	}

	@Test
	@DisplayName("Record 3711: State is TX")
	void StateOfRecord3711() {
		assertEquals("TX", customers.get(3710).getState());
	}

	@Test
	@DisplayName("Record 3711: ZIP is 76102")
	void ZIPOfRecord3711() {
		assertEquals("76102", customers.get(3710).getZIP());
	}

	@Test
	@DisplayName("Record 3711: Phone is 817-877-2035")
	void PhoneOfRecord3711() {
		assertEquals("817-877-2035", customers.get(3710).getPhone());
	}

	@Test
	@DisplayName("Record 3711: Fax is 817-877-4903")
	void FaxOfRecord3711() {
		assertEquals("817-877-4903", customers.get(3710).getFax());
	}

	@Test
	@DisplayName("Record 3711: Email is dollie@frew.com")
	void EmailOfRecord3711() {
		assertEquals("dollie@frew.com", customers.get(3710).getEmail());
	}

	@Test
	@DisplayName("Record 3711: Web is http://www.dolliefrew.com")
	void WebOfRecord3711() {
		assertEquals("http://www.dolliefrew.com", customers.get(3710).getWeb());
	}
}
